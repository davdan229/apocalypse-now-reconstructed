#!/usr/bin/env python3
"""Read-only consistency audit for the restored Apocalypse Now project."""

from __future__ import annotations

import json
import re
import sys
from collections import Counter, defaultdict
from pathlib import Path
from typing import Any, Iterable


ROOT = Path(__file__).resolve().parents[1]
JAVA = ROOT / "src/main/java/net/mcreator/apocalypsenow"
RES = ROOT / "src/main/resources"
ASSETS = RES / "assets/apocalypsenow"
DATA = RES / "data/apocalypsenow"
INIT = JAVA / "init"

errors: list[str] = []
warnings: list[str] = []
stats: Counter[str] = Counter()


def rel(path: Path) -> str:
    return path.relative_to(ROOT).as_posix()


def load_json(path: Path) -> Any:
    duplicates: list[str] = []

    def pairs_hook(pairs: list[tuple[str, Any]]) -> dict[str, Any]:
        result: dict[str, Any] = {}
        for key, value in pairs:
            if key in result:
                duplicates.append(key)
            result[key] = value
        return result

    try:
        value = json.loads(path.read_text(encoding="utf-8-sig"), object_pairs_hook=pairs_hook)
    except (OSError, UnicodeError, json.JSONDecodeError) as exc:
        errors.append(f"invalid JSON {rel(path)}: {exc}")
        return None
    if duplicates:
        warnings.append(f"duplicate JSON keys {rel(path)}: {', '.join(sorted(set(duplicates)))}")
    return value


def walk_values(value: Any, key: str | None = None) -> Iterable[tuple[str | None, Any]]:
    if isinstance(value, dict):
        for child_key, child in value.items():
            yield child_key, child
            yield from walk_values(child, child_key)
    elif isinstance(value, list):
        for child in value:
            yield key, child
            yield from walk_values(child, key)


def registry_ids(filename: str) -> tuple[set[str], dict[str, str]]:
    path = INIT / filename
    if not path.exists():
        return set(), {}
    text = path.read_text(encoding="utf-8")
    ids = set(re.findall(r'REGISTRY\.register\s*\(\s*"([a-z0-9_./-]+)"', text, re.S))
    fields: dict[str, str] = {}
    for match in re.finditer(
        r'RegistryObject<[^;=]+>\s+([A-Z0-9_]+)\s*=\s*(?:register|REGISTRY\.register)\s*\(\s*"([a-z0-9_./-]+)"',
        text,
        re.S,
    ):
        fields[match.group(1)] = match.group(2)
        ids.add(match.group(2))
    return ids, fields


items, item_fields = registry_ids("ApocalypsenowModItems.java")
blocks, block_fields = registry_ids("ApocalypsenowModBlocks.java")
entities, entity_fields = registry_ids("ApocalypsenowModEntities.java")
effects, effect_fields = registry_ids("ApocalypsenowModMobEffects.java")
sounds, sound_fields = registry_ids("ApocalypsenowModSounds.java")
menus, menu_fields = registry_ids("ApocalypsenowModMenus.java")
block_entities, block_entity_fields = registry_ids("ApocalypsenowModBlockEntities.java")
serializers, serializer_fields = registry_ids("ApocalypsenowModRecipeSerializers.java")

stats.update(
    items=len(items),
    blocks=len(blocks),
    entities=len(entities),
    effects=len(effects),
    sounds=len(sounds),
    menus=len(menus),
    block_entities=len(block_entities),
)


# Every JSON must parse before any semantic checks are trusted.
json_files = sorted(RES.rglob("*.json"))
for json_file in json_files:
    load_json(json_file)
stats["json_files"] = len(json_files)


# Optional combat and food-mod integrations are data-driven, so validate the
# resource contract even when those mods are not installed in the audit runtime.
better_combat_presets = {
    "anchor",
    "axe",
    "battlestaff",
    "bow_two_handed_heavy",
    "bow_two_handed_light",
    "claw",
    "claymore",
    "coral_blade",
    "crossbow_two_handed_heavy",
    "crossbow_two_handed_light",
    "cutlass",
    "dagger",
    "double_axe",
    "fist",
    "glaive",
    "halberd",
    "hammer",
    "heavy_axe",
    "katana",
    "lance",
    "mace",
    "pickaxe",
    "rapier",
    "scythe",
    "sickle",
    "soul_knife",
    "spear",
    "staff",
    "sword",
    "trident",
    "twin_blade",
    "wand",
}
weapon_attribute_files = sorted((DATA / "weapon_attributes").glob("*.json"))
weapon_attribute_items: set[str] = set()
for path in weapon_attribute_files:
    item_id = path.stem
    weapon_attribute_items.add(item_id)
    if item_id not in items:
        errors.append(f"Better Combat attributes target unknown item apocalypsenow:{item_id}: {rel(path)}")
    data = load_json(path)
    if not isinstance(data, dict):
        continue
    parent = data.get("parent")
    attributes = data.get("attributes")
    if parent is None:
        if not isinstance(attributes, dict):
            errors.append(f"Better Combat attributes have neither parent nor attributes: {rel(path)}")
        continue
    if not isinstance(parent, str) or not re.fullmatch(r"[a-z0-9_.-]+:[a-z0-9_./-]+", parent):
        errors.append(f"invalid Better Combat parent {parent!r} in {rel(path)}")
        continue
    namespace, preset = parent.split(":", 1)
    if namespace == "bettercombat" and preset not in better_combat_presets:
        errors.append(f"unknown Better Combat preset {parent} in {rel(path)}")

melee_tag_path = DATA / "tags/items/tool/melee.json"
melee_tag = load_json(melee_tag_path) or {}
melee_items = {
    value.split(":", 1)[1]
    for value in melee_tag.get("values", [])
    if isinstance(value, str) and value.startswith("apocalypsenow:")
}
missing_melee_attributes = sorted(melee_items - weapon_attribute_items)
if missing_melee_attributes:
    errors.append(
        "melee-tagged items without Better Combat attributes "
        f"({len(missing_melee_attributes)}): {', '.join(missing_melee_attributes)}"
    )
stats["better_combat_weapons"] = len(weapon_attribute_files)


def local_tag_values(path: Path, label: str) -> set[str]:
    data = load_json(path)
    if not isinstance(data, dict) or not isinstance(data.get("values"), list):
        errors.append(f"missing or invalid {label} tag: {rel(path)}")
        return set()
    values: set[str] = set()
    for value in data["values"]:
        if not isinstance(value, str) or not value.startswith("apocalypsenow:"):
            errors.append(f"invalid {label} tag value {value!r} in {rel(path)}")
            continue
        item_id = value.split(":", 1)[1]
        values.add(item_id)
        if item_id not in items:
            errors.append(f"unknown item {value} in {label} tag {rel(path)}")
    return values


forge_knives = local_tag_values(
    RES / "data/forge/tags/items/tools/knives.json", "Forge knives"
)
farmers_delight_knives = local_tag_values(
    RES / "data/farmersdelight/tags/items/tools/knives.json", "Farmer's Delight knives"
)
if forge_knives != farmers_delight_knives:
    only_forge = sorted(forge_knives - farmers_delight_knives)
    only_farmers = sorted(farmers_delight_knives - forge_knives)
    errors.append(
        "knife compatibility tags differ: "
        f"Forge-only={only_forge}, Farmer's Delight-only={only_farmers}"
    )
missing_knife_attributes = sorted(forge_knives - weapon_attribute_items)
if missing_knife_attributes:
    errors.append(
        "knife-tagged items without Better Combat attributes "
        f"({len(missing_knife_attributes)}): {', '.join(missing_knife_attributes)}"
    )
stats["farmers_delight_knives"] = len(farmers_delight_knives)


def model_path(location: str) -> Path | None:
    if location.startswith("#") or location.startswith("builtin/"):
        return None
    namespace, sep, path = location.partition(":")
    if not sep:
        namespace, path = "minecraft", namespace
    if namespace != "apocalypsenow":
        return None
    return ASSETS / "models" / f"{path}.json"


def texture_path(location: str) -> Path | None:
    if location.startswith("#"):
        return None
    namespace, sep, path = location.partition(":")
    if not sep:
        namespace, path = "minecraft", namespace
    if namespace != "apocalypsenow":
        return None
    return ASSETS / "textures" / f"{path}.png"


# Blockstates and model inheritance/textures.
for path in sorted((ASSETS / "blockstates").glob("*.json")):
    data = load_json(path)
    if data is None:
        continue
    for key, value in walk_values(data):
        if key == "model" and isinstance(value, str):
            target = model_path(value)
            if target is not None and not target.exists():
                errors.append(f"missing blockstate model {value} referenced by {rel(path)}")

for path in sorted((ASSETS / "models").rglob("*.json")):
    data = load_json(path)
    if not isinstance(data, dict):
        continue
    parent = data.get("parent")
    if isinstance(parent, str):
        target = model_path(parent)
        if target is not None and not target.exists():
            errors.append(f"missing model parent {parent} referenced by {rel(path)}")
    textures = data.get("textures", {})
    if isinstance(textures, dict):
        for texture in textures.values():
            if isinstance(texture, str):
                target = texture_path(texture)
                if target is not None and not target.exists():
                    errors.append(f"missing texture {texture} referenced by {rel(path)}")


# Item/block models and translations.
item_models = {p.stem for p in (ASSETS / "models/item").glob("*.json")}
missing_item_models = sorted((items - blocks) - item_models)
if missing_item_models:
    errors.append(f"registered non-block items without item model ({len(missing_item_models)}): {', '.join(missing_item_models[:30])}")

en = load_json(ASSETS / "lang/en_us.json") or {}
ru = load_json(ASSETS / "lang/ru_ru.json") or {}
if set(en) != set(ru):
    missing_ru = sorted(set(en) - set(ru))
    extra_ru = sorted(set(ru) - set(en))
    errors.append(f"language key mismatch: missing RU={missing_ru[:20]}, extra RU={extra_ru[:20]}")

for block_id in sorted(blocks - {"tall_block_proxy"}):
    key = f"block.apocalypsenow.{block_id}"
    if key not in en:
        errors.append(f"missing English block translation: {key}")
for item_id in sorted(items - blocks):
    key = f"item.apocalypsenow.{item_id}"
    if key not in en:
        errors.append(f"missing English item translation: {key}")
for entity_id in sorted(entities):
    key = f"entity.apocalypsenow.{entity_id}"
    if key not in en:
        errors.append(f"missing English entity translation: {key}")
for effect_id in sorted(effects):
    key = f"effect.apocalypsenow.{effect_id}"
    if key not in en:
        errors.append(f"missing English effect translation: {key}")


# Sound registry, sound definitions and files.
sounds_json = load_json(ASSETS / "sounds.json") or {}
for sound_id in sorted(sounds):
    if sound_id not in sounds_json:
        errors.append(f"registered sound missing from sounds.json: {sound_id}")
for sound_id, definition in sounds_json.items():
    entries = definition.get("sounds", []) if isinstance(definition, dict) else definition
    if not isinstance(entries, list):
        continue
    for entry in entries:
        location = entry.get("name") if isinstance(entry, dict) else entry
        if not isinstance(location, str) or location.startswith("minecraft:"):
            continue
        namespace, sep, name = location.partition(":")
        if not sep:
            namespace, name = "apocalypsenow", namespace
        if namespace == "apocalypsenow" and not (ASSETS / "sounds" / f"{name}.ogg").exists():
            errors.append(f"missing sound file {location}.ogg used by {sound_id}")


known_local_ids = items | blocks | entities | effects | sounds


def validate_local_ref(location: str, path: Path, context: str) -> None:
    if not location.startswith("apocalypsenow:"):
        return
    local_id = location.split(":", 1)[1]
    if local_id not in known_local_ids:
        errors.append(f"unknown local {context} {location} in {rel(path)}")


# Recipes: types, local ingredients, outputs and impossible shaped patterns.
recipe_types = Counter()
for path in sorted((DATA / "recipes").glob("*.json")):
    data = load_json(path)
    if not isinstance(data, dict):
        continue
    recipe_type = data.get("type")
    if not isinstance(recipe_type, str):
        errors.append(f"recipe without type: {rel(path)}")
        continue
    recipe_types[recipe_type] += 1
    if recipe_type.startswith("apocalypsenow:") and recipe_type.split(":", 1)[1] not in serializers:
        errors.append(f"unknown custom recipe serializer {recipe_type} in {rel(path)}")
    pattern = data.get("pattern")
    if isinstance(pattern, list):
        widths = {len(row) for row in pattern if isinstance(row, str)}
        if len(widths) > 1 or any(width > 3 for width in widths) or len(pattern) > 3:
            errors.append(f"invalid shaped recipe dimensions in {rel(path)}: {pattern}")
    for key, value in walk_values(data):
        if key == "item" and isinstance(value, str):
            validate_local_ref(value, path, "item")
        elif key == "tag" and isinstance(value, str) and value.startswith("apocalypsenow:"):
            tag_name = value.split(":", 1)[1]
            candidates = list((DATA / "tags").rglob(f"{tag_name}.json"))
            if not candidates:
                errors.append(f"unknown local ingredient tag {value} in {rel(path)}")

stats["recipes"] = sum(recipe_types.values())


# Loot tables and tags: validate local item/entity/block references.
for folder in (DATA / "loot_tables", DATA / "tags", DATA / "advancements"):
    if not folder.exists():
        continue
    for path in sorted(folder.rglob("*.json")):
        data = load_json(path)
        if data is None:
            continue
        for key, value in walk_values(data):
            if key in {"name", "item"} and isinstance(value, str) and value.startswith("apocalypsenow:"):
                validate_local_ref(value, path, key)
            if key == "values" and isinstance(value, list):
                for entry in value:
                    location = entry.get("id") if isinstance(entry, dict) else entry
                    if isinstance(location, str) and not location.startswith("#"):
                        validate_local_ref(location, path, "tag value")


# Client registry coverage for entities and menus.
renderer_text = (INIT / "ApocalypsenowModEntityRenderers.java").read_text(encoding="utf-8")
rendered_fields = set(re.findall(r'ApocalypsenowModEntities\.([A-Z0-9_]+)\.get\(\)', renderer_text))
missing_renderers = sorted(set(entity_fields) - rendered_fields)
if missing_renderers:
    errors.append(f"entities without renderer registration ({len(missing_renderers)}): {', '.join(missing_renderers)}")

screen_text = (INIT / "ApocalypsenowModScreens.java").read_text(encoding="utf-8")
screen_fields = set(re.findall(r'ApocalypsenowModMenus\.([A-Z0-9_]+)\.get\(\)', screen_text))
missing_screens = sorted(set(menu_fields) - screen_fields)
if missing_screens:
    errors.append(f"menus without client screen ({len(missing_screens)}): {', '.join(missing_screens)}")


# Container layout and shift-click ranges. Generated menus encode their custom
# slots first, followed by 27 player-inventory slots and 9 hotbar slots.
menu_sources = sorted((JAVA / "world/inventory").glob("*Menu.java"))
stats["menu_sources"] = len(menu_sources)
for path in menu_sources:
    text = path.read_text(encoding="utf-8")
    custom_indices = [int(value) for value in re.findall(r"customSlots\.put\((\d+),", text)]
    if not custom_indices:
        warnings.append(f"menu has no custom slots: {rel(path)}")
        continue
    custom_count = max(custom_indices) + 1
    if sorted(custom_indices) != list(range(custom_count)):
        errors.append(f"non-contiguous custom slot indexes in {rel(path)}")
    internal = re.search(r"new ItemStackHandler\((\d+)\)", text)
    if internal and int(internal.group(1)) != custom_count:
        errors.append(
            f"fallback inventory size {internal.group(1)} does not match {custom_count} slots in {rel(path)}"
        )
    main_end = custom_count + 27
    expected_quick_move = (
        rf"if \(index < {custom_count}\)",
        rf"moveItemStackTo\(itemstack1, {custom_count}, this\.slots\.size\(\), true\)",
        rf"moveItemStackTo\(itemstack1, 0, {custom_count}, false\)",
        rf"if \(index < {main_end}\)",
        rf"moveItemStackTo\(itemstack1, {main_end}, this\.slots\.size\(\), true\)",
        rf"moveItemStackTo\(itemstack1, {custom_count}, {main_end}, false\)",
    )
    for pattern in expected_quick_move:
        if not re.search(pattern, text):
            errors.append(f"incorrect or incomplete shift-click ranges in {rel(path)}: missing /{pattern}/")
            break


# Stale loader-specific resources are ignored by Forge and should never be mistaken for active generation.
neo_modifiers = list((DATA / "neoforge/biome_modifier").glob("*.json"))
if neo_modifiers:
    missing_feature_refs: list[str] = []
    for path in neo_modifiers:
        data = load_json(path)
        feature = data.get("features") if isinstance(data, dict) else None
        if isinstance(feature, str) and feature.startswith("apocalypsenow:"):
            feature_id = feature.split(":", 1)[1]
            placed = DATA / "worldgen/placed_feature" / f"{feature_id}.json"
            if not placed.exists():
                missing_feature_refs.append(feature_id)
    warnings.append(
        f"Forge ignores {len(neo_modifiers)} NeoForge biome modifiers; "
        f"{len(missing_feature_refs)} of them reference absent placed features"
    )


# Java sanity checks with a deliberately narrow set of high-signal patterns.
java_files = sorted(JAVA.rglob("*.java"))
stats["java_files"] = len(java_files)
for path in java_files:
    text = path.read_text(encoding="utf-8")
    if re.search(r'Component\.literal\s*\(\s*"[^"\n]+"', text):
        errors.append(f"hardcoded visible Component.literal in {rel(path)}")
    if "printStackTrace(" in text or "System.out.print" in text:
        warnings.append(f"debug console output in {rel(path)}")
    if re.search(r'new MobEffectInstance\([^,]+,\s*\d+\s*,\s*(?:[2-9]\d|\d{3,})', text):
        warnings.append(f"suspiciously high potion amplifier in {rel(path)}")
    if re.search(r'\(ServerLevel\)\s*world', text) and "instanceof ServerLevel" not in text:
        warnings.append(f"unguarded ServerLevel cast in {rel(path)}")


print("Apocalypse Now audit")
for key in sorted(stats):
    print(f"  {key}: {stats[key]}")
print(f"  errors: {len(errors)}")
print(f"  warnings: {len(warnings)}")
if errors:
    print("\nERRORS")
    for message in errors:
        print(f"- {message}")
if warnings:
    print("\nWARNINGS")
    for message in warnings:
        print(f"- {message}")
sys.exit(1 if errors else 0)

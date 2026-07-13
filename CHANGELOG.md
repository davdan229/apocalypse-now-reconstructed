# Changelog

All notable changes to the reconstructed edition are documented in this file.

## 3.0.5-r1 — 2026-07-13

### Source and build restoration

- Reconstructed 1695 Java source files from the official 3.0.5 Forge JAR using official Mojang mappings.
- Restored a reproducible ForgeGradle project for Minecraft 1.20.1, Forge 47.4.10 and Java 17.
- Restored Curios 5.12.1 development and runtime integration.
- Corrected invalid model parents, particle textures, tags, loot references and recipes.
- Added an automated static audit and GitHub Actions build.

### Blocks and interaction

- Added unified occupied-space handling for every model that extends outside its registry block cell.
- High and wide objects now have consistent outline, collision, interaction, breaking speed, required tool, drops, sounds and particles across their full model.
- Placement checks all occupied cells, and orphaned helper cells remove themselves safely.
- Corrected interaction areas for corpses, traps, shelves, vending machines, lockers, barriers and other protruding models.
- Corrected orientation and placement for trap states and directional blocks.
- Removed no-op repeating ticks from petrol barrels and the tire pile.

### Items and gameplay

- Curios accessories can be equipped or swapped with right click.
- Corrected can opener consumption and removed duplication paths.
- Corrected water barrels, canteens, bottles and rain collectors for both hands and server-authoritative fluid handling.
- Corrected medical items, blood bags, antibiotics, painkillers, syringes, splints and consumables to use the actual held stack exactly once.
- Corrected chainsaw damage attribution, ray direction, block breaking, durability, sounds, particles and cooldowns.
- Corrected pepper spray, bomb-defusing kit, improvised grenade, thrown weapons, radios and airdrops.
- Corrected explosive barrel fuses to produce one validated explosion.
- Reimplemented the phosphor item with standard flint-and-steel behavior.
- Corrected fertilizer use and cooked-noodle eating behavior.

### Entities and effects

- Corrected faction target selection and friendly retaliation for infected, survivors and raiders.
- Corrected melee reach for 85 combat entity variants using the vanilla calculation.
- Corrected natural spawn checks for dimension, difficulty, time and local brightness.
- Added standard aggressive zombie-arm animation to walkers, runners and hordes while preserving crawler poses.
- Corrected bite, infection and zombification timing without accumulating delayed server tasks.
- Corrected the military medic regeneration aura.
- Removed useless per-tick damage calls and reduced effect-message spam.

### Rendering, interface and localization

- Player skin overlay layers are hidden under matching equipped armor pieces.
- Creative inventory content is grouped by use, family, material, armor slot and entity type with natural numeric ordering.
- Added and validated a complete Russian translation covering all 1569 English keys.
- Added missing translated names for projectile entities.

### Verification

- Clean Gradle build completed successfully.
- Forge dedicated GameTest server completed startup and world generation.
- Forge client loaded a copy of an existing world and completed player login.
- Static audit completed with zero errors and zero warnings across registries, resources, recipes, menus and localization.

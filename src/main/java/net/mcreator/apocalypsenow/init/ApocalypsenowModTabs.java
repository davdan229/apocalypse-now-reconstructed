package net.mcreator.apocalypsenow.init;

import java.util.Comparator;
import java.util.Locale;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ProjectileWeaponItem;
import net.minecraft.world.item.ShieldItem;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.TieredItem;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

@EventBusSubscriber(bus = Bus.MOD)
public class ApocalypsenowModTabs {
   public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, "apocalypsenow");

   public static final RegistryObject<CreativeModeTab> APOCALYPSE_NOW = tab(
      "apocalypse_now", "item_group.apocalypsenow.weapons_tools", ApocalypsenowModItems.WOODEN_FIRE_AXE, Category.WEAPONS
   );
   public static final RegistryObject<CreativeModeTab> ARMOR_CLOTHING = tab(
      "armor_clothing", "item_group.apocalypsenow.armor_clothing", ApocalypsenowModItems.SPEC_OPS_HELMET, Category.ARMOR
   );
   public static final RegistryObject<CreativeModeTab> FOOD_MEDICINE = tab(
      "food_medicine", "item_group.apocalypsenow.food_medicine", ApocalypsenowModItems.BANDAGE, Category.FOOD_MEDICINE
   );
   public static final RegistryObject<CreativeModeTab> BLOCKS_FURNITURE = tab(
      "blocks_furniture", "item_group.apocalypsenow.blocks_furniture", ApocalypsenowModItems.MARKETFRIDGE, Category.BLOCKS
   );
   public static final RegistryObject<CreativeModeTab> MATERIALS_MISC = tab(
      "materials_misc", "item_group.apocalypsenow.materials_misc", ApocalypsenowModItems.SCRAPMETAL, Category.MATERIALS
   );
   public static final RegistryObject<CreativeModeTab> WALKERS_EGGS = tab(
      "walkers_eggs", "item_group.apocalypsenow.walkers_eggs", ApocalypsenowModItems.WALKER_1_SPAWN_EGG, Category.SPAWN_EGGS
   );

   private static RegistryObject<CreativeModeTab> tab(
      String id, String translationKey, RegistryObject<? extends Item> icon, Category category
   ) {
      return REGISTRY.register(
         id,
         () -> CreativeModeTab.builder()
            .title(Component.translatable(translationKey))
            .icon(() -> new ItemStack(icon.get()))
            .displayItems((parameters, output) -> addCategoryItems(output, category))
            .build()
      );
   }

   private static void addCategoryItems(CreativeModeTab.Output output, Category category) {
      ForgeRegistries.ITEMS.getValues().stream()
         .filter(item -> "apocalypsenow".equals(ForgeRegistries.ITEMS.getKey(item).getNamespace()))
         .filter(item -> categoryOf(item) == category)
         .sorted(categoryComparator(category))
         .forEach(output::accept);
   }

   private static Comparator<Item> categoryComparator(Category category) {
      return Comparator.comparingInt((Item item) -> subgroup(category, item, id(item)))
         .thenComparing(item -> family(category, id(item)), ApocalypsenowModTabs::naturalCompare)
         .thenComparingInt(item -> variant(category, item, id(item)))
         .thenComparing(ApocalypsenowModTabs::id, ApocalypsenowModTabs::naturalCompare);
   }

   private static Category categoryOf(Item item) {
      if (item instanceof SpawnEggItem) {
         return Category.SPAWN_EGGS;
      }

      if (item instanceof BlockItem) {
         return Category.BLOCKS;
      }

      if (item instanceof ArmorItem) {
         return Category.ARMOR;
      }

      if (item instanceof ICurioItem) {
         return Category.ARMOR;
      }

      String id = ForgeRegistries.ITEMS.getKey(item).getPath().toLowerCase(Locale.ROOT);
      if (isWeaponOrTool(item, id)) {
         return Category.WEAPONS;
      }

      if (item.isEdible() || containsAny(id, MEDICAL_KEYWORDS)) {
         return Category.FOOD_MEDICINE;
      }

      return Category.MATERIALS;
   }

   private static String id(Item item) {
      return ForgeRegistries.ITEMS.getKey(item).getPath().toLowerCase(Locale.ROOT);
   }

   private static int subgroup(Category category, Item item, String id) {
      return switch (category) {
         case WEAPONS -> weaponGroup(item, id);
         case ARMOR -> armorGroup(item, id);
         case FOOD_MEDICINE -> foodMedicineGroup(id);
         case BLOCKS -> blockGroup(id);
         case MATERIALS -> materialGroup(id);
         case SPAWN_EGGS -> spawnEggGroup(id);
      };
   }

   private static int weaponGroup(Item item, String id) {
      if (containsAny(id, new String[]{"fire_axe", "hatchet", "battleaxe", "throwingaxe"})) return 0;
      if (containsAny(id, new String[]{"knife", "machete", "sword", "katana", "cleaver"})) return 1;
      if (containsAny(id, new String[]{"bat", "club", "hammer", "pipe", "crowbar", "halligan", "wrench", "shovel", "pickaxe", "axe"})) return 2;
      if (containsAny(id, new String[]{"spear", "pitchfork", "trident"})) return 3;
      if (item instanceof ShieldItem || id.contains("shield")) return 4;
      if (item instanceof ProjectileWeaponItem || containsAny(id, new String[]{"bow", "crossbow", "nail_gun", "taser", "pepper_spray"})) return 5;
      if (containsAny(id, new String[]{"grenade", "bomb", "molotov", "dynamite", "landmine", "tripwire"})) return 6;
      if (item instanceof TieredItem || containsAny(id, new String[]{"drill", "can_opener", "defusing", "repair_kit", "fire_extinguisher", "climbingrope"})) return 7;
      return 8;
   }

   private static int armorGroup(Item item, String id) {
      if (item instanceof ArmorItem) return 0;
      if (containsAny(id, new String[]{"poncho", "bandolier", "belt"})) return 1;
      if (containsAny(id, new String[]{"gasmask", "mask", "respirator", "balaclava", "bandana"})) return 2;
      if (containsAny(id, new String[]{"glasses", "goggles", "nvg", "headset", "headphones", "ears"})) return 3;
      return 4;
   }

   private static int foodMedicineGroup(String id) {
      if (containsAny(id, MEDICAL_KEYWORDS)) return 0;
      if (containsAny(id, new String[]{"water", "cola", "soda", "juice", "milk", "coffee", "tea", "drink", "canteen", "bottle"})) return 1;
      if (containsAny(id, new String[]{"canned", "can_", "tin_", "instantnoodles", "cookednoodles"})) return 2;
      if (containsAny(id, new String[]{"raw", "meat", "fish", "pork", "rabbit", "beef", "chicken"})) return 3;
      return 4;
   }

   private static int blockGroup(String id) {
      if (containsAny(id, new String[]{"crate", "storage", "locker", "safe", "shelves", "shelvels", "fridge", "vending", "chest", "trash", "barrel", "airdrop"})) return 0;
      if (containsAny(id, new String[]{"door", "hatch", "ladder", "rope", "vent", "grid", "fence"})) return 1;
      if (containsAny(id, new String[]{"trap", "mine", "spike", "barbed", "barrier", "barricade", "sandbag", "wire"})) return 2;
      if (containsAny(id, new String[]{"radio", "tv", "washing", "machine", "collector", "canister"})) return 3;
      if (containsAny(id, new String[]{"corpse", "gravestone", "cross", "papers", "magazine", "medicine_boxes", "planks", "pallet", "tires"})) return 4;
      if (containsAny(id, new String[]{"concrete", "brick", "plate", "bars", "ice"})) return 5;
      return 6;
   }

   private static int materialGroup(String id) {
      if (containsAny(id, new String[]{"scrap", "metal", "cloth", "leather", "plastic", "rubber", "wire", "nail", "screw", "spring", "wood", "plank", "stone"})) return 0;
      if (containsAny(id, new String[]{"module", "parts", "component", "mechanism", "powder", "chemical"})) return 1;
      if (containsAny(id, new String[]{"ammo", "bullet", "shell", "cartridge", "fuel", "battery"})) return 2;
      if (containsAny(id, new String[]{"money", "coin", "badge", "id", "key"})) return 3;
      if (containsAny(id, new String[]{"book", "note", "paper", "map", "photo"})) return 4;
      return 5;
   }

   private static int spawnEggGroup(String id) {
      if (id.startsWith("walker_")) return 0;
      if (id.startsWith("runner_")) return 1;
      if (id.startsWith("crawler_")) return 2;
      if (id.startsWith("horde_")) return 3;
      if (id.startsWith("looter_") || id.startsWith("cannibal")) return 4;
      if (containsAny(id, new String[]{"survivor_", "military_", "soldier", "hunter"})) return 5;
      if (containsAny(id, new String[]{"rat_", "cockroach_"})) return 6;
      if (id.contains("drop")) return 7;
      return 8;
   }

   private static String family(Category category, String id) {
      String value = id;
      if (category == Category.ARMOR) {
         value = value.replaceFirst("_(helmet|chestplate|leggings|boots)(?:_helmet)?$", "");
      }
      if (category == Category.WEAPONS) {
         value = value.replaceFirst("^(wooden|stone|iron|steel|scrap|electrical|electric|fire_module|spiked|wired|wrapped|fixed|reinforced|rusty|homemade|improvised)_", "");
         value = value.replaceFirst("_(electrical|electric|fire_module|spiked|wired|wrapped|fixed|reinforced|rusty)$", "");
      }
      if (category == Category.FOOD_MEDICINE) {
         value = value.replaceFirst("^(opened|open|cooked|empty)_", "").replaceFirst("_(opened|open|cooked|empty)$", "");
      }
      if (category == Category.BLOCKS) {
         value = value.replaceFirst("^(white|light_gray|gray|black|brown|red|orange|yellow|lime|green|cyan|light_blue|blue|purple|magenta|pink)_", "");
         value = value.replaceFirst("^(oak|spruce|birch|jungle|acacia|dark|mangrove|cherry)_", "");
         value = value.replace("shelvels", "shelves").replace("metelshelves", "metal_shelves").replace("metalshelves", "metal_shelves");
         value = value.replaceFirst("_?(one|two|three|four|five|variant_?\\d+|\\d+)$", "");
      }
      return value;
   }

   private static int naturalCompare(String left, String right) {
      int leftIndex = 0;
      int rightIndex = 0;
      while (leftIndex < left.length() && rightIndex < right.length()) {
         char leftChar = left.charAt(leftIndex);
         char rightChar = right.charAt(rightIndex);
         if (Character.isDigit(leftChar) && Character.isDigit(rightChar)) {
            int leftEnd = leftIndex;
            int rightEnd = rightIndex;
            while (leftEnd < left.length() && Character.isDigit(left.charAt(leftEnd))) leftEnd++;
            while (rightEnd < right.length() && Character.isDigit(right.charAt(rightEnd))) rightEnd++;
            int numberComparison = Integer.compare(
               Integer.parseInt(left.substring(leftIndex, leftEnd)),
               Integer.parseInt(right.substring(rightIndex, rightEnd))
            );
            if (numberComparison != 0) return numberComparison;
            leftIndex = leftEnd;
            rightIndex = rightEnd;
            continue;
         }
         if (leftChar != rightChar) return Character.compare(leftChar, rightChar);
         leftIndex++;
         rightIndex++;
      }
      return Integer.compare(left.length(), right.length());
   }

   private static int variant(Category category, Item item, String id) {
      if (category == Category.ARMOR && item instanceof ArmorItem armor) {
         return switch (armor.getEquipmentSlot()) {
            case HEAD -> 0;
            case CHEST -> 1;
            case LEGS -> 2;
            case FEET -> 3;
            default -> 4;
         };
      }
      if (containsAny(id, new String[]{"base", "basic", "wooden", "rusty", "empty", "neutral"})) return 0;
      if (containsAny(id, new String[]{"iron", "steel", "reinforced", "fixed", "cooked", "activated"})) return 1;
      if (containsAny(id, new String[]{"spiked", "wired", "wrapped", "electrical", "electric", "fire_module"})) return 2;
      return 1;
   }

   private static boolean isWeaponOrTool(Item item, String id) {
      if (item instanceof TieredItem || item instanceof ProjectileWeaponItem || item instanceof ShieldItem) {
         return true;
      }

      if (item.getDefaultAttributeModifiers(EquipmentSlot.MAINHAND)
         .get(Attributes.ATTACK_DAMAGE)
         .stream()
         .anyMatch(modifier -> modifier.getAmount() > 0.0)) {
         return true;
      }

      return containsAny(id, WEAPON_TOOL_KEYWORDS);
   }

   private static boolean containsAny(String value, String[] keywords) {
      for (String keyword : keywords) {
         if (value.contains(keyword)) {
            return true;
         }
      }

      return false;
   }

   private static final String[] WEAPON_TOOL_KEYWORDS = {
      "grenade", "bomb", "molotov", "dynamite", "throwingaxe", "shuriken", "nail_gun", "taser", "pepper_spray",
      "climbingropewithhook", "fire_extinguisher", "drill", "can_opener", "defusing", "repair_kit"
   };
   private static final String[] MEDICAL_KEYWORDS = {
      "bandage", "medic", "medicine", "antibiotic", "painkiller", "adrenaline", "vitamin", "suture", "syringe",
      "health", "first_aid", "bloodbag", "iodine", "disinfect", "antirad", "pill", "morphine", "compress", "splint",
      "tourniquet"
   };

   @SubscribeEvent
   public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent event) {
      if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
         event.accept(ApocalypsenowModItems.HALLIGANBAR.get());
      }
   }

   private enum Category {
      WEAPONS,
      ARMOR,
      FOOD_MEDICINE,
      BLOCKS,
      MATERIALS,
      SPAWN_EGGS
   }
}

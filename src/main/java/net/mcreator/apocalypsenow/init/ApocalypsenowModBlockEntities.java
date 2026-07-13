package net.mcreator.apocalypsenow.init;

import net.mcreator.apocalypsenow.block.entity.AcaciaPlanksStashBlockEntity;
import net.mcreator.apocalypsenow.block.entity.AcaciacrateBlockEntity;
import net.mcreator.apocalypsenow.block.entity.BirchPlanksStashBlockEntity;
import net.mcreator.apocalypsenow.block.entity.BirchcrateBlockEntity;
import net.mcreator.apocalypsenow.block.entity.BlackpetrolbarrelBlockEntity;
import net.mcreator.apocalypsenow.block.entity.BluepetrolbarrelBlockEntity;
import net.mcreator.apocalypsenow.block.entity.BrownpetrolbarrelBlockEntity;
import net.mcreator.apocalypsenow.block.entity.CarboardboxBlockEntity;
import net.mcreator.apocalypsenow.block.entity.CherryPlanksStashBlockEntity;
import net.mcreator.apocalypsenow.block.entity.CherrycrateBlockEntity;
import net.mcreator.apocalypsenow.block.entity.CokevendingmachineBlockEntity;
import net.mcreator.apocalypsenow.block.entity.CorpseclothBlockEntity;
import net.mcreator.apocalypsenow.block.entity.CorpsesackBlockEntity;
import net.mcreator.apocalypsenow.block.entity.CyanpetrolbarrelBlockEntity;
import net.mcreator.apocalypsenow.block.entity.DarkPlanksStashBlockEntity;
import net.mcreator.apocalypsenow.block.entity.DarkcrateBlockEntity;
import net.mcreator.apocalypsenow.block.entity.DesertmilitarystorageBlockEntity;
import net.mcreator.apocalypsenow.block.entity.EmptymarketshelvesBlockEntity;
import net.mcreator.apocalypsenow.block.entity.GraypetrolbarrelBlockEntity;
import net.mcreator.apocalypsenow.block.entity.GreenpetrolbarrelBlockEntity;
import net.mcreator.apocalypsenow.block.entity.IceBlockEntity;
import net.mcreator.apocalypsenow.block.entity.IroncrateBlockEntity;
import net.mcreator.apocalypsenow.block.entity.IronlockerBlockEntity;
import net.mcreator.apocalypsenow.block.entity.IronsafeBlockEntity;
import net.mcreator.apocalypsenow.block.entity.JunglePlanksStashBlockEntity;
import net.mcreator.apocalypsenow.block.entity.JunglecrateBlockEntity;
import net.mcreator.apocalypsenow.block.entity.LargeshelvesBlockEntity;
import net.mcreator.apocalypsenow.block.entity.LargeshelvesfillBlockEntity;
import net.mcreator.apocalypsenow.block.entity.LightbluepetrolbarrelBlockEntity;
import net.mcreator.apocalypsenow.block.entity.LigthgraypetrolbarrelBlockEntity;
import net.mcreator.apocalypsenow.block.entity.LimepetrolbarrelBlockEntity;
import net.mcreator.apocalypsenow.block.entity.MagazineBoxesBlockEntity;
import net.mcreator.apocalypsenow.block.entity.MagentapetrolbarrelBlockEntity;
import net.mcreator.apocalypsenow.block.entity.MangrovePlanksStashBlockEntity;
import net.mcreator.apocalypsenow.block.entity.MangrovecrateBlockEntity;
import net.mcreator.apocalypsenow.block.entity.MarketfridgeBlockEntity;
import net.mcreator.apocalypsenow.block.entity.MarketshelvesBlockEntity;
import net.mcreator.apocalypsenow.block.entity.MechanicsToolChestBlockEntity;
import net.mcreator.apocalypsenow.block.entity.MedicalBoxBlockEntity;
import net.mcreator.apocalypsenow.block.entity.MedicalStorageBlockEntity;
import net.mcreator.apocalypsenow.block.entity.MedicineboxesBlockEntity;
import net.mcreator.apocalypsenow.block.entity.MetalShelvesBlockEntity;
import net.mcreator.apocalypsenow.block.entity.MetalShevelstwoBlockEntity;
import net.mcreator.apocalypsenow.block.entity.MetalshelvesfiveBlockEntity;
import net.mcreator.apocalypsenow.block.entity.MetalshelvesoneBlockEntity;
import net.mcreator.apocalypsenow.block.entity.MetalshelvesthreeBlockEntity;
import net.mcreator.apocalypsenow.block.entity.MetelshelvesfourBlockEntity;
import net.mcreator.apocalypsenow.block.entity.MilitaryboxBlockEntity;
import net.mcreator.apocalypsenow.block.entity.MilitarystorageBlockEntity;
import net.mcreator.apocalypsenow.block.entity.OakPlanksStashBlockEntity;
import net.mcreator.apocalypsenow.block.entity.OrangepetrolbarrelBlockEntity;
import net.mcreator.apocalypsenow.block.entity.PalletStorageBlockEntity;
import net.mcreator.apocalypsenow.block.entity.PetrolbarrelBlockEntity;
import net.mcreator.apocalypsenow.block.entity.PinkpetrolbarrelBlockEntity;
import net.mcreator.apocalypsenow.block.entity.PorpsivendingmachineBlockEntity;
import net.mcreator.apocalypsenow.block.entity.PurplepetrolbarrelBlockEntity;
import net.mcreator.apocalypsenow.block.entity.RainCollectorBlockEntity;
import net.mcreator.apocalypsenow.block.entity.RedpetrolbarrelBlockEntity;
import net.mcreator.apocalypsenow.block.entity.SedexboxBlockEntity;
import net.mcreator.apocalypsenow.block.entity.SprucePlanksStashBlockEntity;
import net.mcreator.apocalypsenow.block.entity.SprucecrateBlockEntity;
import net.mcreator.apocalypsenow.block.entity.Trashcan1BlockEntity;
import net.mcreator.apocalypsenow.block.entity.TrashcanBlockEntity;
import net.mcreator.apocalypsenow.block.entity.TrashcannBlockEntity;
import net.mcreator.apocalypsenow.block.entity.WashingmachineBlockEntity;
import net.mcreator.apocalypsenow.block.entity.WhitepetrolbarrelBlockEntity;
import net.mcreator.apocalypsenow.block.entity.WoodencrateBlockEntity;
import net.mcreator.apocalypsenow.block.entity.YellowpetrolbarrelBlockEntity;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.BlockEntityType.BlockEntitySupplier;
import net.minecraft.world.level.block.entity.BlockEntityType.Builder;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ApocalypsenowModBlockEntities {
   public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, "apocalypsenow");
   public static final RegistryObject<BlockEntityType<?>> WOODEN_CRATE = register(
      "wooden_crate", ApocalypsenowModBlocks.WOODEN_CRATE, WoodencrateBlockEntity::new
   );
   public static final RegistryObject<BlockEntityType<?>> MILITARY_CRATE = register(
      "military_crate", ApocalypsenowModBlocks.MILITARY_CRATE, MilitaryboxBlockEntity::new
   );
   public static final RegistryObject<BlockEntityType<?>> MEDICAL_BOX = register("medical_box", ApocalypsenowModBlocks.MEDICAL_BOX, MedicalBoxBlockEntity::new);
   public static final RegistryObject<BlockEntityType<?>> PETROL_BARREL = register(
      "petrol_barrel", ApocalypsenowModBlocks.PETROL_BARREL, PetrolbarrelBlockEntity::new
   );
   public static final RegistryObject<BlockEntityType<?>> CARDBOARD_BOX = register(
      "cardboard_box", ApocalypsenowModBlocks.CARDBOARD_BOX, CarboardboxBlockEntity::new
   );
   public static final RegistryObject<BlockEntityType<?>> MEDICAL_STORAGE = register(
      "medical_storage", ApocalypsenowModBlocks.MEDICAL_STORAGE, MedicalStorageBlockEntity::new
   );
   public static final RegistryObject<BlockEntityType<?>> IRON_LOCKER = register("iron_locker", ApocalypsenowModBlocks.IRON_LOCKER, IronlockerBlockEntity::new);
   public static final RegistryObject<BlockEntityType<?>> SAFE = register("safe", ApocalypsenowModBlocks.SAFE, IronsafeBlockEntity::new);
   public static final RegistryObject<BlockEntityType<?>> SEDEXBOX = register("sedexbox", ApocalypsenowModBlocks.SEDEXBOX, SedexboxBlockEntity::new);
   public static final RegistryObject<BlockEntityType<?>> METAL_SHELVES = register(
      "metal_shelves", ApocalypsenowModBlocks.METAL_SHELVES, MetalShelvesBlockEntity::new
   );
   public static final RegistryObject<BlockEntityType<?>> METAL_SHELVELS_TWO = register(
      "metal_shelvels_two", ApocalypsenowModBlocks.METAL_SHELVELS_TWO, MetalShevelstwoBlockEntity::new
   );
   public static final RegistryObject<BlockEntityType<?>> METAL_SHELVES_THREE = register(
      "metal_shelves_three", ApocalypsenowModBlocks.METAL_SHELVES_THREE, MetalshelvesthreeBlockEntity::new
   );
   public static final RegistryObject<BlockEntityType<?>> PALLET_STORAGE = register(
      "pallet_storage", ApocalypsenowModBlocks.PALLET_STORAGE, PalletStorageBlockEntity::new
   );
   public static final RegistryObject<BlockEntityType<?>> OAK_PLANKS_STASH = register(
      "oak_planks_stash", ApocalypsenowModBlocks.OAK_PLANKS_STASH, OakPlanksStashBlockEntity::new
   );
   public static final RegistryObject<BlockEntityType<?>> SPRUCE_PLANKS_STASH = register(
      "spruce_planks_stash", ApocalypsenowModBlocks.SPRUCE_PLANKS_STASH, SprucePlanksStashBlockEntity::new
   );
   public static final RegistryObject<BlockEntityType<?>> BIRCH_PLANKS_STASH = register(
      "birch_planks_stash", ApocalypsenowModBlocks.BIRCH_PLANKS_STASH, BirchPlanksStashBlockEntity::new
   );
   public static final RegistryObject<BlockEntityType<?>> JUNGLE_PLANKS_STASH = register(
      "jungle_planks_stash", ApocalypsenowModBlocks.JUNGLE_PLANKS_STASH, JunglePlanksStashBlockEntity::new
   );
   public static final RegistryObject<BlockEntityType<?>> ACACIA_PLANKS_STASH = register(
      "acacia_planks_stash", ApocalypsenowModBlocks.ACACIA_PLANKS_STASH, AcaciaPlanksStashBlockEntity::new
   );
   public static final RegistryObject<BlockEntityType<?>> DARK_PLANKS_STASH = register(
      "dark_planks_stash", ApocalypsenowModBlocks.DARK_PLANKS_STASH, DarkPlanksStashBlockEntity::new
   );
   public static final RegistryObject<BlockEntityType<?>> MANGROVE_PLANKS_STASH = register(
      "mangrove_planks_stash", ApocalypsenowModBlocks.MANGROVE_PLANKS_STASH, MangrovePlanksStashBlockEntity::new
   );
   public static final RegistryObject<BlockEntityType<?>> CHERRY_PLANKS_STASH = register(
      "cherry_planks_stash", ApocalypsenowModBlocks.CHERRY_PLANKS_STASH, CherryPlanksStashBlockEntity::new
   );
   public static final RegistryObject<BlockEntityType<?>> RAIN_COLLECTOR = register(
      "rain_collector", ApocalypsenowModBlocks.RAIN_COLLECTOR, RainCollectorBlockEntity::new
   );
   public static final RegistryObject<BlockEntityType<?>> SPRUCE_CRATE = register(
      "spruce_crate", ApocalypsenowModBlocks.SPRUCE_CRATE, SprucecrateBlockEntity::new
   );
   public static final RegistryObject<BlockEntityType<?>> BIRCH_CRATE = register("birch_crate", ApocalypsenowModBlocks.BIRCH_CRATE, BirchcrateBlockEntity::new);
   public static final RegistryObject<BlockEntityType<?>> JUNGLE_CRATE = register(
      "jungle_crate", ApocalypsenowModBlocks.JUNGLE_CRATE, JunglecrateBlockEntity::new
   );
   public static final RegistryObject<BlockEntityType<?>> ACACIA_CRATE = register(
      "acacia_crate", ApocalypsenowModBlocks.ACACIA_CRATE, AcaciacrateBlockEntity::new
   );
   public static final RegistryObject<BlockEntityType<?>> DARK_CRATE = register("dark_crate", ApocalypsenowModBlocks.DARK_CRATE, DarkcrateBlockEntity::new);
   public static final RegistryObject<BlockEntityType<?>> MANGROVE_CRATE = register(
      "mangrove_crate", ApocalypsenowModBlocks.MANGROVE_CRATE, MangrovecrateBlockEntity::new
   );
   public static final RegistryObject<BlockEntityType<?>> CHERRY_CRATE = register(
      "cherry_crate", ApocalypsenowModBlocks.CHERRY_CRATE, CherrycrateBlockEntity::new
   );
   public static final RegistryObject<BlockEntityType<?>> CORPSECLOTH = register("corpsecloth", ApocalypsenowModBlocks.CORPSECLOTH, CorpseclothBlockEntity::new);
   public static final RegistryObject<BlockEntityType<?>> CORPSESACK = register("corpsesack", ApocalypsenowModBlocks.CORPSESACK, CorpsesackBlockEntity::new);
   public static final RegistryObject<BlockEntityType<?>> IRONCRATE = register("ironcrate", ApocalypsenowModBlocks.IRONCRATE, IroncrateBlockEntity::new);
   public static final RegistryObject<BlockEntityType<?>> METELSHELVESFOUR = register(
      "metelshelvesfour", ApocalypsenowModBlocks.METELSHELVESFOUR, MetelshelvesfourBlockEntity::new
   );
   public static final RegistryObject<BlockEntityType<?>> METALSHELVESONE = register(
      "metalshelvesone", ApocalypsenowModBlocks.METALSHELVESONE, MetalshelvesoneBlockEntity::new
   );
   public static final RegistryObject<BlockEntityType<?>> METALSHELVESFIVE = register(
      "metalshelvesfive", ApocalypsenowModBlocks.METALSHELVESFIVE, MetalshelvesfiveBlockEntity::new
   );
   public static final RegistryObject<BlockEntityType<?>> TRASH_BIN = register("trash_bin", ApocalypsenowModBlocks.TRASH_BIN, TrashcanBlockEntity::new);
   public static final RegistryObject<BlockEntityType<?>> TRASHCANN = register("trashcann", ApocalypsenowModBlocks.TRASHCANN, TrashcannBlockEntity::new);
   public static final RegistryObject<BlockEntityType<?>> TRASHCAN_1 = register("trashcan_1", ApocalypsenowModBlocks.TRASHCAN_1, Trashcan1BlockEntity::new);
   public static final RegistryObject<BlockEntityType<?>> MECHANICS_TOOL_CHEST = register(
      "mechanics_tool_chest", ApocalypsenowModBlocks.MECHANICS_TOOL_CHEST, MechanicsToolChestBlockEntity::new
   );
   public static final RegistryObject<BlockEntityType<?>> COKE_VENDING_MACHINE = register(
      "coke_vending_machine", ApocalypsenowModBlocks.COKE_VENDING_MACHINE, CokevendingmachineBlockEntity::new
   );
   public static final RegistryObject<BlockEntityType<?>> PORPSI_VENDING_MACHINE = register(
      "porpsi_vending_machine", ApocalypsenowModBlocks.PORPSI_VENDING_MACHINE, PorpsivendingmachineBlockEntity::new
   );
   public static final RegistryObject<BlockEntityType<?>> MAGAZINE_BOXES = register(
      "magazine_boxes", ApocalypsenowModBlocks.MAGAZINE_BOXES, MagazineBoxesBlockEntity::new
   );
   public static final RegistryObject<BlockEntityType<?>> MARKET_SHELVES = register(
      "market_shelves", ApocalypsenowModBlocks.MARKET_SHELVES, MarketshelvesBlockEntity::new
   );
   public static final RegistryObject<BlockEntityType<?>> MEDICINE_BOXES = register(
      "medicine_boxes", ApocalypsenowModBlocks.MEDICINE_BOXES, MedicineboxesBlockEntity::new
   );
   public static final RegistryObject<BlockEntityType<?>> EMPTY_MARKET_SHELVES = register(
      "empty_market_shelves", ApocalypsenowModBlocks.EMPTY_MARKET_SHELVES, EmptymarketshelvesBlockEntity::new
   );
   public static final RegistryObject<BlockEntityType<?>> LARGE_SHELVES = register(
      "large_shelves", ApocalypsenowModBlocks.LARGE_SHELVES, LargeshelvesBlockEntity::new
   );
   public static final RegistryObject<BlockEntityType<?>> LARGE_SHELVES_FILL = register(
      "large_shelves_fill", ApocalypsenowModBlocks.LARGE_SHELVES_FILL, LargeshelvesfillBlockEntity::new
   );
   public static final RegistryObject<BlockEntityType<?>> ICE = register("ice", ApocalypsenowModBlocks.ICE, IceBlockEntity::new);
   public static final RegistryObject<BlockEntityType<?>> WASHING_MACHINE = register(
      "washing_machine", ApocalypsenowModBlocks.WASHING_MACHINE, WashingmachineBlockEntity::new
   );
   public static final RegistryObject<BlockEntityType<?>> MILITARY_STORAGE = register(
      "military_storage", ApocalypsenowModBlocks.MILITARY_STORAGE, MilitarystorageBlockEntity::new
   );
   public static final RegistryObject<BlockEntityType<?>> DESERT_MILITARY_STORAGE = register(
      "desert_military_storage", ApocalypsenowModBlocks.DESERT_MILITARY_STORAGE, DesertmilitarystorageBlockEntity::new
   );
   public static final RegistryObject<BlockEntityType<?>> WHITE_PETROL_BARREL = register(
      "white_petrol_barrel", ApocalypsenowModBlocks.WHITE_PETROL_BARREL, WhitepetrolbarrelBlockEntity::new
   );
   public static final RegistryObject<BlockEntityType<?>> LIGTH_GRAY_PETROL_BARREL = register(
      "ligth_gray_petrol_barrel", ApocalypsenowModBlocks.LIGTH_GRAY_PETROL_BARREL, LigthgraypetrolbarrelBlockEntity::new
   );
   public static final RegistryObject<BlockEntityType<?>> GRAY_PETROL_BARREL = register(
      "gray_petrol_barrel", ApocalypsenowModBlocks.GRAY_PETROL_BARREL, GraypetrolbarrelBlockEntity::new
   );
   public static final RegistryObject<BlockEntityType<?>> BLACK_PETROL_BARREL = register(
      "black_petrol_barrel", ApocalypsenowModBlocks.BLACK_PETROL_BARREL, BlackpetrolbarrelBlockEntity::new
   );
   public static final RegistryObject<BlockEntityType<?>> BROWN_PETROL_BARREL = register(
      "brown_petrol_barrel", ApocalypsenowModBlocks.BROWN_PETROL_BARREL, BrownpetrolbarrelBlockEntity::new
   );
   public static final RegistryObject<BlockEntityType<?>> RED_PETROL_BARREL = register(
      "red_petrol_barrel", ApocalypsenowModBlocks.RED_PETROL_BARREL, RedpetrolbarrelBlockEntity::new
   );
   public static final RegistryObject<BlockEntityType<?>> ORANGE_PETROL_BARREL = register(
      "orange_petrol_barrel", ApocalypsenowModBlocks.ORANGE_PETROL_BARREL, OrangepetrolbarrelBlockEntity::new
   );
   public static final RegistryObject<BlockEntityType<?>> YELLOW_PETROL_BARREL = register(
      "yellow_petrol_barrel", ApocalypsenowModBlocks.YELLOW_PETROL_BARREL, YellowpetrolbarrelBlockEntity::new
   );
   public static final RegistryObject<BlockEntityType<?>> LIME_PETROL_BARREL = register(
      "lime_petrol_barrel", ApocalypsenowModBlocks.LIME_PETROL_BARREL, LimepetrolbarrelBlockEntity::new
   );
   public static final RegistryObject<BlockEntityType<?>> GREEN_PETROL_BARREL = register(
      "green_petrol_barrel", ApocalypsenowModBlocks.GREEN_PETROL_BARREL, GreenpetrolbarrelBlockEntity::new
   );
   public static final RegistryObject<BlockEntityType<?>> CYAN_PETROL_BARREL = register(
      "cyan_petrol_barrel", ApocalypsenowModBlocks.CYAN_PETROL_BARREL, CyanpetrolbarrelBlockEntity::new
   );
   public static final RegistryObject<BlockEntityType<?>> LIGHT_BLUE_PETROL_BARREL = register(
      "light_blue_petrol_barrel", ApocalypsenowModBlocks.LIGHT_BLUE_PETROL_BARREL, LightbluepetrolbarrelBlockEntity::new
   );
   public static final RegistryObject<BlockEntityType<?>> BLUE_PETROL_BARREL = register(
      "blue_petrol_barrel", ApocalypsenowModBlocks.BLUE_PETROL_BARREL, BluepetrolbarrelBlockEntity::new
   );
   public static final RegistryObject<BlockEntityType<?>> PURPLE_PETROL_BARREL = register(
      "purple_petrol_barrel", ApocalypsenowModBlocks.PURPLE_PETROL_BARREL, PurplepetrolbarrelBlockEntity::new
   );
   public static final RegistryObject<BlockEntityType<?>> MAGENTA_PETROL_BARREL = register(
      "magenta_petrol_barrel", ApocalypsenowModBlocks.MAGENTA_PETROL_BARREL, MagentapetrolbarrelBlockEntity::new
   );
   public static final RegistryObject<BlockEntityType<?>> PINK_PETROL_BARREL = register(
      "pink_petrol_barrel", ApocalypsenowModBlocks.PINK_PETROL_BARREL, PinkpetrolbarrelBlockEntity::new
   );
   public static final RegistryObject<BlockEntityType<?>> MARKETFRIDGE = register(
      "marketfridge", ApocalypsenowModBlocks.MARKETFRIDGE, MarketfridgeBlockEntity::new
   );

   private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntitySupplier<?> supplier) {
      return REGISTRY.register(registryname, () -> Builder.of(supplier, block.get()).build(null));
   }
}

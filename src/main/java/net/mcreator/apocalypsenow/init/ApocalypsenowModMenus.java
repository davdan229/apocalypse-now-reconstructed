package net.mcreator.apocalypsenow.init;

import net.mcreator.apocalypsenow.world.inventory.AlicepackGUIMenu;
import net.mcreator.apocalypsenow.world.inventory.CardboardGUIMenu;
import net.mcreator.apocalypsenow.world.inventory.CorpseclothguiMenu;
import net.mcreator.apocalypsenow.world.inventory.CorpsesackGUIMenu;
import net.mcreator.apocalypsenow.world.inventory.CrateGUIMenu;
import net.mcreator.apocalypsenow.world.inventory.HiddenstashplanksGUIMenu;
import net.mcreator.apocalypsenow.world.inventory.IceGUIMenu;
import net.mcreator.apocalypsenow.world.inventory.IronlockerboxguiMenu;
import net.mcreator.apocalypsenow.world.inventory.IronsafeboxGUIMenu;
import net.mcreator.apocalypsenow.world.inventory.LargeshelvesGUIMenu;
import net.mcreator.apocalypsenow.world.inventory.MagazineboxesGUIMenu;
import net.mcreator.apocalypsenow.world.inventory.MarketfridgeGUIMenu;
import net.mcreator.apocalypsenow.world.inventory.MarketshelvesGUIMenu;
import net.mcreator.apocalypsenow.world.inventory.MechanicstoolchestguiMenu;
import net.mcreator.apocalypsenow.world.inventory.MedicalcrateGUIMenu;
import net.mcreator.apocalypsenow.world.inventory.MedicalcrateboxGUIMenu;
import net.mcreator.apocalypsenow.world.inventory.MedicineboxesGUIMenu;
import net.mcreator.apocalypsenow.world.inventory.MilitarycrateGUIMenu;
import net.mcreator.apocalypsenow.world.inventory.MilitarystorageGUIMenu;
import net.mcreator.apocalypsenow.world.inventory.PalletstorageguiMenu;
import net.mcreator.apocalypsenow.world.inventory.SedexGUIMenu;
import net.mcreator.apocalypsenow.world.inventory.SuplyshelvesGUIMenu;
import net.mcreator.apocalypsenow.world.inventory.SuplyshelvesboxGUIMenu;
import net.mcreator.apocalypsenow.world.inventory.TrashGUIMenu;
import net.mcreator.apocalypsenow.world.inventory.TrashcanguiMenu;
import net.mcreator.apocalypsenow.world.inventory.VendingMachineGUIMenu;
import net.mcreator.apocalypsenow.world.inventory.WashingmachineGUIMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ApocalypsenowModMenus {
   public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, "apocalypsenow");
   public static final RegistryObject<MenuType<AlicepackGUIMenu>> ALICEPACK_GUI = REGISTRY.register(
      "alicepack_gui", () -> IForgeMenuType.create(AlicepackGUIMenu::new)
   );
   public static final RegistryObject<MenuType<MedicalcrateGUIMenu>> MEDICALCRATE_GUI = REGISTRY.register(
      "medicalcrate_gui", () -> IForgeMenuType.create(MedicalcrateGUIMenu::new)
   );
   public static final RegistryObject<MenuType<SuplyshelvesGUIMenu>> SUPLYSHELVES_GUI = REGISTRY.register(
      "suplyshelves_gui", () -> IForgeMenuType.create(SuplyshelvesGUIMenu::new)
   );
   public static final RegistryObject<MenuType<CrateGUIMenu>> CRATE_GUI = REGISTRY.register("crate_gui", () -> IForgeMenuType.create(CrateGUIMenu::new));
   public static final RegistryObject<MenuType<HiddenstashplanksGUIMenu>> HIDDENSTASHPLANKS_GUI = REGISTRY.register(
      "hiddenstashplanks_gui", () -> IForgeMenuType.create(HiddenstashplanksGUIMenu::new)
   );
   public static final RegistryObject<MenuType<MilitarycrateGUIMenu>> MILITARYCRATE_GUI = REGISTRY.register(
      "militarycrate_gui", () -> IForgeMenuType.create(MilitarycrateGUIMenu::new)
   );
   public static final RegistryObject<MenuType<CardboardGUIMenu>> CARDBOARD_GUI = REGISTRY.register(
      "cardboard_gui", () -> IForgeMenuType.create(CardboardGUIMenu::new)
   );
   public static final RegistryObject<MenuType<MedicalcrateboxGUIMenu>> MEDICALCRATEBOX_GUI = REGISTRY.register(
      "medicalcratebox_gui", () -> IForgeMenuType.create(MedicalcrateboxGUIMenu::new)
   );
   public static final RegistryObject<MenuType<SedexGUIMenu>> SEDEX_GUI = REGISTRY.register("sedex_gui", () -> IForgeMenuType.create(SedexGUIMenu::new));
   public static final RegistryObject<MenuType<IronsafeboxGUIMenu>> IRONSAFEBOX_GUI = REGISTRY.register(
      "ironsafebox_gui", () -> IForgeMenuType.create(IronsafeboxGUIMenu::new)
   );
   public static final RegistryObject<MenuType<IronlockerboxguiMenu>> IRONLOCKERBOXGUI = REGISTRY.register(
      "ironlockerboxgui", () -> IForgeMenuType.create(IronlockerboxguiMenu::new)
   );
   public static final RegistryObject<MenuType<PalletstorageguiMenu>> PALLETSTORAGEGUI = REGISTRY.register(
      "palletstoragegui", () -> IForgeMenuType.create(PalletstorageguiMenu::new)
   );
   public static final RegistryObject<MenuType<SuplyshelvesboxGUIMenu>> SUPLYSHELVESBOX_GUI = REGISTRY.register(
      "suplyshelvesbox_gui", () -> IForgeMenuType.create(SuplyshelvesboxGUIMenu::new)
   );
   public static final RegistryObject<MenuType<CorpsesackGUIMenu>> CORPSESACK_GUI = REGISTRY.register(
      "corpsesack_gui", () -> IForgeMenuType.create(CorpsesackGUIMenu::new)
   );
   public static final RegistryObject<MenuType<CorpseclothguiMenu>> CORPSECLOTHGUI = REGISTRY.register(
      "corpseclothgui", () -> IForgeMenuType.create(CorpseclothguiMenu::new)
   );
   public static final RegistryObject<MenuType<TrashcanguiMenu>> TRASHCANGUI = REGISTRY.register(
      "trashcangui", () -> IForgeMenuType.create(TrashcanguiMenu::new)
   );
   public static final RegistryObject<MenuType<TrashGUIMenu>> TRASH_GUI = REGISTRY.register("trash_gui", () -> IForgeMenuType.create(TrashGUIMenu::new));
   public static final RegistryObject<MenuType<MechanicstoolchestguiMenu>> MECHANICSTOOLCHESTGUI = REGISTRY.register(
      "mechanicstoolchestgui", () -> IForgeMenuType.create(MechanicstoolchestguiMenu::new)
   );
   public static final RegistryObject<MenuType<MagazineboxesGUIMenu>> MAGAZINEBOXES_GUI = REGISTRY.register(
      "magazineboxes_gui", () -> IForgeMenuType.create(MagazineboxesGUIMenu::new)
   );
   public static final RegistryObject<MenuType<LargeshelvesGUIMenu>> LARGESHELVES_GUI = REGISTRY.register(
      "largeshelves_gui", () -> IForgeMenuType.create(LargeshelvesGUIMenu::new)
   );
   public static final RegistryObject<MenuType<IceGUIMenu>> ICE_GUI = REGISTRY.register("ice_gui", () -> IForgeMenuType.create(IceGUIMenu::new));
   public static final RegistryObject<MenuType<WashingmachineGUIMenu>> WASHINGMACHINE_GUI = REGISTRY.register(
      "washingmachine_gui", () -> IForgeMenuType.create(WashingmachineGUIMenu::new)
   );
   public static final RegistryObject<MenuType<MedicineboxesGUIMenu>> MEDICINEBOXES_GUI = REGISTRY.register(
      "medicineboxes_gui", () -> IForgeMenuType.create(MedicineboxesGUIMenu::new)
   );
   public static final RegistryObject<MenuType<MilitarystorageGUIMenu>> MILITARYSTORAGE_GUI = REGISTRY.register(
      "militarystorage_gui", () -> IForgeMenuType.create(MilitarystorageGUIMenu::new)
   );
   public static final RegistryObject<MenuType<MarketshelvesGUIMenu>> MARKETSHELVES_GUI = REGISTRY.register(
      "marketshelves_gui", () -> IForgeMenuType.create(MarketshelvesGUIMenu::new)
   );
   public static final RegistryObject<MenuType<VendingMachineGUIMenu>> VENDING_MACHINE_GUI = REGISTRY.register(
      "vending_machine_gui", () -> IForgeMenuType.create(VendingMachineGUIMenu::new)
   );
   public static final RegistryObject<MenuType<MarketfridgeGUIMenu>> MARKETFRIDGE_GUI = REGISTRY.register(
      "marketfridge_gui", () -> IForgeMenuType.create(MarketfridgeGUIMenu::new)
   );
}

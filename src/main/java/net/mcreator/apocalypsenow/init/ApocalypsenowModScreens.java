package net.mcreator.apocalypsenow.init;

import net.mcreator.apocalypsenow.client.gui.AlicepackGUIScreen;
import net.mcreator.apocalypsenow.client.gui.CardboardGUIScreen;
import net.mcreator.apocalypsenow.client.gui.CorpseclothguiScreen;
import net.mcreator.apocalypsenow.client.gui.CorpsesackGUIScreen;
import net.mcreator.apocalypsenow.client.gui.CrateGUIScreen;
import net.mcreator.apocalypsenow.client.gui.HiddenstashplanksGUIScreen;
import net.mcreator.apocalypsenow.client.gui.IceGUIScreen;
import net.mcreator.apocalypsenow.client.gui.IronlockerboxguiScreen;
import net.mcreator.apocalypsenow.client.gui.IronsafeboxGUIScreen;
import net.mcreator.apocalypsenow.client.gui.LargeshelvesGUIScreen;
import net.mcreator.apocalypsenow.client.gui.MagazineboxesGUIScreen;
import net.mcreator.apocalypsenow.client.gui.MarketfridgeGUIScreen;
import net.mcreator.apocalypsenow.client.gui.MarketshelvesGUIScreen;
import net.mcreator.apocalypsenow.client.gui.MechanicstoolchestguiScreen;
import net.mcreator.apocalypsenow.client.gui.MedicalcrateGUIScreen;
import net.mcreator.apocalypsenow.client.gui.MedicalcrateboxGUIScreen;
import net.mcreator.apocalypsenow.client.gui.MedicineboxesGUIScreen;
import net.mcreator.apocalypsenow.client.gui.MilitarycrateGUIScreen;
import net.mcreator.apocalypsenow.client.gui.MilitarystorageGUIScreen;
import net.mcreator.apocalypsenow.client.gui.PalletstorageguiScreen;
import net.mcreator.apocalypsenow.client.gui.SedexGUIScreen;
import net.mcreator.apocalypsenow.client.gui.SuplyshelvesGUIScreen;
import net.mcreator.apocalypsenow.client.gui.SuplyshelvesboxGUIScreen;
import net.mcreator.apocalypsenow.client.gui.TrashGUIScreen;
import net.mcreator.apocalypsenow.client.gui.TrashcanguiScreen;
import net.mcreator.apocalypsenow.client.gui.VendingMachineGUIScreen;
import net.mcreator.apocalypsenow.client.gui.WashingmachineGUIScreen;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@EventBusSubscriber(bus = Bus.MOD, value = Dist.CLIENT)
public class ApocalypsenowModScreens {
   @SubscribeEvent
   public static void clientLoad(FMLClientSetupEvent event) {
      event.enqueueWork(() -> {
         MenuScreens.register(ApocalypsenowModMenus.ALICEPACK_GUI.get(), AlicepackGUIScreen::new);
         MenuScreens.register(ApocalypsenowModMenus.MEDICALCRATE_GUI.get(), MedicalcrateGUIScreen::new);
         MenuScreens.register(ApocalypsenowModMenus.SUPLYSHELVES_GUI.get(), SuplyshelvesGUIScreen::new);
         MenuScreens.register(ApocalypsenowModMenus.CRATE_GUI.get(), CrateGUIScreen::new);
         MenuScreens.register(ApocalypsenowModMenus.HIDDENSTASHPLANKS_GUI.get(), HiddenstashplanksGUIScreen::new);
         MenuScreens.register(ApocalypsenowModMenus.MILITARYCRATE_GUI.get(), MilitarycrateGUIScreen::new);
         MenuScreens.register(ApocalypsenowModMenus.CARDBOARD_GUI.get(), CardboardGUIScreen::new);
         MenuScreens.register(ApocalypsenowModMenus.MEDICALCRATEBOX_GUI.get(), MedicalcrateboxGUIScreen::new);
         MenuScreens.register(ApocalypsenowModMenus.SEDEX_GUI.get(), SedexGUIScreen::new);
         MenuScreens.register(ApocalypsenowModMenus.IRONSAFEBOX_GUI.get(), IronsafeboxGUIScreen::new);
         MenuScreens.register(ApocalypsenowModMenus.IRONLOCKERBOXGUI.get(), IronlockerboxguiScreen::new);
         MenuScreens.register(ApocalypsenowModMenus.PALLETSTORAGEGUI.get(), PalletstorageguiScreen::new);
         MenuScreens.register(ApocalypsenowModMenus.SUPLYSHELVESBOX_GUI.get(), SuplyshelvesboxGUIScreen::new);
         MenuScreens.register(ApocalypsenowModMenus.CORPSESACK_GUI.get(), CorpsesackGUIScreen::new);
         MenuScreens.register(ApocalypsenowModMenus.CORPSECLOTHGUI.get(), CorpseclothguiScreen::new);
         MenuScreens.register(ApocalypsenowModMenus.TRASHCANGUI.get(), TrashcanguiScreen::new);
         MenuScreens.register(ApocalypsenowModMenus.TRASH_GUI.get(), TrashGUIScreen::new);
         MenuScreens.register(ApocalypsenowModMenus.MECHANICSTOOLCHESTGUI.get(), MechanicstoolchestguiScreen::new);
         MenuScreens.register(ApocalypsenowModMenus.MAGAZINEBOXES_GUI.get(), MagazineboxesGUIScreen::new);
         MenuScreens.register(ApocalypsenowModMenus.LARGESHELVES_GUI.get(), LargeshelvesGUIScreen::new);
         MenuScreens.register(ApocalypsenowModMenus.ICE_GUI.get(), IceGUIScreen::new);
         MenuScreens.register(ApocalypsenowModMenus.WASHINGMACHINE_GUI.get(), WashingmachineGUIScreen::new);
         MenuScreens.register(ApocalypsenowModMenus.MEDICINEBOXES_GUI.get(), MedicineboxesGUIScreen::new);
         MenuScreens.register(ApocalypsenowModMenus.MILITARYSTORAGE_GUI.get(), MilitarystorageGUIScreen::new);
         MenuScreens.register(ApocalypsenowModMenus.MARKETSHELVES_GUI.get(), MarketshelvesGUIScreen::new);
         MenuScreens.register(ApocalypsenowModMenus.VENDING_MACHINE_GUI.get(), VendingMachineGUIScreen::new);
         MenuScreens.register(ApocalypsenowModMenus.MARKETFRIDGE_GUI.get(), MarketfridgeGUIScreen::new);
      });
   }
}

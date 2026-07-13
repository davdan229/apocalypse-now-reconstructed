package net.mcreator.apocalypsenow.init;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import top.theillusivec4.curios.api.SlotTypePreset;

@EventBusSubscriber(bus = Bus.MOD)
public class ApocalypsenowModCuriosSlots {
   @SubscribeEvent
   public static void enqueueIMC(InterModEnqueueEvent event) {
      InterModComms.sendTo("curios", "register_type", () -> SlotTypePreset.HEAD.getMessageBuilder().size(1).build());
      InterModComms.sendTo("curios", "register_type", () -> SlotTypePreset.BODY.getMessageBuilder().size(1).build());
   }
}

package net.mcreator.apocalypsenow.init;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import top.theillusivec4.curios.api.SlotTypeMessage.Builder;

@EventBusSubscriber(bus = Bus.MOD)
public class ApocalypsenowModCustomCuriosSlots {
   @SubscribeEvent
   public static void enqueueIMC(InterModEnqueueEvent event) {
      InterModComms.sendTo("curios", "register_type", () -> new Builder("faceslot").icon(new ResourceLocation("curios:slot/balaclava")).size(1).build());
   }
}

package net.mcreator.apocalypsenow.init;

import net.mcreator.apocalypsenow.ApocalypsenowMod;
import net.mcreator.apocalypsenow.network.NigthvisionkeybindMessage;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.event.TickEvent.ClientTickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@EventBusSubscriber(bus = Bus.MOD, value = Dist.CLIENT)
public class ApocalypsenowModKeyMappings {
   public static final KeyMapping NIGTHVISIONKEYBIND = new KeyMapping("key.apocalypsenow.nigthvisionkeybind", 78, "key.categories.gameplay") {
      private boolean isDownOld = false;

      @Override
      public void setDown(boolean isDown) {
         super.setDown(isDown);
         if (this.isDownOld != isDown && isDown) {
            var player = Minecraft.getInstance().player;
            if (player != null) {
               ApocalypsenowMod.PACKET_HANDLER.sendToServer(new NigthvisionkeybindMessage(0, 0));
               NigthvisionkeybindMessage.pressAction(player, 0, 0);
            }
         }

         this.isDownOld = isDown;
      }
   };

   @SubscribeEvent
   public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
      event.register(NIGTHVISIONKEYBIND);
   }

   @EventBusSubscriber(Dist.CLIENT)
   public static class KeyEventListener {
      @SubscribeEvent
      public static void onClientTick(ClientTickEvent event) {
         if (Minecraft.getInstance().screen == null) {
            ApocalypsenowModKeyMappings.NIGTHVISIONKEYBIND.consumeClick();
         }
      }
   }
}

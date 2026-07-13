package net.mcreator.apocalypsenow.network;

import java.util.function.Supplier;
import net.mcreator.apocalypsenow.ApocalypsenowMod;
import net.mcreator.apocalypsenow.procedures.NigthvisionkeybindOnKeyPressedProcedure;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.network.NetworkEvent.Context;

@EventBusSubscriber(bus = Bus.MOD)
public class NigthvisionkeybindMessage {
   int type;
   int pressedms;

   public NigthvisionkeybindMessage(int type, int pressedms) {
      this.type = type;
      this.pressedms = pressedms;
   }

   public NigthvisionkeybindMessage(FriendlyByteBuf buffer) {
      this.type = buffer.readInt();
      this.pressedms = buffer.readInt();
   }

   public static void buffer(NigthvisionkeybindMessage message, FriendlyByteBuf buffer) {
      buffer.writeInt(message.type);
      buffer.writeInt(message.pressedms);
   }

   public static void handler(NigthvisionkeybindMessage message, Supplier<Context> contextSupplier) {
      Context context = contextSupplier.get();
      context.enqueueWork(() -> pressAction(context.getSender(), message.type, message.pressedms));
      context.setPacketHandled(true);
   }

   public static void pressAction(Player entity, int type, int pressedms) {
      if (entity == null) {
         return;
      }

      Level world = entity.level();
      double x = entity.getX();
      double y = entity.getY();
      double z = entity.getZ();
      if (world.hasChunkAt(entity.blockPosition())) {
         if (type == 0) {
            NigthvisionkeybindOnKeyPressedProcedure.execute(world, x, y, z, entity);
         }
      }
   }

   @SubscribeEvent
   public static void registerMessage(FMLCommonSetupEvent event) {
      ApocalypsenowMod.addNetworkMessage(
         NigthvisionkeybindMessage.class, NigthvisionkeybindMessage::buffer, NigthvisionkeybindMessage::new, NigthvisionkeybindMessage::handler
      );
   }
}

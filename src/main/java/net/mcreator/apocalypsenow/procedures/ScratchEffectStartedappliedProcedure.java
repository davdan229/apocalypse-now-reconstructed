package net.mcreator.apocalypsenow.procedures;

import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;

public class ScratchEffectStartedappliedProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         if (entity instanceof Player _player && !_player.level().isClientSide()) {
            _player.displayClientMessage(Component.translatable("text.apocalypsenow.i_got_scratched_fd7db6ea"), true);
         }
      }
   }
}

package net.mcreator.apocalypsenow.procedures;

import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;

public class ZombificationEffectStartedappliedProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         if (entity instanceof Player _player && !_player.level().isClientSide()) {
            _player.displayClientMessage(Component.translatable("text.apocalypsenow.i_m_turning_into_one_of_them_4f68db5a"), true);
         }
      }
   }
}

package net.mcreator.apocalypsenow.procedures;

import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;

public class WorldcompassItemInHandTickProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         if (entity.getDirection() == Direction.NORTH) {
            if (entity instanceof Player _player && !_player.level().isClientSide()) {
               _player.displayClientMessage(Component.translatable("text.apocalypsenow.north_43f853bb"), true);
            }
         } else if (entity.getDirection() == Direction.SOUTH) {
            if (entity instanceof Player _player && !_player.level().isClientSide()) {
               _player.displayClientMessage(Component.translatable("text.apocalypsenow.south_0dd2dae4"), true);
            }
         } else if (entity.getDirection() == Direction.WEST) {
            if (entity instanceof Player _player && !_player.level().isClientSide()) {
               _player.displayClientMessage(Component.translatable("text.apocalypsenow.west_41a6741e"), true);
            }
         } else if (entity.getDirection() == Direction.EAST && entity instanceof Player _player && !_player.level().isClientSide()) {
            _player.displayClientMessage(Component.translatable("text.apocalypsenow.east_4e2cd851"), true);
         }
      }
   }
}

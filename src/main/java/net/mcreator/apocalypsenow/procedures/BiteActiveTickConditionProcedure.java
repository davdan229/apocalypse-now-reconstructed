package net.mcreator.apocalypsenow.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;

public class BiteActiveTickConditionProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         if (entity instanceof Player _player) {
            _player.getFoodData().setFoodLevel(1);
         }

         if (entity instanceof Player _player) {
            _player.causeFoodExhaustion(1.0F);
         }
      }
   }
}

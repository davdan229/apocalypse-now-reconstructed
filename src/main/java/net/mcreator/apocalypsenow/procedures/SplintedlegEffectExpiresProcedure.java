package net.mcreator.apocalypsenow.procedures;

import net.mcreator.apocalypsenow.init.ApocalypsenowModItems;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.LevelAccessor;

public class SplintedlegEffectExpiresProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z) {
      if (world instanceof ServerLevel _level) {
         ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ApocalypsenowModItems.PLANK.get()));
         entityToSpawn.setPickUpDelay(10);
         entityToSpawn.setUnlimitedLifetime();
         _level.addFreshEntity(entityToSpawn);
      }
   }
}

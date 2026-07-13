package net.mcreator.apocalypsenow.procedures;

import net.mcreator.apocalypsenow.init.ApocalypsenowModItems;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.LevelAccessor;

public class Special3EntityDiesProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z) {
      if (world instanceof ServerLevel _level) {
         ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ApocalypsenowModItems.ELECTRIC_CLUB.get()));
         entityToSpawn.setPickUpDelay(10);
         entityToSpawn.setUnlimitedLifetime();
         _level.addFreshEntity(entityToSpawn);
      }

      if (world instanceof ServerLevel _level) {
         ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ApocalypsenowModItems.EXPEDITION_KNIFE.get()));
         entityToSpawn.setPickUpDelay(10);
         entityToSpawn.setUnlimitedLifetime();
         _level.addFreshEntity(entityToSpawn);
      }

      if (world instanceof ServerLevel _level) {
         ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ApocalypsenowModItems.ROU_RESPIRATOR_HELMET.get()));
         entityToSpawn.setPickUpDelay(10);
         entityToSpawn.setUnlimitedLifetime();
         _level.addFreshEntity(entityToSpawn);
      }

      if (world instanceof ServerLevel _level) {
         ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ApocalypsenowModItems.LIFE_JACKET_BULLET_HELMET_HELMET.get()));
         entityToSpawn.setPickUpDelay(10);
         entityToSpawn.setUnlimitedLifetime();
         _level.addFreshEntity(entityToSpawn);
      }
   }
}

package net.mcreator.apocalypsenow.procedures;

import net.mcreator.apocalypsenow.configuration.ApocalypsenowconfigurationConfiguration;
import net.mcreator.apocalypsenow.init.ApocalypsenowModItems;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.LevelAccessor;

public class Survivor6EntityDiesProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z) {
      if (ApocalypsenowconfigurationConfiguration.HUMAN_FLESH_DROP.get()) {
         if (Math.random() < 0.4) {
            if (world instanceof ServerLevel _level) {
               ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ApocalypsenowModItems.HUMAN_FLESH.get()));
               entityToSpawn.setPickUpDelay(10);
               _level.addFreshEntity(entityToSpawn);
            }

            if (world instanceof ServerLevel _level) {
               ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ApocalypsenowModItems.HUMAN_FLESH.get()));
               entityToSpawn.setPickUpDelay(10);
               _level.addFreshEntity(entityToSpawn);
            }
         }

         if (Math.random() < 0.2 && world instanceof ServerLevel _level) {
            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ApocalypsenowModItems.HUMAN_FLESH.get()));
            entityToSpawn.setPickUpDelay(10);
            _level.addFreshEntity(entityToSpawn);
         }
      }
   }
}

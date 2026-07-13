package net.mcreator.apocalypsenow.procedures;

import net.mcreator.apocalypsenow.ApocalypsenowMod;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level.ExplosionInteraction;
import net.minecraft.world.level.block.Blocks;

public class LandmineBlockDestroyedByExplosionProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z) {
      ApocalypsenowMod.queueServerWork(2, () -> {
         if (world instanceof Level _level && !_level.isClientSide()) {
            _level.explode(null, x, y, z, 4.0F, ExplosionInteraction.BLOCK);
         }

         ApocalypsenowMod.queueServerWork(2, () -> world.setBlock(BlockPos.containing(x, y, z), Blocks.FIRE.defaultBlockState(), 3));
      });
   }
}

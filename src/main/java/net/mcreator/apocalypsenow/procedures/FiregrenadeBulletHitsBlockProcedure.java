package net.mcreator.apocalypsenow.procedures;

import net.mcreator.apocalypsenow.ApocalypsenowMod;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level.ExplosionInteraction;
import net.minecraft.world.level.block.Blocks;

public class FiregrenadeBulletHitsBlockProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z) {
      boolean found = false;
      double sx = 0.0;
      double sy = 0.0;
      double sz = 0.0;
      ApocalypsenowMod.queueServerWork(20, () -> {
         if (world instanceof Level _level && !_level.isClientSide()) {
            _level.explode(null, x, y, z, 2.0F, ExplosionInteraction.NONE);
         }

         if (world instanceof ServerLevel _level) {
            _level.sendParticles(ParticleTypes.EXPLOSION, x, y, z, 5, 3.0, 3.0, 3.0, 1.0);
         }

         if (world instanceof ServerLevel _level) {
            _level.sendParticles(ParticleTypes.SMOKE, x, y, z, 5, 3.0, 3.0, 3.0, 1.0);
         }

         if (world instanceof ServerLevel _level) {
            _level.sendParticles(ParticleTypes.FLAME, x, y, z, 16, 3.0, 3.0, 3.0, 1.0);
         }

         if (world.getBlockState(BlockPos.containing(x, y, z)).getBlock() == Blocks.AIR) {
            world.setBlock(BlockPos.containing(x, y, z), Blocks.FIRE.defaultBlockState(), 3);
         }

         if (world.getBlockState(BlockPos.containing(x, y, z)).getBlock() == Blocks.AIR) {
            world.setBlock(BlockPos.containing(x + 1.0, y, z), Blocks.FIRE.defaultBlockState(), 3);
         }

         if (world.getBlockState(BlockPos.containing(x, y, z)).getBlock() == Blocks.AIR) {
            world.setBlock(BlockPos.containing(x - 1.0, y, z), Blocks.FIRE.defaultBlockState(), 3);
         }

         if (world.getBlockState(BlockPos.containing(x, y, z)).getBlock() == Blocks.AIR) {
            world.setBlock(BlockPos.containing(x + 3.0, y, z), Blocks.FIRE.defaultBlockState(), 3);
         }

         if (world.getBlockState(BlockPos.containing(x, y, z)).getBlock() == Blocks.AIR) {
            world.setBlock(BlockPos.containing(x - 3.0, y, z), Blocks.FIRE.defaultBlockState(), 3);
         }

         if (world.getBlockState(BlockPos.containing(x, y, z)).getBlock() == Blocks.AIR) {
            world.setBlock(BlockPos.containing(x - 5.0, y, z - 5.0), Blocks.FIRE.defaultBlockState(), 3);
         }

         if (world.getBlockState(BlockPos.containing(x, y, z)).getBlock() == Blocks.AIR) {
            world.setBlock(BlockPos.containing(x + 5.0, y, z - 5.0), Blocks.FIRE.defaultBlockState(), 3);
         }

         if (world.getBlockState(BlockPos.containing(x, y, z)).getBlock() == Blocks.AIR) {
            world.setBlock(BlockPos.containing(x + 5.0, y, z + 5.0), Blocks.FIRE.defaultBlockState(), 3);
         }

         if (world.getBlockState(BlockPos.containing(x, y, z)).getBlock() == Blocks.AIR) {
            world.setBlock(BlockPos.containing(x, y, z), Blocks.FIRE.defaultBlockState(), 3);
         }

         if (world.getBlockState(BlockPos.containing(x + 1.0, y, z)).getBlock() == Blocks.AIR) {
            world.setBlock(BlockPos.containing(x + 1.0, y, z), Blocks.FIRE.defaultBlockState(), 3);
         }

         if (world.getBlockState(BlockPos.containing(x - 1.0, y, z)).getBlock() == Blocks.AIR) {
            world.setBlock(BlockPos.containing(x - 1.0, y, z), Blocks.FIRE.defaultBlockState(), 3);
         }

         if (world.getBlockState(BlockPos.containing(x + 3.0, y, z)).getBlock() == Blocks.AIR) {
            world.setBlock(BlockPos.containing(x + 3.0, y, z), Blocks.FIRE.defaultBlockState(), 3);
         }

         if (world.getBlockState(BlockPos.containing(x - 3.0, y, z)).getBlock() == Blocks.AIR) {
            world.setBlock(BlockPos.containing(x - 3.0, y, z), Blocks.FIRE.defaultBlockState(), 3);
         }

         if (world.getBlockState(BlockPos.containing(x - 5.0, y, z)).getBlock() == Blocks.AIR) {
            world.setBlock(BlockPos.containing(x - 5.0, y, z - 3.0), Blocks.FIRE.defaultBlockState(), 3);
         }

         if (world.getBlockState(BlockPos.containing(x + 5.0, y, z)).getBlock() == Blocks.AIR) {
            world.setBlock(BlockPos.containing(x + 5.0, y, z - 5.0), Blocks.FIRE.defaultBlockState(), 3);
         }

         if (world.getBlockState(BlockPos.containing(x + 4.0, y, z + 5.0)).getBlock() == Blocks.AIR) {
            world.setBlock(BlockPos.containing(x + 4.0, y, z + 5.0), Blocks.FIRE.defaultBlockState(), 3);
         }

         if (world.getBlockState(BlockPos.containing(x + 4.0, y, z + 5.0)).getBlock() == Blocks.AIR) {
            world.setBlock(BlockPos.containing(x + 4.0, y, z + 5.0), Blocks.FIRE.defaultBlockState(), 3);
         }
      });
   }
}

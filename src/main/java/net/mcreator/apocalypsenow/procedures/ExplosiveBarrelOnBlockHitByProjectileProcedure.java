package net.mcreator.apocalypsenow.procedures;

import net.mcreator.apocalypsenow.init.ApocalypsenowModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.Level.ExplosionInteraction;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;

public class ExplosiveBarrelOnBlockHitByProjectileProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z) {
      if (!(world instanceof ServerLevel level)) return;
      BlockPos position = BlockPos.containing(x, y, z);
      if (level.getBlockState(position).getBlock() != ApocalypsenowModBlocks.EXPLOSIVE_BARREL.get()) return;
      level.setBlock(position, Blocks.FIRE.defaultBlockState(), 3);
      if (level.random.nextFloat() < 0.9F) {
         level.explode(null, x + 0.5, y + 0.5, z + 0.5, 4.0F, ExplosionInteraction.TNT);
      }
   }
}

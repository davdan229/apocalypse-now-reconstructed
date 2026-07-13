package net.mcreator.apocalypsenow.procedures;

import net.mcreator.apocalypsenow.init.ApocalypsenowModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

public class PapertrashUpdateTickProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z) {
      if (world.getBlockState(BlockPos.containing(x, y - 1.0, z)).getBlock() == Blocks.AIR) {
         world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
         world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(ApocalypsenowModBlocks.PAPERTRASH.get().defaultBlockState()));
         if (world instanceof ServerLevel _level) {
            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ApocalypsenowModBlocks.PAPERTRASH.get()));
            entityToSpawn.setPickUpDelay(10);
            _level.addFreshEntity(entityToSpawn);
         }
      }
   }
}

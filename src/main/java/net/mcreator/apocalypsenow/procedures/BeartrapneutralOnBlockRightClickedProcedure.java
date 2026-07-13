package net.mcreator.apocalypsenow.procedures;

import net.mcreator.apocalypsenow.init.ApocalypsenowModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;

public class BeartrapneutralOnBlockRightClickedProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z) {
      if (world instanceof Level level && !level.isClientSide) {
         BlockPos pos = BlockPos.containing(x, y, z);
         var facing = level.getBlockState(pos).getValue(net.minecraft.world.level.block.HorizontalDirectionalBlock.FACING);
         level.setBlock(
            pos,
            ApocalypsenowModBlocks.BEAR_TRAP.get().defaultBlockState().setValue(net.minecraft.world.level.block.HorizontalDirectionalBlock.FACING, facing),
            3
         );
      }
   }
}

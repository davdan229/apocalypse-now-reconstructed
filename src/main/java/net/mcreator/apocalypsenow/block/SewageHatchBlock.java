package net.mcreator.apocalypsenow.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class SewageHatchBlock extends TrapDoorBlock {
   public SewageHatchBlock() {
      super(
         Properties.of()
            .sound(SoundType.METAL)
            .strength(1.0F, 5.0F)
            .requiresCorrectToolForDrops()
            .noOcclusion()
            .isRedstoneConductor((bs, br, bp) -> false)
            .dynamicShape(),
         BlockSetType.IRON
      );
   }

   @Override
   public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
      return 0;
   }
}

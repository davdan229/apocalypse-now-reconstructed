package net.mcreator.apocalypsenow.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class PackofcannedfoodBlock extends Block {
   public PackofcannedfoodBlock() {
      super(Properties.of().sound(SoundType.METAL).strength(1.0F, 5.0F).requiresCorrectToolForDrops());
   }

   @Override
   public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
      return 15;
   }
}

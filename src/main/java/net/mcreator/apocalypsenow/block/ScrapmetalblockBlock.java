package net.mcreator.apocalypsenow.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class ScrapmetalblockBlock extends Block {
   public ScrapmetalblockBlock() {
      super(Properties.of().sound(SoundType.METAL).strength(1.1F, 9.5F));
   }

   @Override
   public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
      return 15;
   }
}

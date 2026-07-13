package net.mcreator.apocalypsenow.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;

public class MossbricksBlock extends Block {
   public MossbricksBlock() {
      super(Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.STONE).strength(2.0F, 6.0F));
   }

   @Override
   public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
      return 15;
   }
}

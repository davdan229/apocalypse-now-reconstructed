package net.mcreator.apocalypsenow.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class VentblockBlock extends Block {
   public VentblockBlock() {
      super(Properties.of().sound(SoundType.METAL).strength(1.0F, 10.0F));
   }

   @Override
   public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
      return 15;
   }

   @Override
   public boolean isLadder(BlockState state, LevelReader world, BlockPos pos, LivingEntity entity) {
      return true;
   }
}

package net.mcreator.apocalypsenow.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class MoneyblockBlock extends Block {
   public MoneyblockBlock() {
      super(Properties.of().ignitedByLava().sound(SoundType.WOOL).strength(0.7F, 0.5F));
   }

   @Override
   public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
      return 15;
   }

   @Override
   public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
      return 20;
   }

   @Override
   public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
      return 5;
   }
}

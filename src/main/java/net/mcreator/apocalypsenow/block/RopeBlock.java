package net.mcreator.apocalypsenow.block;

import net.mcreator.apocalypsenow.procedures.RopeBlockAddedProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class RopeBlock extends IronBarsBlock {
   public RopeBlock() {
      super(Properties.of().ignitedByLava().sound(SoundType.WOOL).strength(1.0F, 4.0F).friction(0.7F).speedFactor(1.1F).jumpFactor(0.9F));
   }

   @Override
   public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
      return 0;
   }

   @Override
   public boolean isLadder(BlockState state, LevelReader world, BlockPos pos, LivingEntity entity) {
      return true;
   }

   @Override
   public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
      super.onPlace(blockstate, world, pos, oldState, moving);
      RopeBlockAddedProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
   }
}

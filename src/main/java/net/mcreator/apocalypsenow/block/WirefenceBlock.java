package net.mcreator.apocalypsenow.block;

import net.mcreator.apocalypsenow.procedures.WirefenceEntityCollidesInTheBlockProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class WirefenceBlock extends IronBarsBlock {
   public WirefenceBlock() {
      super(Properties.of().sound(SoundType.METAL).strength(1.15F, 8.5F).requiresCorrectToolForDrops());
   }

   @Override
   public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
      return 0;
   }

   @Override
   public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
      super.entityInside(blockstate, world, pos, entity);
      WirefenceEntityCollidesInTheBlockProcedure.execute(world, entity);
   }

   @Override
   public void stepOn(Level world, BlockPos pos, BlockState blockstate, Entity entity) {
      super.stepOn(world, pos, blockstate, entity);
      WirefenceEntityCollidesInTheBlockProcedure.execute(world, entity);
   }
}

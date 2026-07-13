package net.mcreator.apocalypsenow.block;

import net.mcreator.apocalypsenow.procedures.EletricfencePlayerStartsToDestroyProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class EletricfencesignBlock extends IronBarsBlock {
   public EletricfencesignBlock() {
      super(Properties.of().sound(SoundType.METAL).strength(1.0F, 5.0F).requiresCorrectToolForDrops());
   }

   @Override
   public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
      return 0;
   }

   @Override
   public void attack(BlockState blockstate, Level world, BlockPos pos, Player entity) {
      super.attack(blockstate, world, pos, entity);
      EletricfencePlayerStartsToDestroyProcedure.execute(world, entity);
   }

   @Override
   public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
      super.entityInside(blockstate, world, pos, entity);
      EletricfencePlayerStartsToDestroyProcedure.execute(world, entity);
   }

   @Override
   public void stepOn(Level world, BlockPos pos, BlockState blockstate, Entity entity) {
      super.stepOn(world, pos, blockstate, entity);
      EletricfencePlayerStartsToDestroyProcedure.execute(world, entity);
   }
}

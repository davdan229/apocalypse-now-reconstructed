package net.mcreator.apocalypsenow.block;

import net.mcreator.apocalypsenow.procedures.BarbewireEntityCollidesInTheBlockProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class BarbewireBlock extends Block {
   public BarbewireBlock() {
      super(
         Properties.of()
            .sound(SoundType.METAL)
            .strength(1.0F, 15.0F)
            .requiresCorrectToolForDrops()
            .noCollission()
            .friction(0.3F)
            .speedFactor(0.2F)
            .jumpFactor(0.8F)
            .noOcclusion()
            .isRedstoneConductor((bs, br, bp) -> false)
      );
   }

   @Override
   public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
      return true;
   }

   @Override
   public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
      return 0;
   }

   @Override
   public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
      return Shapes.empty();
   }

   @Override
   public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
      super.entityInside(blockstate, world, pos, entity);
      BarbewireEntityCollidesInTheBlockProcedure.execute(world, entity);
   }

   @Override
   public void stepOn(Level world, BlockPos pos, BlockState blockstate, Entity entity) {
      super.stepOn(world, pos, blockstate, entity);
      BarbewireEntityCollidesInTheBlockProcedure.execute(world, entity);
   }
}

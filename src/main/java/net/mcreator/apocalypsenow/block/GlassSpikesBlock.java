package net.mcreator.apocalypsenow.block;

import net.mcreator.apocalypsenow.procedures.SpikesonthegroundProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class GlassSpikesBlock extends Block {
   public GlassSpikesBlock() {
      super(
         Properties.of()
            .instrument(NoteBlockInstrument.HAT)
            .sound(SoundType.GLASS)
            .strength(1.0F, 5.0F)
            .noCollission()
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
   public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
      return box(0.0, 0.0, 0.0, 16.0, 6.0, 16.0);
   }

   @Override
   public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
      super.entityInside(blockstate, world, pos, entity);
      SpikesonthegroundProcedure.execute(world, entity);
   }

   @Override
   public void stepOn(Level world, BlockPos pos, BlockState blockstate, Entity entity) {
      super.stepOn(world, pos, blockstate, entity);
      SpikesonthegroundProcedure.execute(world, entity);
   }
}

package net.mcreator.apocalypsenow.block;

import net.mcreator.apocalypsenow.procedures.BeartrapEntityWalksOnTheBlockProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class BeartrapBlock extends Block {
   public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
   private static final VoxelShape SHAPE = box(1.7, 0.0, 1.8, 14.7, 3.6, 13.8);

   public BeartrapBlock() {
      super(
         Properties.of()
            .sound(SoundType.METAL)
            .strength(0.9F, 10.0F)
            .requiresCorrectToolForDrops()
            .noCollission()
            .noOcclusion()
            .isRedstoneConductor((bs, br, bp) -> false)
      );
      this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
   }

   @Override
   protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
      builder.add(FACING);
   }

   @Override
   public BlockState getStateForPlacement(BlockPlaceContext context) {
      return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
   }

   @Override
   public BlockState rotate(BlockState state, Rotation rotation) {
      return state.setValue(FACING, rotation.rotate(state.getValue(FACING)));
   }

   @Override
   public BlockState mirror(BlockState state, Mirror mirror) {
      return state.rotate(mirror.getRotation(state.getValue(FACING)));
   }

   @Override
   public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
      return true;
   }

   @Override
   public int getLightBlock(BlockState state, BlockGetter world, BlockPos pos) {
      return 0;
   }

   @Override
   public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
      return Shapes.empty();
   }

   @Override
   public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
      return SHAPE;
   }

   @Override
   public void entityInside(BlockState state, Level world, BlockPos pos, Entity entity) {
      super.entityInside(state, world, pos, entity);
      if (entity.getBoundingBox().intersects(SHAPE.bounds().move(pos))) {
         BeartrapEntityWalksOnTheBlockProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), entity);
      }
   }
}

package net.mcreator.apocalypsenow.block;

import net.mcreator.apocalypsenow.procedures.BarbewireEntityCollidesInTheBlockProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Direction.Axis;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FaceAttachedHorizontalDirectionalBlock;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.block.state.StateDefinition.Builder;
import net.minecraft.world.level.block.state.properties.AttachFace;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class SpikeswallBlock extends Block implements SimpleWaterloggedBlock {
   public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
   public static final EnumProperty<AttachFace> FACE = FaceAttachedHorizontalDirectionalBlock.FACE;
   public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

   public SpikeswallBlock() {
      super(
         Properties.of()
            .ignitedByLava()
            .instrument(NoteBlockInstrument.BASS)
            .sound(SoundType.WOOD)
            .strength(1.0F, 10.0F)
            .requiresCorrectToolForDrops()
            .noCollission()
            .noOcclusion()
            .isRedstoneConductor((bs, br, bp) -> false)
      );
      this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(FACE, AttachFace.WALL).setValue(WATERLOGGED, false));
   }

   @Override
   public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
      return state.getFluidState().isEmpty();
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
      return switch ((Direction)state.getValue(FACING)) {
         case NORTH -> {
            switch ((AttachFace)state.getValue(FACE)) {
               case FLOOR:
                  yield box(1.0, 0.0, 1.0, 16.0, 16.0, 16.0);
               case WALL:
                  yield box(1.0, 1.0, 0.0, 16.0, 16.0, 16.0);
               case CEILING:
                  yield box(0.0, 0.0, 1.0, 15.0, 16.0, 16.0);
               default:
                  throw new IncompatibleClassChangeError();
            }
         }
         case EAST -> {
            switch ((AttachFace)state.getValue(FACE)) {
               case FLOOR:
                  yield box(0.0, 0.0, 1.0, 15.0, 16.0, 16.0);
               case WALL:
                  yield box(0.0, 1.0, 1.0, 16.0, 16.0, 16.0);
               case CEILING:
                  yield box(0.0, 0.0, 0.0, 15.0, 16.0, 15.0);
               default:
                  throw new IncompatibleClassChangeError();
            }
         }
         case WEST -> {
            switch ((AttachFace)state.getValue(FACE)) {
               case FLOOR:
                  yield box(1.0, 0.0, 0.0, 16.0, 16.0, 15.0);
               case WALL:
                  yield box(0.0, 1.0, 0.0, 16.0, 16.0, 15.0);
               case CEILING:
                  yield box(1.0, 0.0, 1.0, 16.0, 16.0, 16.0);
               default:
                  throw new IncompatibleClassChangeError();
            }
         }
         default -> {
            switch ((AttachFace)state.getValue(FACE)) {
                case FLOOR:
                   yield box(0.0, 0.0, 0.0, 15.0, 16.0, 15.0);
                case WALL:
                   yield box(0.0, 1.0, 0.0, 15.0, 16.0, 16.0);
                case CEILING:
                   yield box(1.0, 0.0, 0.0, 16.0, 16.0, 15.0);
                default:
                   throw new IncompatibleClassChangeError();
            }
         }
      };
   }

   @Override
   protected void createBlockStateDefinition(Builder<Block, BlockState> builder) {
      builder.add(FACING, FACE, WATERLOGGED);
   }

   @Override
   public BlockState getStateForPlacement(BlockPlaceContext context) {
      boolean flag = context.getLevel().getFluidState(context.getClickedPos()).getType() == Fluids.WATER;
      return this.defaultBlockState()
         .setValue(FACE, this.faceForDirection(context.getNearestLookingDirection()))
         .setValue(FACING, context.getHorizontalDirection().getOpposite())
         .setValue(WATERLOGGED, flag);
   }

   @Override
   public BlockState rotate(BlockState state, Rotation rot) {
      return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
   }

   @Override
   public BlockState mirror(BlockState state, Mirror mirrorIn) {
      return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
   }

   private AttachFace faceForDirection(Direction direction) {
      if (direction.getAxis() == Axis.Y) {
         return direction == Direction.UP ? AttachFace.CEILING : AttachFace.FLOOR;
      } else {
         return AttachFace.WALL;
      }
   }

   @Override
   public FluidState getFluidState(BlockState state) {
      return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
   }

   @Override
   public BlockState updateShape(BlockState state, Direction facing, BlockState facingState, LevelAccessor world, BlockPos currentPos, BlockPos facingPos) {
      if (state.getValue(WATERLOGGED)) {
         world.scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickDelay(world));
      }

      return super.updateShape(state, facing, facingState, world, currentPos, facingPos);
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

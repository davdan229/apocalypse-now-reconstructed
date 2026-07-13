package net.mcreator.apocalypsenow.block;

import net.mcreator.apocalypsenow.procedures.BeartrapneutralOnBlockRightClickedProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
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
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class BeartrapneutralBlock extends Block {
   public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
   private static final VoxelShape SHAPE = box(1.7, 0.0, 5.3, 14.7, 4.1, 10.3);
   private static final VoxelShape ROTATED_SHAPE = box(5.3, 0.0, 1.3, 10.3, 4.1, 14.3);

   public BeartrapneutralBlock() {
      super(
         Properties.of()
            .sound(SoundType.METAL)
            .strength(0.9F, 10.0F)
            .requiresCorrectToolForDrops()
            .noCollission()
            .jumpFactor(0.1F)
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
      return state.getValue(FACING).getAxis() == Direction.Axis.X ? ROTATED_SHAPE : SHAPE;
   }

   @Override
   public InteractionResult use(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
      BeartrapneutralOnBlockRightClickedProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
      return InteractionResult.sidedSuccess(world.isClientSide);
   }
}

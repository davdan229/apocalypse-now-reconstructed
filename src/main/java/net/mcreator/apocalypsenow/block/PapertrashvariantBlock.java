package net.mcreator.apocalypsenow.block;

import net.mcreator.apocalypsenow.init.ApocalypsenowModBlocks;
import net.mcreator.apocalypsenow.procedures.PapertrashUpdateTickProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.block.state.StateDefinition.Builder;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class PapertrashvariantBlock extends Block {
   public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

   public PapertrashvariantBlock() {
      super(
         Properties.of()
            .ignitedByLava()
            .sound(SoundType.WOOL)
            .strength(0.1F, 0.5F)
            .noCollission()
            .noOcclusion()
            .pushReaction(PushReaction.DESTROY)
            .isRedstoneConductor((bs, br, bp) -> false)
      );
      this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
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
      return switch ((Direction)state.getValue(FACING)) {
         case NORTH -> box(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
         case EAST -> box(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
         case WEST -> box(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
         default -> box(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
      };
   }

   @Override
   protected void createBlockStateDefinition(Builder<Block, BlockState> builder) {
      builder.add(FACING);
   }

   @Override
   public BlockState getStateForPlacement(BlockPlaceContext context) {
      return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
   }

   @Override
   public BlockState rotate(BlockState state, Rotation rot) {
      return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
   }

   @Override
   public BlockState mirror(BlockState state, Mirror mirrorIn) {
      return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
   }

   @Override
   public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
      return 10;
   }

   @Override
   public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
      return 2;
   }

   @Override
   public ItemStack getCloneItemStack(BlockState state, HitResult target, BlockGetter world, BlockPos pos, Player player) {
      return new ItemStack(ApocalypsenowModBlocks.PAPERTRASH.get());
   }

   @Override
   public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
      super.onPlace(blockstate, world, pos, oldState, moving);
      world.scheduleTick(pos, this, 1);
   }

   @Override
   public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
      super.tick(blockstate, world, pos, random);
      int x = pos.getX();
      int y = pos.getY();
      int z = pos.getZ();
      PapertrashUpdateTickProcedure.execute(world, x, y, z);
      world.scheduleTick(pos, this, 1);
   }
}

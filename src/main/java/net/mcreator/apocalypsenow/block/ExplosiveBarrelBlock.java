package net.mcreator.apocalypsenow.block;

import net.mcreator.apocalypsenow.procedures.ExplosiveBarrelOnBlockHitByProjectileProcedure;
import net.mcreator.apocalypsenow.procedures.ExplosiveBarrelUpdateTickProcedure;
import net.mcreator.apocalypsenow.procedures.LandmineBlockDestroyedByExplosionProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Explosion;
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
import net.minecraft.world.phys.BlockHitResult;

public class ExplosiveBarrelBlock extends Block {
   public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

   public ExplosiveBarrelBlock() {
      super(Properties.of().sound(SoundType.METAL).strength(1.0F).requiresCorrectToolForDrops());
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
   public void onPlace(BlockState state, Level world, BlockPos pos, BlockState oldState, boolean moving) {
      super.onPlace(state, world, pos, oldState, moving);
      if (!world.isClientSide()) {
         world.scheduleTick(pos, this, 60);
      }
   }

   @Override
   public void neighborChanged(BlockState state, Level world, BlockPos pos, Block neighborBlock, BlockPos neighborPos, boolean moving) {
      super.neighborChanged(state, world, pos, neighborBlock, neighborPos, moving);
      if (!world.isClientSide()) {
         world.scheduleTick(pos, this, 60);
      }
   }

   @Override
   public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
      super.tick(blockstate, world, pos, random);
      ExplosiveBarrelUpdateTickProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
   }

   @Override
   public void wasExploded(Level world, BlockPos pos, Explosion e) {
      super.wasExploded(world, pos, e);
      LandmineBlockDestroyedByExplosionProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
   }

   @Override
   public void onProjectileHit(Level world, BlockState blockstate, BlockHitResult hit, Projectile entity) {
      ExplosiveBarrelOnBlockHitByProjectileProcedure.execute(world, hit.getBlockPos().getX(), hit.getBlockPos().getY(), hit.getBlockPos().getZ());
   }
}

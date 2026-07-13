package net.mcreator.apocalypsenow.block;

import net.mcreator.apocalypsenow.procedures.LandmineBlockDestroyedByExplosionProcedure;
import net.mcreator.apocalypsenow.procedures.LandmineBlockDestroyedByPlayerProcedure;
import net.mcreator.apocalypsenow.procedures.LandmineEntityWalksOnTheBlockProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class LandmineBlock extends Block {
   public LandmineBlock() {
      super(
         Properties.of()
            .sound(SoundType.METAL)
            .strength(1.0F, 2.0F)
            .requiresCorrectToolForDrops()
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
      return Shapes.or(
         box(7.0, 2.0, 7.0, 9.0, 3.0, 9.0),
         box(5.0, 0.0, 5.0, 11.0, 2.0, 11.0),
         box(11.0, 0.0, 6.0, 12.0, 2.0, 10.0),
         box(4.0, 0.0, 6.0, 5.0, 2.0, 10.0),
         box(6.0, 0.0, 4.0, 10.0, 2.0, 5.0),
         box(6.0, 0.0, 11.0, 10.0, 2.0, 12.0)
      );
   }

   @Override
   public void neighborChanged(BlockState blockstate, Level world, BlockPos pos, Block neighborBlock, BlockPos fromPos, boolean moving) {
      super.neighborChanged(blockstate, world, pos, neighborBlock, fromPos, moving);
      if (world.getBestNeighborSignal(pos) > 0) {
         LandmineEntityWalksOnTheBlockProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
      }
   }

   @Override
   public boolean onDestroyedByPlayer(BlockState blockstate, Level world, BlockPos pos, Player entity, boolean willHarvest, FluidState fluid) {
      boolean retval = super.onDestroyedByPlayer(blockstate, world, pos, entity, willHarvest, fluid);
      LandmineBlockDestroyedByPlayerProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
      return retval;
   }

   @Override
   public void wasExploded(Level world, BlockPos pos, Explosion e) {
      super.wasExploded(world, pos, e);
      LandmineBlockDestroyedByExplosionProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
   }

   @Override
   public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
      super.entityInside(blockstate, world, pos, entity);
      LandmineEntityWalksOnTheBlockProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
   }

   @Override
   public void stepOn(Level world, BlockPos pos, BlockState blockstate, Entity entity) {
      super.stepOn(world, pos, blockstate, entity);
      LandmineEntityWalksOnTheBlockProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
   }

   @Override
   public void onProjectileHit(Level world, BlockState blockstate, BlockHitResult hit, Projectile entity) {
      LandmineEntityWalksOnTheBlockProcedure.execute(world, hit.getBlockPos().getX(), hit.getBlockPos().getY(), hit.getBlockPos().getZ());
   }
}

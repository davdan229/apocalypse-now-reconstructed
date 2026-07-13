package net.mcreator.apocalypsenow.block;

import net.mcreator.apocalypsenow.procedures.LeavesTrapEntityWalksOnTheBlockProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class LeavesTrapBlock extends Block {
   public LeavesTrapBlock() {
      super(
         Properties.of()
            .ignitedByLava()
            .sound(SoundType.AZALEA_LEAVES)
            .strength(1.0F, 2.0F)
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
   public BlockPathTypes getBlockPathType(BlockState state, BlockGetter world, BlockPos pos, Mob entity) {
      return BlockPathTypes.LEAVES;
   }

   @Override
   public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
      super.entityInside(blockstate, world, pos, entity);
      LeavesTrapEntityWalksOnTheBlockProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
   }

   @Override
   public void stepOn(Level world, BlockPos pos, BlockState blockstate, Entity entity) {
      super.stepOn(world, pos, blockstate, entity);
      LeavesTrapEntityWalksOnTheBlockProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
   }

   @Override
   public void onProjectileHit(Level world, BlockState blockstate, BlockHitResult hit, Projectile entity) {
      LeavesTrapEntityWalksOnTheBlockProcedure.execute(world, hit.getBlockPos().getX(), hit.getBlockPos().getY(), hit.getBlockPos().getZ());
   }
}

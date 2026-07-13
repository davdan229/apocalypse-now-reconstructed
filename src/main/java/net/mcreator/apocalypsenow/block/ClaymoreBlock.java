package net.mcreator.apocalypsenow.block;

import net.mcreator.apocalypsenow.procedures.LandmineBlockDestroyedByExplosionProcedure;
import net.mcreator.apocalypsenow.procedures.LandmineBlockDestroyedByPlayerProcedure;
import net.mcreator.apocalypsenow.procedures.TripwirebombRedstoneOnProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class ClaymoreBlock extends Block {
   public ClaymoreBlock() {
      super(Properties.of().sound(SoundType.METAL).strength(1.0F, 2.0F).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
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
   public void neighborChanged(BlockState blockstate, Level world, BlockPos pos, Block neighborBlock, BlockPos fromPos, boolean moving) {
      super.neighborChanged(blockstate, world, pos, neighborBlock, fromPos, moving);
      if (world.getBestNeighborSignal(pos) > 0) {
         TripwirebombRedstoneOnProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
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
}

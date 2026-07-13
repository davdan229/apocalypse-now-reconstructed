package net.mcreator.apocalypsenow.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.registries.ForgeRegistries;

public class TrashbagblueplasticBlock extends Block {
   public TrashbagblueplasticBlock() {
      super(
         Properties.of()
            .ignitedByLava()
            .sound(
               new ForgeSoundType(
                  1.0F,
                  1.0F,
                  () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wool.break")),
                  () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("apocalypsenow:trash_walk")),
                  () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("apocalypsenow:trash_place")),
                  () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wool.hit")),
                  () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("apocalypsenow:trash_place"))
               )
            )
            .strength(1.0F)
            .noOcclusion()
            .isRedstoneConductor((bs, br, bp) -> false)
      );
   }

   @Override
   public boolean skipRendering(BlockState state, BlockState adjacentBlockState, Direction side) {
      return adjacentBlockState.getBlock() == this ? true : super.skipRendering(state, adjacentBlockState, side);
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
}

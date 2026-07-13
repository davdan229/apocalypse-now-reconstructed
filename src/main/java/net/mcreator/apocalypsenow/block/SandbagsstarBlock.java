package net.mcreator.apocalypsenow.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;

public class SandbagsstarBlock extends StairBlock {
   public SandbagsstarBlock() {
      super(
         () -> Blocks.AIR.defaultBlockState(),
         Properties.of()
            .instrument(NoteBlockInstrument.SNARE)
            .mapColor(MapColor.SAND)
            .sound(SoundType.SAND)
            .strength(1.1F, 12.0F)
            .requiresCorrectToolForDrops()
            .dynamicShape()
      );
   }

   @Override
   public float getExplosionResistance() {
      return 12.0F;
   }

   @Override
   public boolean isRandomlyTicking(BlockState state) {
      return false;
   }

   @Override
   public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
      return 0;
   }
}

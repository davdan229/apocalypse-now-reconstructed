package net.mcreator.apocalypsenow.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;

public class SandbagsBlock extends FallingBlock {
   public SandbagsBlock() {
      super(
         Properties.of()
            .instrument(NoteBlockInstrument.SNARE)
            .mapColor(MapColor.SAND)
            .sound(SoundType.SAND)
            .strength(1.1F, 12.0F)
            .requiresCorrectToolForDrops()
      );
   }

   @Override
   public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
      return 15;
   }
}

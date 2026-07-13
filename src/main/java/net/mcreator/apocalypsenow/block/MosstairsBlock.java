package net.mcreator.apocalypsenow.block;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;

public class MosstairsBlock extends StairBlock {
   public MosstairsBlock() {
      super(
         () -> Blocks.AIR.defaultBlockState(),
         Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.STONE).strength(2.0F, 6.0F).dynamicShape()
      );
   }

   @Override
   public float getExplosionResistance() {
      return 6.0F;
   }

   @Override
   public boolean isRandomlyTicking(BlockState state) {
      return false;
   }
}

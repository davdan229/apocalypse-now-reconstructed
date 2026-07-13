package net.mcreator.apocalypsenow.block;

import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;

public class MossbrickslabBlock extends SlabBlock {
   public MossbrickslabBlock() {
      super(Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.STONE).strength(2.0F, 6.0F).dynamicShape());
   }
}

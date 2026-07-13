package net.mcreator.apocalypsenow.block;

import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class PackofcannedmelonBlock extends SlabBlock {
   public PackofcannedmelonBlock() {
      super(Properties.of().sound(SoundType.METAL).strength(1.0F, 2.0F).requiresCorrectToolForDrops().dynamicShape());
   }
}

package net.mcreator.apocalypsenow.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;

public class ReiforcedwooddoorBlock extends DoorBlock {
   public ReiforcedwooddoorBlock() {
      super(
         Properties.of()
            .ignitedByLava()
            .instrument(NoteBlockInstrument.BASS)
            .sound(SoundType.WOOD)
            .strength(5.0F, 15.0F)
            .requiresCorrectToolForDrops()
            .noOcclusion()
            .isRedstoneConductor((bs, br, bp) -> false)
            .dynamicShape(),
         BlockSetType.OAK
      );
   }

   @Override
   public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
      return 0;
   }
}

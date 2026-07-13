package net.mcreator.apocalypsenow.procedures;

import net.mcreator.apocalypsenow.init.ApocalypsenowModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.level.LevelAccessor;

public class RainCollectorUpdateTickProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z) {
      if (!(world instanceof ServerLevel level)) return;
      BlockPos position = BlockPos.containing(x, y, z);
      if (!level.isRaining() || !level.canSeeSkyFromBelowWater(position)
         || !level.getBlockState(position).is(ApocalypsenowModBlocks.RAIN_COLLECTOR.get())
         || level.random.nextFloat() >= 0.2F) return;
      level.setBlock(position, ApocalypsenowModBlocks.RAIN_COLLECTOR_FULL.get().defaultBlockState(), 3);
      level.playSound(null, position, SoundEvents.BUCKET_FILL, SoundSource.BLOCKS, 1.0F, 1.0F);
   }
}

package net.mcreator.apocalypsenow.procedures;

import net.mcreator.apocalypsenow.configuration.ApocalypsenowconfigurationConfiguration;
import net.minecraft.core.BlockPos;
import net.minecraft.world.Difficulty;
import net.minecraft.world.level.LevelAccessor;

public class HordesgameruleProcedure {
   public static boolean execute(LevelAccessor world, double x, double y, double z) {
      return ApocalypsenowconfigurationConfiguration.HORDES_SPAWN.get()
         && ApocalypsenowconfigurationConfiguration.WALKERS_RUNNERS_SPAWN.get()
         && world.getMaxLocalRawBrightness(BlockPos.containing(x, y, z)) == 0
         && world.getDifficulty() == Difficulty.HARD;
   }
}

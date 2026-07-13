package net.mcreator.apocalypsenow.procedures;

import java.util.Calendar;
import net.mcreator.apocalypsenow.configuration.ApocalypsenowconfigurationConfiguration;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelAccessor;

public class EasterbunnywalkerProcedure {
   public static boolean execute(LevelAccessor world, double x, double y, double z) {
      return Calendar.getInstance().get(2) == 3
         && world.getMaxLocalRawBrightness(BlockPos.containing(x, y, z)) == 0
         && ApocalypsenowconfigurationConfiguration.WALKERS_RUNNERS_SPAWN.get();
   }
}

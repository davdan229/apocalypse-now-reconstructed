package net.mcreator.apocalypsenow.procedures;

import java.util.Calendar;
import net.mcreator.apocalypsenow.configuration.ApocalypsenowconfigurationConfiguration;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelAccessor;

public class SantaclauswalkerProcedure {
   public static boolean execute(LevelAccessor world, double x, double y, double z) {
      return Calendar.getInstance().get(5) >= 25
         && Calendar.getInstance().get(2) == 12
         && world.getBlockState(BlockPos.containing(x, y, z)).getLightEmission(world, BlockPos.containing(x, y, z)) == 0
         && ApocalypsenowconfigurationConfiguration.WALKERS_RUNNERS_SPAWN.get();
   }
}

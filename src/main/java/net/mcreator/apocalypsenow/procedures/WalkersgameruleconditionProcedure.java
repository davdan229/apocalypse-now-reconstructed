package net.mcreator.apocalypsenow.procedures;

import net.mcreator.apocalypsenow.configuration.ApocalypsenowconfigurationConfiguration;
import net.minecraft.core.BlockPos;
import net.minecraft.world.Difficulty;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.WorldGenLevel;

public class WalkersgameruleconditionProcedure {
   public static boolean execute(LevelAccessor world, double x, double y, double z) {
      return ApocalypsenowconfigurationConfiguration.WALKERS_SPAWN.get()
         && world.getDifficulty() != Difficulty.PEACEFUL
         && world.getMaxLocalRawBrightness(BlockPos.containing(x, y, z)) == 0
         && Level.OVERWORLD.equals(
            world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)
         )
         && ApocalypsenowconfigurationConfiguration.WALKERS_RUNNERS_SPAWN.get();
   }
}

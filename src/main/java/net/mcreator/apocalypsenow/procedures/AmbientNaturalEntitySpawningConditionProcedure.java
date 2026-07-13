package net.mcreator.apocalypsenow.procedures;

import net.mcreator.apocalypsenow.configuration.ApocalypsenowconfigurationConfiguration;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.WorldGenLevel;

public class AmbientNaturalEntitySpawningConditionProcedure {
   public static boolean execute(LevelAccessor world) {
      Level level = world instanceof Level direct ? direct : (world instanceof WorldGenLevel generated ? generated.getLevel() : null);
      return level != null
         && Level.OVERWORLD.equals(level.dimension())
         && ApocalypsenowconfigurationConfiguration.AMBIENT_SPAWN.get();
   }
}

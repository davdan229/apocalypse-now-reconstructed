package net.mcreator.apocalypsenow.procedures;

import net.mcreator.apocalypsenow.configuration.ApocalypsenowconfigurationConfiguration;

public class BleedingActiveTickConditionProcedure {
   public static boolean execute() {
      return ApocalypsenowconfigurationConfiguration.ENABLES_ALL_EFFECTS.get() && ApocalypsenowconfigurationConfiguration.BLEEDING_EFFECT.get();
   }
}

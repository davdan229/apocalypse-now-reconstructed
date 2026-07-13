package net.mcreator.apocalypsenow.procedures;

import net.mcreator.apocalypsenow.init.ApocalypsenowModParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.LevelAccessor;

public class SpraypeppergasWhileProjectileFlyingTickProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z) {
      if (world instanceof ServerLevel _level) {
         _level.sendParticles(ApocalypsenowModParticleTypes.SMOKE_2.get(), x, y, z, 5, 0.1, 0.1, 0.1, 0.5);
      }
   }
}

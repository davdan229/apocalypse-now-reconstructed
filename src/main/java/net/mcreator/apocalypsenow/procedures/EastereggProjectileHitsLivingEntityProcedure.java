package net.mcreator.apocalypsenow.procedures;

import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.LevelAccessor;

public class EastereggProjectileHitsLivingEntityProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z) {
      if (world instanceof ServerLevel _level) {
         _level.sendParticles(ParticleTypes.WAX_ON, x, y, z, 30, 2.0, 2.0, 2.0, 1.0);
      }
   }
}

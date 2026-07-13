package net.mcreator.apocalypsenow.procedures;

import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level.ExplosionInteraction;

public class DynamiteBulletHitsBlockProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z) {
      if (world instanceof Level _level && !_level.isClientSide()) {
         _level.explode(null, x, y, z, 9.0F, ExplosionInteraction.TNT);
      }

      world.addParticle(ParticleTypes.EXPLOSION, x, y, z, 0.0, 1.0, 0.0);
      world.addParticle(ParticleTypes.LARGE_SMOKE, x, y, z, 0.0, 1.0, 0.0);
      world.addParticle(ParticleTypes.CAMPFIRE_SIGNAL_SMOKE, x, y, z, 0.0, 1.0, 0.0);
   }
}

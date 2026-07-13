package net.mcreator.apocalypsenow.procedures;

import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.level.LevelAccessor;

public class CoktelmolotovvWhileBulletFlyingTickProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z) {
      world.addParticle(ParticleTypes.SMOKE, x, y, z, 0.0, 1.0, 0.0);
      world.addParticle(ParticleTypes.FLAME, x, y, z, 0.0, 1.0, 0.0);
   }
}

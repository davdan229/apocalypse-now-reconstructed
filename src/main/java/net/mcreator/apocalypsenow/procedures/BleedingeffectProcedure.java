package net.mcreator.apocalypsenow.procedures;

import net.mcreator.apocalypsenow.init.ApocalypsenowModParticleTypes;
import net.minecraft.core.registries.Registries;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;

public class BleedingeffectProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
      if (entity != null) {
         if (Math.random() < 0.2 && world instanceof ServerLevel _level) {
            _level.sendParticles(ApocalypsenowModParticleTypes.BLOOD.get(), x + 0.2, y, z + 0.1, 4, -0.2, 0.5, 0.2, 0.2);
         }

         if (Math.random() < 0.5) {
            entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)), 0.2F);
         }
      }
   }
}

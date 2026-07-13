package net.mcreator.apocalypsenow.procedures;

import net.mcreator.apocalypsenow.configuration.ApocalypsenowconfigurationConfiguration;
import net.mcreator.apocalypsenow.init.ApocalypsenowModMobEffects;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level.ExplosionInteraction;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

public class ImprovisedgrenadeBulletHitsBlockProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z, Entity projectile) {
      if (!(world instanceof ServerLevel level) || projectile == null) {
         return;
      }
      level.explode(projectile, x, y, z, 2.0F, ExplosionInteraction.TNT);
      Vec3 center = new Vec3(x, y, z);
      for (LivingEntity target : level.getEntitiesOfClass(LivingEntity.class, new AABB(center, center).inflate(4.0), LivingEntity::isAlive)) {
         if (ApocalypsenowconfigurationConfiguration.ENABLES_ALL_EFFECTS.get()
            && ApocalypsenowconfigurationConfiguration.BLEEDING_EFFECT.get()) {
            target.addEffect(new MobEffectInstance(ApocalypsenowModMobEffects.BLEEDING.get(), 60, 1, false, false));
         }
         target.hurt(level.damageSources().generic(), 3.0F);
      }
   }
}

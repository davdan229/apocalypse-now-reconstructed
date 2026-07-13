package net.mcreator.apocalypsenow.procedures;

import net.mcreator.apocalypsenow.configuration.ApocalypsenowconfigurationConfiguration;
import net.mcreator.apocalypsenow.init.ApocalypsenowModMobEffects;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

public class ToxicwastebarrelOnTickUpdateProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z) {
      if (!(world instanceof ServerLevel level)
         || !ApocalypsenowconfigurationConfiguration.RADIATION_EFFECT.get()
         || !ApocalypsenowconfigurationConfiguration.ENABLES_ALL_EFFECTS.get()) {
         return;
      }
      Vec3 center = new Vec3(x, y, z);
      for (LivingEntity target : level.getEntitiesOfClass(LivingEntity.class, new AABB(center, center).inflate(3.0), LivingEntity::isAlive)) {
         target.addEffect(new MobEffectInstance(ApocalypsenowModMobEffects.RADIATIONSICKNESS.get(), 20, 1, false, false));
      }
   }
}

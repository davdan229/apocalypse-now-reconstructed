package net.mcreator.apocalypsenow.procedures;

import net.mcreator.apocalypsenow.configuration.ApocalypsenowconfigurationConfiguration;
import net.mcreator.apocalypsenow.init.ApocalypsenowModMobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.LevelAccessor;

public class BiteEffectExpiresProcedure {
   public static void execute(LevelAccessor world, Entity entity) {
      if (ApocalypsenowconfigurationConfiguration.ZOMBIFICATION_EFFECT.get()
         && entity instanceof LivingEntity living
         && !living.level().isClientSide()
         && living.isAlive()) {
         living.addEffect(new MobEffectInstance(ApocalypsenowModMobEffects.ZOMBIFICATION.get(), 9999, 0, false, false));
      }
   }
}

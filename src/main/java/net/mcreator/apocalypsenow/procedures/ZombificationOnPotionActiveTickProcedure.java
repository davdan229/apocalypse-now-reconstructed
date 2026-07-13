package net.mcreator.apocalypsenow.procedures;

import net.mcreator.apocalypsenow.init.ApocalypsenowModMobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.LevelAccessor;

public class ZombificationOnPotionActiveTickProcedure {
   public static void execute(LevelAccessor world, Entity entity) {
      if (!(entity instanceof LivingEntity living) || living.level().isClientSide()) {
         return;
      }
      MobEffectInstance zombification = living.getEffect(ApocalypsenowModMobEffects.ZOMBIFICATION.get());
      if (zombification == null) {
         return;
      }
      if (zombification.getDuration() <= 1) {
         living.hurt(living.damageSources().generic(), 500.0F);
         return;
      }
      living.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 40, 1, false, false));
      living.addEffect(new MobEffectInstance(MobEffects.HUNGER, 40, 1, false, false));
   }
}

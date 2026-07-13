package net.mcreator.apocalypsenow.procedures;

import net.mcreator.apocalypsenow.init.ApocalypsenowModMobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;

public class RednightvisioneffectOnEffectActiveTickProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide()) {
            _entity.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 3, 1, false, false));
         }

         if (!(entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(ApocalypsenowModMobEffects.PLACEHOLDERCIVILIANEFFECT.get()))
            && entity instanceof LivingEntity _entity) {
            _entity.removeEffect(ApocalypsenowModMobEffects.REDNIGHTVISIONEFFECT.get());
         }
      }
   }
}

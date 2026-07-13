package net.mcreator.apocalypsenow.potion;

import net.mcreator.apocalypsenow.procedures.BleedingeffectProcedure;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

public class BleedingMobEffect extends MobEffect {
   public BleedingMobEffect() {
      super(MobEffectCategory.HARMFUL, -6750208);
   }

   @Override
   public void applyEffectTick(LivingEntity entity, int amplifier) {
      BleedingeffectProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
   }

   @Override
   public boolean isDurationEffectTick(int duration, int amplifier) {
      return true;
   }
}

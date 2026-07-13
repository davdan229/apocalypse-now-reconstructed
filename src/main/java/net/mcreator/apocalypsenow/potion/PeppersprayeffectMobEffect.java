package net.mcreator.apocalypsenow.potion;

import net.mcreator.apocalypsenow.procedures.SprayclickedProcedure;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

public class PeppersprayeffectMobEffect extends MobEffect {
   public PeppersprayeffectMobEffect() {
      super(MobEffectCategory.HARMFUL, -65536);
   }

   @Override
   public void applyEffectTick(LivingEntity entity, int amplifier) {
      SprayclickedProcedure.execute(entity);
   }

   @Override
   public boolean isDurationEffectTick(int duration, int amplifier) {
      return true;
   }
}

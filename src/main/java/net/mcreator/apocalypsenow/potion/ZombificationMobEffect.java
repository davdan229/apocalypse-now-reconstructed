package net.mcreator.apocalypsenow.potion;

import net.mcreator.apocalypsenow.procedures.ZombificationOnPotionActiveTickProcedure;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

public class ZombificationMobEffect extends MobEffect {
   public ZombificationMobEffect() {
      super(MobEffectCategory.HARMFUL, -6750208);
   }

   @Override
   public void applyEffectTick(LivingEntity entity, int amplifier) {
      ZombificationOnPotionActiveTickProcedure.execute(entity.level(), entity);
   }

   @Override
   public boolean isDurationEffectTick(int duration, int amplifier) {
      return duration <= 1 || duration % 20 == 0;
   }
}

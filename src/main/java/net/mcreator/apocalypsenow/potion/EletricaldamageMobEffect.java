package net.mcreator.apocalypsenow.potion;

import net.mcreator.apocalypsenow.procedures.EletricaldamageOnPotionActiveTickProcedure;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

public class EletricaldamageMobEffect extends MobEffect {
   public EletricaldamageMobEffect() {
      super(MobEffectCategory.HARMFUL, -15138608);
   }

   @Override
   public void applyEffectTick(LivingEntity entity, int amplifier) {
      EletricaldamageOnPotionActiveTickProcedure.execute(entity.level(), entity);
   }

   @Override
   public boolean isDurationEffectTick(int duration, int amplifier) {
      return true;
   }
}

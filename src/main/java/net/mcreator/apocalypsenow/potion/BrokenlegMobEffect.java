package net.mcreator.apocalypsenow.potion;

import net.mcreator.apocalypsenow.procedures.BrokenlegEffectExpiresProcedure;
import net.mcreator.apocalypsenow.procedures.BrokenlegOnPotionActiveTickProcedure;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeMap;

public class BrokenlegMobEffect extends MobEffect {
   public BrokenlegMobEffect() {
      super(MobEffectCategory.NEUTRAL, -1);
   }

   @Override
   public void applyEffectTick(LivingEntity entity, int amplifier) {
      BrokenlegOnPotionActiveTickProcedure.execute(entity.level(), entity);
   }

   @Override
   public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
      super.removeAttributeModifiers(entity, attributeMap, amplifier);
      BrokenlegEffectExpiresProcedure.execute(entity.level(), entity);
   }

   @Override
   public boolean isDurationEffectTick(int duration, int amplifier) {
      return true;
   }
}

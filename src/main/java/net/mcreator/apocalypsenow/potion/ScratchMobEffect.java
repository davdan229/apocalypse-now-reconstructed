package net.mcreator.apocalypsenow.potion;

import net.mcreator.apocalypsenow.procedures.ScratchEffectExpiresProcedure;
import net.mcreator.apocalypsenow.procedures.ScratchEffectStartedappliedProcedure;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeMap;

public class ScratchMobEffect extends MobEffect {
   public ScratchMobEffect() {
      super(MobEffectCategory.HARMFUL, -3407821);
   }

   @Override
   public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
      ScratchEffectStartedappliedProcedure.execute(entity);
   }

   @Override
   public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
      super.removeAttributeModifiers(entity, attributeMap, amplifier);
      ScratchEffectExpiresProcedure.execute(entity.level(), entity);
   }

   @Override
   public boolean isDurationEffectTick(int duration, int amplifier) {
      return true;
   }
}

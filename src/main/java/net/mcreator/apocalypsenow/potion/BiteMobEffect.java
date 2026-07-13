package net.mcreator.apocalypsenow.potion;

import net.mcreator.apocalypsenow.procedures.BiteEffectExpiresProcedure;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeMap;

public class BiteMobEffect extends MobEffect {
   public BiteMobEffect() {
      super(MobEffectCategory.HARMFUL, -12892672);
   }

   @Override
   public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
      super.removeAttributeModifiers(entity, attributeMap, amplifier);
      BiteEffectExpiresProcedure.execute(entity.level(), entity);
   }

   @Override
   public boolean isDurationEffectTick(int duration, int amplifier) {
      return true;
   }
}

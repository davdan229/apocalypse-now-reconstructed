package net.mcreator.apocalypsenow.potion;

import net.mcreator.apocalypsenow.procedures.PainEffectExpiresProcedure;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeMap;

public class PainMobEffect extends MobEffect {
   public PainMobEffect() {
      super(MobEffectCategory.HARMFUL, -6602240);
   }

   @Override
   public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
      super.removeAttributeModifiers(entity, attributeMap, amplifier);
      PainEffectExpiresProcedure.execute(entity.level(), entity);
   }

   @Override
   public boolean isDurationEffectTick(int duration, int amplifier) {
      return false;
   }
}

package net.mcreator.apocalypsenow.potion;

import net.mcreator.apocalypsenow.procedures.InfectionEffectExpiresProcedure;
import net.mcreator.apocalypsenow.procedures.InfectionOnPotionActiveTickProcedure;
import net.mcreator.apocalypsenow.procedures.InfectionPotionStartedappliedProcedure;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeMap;

public class InfectionMobEffect extends MobEffect {
   public InfectionMobEffect() {
      super(MobEffectCategory.HARMFUL, -16738048);
   }

   @Override
   public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
      InfectionPotionStartedappliedProcedure.execute(entity);
   }

   @Override
   public void applyEffectTick(LivingEntity entity, int amplifier) {
      InfectionOnPotionActiveTickProcedure.execute(entity);
   }

   @Override
   public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
      super.removeAttributeModifiers(entity, attributeMap, amplifier);
      InfectionEffectExpiresProcedure.execute(entity.level(), entity);
   }

   @Override
   public boolean isDurationEffectTick(int duration, int amplifier) {
      return true;
   }
}

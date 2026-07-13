package net.mcreator.apocalypsenow.potion;

import net.mcreator.apocalypsenow.procedures.SplintedlegEffectExpiresProcedure;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeMap;

public class SplintedlegMobEffect extends MobEffect {
   public SplintedlegMobEffect() {
      super(MobEffectCategory.BENEFICIAL, -9747438);
   }

   @Override
   public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
      super.removeAttributeModifiers(entity, attributeMap, amplifier);
      SplintedlegEffectExpiresProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ());
   }

   @Override
   public boolean isDurationEffectTick(int duration, int amplifier) {
      return true;
   }
}

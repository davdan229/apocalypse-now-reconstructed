package net.mcreator.apocalypsenow.potion;

import net.mcreator.apocalypsenow.procedures.RadiationsicknessOnEffectActiveTickProcedure;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

public class RadiationsicknessMobEffect extends MobEffect {
   public RadiationsicknessMobEffect() {
      super(MobEffectCategory.HARMFUL, -1024);
   }

   @Override
   public void applyEffectTick(LivingEntity entity, int amplifier) {
      RadiationsicknessOnEffectActiveTickProcedure.execute(entity.level(), entity);
   }

   @Override
   public boolean isDurationEffectTick(int duration, int amplifier) {
      return true;
   }
}

package net.mcreator.apocalypsenow.procedures;

import net.mcreator.apocalypsenow.configuration.ApocalypsenowconfigurationConfiguration;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;

public class DivingsuitBodyTickEventProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         if (ApocalypsenowconfigurationConfiguration.AMORS_HAVE_EFFECT.get() && entity instanceof LivingEntity _entity && !_entity.level().isClientSide()) {
            _entity.addEffect(new MobEffectInstance(MobEffects.CONDUIT_POWER, 60, 1, false, false));
         }
      }
   }
}

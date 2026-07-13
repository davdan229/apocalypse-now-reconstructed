package net.mcreator.apocalypsenow.procedures;

import net.mcreator.apocalypsenow.configuration.ApocalypsenowconfigurationConfiguration;
import net.mcreator.apocalypsenow.init.ApocalypsenowModMobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;

public class GasmaskHelmetTickEventProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         if (ApocalypsenowconfigurationConfiguration.AMORS_HAVE_EFFECT.get()) {
            if (entity instanceof LivingEntity _entity) {
               _entity.removeEffect(MobEffects.POISON);
            }

            if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide()) {
               _entity.addEffect(new MobEffectInstance(ApocalypsenowModMobEffects.GASMASKEFFECT.get(), 10, 1, false, false));
            }
         }
      }
   }
}

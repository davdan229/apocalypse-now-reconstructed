package net.mcreator.apocalypsenow.procedures;

import net.mcreator.apocalypsenow.configuration.ApocalypsenowconfigurationConfiguration;
import net.mcreator.apocalypsenow.init.ApocalypsenowModMobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;

public class BombsquadBootsTickEventProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         if (ApocalypsenowconfigurationConfiguration.AMORS_HAVE_EFFECT.get() && entity instanceof LivingEntity _entity && !_entity.level().isClientSide()) {
            _entity.addEffect(new MobEffectInstance(ApocalypsenowModMobEffects.PROTECTEDFOOT.get(), 20, 0, false, false));
         }
      }
   }
}

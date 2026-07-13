package net.mcreator.apocalypsenow.procedures;

import net.mcreator.apocalypsenow.configuration.ApocalypsenowconfigurationConfiguration;
import net.mcreator.apocalypsenow.init.ApocalypsenowModMobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;

public class SpikebarrierEntityCollidesInTheBlockProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         if (ApocalypsenowconfigurationConfiguration.ENABLES_ALL_EFFECTS.get()
            && ApocalypsenowconfigurationConfiguration.BLEEDING_EFFECT.get()
            && entity instanceof LivingEntity _entity
            && !_entity.level().isClientSide()) {
            _entity.addEffect(new MobEffectInstance(ApocalypsenowModMobEffects.BLEEDING.get(), 90, 3, false, false));
         }
      }
   }
}

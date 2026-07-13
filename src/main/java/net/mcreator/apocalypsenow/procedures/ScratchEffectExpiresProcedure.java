package net.mcreator.apocalypsenow.procedures;

import net.mcreator.apocalypsenow.ApocalypsenowMod;
import net.mcreator.apocalypsenow.configuration.ApocalypsenowconfigurationConfiguration;
import net.mcreator.apocalypsenow.init.ApocalypsenowModMobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.LevelAccessor;

public class ScratchEffectExpiresProcedure {
   public static void execute(LevelAccessor world, Entity entity) {
      if (entity != null) {
         if (ApocalypsenowconfigurationConfiguration.INFECTION_EFFECT.get() && entity instanceof LivingEntity _entity && !_entity.level().isClientSide()) {
            _entity.addEffect(new MobEffectInstance(ApocalypsenowModMobEffects.INFECTION.get(), 54000, 1, false, false));
         }

         ApocalypsenowMod.queueServerWork(40, () -> {
            if (entity instanceof LivingEntity _entityx && !_entityx.level().isClientSide()) {
               _entityx.addEffect(new MobEffectInstance(ApocalypsenowModMobEffects.POSSCRATCH.get(), 180, 1, false, false));
            }
         });
      }
   }
}

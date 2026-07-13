package net.mcreator.apocalypsenow.procedures;

import net.mcreator.apocalypsenow.ApocalypsenowMod;
import net.mcreator.apocalypsenow.init.ApocalypsenowModMobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.LevelAccessor;

public class InfectionEffectExpiresProcedure {
   public static void execute(LevelAccessor world, Entity entity) {
      if (entity != null) {
         ApocalypsenowMod.queueServerWork(20, () -> {
            if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide()) {
               _entity.addEffect(new MobEffectInstance(ApocalypsenowModMobEffects.POSINFECTIONEFFECT.get(), 60, 1, false, false));
            }
         });
      }
   }
}

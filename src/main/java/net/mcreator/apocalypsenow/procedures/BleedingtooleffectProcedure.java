package net.mcreator.apocalypsenow.procedures;

import net.mcreator.apocalypsenow.ApocalypsenowMod;
import net.mcreator.apocalypsenow.configuration.ApocalypsenowconfigurationConfiguration;
import net.mcreator.apocalypsenow.init.ApocalypsenowModMobEffects;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.LevelAccessor;

public class BleedingtooleffectProcedure {
   public static void execute(LevelAccessor world, Entity entity) {
      if (entity != null) {
         if (ApocalypsenowconfigurationConfiguration.BLEEDING_EFFECT.get()) {
            if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide()) {
               _entity.addEffect(new MobEffectInstance(ApocalypsenowModMobEffects.BLEEDING.get(), 120, 1, false, false));
            }
         } else {
            for (int index0 = 0; index0 < 4; index0++) {
               ApocalypsenowMod.queueServerWork(
                  90,
                  () -> entity.hurt(
                     new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)), 3.0F
                  )
               );
            }
         }
      }
   }
}

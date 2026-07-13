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

public class EletricaldamageweaponProcedure {
   public static void execute(LevelAccessor world, Entity entity) {
      if (entity != null) {
         if (ApocalypsenowconfigurationConfiguration.ELETRICAL_DAMAGE.get()) {
            if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide()) {
               _entity.addEffect(new MobEffectInstance(ApocalypsenowModMobEffects.ELETRICALDAMAGE.get(), 70, 1, false, false));
            }
         } else {
            ApocalypsenowMod.queueServerWork(
               20,
               () -> {
                  entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)), 1.0F);
                  ApocalypsenowMod.queueServerWork(
                     20,
                     () -> {
                        entity.hurt(
                           new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)), 1.5F
                        );
                        ApocalypsenowMod.queueServerWork(
                           20,
                           () -> {
                              entity.hurt(
                                 new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)), 1.0F
                              );
                              ApocalypsenowMod.queueServerWork(
                                 20,
                                 () -> {
                                    entity.hurt(
                                       new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)),
                                       1.2F
                                    );
                                    ApocalypsenowMod.queueServerWork(
                                       20,
                                       () -> entity.hurt(
                                          new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)),
                                          1.2F
                                       )
                                    );
                                 }
                              );
                           }
                        );
                     }
                  );
               }
            );
         }
      }
   }
}

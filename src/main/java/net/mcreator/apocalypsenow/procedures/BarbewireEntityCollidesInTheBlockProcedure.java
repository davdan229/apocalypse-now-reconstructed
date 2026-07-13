package net.mcreator.apocalypsenow.procedures;

import net.mcreator.apocalypsenow.configuration.ApocalypsenowconfigurationConfiguration;
import net.mcreator.apocalypsenow.init.ApocalypsenowModMobEffects;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.level.LevelAccessor;

public class BarbewireEntityCollidesInTheBlockProcedure {
   public static void execute(LevelAccessor world, Entity entity) {
      if (entity != null) {
         if (ApocalypsenowconfigurationConfiguration.ENABLES_ALL_EFFECTS.get()) {
            if (entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(ApocalypsenowModMobEffects.PROTECTEDSKIN.get())) {
               if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide()) {
                  _entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 1, 1, false, false));
               }
            } else {
               if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide()) {
                  _entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 1, 1, false, false));
               }

               if (ApocalypsenowconfigurationConfiguration.BLEEDING_EFFECT.get() && entity instanceof LivingEntity _entity && !_entity.level().isClientSide()) {
                  _entity.addEffect(new MobEffectInstance(ApocalypsenowModMobEffects.BLEEDING.get(), 300, 1, false, false));
               }
            }
         }

         if (!(entity instanceof ItemEntity)) {
            entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)), 2.0F);
         }
      }
   }
}

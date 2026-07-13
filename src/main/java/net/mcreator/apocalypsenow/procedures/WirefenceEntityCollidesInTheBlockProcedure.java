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
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.LevelAccessor;

public class WirefenceEntityCollidesInTheBlockProcedure {
   public static void execute(LevelAccessor world, Entity entity) {
      if (entity != null) {
         double raytrace_y = 0.0;
         double raytrace_x = 0.0;
         double raytrace_z = 0.0;
         if (ApocalypsenowconfigurationConfiguration.ENABLES_ALL_EFFECTS.get()) {
            if (entity instanceof Player && entity instanceof LivingEntity _livEnt2 && _livEnt2.hasEffect(ApocalypsenowModMobEffects.PROTECTEDSKIN.get())) {
               if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide()) {
                  _entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 10, 1, false, false));
               }
            } else {
               if (ApocalypsenowconfigurationConfiguration.BLEEDING_EFFECT.get() && entity instanceof LivingEntity _entity && !_entity.level().isClientSide()) {
                  _entity.addEffect(new MobEffectInstance(ApocalypsenowModMobEffects.BLEEDING.get(), 120, 1, false, false));
               }

               if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide()) {
                  _entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 10, 1, false, false));
               }
            }
         }

         if (!(entity instanceof ItemEntity)) {
            entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)), 1.0F);
         }
      }
   }
}

package net.mcreator.apocalypsenow.procedures;

import net.mcreator.apocalypsenow.init.ApocalypsenowModMobEffects;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.LevelAccessor;

public class RadiationsicknessOnEffectActiveTickProcedure {
   public static void execute(LevelAccessor world, Entity entity) {
      if (entity != null) {
         if (!(entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(ApocalypsenowModMobEffects.GASMASKEFFECT.get()))) {
            entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)), 3.0F);
            if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide()) {
               _entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 60, 1, false, false));
            }
         } else if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide()) {
            _entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 60, 1, false, false));
         }
      }
   }
}

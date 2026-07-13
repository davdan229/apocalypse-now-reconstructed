package net.mcreator.apocalypsenow.procedures;

import javax.annotation.Nullable;
import net.mcreator.apocalypsenow.configuration.ApocalypsenowconfigurationConfiguration;
import net.mcreator.apocalypsenow.init.ApocalypsenowModMobEffects;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobType;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class InfectionaplyProcedure {
   @SubscribeEvent
   public static void onEntityAttacked(LivingAttackEvent event) {
      if (event != null && event.getEntity() != null) {
         execute(event, event.getSource(), event.getEntity(), event.getSource().getEntity());
      }
   }

   public static void execute(DamageSource damagesource, Entity entity, Entity sourceentity) {
      execute(null, damagesource, entity, sourceentity);
   }

   private static void execute(@Nullable Event event, DamageSource damagesource, Entity entity, Entity sourceentity) {
      if (damagesource != null && entity != null && sourceentity != null) {
         if (ApocalypsenowconfigurationConfiguration.ENABLES_ALL_EFFECTS.get()
            && sourceentity instanceof LivingEntity _livEnt1
            && _livEnt1.getMobType() == MobType.UNDEAD
            && !damagesource.is(DamageTypes.ARROW)) {
            if ((entity instanceof LivingEntity _livEnt ? _livEnt.getArmorValue() : 0) <= 20
               && ApocalypsenowconfigurationConfiguration.BITE_EFFECT.get()
               && !(entity instanceof LivingEntity _livEnt5 && _livEnt5.hasEffect(ApocalypsenowModMobEffects.BITE.get()))
               && Math.random() < 0.05
               && entity instanceof LivingEntity _entity
               && !_entity.level().isClientSide()) {
               _entity.addEffect(new MobEffectInstance(ApocalypsenowModMobEffects.BITE.get(), 84000, 0, false, false));
            }

            if ((entity instanceof LivingEntity _livEnt ? _livEnt.getArmorValue() : 0) <= 15
               && ApocalypsenowconfigurationConfiguration.SCRATCH_EFFECT.get()
               && Math.random() < 0.05
               && entity instanceof LivingEntity _entity
               && !_entity.level().isClientSide()) {
               _entity.addEffect(new MobEffectInstance(ApocalypsenowModMobEffects.SCRATCH.get(), 600, 0, false, false));
            }

            if ((entity instanceof LivingEntity _livEnt ? _livEnt.getArmorValue() : 0) <= 10
               && ApocalypsenowconfigurationConfiguration.SEVERE_BLEEDING_EFFECT.get()
               && Math.random() < 0.05
               && entity instanceof LivingEntity _entity
               && !_entity.level().isClientSide()) {
               _entity.addEffect(new MobEffectInstance(ApocalypsenowModMobEffects.SEVEREBLEEDING.get(), 600, 0, false, false));
            }

            if ((entity instanceof LivingEntity _livEnt ? _livEnt.getArmorValue() : 0) <= 5
               && ApocalypsenowconfigurationConfiguration.BLEEDING_EFFECT.get()
               && Math.random() < 0.05
               && entity instanceof LivingEntity _entity
               && !_entity.level().isClientSide()) {
               _entity.addEffect(new MobEffectInstance(ApocalypsenowModMobEffects.BLEEDING.get(), 600, 0, false, false));
            }
         }
      }
   }
}

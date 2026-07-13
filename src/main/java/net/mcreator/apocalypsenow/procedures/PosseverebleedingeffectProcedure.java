package net.mcreator.apocalypsenow.procedures;

import net.mcreator.apocalypsenow.init.ApocalypsenowModMobEffects;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;

public class PosseverebleedingeffectProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(ApocalypsenowModMobEffects.SUTUREEFFECT.get())) {
            if (entity instanceof Player _player && !_player.level().isClientSide()) {
               _player.displayClientMessage(Component.translatable("text.apocalypsenow.i_lost_a_lot_of_blood_ce5619f4"), true);
            }
         } else if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide()) {
            _entity.addEffect(new MobEffectInstance(ApocalypsenowModMobEffects.SEVEREBLEEDING.get(), 700, 1, false, false));
         }
      }
   }
}

package net.mcreator.apocalypsenow.procedures;

import net.mcreator.apocalypsenow.init.ApocalypsenowModMobEffects;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;

public class SurvivorrightclickProcedure {
   public static void execute(Entity entity, Entity sourceentity) {
      if (entity != null && sourceentity != null) {
         double generator_distance = 0.0;
         double sx = 0.0;
         double sy = 0.0;
         double sz = 0.0;
         double fireHeight = 0.0;
         boolean found = false;
         boolean condition = false;
         if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(ApocalypsenowModMobEffects.ONGUARD.get())) {
            if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide()) {
               _entity.addEffect(new MobEffectInstance(ApocalypsenowModMobEffects.WALKING.get(), 60, 1, false, false));
            }

            if (sourceentity instanceof Player _player && !_player.level().isClientSide()) {
               _player.displayClientMessage(Component.translatable("text.apocalypsenow.walking_1dabd513"), true);
            }
         } else {
            if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide()) {
               _entity.addEffect(new MobEffectInstance(ApocalypsenowModMobEffects.ONGUARD.get(), 60, 1, false, false));
            }

            if (sourceentity instanceof Player _player && !_player.level().isClientSide()) {
               _player.displayClientMessage(Component.translatable("text.apocalypsenow.on_guard_921bd611"), true);
            }
         }
      }
   }
}

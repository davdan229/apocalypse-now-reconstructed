package net.mcreator.apocalypsenow.procedures;

import net.mcreator.apocalypsenow.init.ApocalypsenowModMobEffects;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;

public class PosscratcheffectProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(ApocalypsenowModMobEffects.BANDAGED.get())
            || entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(ApocalypsenowModMobEffects.BANDAGEDD.get())) {
            if (entity instanceof Player _player && !_player.level().isClientSide()) {
               _player.displayClientMessage(Component.translatable("text.apocalypsenow.that_should_fix_the_scratch_9d972ac2"), true);
            }
         } else if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide()) {
            _entity.addEffect(new MobEffectInstance(ApocalypsenowModMobEffects.SCRATCH.get(), 500, 1, false, false));
         }
      }
   }
}

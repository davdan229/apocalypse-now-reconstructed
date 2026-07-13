package net.mcreator.apocalypsenow.procedures;

import net.mcreator.apocalypsenow.configuration.ApocalypsenowconfigurationConfiguration;
import net.mcreator.apocalypsenow.init.ApocalypsenowModMobEffects;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;

public class PospainontickupdateProcedure {
   public static void execute(Entity entity) {
      if (!(entity instanceof Player player) || player.level().isClientSide()) return;
      if (player.hasEffect(ApocalypsenowModMobEffects.PAINKILLERSEFFECT.get())) {
         player.removeEffect(ApocalypsenowModMobEffects.POSPAIN.get());
         player.displayClientMessage(Component.translatable("text.apocalypsenow.the_pain_is_going_away_d8f9a798"), true);
      } else if (ApocalypsenowconfigurationConfiguration.PAIN_EFFECT.get()
         && ApocalypsenowconfigurationConfiguration.ENABLES_ALL_EFFECTS.get()) {
         player.addEffect(new MobEffectInstance(ApocalypsenowModMobEffects.PAIN.get(), 40, 1, false, false));
      }
   }
}

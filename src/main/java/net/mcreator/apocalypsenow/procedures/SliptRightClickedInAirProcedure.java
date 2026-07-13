package net.mcreator.apocalypsenow.procedures;

import net.mcreator.apocalypsenow.configuration.ApocalypsenowconfigurationConfiguration;
import net.mcreator.apocalypsenow.init.ApocalypsenowModMobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

public class SliptRightClickedInAirProcedure {
   public static void execute(Entity entity, ItemStack itemstack) {
      if (!(entity instanceof Player player) || player.level().isClientSide || itemstack.isEmpty()
         || !player.hasEffect(ApocalypsenowModMobEffects.BROKENLEG.get())) return;
      player.removeEffect(ApocalypsenowModMobEffects.BROKENLEG.get());
      player.addEffect(new MobEffectInstance(ApocalypsenowModMobEffects.SPLINTEDLEG.get(), 120, 1, false, false));
      if (ApocalypsenowconfigurationConfiguration.PAIN_EFFECT.get() && player.getRandom().nextFloat() < 0.2F) {
         player.addEffect(new MobEffectInstance(ApocalypsenowModMobEffects.PAIN.get(), 900, 1, false, false));
      }
      player.getCooldowns().addCooldown(itemstack.getItem(), 900);
      itemstack.shrink(1);
   }
}

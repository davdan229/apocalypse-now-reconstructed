package net.mcreator.apocalypsenow.procedures;

import net.mcreator.apocalypsenow.init.ApocalypsenowModMobEffects;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

public class StringandneedleRightclickedProcedure {
   public static void execute(Entity entity, ItemStack itemstack, InteractionHand hand) {
      if (!(entity instanceof Player player) || player.level().isClientSide || itemstack.isEmpty()) {
         return;
      }
      if (!player.hasEffect(ApocalypsenowModMobEffects.SEVEREBLEEDING.get())
         && !player.hasEffect(ApocalypsenowModMobEffects.BLEEDING.get())) {
         return;
      }
      player.removeEffect(ApocalypsenowModMobEffects.SEVEREBLEEDING.get());
      player.removeEffect(ApocalypsenowModMobEffects.BLEEDING.get());
      player.addEffect(new MobEffectInstance(ApocalypsenowModMobEffects.SUTUREEFFECT.get(), 300, 1, false, false));
      player.addEffect(new MobEffectInstance(ApocalypsenowModMobEffects.POSBLEEDING.get(), 300, 1, false, false));
      player.addEffect(new MobEffectInstance(ApocalypsenowModMobEffects.POSSEVEREBLEEDING.get(), 300, 1, false, false));
      player.getCooldowns().addCooldown(itemstack.getItem(), 70);
      itemstack.hurtAndBreak(1, player, owner -> owner.broadcastBreakEvent(hand));
   }
}

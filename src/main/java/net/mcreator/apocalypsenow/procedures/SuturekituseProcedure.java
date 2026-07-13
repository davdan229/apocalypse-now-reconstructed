package net.mcreator.apocalypsenow.procedures;

import net.mcreator.apocalypsenow.init.ApocalypsenowModMobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.LevelAccessor;

public class SuturekituseProcedure {
   public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
      if (!(entity instanceof Player player) || player.level().isClientSide || itemstack.isEmpty()) {
         return;
      }
      player.heal(20.0F);
      player.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 120, 1, false, false));
      player.addEffect(new MobEffectInstance(ApocalypsenowModMobEffects.SUTUREEFFECT.get(), 300, 1, false, false));
      player.addEffect(new MobEffectInstance(ApocalypsenowModMobEffects.BANDAGED.get(), 300, 1, false, false));
      player.removeEffect(ApocalypsenowModMobEffects.BLEEDING.get());
      player.removeEffect(ApocalypsenowModMobEffects.SCRATCH.get());
      player.removeEffect(ApocalypsenowModMobEffects.SEVEREBLEEDING.get());
      player.getCooldowns().addCooldown(itemstack.getItem(), 700);
      itemstack.shrink(1);
   }
}

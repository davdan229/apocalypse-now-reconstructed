package net.mcreator.apocalypsenow.procedures;

import net.mcreator.apocalypsenow.init.ApocalypsenowModMobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

public class MorphineRightClickedInAirProcedure {
   public static void execute(Entity entity, ItemStack itemstack) {
      if (!(entity instanceof Player player) || player.level().isClientSide || itemstack.isEmpty()) return;
      player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 700, 3, false, false));
      player.removeEffect(ApocalypsenowModMobEffects.PAIN.get());
      itemstack.shrink(1);
   }
}

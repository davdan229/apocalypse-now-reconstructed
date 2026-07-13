package net.mcreator.apocalypsenow.procedures;

import net.mcreator.apocalypsenow.init.ApocalypsenowModMobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

public class AntibioticsRightClickedInAirProcedure {
   public static void execute(Entity entity, ItemStack itemstack) {
      if (!(entity instanceof Player player) || player.level().isClientSide || itemstack.isEmpty()) return;
      player.removeEffect(ApocalypsenowModMobEffects.INFECTION.get());
      player.addEffect(new MobEffectInstance(ApocalypsenowModMobEffects.ANTIBIOTICSEFFECT.get(), 120, 1, false, false));
      itemstack.shrink(1);
   }
}

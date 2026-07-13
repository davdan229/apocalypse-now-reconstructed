package net.mcreator.apocalypsenow.procedures;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

public class AdrenalineRightClickedInAirProcedure {
   public static void execute(Entity entity, ItemStack itemstack) {
      if (!(entity instanceof Player player) || player.level().isClientSide || itemstack.isEmpty()) return;
      player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 2, false, false));
      player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 600, 2, false, false));
      player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600, 2, false, false));
      itemstack.shrink(1);
   }
}

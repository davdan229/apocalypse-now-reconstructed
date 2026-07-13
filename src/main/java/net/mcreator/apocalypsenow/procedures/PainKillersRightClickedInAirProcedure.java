package net.mcreator.apocalypsenow.procedures;

import net.mcreator.apocalypsenow.init.ApocalypsenowModMobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

public class PainKillersRightClickedInAirProcedure {
   public static void execute(Entity entity, ItemStack itemstack) {
      if (!(entity instanceof Player player) || player.level().isClientSide || itemstack.isEmpty()) {
         return;
      }
      player.heal(3.0F);
      player.addEffect(new MobEffectInstance(ApocalypsenowModMobEffects.PAINKILLERSEFFECT.get(), 800, 1, false, false));
      player.removeEffect(ApocalypsenowModMobEffects.PAIN.get());
      player.getCooldowns().addCooldown(itemstack.getItem(), 200);
      itemstack.shrink(1);
   }
}

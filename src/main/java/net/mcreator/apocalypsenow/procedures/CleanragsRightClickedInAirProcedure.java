package net.mcreator.apocalypsenow.procedures;

import net.mcreator.apocalypsenow.init.ApocalypsenowModMobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

public class CleanragsRightClickedInAirProcedure {
   public static void execute(Entity entity, ItemStack itemstack) {
      if (!(entity instanceof Player player) || player.level().isClientSide || itemstack.isEmpty()) {
         return;
      }

      boolean bleeding = player.hasEffect(ApocalypsenowModMobEffects.BLEEDING.get());
      boolean scratched = player.hasEffect(ApocalypsenowModMobEffects.SCRATCH.get());
      boolean bitten = player.hasEffect(ApocalypsenowModMobEffects.BITE.get());
      boolean infected = player.hasEffect(ApocalypsenowModMobEffects.INFECTION.get());
      player.heal(3.0F);
      if (bleeding) {
         player.addEffect(new MobEffectInstance(ApocalypsenowModMobEffects.BANDAGEDD.get(), 900, 1, false, false));
         player.removeEffect(ApocalypsenowModMobEffects.BLEEDING.get());
      } else if (scratched || bitten || infected) {
         player.addEffect(new MobEffectInstance(ApocalypsenowModMobEffects.BANDAGED.get(), 900, 1, false, false));
         if (scratched) {
            player.removeEffect(ApocalypsenowModMobEffects.BLEEDING.get());
            player.removeEffect(ApocalypsenowModMobEffects.SCRATCH.get());
         } else if (infected) {
            player.removeEffect(ApocalypsenowModMobEffects.INFECTION.get());
         }
      }
      player.getCooldowns().addCooldown(itemstack.getItem(), 70);
      itemstack.shrink(1);
   }
}

package net.mcreator.apocalypsenow.procedures;

import net.mcreator.apocalypsenow.init.ApocalypsenowModMobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

public class BandageRightClickedInAirProcedure {
   public static void execute(Entity entity, ItemStack itemstack) {
      if (!(entity instanceof Player player) || player.level().isClientSide || itemstack.isEmpty()) {
         return;
      }

      boolean bleeding = player.hasEffect(ApocalypsenowModMobEffects.BLEEDING.get());
      boolean severeBleeding = player.hasEffect(ApocalypsenowModMobEffects.SEVEREBLEEDING.get());
      boolean scratched = player.hasEffect(ApocalypsenowModMobEffects.SCRATCH.get());
      boolean bitten = player.hasEffect(ApocalypsenowModMobEffects.BITE.get());
      player.heal(4.0F);
      if (bleeding || severeBleeding || scratched || bitten) {
         player.addEffect(new MobEffectInstance(ApocalypsenowModMobEffects.BANDAGED.get(), 900, 1, false, false));
      }
      if (bleeding || severeBleeding) {
         player.removeEffect(ApocalypsenowModMobEffects.BLEEDING.get());
      }
      if (severeBleeding) {
         player.removeEffect(ApocalypsenowModMobEffects.SEVEREBLEEDING.get());
      }
      if (scratched || severeBleeding) {
         player.removeEffect(ApocalypsenowModMobEffects.SCRATCH.get());
      }
      player.getCooldowns().addCooldown(itemstack.getItem(), 70);
      itemstack.shrink(1);
   }
}

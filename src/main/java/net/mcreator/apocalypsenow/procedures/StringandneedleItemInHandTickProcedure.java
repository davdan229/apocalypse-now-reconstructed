package net.mcreator.apocalypsenow.procedures;

import net.mcreator.apocalypsenow.init.ApocalypsenowModItems;
import net.mcreator.apocalypsenow.init.ApocalypsenowModMobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

public class StringandneedleItemInHandTickProcedure {
   public static void execute(Entity entity, ItemStack itemstack) {
      if (entity != null) {
         if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(ApocalypsenowModMobEffects.BLEEDING.get())) {
            if (entity instanceof LivingEntity _entity) {
               _entity.setHealth((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1.0F) + 2.0F);
            }

            if (entity instanceof Player _player) {
               _player.getCooldowns().addCooldown(itemstack.getItem(), 70);
            }

            if (entity instanceof Player _player) {
               ItemStack _stktoremove = new ItemStack(ApocalypsenowModItems.STRINGANDNEEDLE.get());
               _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }

            if (entity instanceof LivingEntity _entity) {
               _entity.removeEffect(ApocalypsenowModMobEffects.BLEEDING.get());
            }

            if (entity instanceof LivingEntity _entity) {
               _entity.removeEffect(ApocalypsenowModMobEffects.SEVEREBLEEDING.get());
            }
         }

         if (entity instanceof LivingEntity _livEnt8 && _livEnt8.hasEffect(ApocalypsenowModMobEffects.SEVEREBLEEDING.get())) {
            if (entity instanceof LivingEntity _entity) {
               _entity.setHealth((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1.0F) + 2.0F);
            }

            if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide()) {
               _entity.addEffect(new MobEffectInstance(ApocalypsenowModMobEffects.BANDAGEDD.get(), 900, 1, false, false));
            }

            if (entity instanceof Player _player) {
               _player.getCooldowns().addCooldown(itemstack.getItem(), 70);
            }

            if (entity instanceof Player _player) {
               ItemStack _stktoremove = new ItemStack(ApocalypsenowModItems.STRINGANDNEEDLE.get());
               _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }

            if (entity instanceof LivingEntity _entity) {
               _entity.removeEffect(ApocalypsenowModMobEffects.BLEEDING.get());
            }

            if (entity instanceof LivingEntity _entity) {
               _entity.removeEffect(ApocalypsenowModMobEffects.SEVEREBLEEDING.get());
            }
         }
      }
   }
}

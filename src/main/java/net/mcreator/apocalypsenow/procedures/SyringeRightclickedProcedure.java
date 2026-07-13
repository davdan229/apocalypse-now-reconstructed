package net.mcreator.apocalypsenow.procedures;

import net.mcreator.apocalypsenow.init.ApocalypsenowModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUtils;
import net.minecraft.world.level.LevelAccessor;

public class SyringeRightclickedProcedure {
   public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack, InteractionHand hand) {
      if (!(entity instanceof Player player) || player.level().isClientSide || itemstack.isEmpty()) {
         return;
      }
      player.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)), 3.0F);
      ItemStack result = ItemUtils.createFilledResult(itemstack, player, new ItemStack(ApocalypsenowModItems.BLOODSYRINGE.get()));
      player.setItemInHand(hand, result);
   }
}

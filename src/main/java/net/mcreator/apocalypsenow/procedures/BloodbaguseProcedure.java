package net.mcreator.apocalypsenow.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

public class BloodbaguseProcedure {
   public static void execute(Entity entity, ItemStack itemstack) {
      if (!(entity instanceof Player player) || player.level().isClientSide || itemstack.isEmpty()) {
         return;
      }
      player.heal(15.0F);
      player.getCooldowns().addCooldown(itemstack.getItem(), 800);
      itemstack.shrink(1);
   }
}

package net.mcreator.apocalypsenow.procedures;

import net.minecraft.world.item.ItemStack;

public class Coinsvalue8Procedure {
   public static double execute(ItemStack itemstack) {
      return itemstack.getCount() <= 15 && itemstack.getCount() >= 8 ? 1.0 : 0.0;
   }
}

package net.mcreator.apocalypsenow.procedures;

import net.minecraft.world.item.ItemStack;

public class Coinsvalue16Procedure {
   public static double execute(ItemStack itemstack) {
      return itemstack.getCount() >= 16 ? 1.0 : 0.0;
   }
}

package net.mcreator.apocalypsenow.procedures;

import net.minecraft.world.item.ItemStack;

public class Coinsvalue32Procedure {
   public static double execute(ItemStack itemstack) {
      return itemstack.getCount() >= 32 ? 1.0 : 0.0;
   }
}

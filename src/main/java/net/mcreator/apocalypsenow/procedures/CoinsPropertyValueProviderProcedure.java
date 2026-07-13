package net.mcreator.apocalypsenow.procedures;

import net.minecraft.world.item.ItemStack;

public class CoinsPropertyValueProviderProcedure {
   public static double execute(ItemStack itemstack) {
      return itemstack.getCount() >= 4 ? 1.0 : 0.0;
   }
}

package net.mcreator.apocalypsenow.procedures;

import net.minecraft.world.item.ItemStack;

public class MoneyPropertyValueProviderProcedure {
   public static double execute(ItemStack itemstack) {
      if (itemstack.getCount() <= 25 && itemstack.getCount() >= 16) {
         return 1.0;
      } else if (itemstack.getCount() <= 44 && itemstack.getCount() >= 25) {
         return 2.0;
      } else {
         return itemstack.getCount() >= 44 ? 3.0 : 0.0;
      }
   }
}

package net.mcreator.apocalypsenow.procedures;

import net.minecraft.world.item.ItemStack;

public class IroncanteenvalueProcedure {
   public static double execute(ItemStack itemstack) {
      return itemstack.getDamageValue() == 9 ? 1.0 : 0.0;
   }
}

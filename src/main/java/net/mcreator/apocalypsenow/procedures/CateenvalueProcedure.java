package net.mcreator.apocalypsenow.procedures;

import net.minecraft.world.item.ItemStack;

public class CateenvalueProcedure {
   public static double execute(ItemStack itemstack) {
      return itemstack.getDamageValue() == 19 ? 1.0 : 0.0;
   }
}

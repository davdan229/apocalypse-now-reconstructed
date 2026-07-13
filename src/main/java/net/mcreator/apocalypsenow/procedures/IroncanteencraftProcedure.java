package net.mcreator.apocalypsenow.procedures;

import net.minecraft.util.RandomSource;
import net.minecraft.world.item.ItemStack;

public class IroncanteencraftProcedure {
   public static void execute(ItemStack itemstack) {
      ItemStack _ist = itemstack;
      if (_ist.hurt(9, RandomSource.create(), null)) {
         _ist.shrink(1);
         _ist.setDamageValue(0);
      }
   }
}

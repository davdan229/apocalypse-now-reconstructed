package net.mcreator.apocalypsenow.procedures;

import net.minecraft.util.RandomSource;
import net.minecraft.world.item.ItemStack;

public class Canteen44ItemIsCraftedsmeltedProcedure {
   public static void execute(ItemStack itemstack) {
      ItemStack _ist = itemstack;
      if (_ist.hurt(19, RandomSource.create(), null)) {
         _ist.shrink(1);
         _ist.setDamageValue(0);
      }
   }
}

package net.mcreator.apocalypsenow.item;

import net.minecraft.world.food.FoodProperties.Builder;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item.Properties;

public class MacandcheeseItem extends Item {
   public MacandcheeseItem() {
      super(new Properties().stacksTo(64).rarity(Rarity.COMMON).food(new Builder().nutrition(9).saturationMod(1.6F).build()));
   }

   @Override
   public int getUseDuration(ItemStack itemstack) {
      return 5;
   }
}

package net.mcreator.apocalypsenow.item;

import net.minecraft.world.food.FoodProperties.Builder;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item.Properties;

public class CockroachhItem extends Item {
   public CockroachhItem() {
      super(new Properties().stacksTo(64).rarity(Rarity.COMMON).food(new Builder().nutrition(2).saturationMod(0.1F).build()));
   }

   @Override
   public int getUseDuration(ItemStack itemstack) {
      return 5;
   }
}

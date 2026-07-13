package net.mcreator.apocalypsenow.item;

import net.minecraft.world.food.FoodProperties.Builder;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item.Properties;

public class ButterItem extends Item {
   public ButterItem() {
      super(new Properties().stacksTo(64).rarity(Rarity.COMMON).food(new Builder().nutrition(8).saturationMod(1.0F).build()));
   }

   @Override
   public int getUseDuration(ItemStack itemstack) {
      return 5;
   }
}

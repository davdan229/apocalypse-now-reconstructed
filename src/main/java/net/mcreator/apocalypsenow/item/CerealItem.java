package net.mcreator.apocalypsenow.item;

import net.minecraft.world.food.FoodProperties.Builder;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item.Properties;

public class CerealItem extends Item {
   public CerealItem() {
      super(new Properties().stacksTo(64).rarity(Rarity.COMMON).food(new Builder().nutrition(7).saturationMod(2.0F).build()));
   }

   @Override
   public int getUseDuration(ItemStack itemstack) {
      return 6;
   }
}

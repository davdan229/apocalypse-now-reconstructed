package net.mcreator.apocalypsenow.item;

import net.minecraft.world.food.FoodProperties.Builder;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.level.block.state.BlockState;

public class CookedchikenwingItem extends Item {
   public CookedchikenwingItem() {
      super(new Properties().stacksTo(64).rarity(Rarity.COMMON).food(new Builder().nutrition(7).saturationMod(0.5F).build()));
   }

   @Override
   public int getUseDuration(ItemStack itemstack) {
      return 30;
   }

   @Override
   public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
      return 0.0F;
   }
}

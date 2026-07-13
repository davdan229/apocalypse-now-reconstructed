package net.mcreator.apocalypsenow.item;

import net.minecraft.world.food.FoodProperties.Builder;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.level.block.state.BlockState;

public class MREItem extends Item {
   public MREItem() {
      super(new Properties().stacksTo(64).rarity(Rarity.RARE).food(new Builder().nutrition(20).saturationMod(1.1F).meat().build()));
   }

   @Override
   public int getUseDuration(ItemStack itemstack) {
      return 55;
   }

   @Override
   public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
      return 0.0F;
   }
}

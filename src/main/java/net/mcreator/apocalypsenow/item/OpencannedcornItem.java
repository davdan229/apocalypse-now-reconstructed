package net.mcreator.apocalypsenow.item;

import net.minecraft.world.food.FoodProperties.Builder;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.level.block.state.BlockState;

public class OpencannedcornItem extends Item {
   public OpencannedcornItem() {
      super(new Properties().stacksTo(64).rarity(Rarity.COMMON).food(new Builder().nutrition(6).saturationMod(0.4F).meat().build()));
   }

   @Override
   public int getUseDuration(ItemStack itemstack) {
      return 40;
   }

   @Override
   public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
      return 0.0F;
   }
}

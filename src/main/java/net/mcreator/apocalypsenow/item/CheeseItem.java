package net.mcreator.apocalypsenow.item;

import net.minecraft.world.food.FoodProperties.Builder;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.level.block.state.BlockState;

public class CheeseItem extends Item {
   public CheeseItem() {
      super(new Properties().stacksTo(64).rarity(Rarity.COMMON).food(new Builder().nutrition(4).saturationMod(0.3F).meat().build()));
   }

   @Override
   public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
      return 0.0F;
   }
}

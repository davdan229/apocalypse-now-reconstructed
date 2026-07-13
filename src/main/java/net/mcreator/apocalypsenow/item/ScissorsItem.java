package net.mcreator.apocalypsenow.item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ShearsItem;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.level.block.state.BlockState;

public class ScissorsItem extends ShearsItem {
   public ScissorsItem() {
      super(new Properties().durability(100));
   }

   @Override
   public int getEnchantmentValue() {
      return 2;
   }

   @Override
   public float getDestroySpeed(ItemStack stack, BlockState blockstate) {
      return 4.0F;
   }

   @Override
   public boolean hasCraftingRemainingItem(ItemStack stack) {
      return true;
   }

   @Override
   public ItemStack getCraftingRemainingItem(ItemStack itemstack) {
      ItemStack retval = new ItemStack(this);
      retval.setDamageValue(itemstack.getDamageValue() + 1);
      return retval.getDamageValue() >= retval.getMaxDamage() ? ItemStack.EMPTY : retval;
   }

   @Override
   public boolean isRepairable(ItemStack itemstack) {
      return false;
   }
}

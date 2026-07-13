package net.mcreator.apocalypsenow.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Item.Properties;

public class TowelItem extends Item {
   public TowelItem() {
      super(new Properties().durability(20).rarity(Rarity.COMMON));
   }

   @Override
   public UseAnim getUseAnimation(ItemStack itemstack) {
      return UseAnim.EAT;
   }

   @Override
   public boolean hasCraftingRemainingItem() {
      return true;
   }

   @Override
   public ItemStack getCraftingRemainingItem(ItemStack itemstack) {
      return new ItemStack(this);
   }

   @Override
   public boolean isRepairable(ItemStack itemstack) {
      return false;
   }
}

package net.mcreator.apocalypsenow.item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.crafting.Ingredient;

public class ImprovisedHammerItem extends PickaxeItem {
   public ImprovisedHammerItem() {
      super(new Tier() {
         @Override
         public int getUses() {
            return 90;
         }

         @Override
         public float getSpeed() {
            return 4.0F;
         }

         @Override
         public float getAttackDamageBonus() {
            return 2.0F;
         }

         @Override
         public int getLevel() {
            return 1;
         }

         @Override
         public int getEnchantmentValue() {
            return 2;
         }

         @Override
         public Ingredient getRepairIngredient() {
            return Ingredient.of();
         }
      }, 1, -2.4F, new Properties());
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

package net.mcreator.apocalypsenow.item;

import net.mcreator.apocalypsenow.init.ApocalypsenowModItems;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;

public class SledgeHammerItem extends PickaxeItem {
   public SledgeHammerItem() {
      super(new Tier() {
         @Override
         public int getUses() {
            return 305;
         }

         @Override
         public float getSpeed() {
            return 10.0F;
         }

         @Override
         public float getAttackDamageBonus() {
            return 12.0F;
         }

         @Override
         public int getLevel() {
            return 3;
         }

         @Override
         public int getEnchantmentValue() {
            return 2;
         }

         @Override
         public Ingredient getRepairIngredient() {
            return Ingredient.of(new ItemStack(Blocks.BLACK_CONCRETE), new ItemStack(ApocalypsenowModItems.DUCTTAPE.get()));
         }
      }, 1, -3.5F, new Properties());
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

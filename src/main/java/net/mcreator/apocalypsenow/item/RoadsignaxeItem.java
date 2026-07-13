package net.mcreator.apocalypsenow.item;

import net.mcreator.apocalypsenow.init.ApocalypsenowModItems;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.crafting.Ingredient;

public class RoadsignaxeItem extends AxeItem {
   public RoadsignaxeItem() {
      super(new Tier() {
         @Override
         public int getUses() {
            return 190;
         }

         @Override
         public float getSpeed() {
            return 10.0F;
         }

         @Override
         public float getAttackDamageBonus() {
            return 8.5F;
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
            return Ingredient.of(new ItemStack(Items.IRON_INGOT), new ItemStack(ApocalypsenowModItems.SCRAPMETAL.get()));
         }
      }, 1.0F, -3.1F, new Properties());
   }
}

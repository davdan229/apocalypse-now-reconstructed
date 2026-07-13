package net.mcreator.apocalypsenow.item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.crafting.Ingredient;

public class ExecutionersaxeItem extends SwordItem {
   public ExecutionersaxeItem() {
      super(new Tier() {
         @Override
         public int getUses() {
            return 1200;
         }

         @Override
         public float getSpeed() {
            return 4.0F;
         }

         @Override
         public float getAttackDamageBonus() {
            return 8.5F;
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
            return Ingredient.of(new ItemStack(Items.DIAMOND));
         }
      }, 3, -2.8F, new Properties());
   }
}

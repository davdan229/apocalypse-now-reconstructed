package net.mcreator.apocalypsenow.item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.crafting.Ingredient;

public class HammerpickaxeItem extends PickaxeItem {
   public HammerpickaxeItem() {
      super(new Tier() {
         @Override
         public int getUses() {
            return 400;
         }

         @Override
         public float getSpeed() {
            return 6.0F;
         }

         @Override
         public float getAttackDamageBonus() {
            return 3.0F;
         }

         @Override
         public int getLevel() {
            return 2;
         }

         @Override
         public int getEnchantmentValue() {
            return 2;
         }

         @Override
         public Ingredient getRepairIngredient() {
            return Ingredient.of(new ItemStack(Items.IRON_INGOT));
         }
      }, 1, -2.5F, new Properties());
   }
}

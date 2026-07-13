package net.mcreator.apocalypsenow.item;

import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.crafting.Ingredient;

public class HeadcutterItem extends AxeItem {
   public HeadcutterItem() {
      super(new Tier() {
         @Override
         public int getUses() {
            return 600;
         }

         @Override
         public float getSpeed() {
            return 6.0F;
         }

         @Override
         public float getAttackDamageBonus() {
            return 17.0F;
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
      }, 1.0F, -3.7F, new Properties());
   }
}

package net.mcreator.apocalypsenow.item;

import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.crafting.Ingredient;

public class RockItem extends AxeItem {
   public RockItem() {
      super(new Tier() {
         @Override
         public int getUses() {
            return 50;
         }

         @Override
         public float getSpeed() {
            return 2.0F;
         }

         @Override
         public float getAttackDamageBonus() {
            return 0.0F;
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
      }, 1.0F, -2.7F, new Properties());
   }
}

package net.mcreator.apocalypsenow.item;

import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.crafting.Ingredient;

public class FixedbaseballbatItem extends SwordItem {
   public FixedbaseballbatItem() {
      super(new Tier() {
         @Override
         public int getUses() {
            return 47;
         }

         @Override
         public float getSpeed() {
            return 2.0F;
         }

         @Override
         public float getAttackDamageBonus() {
            return -1.9F;
         }

         @Override
         public int getLevel() {
            return 1;
         }

         @Override
         public int getEnchantmentValue() {
            return 1;
         }

         @Override
         public Ingredient getRepairIngredient() {
            return Ingredient.of();
         }
      }, 3, -2.6F, new Properties());
   }
}

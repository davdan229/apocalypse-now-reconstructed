package net.mcreator.apocalypsenow.item;

import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.crafting.Ingredient;

public class SpoonItem extends ShovelItem {
   public SpoonItem() {
      super(new Tier() {
         @Override
         public int getUses() {
            return 25;
         }

         @Override
         public float getSpeed() {
            return 2.0F;
         }

         @Override
         public float getAttackDamageBonus() {
            return -1.6F;
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
      }, 1.0F, -2.3F, new Properties());
   }
}

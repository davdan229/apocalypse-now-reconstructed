package net.mcreator.apocalypsenow.item;

import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.crafting.Ingredient;

public class ConstructionshovelItem extends ShovelItem {
   public ConstructionshovelItem() {
      super(new Tier() {
         @Override
         public int getUses() {
            return 700;
         }

         @Override
         public float getSpeed() {
            return 7.0F;
         }

         @Override
         public float getAttackDamageBonus() {
            return 2.0F;
         }

         @Override
         public int getLevel() {
            return 4;
         }

         @Override
         public int getEnchantmentValue() {
            return 2;
         }

         @Override
         public Ingredient getRepairIngredient() {
            return Ingredient.of();
         }
      }, 1.0F, -3.1F, new Properties());
   }
}

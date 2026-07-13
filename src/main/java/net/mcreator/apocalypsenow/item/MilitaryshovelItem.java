package net.mcreator.apocalypsenow.item;

import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.crafting.Ingredient;

public class MilitaryshovelItem extends ShovelItem {
   public MilitaryshovelItem() {
      super(new Tier() {
         @Override
         public int getUses() {
            return 1000;
         }

         @Override
         public float getSpeed() {
            return 9.0F;
         }

         @Override
         public float getAttackDamageBonus() {
            return 0.0F;
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
            return Ingredient.of();
         }
      }, 1.0F, -3.1F, new Properties());
   }
}

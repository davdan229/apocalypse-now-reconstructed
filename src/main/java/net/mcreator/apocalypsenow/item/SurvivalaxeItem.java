package net.mcreator.apocalypsenow.item;

import net.mcreator.apocalypsenow.init.ApocalypsenowModItems;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.crafting.Ingredient;

public class SurvivalaxeItem extends PickaxeItem {
   public SurvivalaxeItem() {
      super(new Tier() {
         @Override
         public int getUses() {
            return 180;
         }

         @Override
         public float getSpeed() {
            return 5.0F;
         }

         @Override
         public float getAttackDamageBonus() {
            return 3.0F;
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
            return Ingredient.of(new ItemStack(ApocalypsenowModItems.SCRAPMETAL.get()), new ItemStack(ApocalypsenowModItems.DUCTTAPE.get()));
         }
      }, 1, -2.2F, new Properties());
   }
}

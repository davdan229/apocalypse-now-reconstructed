package net.mcreator.apocalypsenow.item;

import net.mcreator.apocalypsenow.init.ApocalypsenowModItems;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.crafting.Ingredient;

public class RoadsignItem extends SwordItem {
   public RoadsignItem() {
      super(
         new Tier() {
            @Override
            public int getUses() {
               return 212;
            }

            @Override
            public float getSpeed() {
               return 10.0F;
            }

            @Override
            public float getAttackDamageBonus() {
               return 3.0F;
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
               return Ingredient.of(
                  new ItemStack(Items.IRON_INGOT), new ItemStack(ApocalypsenowModItems.SCRAPMETAL.get()), new ItemStack(ApocalypsenowModItems.DUCTTAPE.get())
               );
            }
         },
         3,
         -3.3F,
         new Properties()
      );
   }
}

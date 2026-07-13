package net.mcreator.apocalypsenow.item;

import net.mcreator.apocalypsenow.init.ApocalypsenowModItems;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.crafting.Ingredient;

public class TouristAxeItem extends AxeItem {
   public TouristAxeItem() {
      super(
         new Tier() {
            @Override
            public int getUses() {
               return 197;
            }

            @Override
            public float getSpeed() {
               return 9.0F;
            }

            @Override
            public float getAttackDamageBonus() {
               return 2.0F;
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
               return Ingredient.of(
                  new ItemStack(ApocalypsenowModItems.DUCTTAPE.get()), new ItemStack(ApocalypsenowModItems.SCRAPMETAL.get()), new ItemStack(Items.IRON_INGOT)
               );
            }
         },
         1.0F,
         -3.0F,
         new Properties()
      );
   }
}

package net.mcreator.apocalypsenow.item;

import net.mcreator.apocalypsenow.init.ApocalypsenowModItems;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.crafting.Ingredient;

public class FireaxeItem extends AxeItem {
   public FireaxeItem() {
      super(
         new Tier() {
            @Override
            public int getUses() {
               return 300;
            }

            @Override
            public float getSpeed() {
               return 5.0F;
            }

            @Override
            public float getAttackDamageBonus() {
               return 5.5F;
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
                  new ItemStack(ApocalypsenowModItems.PLANK.get()),
                  new ItemStack(ApocalypsenowModItems.DUCTTAPE.get()),
                  new ItemStack(ApocalypsenowModItems.GLUE.get()),
                  new ItemStack(ApocalypsenowModItems.SCRAPMETAL.get()),
                  new ItemStack(Items.IRON_INGOT)
               );
            }
         },
         1.0F,
         -3.1F,
         new Properties()
      );
   }
}

package net.mcreator.apocalypsenow.item;

import net.mcreator.apocalypsenow.init.ApocalypsenowModItems;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.crafting.Ingredient;

public class GardenDiggingForkItem extends HoeItem {
   public GardenDiggingForkItem() {
      super(
         new Tier() {
            @Override
            public int getUses() {
               return 234;
            }

            @Override
            public float getSpeed() {
               return 4.0F;
            }

            @Override
            public float getAttackDamageBonus() {
               return 4.0F;
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
                  new ItemStack(ApocalypsenowModItems.SCRAPMETAL.get()), new ItemStack(Items.IRON_INGOT), new ItemStack(ApocalypsenowModItems.DUCTTAPE.get())
               );
            }
         },
         0,
         -2.7F,
         new Properties()
      );
   }
}

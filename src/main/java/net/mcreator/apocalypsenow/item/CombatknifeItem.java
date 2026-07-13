package net.mcreator.apocalypsenow.item;

import net.mcreator.apocalypsenow.init.ApocalypsenowModItems;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.crafting.Ingredient;

public class CombatknifeItem extends SwordItem {
   public CombatknifeItem() {
      super(
         new Tier() {
            @Override
            public int getUses() {
               return 400;
            }

            @Override
            public float getSpeed() {
               return 4.0F;
            }

            @Override
            public float getAttackDamageBonus() {
               return -1.5F;
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
                  new ItemStack(Items.IRON_INGOT), new ItemStack(ApocalypsenowModItems.DUCTTAPE.get()), new ItemStack(ApocalypsenowModItems.SCRAPMETAL.get())
               );
            }
         },
         3,
         -1.3F,
         new Properties()
      );
   }
}

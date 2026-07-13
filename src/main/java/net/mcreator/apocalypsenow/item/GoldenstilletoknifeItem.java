package net.mcreator.apocalypsenow.item;

import net.mcreator.apocalypsenow.init.ApocalypsenowModItems;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.crafting.Ingredient;

public class GoldenstilletoknifeItem extends SwordItem {
   public GoldenstilletoknifeItem() {
      super(
         new Tier() {
            @Override
            public int getUses() {
               return 120;
            }

            @Override
            public float getSpeed() {
               return 5.0F;
            }

            @Override
            public float getAttackDamageBonus() {
               return -2.0F;
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
                  new ItemStack(ApocalypsenowModItems.SCRAPMETAL.get()), new ItemStack(ApocalypsenowModItems.DUCTTAPE.get()), new ItemStack(Items.GOLD_NUGGET)
               );
            }
         },
         3,
         -0.6F,
         new Properties()
      );
   }
}

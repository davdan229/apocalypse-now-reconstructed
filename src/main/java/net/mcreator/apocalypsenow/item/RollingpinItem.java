package net.mcreator.apocalypsenow.item;

import net.mcreator.apocalypsenow.init.ApocalypsenowModItems;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;

public class RollingpinItem extends SwordItem {
   public RollingpinItem() {
      super(
         new Tier() {
            @Override
            public int getUses() {
               return 100;
            }

            @Override
            public float getSpeed() {
               return 4.0F;
            }

            @Override
            public float getAttackDamageBonus() {
               return -1.0F;
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
                  new ItemStack(Blocks.OAK_PLANKS), new ItemStack(ApocalypsenowModItems.GLUE.get()), new ItemStack(ApocalypsenowModItems.DUCTTAPE.get())
               );
            }
         },
         3,
         -2.8F,
         new Properties()
      );
   }
}

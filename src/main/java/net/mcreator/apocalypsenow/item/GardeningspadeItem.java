package net.mcreator.apocalypsenow.item;

import net.mcreator.apocalypsenow.init.ApocalypsenowModItems;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;

public class GardeningspadeItem extends ShovelItem {
   public GardeningspadeItem() {
      super(
         new Tier() {
            @Override
            public int getUses() {
               return 94;
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
                  new ItemStack(Blocks.OAK_PLANKS),
                  new ItemStack(ApocalypsenowModItems.GLUE.get()),
                  new ItemStack(ApocalypsenowModItems.DUCTTAPE.get()),
                  new ItemStack(ApocalypsenowModItems.PLASTIC.get())
               );
            }
         },
         1.0F,
         -3.0F,
         new Properties()
      );
   }
}

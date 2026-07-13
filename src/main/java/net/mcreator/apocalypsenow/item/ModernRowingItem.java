package net.mcreator.apocalypsenow.item;

import net.mcreator.apocalypsenow.init.ApocalypsenowModItems;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.crafting.Ingredient;

public class ModernRowingItem extends ShovelItem {
   public ModernRowingItem() {
      super(
         new Tier() {
            @Override
            public int getUses() {
               return 300;
            }

            @Override
            public float getSpeed() {
               return 4.0F;
            }

            @Override
            public float getAttackDamageBonus() {
               return 5.0F;
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
                  new ItemStack(ApocalypsenowModItems.DUCTTAPE.get()),
                  new ItemStack(ApocalypsenowModItems.PLANK.get()),
                  new ItemStack(ApocalypsenowModItems.PLASTIC.get())
               );
            }
         },
         1.0F,
         -3.2F,
         new Properties()
      );
   }
}

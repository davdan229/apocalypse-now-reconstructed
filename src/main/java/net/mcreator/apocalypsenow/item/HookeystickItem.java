package net.mcreator.apocalypsenow.item;

import net.mcreator.apocalypsenow.init.ApocalypsenowModItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.crafting.CompoundIngredient;

public class HookeystickItem extends SwordItem {
   public HookeystickItem() {
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
               return -0.6F;
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
               return CompoundIngredient.of(
                  Ingredient.of(new ItemStack(ApocalypsenowModItems.DUCTTAPE.get())), Ingredient.of(ItemTags.create(new ResourceLocation("minecraft:planks")))
               );
            }
         },
         3,
         -2.7F,
         new Properties()
      );
   }
}

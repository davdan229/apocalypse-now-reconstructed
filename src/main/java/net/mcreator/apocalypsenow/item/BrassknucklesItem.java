package net.mcreator.apocalypsenow.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.crafting.CompoundIngredient;

public class BrassknucklesItem extends SwordItem {
   public BrassknucklesItem() {
      super(
         new Tier() {
            @Override
            public int getUses() {
               return 200;
            }

            @Override
            public float getSpeed() {
               return 4.0F;
            }

            @Override
            public float getAttackDamageBonus() {
               return 0.3F;
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
                  Ingredient.of(new ItemStack(Items.IRON_INGOT)), Ingredient.of(ItemTags.create(new ResourceLocation("minecraft:ingots/brass_ingot")))
               );
            }
         },
         3,
         -1.0F,
         new Properties()
      );
   }
}

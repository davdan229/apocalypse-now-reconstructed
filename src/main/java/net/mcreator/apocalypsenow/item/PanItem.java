package net.mcreator.apocalypsenow.item;

import net.mcreator.apocalypsenow.init.ApocalypsenowModItems;
import net.mcreator.apocalypsenow.procedures.PanLivingEntityIsHitWithToolProcedure;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.crafting.Ingredient;

public class PanItem extends SwordItem {
   public PanItem() {
      super(
         new Tier() {
            @Override
            public int getUses() {
               return 123;
            }

            @Override
            public float getSpeed() {
               return 4.0F;
            }

            @Override
            public float getAttackDamageBonus() {
               return 1.0F;
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
                  new ItemStack(ApocalypsenowModItems.SCRAPMETAL.get()), new ItemStack(ApocalypsenowModItems.DUCTTAPE.get()), new ItemStack(Items.IRON_INGOT)
               );
            }
         },
         3,
         -2.8F,
         new Properties()
      );
   }

   @Override
   public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
      boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
      PanLivingEntityIsHitWithToolProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ());
      return retval;
   }
}

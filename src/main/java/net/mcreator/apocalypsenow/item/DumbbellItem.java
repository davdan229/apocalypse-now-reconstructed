package net.mcreator.apocalypsenow.item;

import net.mcreator.apocalypsenow.procedures.BarbellToolInHandTickProcedure;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;

public class DumbbellItem extends PickaxeItem {
   public DumbbellItem() {
      super(new Tier() {
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
            return 7.5F;
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
            return Ingredient.of(new ItemStack(Items.IRON_INGOT));
         }
      }, 1, -3.7F, new Properties());
   }

   @Override
   public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
      super.inventoryTick(itemstack, world, entity, slot, selected);
      if (selected) {
         BarbellToolInHandTickProcedure.execute(entity);
      }
   }
}

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

public class BarbellItem extends PickaxeItem {
   public BarbellItem() {
      super(new Tier() {
         @Override
         public int getUses() {
            return 458;
         }

         @Override
         public float getSpeed() {
            return 4.0F;
         }

         @Override
         public float getAttackDamageBonus() {
            return 10.5F;
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
      }, 1, -3.9F, new Properties());
   }

   @Override
   public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
      super.inventoryTick(itemstack, world, entity, slot, selected);
      if (selected) {
         BarbellToolInHandTickProcedure.execute(entity);
      }
   }
}

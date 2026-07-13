package net.mcreator.apocalypsenow.item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ShieldItem;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.crafting.Ingredient;

public class StopsignshieldItem extends ShieldItem {
   public StopsignshieldItem() {
      super(new Properties().durability(80));
   }

   @Override
   public boolean isValidRepairItem(ItemStack itemstack, ItemStack repairitem) {
      return Ingredient.of(new ItemStack(Items.IRON_INGOT)).test(repairitem);
   }
}

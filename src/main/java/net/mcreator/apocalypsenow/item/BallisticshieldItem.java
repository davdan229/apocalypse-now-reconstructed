package net.mcreator.apocalypsenow.item;

import net.mcreator.apocalypsenow.init.ApocalypsenowModItems;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ShieldItem;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.crafting.Ingredient;

public class BallisticshieldItem extends ShieldItem {
   public BallisticshieldItem() {
      super(new Properties().durability(450));
   }

   @Override
   public boolean isValidRepairItem(ItemStack itemstack, ItemStack repairitem) {
      return Ingredient.of(new ItemStack(Items.IRON_INGOT), new ItemStack(ApocalypsenowModItems.ARMORPLATE.get())).test(repairitem);
   }
}

package net.mcreator.apocalypsenow.item;

import net.mcreator.apocalypsenow.init.ApocalypsenowModItems;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ShieldItem;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.crafting.Ingredient;

public class PoliceshieldItem extends ShieldItem {
   public PoliceshieldItem() {
      super(new Properties().durability(120));
   }

   @Override
   public boolean isValidRepairItem(ItemStack itemstack, ItemStack repairitem) {
      return Ingredient.of(new ItemStack(Items.IRON_INGOT), new ItemStack(ApocalypsenowModItems.PLASTICPLATE.get())).test(repairitem);
   }
}

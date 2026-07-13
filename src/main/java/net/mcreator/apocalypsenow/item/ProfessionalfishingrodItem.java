package net.mcreator.apocalypsenow.item;

import net.mcreator.apocalypsenow.init.ApocalypsenowModItems;
import net.minecraft.world.item.FishingRodItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.crafting.Ingredient;

public class ProfessionalfishingrodItem extends FishingRodItem {
   public ProfessionalfishingrodItem() {
      super(new Properties().durability(460));
   }

   @Override
   public boolean isValidRepairItem(ItemStack itemstack, ItemStack repairitem) {
      return Ingredient.of(new ItemStack(ApocalypsenowModItems.DUCTTAPE.get()), new ItemStack(Items.IRON_INGOT)).test(repairitem);
   }

   @Override
   public int getEnchantmentValue() {
      return 1;
   }
}

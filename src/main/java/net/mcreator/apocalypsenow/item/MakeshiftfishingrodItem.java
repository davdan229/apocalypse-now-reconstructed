package net.mcreator.apocalypsenow.item;

import net.mcreator.apocalypsenow.init.ApocalypsenowModItems;
import net.minecraft.world.item.FishingRodItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.crafting.Ingredient;

public class MakeshiftfishingrodItem extends FishingRodItem {
   public MakeshiftfishingrodItem() {
      super(new Properties().durability(30));
   }

   @Override
   public boolean isValidRepairItem(ItemStack itemstack, ItemStack repairitem) {
      return Ingredient.of(new ItemStack(ApocalypsenowModItems.SCRAPMETAL.get()), new ItemStack(ApocalypsenowModItems.DUCTTAPE.get())).test(repairitem);
   }

   @Override
   public int getEnchantmentValue() {
      return 1;
   }
}

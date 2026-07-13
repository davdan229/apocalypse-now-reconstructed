package net.mcreator.apocalypsenow.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ShieldItem;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.crafting.Ingredient;

public class RiotshieldItem extends ShieldItem {
   public RiotshieldItem() {
      super(new Properties().durability(110));
   }

   @Override
   public boolean isValidRepairItem(ItemStack itemstack, ItemStack repairitem) {
      return Ingredient.of(ItemTags.create(new ResourceLocation("forge:stained_glass"))).test(repairitem);
   }
}

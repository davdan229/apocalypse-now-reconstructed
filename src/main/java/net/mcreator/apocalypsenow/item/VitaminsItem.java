package net.mcreator.apocalypsenow.item;

import net.mcreator.apocalypsenow.procedures.VitaminsPlayerFinishesUsingItemProcedure;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.food.FoodProperties.Builder;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.level.Level;

public class VitaminsItem extends Item {
   public VitaminsItem() {
      super(new Properties().stacksTo(64).rarity(Rarity.COMMON).food(new Builder().nutrition(1).saturationMod(0.1F).alwaysEat().build()));
   }

   @Override
   public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
      ItemStack retval = super.finishUsingItem(itemstack, world, entity);
      double x = entity.getX();
      double y = entity.getY();
      double z = entity.getZ();
      VitaminsPlayerFinishesUsingItemProcedure.execute(entity);
      return retval;
   }
}

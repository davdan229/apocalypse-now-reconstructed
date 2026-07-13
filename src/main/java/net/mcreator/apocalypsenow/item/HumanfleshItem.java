package net.mcreator.apocalypsenow.item;

import net.mcreator.apocalypsenow.procedures.HumanfleshPlayerFinishesUsingItemProcedure;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.food.FoodProperties.Builder;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.level.Level;

public class HumanfleshItem extends Item {
   public HumanfleshItem() {
      super(new Properties().stacksTo(64).rarity(Rarity.COMMON).food(new Builder().nutrition(2).saturationMod(0.2F).meat().build()));
   }

   @Override
   public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
      ItemStack retval = super.finishUsingItem(itemstack, world, entity);
      double x = entity.getX();
      double y = entity.getY();
      double z = entity.getZ();
      HumanfleshPlayerFinishesUsingItemProcedure.execute(entity);
      return retval;
   }
}

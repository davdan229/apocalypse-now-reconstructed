package net.mcreator.apocalypsenow.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.LevelAccessor;

public class IroncanteenrightclickProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
      CanteenRightclickedProcedure.drink(world, entity, itemstack, 9, 50);
   }
}

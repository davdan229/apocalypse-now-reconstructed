package net.mcreator.apocalypsenow.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.ItemStack;

public class FirstaidbookRightClickedInAirProcedure {
   public static void execute(Entity entity, ItemStack itemstack) {
      ReadableItemProcedure.unlockAdvancement(entity, itemstack, "apocalypsenow:firstworld_doctor");
   }
}

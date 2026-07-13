package net.mcreator.apocalypsenow.procedures;

import net.mcreator.apocalypsenow.init.ApocalypsenowModBlocks;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.LevelAccessor;

public class TrashRightclickedOnBlockProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
      TrashBaggingProcedure.execute(world, x, y, z, entity, itemstack, ApocalypsenowModBlocks.TRASHBAG.get().asItem());
   }
}

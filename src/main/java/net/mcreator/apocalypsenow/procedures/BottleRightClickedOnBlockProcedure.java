package net.mcreator.apocalypsenow.procedures;

import net.mcreator.apocalypsenow.init.ApocalypsenowModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUtils;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;

public class BottleRightClickedOnBlockProcedure {
   public static boolean execute(
      LevelAccessor world, double x, double y, double z, Entity entity, InteractionHand hand, ItemStack bottle
   ) {
      if (!(world instanceof Level level) || !(entity instanceof Player player)) {
         return false;
      }
      BlockPos pos = BlockPos.containing(x, y, z);
      boolean water = level.getFluidState(pos).is(FluidTags.WATER) || level.getFluidState(pos.above()).is(FluidTags.WATER);
      if (!water) {
         return false;
      }
      if (!level.isClientSide()) {
         ItemStack filled = ItemUtils.createFilledResult(bottle, player, new ItemStack(ApocalypsenowModItems.CONTAMINATED_WATER.get()));
         player.setItemInHand(hand, filled);
         level.playSound(null, pos, SoundEvents.BOTTLE_FILL, SoundSource.PLAYERS, 1.0F, 1.0F);
      }
      return true;
   }
}

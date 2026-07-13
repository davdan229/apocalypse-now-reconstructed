package net.mcreator.apocalypsenow.procedures;

import net.mcreator.apocalypsenow.init.ApocalypsenowModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUtils;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;

public class RainCollectorFullOnBlockRightClickedProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, InteractionHand hand) {
      if (!(world instanceof Level level) || level.isClientSide() || !(entity instanceof Player player)) return;
      ItemStack held = player.getItemInHand(hand);
      if (!held.is(Items.BUCKET)) return;
      player.setItemInHand(hand, ItemUtils.createFilledResult(held, player, new ItemStack(Items.WATER_BUCKET)));
      BlockPos position = BlockPos.containing(x, y, z);
      level.playSound(null, position, SoundEvents.BUCKET_FILL, SoundSource.BLOCKS, 1.0F, 1.0F);
      level.setBlock(position, ApocalypsenowModBlocks.RAIN_COLLECTOR.get().defaultBlockState(), 3);
   }
}

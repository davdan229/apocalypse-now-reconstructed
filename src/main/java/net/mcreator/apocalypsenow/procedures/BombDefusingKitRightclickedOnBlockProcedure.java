package net.mcreator.apocalypsenow.procedures;

import net.mcreator.apocalypsenow.init.ApocalypsenowModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.items.ItemHandlerHelper;

public class BombDefusingKitRightclickedOnBlockProcedure {
   public static boolean execute(LevelAccessor world, double x, double y, double z, Player player, ItemStack itemstack, InteractionHand hand) {
      BlockPos position = BlockPos.containing(x, y, z);
      Block target = world.getBlockState(position).getBlock();
      if (target != ApocalypsenowModBlocks.LAND_MINE.get() && target != ApocalypsenowModBlocks.TRIPWIRE_BOMB.get()) return false;
      if (!(world instanceof Level level) || level.isClientSide() || player == null || itemstack.isEmpty()) return true;
      level.destroyBlock(position, false, player);
      level.levelEvent(2001, position, Block.getId(target.defaultBlockState()));
      level.playSound(null, position, SoundEvents.IRON_TRAPDOOR_CLOSE, SoundSource.BLOCKS, 1.0F, 1.0F);
      ItemHandlerHelper.giveItemToPlayer(player, new ItemStack(target));
      itemstack.hurtAndBreak(1, player, owner -> owner.broadcastBreakEvent(hand));
      return true;
   }
}

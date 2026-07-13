package net.mcreator.apocalypsenow.procedures;

import net.mcreator.apocalypsenow.init.ApocalypsenowModParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.registries.ForgeRegistries;

public class ChainsawRightclickedOnBlockProcedure {
   public static boolean execute(LevelAccessor world, double x, double y, double z, Player player, ItemStack itemstack, InteractionHand hand) {
      BlockPos position = BlockPos.containing(x, y, z);
      var state = world.getBlockState(position);
      if (!state.is(BlockTags.LOGS) && !state.is(BlockTags.MINEABLE_WITH_AXE)) return false;
      if (!(world instanceof ServerLevel level) || player == null || itemstack.isEmpty()) return true;
      level.destroyBlock(position, true, player);
      level.playSound(null, position, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("apocalypsenow:chainsaw_new")), SoundSource.PLAYERS, 0.6F, 1.0F);
      level.sendParticles(ApocalypsenowModParticleTypes.SMOKE_1.get(), x, y + 0.5, z, 3, 0.15, 0.25, 0.15, 0.02);
      itemstack.hurtAndBreak(1, player, owner -> owner.broadcastBreakEvent(hand));
      return true;
   }
}

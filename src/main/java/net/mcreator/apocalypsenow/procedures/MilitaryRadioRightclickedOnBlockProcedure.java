package net.mcreator.apocalypsenow.procedures;

import net.mcreator.apocalypsenow.init.ApocalypsenowModBlocks;
import net.mcreator.apocalypsenow.init.ApocalypsenowModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.registries.ForgeRegistries;

public class MilitaryRadioRightclickedOnBlockProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
      BlockPos position = BlockPos.containing(x, y, z);
      if (!(world instanceof ServerLevel level) || !(entity instanceof Player player) || itemstack.isEmpty()
         || world.getBlockState(position).getBlock() != ApocalypsenowModBlocks.MILITARY_COMMUNICATION_RADIO.get()) return;
      itemstack.shrink(1);
      ItemHandlerHelper.giveItemToPlayer(player, new ItemStack(ApocalypsenowModItems.MILITARY_AIRDROP_RADIO.get()));
      level.playSound(null, position, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("apocalypsenow:button-click")), SoundSource.NEUTRAL, 1.0F, 1.0F);
   }
}

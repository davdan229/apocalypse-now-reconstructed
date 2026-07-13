package net.mcreator.apocalypsenow.procedures;

import net.mcreator.apocalypsenow.init.ApocalypsenowModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.registries.ForgeRegistries;

final class TrashBaggingProcedure {
   private TrashBaggingProcedure() {
   }

   static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack, Item bag) {
      if (!(world instanceof ServerLevel level) || !(entity instanceof Player player) || itemstack.isEmpty()) return;
      BlockPos position = BlockPos.containing(x, y, z);
      var block = world.getBlockState(position).getBlock();
      if (block != ApocalypsenowModBlocks.TRASH_BIN.get()
         && block != ApocalypsenowModBlocks.TRASHCANN.get()
         && block != ApocalypsenowModBlocks.TRASHCAN_1.get()) return;
      var blockEntity = world.getBlockEntity(position);
      if (blockEntity == null) return;
      IItemHandlerModifiable inventory = blockEntity.getCapability(ForgeCapabilities.ITEM_HANDLER).filter(IItemHandlerModifiable.class::isInstance)
         .map(IItemHandlerModifiable.class::cast).orElse(null);
      if (inventory == null) return;
      for (int slot = 0; slot < inventory.getSlots(); slot++) {
         inventory.setStackInSlot(slot, ItemStack.EMPTY);
      }
      itemstack.shrink(1);
      ItemHandlerHelper.giveItemToPlayer(player, new ItemStack(bag));
      level.playSound(null, position, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("apocalypsenow:trash_place")), SoundSource.NEUTRAL, 1.0F, 1.0F);
   }
}

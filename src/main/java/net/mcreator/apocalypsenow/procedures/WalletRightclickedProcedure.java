package net.mcreator.apocalypsenow.procedures;

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

public class WalletRightclickedProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
      if (!(world instanceof ServerLevel level) || !(entity instanceof Player player) || itemstack.isEmpty()) return;
      itemstack.shrink(1);
      level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("apocalypsenow:coins")), SoundSource.NEUTRAL, 1.0F, 1.0F);
      give(player, ApocalypsenowModItems.MONEY.get().getDefaultInstance(), 5);
      give(player, ApocalypsenowModItems.COINS.get().getDefaultInstance(), 19);
      if (player.getRandom().nextFloat() < 0.7F) {
         give(player, ApocalypsenowModItems.MONEY.get().getDefaultInstance(), 3);
         give(player, ApocalypsenowModItems.COINS.get().getDefaultInstance(), 22);
      }
      if (player.getRandom().nextFloat() < 0.5F) {
         give(player, ApocalypsenowModItems.MONEY.get().getDefaultInstance(), 3);
         give(player, ApocalypsenowModItems.COINS.get().getDefaultInstance(), 22);
         give(player, ApocalypsenowModItems.CREDIT_CARD.get().getDefaultInstance(), 1);
      }
      if (player.getRandom().nextFloat() < 0.2F) {
         give(player, ApocalypsenowModItems.MONEY.get().getDefaultInstance(), 9);
         give(player, ApocalypsenowModItems.COINS.get().getDefaultInstance(), 9);
         give(player, ApocalypsenowModItems.CREDIT_CARD.get().getDefaultInstance(), 1);
      }
   }

   private static void give(Player player, ItemStack stack, int count) {
      stack.setCount(count);
      ItemHandlerHelper.giveItemToPlayer(player, stack);
   }
}

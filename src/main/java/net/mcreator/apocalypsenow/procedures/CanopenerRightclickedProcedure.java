package net.mcreator.apocalypsenow.procedures;

import java.util.Map;
import net.mcreator.apocalypsenow.init.ApocalypsenowModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.items.ItemHandlerHelper;

public class CanopenerRightclickedProcedure {
   private static final Map<Item, Item> OPENED_CANS = Map.ofEntries(
      Map.entry(ApocalypsenowModItems.CANNED_FOOD.get(), ApocalypsenowModItems.OPEN_CANNED_FOOD.get()),
      Map.entry(ApocalypsenowModItems.CANNED_SOUP.get(), ApocalypsenowModItems.OPEN_CANNED_SOUP.get()),
      Map.entry(ApocalypsenowModItems.CANNED_PORK.get(), ApocalypsenowModItems.OPEN_CANNED_PORK.get()),
      Map.entry(ApocalypsenowModItems.CANNED_BEANS.get(), ApocalypsenowModItems.OPEN_CANNED_BEANS.get()),
      Map.entry(ApocalypsenowModItems.CANNED_RABBIT_SOUP.get(), ApocalypsenowModItems.OPEN_CANNED_RABBIT_SOUP.get()),
      Map.entry(ApocalypsenowModItems.CANNED_CORN.get(), ApocalypsenowModItems.OPEN_CANNED_CORN.get()),
      Map.entry(ApocalypsenowModItems.CANNED_FISH.get(), ApocalypsenowModItems.OPEN_CANNED_FISH.get()),
      Map.entry(ApocalypsenowModItems.CANNED_STRAWBERRY.get(), ApocalypsenowModItems.OPEN_CANNED_STRAWBERRY.get()),
      Map.entry(ApocalypsenowModItems.CANNED_CARROT.get(), ApocalypsenowModItems.OPEN_CANNED_CARROT.get()),
      Map.entry(ApocalypsenowModItems.CANNED_MELON.get(), ApocalypsenowModItems.OPEN_CANNED_MELON.get()),
      Map.entry(ApocalypsenowModItems.CANNED_BEETROOT.get(), ApocalypsenowModItems.OPEN_CANNED_BEETROOT.get()),
      Map.entry(ApocalypsenowModItems.DOGS_FOOD.get(), ApocalypsenowModItems.OPEN_DOGS_FOOD.get()),
      Map.entry(ApocalypsenowModItems.CANNED_TOMATOS.get(), ApocalypsenowModItems.OPEN_CANNED_TOMATOS.get()),
      Map.entry(ApocalypsenowModItems.CANNED_CHILI.get(), ApocalypsenowModItems.OPEN_CANNED_CHILI.get())
   );

   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack opener) {
      if (!(world instanceof Level level) || level.isClientSide() || !(entity instanceof Player player)) {
         return;
      }

      ItemStack can = player.getOffhandItem();
      Item opened = OPENED_CANS.get(can.getItem());
      if (opened == null || can.isEmpty()) {
         return;
      }

      can.shrink(1);
      ItemHandlerHelper.giveItemToPlayer(player, new ItemStack(opened));
      opener.hurtAndBreak(1, player, owner -> owner.broadcastBreakEvent(EquipmentSlot.MAINHAND));
      level.playSound(null, BlockPos.containing(x, y, z), net.mcreator.apocalypsenow.init.ApocalypsenowModSounds.CANOPENER.get(), SoundSource.PLAYERS, 1.0F, 0.7F);
   }
}

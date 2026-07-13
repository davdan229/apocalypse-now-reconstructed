package net.mcreator.apocalypsenow.item;

import java.util.Map;
import net.mcreator.apocalypsenow.ApocalypsenowMod;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.registries.ForgeRegistries;
import top.theillusivec4.curios.api.CuriosApi;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.type.capability.ICurioItem;
import top.theillusivec4.curios.api.type.capability.ICuriosItemHandler;
import top.theillusivec4.curios.api.type.inventory.ICurioStacksHandler;

/** Equips every Apocalypse Now Curios accessory from the hand on right-click. */
@EventBusSubscriber(modid = ApocalypsenowMod.MODID)
public final class ApocalypsenowCurioEquipHandler {
   private ApocalypsenowCurioEquipHandler() {
   }

   @SubscribeEvent
   public static void onRightClickItem(PlayerInteractEvent.RightClickItem event) {
      Player player = event.getEntity();
      ItemStack held = event.getItemStack();
      var itemId = ForgeRegistries.ITEMS.getKey(held.getItem());
      if (!(held.getItem() instanceof ICurioItem) || itemId == null || !ApocalypsenowMod.MODID.equals(itemId.getNamespace())) {
         return;
      }

      ICuriosItemHandler inventory = CuriosApi.getCuriosInventory(player).resolve().orElse(null);
      if (inventory == null) {
         return;
      }

      Map<String, ?> allowedSlots = CuriosApi.getItemStackSlots(held, player);
      Candidate empty = null;
      Candidate occupied = null;
      ItemStack one = held.copy();
      one.setCount(1);
      for (String slotId : allowedSlots.keySet()) {
         ICurioStacksHandler slot = inventory.getStacksHandler(slotId).orElse(null);
         if (slot == null) {
            continue;
         }
         for (int index = 0; index < slot.getSlots(); index++) {
            SlotContext context = new SlotContext(slotId, player, index, false, true);
            if (!slot.getStacks().isItemValid(index, one) || !CuriosApi.isStackValid(context, one)) {
               continue;
            }
            ItemStack present = slot.getStacks().getStackInSlot(index);
            if (present.isEmpty()) {
               empty = new Candidate(slotId, index, ItemStack.EMPTY);
               break;
            }
            if (occupied == null && !slot.getStacks().extractItem(index, 1, true).isEmpty()) {
               occupied = new Candidate(slotId, index, present.copy());
            }
         }
         if (empty != null) {
            break;
         }
      }

      Candidate target = empty != null ? empty : occupied;
      if (target == null) {
         return;
      }

      if (!player.level().isClientSide) {
         inventory.setEquippedCurio(target.slotId(), target.index(), one);
         if (target.replaced().isEmpty()) {
            held.shrink(1);
         } else if (held.getCount() == 1) {
            player.setItemInHand(event.getHand(), target.replaced());
         } else {
            held.shrink(1);
            if (!player.getInventory().add(target.replaced())) {
               player.drop(target.replaced(), false);
            }
         }
         player.level().playSound(null, player.blockPosition(), SoundEvents.ARMOR_EQUIP_GENERIC, SoundSource.PLAYERS, 1.0F, 1.0F);
      }

      event.setCanceled(true);
      event.setCancellationResult(InteractionResult.sidedSuccess(player.level().isClientSide));
   }

   private record Candidate(String slotId, int index, ItemStack replaced) {
   }
}

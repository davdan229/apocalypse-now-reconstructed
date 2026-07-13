package net.mcreator.apocalypsenow.world.inventory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
import net.mcreator.apocalypsenow.init.ApocalypsenowModMenus;
import net.mcreator.apocalypsenow.procedures.HiddenstashGUIThisGUIIsClosedProcedure;
import net.mcreator.apocalypsenow.procedures.HiddenstashGUIThisGUIIsOpenedProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.items.SlotItemHandler;

public class SuplyshelvesboxGUIMenu extends AbstractContainerMenu implements Supplier<Map<Integer, Slot>> {
   public static final HashMap<String, Object> guistate = new HashMap<>();
   public final Level world;
   public final Player entity;
   public int x;
   public int y;
   public int z;
   private ContainerLevelAccess access = ContainerLevelAccess.NULL;
   private IItemHandler internal;
   private final Map<Integer, Slot> customSlots = new HashMap<>();
   private boolean bound = false;
   private Supplier<Boolean> boundItemMatcher = null;
   private Entity boundEntity = null;
   private BlockEntity boundBlockEntity = null;

   public SuplyshelvesboxGUIMenu(int id, Inventory inv, FriendlyByteBuf extraData) {
      super(ApocalypsenowModMenus.SUPLYSHELVESBOX_GUI.get(), id);
      this.entity = inv.player;
      this.world = inv.player.level();
      this.internal = new ItemStackHandler(45);
      BlockPos pos = null;
      if (extraData != null) {
         pos = extraData.readBlockPos();
         this.x = pos.getX();
         this.y = pos.getY();
         this.z = pos.getZ();
         this.access = ContainerLevelAccess.create(this.world, pos);
      }

      if (pos != null) {
         if (extraData.readableBytes() == 1) {
            byte hand = extraData.readByte();
            ItemStack itemstack = hand == 0 ? this.entity.getMainHandItem() : this.entity.getOffhandItem();
            this.boundItemMatcher = () -> itemstack == (hand == 0 ? this.entity.getMainHandItem() : this.entity.getOffhandItem());
            itemstack.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
               this.internal = capability;
               this.bound = true;
            });
         } else if (extraData.readableBytes() > 1) {
            extraData.readByte();
            this.boundEntity = this.world.getEntity(extraData.readVarInt());
            if (this.boundEntity != null) {
               this.boundEntity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
                  this.internal = capability;
                  this.bound = true;
               });
            }
         } else {
            this.boundBlockEntity = this.world.getBlockEntity(pos);
            if (this.boundBlockEntity != null) {
               this.boundBlockEntity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
                  this.internal = capability;
                  this.bound = true;
               });
            }
         }
      }

      this.customSlots.put(0, this.addSlot(new SlotItemHandler(this.internal, 0, 7, 22) {
         private final int slot = 0;
      }));
      this.customSlots.put(1, this.addSlot(new SlotItemHandler(this.internal, 1, 25, 22) {
         private final int slot = 1;
      }));
      this.customSlots.put(2, this.addSlot(new SlotItemHandler(this.internal, 2, 43, 22) {
         private final int slot = 2;
      }));
      this.customSlots.put(3, this.addSlot(new SlotItemHandler(this.internal, 3, 61, 22) {
         private final int slot = 3;
      }));
      this.customSlots.put(4, this.addSlot(new SlotItemHandler(this.internal, 4, 79, 22) {
         private final int slot = 4;
      }));
      this.customSlots.put(5, this.addSlot(new SlotItemHandler(this.internal, 5, 97, 22) {
         private final int slot = 5;
      }));
      this.customSlots.put(6, this.addSlot(new SlotItemHandler(this.internal, 6, 115, 22) {
         private final int slot = 6;
      }));
      this.customSlots.put(7, this.addSlot(new SlotItemHandler(this.internal, 7, 133, 22) {
         private final int slot = 7;
      }));
      this.customSlots.put(8, this.addSlot(new SlotItemHandler(this.internal, 8, 151, 22) {
         private final int slot = 8;
      }));
      this.customSlots.put(9, this.addSlot(new SlotItemHandler(this.internal, 9, 7, 40) {
         private final int slot = 9;
      }));
      this.customSlots.put(10, this.addSlot(new SlotItemHandler(this.internal, 10, 25, 40) {
         private final int slot = 10;
      }));
      this.customSlots.put(11, this.addSlot(new SlotItemHandler(this.internal, 11, 43, 40) {
         private final int slot = 11;
      }));
      this.customSlots.put(12, this.addSlot(new SlotItemHandler(this.internal, 12, 61, 40) {
         private final int slot = 12;
      }));
      this.customSlots.put(13, this.addSlot(new SlotItemHandler(this.internal, 13, 79, 40) {
         private final int slot = 13;
      }));
      this.customSlots.put(14, this.addSlot(new SlotItemHandler(this.internal, 14, 97, 40) {
         private final int slot = 14;
      }));
      this.customSlots.put(15, this.addSlot(new SlotItemHandler(this.internal, 15, 115, 40) {
         private final int slot = 15;
      }));
      this.customSlots.put(16, this.addSlot(new SlotItemHandler(this.internal, 16, 133, 40) {
         private final int slot = 16;
      }));
      this.customSlots.put(17, this.addSlot(new SlotItemHandler(this.internal, 17, 151, 40) {
         private final int slot = 17;
      }));
      this.customSlots.put(18, this.addSlot(new SlotItemHandler(this.internal, 18, 7, 58) {
         private final int slot = 18;
      }));
      this.customSlots.put(19, this.addSlot(new SlotItemHandler(this.internal, 19, 25, 58) {
         private final int slot = 19;
      }));
      this.customSlots.put(20, this.addSlot(new SlotItemHandler(this.internal, 20, 43, 58) {
         private final int slot = 20;
      }));
      this.customSlots.put(21, this.addSlot(new SlotItemHandler(this.internal, 21, 61, 58) {
         private final int slot = 21;
      }));
      this.customSlots.put(22, this.addSlot(new SlotItemHandler(this.internal, 22, 79, 58) {
         private final int slot = 22;
      }));
      this.customSlots.put(23, this.addSlot(new SlotItemHandler(this.internal, 23, 97, 58) {
         private final int slot = 23;
      }));
      this.customSlots.put(24, this.addSlot(new SlotItemHandler(this.internal, 24, 115, 58) {
         private final int slot = 24;
      }));
      this.customSlots.put(25, this.addSlot(new SlotItemHandler(this.internal, 25, 133, 58) {
         private final int slot = 25;
      }));
      this.customSlots.put(26, this.addSlot(new SlotItemHandler(this.internal, 26, 151, 58) {
         private final int slot = 26;
      }));
      this.customSlots.put(27, this.addSlot(new SlotItemHandler(this.internal, 27, 7, 76) {
         private final int slot = 27;
      }));
      this.customSlots.put(28, this.addSlot(new SlotItemHandler(this.internal, 28, 25, 76) {
         private final int slot = 28;
      }));
      this.customSlots.put(29, this.addSlot(new SlotItemHandler(this.internal, 29, 43, 76) {
         private final int slot = 29;
      }));
      this.customSlots.put(30, this.addSlot(new SlotItemHandler(this.internal, 30, 61, 76) {
         private final int slot = 30;
      }));
      this.customSlots.put(31, this.addSlot(new SlotItemHandler(this.internal, 31, 79, 76) {
         private final int slot = 31;
      }));
      this.customSlots.put(32, this.addSlot(new SlotItemHandler(this.internal, 32, 97, 76) {
         private final int slot = 32;
      }));
      this.customSlots.put(33, this.addSlot(new SlotItemHandler(this.internal, 33, 115, 76) {
         private final int slot = 33;
      }));
      this.customSlots.put(34, this.addSlot(new SlotItemHandler(this.internal, 34, 133, 76) {
         private final int slot = 34;
      }));
      this.customSlots.put(35, this.addSlot(new SlotItemHandler(this.internal, 35, 151, 76) {
         private final int slot = 35;
      }));
      this.customSlots.put(36, this.addSlot(new SlotItemHandler(this.internal, 36, 7, 94) {
         private final int slot = 36;
      }));
      this.customSlots.put(37, this.addSlot(new SlotItemHandler(this.internal, 37, 25, 94) {
         private final int slot = 37;
      }));
      this.customSlots.put(38, this.addSlot(new SlotItemHandler(this.internal, 38, 43, 94) {
         private final int slot = 38;
      }));
      this.customSlots.put(39, this.addSlot(new SlotItemHandler(this.internal, 39, 61, 94) {
         private final int slot = 39;
      }));
      this.customSlots.put(40, this.addSlot(new SlotItemHandler(this.internal, 40, 79, 94) {
         private final int slot = 40;
      }));
      this.customSlots.put(41, this.addSlot(new SlotItemHandler(this.internal, 41, 97, 94) {
         private final int slot = 41;
      }));
      this.customSlots.put(42, this.addSlot(new SlotItemHandler(this.internal, 42, 115, 94) {
         private final int slot = 42;
      }));
      this.customSlots.put(43, this.addSlot(new SlotItemHandler(this.internal, 43, 133, 94) {
         private final int slot = 43;
      }));
      this.customSlots.put(44, this.addSlot(new SlotItemHandler(this.internal, 44, 151, 94) {
         private final int slot = 44;
      }));

      for (int si = 0; si < 3; si++) {
         for (int sj = 0; sj < 9; sj++) {
            this.addSlot(new Slot(inv, sj + (si + 1) * 9, 7 + sj * 18, 129 + si * 18));
         }
      }

      for (int si = 0; si < 9; si++) {
         this.addSlot(new Slot(inv, si, 7 + si * 18, 187));
      }

      HiddenstashGUIThisGUIIsOpenedProcedure.execute(this.world, this.x, this.y, this.z);
   }

   @Override
   public boolean stillValid(Player player) {
      if (this.bound) {
         if (this.boundItemMatcher != null) {
            return this.boundItemMatcher.get();
         }

         if (this.boundBlockEntity != null) {
            return AbstractContainerMenu.stillValid(this.access, player, this.boundBlockEntity.getBlockState().getBlock());
         }

         if (this.boundEntity != null) {
            return this.boundEntity.isAlive();
         }
      }

      return true;
   }

   @Override
   public ItemStack quickMoveStack(Player playerIn, int index) {
      ItemStack itemstack = ItemStack.EMPTY;
      Slot slot = this.slots.get(index);
      if (slot != null && slot.hasItem()) {
         ItemStack itemstack1 = slot.getItem();
         itemstack = itemstack1.copy();
         if (index < 45) {
            if (!this.moveItemStackTo(itemstack1, 45, this.slots.size(), true)) {
               return ItemStack.EMPTY;
            }

            slot.onQuickCraft(itemstack1, itemstack);
         } else if (!this.moveItemStackTo(itemstack1, 0, 45, false)) {
            if (index < 72) {
               if (!this.moveItemStackTo(itemstack1, 72, this.slots.size(), true)) {
                  return ItemStack.EMPTY;
               }
            } else if (!this.moveItemStackTo(itemstack1, 45, 72, false)) {
               return ItemStack.EMPTY;
            }

            return ItemStack.EMPTY;
         }

         if (itemstack1.getCount() == 0) {
            slot.set(ItemStack.EMPTY);
         } else {
            slot.setChanged();
         }

         if (itemstack1.getCount() == itemstack.getCount()) {
            return ItemStack.EMPTY;
         }

         slot.onTake(playerIn, itemstack1);
      }

      return itemstack;
   }

   @Override
   protected boolean moveItemStackTo(ItemStack p_38904_, int p_38905_, int p_38906_, boolean p_38907_) {
      boolean flag = false;
      int i = p_38905_;
      if (p_38907_) {
         i = p_38906_ - 1;
      }

      if (p_38904_.isStackable()) {
         while (!p_38904_.isEmpty() && (p_38907_ ? i >= p_38905_ : i < p_38906_)) {
            Slot slot = this.slots.get(i);
            ItemStack itemstack = slot.getItem();
            if (slot.mayPlace(itemstack) && !itemstack.isEmpty() && ItemStack.isSameItemSameTags(p_38904_, itemstack)) {
               int j = itemstack.getCount() + p_38904_.getCount();
               int maxSize = Math.min(slot.getMaxStackSize(), p_38904_.getMaxStackSize());
               if (j <= maxSize) {
                  p_38904_.setCount(0);
                  itemstack.setCount(j);
                  slot.set(itemstack);
                  flag = true;
               } else if (itemstack.getCount() < maxSize) {
                  p_38904_.shrink(maxSize - itemstack.getCount());
                  itemstack.setCount(maxSize);
                  slot.set(itemstack);
                  flag = true;
               }
            }

            if (p_38907_) {
               i--;
            } else {
               i++;
            }
         }
      }

      if (!p_38904_.isEmpty()) {
         if (p_38907_) {
            i = p_38906_ - 1;
         } else {
            i = p_38905_;
         }

         while (p_38907_ ? i >= p_38905_ : i < p_38906_) {
            Slot slot1 = this.slots.get(i);
            ItemStack itemstack1 = slot1.getItem();
            if (itemstack1.isEmpty() && slot1.mayPlace(p_38904_)) {
               if (p_38904_.getCount() > slot1.getMaxStackSize()) {
                  slot1.setByPlayer(p_38904_.split(slot1.getMaxStackSize()));
               } else {
                  slot1.setByPlayer(p_38904_.split(p_38904_.getCount()));
               }

               slot1.setChanged();
               flag = true;
               break;
            }

            if (p_38907_) {
               i--;
            } else {
               i++;
            }
         }
      }

      return flag;
   }

   @Override
   public void removed(Player playerIn) {
      super.removed(playerIn);
      HiddenstashGUIThisGUIIsClosedProcedure.execute(this.world, this.x, this.y, this.z);
      if (!this.bound && playerIn instanceof ServerPlayer serverPlayer) {
         if (serverPlayer.isAlive() && !serverPlayer.hasDisconnected()) {
            for (int i = 0; i < this.internal.getSlots(); i++) {
               playerIn.getInventory().placeItemBackInInventory(this.internal.extractItem(i, this.internal.getStackInSlot(i).getCount(), false));
            }
         } else {
            for (int j = 0; j < this.internal.getSlots(); j++) {
               playerIn.drop(this.internal.extractItem(j, this.internal.getStackInSlot(j).getCount(), false), false);
            }
         }
      }
   }

   public Map<Integer, Slot> get() {
      return this.customSlots;
   }
}

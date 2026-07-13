package net.mcreator.apocalypsenow.world.inventory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
import net.mcreator.apocalypsenow.init.ApocalypsenowModMenus;
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

public class AlicepackGUIMenu extends AbstractContainerMenu implements Supplier<Map<Integer, Slot>> {
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

   public AlicepackGUIMenu(int id, Inventory inv, FriendlyByteBuf extraData) {
      super(ApocalypsenowModMenus.ALICEPACK_GUI.get(), id);
      this.entity = inv.player;
      this.world = inv.player.level();
      this.internal = new ItemStackHandler(83);
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

      this.customSlots.put(0, this.addSlot(new SlotItemHandler(this.internal, 0, 34, 132) {
         private final int slot = 0;
      }));
      this.customSlots.put(1, this.addSlot(new SlotItemHandler(this.internal, 1, 52, 132) {
         private final int slot = 1;
      }));
      this.customSlots.put(2, this.addSlot(new SlotItemHandler(this.internal, 2, 70, 132) {
         private final int slot = 2;
      }));
      this.customSlots.put(3, this.addSlot(new SlotItemHandler(this.internal, 3, 88, 132) {
         private final int slot = 3;
      }));
      this.customSlots.put(4, this.addSlot(new SlotItemHandler(this.internal, 4, 106, 132) {
         private final int slot = 4;
      }));
      this.customSlots.put(5, this.addSlot(new SlotItemHandler(this.internal, 5, 124, 132) {
         private final int slot = 5;
      }));
      this.customSlots.put(6, this.addSlot(new SlotItemHandler(this.internal, 6, 142, 132) {
         private final int slot = 6;
      }));
      this.customSlots.put(7, this.addSlot(new SlotItemHandler(this.internal, 7, 160, 132) {
         private final int slot = 7;
      }));
      this.customSlots.put(8, this.addSlot(new SlotItemHandler(this.internal, 8, 178, 132) {
         private final int slot = 8;
      }));
      this.customSlots.put(9, this.addSlot(new SlotItemHandler(this.internal, 9, 34, 114) {
         private final int slot = 9;
      }));
      this.customSlots.put(10, this.addSlot(new SlotItemHandler(this.internal, 10, 52, 114) {
         private final int slot = 10;
      }));
      this.customSlots.put(11, this.addSlot(new SlotItemHandler(this.internal, 11, 70, 114) {
         private final int slot = 11;
      }));
      this.customSlots.put(12, this.addSlot(new SlotItemHandler(this.internal, 12, 88, 114) {
         private final int slot = 12;
      }));
      this.customSlots.put(13, this.addSlot(new SlotItemHandler(this.internal, 13, 106, 114) {
         private final int slot = 13;
      }));
      this.customSlots.put(14, this.addSlot(new SlotItemHandler(this.internal, 14, 124, 114) {
         private final int slot = 14;
      }));
      this.customSlots.put(15, this.addSlot(new SlotItemHandler(this.internal, 15, 142, 114) {
         private final int slot = 15;
      }));
      this.customSlots.put(16, this.addSlot(new SlotItemHandler(this.internal, 16, 160, 114) {
         private final int slot = 16;
      }));
      this.customSlots.put(17, this.addSlot(new SlotItemHandler(this.internal, 17, 178, 114) {
         private final int slot = 17;
      }));
      this.customSlots.put(18, this.addSlot(new SlotItemHandler(this.internal, 18, 34, 96) {
         private final int slot = 18;
      }));
      this.customSlots.put(19, this.addSlot(new SlotItemHandler(this.internal, 19, 52, 96) {
         private final int slot = 19;
      }));
      this.customSlots.put(20, this.addSlot(new SlotItemHandler(this.internal, 20, 70, 96) {
         private final int slot = 20;
      }));
      this.customSlots.put(21, this.addSlot(new SlotItemHandler(this.internal, 21, 88, 96) {
         private final int slot = 21;
      }));
      this.customSlots.put(22, this.addSlot(new SlotItemHandler(this.internal, 22, 106, 96) {
         private final int slot = 22;
      }));
      this.customSlots.put(23, this.addSlot(new SlotItemHandler(this.internal, 23, 124, 96) {
         private final int slot = 23;
      }));
      this.customSlots.put(24, this.addSlot(new SlotItemHandler(this.internal, 24, 142, 96) {
         private final int slot = 24;
      }));
      this.customSlots.put(25, this.addSlot(new SlotItemHandler(this.internal, 25, 160, 96) {
         private final int slot = 25;
      }));
      this.customSlots.put(26, this.addSlot(new SlotItemHandler(this.internal, 26, 178, 96) {
         private final int slot = 26;
      }));
      this.customSlots.put(27, this.addSlot(new SlotItemHandler(this.internal, 27, 34, 78) {
         private final int slot = 27;
      }));
      this.customSlots.put(28, this.addSlot(new SlotItemHandler(this.internal, 28, 52, 78) {
         private final int slot = 28;
      }));
      this.customSlots.put(29, this.addSlot(new SlotItemHandler(this.internal, 29, 70, 78) {
         private final int slot = 29;
      }));
      this.customSlots.put(30, this.addSlot(new SlotItemHandler(this.internal, 30, 88, 78) {
         private final int slot = 30;
      }));
      this.customSlots.put(31, this.addSlot(new SlotItemHandler(this.internal, 31, 106, 78) {
         private final int slot = 31;
      }));
      this.customSlots.put(32, this.addSlot(new SlotItemHandler(this.internal, 32, 124, 78) {
         private final int slot = 32;
      }));
      this.customSlots.put(33, this.addSlot(new SlotItemHandler(this.internal, 33, 142, 78) {
         private final int slot = 33;
      }));
      this.customSlots.put(34, this.addSlot(new SlotItemHandler(this.internal, 34, 160, 78) {
         private final int slot = 34;
      }));
      this.customSlots.put(35, this.addSlot(new SlotItemHandler(this.internal, 35, 178, 78) {
         private final int slot = 35;
      }));
      this.customSlots.put(36, this.addSlot(new SlotItemHandler(this.internal, 36, 34, 60) {
         private final int slot = 36;
      }));
      this.customSlots.put(37, this.addSlot(new SlotItemHandler(this.internal, 37, 52, 60) {
         private final int slot = 37;
      }));
      this.customSlots.put(38, this.addSlot(new SlotItemHandler(this.internal, 38, 70, 60) {
         private final int slot = 38;
      }));
      this.customSlots.put(39, this.addSlot(new SlotItemHandler(this.internal, 39, 88, 60) {
         private final int slot = 39;
      }));
      this.customSlots.put(40, this.addSlot(new SlotItemHandler(this.internal, 40, 106, 60) {
         private final int slot = 40;
      }));
      this.customSlots.put(41, this.addSlot(new SlotItemHandler(this.internal, 41, 124, 60) {
         private final int slot = 41;
      }));
      this.customSlots.put(42, this.addSlot(new SlotItemHandler(this.internal, 42, 142, 60) {
         private final int slot = 42;
      }));
      this.customSlots.put(43, this.addSlot(new SlotItemHandler(this.internal, 43, 160, 60) {
         private final int slot = 43;
      }));
      this.customSlots.put(44, this.addSlot(new SlotItemHandler(this.internal, 44, 178, 60) {
         private final int slot = 44;
      }));
      this.customSlots.put(45, this.addSlot(new SlotItemHandler(this.internal, 45, 34, 42) {
         private final int slot = 45;
      }));
      this.customSlots.put(46, this.addSlot(new SlotItemHandler(this.internal, 46, 52, 42) {
         private final int slot = 46;
      }));
      this.customSlots.put(47, this.addSlot(new SlotItemHandler(this.internal, 47, 70, 42) {
         private final int slot = 47;
      }));
      this.customSlots.put(48, this.addSlot(new SlotItemHandler(this.internal, 48, 88, 42) {
         private final int slot = 48;
      }));
      this.customSlots.put(49, this.addSlot(new SlotItemHandler(this.internal, 49, 106, 42) {
         private final int slot = 49;
      }));
      this.customSlots.put(50, this.addSlot(new SlotItemHandler(this.internal, 50, 124, 42) {
         private final int slot = 50;
      }));
      this.customSlots.put(51, this.addSlot(new SlotItemHandler(this.internal, 51, 142, 42) {
         private final int slot = 51;
      }));
      this.customSlots.put(52, this.addSlot(new SlotItemHandler(this.internal, 52, 160, 42) {
         private final int slot = 52;
      }));
      this.customSlots.put(53, this.addSlot(new SlotItemHandler(this.internal, 53, 178, 42) {
         private final int slot = 53;
      }));
      this.customSlots.put(54, this.addSlot(new SlotItemHandler(this.internal, 54, 34, 24) {
         private final int slot = 54;
      }));
      this.customSlots.put(55, this.addSlot(new SlotItemHandler(this.internal, 55, 52, 24) {
         private final int slot = 55;
      }));
      this.customSlots.put(56, this.addSlot(new SlotItemHandler(this.internal, 56, 70, 24) {
         private final int slot = 56;
      }));
      this.customSlots.put(57, this.addSlot(new SlotItemHandler(this.internal, 57, 88, 24) {
         private final int slot = 57;
      }));
      this.customSlots.put(58, this.addSlot(new SlotItemHandler(this.internal, 58, 106, 24) {
         private final int slot = 58;
      }));
      this.customSlots.put(59, this.addSlot(new SlotItemHandler(this.internal, 59, 124, 24) {
         private final int slot = 59;
      }));
      this.customSlots.put(60, this.addSlot(new SlotItemHandler(this.internal, 60, 142, 24) {
         private final int slot = 60;
      }));
      this.customSlots.put(61, this.addSlot(new SlotItemHandler(this.internal, 61, 160, 24) {
         private final int slot = 61;
      }));
      this.customSlots.put(62, this.addSlot(new SlotItemHandler(this.internal, 62, 178, 24) {
         private final int slot = 62;
      }));
      this.customSlots.put(63, this.addSlot(new SlotItemHandler(this.internal, 63, 16, 132) {
         private final int slot = 63;
      }));
      this.customSlots.put(64, this.addSlot(new SlotItemHandler(this.internal, 64, 16, 114) {
         private final int slot = 64;
      }));
      this.customSlots.put(65, this.addSlot(new SlotItemHandler(this.internal, 65, 16, 96) {
         private final int slot = 65;
      }));
      this.customSlots.put(66, this.addSlot(new SlotItemHandler(this.internal, 66, 16, 78) {
         private final int slot = 66;
      }));
      this.customSlots.put(67, this.addSlot(new SlotItemHandler(this.internal, 67, 16, 60) {
         private final int slot = 67;
      }));
      this.customSlots.put(68, this.addSlot(new SlotItemHandler(this.internal, 68, 16, 42) {
         private final int slot = 68;
      }));
      this.customSlots.put(69, this.addSlot(new SlotItemHandler(this.internal, 69, 16, 24) {
         private final int slot = 69;
      }));
      this.customSlots.put(70, this.addSlot(new SlotItemHandler(this.internal, 70, 196, 132) {
         private final int slot = 70;
      }));
      this.customSlots.put(71, this.addSlot(new SlotItemHandler(this.internal, 71, 196, 114) {
         private final int slot = 71;
      }));
      this.customSlots.put(72, this.addSlot(new SlotItemHandler(this.internal, 72, 196, 96) {
         private final int slot = 72;
      }));
      this.customSlots.put(73, this.addSlot(new SlotItemHandler(this.internal, 73, 196, 78) {
         private final int slot = 73;
      }));
      this.customSlots.put(74, this.addSlot(new SlotItemHandler(this.internal, 74, 196, 60) {
         private final int slot = 74;
      }));
      this.customSlots.put(75, this.addSlot(new SlotItemHandler(this.internal, 75, 196, 42) {
         private final int slot = 75;
      }));
      this.customSlots.put(76, this.addSlot(new SlotItemHandler(this.internal, 76, 196, 24) {
         private final int slot = 76;
      }));
      this.customSlots.put(77, this.addSlot(new SlotItemHandler(this.internal, 77, 205, 168) {
         private final int slot = 77;
      }));
      this.customSlots.put(78, this.addSlot(new SlotItemHandler(this.internal, 78, 205, 186) {
         private final int slot = 78;
      }));
      this.customSlots.put(79, this.addSlot(new SlotItemHandler(this.internal, 79, 205, 204) {
         private final int slot = 79;
      }));
      this.customSlots.put(80, this.addSlot(new SlotItemHandler(this.internal, 80, 7, 168) {
         private final int slot = 80;
      }));
      this.customSlots.put(81, this.addSlot(new SlotItemHandler(this.internal, 81, 7, 186) {
         private final int slot = 81;
      }));
      this.customSlots.put(82, this.addSlot(new SlotItemHandler(this.internal, 82, 7, 204) {
         private final int slot = 82;
      }));

      for (int si = 0; si < 3; si++) {
         for (int sj = 0; sj < 9; sj++) {
            this.addSlot(new Slot(inv, sj + (si + 1) * 9, 35 + sj * 18, 156 + si * 18));
         }
      }

      for (int si = 0; si < 9; si++) {
         this.addSlot(new Slot(inv, si, 35 + si * 18, 214));
      }
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
         if (index < 83) {
            if (!this.moveItemStackTo(itemstack1, 83, this.slots.size(), true)) {
               return ItemStack.EMPTY;
            }

            slot.onQuickCraft(itemstack1, itemstack);
         } else if (!this.moveItemStackTo(itemstack1, 0, 83, false)) {
            if (index < 110) {
               if (!this.moveItemStackTo(itemstack1, 110, this.slots.size(), true)) {
                  return ItemStack.EMPTY;
               }
            } else if (!this.moveItemStackTo(itemstack1, 83, 110, false)) {
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

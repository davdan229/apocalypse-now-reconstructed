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

public class IronlockerboxguiMenu extends AbstractContainerMenu implements Supplier<Map<Integer, Slot>> {
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

   public IronlockerboxguiMenu(int id, Inventory inv, FriendlyByteBuf extraData) {
      super(ApocalypsenowModMenus.IRONLOCKERBOXGUI.get(), id);
      this.entity = inv.player;
      this.world = inv.player.level();
      this.internal = new ItemStackHandler(35);
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

      this.customSlots.put(0, this.addSlot(new SlotItemHandler(this.internal, 0, 26, 17) {
         private final int slot = 0;
      }));
      this.customSlots.put(1, this.addSlot(new SlotItemHandler(this.internal, 1, 44, 17) {
         private final int slot = 1;
      }));
      this.customSlots.put(2, this.addSlot(new SlotItemHandler(this.internal, 2, 62, 17) {
         private final int slot = 2;
      }));
      this.customSlots.put(3, this.addSlot(new SlotItemHandler(this.internal, 3, 80, 17) {
         private final int slot = 3;
      }));
      this.customSlots.put(4, this.addSlot(new SlotItemHandler(this.internal, 4, 98, 17) {
         private final int slot = 4;
      }));
      this.customSlots.put(5, this.addSlot(new SlotItemHandler(this.internal, 5, 116, 17) {
         private final int slot = 5;
      }));
      this.customSlots.put(6, this.addSlot(new SlotItemHandler(this.internal, 6, 134, 17) {
         private final int slot = 6;
      }));
      this.customSlots.put(7, this.addSlot(new SlotItemHandler(this.internal, 7, 26, 35) {
         private final int slot = 7;
      }));
      this.customSlots.put(8, this.addSlot(new SlotItemHandler(this.internal, 8, 44, 35) {
         private final int slot = 8;
      }));
      this.customSlots.put(9, this.addSlot(new SlotItemHandler(this.internal, 9, 62, 35) {
         private final int slot = 9;
      }));
      this.customSlots.put(10, this.addSlot(new SlotItemHandler(this.internal, 10, 80, 35) {
         private final int slot = 10;
      }));
      this.customSlots.put(11, this.addSlot(new SlotItemHandler(this.internal, 11, 98, 35) {
         private final int slot = 11;
      }));
      this.customSlots.put(12, this.addSlot(new SlotItemHandler(this.internal, 12, 116, 35) {
         private final int slot = 12;
      }));
      this.customSlots.put(13, this.addSlot(new SlotItemHandler(this.internal, 13, 134, 35) {
         private final int slot = 13;
      }));
      this.customSlots.put(14, this.addSlot(new SlotItemHandler(this.internal, 14, 26, 53) {
         private final int slot = 14;
      }));
      this.customSlots.put(15, this.addSlot(new SlotItemHandler(this.internal, 15, 44, 53) {
         private final int slot = 15;
      }));
      this.customSlots.put(16, this.addSlot(new SlotItemHandler(this.internal, 16, 62, 53) {
         private final int slot = 16;
      }));
      this.customSlots.put(17, this.addSlot(new SlotItemHandler(this.internal, 17, 80, 53) {
         private final int slot = 17;
      }));
      this.customSlots.put(18, this.addSlot(new SlotItemHandler(this.internal, 18, 98, 53) {
         private final int slot = 18;
      }));
      this.customSlots.put(19, this.addSlot(new SlotItemHandler(this.internal, 19, 116, 53) {
         private final int slot = 19;
      }));
      this.customSlots.put(20, this.addSlot(new SlotItemHandler(this.internal, 20, 134, 53) {
         private final int slot = 20;
      }));
      this.customSlots.put(21, this.addSlot(new SlotItemHandler(this.internal, 21, 26, 71) {
         private final int slot = 21;
      }));
      this.customSlots.put(22, this.addSlot(new SlotItemHandler(this.internal, 22, 44, 71) {
         private final int slot = 22;
      }));
      this.customSlots.put(23, this.addSlot(new SlotItemHandler(this.internal, 23, 62, 71) {
         private final int slot = 23;
      }));
      this.customSlots.put(24, this.addSlot(new SlotItemHandler(this.internal, 24, 80, 71) {
         private final int slot = 24;
      }));
      this.customSlots.put(25, this.addSlot(new SlotItemHandler(this.internal, 25, 98, 71) {
         private final int slot = 25;
      }));
      this.customSlots.put(26, this.addSlot(new SlotItemHandler(this.internal, 26, 116, 71) {
         private final int slot = 26;
      }));
      this.customSlots.put(27, this.addSlot(new SlotItemHandler(this.internal, 27, 134, 71) {
         private final int slot = 27;
      }));
      this.customSlots.put(28, this.addSlot(new SlotItemHandler(this.internal, 28, 26, 89) {
         private final int slot = 28;
      }));
      this.customSlots.put(29, this.addSlot(new SlotItemHandler(this.internal, 29, 44, 89) {
         private final int slot = 29;
      }));
      this.customSlots.put(30, this.addSlot(new SlotItemHandler(this.internal, 30, 62, 89) {
         private final int slot = 30;
      }));
      this.customSlots.put(31, this.addSlot(new SlotItemHandler(this.internal, 31, 80, 89) {
         private final int slot = 31;
      }));
      this.customSlots.put(32, this.addSlot(new SlotItemHandler(this.internal, 32, 98, 89) {
         private final int slot = 32;
      }));
      this.customSlots.put(33, this.addSlot(new SlotItemHandler(this.internal, 33, 116, 89) {
         private final int slot = 33;
      }));
      this.customSlots.put(34, this.addSlot(new SlotItemHandler(this.internal, 34, 134, 89) {
         private final int slot = 34;
      }));

      for (int si = 0; si < 3; si++) {
         for (int sj = 0; sj < 9; sj++) {
            this.addSlot(new Slot(inv, sj + (si + 1) * 9, 8 + sj * 18, 119 + si * 18));
         }
      }

      for (int si = 0; si < 9; si++) {
         this.addSlot(new Slot(inv, si, 8 + si * 18, 177));
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
         if (index < 35) {
            if (!this.moveItemStackTo(itemstack1, 35, this.slots.size(), true)) {
               return ItemStack.EMPTY;
            }

            slot.onQuickCraft(itemstack1, itemstack);
         } else if (!this.moveItemStackTo(itemstack1, 0, 35, false)) {
            if (index < 62) {
               if (!this.moveItemStackTo(itemstack1, 62, this.slots.size(), true)) {
                  return ItemStack.EMPTY;
               }
            } else if (!this.moveItemStackTo(itemstack1, 35, 62, false)) {
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

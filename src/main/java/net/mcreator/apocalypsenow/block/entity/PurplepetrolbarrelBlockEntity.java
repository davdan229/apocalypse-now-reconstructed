package net.mcreator.apocalypsenow.block.entity;

import java.util.function.Predicate;
import java.util.stream.IntStream;
import javax.annotation.Nullable;
import net.mcreator.apocalypsenow.init.ApocalypsenowModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.NonNullList;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.world.ContainerHelper;
import net.minecraft.world.WorldlyContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ChestMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.RandomizableContainerBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluids;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.capability.templates.FluidTank;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.wrapper.SidedInvWrapper;

public class PurplepetrolbarrelBlockEntity extends RandomizableContainerBlockEntity implements WorldlyContainer {
   private NonNullList<ItemStack> stacks = NonNullList.withSize(9, ItemStack.EMPTY);
   private final LazyOptional<? extends IItemHandler>[] handlers = SidedInvWrapper.create(this, Direction.values());
   private final FluidTank fluidTank = new FluidTank(10000, fs -> fs.getFluid() == Fluids.WATER) {
      protected void onContentsChanged() {
         super.onContentsChanged();
         PurplepetrolbarrelBlockEntity.this.setChanged();
         if (PurplepetrolbarrelBlockEntity.this.level != null) {
         PurplepetrolbarrelBlockEntity.this.level
            .sendBlockUpdated(
               PurplepetrolbarrelBlockEntity.this.worldPosition,
               PurplepetrolbarrelBlockEntity.this.level.getBlockState(PurplepetrolbarrelBlockEntity.this.worldPosition),
               PurplepetrolbarrelBlockEntity.this.level.getBlockState(PurplepetrolbarrelBlockEntity.this.worldPosition),
               2
            );
         }
      }
   };
   private final LazyOptional<FluidTank> fluidHandler = LazyOptional.of(() -> this.fluidTank);

   public PurplepetrolbarrelBlockEntity(BlockPos position, BlockState state) {
      super((BlockEntityType)ApocalypsenowModBlockEntities.PURPLE_PETROL_BARREL.get(), position, state);
   }

   public void load(CompoundTag compound) {
      super.load(compound);
      if (!this.tryLoadLootTable(compound)) {
         this.stacks = NonNullList.withSize(this.getContainerSize(), ItemStack.EMPTY);
      }

      ContainerHelper.loadAllItems(compound, this.stacks);
      if (compound.get("fluidTank") instanceof CompoundTag compoundTag) {
         this.fluidTank.readFromNBT(compoundTag);
      }
   }

   public void saveAdditional(CompoundTag compound) {
      super.saveAdditional(compound);
      if (!this.trySaveLootTable(compound)) {
         ContainerHelper.saveAllItems(compound, this.stacks);
      }

      compound.put("fluidTank", this.fluidTank.writeToNBT(new CompoundTag()));
   }

   public ClientboundBlockEntityDataPacket getUpdatePacket() {
      return ClientboundBlockEntityDataPacket.create(this);
   }

   public CompoundTag getUpdateTag() {
      return this.saveWithFullMetadata();
   }

   public int getContainerSize() {
      return this.stacks.size();
   }

   public boolean isEmpty() {
      for (ItemStack itemstack : this.stacks) {
         if (!itemstack.isEmpty()) {
            return false;
         }
      }

      return true;
   }

   public Component getDefaultName() {
      return Component.translatable("text.apocalypsenow.purple_petrol_barrel_1ecdf28c");
   }

   public int getMaxStackSize() {
      return 64;
   }

   public AbstractContainerMenu createMenu(int id, Inventory inventory) {
      return ChestMenu.threeRows(id, inventory);
   }

   public Component getDisplayName() {
      return Component.translatable("text.apocalypsenow.purple_petrol_barrel_a90b1e4e");
   }

   protected NonNullList<ItemStack> getItems() {
      return this.stacks;
   }

   protected void setItems(NonNullList<ItemStack> stacks) {
      this.stacks = stacks;
   }

   public boolean canPlaceItem(int index, ItemStack stack) {
      return true;
   }

   public int[] getSlotsForFace(Direction side) {
      return IntStream.range(0, this.getContainerSize()).toArray();
   }

   public boolean canPlaceItemThroughFace(int index, ItemStack stack, @Nullable Direction direction) {
      return this.canPlaceItem(index, stack);
   }

   public boolean canTakeItemThroughFace(int index, ItemStack stack, Direction direction) {
      return true;
   }

   public <T> LazyOptional<T> getCapability(Capability<T> capability, @Nullable Direction facing) {
      if (!this.remove && facing != null && capability == ForgeCapabilities.ITEM_HANDLER) {
         return this.handlers[facing.ordinal()].cast();
      } else {
         return !this.remove && capability == ForgeCapabilities.FLUID_HANDLER
            ? this.fluidHandler.cast()
            : super.getCapability(capability, facing);
      }
   }

   public void setRemoved() {
      super.setRemoved();

      for (LazyOptional<? extends IItemHandler> handler : this.handlers) {
         handler.invalidate();
      }
      this.fluidHandler.invalidate();
   }
}

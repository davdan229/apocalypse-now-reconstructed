package net.mcreator.apocalypsenow.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUtils;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.material.Fluids;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.capability.IFluidHandler;
import net.minecraftforge.fluids.capability.IFluidHandler.FluidAction;

public class AllbarrelswaterclickProcedure {
   private static final int BUCKET_VOLUME = 1000;

   public static void execute(LevelAccessor world, double x, double y, double z, Player player, InteractionHand hand) {
      if (!(world instanceof Level level) || level.isClientSide() || player == null) {
         return;
      }

      BlockPos pos = BlockPos.containing(x, y, z);
      BlockEntity blockEntity = level.getBlockEntity(pos);
      if (blockEntity == null) {
         return;
      }

      ItemStack held = player.getItemInHand(hand);
      blockEntity.getCapability(ForgeCapabilities.FLUID_HANDLER).ifPresent(handler -> {
         if (held.is(Items.BUCKET)) {
            drainWater(level, pos, player, held, hand, handler);
         } else if (held.is(Items.WATER_BUCKET)) {
            fillWater(level, pos, player, held, hand, handler);
         }
      });
   }

   private static void drainWater(Level level, BlockPos pos, Player player, ItemStack held, InteractionHand hand, IFluidHandler handler) {
      FluidStack simulated = handler.drain(BUCKET_VOLUME, FluidAction.SIMULATE);
      if (simulated.getFluid() != Fluids.WATER || simulated.getAmount() < BUCKET_VOLUME) {
         return;
      }
      FluidStack drained = handler.drain(BUCKET_VOLUME, FluidAction.EXECUTE);
      if (drained.getFluid() == Fluids.WATER && drained.getAmount() == BUCKET_VOLUME) {
         player.setItemInHand(hand, ItemUtils.createFilledResult(held, player, new ItemStack(Items.WATER_BUCKET)));
         level.playSound(null, pos, SoundEvents.BUCKET_FILL, SoundSource.BLOCKS, 1.0F, 1.0F);
      }
   }

   private static void fillWater(Level level, BlockPos pos, Player player, ItemStack held, InteractionHand hand, IFluidHandler handler) {
      FluidStack water = new FluidStack(Fluids.WATER, BUCKET_VOLUME);
      if (handler.fill(water, FluidAction.SIMULATE) != BUCKET_VOLUME) {
         return;
      }
      if (handler.fill(water, FluidAction.EXECUTE) == BUCKET_VOLUME) {
         player.setItemInHand(hand, ItemUtils.createFilledResult(held, player, new ItemStack(Items.BUCKET)));
         level.playSound(null, pos, SoundEvents.BUCKET_EMPTY, SoundSource.BLOCKS, 1.0F, 1.0F);
      }
   }
}

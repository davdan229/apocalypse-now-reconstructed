package net.mcreator.apocalypsenow.block;

import io.netty.buffer.Unpooled;
import java.util.List;
import net.mcreator.apocalypsenow.block.entity.TrashcanBlockEntity;
import net.mcreator.apocalypsenow.world.inventory.TrashcanguiMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.Containers;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.network.NetworkHooks;

public class TrashcanBlock extends Block implements EntityBlock {
   public TrashcanBlock() {
      super(Properties.of().sound(SoundType.METAL).strength(0.95F, 5.0F).requiresCorrectToolForDrops().noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
   }

   @Override
   public void appendHoverText(ItemStack itemstack, BlockGetter level, List<Component> list, TooltipFlag flag) {
      super.appendHoverText(itemstack, level, list, flag);
      list.add(Component.translatable("text.apocalypsenow.shift_right_click_with_any_trash_bag_to_6cc4052c"));
   }

   @Override
   public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
      return true;
   }

   @Override
   public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
      return 0;
   }

   @Override
   public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
      return Shapes.empty();
   }

   @Override
   public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
      return Shapes.or(box(2.0, 0.0, 2.0, 14.0, 15.0, 14.0), box(1.0, 14.0, 1.0, 15.0, 16.0, 15.0), box(7.0, 16.0, 7.0, 9.0, 17.0, 9.0));
   }

   @Override
   public InteractionResult use(BlockState blockstate, Level world, final BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
      super.use(blockstate, world, pos, entity, hand, hit);
      if (entity instanceof ServerPlayer player) {
         NetworkHooks.openScreen(player, new MenuProvider() {
            @Override
            public Component getDisplayName() {
               return Component.translatable("text.apocalypsenow.trash_bin_02f31866");
            }

            @Override
            public AbstractContainerMenu createMenu(int id, Inventory inventory, Player playerx) {
               return new TrashcanguiMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(pos));
            }
         }, pos);
      }

      return InteractionResult.SUCCESS;
   }

   @Override
   public MenuProvider getMenuProvider(BlockState state, Level worldIn, BlockPos pos) {
      return worldIn.getBlockEntity(pos) instanceof MenuProvider menuProvider ? menuProvider : null;
   }

   @Override
   public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
      return new TrashcanBlockEntity(pos, state);
   }

   @Override
   public boolean triggerEvent(BlockState state, Level world, BlockPos pos, int eventID, int eventParam) {
      super.triggerEvent(state, world, pos, eventID, eventParam);
      BlockEntity blockEntity = world.getBlockEntity(pos);
      return blockEntity == null ? false : blockEntity.triggerEvent(eventID, eventParam);
   }

   @Override
   public void onRemove(BlockState state, Level world, BlockPos pos, BlockState newState, boolean isMoving) {
      if (state.getBlock() != newState.getBlock()) {
         if (world.getBlockEntity(pos) instanceof TrashcanBlockEntity be) {
            Containers.dropContents(world, pos, be);
            world.updateNeighbourForOutputSignal(pos, this);
         }

         super.onRemove(state, world, pos, newState, isMoving);
      }
   }

   @Override
   public boolean hasAnalogOutputSignal(BlockState state) {
      return true;
   }

   @Override
   public int getAnalogOutputSignal(BlockState blockState, Level world, BlockPos pos) {
      return world.getBlockEntity(pos) instanceof TrashcanBlockEntity be ? AbstractContainerMenu.getRedstoneSignalFromContainer(be) : 0;
   }
}

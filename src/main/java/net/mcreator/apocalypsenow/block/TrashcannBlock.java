package net.mcreator.apocalypsenow.block;

import io.netty.buffer.Unpooled;
import java.util.List;
import net.mcreator.apocalypsenow.block.entity.TrashcannBlockEntity;
import net.mcreator.apocalypsenow.world.inventory.TrashGUIMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
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
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.block.state.StateDefinition.Builder;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.network.NetworkHooks;

public class TrashcannBlock extends Block implements SimpleWaterloggedBlock, EntityBlock {
   public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
   public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

   public TrashcannBlock() {
      super(
         Properties.of()
            .ignitedByLava()
            .instrument(NoteBlockInstrument.BASS)
            .sound(SoundType.METAL)
            .strength(1.0F, 5.0F)
            .requiresCorrectToolForDrops()
            .noOcclusion()
            .isRedstoneConductor((bs, br, bp) -> false)
      );
      this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(WATERLOGGED, false));
   }

   @Override
   public void appendHoverText(ItemStack itemstack, BlockGetter level, List<Component> list, TooltipFlag flag) {
      super.appendHoverText(itemstack, level, list, flag);
      list.add(Component.translatable("text.apocalypsenow.shift_right_click_with_any_trash_bag_to_6cc4052c"));
   }

   @Override
   public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
      return state.getFluidState().isEmpty();
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
      return switch ((Direction)state.getValue(FACING)) {
         case NORTH -> box(0.0, 0.0, 0.0, 16.0, 24.0, 16.0);
         case EAST -> box(0.0, 0.0, 0.0, 16.0, 24.0, 16.0);
         case WEST -> box(0.0, 0.0, 0.0, 16.0, 24.0, 16.0);
         default -> box(0.0, 0.0, 0.0, 16.0, 24.0, 16.0);
      };
   }

   @Override
   protected void createBlockStateDefinition(Builder<Block, BlockState> builder) {
      builder.add(FACING, WATERLOGGED);
   }

   @Override
   public BlockState getStateForPlacement(BlockPlaceContext context) {
      boolean flag = context.getLevel().getFluidState(context.getClickedPos()).getType() == Fluids.WATER;
      return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite()).setValue(WATERLOGGED, flag);
   }

   @Override
   public BlockState rotate(BlockState state, Rotation rot) {
      return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
   }

   @Override
   public BlockState mirror(BlockState state, Mirror mirrorIn) {
      return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
   }

   @Override
   public FluidState getFluidState(BlockState state) {
      return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
   }

   @Override
   public BlockState updateShape(BlockState state, Direction facing, BlockState facingState, LevelAccessor world, BlockPos currentPos, BlockPos facingPos) {
      if (state.getValue(WATERLOGGED)) {
         world.scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickDelay(world));
      }

      return super.updateShape(state, facing, facingState, world, currentPos, facingPos);
   }

   @Override
   public InteractionResult use(BlockState blockstate, Level world, final BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
      super.use(blockstate, world, pos, entity, hand, hit);
      if (entity instanceof ServerPlayer player) {
         NetworkHooks.openScreen(player, new MenuProvider() {
            @Override
            public Component getDisplayName() {
               return Component.translatable("text.apocalypsenow.trash_can_092d3a3a");
            }

            @Override
            public AbstractContainerMenu createMenu(int id, Inventory inventory, Player playerx) {
               return new TrashGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(pos));
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
      return new TrashcannBlockEntity(pos, state);
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
         if (world.getBlockEntity(pos) instanceof TrashcannBlockEntity be) {
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
      return world.getBlockEntity(pos) instanceof TrashcannBlockEntity be ? AbstractContainerMenu.getRedstoneSignalFromContainer(be) : 0;
   }
}

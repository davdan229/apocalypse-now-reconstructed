package net.mcreator.apocalypsenow.block;

import javax.annotation.Nullable;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class TallBlockProxyBlock extends Block implements SimpleWaterloggedBlock {
   // IntegerProperty does not allow negative bounds. Stored values 0..2 encode
   // logical offsets -1..1 by subtracting one when read.
   public static final IntegerProperty OFFSET_X = IntegerProperty.create("offset_x", 0, 2);
   public static final IntegerProperty OFFSET_Y = IntegerProperty.create("offset_y", 0, 2);
   public static final IntegerProperty OFFSET_Z = IntegerProperty.create("offset_z", 0, 2);
   public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
   private static final int VALIDATION_DELAY = 40;

   public TallBlockProxyBlock() {
      super(Properties.of().strength(1.0F).noOcclusion().noLootTable().pushReaction(PushReaction.BLOCK));
      this.registerDefaultState(
         this.stateDefinition
            .any()
            .setValue(OFFSET_X, 1)
            .setValue(OFFSET_Y, 0)
            .setValue(OFFSET_Z, 1)
            .setValue(WATERLOGGED, false)
      );
   }

   @Override
   protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
      builder.add(OFFSET_X, OFFSET_Y, OFFSET_Z, WATERLOGGED);
   }

   @Override
   public RenderShape getRenderShape(BlockState state) {
      return RenderShape.INVISIBLE;
   }

   @Override
   public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
      return TallBlockProxyEvents.getOutlineShape(state, world, pos, context);
   }

   @Override
   public VoxelShape getCollisionShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
      return TallBlockProxyEvents.getCollisionSlice(state, world, pos, context);
   }

   @Override
   public VoxelShape getOcclusionShape(BlockState state, BlockGetter world, BlockPos pos) {
      return Shapes.empty();
   }

   @Override
   public InteractionResult use(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
      if (!TallBlockProxyEvents.isValidProxy(state, world, pos)) {
         return InteractionResult.PASS;
      }
      BlockPos originPos = TallBlockProxyEvents.originPos(state, pos);
      BlockState originState = world.getBlockState(originPos);
      BlockHitResult originHit = new BlockHitResult(hit.getLocation(), hit.getDirection(), originPos, hit.isInside());
      return originState.use(world, player, hand, originHit);
   }

   @Override
   public float getDestroyProgress(BlockState state, Player player, BlockGetter world, BlockPos pos) {
      if (!TallBlockProxyEvents.isValidProxy(state, world, pos)) {
         return 0.0F;
      }
      BlockPos originPos = TallBlockProxyEvents.originPos(state, pos);
      return world.getBlockState(originPos).getDestroyProgress(player, world, originPos);
   }

   @Override
   public float getExplosionResistance(BlockState state, BlockGetter world, BlockPos pos, Explosion explosion) {
      if (!TallBlockProxyEvents.isValidProxy(state, world, pos)) {
         return super.getExplosionResistance(state, world, pos, explosion);
      }
      BlockPos originPos = TallBlockProxyEvents.originPos(state, pos);
      BlockState originState = world.getBlockState(originPos);
      return originState.getExplosionResistance(world, originPos, explosion);
   }

   @Override
   public SoundType getSoundType(BlockState state, LevelReader world, BlockPos pos, @Nullable Entity entity) {
      if (!TallBlockProxyEvents.isValidProxy(state, world, pos)) {
         return super.getSoundType(state, world, pos, entity);
      }
      BlockPos originPos = TallBlockProxyEvents.originPos(state, pos);
      BlockState originState = world.getBlockState(originPos);
      return originState.getSoundType(world, originPos, entity);
   }

   @Override
   public ItemStack getCloneItemStack(BlockState state, HitResult target, BlockGetter world, BlockPos pos, Player player) {
      if (!TallBlockProxyEvents.isValidProxy(state, world, pos)) {
         return ItemStack.EMPTY;
      }
      BlockPos originPos = TallBlockProxyEvents.originPos(state, pos);
      BlockState originState = world.getBlockState(originPos);
      return originState.getBlock().getCloneItemStack(originState, target, world, originPos, player);
   }

   @Override
   protected void spawnDestroyParticles(Level world, Player player, BlockPos pos, BlockState state) {
      if (TallBlockProxyEvents.isValidProxy(state, world, pos)) {
         BlockPos originPos = TallBlockProxyEvents.originPos(state, pos);
         world.levelEvent(player, 2001, pos, Block.getId(world.getBlockState(originPos)));
      }
   }

   @Override
   public void playerWillDestroy(Level world, BlockPos pos, BlockState state, Player player) {
      boolean valid = TallBlockProxyEvents.isValidProxy(state, world, pos);
      BlockPos originPos = valid ? TallBlockProxyEvents.originPos(state, pos) : pos;
      BlockState originState = valid ? world.getBlockState(originPos) : world.getBlockState(pos);
      super.playerWillDestroy(world, pos, state, player);
      if (!world.isClientSide && valid) {
         world.destroyBlock(originPos, !player.isCreative(), player);
         TallBlockProxyEvents.removeProxies(world, originPos, originState);
      }
   }

   @Override
   public void entityInside(BlockState state, Level world, BlockPos pos, Entity entity) {
      if (TallBlockProxyEvents.isValidProxy(state, world, pos)) {
         BlockPos originPos = TallBlockProxyEvents.originPos(state, pos);
         BlockState originState = world.getBlockState(originPos);
         originState.getBlock().entityInside(originState, world, originPos, entity);
      }
   }

   @Override
   public void stepOn(Level world, BlockPos pos, BlockState state, Entity entity) {
      if (TallBlockProxyEvents.isValidProxy(state, world, pos)) {
         BlockPos originPos = TallBlockProxyEvents.originPos(state, pos);
         BlockState originState = world.getBlockState(originPos);
         originState.getBlock().stepOn(world, originPos, originState, entity);
      }
   }

   @Override
   public void fallOn(Level world, BlockState state, BlockPos pos, Entity entity, float distance) {
      if (TallBlockProxyEvents.isValidProxy(state, world, pos)) {
         BlockPos originPos = TallBlockProxyEvents.originPos(state, pos);
         BlockState originState = world.getBlockState(originPos);
         originState.getBlock().fallOn(world, originState, originPos, entity, distance);
      } else {
         super.fallOn(world, state, pos, entity, distance);
      }
   }

   @Override
   public void onPlace(BlockState state, Level world, BlockPos pos, BlockState oldState, boolean movedByPiston) {
      super.onPlace(state, world, pos, oldState, movedByPiston);
      if (!world.isClientSide) {
         world.scheduleTick(pos, this, VALIDATION_DELAY);
      }
   }

   @Override
   public void tick(BlockState state, ServerLevel world, BlockPos pos, RandomSource random) {
      if (!TallBlockProxyEvents.isValidProxy(state, world, pos)) {
         world.removeBlock(pos, false);
         return;
      }
      world.scheduleTick(pos, this, VALIDATION_DELAY);
   }

   @Override
   public BlockState updateShape(BlockState state, Direction direction, BlockState neighborState, LevelAccessor world, BlockPos pos, BlockPos neighborPos) {
      if (state.getValue(WATERLOGGED)) {
         world.scheduleTick(pos, Fluids.WATER, Fluids.WATER.getTickDelay(world));
      }
      if (!TallBlockProxyEvents.isValidProxy(state, world, pos)) {
         return state.getFluidState().createLegacyBlock();
      }
      return super.updateShape(state, direction, neighborState, world, pos, neighborPos);
   }

   @Override
   public FluidState getFluidState(BlockState state) {
      return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
   }
}

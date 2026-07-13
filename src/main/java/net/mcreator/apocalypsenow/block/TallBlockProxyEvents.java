package net.mcreator.apocalypsenow.block;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.LinkedHashMap;
import net.mcreator.apocalypsenow.ApocalypsenowMod;
import net.mcreator.apocalypsenow.init.ApocalypsenowModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.event.level.ExplosionEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

/**
 * Makes models that leave their registry block cell behave as one logical block.
 * The visible block remains the origin; invisible proxy cells only forward input
 * and expose the corresponding collision slices.
 */
@EventBusSubscriber(modid = ApocalypsenowMod.MODID)
public final class TallBlockProxyEvents {
   private static final double EPSILON = 1.0E-5;
   private static final Map<String, ModelBounds> MODEL_BOUNDS = Map.ofEntries(
      bounds("beartrapactivated", 1.7, 14.7, 0.0, 5.4223, 4.5303, 11.2004),
      bounds("beartrapneutral", 1.7, 14.7, 0.0, 5.4223, 4.5303, 11.2004),
      bounds("broken_plasma_tv", -5.0, 21.0, 0.0, 16.0, 6.0, 10.0),
      bounds("broken_tv", 0.0, 16.0, 0.0, 15.0, -1.0, 16.0),
      bounds("coke_vending_machine", 0.0, 16.0, 0.0, 32.0, -1.8481, 16.0),
      bounds("concrete_barrier", 0.0038, 16.0091, -1.9464, 16.0, -0.002, 16.002),
      bounds("construction_barricade", -1.0, 17.0, 0.0241, 20.0, 0.0795, 15.9205),
      bounds("corpsecloth", 0.0, 16.0, 0.0, 6.0, -7.0, 25.0),
      bounds("corpsesack", 0.0, 16.0, 0.0, 6.0, -7.0, 25.0),
      bounds("desert_military_storage", 0.0, 16.0, 0.0, 17.1, -1.1654, 16.0),
      bounds("gas_canister", 2.0, 14.0, 0.0, 16.1, 2.0, 14.0),
      bounds("gravestone", 0.0, 16.0, 0.0, 17.0, 6.0, 11.0),
      bounds("ice", 0.0, 32.0, 0.0, 17.0, 0.0, 16.0),
      bounds("iron_locker", 0.0, 16.0, 0.0, 32.0, 0.0, 16.0),
      bounds("iron_plate", -1.0, 17.0, -1.0, 17.0, 14.9, 16.0),
      bounds("large_gas_canister", 2.0, 14.0, 0.0, 32.0, 2.0, 14.0),
      bounds("large_shelves_fill", 0.0, 16.0, 0.0, 20.0, 0.0, 16.0),
      bounds("leaves_trap", 0.0, 16.0, 15.0, 17.0, 0.0, 16.0),
      bounds("lined_concrete_barrier", 0.0038, 16.0091, -1.9464, 16.0, -0.002, 16.002),
      bounds("magazine_boxes", 0.0, 16.2194, 0.0, 16.0, 0.2, 16.5481),
      bounds("market_shelves", 0.0, 16.0, 0.0, 16.0, 0.0, 16.0),
      bounds("marketfridge", 0.0, 16.0, 0.0, 32.0, -0.1, 16.0),
      bounds("mechanics_tool_chest", 0.0, 16.0, 0.0, 18.0, 0.0, 16.0),
      bounds("medicine_boxes", 0.3, 15.148, 0.0, 13.0, 0.3, 15.7955),
      bounds("metal_bars", -1.0, 17.0, -1.0, 17.0, 14.0, 17.0),
      bounds("metal_shelvels_two", 0.0, 16.0, 0.0, 21.9, 7.0, 16.0),
      bounds("metal_shelves_three", 0.0, 16.0, 0.0, 21.9, 7.0, 16.0),
      bounds("metalshelvesfive", 0.0, 16.0, 0.0, 20.0, 7.0, 16.0),
      bounds("metalshelvesone", 0.0, 16.0, 0.0, 22.0, 7.0, 16.0),
      bounds("metelshelvesfour", 0.0, 16.0, 0.0, 21.0, 7.0, 16.0),
      bounds("military_storage", 0.0, 16.0, 0.0, 17.1, -1.1654, 16.0),
      bounds("pile_of_tires", -0.4853, 16.4853, 0.0, 16.0, -0.4853, 16.4853),
      bounds("planks_a", -1.2791, 17.2209, 0.0, 17.0, 14.9, 16.0),
      bounds("planksb", -1.6788, 17.551, 0.0, 17.0, 13.9, 16.0),
      bounds("planksc", -1.8791, 17.6209, 0.0, 17.0, 13.9, 16.0),
      bounds("planksd", -1.8431, 17.6569, 0.0, 17.0, 14.9, 16.0),
      bounds("plankse", -1.617, 18.2306, -0.5853, 20.745, 14.3, 16.0),
      bounds("porpsi_vending_machine", 0.0, 16.0, 0.0, 32.0, -1.8481, 16.0),
      bounds("spike_barrier", 0.0, 16.0, -0.061, 18.3945, -1.7477, 17.3442),
      bounds("spike_log", -0.2, 16.3, 0.1037, 16.1037, -0.4569, 16.0431),
      bounds("spikefence", 0.0, 16.0, 0.1037, 23.1037, 5.7931, 10.7931),
      bounds("spikefenceturn", 0.0, 12.0, 0.1037, 23.1037, -0.2069, 10.7931),
      bounds("traffic_barricade", -1.0, 17.0, 0.0241, 20.0, 0.0795, 15.9205),
      bounds("trash_bin", 1.0, 15.0, 0.0, 17.0, 1.0, 15.0),
      bounds("trashbag", 0.0, 16.0, 0.0, 22.0, 0.0, 16.0),
      bounds("trashbagblueplastic", 0.0, 16.0, 0.0, 22.0, 0.0, 16.0),
      bounds("trashcan_1", 0.0, 16.0, 0.0, 23.7, 0.7622, 15.0),
      bounds("trashcann", 0.0, 16.0, 0.0, 23.7, 0.7622, 15.0),
      bounds("tripwire_bomb", -1.0, 17.0, 0.0, 13.0, -1.0, 17.0),
      bounds("washing_machine", 0.0, 16.001, 0.0, 18.6598, 0.0, 16.6598)
   );

   private TallBlockProxyEvents() {
   }

   @SubscribeEvent(priority = EventPriority.LOWEST)
   public static void onBlockPlaced(BlockEvent.EntityPlaceEvent event) {
      if (!(event.getLevel() instanceof Level level) || level.isClientSide()) {
         return;
      }

      BlockPos originPos = event.getPos();
      BlockState originState = event.getPlacedBlock();
      List<BlockPos> offsets = occupiedProxyOffsets(originState, level, originPos);
      if (offsets.isEmpty()) {
         return;
      }

      for (BlockPos offset : offsets) {
         BlockPos proxyPos = originPos.offset(offset);
         BlockState present = level.getBlockState(proxyPos);
         if (present.is(ApocalypsenowModBlocks.TALL_BLOCK_PROXY.get()) && originPos.equals(originPos(present, proxyPos))) {
            continue;
         }
         if (!present.canBeReplaced()) {
            event.setCanceled(true);
            return;
         }
      }

      for (BlockPos offset : offsets) {
         BlockPos proxyPos = originPos.offset(offset);
         boolean waterlogged = level.getFluidState(proxyPos).getType() == Fluids.WATER;
         level.setBlock(proxyPos, proxyState(offset, waterlogged), Block.UPDATE_ALL);
      }
   }

   @SubscribeEvent(priority = EventPriority.LOWEST)
   public static void onBlockBroken(BlockEvent.BreakEvent event) {
      if (!(event.getLevel() instanceof Level level) || level.isClientSide()) {
         return;
      }

      BlockPos pos = event.getPos();
      BlockState state = event.getState();
      if (state.is(ApocalypsenowModBlocks.TALL_BLOCK_PROXY.get())) {
         return;
      }
      removeProxies(level, pos, state);
   }

   @SubscribeEvent(priority = EventPriority.LOWEST)
   public static void onExplosion(ExplosionEvent.Detonate event) {
      Level level = event.getLevel();
      if (level.isClientSide()) {
         return;
      }
      Map<BlockPos, BlockState> origins = new LinkedHashMap<>();
      for (BlockPos pos : List.copyOf(event.getAffectedBlocks())) {
         BlockState state = level.getBlockState(pos);
         if (state.is(ApocalypsenowModBlocks.TALL_BLOCK_PROXY.get()) && isValidProxy(state, level, pos)) {
            BlockPos originPos = originPos(state, pos);
            origins.put(originPos, level.getBlockState(originPos));
         } else if (isManagedOrigin(state)) {
            origins.put(pos, state);
         }
      }
      for (Map.Entry<BlockPos, BlockState> origin : origins.entrySet()) {
         if (!event.getAffectedBlocks().contains(origin.getKey())) {
            event.getAffectedBlocks().add(origin.getKey());
         }
         removeProxies(level, origin.getKey(), origin.getValue());
      }
   }

   public static boolean isManagedOrigin(BlockState state) {
      return modelBounds(state) != null;
   }

   public static BlockPos originPos(BlockState proxyState, BlockPos proxyPos) {
      return proxyPos.offset(
         proxyState.getValue(TallBlockProxyBlock.OFFSET_X) - 1,
         proxyState.getValue(TallBlockProxyBlock.OFFSET_Y) - 1,
         proxyState.getValue(TallBlockProxyBlock.OFFSET_Z) - 1
      );
   }

   public static boolean isValidProxy(BlockState proxyState, BlockGetter world, BlockPos proxyPos) {
      if (!proxyState.is(ApocalypsenowModBlocks.TALL_BLOCK_PROXY.get())) {
         return false;
      }
      BlockPos originPos = originPos(proxyState, proxyPos);
      BlockState originState = world.getBlockState(originPos);
      if (!isManagedOrigin(originState)) {
         return false;
      }
      BlockPos expectedOffset = proxyPos.subtract(originPos);
      return occupiedProxyOffsets(originState, world, originPos).contains(expectedOffset);
   }

   public static VoxelShape getOutlineShape(BlockState proxyState, BlockGetter world, BlockPos proxyPos, CollisionContext context) {
      BlockPos originPos = originPos(proxyState, proxyPos);
      BlockState originState = world.getBlockState(originPos);
      if (!isManagedOrigin(originState)) {
         return Shapes.empty();
      }
      BlockPos offset = proxyPos.subtract(originPos);
      return interactionShape(originState, world, originPos, context).move(-offset.getX(), -offset.getY(), -offset.getZ());
   }

   public static VoxelShape getCollisionSlice(BlockState proxyState, BlockGetter world, BlockPos proxyPos, CollisionContext context) {
      BlockPos originPos = originPos(proxyState, proxyPos);
      BlockState originState = world.getBlockState(originPos);
      if (!isManagedOrigin(originState)) {
         return Shapes.empty();
      }
      BlockPos offset = proxyPos.subtract(originPos);
      VoxelShape collision = originState.getCollisionShape(world, originPos, context);
      if (!collision.isEmpty() && !leavesOriginCell(collision)) {
         collision = Shapes.or(collision, interactionShape(originState, world, originPos, context));
      }
      return slice(collision, offset);
   }

   public static void removeProxies(Level level, BlockPos originPos, BlockState originState) {
      for (BlockPos offset : occupiedProxyOffsets(originState, level, originPos)) {
         BlockPos proxyPos = originPos.offset(offset);
         BlockState proxyState = level.getBlockState(proxyPos);
         if (proxyState.is(ApocalypsenowModBlocks.TALL_BLOCK_PROXY.get()) && originPos.equals(originPos(proxyState, proxyPos))) {
            level.removeBlock(proxyPos, false);
         }
      }
   }

   private static List<BlockPos> occupiedProxyOffsets(BlockState state, BlockGetter world, BlockPos originPos) {
      if (!isManagedOrigin(state)) {
         return List.of();
      }
      VoxelShape shape = interactionShape(state, world, originPos, CollisionContext.empty());
      if (shape.isEmpty()) {
         return List.of();
      }

      int minX = floorCell(shape.min(Direction.Axis.X));
      int maxX = floorCell(shape.max(Direction.Axis.X) - EPSILON);
      int minY = Math.max(0, floorCell(shape.min(Direction.Axis.Y)));
      int maxY = floorCell(shape.max(Direction.Axis.Y) - EPSILON);
      int minZ = floorCell(shape.min(Direction.Axis.Z));
      int maxZ = floorCell(shape.max(Direction.Axis.Z) - EPSILON);
      List<BlockPos> result = new ArrayList<>();
      for (int x = minX; x <= maxX; x++) {
         for (int y = minY; y <= maxY; y++) {
            for (int z = minZ; z <= maxZ; z++) {
               BlockPos offset = new BlockPos(x, y, z);
               if (!offset.equals(BlockPos.ZERO) && !slice(shape, offset).isEmpty()) {
                  result.add(offset);
               }
            }
         }
      }
      return result;
   }

   private static VoxelShape interactionShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
      VoxelShape declared = state.getShape(world, pos, context);
      ModelBounds bounds = modelBounds(state);
      if (bounds == null) {
         return declared;
      }
      VoxelShape model = bounds.rotatedShape(state);
      if (declared.isEmpty()) {
         return model;
      }

      // Authored block classes usually provide a precise multi-box outline. Use it
      // when it already leaves the origin cell; otherwise extend the lower-cell
      // fallback with the model's measured bounds.
      if (leavesOriginCell(declared)) {
         return declared;
      }
      return Shapes.or(declared, model);
   }

   private static boolean leavesOriginCell(VoxelShape shape) {
      return shape.min(Direction.Axis.X) < -EPSILON
         || shape.max(Direction.Axis.X) > 1.0 + EPSILON
         || shape.min(Direction.Axis.Y) < -EPSILON
         || shape.max(Direction.Axis.Y) > 1.0 + EPSILON
         || shape.min(Direction.Axis.Z) < -EPSILON
         || shape.max(Direction.Axis.Z) > 1.0 + EPSILON;
   }

   private static VoxelShape slice(VoxelShape shape, BlockPos offset) {
      if (shape.isEmpty()) {
         return Shapes.empty();
      }
      return Shapes.join(shape.move(-offset.getX(), -offset.getY(), -offset.getZ()), Shapes.block(), BooleanOp.AND);
   }

   private static int floorCell(double coordinate) {
      return (int)Math.floor(coordinate);
   }

   private static BlockState proxyState(BlockPos offset, boolean waterlogged) {
      return ApocalypsenowModBlocks.TALL_BLOCK_PROXY.get()
         .defaultBlockState()
         .setValue(TallBlockProxyBlock.OFFSET_X, 1 - offset.getX())
         .setValue(TallBlockProxyBlock.OFFSET_Y, 1 - offset.getY())
         .setValue(TallBlockProxyBlock.OFFSET_Z, 1 - offset.getZ())
         .setValue(TallBlockProxyBlock.WATERLOGGED, waterlogged);
   }

   private static ModelBounds modelBounds(BlockState state) {
      var id = BuiltInRegistries.BLOCK.getKey(state.getBlock());
      return ApocalypsenowMod.MODID.equals(id.getNamespace()) ? MODEL_BOUNDS.get(id.getPath()) : null;
   }

   private static Map.Entry<String, ModelBounds> bounds(
      String id, double minX, double maxX, double minY, double maxY, double minZ, double maxZ
   ) {
      return Map.entry(id, new ModelBounds(minX, maxX, minY, maxY, minZ, maxZ));
   }

   private record ModelBounds(double minX, double maxX, double minY, double maxY, double minZ, double maxZ) {
      private VoxelShape rotatedShape(BlockState state) {
         double x1 = this.minX;
         double x2 = this.maxX;
         double z1 = this.minZ;
         double z2 = this.maxZ;
         if (state.hasProperty(HorizontalDirectionalBlock.FACING)) {
            switch (state.getValue(HorizontalDirectionalBlock.FACING)) {
               case EAST -> {
                  x1 = 16.0 - this.maxZ;
                  x2 = 16.0 - this.minZ;
                  z1 = this.minX;
                  z2 = this.maxX;
               }
               case SOUTH -> {
                  x1 = 16.0 - this.maxX;
                  x2 = 16.0 - this.minX;
                  z1 = 16.0 - this.maxZ;
                  z2 = 16.0 - this.minZ;
               }
               case WEST -> {
                  x1 = this.minZ;
                  x2 = this.maxZ;
                  z1 = 16.0 - this.maxX;
                  z2 = 16.0 - this.minX;
               }
               default -> {
               }
            }
         }
         return Block.box(x1, this.minY, z1, x2, this.maxY, z2);
      }
   }
}

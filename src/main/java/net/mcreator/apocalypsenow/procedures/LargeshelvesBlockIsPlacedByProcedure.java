package net.mcreator.apocalypsenow.procedures;

import net.mcreator.apocalypsenow.init.ApocalypsenowModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;

public class LargeshelvesBlockIsPlacedByProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
      if (world.isClientSide()) {
         return;
      }
      if (entity != null) {
         if (Math.random() < 0.5) {
            if (entity.getDirection() == Direction.NORTH) {
               world.setBlock(
                  BlockPos.containing(x, y, z),
                  (new Object() {
                        public BlockState with(BlockState _bs, Direction newValue) {
                           if (_bs.getBlock().getStateDefinition().getProperty("facing") instanceof DirectionProperty _dp
                              && _dp.getPossibleValues().contains(newValue)) {
                              return _bs.setValue(_dp, newValue);
                           } else {
                              return _bs.getBlock().getStateDefinition().getProperty("axis") instanceof EnumProperty _ep
                                    && _ep.getPossibleValues().contains(newValue.getAxis())
                                 ? _bs.setValue(_ep, newValue.getAxis())
                                 : _bs;
                           }
                        }
                     })
                     .with(ApocalypsenowModBlocks.LARGE_SHELVES_FILL.get().defaultBlockState(), Direction.NORTH),
                  3
               );
            }

            if (entity.getDirection() == Direction.SOUTH) {
               world.setBlock(
                  BlockPos.containing(x, y, z),
                  (new Object() {
                        public BlockState with(BlockState _bs, Direction newValue) {
                           if (_bs.getBlock().getStateDefinition().getProperty("facing") instanceof DirectionProperty _dp
                              && _dp.getPossibleValues().contains(newValue)) {
                              return _bs.setValue(_dp, newValue);
                           } else {
                              return _bs.getBlock().getStateDefinition().getProperty("axis") instanceof EnumProperty _ep
                                    && _ep.getPossibleValues().contains(newValue.getAxis())
                                 ? _bs.setValue(_ep, newValue.getAxis())
                                 : _bs;
                           }
                        }
                     })
                     .with(ApocalypsenowModBlocks.LARGE_SHELVES_FILL.get().defaultBlockState(), Direction.SOUTH),
                  3
               );
            }

            if (entity.getDirection() == Direction.WEST) {
               world.setBlock(
                  BlockPos.containing(x, y, z),
                  (new Object() {
                        public BlockState with(BlockState _bs, Direction newValue) {
                           if (_bs.getBlock().getStateDefinition().getProperty("facing") instanceof DirectionProperty _dp
                              && _dp.getPossibleValues().contains(newValue)) {
                              return _bs.setValue(_dp, newValue);
                           } else {
                              return _bs.getBlock().getStateDefinition().getProperty("axis") instanceof EnumProperty _ep
                                    && _ep.getPossibleValues().contains(newValue.getAxis())
                                 ? _bs.setValue(_ep, newValue.getAxis())
                                 : _bs;
                           }
                        }
                     })
                     .with(ApocalypsenowModBlocks.LARGE_SHELVES_FILL.get().defaultBlockState(), Direction.WEST),
                  3
               );
            }

            if (entity.getDirection() == Direction.EAST) {
               world.setBlock(
                  BlockPos.containing(x, y, z),
                  (new Object() {
                        public BlockState with(BlockState _bs, Direction newValue) {
                           if (_bs.getBlock().getStateDefinition().getProperty("facing") instanceof DirectionProperty _dp
                              && _dp.getPossibleValues().contains(newValue)) {
                              return _bs.setValue(_dp, newValue);
                           } else {
                              return _bs.getBlock().getStateDefinition().getProperty("axis") instanceof EnumProperty _ep
                                    && _ep.getPossibleValues().contains(newValue.getAxis())
                                 ? _bs.setValue(_ep, newValue.getAxis())
                                 : _bs;
                           }
                        }
                     })
                     .with(ApocalypsenowModBlocks.LARGE_SHELVES_FILL.get().defaultBlockState(), Direction.EAST),
                  3
               );
            }
         }
      }
   }
}

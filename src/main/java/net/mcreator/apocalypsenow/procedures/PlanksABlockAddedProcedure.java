package net.mcreator.apocalypsenow.procedures;

import net.mcreator.apocalypsenow.init.ApocalypsenowModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;

public class PlanksABlockAddedProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
      if (world.isClientSide()) {
         return;
      }
      if (entity != null) {
         if (Math.random() < 0.2) {
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
                     .with(ApocalypsenowModBlocks.PLANKSB.get().defaultBlockState(), Direction.SOUTH),
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
                     .with(ApocalypsenowModBlocks.PLANKSB.get().defaultBlockState(), Direction.NORTH),
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
                     .with(ApocalypsenowModBlocks.PLANKSB.get().defaultBlockState(), Direction.EAST),
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
                     .with(ApocalypsenowModBlocks.PLANKSB.get().defaultBlockState(), Direction.WEST),
                  3
               );
            }
         } else if (Math.random() < 0.2) {
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
                     .with(ApocalypsenowModBlocks.PLANKSC.get().defaultBlockState(), Direction.SOUTH),
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
                     .with(ApocalypsenowModBlocks.PLANKSC.get().defaultBlockState(), Direction.NORTH),
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
                     .with(ApocalypsenowModBlocks.PLANKSC.get().defaultBlockState(), Direction.EAST),
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
                     .with(ApocalypsenowModBlocks.PLANKSC.get().defaultBlockState(), Direction.WEST),
                  3
               );
            }
         } else if (Math.random() < 0.2) {
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
                     .with(ApocalypsenowModBlocks.PLANKSD.get().defaultBlockState(), Direction.SOUTH),
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
                     .with(ApocalypsenowModBlocks.PLANKSD.get().defaultBlockState(), Direction.NORTH),
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
                     .with(ApocalypsenowModBlocks.PLANKSD.get().defaultBlockState(), Direction.EAST),
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
                     .with(ApocalypsenowModBlocks.PLANKSD.get().defaultBlockState(), Direction.WEST),
                  3
               );
            }
         } else if (Math.random() < 0.2) {
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
                     .with(ApocalypsenowModBlocks.PLANKSE.get().defaultBlockState(), Direction.SOUTH),
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
                     .with(ApocalypsenowModBlocks.PLANKSE.get().defaultBlockState(), Direction.NORTH),
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
                     .with(ApocalypsenowModBlocks.PLANKSE.get().defaultBlockState(), Direction.EAST),
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
                     .with(ApocalypsenowModBlocks.PLANKSE.get().defaultBlockState(), Direction.WEST),
                  3
               );
            }
         }
      }
   }
}

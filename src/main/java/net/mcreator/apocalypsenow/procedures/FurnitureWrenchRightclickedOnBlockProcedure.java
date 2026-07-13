package net.mcreator.apocalypsenow.procedures;

import com.google.common.collect.UnmodifiableIterator;
import java.util.Map.Entry;
import net.mcreator.apocalypsenow.init.ApocalypsenowModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.Property;

public class FurnitureWrenchRightclickedOnBlockProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
      if (world.isClientSide()) {
         return;
      }
      if (entity != null) {
         if (world.getBlockState(BlockPos.containing(x, y, z)).getBlock() == ApocalypsenowModBlocks.METAL_SHELVES.get()) {
            if (entity.getDirection() == Direction.NORTH) {
               BlockPos _bp = BlockPos.containing(x, y, z);
               BlockState _bs = (new Object() {
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
                  .with(ApocalypsenowModBlocks.METAL_SHELVELS_TWO.get().defaultBlockState(), Direction.SOUTH);
               BlockState _bso = world.getBlockState(_bp);
               UnmodifiableIterator _be = _bso.getValues().entrySet().iterator();

               while (_be.hasNext()) {
                  Entry<Property<?>, Comparable<?>> entry = (Entry<Property<?>, Comparable<?>>)_be.next();
                  Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
                  if (_property != null && _bs.getValue(_property) != null) {
                     try {
                        _bs = _bs.setValue(_property, (Comparable)entry.getValue());
                     } catch (Exception var102) {
                     }
                  }
               }

               BlockEntity _bex = world.getBlockEntity(_bp);
               CompoundTag _bnbt = null;
               if (_bex != null) {
                  _bnbt = _bex.saveWithFullMetadata();
                  _bex.setRemoved();
               }

               world.setBlock(_bp, _bs, 3);
               if (_bnbt != null) {
                  BlockEntity var233 = world.getBlockEntity(_bp);
                  if (var233 != null) {
                     try {
                        var233.load(_bnbt);
                     } catch (Exception var101) {
                     }
                  }
               }
            }

            if (entity.getDirection() == Direction.SOUTH) {
               BlockPos _bp = BlockPos.containing(x, y, z);
               BlockState _bs = (new Object() {
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
                  .with(ApocalypsenowModBlocks.METAL_SHELVELS_TWO.get().defaultBlockState(), Direction.NORTH);
               BlockState _bso = world.getBlockState(_bp);
               UnmodifiableIterator var234 = _bso.getValues().entrySet().iterator();

               while (var234.hasNext()) {
                  Entry<Property<?>, Comparable<?>> entry = (Entry<Property<?>, Comparable<?>>)var234.next();
                  Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
                  if (_property != null && _bs.getValue(_property) != null) {
                     try {
                        _bs = _bs.setValue(_property, (Comparable)entry.getValue());
                     } catch (Exception var100) {
                     }
                  }
               }

               BlockEntity _be = world.getBlockEntity(_bp);
               CompoundTag _bnbt = null;
               if (_be != null) {
                  _bnbt = _be.saveWithFullMetadata();
                  _be.setRemoved();
               }

               world.setBlock(_bp, _bs, 3);
               if (_bnbt != null) {
                  BlockEntity var236 = world.getBlockEntity(_bp);
                  if (var236 != null) {
                     try {
                        var236.load(_bnbt);
                     } catch (Exception var99) {
                     }
                  }
               }
            }

            if (entity.getDirection() == Direction.WEST) {
               BlockPos _bp = BlockPos.containing(x, y, z);
               BlockState _bs = (new Object() {
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
                  .with(ApocalypsenowModBlocks.METAL_SHELVELS_TWO.get().defaultBlockState(), Direction.EAST);
               BlockState _bso = world.getBlockState(_bp);
               UnmodifiableIterator var237 = _bso.getValues().entrySet().iterator();

               while (var237.hasNext()) {
                  Entry<Property<?>, Comparable<?>> entry = (Entry<Property<?>, Comparable<?>>)var237.next();
                  Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
                  if (_property != null && _bs.getValue(_property) != null) {
                     try {
                        _bs = _bs.setValue(_property, (Comparable)entry.getValue());
                     } catch (Exception var98) {
                     }
                  }
               }

               BlockEntity _be = world.getBlockEntity(_bp);
               CompoundTag _bnbt = null;
               if (_be != null) {
                  _bnbt = _be.saveWithFullMetadata();
                  _be.setRemoved();
               }

               world.setBlock(_bp, _bs, 3);
               if (_bnbt != null) {
                  BlockEntity var239 = world.getBlockEntity(_bp);
                  if (var239 != null) {
                     try {
                        var239.load(_bnbt);
                     } catch (Exception var97) {
                     }
                  }
               }
            }

            if (entity.getDirection() == Direction.EAST) {
               BlockPos _bp = BlockPos.containing(x, y, z);
               BlockState _bs = (new Object() {
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
                  .with(ApocalypsenowModBlocks.METAL_SHELVELS_TWO.get().defaultBlockState(), Direction.WEST);
               BlockState _bso = world.getBlockState(_bp);
               UnmodifiableIterator var240 = _bso.getValues().entrySet().iterator();

               while (var240.hasNext()) {
                  Entry<Property<?>, Comparable<?>> entry = (Entry<Property<?>, Comparable<?>>)var240.next();
                  Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
                  if (_property != null && _bs.getValue(_property) != null) {
                     try {
                        _bs = _bs.setValue(_property, (Comparable)entry.getValue());
                     } catch (Exception var96) {
                     }
                  }
               }

               BlockEntity _be = world.getBlockEntity(_bp);
               CompoundTag _bnbt = null;
               if (_be != null) {
                  _bnbt = _be.saveWithFullMetadata();
                  _be.setRemoved();
               }

               world.setBlock(_bp, _bs, 3);
               if (_bnbt != null) {
                  BlockEntity var242 = world.getBlockEntity(_bp);
                  if (var242 != null) {
                     try {
                        var242.load(_bnbt);
                     } catch (Exception var95) {
                     }
                  }
               }
            }
         } else if (world.getBlockState(BlockPos.containing(x, y, z)).getBlock() == ApocalypsenowModBlocks.METAL_SHELVELS_TWO.get()) {
            if (entity.getDirection() == Direction.NORTH) {
               BlockPos _bp = BlockPos.containing(x, y, z);
               BlockState _bs = (new Object() {
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
                  .with(ApocalypsenowModBlocks.METAL_SHELVES_THREE.get().defaultBlockState(), Direction.SOUTH);
               BlockState _bso = world.getBlockState(_bp);
               UnmodifiableIterator var243 = _bso.getValues().entrySet().iterator();

               while (var243.hasNext()) {
                  Entry<Property<?>, Comparable<?>> entry = (Entry<Property<?>, Comparable<?>>)var243.next();
                  Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
                  if (_property != null && _bs.getValue(_property) != null) {
                     try {
                        _bs = _bs.setValue(_property, (Comparable)entry.getValue());
                     } catch (Exception var94) {
                     }
                  }
               }

               BlockEntity _be = world.getBlockEntity(_bp);
               CompoundTag _bnbt = null;
               if (_be != null) {
                  _bnbt = _be.saveWithFullMetadata();
                  _be.setRemoved();
               }

               world.setBlock(_bp, _bs, 3);
               if (_bnbt != null) {
                  BlockEntity var245 = world.getBlockEntity(_bp);
                  if (var245 != null) {
                     try {
                        var245.load(_bnbt);
                     } catch (Exception var93) {
                     }
                  }
               }
            }

            if (entity.getDirection() == Direction.SOUTH) {
               BlockPos _bp = BlockPos.containing(x, y, z);
               BlockState _bs = (new Object() {
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
                  .with(ApocalypsenowModBlocks.METAL_SHELVES_THREE.get().defaultBlockState(), Direction.NORTH);
               BlockState _bso = world.getBlockState(_bp);
               UnmodifiableIterator var246 = _bso.getValues().entrySet().iterator();

               while (var246.hasNext()) {
                  Entry<Property<?>, Comparable<?>> entry = (Entry<Property<?>, Comparable<?>>)var246.next();
                  Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
                  if (_property != null && _bs.getValue(_property) != null) {
                     try {
                        _bs = _bs.setValue(_property, (Comparable)entry.getValue());
                     } catch (Exception var92) {
                     }
                  }
               }

               BlockEntity _be = world.getBlockEntity(_bp);
               CompoundTag _bnbt = null;
               if (_be != null) {
                  _bnbt = _be.saveWithFullMetadata();
                  _be.setRemoved();
               }

               world.setBlock(_bp, _bs, 3);
               if (_bnbt != null) {
                  BlockEntity var248 = world.getBlockEntity(_bp);
                  if (var248 != null) {
                     try {
                        var248.load(_bnbt);
                     } catch (Exception var91) {
                     }
                  }
               }
            }

            if (entity.getDirection() == Direction.WEST) {
               BlockPos _bp = BlockPos.containing(x, y, z);
               BlockState _bs = (new Object() {
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
                  .with(ApocalypsenowModBlocks.METAL_SHELVES_THREE.get().defaultBlockState(), Direction.EAST);
               BlockState _bso = world.getBlockState(_bp);
               UnmodifiableIterator var249 = _bso.getValues().entrySet().iterator();

               while (var249.hasNext()) {
                  Entry<Property<?>, Comparable<?>> entry = (Entry<Property<?>, Comparable<?>>)var249.next();
                  Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
                  if (_property != null && _bs.getValue(_property) != null) {
                     try {
                        _bs = _bs.setValue(_property, (Comparable)entry.getValue());
                     } catch (Exception var90) {
                     }
                  }
               }

               BlockEntity _be = world.getBlockEntity(_bp);
               CompoundTag _bnbt = null;
               if (_be != null) {
                  _bnbt = _be.saveWithFullMetadata();
                  _be.setRemoved();
               }

               world.setBlock(_bp, _bs, 3);
               if (_bnbt != null) {
                  BlockEntity var251 = world.getBlockEntity(_bp);
                  if (var251 != null) {
                     try {
                        var251.load(_bnbt);
                     } catch (Exception var89) {
                     }
                  }
               }
            }

            if (entity.getDirection() == Direction.EAST) {
               BlockPos _bp = BlockPos.containing(x, y, z);
               BlockState _bs = (new Object() {
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
                  .with(ApocalypsenowModBlocks.METAL_SHELVES_THREE.get().defaultBlockState(), Direction.WEST);
               BlockState _bso = world.getBlockState(_bp);
               UnmodifiableIterator var252 = _bso.getValues().entrySet().iterator();

               while (var252.hasNext()) {
                  Entry<Property<?>, Comparable<?>> entry = (Entry<Property<?>, Comparable<?>>)var252.next();
                  Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
                  if (_property != null && _bs.getValue(_property) != null) {
                     try {
                        _bs = _bs.setValue(_property, (Comparable)entry.getValue());
                     } catch (Exception var88) {
                     }
                  }
               }

               BlockEntity _be = world.getBlockEntity(_bp);
               CompoundTag _bnbt = null;
               if (_be != null) {
                  _bnbt = _be.saveWithFullMetadata();
                  _be.setRemoved();
               }

               world.setBlock(_bp, _bs, 3);
               if (_bnbt != null) {
                  BlockEntity var254 = world.getBlockEntity(_bp);
                  if (var254 != null) {
                     try {
                        var254.load(_bnbt);
                     } catch (Exception var87) {
                     }
                  }
               }
            }
         } else if (world.getBlockState(BlockPos.containing(x, y, z)).getBlock() == ApocalypsenowModBlocks.METAL_SHELVES_THREE.get()) {
            if (entity.getDirection() == Direction.NORTH) {
               BlockPos _bp = BlockPos.containing(x, y, z);
               BlockState _bs = (new Object() {
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
                  .with(ApocalypsenowModBlocks.METELSHELVESFOUR.get().defaultBlockState(), Direction.SOUTH);
               BlockState _bso = world.getBlockState(_bp);
               UnmodifiableIterator var255 = _bso.getValues().entrySet().iterator();

               while (var255.hasNext()) {
                  Entry<Property<?>, Comparable<?>> entry = (Entry<Property<?>, Comparable<?>>)var255.next();
                  Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
                  if (_property != null && _bs.getValue(_property) != null) {
                     try {
                        _bs = _bs.setValue(_property, (Comparable)entry.getValue());
                     } catch (Exception var86) {
                     }
                  }
               }

               BlockEntity _be = world.getBlockEntity(_bp);
               CompoundTag _bnbt = null;
               if (_be != null) {
                  _bnbt = _be.saveWithFullMetadata();
                  _be.setRemoved();
               }

               world.setBlock(_bp, _bs, 3);
               if (_bnbt != null) {
                  BlockEntity var257 = world.getBlockEntity(_bp);
                  if (var257 != null) {
                     try {
                        var257.load(_bnbt);
                     } catch (Exception var85) {
                     }
                  }
               }
            }

            if (entity.getDirection() == Direction.SOUTH) {
               BlockPos _bp = BlockPos.containing(x, y, z);
               BlockState _bs = (new Object() {
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
                  .with(ApocalypsenowModBlocks.METELSHELVESFOUR.get().defaultBlockState(), Direction.NORTH);
               BlockState _bso = world.getBlockState(_bp);
               UnmodifiableIterator var258 = _bso.getValues().entrySet().iterator();

               while (var258.hasNext()) {
                  Entry<Property<?>, Comparable<?>> entry = (Entry<Property<?>, Comparable<?>>)var258.next();
                  Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
                  if (_property != null && _bs.getValue(_property) != null) {
                     try {
                        _bs = _bs.setValue(_property, (Comparable)entry.getValue());
                     } catch (Exception var84) {
                     }
                  }
               }

               BlockEntity _be = world.getBlockEntity(_bp);
               CompoundTag _bnbt = null;
               if (_be != null) {
                  _bnbt = _be.saveWithFullMetadata();
                  _be.setRemoved();
               }

               world.setBlock(_bp, _bs, 3);
               if (_bnbt != null) {
                  BlockEntity var260 = world.getBlockEntity(_bp);
                  if (var260 != null) {
                     try {
                        var260.load(_bnbt);
                     } catch (Exception var83) {
                     }
                  }
               }
            }

            if (entity.getDirection() == Direction.WEST) {
               BlockPos _bp = BlockPos.containing(x, y, z);
               BlockState _bs = (new Object() {
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
                  .with(ApocalypsenowModBlocks.METELSHELVESFOUR.get().defaultBlockState(), Direction.EAST);
               BlockState _bso = world.getBlockState(_bp);
               UnmodifiableIterator var261 = _bso.getValues().entrySet().iterator();

               while (var261.hasNext()) {
                  Entry<Property<?>, Comparable<?>> entry = (Entry<Property<?>, Comparable<?>>)var261.next();
                  Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
                  if (_property != null && _bs.getValue(_property) != null) {
                     try {
                        _bs = _bs.setValue(_property, (Comparable)entry.getValue());
                     } catch (Exception var82) {
                     }
                  }
               }

               BlockEntity _be = world.getBlockEntity(_bp);
               CompoundTag _bnbt = null;
               if (_be != null) {
                  _bnbt = _be.saveWithFullMetadata();
                  _be.setRemoved();
               }

               world.setBlock(_bp, _bs, 3);
               if (_bnbt != null) {
                  BlockEntity var263 = world.getBlockEntity(_bp);
                  if (var263 != null) {
                     try {
                        var263.load(_bnbt);
                     } catch (Exception var81) {
                     }
                  }
               }
            }

            if (entity.getDirection() == Direction.EAST) {
               BlockPos _bp = BlockPos.containing(x, y, z);
               BlockState _bs = (new Object() {
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
                  .with(ApocalypsenowModBlocks.METELSHELVESFOUR.get().defaultBlockState(), Direction.WEST);
               BlockState _bso = world.getBlockState(_bp);
               UnmodifiableIterator var264 = _bso.getValues().entrySet().iterator();

               while (var264.hasNext()) {
                  Entry<Property<?>, Comparable<?>> entry = (Entry<Property<?>, Comparable<?>>)var264.next();
                  Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
                  if (_property != null && _bs.getValue(_property) != null) {
                     try {
                        _bs = _bs.setValue(_property, (Comparable)entry.getValue());
                     } catch (Exception var80) {
                     }
                  }
               }

               BlockEntity _be = world.getBlockEntity(_bp);
               CompoundTag _bnbt = null;
               if (_be != null) {
                  _bnbt = _be.saveWithFullMetadata();
                  _be.setRemoved();
               }

               world.setBlock(_bp, _bs, 3);
               if (_bnbt != null) {
                  BlockEntity var266 = world.getBlockEntity(_bp);
                  if (var266 != null) {
                     try {
                        var266.load(_bnbt);
                     } catch (Exception var79) {
                     }
                  }
               }
            }
         } else if (world.getBlockState(BlockPos.containing(x, y, z)).getBlock() == ApocalypsenowModBlocks.METELSHELVESFOUR.get()) {
            if (entity.getDirection() == Direction.NORTH) {
               BlockPos _bp = BlockPos.containing(x, y, z);
               BlockState _bs = (new Object() {
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
                  .with(ApocalypsenowModBlocks.METALSHELVESONE.get().defaultBlockState(), Direction.SOUTH);
               BlockState _bso = world.getBlockState(_bp);
               UnmodifiableIterator var267 = _bso.getValues().entrySet().iterator();

               while (var267.hasNext()) {
                  Entry<Property<?>, Comparable<?>> entry = (Entry<Property<?>, Comparable<?>>)var267.next();
                  Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
                  if (_property != null && _bs.getValue(_property) != null) {
                     try {
                        _bs = _bs.setValue(_property, (Comparable)entry.getValue());
                     } catch (Exception var78) {
                     }
                  }
               }

               BlockEntity _be = world.getBlockEntity(_bp);
               CompoundTag _bnbt = null;
               if (_be != null) {
                  _bnbt = _be.saveWithFullMetadata();
                  _be.setRemoved();
               }

               world.setBlock(_bp, _bs, 3);
               if (_bnbt != null) {
                  BlockEntity var269 = world.getBlockEntity(_bp);
                  if (var269 != null) {
                     try {
                        var269.load(_bnbt);
                     } catch (Exception var77) {
                     }
                  }
               }
            }

            if (entity.getDirection() == Direction.SOUTH) {
               BlockPos _bp = BlockPos.containing(x, y, z);
               BlockState _bs = (new Object() {
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
                  .with(ApocalypsenowModBlocks.METALSHELVESONE.get().defaultBlockState(), Direction.NORTH);
               BlockState _bso = world.getBlockState(_bp);
               UnmodifiableIterator var270 = _bso.getValues().entrySet().iterator();

               while (var270.hasNext()) {
                  Entry<Property<?>, Comparable<?>> entry = (Entry<Property<?>, Comparable<?>>)var270.next();
                  Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
                  if (_property != null && _bs.getValue(_property) != null) {
                     try {
                        _bs = _bs.setValue(_property, (Comparable)entry.getValue());
                     } catch (Exception var76) {
                     }
                  }
               }

               BlockEntity _be = world.getBlockEntity(_bp);
               CompoundTag _bnbt = null;
               if (_be != null) {
                  _bnbt = _be.saveWithFullMetadata();
                  _be.setRemoved();
               }

               world.setBlock(_bp, _bs, 3);
               if (_bnbt != null) {
                  BlockEntity var272 = world.getBlockEntity(_bp);
                  if (var272 != null) {
                     try {
                        var272.load(_bnbt);
                     } catch (Exception var75) {
                     }
                  }
               }
            }

            if (entity.getDirection() == Direction.WEST) {
               BlockPos _bp = BlockPos.containing(x, y, z);
               BlockState _bs = (new Object() {
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
                  .with(ApocalypsenowModBlocks.METALSHELVESONE.get().defaultBlockState(), Direction.EAST);
               BlockState _bso = world.getBlockState(_bp);
               UnmodifiableIterator var273 = _bso.getValues().entrySet().iterator();

               while (var273.hasNext()) {
                  Entry<Property<?>, Comparable<?>> entry = (Entry<Property<?>, Comparable<?>>)var273.next();
                  Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
                  if (_property != null && _bs.getValue(_property) != null) {
                     try {
                        _bs = _bs.setValue(_property, (Comparable)entry.getValue());
                     } catch (Exception var74) {
                     }
                  }
               }

               BlockEntity _be = world.getBlockEntity(_bp);
               CompoundTag _bnbt = null;
               if (_be != null) {
                  _bnbt = _be.saveWithFullMetadata();
                  _be.setRemoved();
               }

               world.setBlock(_bp, _bs, 3);
               if (_bnbt != null) {
                  BlockEntity var275 = world.getBlockEntity(_bp);
                  if (var275 != null) {
                     try {
                        var275.load(_bnbt);
                     } catch (Exception var73) {
                     }
                  }
               }
            }

            if (entity.getDirection() == Direction.EAST) {
               BlockPos _bp = BlockPos.containing(x, y, z);
               BlockState _bs = (new Object() {
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
                  .with(ApocalypsenowModBlocks.METALSHELVESONE.get().defaultBlockState(), Direction.WEST);
               BlockState _bso = world.getBlockState(_bp);
               UnmodifiableIterator var276 = _bso.getValues().entrySet().iterator();

               while (var276.hasNext()) {
                  Entry<Property<?>, Comparable<?>> entry = (Entry<Property<?>, Comparable<?>>)var276.next();
                  Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
                  if (_property != null && _bs.getValue(_property) != null) {
                     try {
                        _bs = _bs.setValue(_property, (Comparable)entry.getValue());
                     } catch (Exception var72) {
                     }
                  }
               }

               BlockEntity _be = world.getBlockEntity(_bp);
               CompoundTag _bnbt = null;
               if (_be != null) {
                  _bnbt = _be.saveWithFullMetadata();
                  _be.setRemoved();
               }

               world.setBlock(_bp, _bs, 3);
               if (_bnbt != null) {
                  BlockEntity var278 = world.getBlockEntity(_bp);
                  if (var278 != null) {
                     try {
                        var278.load(_bnbt);
                     } catch (Exception var71) {
                     }
                  }
               }
            }
         } else if (world.getBlockState(BlockPos.containing(x, y, z)).getBlock() == ApocalypsenowModBlocks.METALSHELVESONE.get()) {
            if (entity.getDirection() == Direction.NORTH) {
               BlockPos _bp = BlockPos.containing(x, y, z);
               BlockState _bs = (new Object() {
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
                  .with(ApocalypsenowModBlocks.METALSHELVESFIVE.get().defaultBlockState(), Direction.SOUTH);
               BlockState _bso = world.getBlockState(_bp);
               UnmodifiableIterator var279 = _bso.getValues().entrySet().iterator();

               while (var279.hasNext()) {
                  Entry<Property<?>, Comparable<?>> entry = (Entry<Property<?>, Comparable<?>>)var279.next();
                  Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
                  if (_property != null && _bs.getValue(_property) != null) {
                     try {
                        _bs = _bs.setValue(_property, (Comparable)entry.getValue());
                     } catch (Exception var70) {
                     }
                  }
               }

               BlockEntity _be = world.getBlockEntity(_bp);
               CompoundTag _bnbt = null;
               if (_be != null) {
                  _bnbt = _be.saveWithFullMetadata();
                  _be.setRemoved();
               }

               world.setBlock(_bp, _bs, 3);
               if (_bnbt != null) {
                  BlockEntity var281 = world.getBlockEntity(_bp);
                  if (var281 != null) {
                     try {
                        var281.load(_bnbt);
                     } catch (Exception var69) {
                     }
                  }
               }
            }

            if (entity.getDirection() == Direction.SOUTH) {
               BlockPos _bp = BlockPos.containing(x, y, z);
               BlockState _bs = (new Object() {
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
                  .with(ApocalypsenowModBlocks.METALSHELVESFIVE.get().defaultBlockState(), Direction.NORTH);
               BlockState _bso = world.getBlockState(_bp);
               UnmodifiableIterator var282 = _bso.getValues().entrySet().iterator();

               while (var282.hasNext()) {
                  Entry<Property<?>, Comparable<?>> entry = (Entry<Property<?>, Comparable<?>>)var282.next();
                  Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
                  if (_property != null && _bs.getValue(_property) != null) {
                     try {
                        _bs = _bs.setValue(_property, (Comparable)entry.getValue());
                     } catch (Exception var68) {
                     }
                  }
               }

               BlockEntity _be = world.getBlockEntity(_bp);
               CompoundTag _bnbt = null;
               if (_be != null) {
                  _bnbt = _be.saveWithFullMetadata();
                  _be.setRemoved();
               }

               world.setBlock(_bp, _bs, 3);
               if (_bnbt != null) {
                  BlockEntity var284 = world.getBlockEntity(_bp);
                  if (var284 != null) {
                     try {
                        var284.load(_bnbt);
                     } catch (Exception var67) {
                     }
                  }
               }
            }

            if (entity.getDirection() == Direction.WEST) {
               BlockPos _bp = BlockPos.containing(x, y, z);
               BlockState _bs = (new Object() {
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
                  .with(ApocalypsenowModBlocks.METALSHELVESFIVE.get().defaultBlockState(), Direction.EAST);
               BlockState _bso = world.getBlockState(_bp);
               UnmodifiableIterator var285 = _bso.getValues().entrySet().iterator();

               while (var285.hasNext()) {
                  Entry<Property<?>, Comparable<?>> entry = (Entry<Property<?>, Comparable<?>>)var285.next();
                  Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
                  if (_property != null && _bs.getValue(_property) != null) {
                     try {
                        _bs = _bs.setValue(_property, (Comparable)entry.getValue());
                     } catch (Exception var66) {
                     }
                  }
               }

               BlockEntity _be = world.getBlockEntity(_bp);
               CompoundTag _bnbt = null;
               if (_be != null) {
                  _bnbt = _be.saveWithFullMetadata();
                  _be.setRemoved();
               }

               world.setBlock(_bp, _bs, 3);
               if (_bnbt != null) {
                  BlockEntity var287 = world.getBlockEntity(_bp);
                  if (var287 != null) {
                     try {
                        var287.load(_bnbt);
                     } catch (Exception var65) {
                     }
                  }
               }
            }

            if (entity.getDirection() == Direction.EAST) {
               BlockPos _bp = BlockPos.containing(x, y, z);
               BlockState _bs = (new Object() {
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
                  .with(ApocalypsenowModBlocks.METALSHELVESFIVE.get().defaultBlockState(), Direction.WEST);
               BlockState _bso = world.getBlockState(_bp);
               UnmodifiableIterator var288 = _bso.getValues().entrySet().iterator();

               while (var288.hasNext()) {
                  Entry<Property<?>, Comparable<?>> entry = (Entry<Property<?>, Comparable<?>>)var288.next();
                  Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
                  if (_property != null && _bs.getValue(_property) != null) {
                     try {
                        _bs = _bs.setValue(_property, (Comparable)entry.getValue());
                     } catch (Exception var64) {
                     }
                  }
               }

               BlockEntity _be = world.getBlockEntity(_bp);
               CompoundTag _bnbt = null;
               if (_be != null) {
                  _bnbt = _be.saveWithFullMetadata();
                  _be.setRemoved();
               }

               world.setBlock(_bp, _bs, 3);
               if (_bnbt != null) {
                  BlockEntity var290 = world.getBlockEntity(_bp);
                  if (var290 != null) {
                     try {
                        var290.load(_bnbt);
                     } catch (Exception var63) {
                     }
                  }
               }
            }
         } else if (world.getBlockState(BlockPos.containing(x, y, z)).getBlock() == ApocalypsenowModBlocks.METALSHELVESFIVE.get()) {
            if (entity.getDirection() == Direction.NORTH) {
               BlockPos _bp = BlockPos.containing(x, y, z);
               BlockState _bs = (new Object() {
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
                  .with(ApocalypsenowModBlocks.METAL_SHELVES.get().defaultBlockState(), Direction.SOUTH);
               BlockState _bso = world.getBlockState(_bp);
               UnmodifiableIterator var291 = _bso.getValues().entrySet().iterator();

               while (var291.hasNext()) {
                  Entry<Property<?>, Comparable<?>> entry = (Entry<Property<?>, Comparable<?>>)var291.next();
                  Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
                  if (_property != null && _bs.getValue(_property) != null) {
                     try {
                        _bs = _bs.setValue(_property, (Comparable)entry.getValue());
                     } catch (Exception var62) {
                     }
                  }
               }

               BlockEntity _be = world.getBlockEntity(_bp);
               CompoundTag _bnbt = null;
               if (_be != null) {
                  _bnbt = _be.saveWithFullMetadata();
                  _be.setRemoved();
               }

               world.setBlock(_bp, _bs, 3);
               if (_bnbt != null) {
                  BlockEntity var293 = world.getBlockEntity(_bp);
                  if (var293 != null) {
                     try {
                        var293.load(_bnbt);
                     } catch (Exception var61) {
                     }
                  }
               }
            }

            if (entity.getDirection() == Direction.SOUTH) {
               BlockPos _bp = BlockPos.containing(x, y, z);
               BlockState _bs = (new Object() {
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
                  .with(ApocalypsenowModBlocks.METAL_SHELVES.get().defaultBlockState(), Direction.NORTH);
               BlockState _bso = world.getBlockState(_bp);
               UnmodifiableIterator var294 = _bso.getValues().entrySet().iterator();

               while (var294.hasNext()) {
                  Entry<Property<?>, Comparable<?>> entry = (Entry<Property<?>, Comparable<?>>)var294.next();
                  Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
                  if (_property != null && _bs.getValue(_property) != null) {
                     try {
                        _bs = _bs.setValue(_property, (Comparable)entry.getValue());
                     } catch (Exception var60) {
                     }
                  }
               }

               BlockEntity _be = world.getBlockEntity(_bp);
               CompoundTag _bnbt = null;
               if (_be != null) {
                  _bnbt = _be.saveWithFullMetadata();
                  _be.setRemoved();
               }

               world.setBlock(_bp, _bs, 3);
               if (_bnbt != null) {
                  BlockEntity var296 = world.getBlockEntity(_bp);
                  if (var296 != null) {
                     try {
                        var296.load(_bnbt);
                     } catch (Exception var59) {
                     }
                  }
               }
            }

            if (entity.getDirection() == Direction.WEST) {
               BlockPos _bp = BlockPos.containing(x, y, z);
               BlockState _bs = (new Object() {
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
                  .with(ApocalypsenowModBlocks.METAL_SHELVES.get().defaultBlockState(), Direction.EAST);
               BlockState _bso = world.getBlockState(_bp);
               UnmodifiableIterator var297 = _bso.getValues().entrySet().iterator();

               while (var297.hasNext()) {
                  Entry<Property<?>, Comparable<?>> entry = (Entry<Property<?>, Comparable<?>>)var297.next();
                  Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
                  if (_property != null && _bs.getValue(_property) != null) {
                     try {
                        _bs = _bs.setValue(_property, (Comparable)entry.getValue());
                     } catch (Exception var58) {
                     }
                  }
               }

               BlockEntity _be = world.getBlockEntity(_bp);
               CompoundTag _bnbt = null;
               if (_be != null) {
                  _bnbt = _be.saveWithFullMetadata();
                  _be.setRemoved();
               }

               world.setBlock(_bp, _bs, 3);
               if (_bnbt != null) {
                  BlockEntity var299 = world.getBlockEntity(_bp);
                  if (var299 != null) {
                     try {
                        var299.load(_bnbt);
                     } catch (Exception var57) {
                     }
                  }
               }
            }

            if (entity.getDirection() == Direction.EAST) {
               BlockPos _bp = BlockPos.containing(x, y, z);
               BlockState _bs = (new Object() {
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
                  .with(ApocalypsenowModBlocks.METAL_SHELVES.get().defaultBlockState(), Direction.WEST);
               BlockState _bso = world.getBlockState(_bp);
               UnmodifiableIterator var300 = _bso.getValues().entrySet().iterator();

               while (var300.hasNext()) {
                  Entry<Property<?>, Comparable<?>> entry = (Entry<Property<?>, Comparable<?>>)var300.next();
                  Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
                  if (_property != null && _bs.getValue(_property) != null) {
                     try {
                        _bs = _bs.setValue(_property, (Comparable)entry.getValue());
                     } catch (Exception var56) {
                     }
                  }
               }

               BlockEntity _be = world.getBlockEntity(_bp);
               CompoundTag _bnbt = null;
               if (_be != null) {
                  _bnbt = _be.saveWithFullMetadata();
                  _be.setRemoved();
               }

               world.setBlock(_bp, _bs, 3);
               if (_bnbt != null) {
                  BlockEntity var302 = world.getBlockEntity(_bp);
                  if (var302 != null) {
                     try {
                        var302.load(_bnbt);
                     } catch (Exception var55) {
                     }
                  }
               }
            }
         }

         if (world.getBlockState(BlockPos.containing(x, y, z)).getBlock() == ApocalypsenowModBlocks.PLANKS_A.get()) {
            if (entity.getDirection() == Direction.NORTH) {
               BlockPos _bp = BlockPos.containing(x, y, z);
               BlockState _bs = (new Object() {
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
                  .with(ApocalypsenowModBlocks.PLANKSB.get().defaultBlockState(), Direction.SOUTH);
               BlockState _bso = world.getBlockState(_bp);
               UnmodifiableIterator var303 = _bso.getValues().entrySet().iterator();

               while (var303.hasNext()) {
                  Entry<Property<?>, Comparable<?>> entry = (Entry<Property<?>, Comparable<?>>)var303.next();
                  Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
                  if (_property != null && _bs.getValue(_property) != null) {
                     try {
                        _bs = _bs.setValue(_property, (Comparable)entry.getValue());
                     } catch (Exception var54) {
                     }
                  }
               }

               BlockEntity _be = world.getBlockEntity(_bp);
               CompoundTag _bnbt = null;
               if (_be != null) {
                  _bnbt = _be.saveWithFullMetadata();
                  _be.setRemoved();
               }

               world.setBlock(_bp, _bs, 3);
               if (_bnbt != null) {
                  BlockEntity var305 = world.getBlockEntity(_bp);
                  if (var305 != null) {
                     try {
                        var305.load(_bnbt);
                     } catch (Exception var53) {
                     }
                  }
               }
            }

            if (entity.getDirection() == Direction.SOUTH) {
               BlockPos _bp = BlockPos.containing(x, y, z);
               BlockState _bs = (new Object() {
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
                  .with(ApocalypsenowModBlocks.PLANKSB.get().defaultBlockState(), Direction.NORTH);
               BlockState _bso = world.getBlockState(_bp);
               UnmodifiableIterator var306 = _bso.getValues().entrySet().iterator();

               while (var306.hasNext()) {
                  Entry<Property<?>, Comparable<?>> entry = (Entry<Property<?>, Comparable<?>>)var306.next();
                  Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
                  if (_property != null && _bs.getValue(_property) != null) {
                     try {
                        _bs = _bs.setValue(_property, (Comparable)entry.getValue());
                     } catch (Exception var52) {
                     }
                  }
               }

               BlockEntity _be = world.getBlockEntity(_bp);
               CompoundTag _bnbt = null;
               if (_be != null) {
                  _bnbt = _be.saveWithFullMetadata();
                  _be.setRemoved();
               }

               world.setBlock(_bp, _bs, 3);
               if (_bnbt != null) {
                  BlockEntity var308 = world.getBlockEntity(_bp);
                  if (var308 != null) {
                     try {
                        var308.load(_bnbt);
                     } catch (Exception var51) {
                     }
                  }
               }
            }

            if (entity.getDirection() == Direction.WEST) {
               BlockPos _bp = BlockPos.containing(x, y, z);
               BlockState _bs = (new Object() {
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
                  .with(ApocalypsenowModBlocks.PLANKSB.get().defaultBlockState(), Direction.EAST);
               BlockState _bso = world.getBlockState(_bp);
               UnmodifiableIterator var309 = _bso.getValues().entrySet().iterator();

               while (var309.hasNext()) {
                  Entry<Property<?>, Comparable<?>> entry = (Entry<Property<?>, Comparable<?>>)var309.next();
                  Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
                  if (_property != null && _bs.getValue(_property) != null) {
                     try {
                        _bs = _bs.setValue(_property, (Comparable)entry.getValue());
                     } catch (Exception var50) {
                     }
                  }
               }

               BlockEntity _be = world.getBlockEntity(_bp);
               CompoundTag _bnbt = null;
               if (_be != null) {
                  _bnbt = _be.saveWithFullMetadata();
                  _be.setRemoved();
               }

               world.setBlock(_bp, _bs, 3);
               if (_bnbt != null) {
                  BlockEntity var311 = world.getBlockEntity(_bp);
                  if (var311 != null) {
                     try {
                        var311.load(_bnbt);
                     } catch (Exception var49) {
                     }
                  }
               }
            }

            if (entity.getDirection() == Direction.EAST) {
               BlockPos _bp = BlockPos.containing(x, y, z);
               BlockState _bs = (new Object() {
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
                  .with(ApocalypsenowModBlocks.PLANKSB.get().defaultBlockState(), Direction.WEST);
               BlockState _bso = world.getBlockState(_bp);
               UnmodifiableIterator var312 = _bso.getValues().entrySet().iterator();

               while (var312.hasNext()) {
                  Entry<Property<?>, Comparable<?>> entry = (Entry<Property<?>, Comparable<?>>)var312.next();
                  Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
                  if (_property != null && _bs.getValue(_property) != null) {
                     try {
                        _bs = _bs.setValue(_property, (Comparable)entry.getValue());
                     } catch (Exception var48) {
                     }
                  }
               }

               BlockEntity _be = world.getBlockEntity(_bp);
               CompoundTag _bnbt = null;
               if (_be != null) {
                  _bnbt = _be.saveWithFullMetadata();
                  _be.setRemoved();
               }

               world.setBlock(_bp, _bs, 3);
               if (_bnbt != null) {
                  BlockEntity var314 = world.getBlockEntity(_bp);
                  if (var314 != null) {
                     try {
                        var314.load(_bnbt);
                     } catch (Exception var47) {
                     }
                  }
               }
            }
         } else if (world.getBlockState(BlockPos.containing(x, y, z)).getBlock() == ApocalypsenowModBlocks.PLANKSB.get()) {
            if (entity.getDirection() == Direction.NORTH) {
               BlockPos _bp = BlockPos.containing(x, y, z);
               BlockState _bs = (new Object() {
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
                  .with(ApocalypsenowModBlocks.PLANKSC.get().defaultBlockState(), Direction.SOUTH);
               BlockState _bso = world.getBlockState(_bp);
               UnmodifiableIterator var315 = _bso.getValues().entrySet().iterator();

               while (var315.hasNext()) {
                  Entry<Property<?>, Comparable<?>> entry = (Entry<Property<?>, Comparable<?>>)var315.next();
                  Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
                  if (_property != null && _bs.getValue(_property) != null) {
                     try {
                        _bs = _bs.setValue(_property, (Comparable)entry.getValue());
                     } catch (Exception var46) {
                     }
                  }
               }

               BlockEntity _be = world.getBlockEntity(_bp);
               CompoundTag _bnbt = null;
               if (_be != null) {
                  _bnbt = _be.saveWithFullMetadata();
                  _be.setRemoved();
               }

               world.setBlock(_bp, _bs, 3);
               if (_bnbt != null) {
                  BlockEntity var317 = world.getBlockEntity(_bp);
                  if (var317 != null) {
                     try {
                        var317.load(_bnbt);
                     } catch (Exception var45) {
                     }
                  }
               }
            }

            if (entity.getDirection() == Direction.SOUTH) {
               BlockPos _bp = BlockPos.containing(x, y, z);
               BlockState _bs = (new Object() {
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
                  .with(ApocalypsenowModBlocks.PLANKSC.get().defaultBlockState(), Direction.NORTH);
               BlockState _bso = world.getBlockState(_bp);
               UnmodifiableIterator var318 = _bso.getValues().entrySet().iterator();

               while (var318.hasNext()) {
                  Entry<Property<?>, Comparable<?>> entry = (Entry<Property<?>, Comparable<?>>)var318.next();
                  Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
                  if (_property != null && _bs.getValue(_property) != null) {
                     try {
                        _bs = _bs.setValue(_property, (Comparable)entry.getValue());
                     } catch (Exception var44) {
                     }
                  }
               }

               BlockEntity _be = world.getBlockEntity(_bp);
               CompoundTag _bnbt = null;
               if (_be != null) {
                  _bnbt = _be.saveWithFullMetadata();
                  _be.setRemoved();
               }

               world.setBlock(_bp, _bs, 3);
               if (_bnbt != null) {
                  BlockEntity var320 = world.getBlockEntity(_bp);
                  if (var320 != null) {
                     try {
                        var320.load(_bnbt);
                     } catch (Exception var43) {
                     }
                  }
               }
            }

            if (entity.getDirection() == Direction.WEST) {
               BlockPos _bp = BlockPos.containing(x, y, z);
               BlockState _bs = (new Object() {
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
                  .with(ApocalypsenowModBlocks.PLANKSC.get().defaultBlockState(), Direction.EAST);
               BlockState _bso = world.getBlockState(_bp);
               UnmodifiableIterator var321 = _bso.getValues().entrySet().iterator();

               while (var321.hasNext()) {
                  Entry<Property<?>, Comparable<?>> entry = (Entry<Property<?>, Comparable<?>>)var321.next();
                  Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
                  if (_property != null && _bs.getValue(_property) != null) {
                     try {
                        _bs = _bs.setValue(_property, (Comparable)entry.getValue());
                     } catch (Exception var42) {
                     }
                  }
               }

               BlockEntity _be = world.getBlockEntity(_bp);
               CompoundTag _bnbt = null;
               if (_be != null) {
                  _bnbt = _be.saveWithFullMetadata();
                  _be.setRemoved();
               }

               world.setBlock(_bp, _bs, 3);
               if (_bnbt != null) {
                  BlockEntity var323 = world.getBlockEntity(_bp);
                  if (var323 != null) {
                     try {
                        var323.load(_bnbt);
                     } catch (Exception var41) {
                     }
                  }
               }
            }

            if (entity.getDirection() == Direction.EAST) {
               BlockPos _bp = BlockPos.containing(x, y, z);
               BlockState _bs = (new Object() {
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
                  .with(ApocalypsenowModBlocks.PLANKSC.get().defaultBlockState(), Direction.WEST);
               BlockState _bso = world.getBlockState(_bp);
               UnmodifiableIterator var324 = _bso.getValues().entrySet().iterator();

               while (var324.hasNext()) {
                  Entry<Property<?>, Comparable<?>> entry = (Entry<Property<?>, Comparable<?>>)var324.next();
                  Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
                  if (_property != null && _bs.getValue(_property) != null) {
                     try {
                        _bs = _bs.setValue(_property, (Comparable)entry.getValue());
                     } catch (Exception var40) {
                     }
                  }
               }

               BlockEntity _be = world.getBlockEntity(_bp);
               CompoundTag _bnbt = null;
               if (_be != null) {
                  _bnbt = _be.saveWithFullMetadata();
                  _be.setRemoved();
               }

               world.setBlock(_bp, _bs, 3);
               if (_bnbt != null) {
                  BlockEntity var326 = world.getBlockEntity(_bp);
                  if (var326 != null) {
                     try {
                        var326.load(_bnbt);
                     } catch (Exception var39) {
                     }
                  }
               }
            }
         } else if (world.getBlockState(BlockPos.containing(x, y, z)).getBlock() == ApocalypsenowModBlocks.PLANKSC.get()) {
            if (entity.getDirection() == Direction.NORTH) {
               BlockPos _bp = BlockPos.containing(x, y, z);
               BlockState _bs = (new Object() {
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
                  .with(ApocalypsenowModBlocks.PLANKSD.get().defaultBlockState(), Direction.SOUTH);
               BlockState _bso = world.getBlockState(_bp);
               UnmodifiableIterator var327 = _bso.getValues().entrySet().iterator();

               while (var327.hasNext()) {
                  Entry<Property<?>, Comparable<?>> entry = (Entry<Property<?>, Comparable<?>>)var327.next();
                  Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
                  if (_property != null && _bs.getValue(_property) != null) {
                     try {
                        _bs = _bs.setValue(_property, (Comparable)entry.getValue());
                     } catch (Exception var38) {
                     }
                  }
               }

               BlockEntity _be = world.getBlockEntity(_bp);
               CompoundTag _bnbt = null;
               if (_be != null) {
                  _bnbt = _be.saveWithFullMetadata();
                  _be.setRemoved();
               }

               world.setBlock(_bp, _bs, 3);
               if (_bnbt != null) {
                  BlockEntity var329 = world.getBlockEntity(_bp);
                  if (var329 != null) {
                     try {
                        var329.load(_bnbt);
                     } catch (Exception var37) {
                     }
                  }
               }
            }

            if (entity.getDirection() == Direction.SOUTH) {
               BlockPos _bp = BlockPos.containing(x, y, z);
               BlockState _bs = (new Object() {
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
                  .with(ApocalypsenowModBlocks.PLANKSD.get().defaultBlockState(), Direction.NORTH);
               BlockState _bso = world.getBlockState(_bp);
               UnmodifiableIterator var330 = _bso.getValues().entrySet().iterator();

               while (var330.hasNext()) {
                  Entry<Property<?>, Comparable<?>> entry = (Entry<Property<?>, Comparable<?>>)var330.next();
                  Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
                  if (_property != null && _bs.getValue(_property) != null) {
                     try {
                        _bs = _bs.setValue(_property, (Comparable)entry.getValue());
                     } catch (Exception var36) {
                     }
                  }
               }

               BlockEntity _be = world.getBlockEntity(_bp);
               CompoundTag _bnbt = null;
               if (_be != null) {
                  _bnbt = _be.saveWithFullMetadata();
                  _be.setRemoved();
               }

               world.setBlock(_bp, _bs, 3);
               if (_bnbt != null) {
                  BlockEntity var332 = world.getBlockEntity(_bp);
                  if (var332 != null) {
                     try {
                        var332.load(_bnbt);
                     } catch (Exception var35) {
                     }
                  }
               }
            }

            if (entity.getDirection() == Direction.WEST) {
               BlockPos _bp = BlockPos.containing(x, y, z);
               BlockState _bs = (new Object() {
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
                  .with(ApocalypsenowModBlocks.PLANKSD.get().defaultBlockState(), Direction.EAST);
               BlockState _bso = world.getBlockState(_bp);
               UnmodifiableIterator var333 = _bso.getValues().entrySet().iterator();

               while (var333.hasNext()) {
                  Entry<Property<?>, Comparable<?>> entry = (Entry<Property<?>, Comparable<?>>)var333.next();
                  Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
                  if (_property != null && _bs.getValue(_property) != null) {
                     try {
                        _bs = _bs.setValue(_property, (Comparable)entry.getValue());
                     } catch (Exception var34) {
                     }
                  }
               }

               BlockEntity _be = world.getBlockEntity(_bp);
               CompoundTag _bnbt = null;
               if (_be != null) {
                  _bnbt = _be.saveWithFullMetadata();
                  _be.setRemoved();
               }

               world.setBlock(_bp, _bs, 3);
               if (_bnbt != null) {
                  BlockEntity var335 = world.getBlockEntity(_bp);
                  if (var335 != null) {
                     try {
                        var335.load(_bnbt);
                     } catch (Exception var33) {
                     }
                  }
               }
            }

            if (entity.getDirection() == Direction.EAST) {
               BlockPos _bp = BlockPos.containing(x, y, z);
               BlockState _bs = (new Object() {
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
                  .with(ApocalypsenowModBlocks.PLANKSD.get().defaultBlockState(), Direction.WEST);
               BlockState _bso = world.getBlockState(_bp);
               UnmodifiableIterator var336 = _bso.getValues().entrySet().iterator();

               while (var336.hasNext()) {
                  Entry<Property<?>, Comparable<?>> entry = (Entry<Property<?>, Comparable<?>>)var336.next();
                  Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
                  if (_property != null && _bs.getValue(_property) != null) {
                     try {
                        _bs = _bs.setValue(_property, (Comparable)entry.getValue());
                     } catch (Exception var32) {
                     }
                  }
               }

               BlockEntity _be = world.getBlockEntity(_bp);
               CompoundTag _bnbt = null;
               if (_be != null) {
                  _bnbt = _be.saveWithFullMetadata();
                  _be.setRemoved();
               }

               world.setBlock(_bp, _bs, 3);
               if (_bnbt != null) {
                  BlockEntity var338 = world.getBlockEntity(_bp);
                  if (var338 != null) {
                     try {
                        var338.load(_bnbt);
                     } catch (Exception var31) {
                     }
                  }
               }
            }
         } else if (world.getBlockState(BlockPos.containing(x, y, z)).getBlock() == ApocalypsenowModBlocks.PLANKSD.get()) {
            if (entity.getDirection() == Direction.NORTH) {
               BlockPos _bp = BlockPos.containing(x, y, z);
               BlockState _bs = (new Object() {
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
                  .with(ApocalypsenowModBlocks.PLANKSE.get().defaultBlockState(), Direction.SOUTH);
               BlockState _bso = world.getBlockState(_bp);
               UnmodifiableIterator var339 = _bso.getValues().entrySet().iterator();

               while (var339.hasNext()) {
                  Entry<Property<?>, Comparable<?>> entry = (Entry<Property<?>, Comparable<?>>)var339.next();
                  Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
                  if (_property != null && _bs.getValue(_property) != null) {
                     try {
                        _bs = _bs.setValue(_property, (Comparable)entry.getValue());
                     } catch (Exception var30) {
                     }
                  }
               }

               BlockEntity _be = world.getBlockEntity(_bp);
               CompoundTag _bnbt = null;
               if (_be != null) {
                  _bnbt = _be.saveWithFullMetadata();
                  _be.setRemoved();
               }

               world.setBlock(_bp, _bs, 3);
               if (_bnbt != null) {
                  BlockEntity var341 = world.getBlockEntity(_bp);
                  if (var341 != null) {
                     try {
                        var341.load(_bnbt);
                     } catch (Exception var29) {
                     }
                  }
               }
            }

            if (entity.getDirection() == Direction.SOUTH) {
               BlockPos _bp = BlockPos.containing(x, y, z);
               BlockState _bs = (new Object() {
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
                  .with(ApocalypsenowModBlocks.PLANKSE.get().defaultBlockState(), Direction.NORTH);
               BlockState _bso = world.getBlockState(_bp);
               UnmodifiableIterator var342 = _bso.getValues().entrySet().iterator();

               while (var342.hasNext()) {
                  Entry<Property<?>, Comparable<?>> entry = (Entry<Property<?>, Comparable<?>>)var342.next();
                  Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
                  if (_property != null && _bs.getValue(_property) != null) {
                     try {
                        _bs = _bs.setValue(_property, (Comparable)entry.getValue());
                     } catch (Exception var28) {
                     }
                  }
               }

               BlockEntity _be = world.getBlockEntity(_bp);
               CompoundTag _bnbt = null;
               if (_be != null) {
                  _bnbt = _be.saveWithFullMetadata();
                  _be.setRemoved();
               }

               world.setBlock(_bp, _bs, 3);
               if (_bnbt != null) {
                  BlockEntity var344 = world.getBlockEntity(_bp);
                  if (var344 != null) {
                     try {
                        var344.load(_bnbt);
                     } catch (Exception var27) {
                     }
                  }
               }
            }

            if (entity.getDirection() == Direction.WEST) {
               BlockPos _bp = BlockPos.containing(x, y, z);
               BlockState _bs = (new Object() {
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
                  .with(ApocalypsenowModBlocks.PLANKSE.get().defaultBlockState(), Direction.EAST);
               BlockState _bso = world.getBlockState(_bp);
               UnmodifiableIterator var345 = _bso.getValues().entrySet().iterator();

               while (var345.hasNext()) {
                  Entry<Property<?>, Comparable<?>> entry = (Entry<Property<?>, Comparable<?>>)var345.next();
                  Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
                  if (_property != null && _bs.getValue(_property) != null) {
                     try {
                        _bs = _bs.setValue(_property, (Comparable)entry.getValue());
                     } catch (Exception var26) {
                     }
                  }
               }

               BlockEntity _be = world.getBlockEntity(_bp);
               CompoundTag _bnbt = null;
               if (_be != null) {
                  _bnbt = _be.saveWithFullMetadata();
                  _be.setRemoved();
               }

               world.setBlock(_bp, _bs, 3);
               if (_bnbt != null) {
                  BlockEntity var347 = world.getBlockEntity(_bp);
                  if (var347 != null) {
                     try {
                        var347.load(_bnbt);
                     } catch (Exception var25) {
                     }
                  }
               }
            }

            if (entity.getDirection() == Direction.EAST) {
               BlockPos _bp = BlockPos.containing(x, y, z);
               BlockState _bs = (new Object() {
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
                  .with(ApocalypsenowModBlocks.PLANKSE.get().defaultBlockState(), Direction.WEST);
               BlockState _bso = world.getBlockState(_bp);
               UnmodifiableIterator var348 = _bso.getValues().entrySet().iterator();

               while (var348.hasNext()) {
                  Entry<Property<?>, Comparable<?>> entry = (Entry<Property<?>, Comparable<?>>)var348.next();
                  Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
                  if (_property != null && _bs.getValue(_property) != null) {
                     try {
                        _bs = _bs.setValue(_property, (Comparable)entry.getValue());
                     } catch (Exception var24) {
                     }
                  }
               }

               BlockEntity _be = world.getBlockEntity(_bp);
               CompoundTag _bnbt = null;
               if (_be != null) {
                  _bnbt = _be.saveWithFullMetadata();
                  _be.setRemoved();
               }

               world.setBlock(_bp, _bs, 3);
               if (_bnbt != null) {
                  BlockEntity var350 = world.getBlockEntity(_bp);
                  if (var350 != null) {
                     try {
                        var350.load(_bnbt);
                     } catch (Exception var23) {
                     }
                  }
               }
            }
         } else if (world.getBlockState(BlockPos.containing(x, y, z)).getBlock() == ApocalypsenowModBlocks.PLANKSE.get()) {
            if (entity.getDirection() == Direction.NORTH) {
               BlockPos _bp = BlockPos.containing(x, y, z);
               BlockState _bs = (new Object() {
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
                  .with(ApocalypsenowModBlocks.PLANKS_A.get().defaultBlockState(), Direction.SOUTH);
               BlockState _bso = world.getBlockState(_bp);
               UnmodifiableIterator var351 = _bso.getValues().entrySet().iterator();

               while (var351.hasNext()) {
                  Entry<Property<?>, Comparable<?>> entry = (Entry<Property<?>, Comparable<?>>)var351.next();
                  Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
                  if (_property != null && _bs.getValue(_property) != null) {
                     try {
                        _bs = _bs.setValue(_property, (Comparable)entry.getValue());
                     } catch (Exception var22) {
                     }
                  }
               }

               BlockEntity _be = world.getBlockEntity(_bp);
               CompoundTag _bnbt = null;
               if (_be != null) {
                  _bnbt = _be.saveWithFullMetadata();
                  _be.setRemoved();
               }

               world.setBlock(_bp, _bs, 3);
               if (_bnbt != null) {
                  BlockEntity var353 = world.getBlockEntity(_bp);
                  if (var353 != null) {
                     try {
                        var353.load(_bnbt);
                     } catch (Exception var21) {
                     }
                  }
               }
            }

            if (entity.getDirection() == Direction.SOUTH) {
               BlockPos _bp = BlockPos.containing(x, y, z);
               BlockState _bs = (new Object() {
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
                  .with(ApocalypsenowModBlocks.PLANKS_A.get().defaultBlockState(), Direction.NORTH);
               BlockState _bso = world.getBlockState(_bp);
               UnmodifiableIterator var354 = _bso.getValues().entrySet().iterator();

               while (var354.hasNext()) {
                  Entry<Property<?>, Comparable<?>> entry = (Entry<Property<?>, Comparable<?>>)var354.next();
                  Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
                  if (_property != null && _bs.getValue(_property) != null) {
                     try {
                        _bs = _bs.setValue(_property, (Comparable)entry.getValue());
                     } catch (Exception var20) {
                     }
                  }
               }

               BlockEntity _be = world.getBlockEntity(_bp);
               CompoundTag _bnbt = null;
               if (_be != null) {
                  _bnbt = _be.saveWithFullMetadata();
                  _be.setRemoved();
               }

               world.setBlock(_bp, _bs, 3);
               if (_bnbt != null) {
                  BlockEntity var356 = world.getBlockEntity(_bp);
                  if (var356 != null) {
                     try {
                        var356.load(_bnbt);
                     } catch (Exception var19) {
                     }
                  }
               }
            }

            if (entity.getDirection() == Direction.WEST) {
               BlockPos _bp = BlockPos.containing(x, y, z);
               BlockState _bs = (new Object() {
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
                  .with(ApocalypsenowModBlocks.PLANKS_A.get().defaultBlockState(), Direction.EAST);
               BlockState _bso = world.getBlockState(_bp);
               UnmodifiableIterator var357 = _bso.getValues().entrySet().iterator();

               while (var357.hasNext()) {
                  Entry<Property<?>, Comparable<?>> entry = (Entry<Property<?>, Comparable<?>>)var357.next();
                  Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
                  if (_property != null && _bs.getValue(_property) != null) {
                     try {
                        _bs = _bs.setValue(_property, (Comparable)entry.getValue());
                     } catch (Exception var18) {
                     }
                  }
               }

               BlockEntity _be = world.getBlockEntity(_bp);
               CompoundTag _bnbt = null;
               if (_be != null) {
                  _bnbt = _be.saveWithFullMetadata();
                  _be.setRemoved();
               }

               world.setBlock(_bp, _bs, 3);
               if (_bnbt != null) {
                  BlockEntity var359 = world.getBlockEntity(_bp);
                  if (var359 != null) {
                     try {
                        var359.load(_bnbt);
                     } catch (Exception var17) {
                     }
                  }
               }
            }

            if (entity.getDirection() == Direction.EAST) {
               BlockPos _bp = BlockPos.containing(x, y, z);
               BlockState _bs = (new Object() {
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
                  .with(ApocalypsenowModBlocks.PLANKS_A.get().defaultBlockState(), Direction.WEST);
               BlockState _bso = world.getBlockState(_bp);
               UnmodifiableIterator var360 = _bso.getValues().entrySet().iterator();

               while (var360.hasNext()) {
                  Entry<Property<?>, Comparable<?>> entry = (Entry<Property<?>, Comparable<?>>)var360.next();
                  Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
                  if (_property != null && _bs.getValue(_property) != null) {
                     try {
                        _bs = _bs.setValue(_property, (Comparable)entry.getValue());
                     } catch (Exception var16) {
                     }
                  }
               }

               BlockEntity _be = world.getBlockEntity(_bp);
               CompoundTag _bnbt = null;
               if (_be != null) {
                  _bnbt = _be.saveWithFullMetadata();
                  _be.setRemoved();
               }

               world.setBlock(_bp, _bs, 3);
               if (_bnbt != null) {
                  BlockEntity var362 = world.getBlockEntity(_bp);
                  if (var362 != null) {
                     try {
                        var362.load(_bnbt);
                     } catch (Exception var15) {
                     }
                  }
               }
            }
         }

         if (world.getBlockState(BlockPos.containing(x, y, z)).getBlock() == ApocalypsenowModBlocks.PAPERTRASH.get()) {
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
                     .with(ApocalypsenowModBlocks.PAPERSTRASH.get().defaultBlockState(), Direction.NORTH),
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
                     .with(ApocalypsenowModBlocks.PAPERSTRASH.get().defaultBlockState(), Direction.SOUTH),
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
                     .with(ApocalypsenowModBlocks.PAPERSTRASH.get().defaultBlockState(), Direction.WEST),
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
                     .with(ApocalypsenowModBlocks.PAPERSTRASH.get().defaultBlockState(), Direction.EAST),
                  3
               );
            }
         } else if (world.getBlockState(BlockPos.containing(x, y, z)).getBlock() == ApocalypsenowModBlocks.PAPERSTRASH.get()) {
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
                     .with(ApocalypsenowModBlocks.PAPERTRASHVARIANT.get().defaultBlockState(), Direction.NORTH),
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
                     .with(ApocalypsenowModBlocks.PAPERTRASHVARIANT.get().defaultBlockState(), Direction.SOUTH),
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
                     .with(ApocalypsenowModBlocks.PAPERTRASHVARIANT.get().defaultBlockState(), Direction.WEST),
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
                     .with(ApocalypsenowModBlocks.PAPERTRASHVARIANT.get().defaultBlockState(), Direction.EAST),
                  3
               );
            }
         } else if (world.getBlockState(BlockPos.containing(x, y, z)).getBlock() == ApocalypsenowModBlocks.PAPERTRASHVARIANT.get()) {
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
                     .with(ApocalypsenowModBlocks.PAPERSTRASHVARIANT_2.get().defaultBlockState(), Direction.NORTH),
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
                     .with(ApocalypsenowModBlocks.PAPERSTRASHVARIANT_2.get().defaultBlockState(), Direction.SOUTH),
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
                     .with(ApocalypsenowModBlocks.PAPERSTRASHVARIANT_2.get().defaultBlockState(), Direction.WEST),
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
                     .with(ApocalypsenowModBlocks.PAPERSTRASHVARIANT_2.get().defaultBlockState(), Direction.EAST),
                  3
               );
            }
         } else if (world.getBlockState(BlockPos.containing(x, y, z)).getBlock() == ApocalypsenowModBlocks.PAPERSTRASHVARIANT_2.get()) {
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
                     .with(ApocalypsenowModBlocks.PAPERSVARIANT_2.get().defaultBlockState(), Direction.NORTH),
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
                     .with(ApocalypsenowModBlocks.PAPERSVARIANT_2.get().defaultBlockState(), Direction.SOUTH),
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
                     .with(ApocalypsenowModBlocks.PAPERSVARIANT_2.get().defaultBlockState(), Direction.WEST),
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
                     .with(ApocalypsenowModBlocks.PAPERSVARIANT_2.get().defaultBlockState(), Direction.EAST),
                  3
               );
            }
         } else if (world.getBlockState(BlockPos.containing(x, y, z)).getBlock() == ApocalypsenowModBlocks.PAPERSVARIANT_2.get()) {
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
                     .with(ApocalypsenowModBlocks.PAPERTRASH.get().defaultBlockState(), Direction.NORTH),
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
                     .with(ApocalypsenowModBlocks.PAPERTRASH.get().defaultBlockState(), Direction.SOUTH),
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
                     .with(ApocalypsenowModBlocks.PAPERTRASH.get().defaultBlockState(), Direction.WEST),
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
                     .with(ApocalypsenowModBlocks.PAPERTRASH.get().defaultBlockState(), Direction.EAST),
                  3
               );
            }
         }
      }
   }
}

package net.mcreator.apocalypsenow.procedures;

import com.google.common.collect.UnmodifiableIterator;
import java.util.Comparator;
import java.util.Map.Entry;
import net.mcreator.apocalypsenow.ApocalypsenowMod;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.registries.ForgeRegistries;

public class CoktelmolotovProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z) {
      if (world instanceof Level _level) {
         if (!_level.isClientSide()) {
            _level.playSound(
               (Player)null,
               BlockPos.containing(x, y, z),
               ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.glass.break")),
               SoundSource.NEUTRAL,
               2.0F,
               1.0F
            );
         } else {
            _level.playLocalSound(
               x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.glass.break")), SoundSource.NEUTRAL, 2.0F, 1.0F, false
            );
         }
      }

      if (world.getBlockState(BlockPos.containing(x, y + 1.0, z)).getBlock() == Blocks.AIR && Math.random() < 0.7) {
         BlockPos _bp = BlockPos.containing(x, y + 1.0, z);
         BlockState _bs = Blocks.FIRE.defaultBlockState();
         BlockState _bso = world.getBlockState(_bp);
         UnmodifiableIterator entityiterator = _bso.getValues().entrySet().iterator();

         while (entityiterator.hasNext()) {
            Entry<Property<?>, Comparable<?>> entry = (Entry<Property<?>, Comparable<?>>)entityiterator.next();
            Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
            if (_property != null && _bs.getValue(_property) != null) {
               try {
                  _bs = _bs.setValue(_property, (Comparable)entry.getValue());
               } catch (Exception var29) {
               }
            }
         }

         world.setBlock(_bp, _bs, 3);
      }

      if (world.getBlockState(BlockPos.containing(x + 1.0, y + 1.0, z)).getBlock() == Blocks.AIR && Math.random() < 0.7) {
         BlockPos _bp = BlockPos.containing(x + 1.0, y + 1.0, z);
         BlockState _bs = Blocks.FIRE.defaultBlockState();
         BlockState _bso = world.getBlockState(_bp);
         UnmodifiableIterator var81 = _bso.getValues().entrySet().iterator();

         while (var81.hasNext()) {
            Entry<Property<?>, Comparable<?>> entry = (Entry<Property<?>, Comparable<?>>)var81.next();
            Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
            if (_property != null && _bs.getValue(_property) != null) {
               try {
                  _bs = _bs.setValue(_property, (Comparable)entry.getValue());
               } catch (Exception var28) {
               }
            }
         }

         world.setBlock(_bp, _bs, 3);
      }

      if (world.getBlockState(BlockPos.containing(x - 1.0, y + 1.0, z)).getBlock() == Blocks.AIR && Math.random() < 0.7) {
         BlockPos _bp = BlockPos.containing(x - 1.0, y + 1.0, z);
         BlockState _bs = Blocks.FIRE.defaultBlockState();
         BlockState _bso = world.getBlockState(_bp);
         UnmodifiableIterator var82 = _bso.getValues().entrySet().iterator();

         while (var82.hasNext()) {
            Entry<Property<?>, Comparable<?>> entry = (Entry<Property<?>, Comparable<?>>)var82.next();
            Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
            if (_property != null && _bs.getValue(_property) != null) {
               try {
                  _bs = _bs.setValue(_property, (Comparable)entry.getValue());
               } catch (Exception var27) {
               }
            }
         }

         world.setBlock(_bp, _bs, 3);
      }

      if (world.getBlockState(BlockPos.containing(x + 2.0, y + 1.0, z)).getBlock() == Blocks.AIR && Math.random() < 0.7) {
         world.setBlock(BlockPos.containing(x + 2.0, y + 1.0, z), Blocks.FIRE.defaultBlockState(), 3);
      }

      if (world.getBlockState(BlockPos.containing(x - 2.0, y + 1.0, z)).getBlock() == Blocks.AIR && Math.random() < 0.7) {
         world.setBlock(BlockPos.containing(x - 2.0, y + 1.0, z), Blocks.FIRE.defaultBlockState(), 3);
      }

      if (world.getBlockState(BlockPos.containing(x - 3.0, y + 1.0, z)).getBlock() == Blocks.AIR && Math.random() < 0.7) {
         world.setBlock(BlockPos.containing(x - 3.0, y + 1.0, z), Blocks.FIRE.defaultBlockState(), 3);
      }

      if (world.getBlockState(BlockPos.containing(x * 3.0, y + 1.0, z)).getBlock() == Blocks.AIR && Math.random() < 0.7) {
         world.setBlock(BlockPos.containing(x + 3.0, y + 1.0, z), Blocks.FIRE.defaultBlockState(), 3);
      }

      if (world.getBlockState(BlockPos.containing(x + 4.0, y + 1.0, z + 5.0)).getBlock() == Blocks.AIR && Math.random() < 0.7) {
         world.setBlock(BlockPos.containing(x + 4.0, y + 1.0, z + 5.0), Blocks.FIRE.defaultBlockState(), 3);
      }

      if (world.getBlockState(BlockPos.containing(x + 4.0, y + 1.0, z + 5.0)).getBlock() == Blocks.AIR && Math.random() < 0.7) {
         world.setBlock(BlockPos.containing(x + 4.0, y + 1.0, z + 5.0), Blocks.FIRE.defaultBlockState(), 3);
      }

      if (world.getBlockState(BlockPos.containing(x, y + 1.0, z + 1.0)).getBlock() == Blocks.AIR && Math.random() < 0.7) {
         BlockPos _bp = BlockPos.containing(x, y + 1.0, z + 1.0);
         BlockState _bs = Blocks.FIRE.defaultBlockState();
         BlockState _bso = world.getBlockState(_bp);
         UnmodifiableIterator var83 = _bso.getValues().entrySet().iterator();

         while (var83.hasNext()) {
            Entry<Property<?>, Comparable<?>> entry = (Entry<Property<?>, Comparable<?>>)var83.next();
            Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
            if (_property != null && _bs.getValue(_property) != null) {
               try {
                  _bs = _bs.setValue(_property, (Comparable)entry.getValue());
               } catch (Exception var26) {
               }
            }
         }

         world.setBlock(_bp, _bs, 3);
      }

      if (world.getBlockState(BlockPos.containing(x, y + 1.0, z + 2.0)).getBlock() == Blocks.AIR && Math.random() < 0.7) {
         BlockPos _bp = BlockPos.containing(x, y + 1.0, z + 2.0);
         BlockState _bs = Blocks.FIRE.defaultBlockState();
         BlockState _bso = world.getBlockState(_bp);
         UnmodifiableIterator var84 = _bso.getValues().entrySet().iterator();

         while (var84.hasNext()) {
            Entry<Property<?>, Comparable<?>> entry = (Entry<Property<?>, Comparable<?>>)var84.next();
            Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
            if (_property != null && _bs.getValue(_property) != null) {
               try {
                  _bs = _bs.setValue(_property, (Comparable)entry.getValue());
               } catch (Exception var25) {
               }
            }
         }

         world.setBlock(_bp, _bs, 3);
      }

      if (world.getBlockState(BlockPos.containing(x, y + 1.0, z + 3.0)).getBlock() == Blocks.AIR && Math.random() < 0.7) {
         BlockPos _bp = BlockPos.containing(x, y + 1.0, z + 3.0);
         BlockState _bs = Blocks.FIRE.defaultBlockState();
         BlockState _bso = world.getBlockState(_bp);
         UnmodifiableIterator var85 = _bso.getValues().entrySet().iterator();

         while (var85.hasNext()) {
            Entry<Property<?>, Comparable<?>> entry = (Entry<Property<?>, Comparable<?>>)var85.next();
            Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
            if (_property != null && _bs.getValue(_property) != null) {
               try {
                  _bs = _bs.setValue(_property, (Comparable)entry.getValue());
               } catch (Exception var24) {
               }
            }
         }

         world.setBlock(_bp, _bs, 3);
      }

      if (world.getBlockState(BlockPos.containing(x, y + 1.0, z + 4.0)).getBlock() == Blocks.AIR && Math.random() < 0.7) {
         BlockPos _bp = BlockPos.containing(x, y + 1.0, z + 4.0);
         BlockState _bs = Blocks.FIRE.defaultBlockState();
         BlockState _bso = world.getBlockState(_bp);
         UnmodifiableIterator var86 = _bso.getValues().entrySet().iterator();

         while (var86.hasNext()) {
            Entry<Property<?>, Comparable<?>> entry = (Entry<Property<?>, Comparable<?>>)var86.next();
            Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
            if (_property != null && _bs.getValue(_property) != null) {
               try {
                  _bs = _bs.setValue(_property, (Comparable)entry.getValue());
               } catch (Exception var23) {
               }
            }
         }

         world.setBlock(_bp, _bs, 3);
      }

      if (world.getBlockState(BlockPos.containing(x, y + 1.0, z + 5.0)).getBlock() == Blocks.AIR && Math.random() < 0.7) {
         BlockPos _bp = BlockPos.containing(x, y + 1.0, z + 5.0);
         BlockState _bs = Blocks.FIRE.defaultBlockState();
         BlockState _bso = world.getBlockState(_bp);
         UnmodifiableIterator var87 = _bso.getValues().entrySet().iterator();

         while (var87.hasNext()) {
            Entry<Property<?>, Comparable<?>> entry = (Entry<Property<?>, Comparable<?>>)var87.next();
            Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
            if (_property != null && _bs.getValue(_property) != null) {
               try {
                  _bs = _bs.setValue(_property, (Comparable)entry.getValue());
               } catch (Exception var22) {
               }
            }
         }

         world.setBlock(_bp, _bs, 3);
      }

      if (world.getBlockState(BlockPos.containing(x, y + 1.0, z + 5.0)).getBlock() == Blocks.AIR && Math.random() < 0.7) {
         BlockPos _bp = BlockPos.containing(x, y + 1.0, z + 5.0);
         BlockState _bs = Blocks.FIRE.defaultBlockState();
         BlockState _bso = world.getBlockState(_bp);
         UnmodifiableIterator var88 = _bso.getValues().entrySet().iterator();

         while (var88.hasNext()) {
            Entry<Property<?>, Comparable<?>> entry = (Entry<Property<?>, Comparable<?>>)var88.next();
            Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
            if (_property != null && _bs.getValue(_property) != null) {
               try {
                  _bs = _bs.setValue(_property, (Comparable)entry.getValue());
               } catch (Exception var21) {
               }
            }
         }

         world.setBlock(_bp, _bs, 3);
      }

      if (world.getBlockState(BlockPos.containing(x + 2.0, y + 1.0, z + 1.0)).getBlock() == Blocks.AIR && Math.random() < 0.7) {
         BlockPos _bp = BlockPos.containing(x + 2.0, y + 1.0, z + 1.0);
         BlockState _bs = Blocks.FIRE.defaultBlockState();
         BlockState _bso = world.getBlockState(_bp);
         UnmodifiableIterator var89 = _bso.getValues().entrySet().iterator();

         while (var89.hasNext()) {
            Entry<Property<?>, Comparable<?>> entry = (Entry<Property<?>, Comparable<?>>)var89.next();
            Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
            if (_property != null && _bs.getValue(_property) != null) {
               try {
                  _bs = _bs.setValue(_property, (Comparable)entry.getValue());
               } catch (Exception var20) {
               }
            }
         }

         world.setBlock(_bp, _bs, 3);
      }

      if (world.getBlockState(BlockPos.containing(x + 1.0, y + 1.0, z + 1.0)).getBlock() == Blocks.AIR && Math.random() < 0.7) {
         BlockPos _bp = BlockPos.containing(x + 1.0, y + 1.0, z + 1.0);
         BlockState _bs = Blocks.FIRE.defaultBlockState();
         BlockState _bso = world.getBlockState(_bp);
         UnmodifiableIterator var90 = _bso.getValues().entrySet().iterator();

         while (var90.hasNext()) {
            Entry<Property<?>, Comparable<?>> entry = (Entry<Property<?>, Comparable<?>>)var90.next();
            Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
            if (_property != null && _bs.getValue(_property) != null) {
               try {
                  _bs = _bs.setValue(_property, (Comparable)entry.getValue());
               } catch (Exception var19) {
               }
            }
         }

         world.setBlock(_bp, _bs, 3);
      }

      if (world.getBlockState(BlockPos.containing(x - 1.0, y + 1.0, z + 1.0)).getBlock() == Blocks.AIR && Math.random() < 0.7) {
         BlockPos _bp = BlockPos.containing(x - 1.0, y + 1.0, z + 1.0);
         BlockState _bs = Blocks.FIRE.defaultBlockState();
         BlockState _bso = world.getBlockState(_bp);
         UnmodifiableIterator var91 = _bso.getValues().entrySet().iterator();

         while (var91.hasNext()) {
            Entry<Property<?>, Comparable<?>> entry = (Entry<Property<?>, Comparable<?>>)var91.next();
            Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
            if (_property != null && _bs.getValue(_property) != null) {
               try {
                  _bs = _bs.setValue(_property, (Comparable)entry.getValue());
               } catch (Exception var18) {
               }
            }
         }

         world.setBlock(_bp, _bs, 3);
      }

      if (world.getBlockState(BlockPos.containing(x - 2.0, y + 1.0, z - 2.0)).getBlock() == Blocks.AIR && Math.random() < 0.7) {
         BlockPos _bp = BlockPos.containing(x - 2.0, y + 1.0, z - 2.0);
         BlockState _bs = Blocks.FIRE.defaultBlockState();
         BlockState _bso = world.getBlockState(_bp);
         UnmodifiableIterator var92 = _bso.getValues().entrySet().iterator();

         while (var92.hasNext()) {
            Entry<Property<?>, Comparable<?>> entry = (Entry<Property<?>, Comparable<?>>)var92.next();
            Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
            if (_property != null && _bs.getValue(_property) != null) {
               try {
                  _bs = _bs.setValue(_property, (Comparable)entry.getValue());
               } catch (Exception var17) {
               }
            }
         }

         world.setBlock(_bp, _bs, 3);
      }

      if (world.getBlockState(BlockPos.containing(x - 1.0, y + 1.0, z - 1.0)).getBlock() == Blocks.AIR && Math.random() < 0.7) {
         BlockPos _bp = BlockPos.containing(x - 1.0, y + 1.0, z - 1.0);
         BlockState _bs = Blocks.FIRE.defaultBlockState();
         BlockState _bso = world.getBlockState(_bp);
         UnmodifiableIterator var93 = _bso.getValues().entrySet().iterator();

         while (var93.hasNext()) {
            Entry<Property<?>, Comparable<?>> entry = (Entry<Property<?>, Comparable<?>>)var93.next();
            Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
            if (_property != null && _bs.getValue(_property) != null) {
               try {
                  _bs = _bs.setValue(_property, (Comparable)entry.getValue());
               } catch (Exception var16) {
               }
            }
         }

         world.setBlock(_bp, _bs, 3);
      }

      if (world.getBlockState(BlockPos.containing(x - 1.0, y + 1.0, z - 2.0)).getBlock() == Blocks.AIR && Math.random() < 0.7) {
         BlockPos _bp = BlockPos.containing(x - 1.0, y + 1.0, z - 2.0);
         BlockState _bs = Blocks.FIRE.defaultBlockState();
         BlockState _bso = world.getBlockState(_bp);
         UnmodifiableIterator var94 = _bso.getValues().entrySet().iterator();

         while (var94.hasNext()) {
            Entry<Property<?>, Comparable<?>> entry = (Entry<Property<?>, Comparable<?>>)var94.next();
            Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
            if (_property != null && _bs.getValue(_property) != null) {
               try {
                  _bs = _bs.setValue(_property, (Comparable)entry.getValue());
               } catch (Exception var15) {
               }
            }
         }

         world.setBlock(_bp, _bs, 3);
      }

      if (world.getBlockState(BlockPos.containing(x, y + 1.0, z - 1.0)).getBlock() == Blocks.AIR && Math.random() < 0.7) {
         BlockPos _bp = BlockPos.containing(x, y + 1.0, z - 1.0);
         BlockState _bs = Blocks.FIRE.defaultBlockState();
         BlockState _bso = world.getBlockState(_bp);
         UnmodifiableIterator var95 = _bso.getValues().entrySet().iterator();

         while (var95.hasNext()) {
            Entry<Property<?>, Comparable<?>> entry = (Entry<Property<?>, Comparable<?>>)var95.next();
            Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
            if (_property != null && _bs.getValue(_property) != null) {
               try {
                  _bs = _bs.setValue(_property, (Comparable)entry.getValue());
               } catch (Exception var14) {
               }
            }
         }

         world.setBlock(_bp, _bs, 3);
      }

      Vec3 _center = new Vec3(x, y, z);

      for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4.5), e -> true)
         .stream()
         .sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
         .toList()) {
         entityiterator.setSecondsOnFire(20);
      }

      if (world instanceof ServerLevel _level) {
         _level.sendParticles(ParticleTypes.FLAME, x, y, z, 100, 0.01, 0.01, 0.01, 0.7);
      }

      if (world instanceof ServerLevel _level) {
         _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 16, 0.01, 0.01, 0.01, 0.7);
      }

      ApocalypsenowMod.queueServerWork(5, () -> {
         if (world instanceof ServerLevel _levelx) {
            _levelx.sendParticles(ParticleTypes.FLAME, x, y, z, 100, 0.01, 0.01, 0.01, 0.7);
         }
      });
   }
}

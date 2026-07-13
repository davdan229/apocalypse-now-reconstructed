package net.mcreator.apocalypsenow.procedures;

import javax.annotation.Nullable;
import net.mcreator.apocalypsenow.ApocalypsenowMod;
import net.mcreator.apocalypsenow.configuration.ApocalypsenowconfigurationConfiguration;
import net.mcreator.apocalypsenow.init.ApocalypsenowModEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class PopulationDensityProcedure {
   @SubscribeEvent
   public static void onEntitySpawned(EntityJoinLevelEvent event) {
      execute(event, event.getLevel(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
   }

   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
      execute(null, world, x, y, z, entity);
   }

   private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
      if (entity != null) {
         // Bonus walkers also fire EntityJoinLevelEvent. Excluding the exact
         // bonus type prevents high density settings from recursively spawning
         // an unbounded chain while preserving bonuses for every other undead.
         if (entity.getType() == ApocalypsenowModEntities.WALKER_16.get()) {
            return;
         }

         if (entity instanceof LivingEntity _livEnt0
            && _livEnt0.getMobType() == MobType.UNDEAD
            && ApocalypsenowconfigurationConfiguration.WALKERS_RUNNERS_SPAWN.get()
            && ApocalypsenowconfigurationConfiguration.POPULATION_DENSITY.get() == 0.1
            && Math.random() < 0.05) {
            ApocalypsenowMod.queueServerWork(40, () -> {
               if (world instanceof ServerLevel _level) {
                  Entity entityToSpawn = ApocalypsenowModEntities.WALKER_16.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
                  }
               }
            });
         }

         if (entity instanceof LivingEntity _livEnt5
            && _livEnt5.getMobType() == MobType.UNDEAD
            && ApocalypsenowconfigurationConfiguration.WALKERS_RUNNERS_SPAWN.get()
            && ApocalypsenowconfigurationConfiguration.POPULATION_DENSITY.get() == 0.2
            && Math.random() < 0.09) {
            ApocalypsenowMod.queueServerWork(40, () -> {
               if (world instanceof ServerLevel _level) {
                  Entity entityToSpawn = ApocalypsenowModEntities.WALKER_16.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
                  }
               }

               if (world instanceof ServerLevel _level) {
                  Entity entityToSpawn = ApocalypsenowModEntities.WALKER_16.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
                  }
               }
            });
         }

         if (entity instanceof LivingEntity _livEnt11
            && _livEnt11.getMobType() == MobType.UNDEAD
            && ApocalypsenowconfigurationConfiguration.WALKERS_RUNNERS_SPAWN.get()
            && ApocalypsenowconfigurationConfiguration.POPULATION_DENSITY.get() == 0.3
            && Math.random() < 0.1) {
            ApocalypsenowMod.queueServerWork(40, () -> {
               if (world instanceof ServerLevel _level) {
                  Entity entityToSpawn = ApocalypsenowModEntities.WALKER_16.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
                  }
               }

               if (world instanceof ServerLevel _level) {
                  Entity entityToSpawn = ApocalypsenowModEntities.WALKER_16.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
                  }
               }

               if (world instanceof ServerLevel _level) {
                  Entity entityToSpawn = ApocalypsenowModEntities.WALKER_16.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
                  }
               }

               if (world instanceof ServerLevel _level) {
                  Entity entityToSpawn = ApocalypsenowModEntities.WALKER_16.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
                  }
               }
            });
         }

         if (entity instanceof LivingEntity _livEnt19
            && _livEnt19.getMobType() == MobType.UNDEAD
            && ApocalypsenowconfigurationConfiguration.WALKERS_RUNNERS_SPAWN.get()
            && ApocalypsenowconfigurationConfiguration.POPULATION_DENSITY.get() == 0.4
            && Math.random() < 0.16) {
            ApocalypsenowMod.queueServerWork(
               40,
               () -> {
                  if (world instanceof ServerLevel _level) {
                     Entity entityToSpawn = ApocalypsenowModEntities.WALKER_16.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
                     if (entityToSpawn != null) {
                        entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
                     }
                  }

                  ApocalypsenowMod.queueServerWork(
                     80,
                     () -> {
                        if (world instanceof ServerLevel _levelxxx) {
                           Entity entityToSpawnxxx = ApocalypsenowModEntities.WALKER_16
                              .get()
                              .spawn(_levelxxx, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
                           if (entityToSpawnxxx != null) {
                              entityToSpawnxxx.setYRot(world.getRandom().nextFloat() * 360.0F);
                           }
                        }

                        if (world instanceof ServerLevel _levelxx) {
                           Entity entityToSpawnxx = ApocalypsenowModEntities.WALKER_16
                              .get()
                              .spawn(_levelxx, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
                           if (entityToSpawnxx != null) {
                              entityToSpawnxx.setYRot(world.getRandom().nextFloat() * 360.0F);
                           }
                        }

                        if (world instanceof ServerLevel _levelx) {
                           Entity entityToSpawnx = ApocalypsenowModEntities.WALKER_16
                              .get()
                              .spawn(_levelx, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
                           if (entityToSpawnx != null) {
                              entityToSpawnx.setYRot(world.getRandom().nextFloat() * 360.0F);
                           }
                        }

                        ApocalypsenowMod.queueServerWork(
                           90,
                           () -> {
                              if (world instanceof ServerLevel _levelxxxxxx) {
                                 Entity entityToSpawnxxxxxx = ApocalypsenowModEntities.WALKER_16
                                    .get()
                                    .spawn(_levelxxxxxx, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
                                 if (entityToSpawnxxxxxx != null) {
                                    entityToSpawnxxxxxx.setYRot(world.getRandom().nextFloat() * 360.0F);
                                 }
                              }

                              if (world instanceof ServerLevel _levelxxxxx) {
                                 Entity entityToSpawnxxxxx = ApocalypsenowModEntities.WALKER_16
                                    .get()
                                    .spawn(_levelxxxxx, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
                                 if (entityToSpawnxxxxx != null) {
                                    entityToSpawnxxxxx.setYRot(world.getRandom().nextFloat() * 360.0F);
                                 }
                              }

                              if (world instanceof ServerLevel _levelxxxx) {
                                 Entity entityToSpawnxxxx = ApocalypsenowModEntities.WALKER_16
                                    .get()
                                    .spawn(_levelxxxx, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
                                 if (entityToSpawnxxxx != null) {
                                    entityToSpawnxxxx.setYRot(world.getRandom().nextFloat() * 360.0F);
                                 }
                              }
                           }
                        );
                     }
                  );
               }
            );
         }

         if (entity instanceof LivingEntity _livEnt32
            && _livEnt32.getMobType() == MobType.UNDEAD
            && ApocalypsenowconfigurationConfiguration.WALKERS_RUNNERS_SPAWN.get()
            && ApocalypsenowconfigurationConfiguration.POPULATION_DENSITY.get() == 0.5
            && Math.random() < 0.16) {
            ApocalypsenowMod.queueServerWork(
               40,
               () -> {
                  if (world instanceof ServerLevel _level) {
                     Entity entityToSpawn = ApocalypsenowModEntities.WALKER_16.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
                     if (entityToSpawn != null) {
                        entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
                     }
                  }

                  ApocalypsenowMod.queueServerWork(
                     80,
                     () -> {
                        if (world instanceof ServerLevel _levelxxx) {
                           Entity entityToSpawnxxx = ApocalypsenowModEntities.WALKER_16
                              .get()
                              .spawn(_levelxxx, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
                           if (entityToSpawnxxx != null) {
                              entityToSpawnxxx.setYRot(world.getRandom().nextFloat() * 360.0F);
                           }
                        }

                        if (world instanceof ServerLevel _levelxx) {
                           Entity entityToSpawnxx = ApocalypsenowModEntities.WALKER_16
                              .get()
                              .spawn(_levelxx, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
                           if (entityToSpawnxx != null) {
                              entityToSpawnxx.setYRot(world.getRandom().nextFloat() * 360.0F);
                           }
                        }

                        if (world instanceof ServerLevel _levelx) {
                           Entity entityToSpawnx = ApocalypsenowModEntities.WALKER_16
                              .get()
                              .spawn(_levelx, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
                           if (entityToSpawnx != null) {
                              entityToSpawnx.setYRot(world.getRandom().nextFloat() * 360.0F);
                           }
                        }

                        ApocalypsenowMod.queueServerWork(
                           90,
                           () -> {
                              if (world instanceof ServerLevel _levelxxxxxxx) {
                                 Entity entityToSpawnxxxxxxx = ApocalypsenowModEntities.WALKER_16
                                    .get()
                                    .spawn(_levelxxxxxxx, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
                                 if (entityToSpawnxxxxxxx != null) {
                                    entityToSpawnxxxxxxx.setYRot(world.getRandom().nextFloat() * 360.0F);
                                 }
                              }

                              if (world instanceof ServerLevel _levelxxxxxx) {
                                 Entity entityToSpawnxxxxxx = ApocalypsenowModEntities.WALKER_16
                                    .get()
                                    .spawn(_levelxxxxxx, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
                                 if (entityToSpawnxxxxxx != null) {
                                    entityToSpawnxxxxxx.setYRot(world.getRandom().nextFloat() * 360.0F);
                                 }
                              }

                              if (world instanceof ServerLevel _levelxxxxx) {
                                 Entity entityToSpawnxxxxx = ApocalypsenowModEntities.WALKER_16
                                    .get()
                                    .spawn(_levelxxxxx, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
                                 if (entityToSpawnxxxxx != null) {
                                    entityToSpawnxxxxx.setYRot(world.getRandom().nextFloat() * 360.0F);
                                 }
                              }

                              if (world instanceof ServerLevel _levelxxxx) {
                                 Entity entityToSpawnxxxx = ApocalypsenowModEntities.WALKER_16
                                    .get()
                                    .spawn(_levelxxxx, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
                                 if (entityToSpawnxxxx != null) {
                                    entityToSpawnxxxx.setYRot(world.getRandom().nextFloat() * 360.0F);
                                 }
                              }

                              if (Math.random() < 0.5) {
                                 ApocalypsenowMod.queueServerWork(
                                    40,
                                    () -> {
                                       if (world instanceof ServerLevel _levelxxxxxxxx) {
                                          Entity entityToSpawnxxxxxxxx = ApocalypsenowModEntities.WALKER_16
                                             .get()
                                             .spawn(_levelxxxxxxxx, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
                                          if (entityToSpawnxxxxxxxx != null) {
                                             entityToSpawnxxxxxxxx.setYRot(world.getRandom().nextFloat() * 360.0F);
                                          }
                                       }

                                       ApocalypsenowMod.queueServerWork(
                                          80,
                                          () -> {
                                             if (world instanceof ServerLevel _levelxxxxxxxxxxx) {
                                                Entity entityToSpawnxxxxxxxxxxx = ApocalypsenowModEntities.WALKER_16
                                                   .get()
                                                   .spawn(_levelxxxxxxxxxxx, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
                                                if (entityToSpawnxxxxxxxxxxx != null) {
                                                   entityToSpawnxxxxxxxxxxx.setYRot(world.getRandom().nextFloat() * 360.0F);
                                                }
                                             }

                                             if (world instanceof ServerLevel _levelxxxxxxxxxx) {
                                                Entity entityToSpawnxxxxxxxxxx = ApocalypsenowModEntities.WALKER_16
                                                   .get()
                                                   .spawn(_levelxxxxxxxxxx, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
                                                if (entityToSpawnxxxxxxxxxx != null) {
                                                   entityToSpawnxxxxxxxxxx.setYRot(world.getRandom().nextFloat() * 360.0F);
                                                }
                                             }

                                             if (world instanceof ServerLevel _levelxxxxxxxxx) {
                                                Entity entityToSpawnxxxxxxxxx = ApocalypsenowModEntities.WALKER_16
                                                   .get()
                                                   .spawn(_levelxxxxxxxxx, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
                                                if (entityToSpawnxxxxxxxxx != null) {
                                                   entityToSpawnxxxxxxxxx.setYRot(world.getRandom().nextFloat() * 360.0F);
                                                }
                                             }

                                             ApocalypsenowMod.queueServerWork(
                                                90,
                                                () -> {
                                                   if (world instanceof ServerLevel _levelxxxxxxxxxxxxxxx) {
                                                      Entity entityToSpawnxxxxxxxxxxxxxxx = ApocalypsenowModEntities.WALKER_16
                                                         .get()
                                                         .spawn(_levelxxxxxxxxxxxxxxx, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
                                                      if (entityToSpawnxxxxxxxxxxxxxxx != null) {
                                                         entityToSpawnxxxxxxxxxxxxxxx.setYRot(world.getRandom().nextFloat() * 360.0F);
                                                      }
                                                   }

                                                   if (world instanceof ServerLevel _levelxxxxxxxxxxxxxx) {
                                                      Entity entityToSpawnxxxxxxxxxxxxxx = ApocalypsenowModEntities.WALKER_16
                                                         .get()
                                                         .spawn(_levelxxxxxxxxxxxxxx, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
                                                      if (entityToSpawnxxxxxxxxxxxxxx != null) {
                                                         entityToSpawnxxxxxxxxxxxxxx.setYRot(world.getRandom().nextFloat() * 360.0F);
                                                      }
                                                   }

                                                   if (world instanceof ServerLevel _levelxxxxxxxxxxxxx) {
                                                      Entity entityToSpawnxxxxxxxxxxxxx = ApocalypsenowModEntities.WALKER_16
                                                         .get()
                                                         .spawn(_levelxxxxxxxxxxxxx, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
                                                      if (entityToSpawnxxxxxxxxxxxxx != null) {
                                                         entityToSpawnxxxxxxxxxxxxx.setYRot(world.getRandom().nextFloat() * 360.0F);
                                                      }
                                                   }

                                                   if (world instanceof ServerLevel _levelxxxxxxxxxxxx) {
                                                      Entity entityToSpawnxxxxxxxxxxxx = ApocalypsenowModEntities.WALKER_16
                                                         .get()
                                                         .spawn(_levelxxxxxxxxxxxx, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
                                                      if (entityToSpawnxxxxxxxxxxxx != null) {
                                                         entityToSpawnxxxxxxxxxxxx.setYRot(world.getRandom().nextFloat() * 360.0F);
                                                      }
                                                   }
                                                }
                                             );
                                          }
                                       );
                                    }
                                 );
                              }
                           }
                        );
                     }
                  );
               }
            );
         }
      }
   }
}

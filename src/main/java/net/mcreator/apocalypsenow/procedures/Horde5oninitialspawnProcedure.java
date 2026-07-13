package net.mcreator.apocalypsenow.procedures;

import net.mcreator.apocalypsenow.ApocalypsenowMod;
import net.mcreator.apocalypsenow.init.ApocalypsenowModEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.level.LevelAccessor;

public class Horde5oninitialspawnProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z) {
      if (Math.random() < 0.2) {
         for (int index0 = 0; index0 < 2; index0++) {
            ApocalypsenowMod.queueServerWork(
               20,
               () -> {
                  if (world instanceof ServerLevel _level) {
                     Entity entityToSpawn = ApocalypsenowModEntities.RUNNER_34.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
                     if (entityToSpawn != null) {
                        entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
                     }
                  }

                  if (world instanceof ServerLevel _level) {
                     Entity entityToSpawn = ApocalypsenowModEntities.RUNNER_35.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
                     if (entityToSpawn != null) {
                        entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
                     }
                  }

                  if (world instanceof ServerLevel _level) {
                     Entity entityToSpawn = ApocalypsenowModEntities.RUNNER_45.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
                     if (entityToSpawn != null) {
                        entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
                     }
                  }

                  if (world instanceof ServerLevel _level) {
                     Entity entityToSpawn = ApocalypsenowModEntities.RUNNER_50.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
                     if (entityToSpawn != null) {
                        entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
                     }
                  }

                  if (world instanceof ServerLevel _level) {
                     Entity entityToSpawn = ApocalypsenowModEntities.RUNNER_34
                        .get()
                        .spawn(_level, BlockPos.containing(x + 1.0, y, z), MobSpawnType.MOB_SUMMONED);
                     if (entityToSpawn != null) {
                        entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
                     }
                  }

                  if (world instanceof ServerLevel _level) {
                     Entity entityToSpawn = ApocalypsenowModEntities.RUNNER_35
                        .get()
                        .spawn(_level, BlockPos.containing(x + 2.0, y, z), MobSpawnType.MOB_SUMMONED);
                     if (entityToSpawn != null) {
                        entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
                     }
                  }

                  if (world instanceof ServerLevel _level) {
                     Entity entityToSpawn = ApocalypsenowModEntities.WALKER_26
                        .get()
                        .spawn(_level, BlockPos.containing(x + 3.0, y, z), MobSpawnType.MOB_SUMMONED);
                     if (entityToSpawn != null) {
                        entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
                     }
                  }

                  if (world instanceof ServerLevel _level) {
                     Entity entityToSpawn = ApocalypsenowModEntities.RUNNER_50
                        .get()
                        .spawn(_level, BlockPos.containing(x + 4.0, y, z), MobSpawnType.MOB_SUMMONED);
                     if (entityToSpawn != null) {
                        entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
                     }
                  }

                  if (world instanceof ServerLevel _level) {
                     Entity entityToSpawn = ApocalypsenowModEntities.RUNNER_34
                        .get()
                        .spawn(_level, BlockPos.containing(x - 1.0, y, z), MobSpawnType.MOB_SUMMONED);
                     if (entityToSpawn != null) {
                        entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
                     }
                  }

                  if (world instanceof ServerLevel _level) {
                     Entity entityToSpawn = ApocalypsenowModEntities.RUNNER_35
                        .get()
                        .spawn(_level, BlockPos.containing(x - 2.0, y, z), MobSpawnType.MOB_SUMMONED);
                     if (entityToSpawn != null) {
                        entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
                     }
                  }

                  if (world instanceof ServerLevel _level) {
                     Entity entityToSpawn = ApocalypsenowModEntities.RUNNER_45
                        .get()
                        .spawn(_level, BlockPos.containing(x - 3.0, y, z), MobSpawnType.MOB_SUMMONED);
                     if (entityToSpawn != null) {
                        entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
                     }
                  }

                  if (world instanceof ServerLevel _level) {
                     Entity entityToSpawn = ApocalypsenowModEntities.RUNNER_52
                        .get()
                        .spawn(_level, BlockPos.containing(x - 4.0, y, z), MobSpawnType.MOB_SUMMONED);
                     if (entityToSpawn != null) {
                        entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
                     }
                  }

                  ApocalypsenowMod.queueServerWork(
                     20,
                     () -> {
                        if (world instanceof ServerLevel _levelxxxxxxx) {
                           Entity entityToSpawnxxxxxxxxxxxx = ApocalypsenowModEntities.WALKER_13
                              .get()
                              .spawn(_levelxxxxxxx, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
                           if (entityToSpawnxxxxxxxxxxxx != null) {
                              entityToSpawnxxxxxxxxxxxx.setYRot(world.getRandom().nextFloat() * 360.0F);
                           }
                        }

                        if (world instanceof ServerLevel _levelxxxxxx) {
                           Entity entityToSpawnxxxxxxxxxxx = ApocalypsenowModEntities.RUNNER_35
                              .get()
                              .spawn(_levelxxxxxx, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
                           if (entityToSpawnxxxxxxxxxxx != null) {
                              entityToSpawnxxxxxxxxxxx.setYRot(world.getRandom().nextFloat() * 360.0F);
                           }
                        }

                        if (world instanceof ServerLevel _levelxxxxxxxxxxxx) {
                           Entity entityToSpawnxxxxx = ApocalypsenowModEntities.WALKER_26
                              .get()
                              .spawn(_levelxxxxxxxxxxxx, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
                           if (entityToSpawnxxxxx != null) {
                              entityToSpawnxxxxx.setYRot(world.getRandom().nextFloat() * 360.0F);
                           }
                        }

                        if (world instanceof ServerLevel _levelxxxxx) {
                           Entity entityToSpawnxxxxxxxxxx = ApocalypsenowModEntities.WALKER_19
                              .get()
                              .spawn(_levelxxxxx, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
                           if (entityToSpawnxxxxxxxxxx != null) {
                              entityToSpawnxxxxxxxxxx.setYRot(world.getRandom().nextFloat() * 360.0F);
                           }
                        }

                        if (world instanceof ServerLevel _levelxxxxxxxxxxx) {
                           Entity entityToSpawnxxxx = ApocalypsenowModEntities.RUNNER_34
                              .get()
                              .spawn(_levelxxxxxxxxxxx, BlockPos.containing(x + 1.0, y, z), MobSpawnType.MOB_SUMMONED);
                           if (entityToSpawnxxxx != null) {
                              entityToSpawnxxxx.setYRot(world.getRandom().nextFloat() * 360.0F);
                           }
                        }

                        if (world instanceof ServerLevel _levelxxxx) {
                           Entity entityToSpawnxxxxxxxxx = ApocalypsenowModEntities.WALKER_15
                              .get()
                              .spawn(_levelxxxx, BlockPos.containing(x + 2.0, y, z), MobSpawnType.MOB_SUMMONED);
                           if (entityToSpawnxxxxxxxxx != null) {
                              entityToSpawnxxxxxxxxx.setYRot(world.getRandom().nextFloat() * 360.0F);
                           }
                        }

                        if (world instanceof ServerLevel _levelxxxxxxxxxx) {
                           Entity entityToSpawnxxx = ApocalypsenowModEntities.WALKER_26
                              .get()
                              .spawn(_levelxxxxxxxxxx, BlockPos.containing(x + 3.0, y, z), MobSpawnType.MOB_SUMMONED);
                           if (entityToSpawnxxx != null) {
                              entityToSpawnxxx.setYRot(world.getRandom().nextFloat() * 360.0F);
                           }
                        }

                        if (world instanceof ServerLevel _levelxxx) {
                           Entity entityToSpawnxxxxxxxx = ApocalypsenowModEntities.WALKER_18
                              .get()
                              .spawn(_levelxxx, BlockPos.containing(x + 4.0, y, z), MobSpawnType.MOB_SUMMONED);
                           if (entityToSpawnxxxxxxxx != null) {
                              entityToSpawnxxxxxxxx.setYRot(world.getRandom().nextFloat() * 360.0F);
                           }
                        }

                        if (world instanceof ServerLevel _levelxxxxxxxxx) {
                           Entity entityToSpawnxx = ApocalypsenowModEntities.WALKER_12
                              .get()
                              .spawn(_levelxxxxxxxxx, BlockPos.containing(x - 1.0, y, z), MobSpawnType.MOB_SUMMONED);
                           if (entityToSpawnxx != null) {
                              entityToSpawnxx.setYRot(world.getRandom().nextFloat() * 360.0F);
                           }
                        }

                        if (world instanceof ServerLevel _levelxx) {
                           Entity entityToSpawnxxxxxxx = ApocalypsenowModEntities.WALKER_17
                              .get()
                              .spawn(_levelxx, BlockPos.containing(x - 2.0, y, z), MobSpawnType.MOB_SUMMONED);
                           if (entityToSpawnxxxxxxx != null) {
                              entityToSpawnxxxxxxx.setYRot(world.getRandom().nextFloat() * 360.0F);
                           }
                        }

                        if (world instanceof ServerLevel _levelxxxxxxxx) {
                           Entity entityToSpawnx = ApocalypsenowModEntities.WALKER_19
                              .get()
                              .spawn(_levelxxxxxxxx, BlockPos.containing(x - 3.0, y, z), MobSpawnType.MOB_SUMMONED);
                           if (entityToSpawnx != null) {
                              entityToSpawnx.setYRot(world.getRandom().nextFloat() * 360.0F);
                           }
                        }

                        if (world instanceof ServerLevel _levelx) {
                           Entity entityToSpawnxxxxxx = ApocalypsenowModEntities.WALKER_27
                              .get()
                              .spawn(_levelx, BlockPos.containing(x - 4.0, y, z), MobSpawnType.MOB_SUMMONED);
                           if (entityToSpawnxxxxxx != null) {
                              entityToSpawnxxxxxx.setYRot(world.getRandom().nextFloat() * 360.0F);
                           }
                        }
                     }
                  );
                  ApocalypsenowMod.queueServerWork(
                     40,
                     () -> {
                        if (world instanceof ServerLevel _levelxxxxxxx) {
                           Entity entityToSpawnxxxxxxxxxxxx = ApocalypsenowModEntities.RUNNER_34
                              .get()
                              .spawn(_levelxxxxxxx, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
                           if (entityToSpawnxxxxxxxxxxxx != null) {
                              entityToSpawnxxxxxxxxxxxx.setYRot(world.getRandom().nextFloat() * 360.0F);
                           }
                        }

                        if (world instanceof ServerLevel _levelxxxxxx) {
                           Entity entityToSpawnxxxxxxxxxxx = ApocalypsenowModEntities.RUNNER_35
                              .get()
                              .spawn(_levelxxxxxx, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
                           if (entityToSpawnxxxxxxxxxxx != null) {
                              entityToSpawnxxxxxxxxxxx.setYRot(world.getRandom().nextFloat() * 360.0F);
                           }
                        }

                        if (world instanceof ServerLevel _levelxxxxxxxxxxxx) {
                           Entity entityToSpawnxxxxx = ApocalypsenowModEntities.WALKER_26
                              .get()
                              .spawn(_levelxxxxxxxxxxxx, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
                           if (entityToSpawnxxxxx != null) {
                              entityToSpawnxxxxx.setYRot(world.getRandom().nextFloat() * 360.0F);
                           }
                        }

                        if (world instanceof ServerLevel _levelxxxxx) {
                           Entity entityToSpawnxxxxxxxxxx = ApocalypsenowModEntities.RUNNER_36
                              .get()
                              .spawn(_levelxxxxx, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
                           if (entityToSpawnxxxxxxxxxx != null) {
                              entityToSpawnxxxxxxxxxx.setYRot(world.getRandom().nextFloat() * 360.0F);
                           }
                        }

                        if (world instanceof ServerLevel _levelxxxxxxxxxxx) {
                           Entity entityToSpawnxxxx = ApocalypsenowModEntities.RUNNER_34
                              .get()
                              .spawn(_levelxxxxxxxxxxx, BlockPos.containing(x + 1.0, y, z), MobSpawnType.MOB_SUMMONED);
                           if (entityToSpawnxxxx != null) {
                              entityToSpawnxxxx.setYRot(world.getRandom().nextFloat() * 360.0F);
                           }
                        }

                        if (world instanceof ServerLevel _levelxxxx) {
                           Entity entityToSpawnxxxxxxxxx = ApocalypsenowModEntities.WALKER_15
                              .get()
                              .spawn(_levelxxxx, BlockPos.containing(x + 2.0, y, z), MobSpawnType.MOB_SUMMONED);
                           if (entityToSpawnxxxxxxxxx != null) {
                              entityToSpawnxxxxxxxxx.setYRot(world.getRandom().nextFloat() * 360.0F);
                           }
                        }

                        if (world instanceof ServerLevel _levelxxxxxxxxxx) {
                           Entity entityToSpawnxxx = ApocalypsenowModEntities.WALKER_26
                              .get()
                              .spawn(_levelxxxxxxxxxx, BlockPos.containing(x + 3.0, y, z), MobSpawnType.MOB_SUMMONED);
                           if (entityToSpawnxxx != null) {
                              entityToSpawnxxx.setYRot(world.getRandom().nextFloat() * 360.0F);
                           }
                        }

                        if (world instanceof ServerLevel _levelxxx) {
                           Entity entityToSpawnxxxxxxxx = ApocalypsenowModEntities.RUNNER_42
                              .get()
                              .spawn(_levelxxx, BlockPos.containing(x + 4.0, y, z), MobSpawnType.MOB_SUMMONED);
                           if (entityToSpawnxxxxxxxx != null) {
                              entityToSpawnxxxxxxxx.setYRot(world.getRandom().nextFloat() * 360.0F);
                           }
                        }

                        if (world instanceof ServerLevel _levelxxxxxxxxx) {
                           Entity entityToSpawnxx = ApocalypsenowModEntities.WALKER_12
                              .get()
                              .spawn(_levelxxxxxxxxx, BlockPos.containing(x - 1.0, y, z), MobSpawnType.MOB_SUMMONED);
                           if (entityToSpawnxx != null) {
                              entityToSpawnxx.setYRot(world.getRandom().nextFloat() * 360.0F);
                           }
                        }

                        if (world instanceof ServerLevel _levelxx) {
                           Entity entityToSpawnxxxxxxx = ApocalypsenowModEntities.RUNNER_45
                              .get()
                              .spawn(_levelxx, BlockPos.containing(x - 2.0, y, z), MobSpawnType.MOB_SUMMONED);
                           if (entityToSpawnxxxxxxx != null) {
                              entityToSpawnxxxxxxx.setYRot(world.getRandom().nextFloat() * 360.0F);
                           }
                        }

                        if (world instanceof ServerLevel _levelxxxxxxxx) {
                           Entity entityToSpawnx = ApocalypsenowModEntities.WALKER_19
                              .get()
                              .spawn(_levelxxxxxxxx, BlockPos.containing(x - 3.0, y, z), MobSpawnType.MOB_SUMMONED);
                           if (entityToSpawnx != null) {
                              entityToSpawnx.setYRot(world.getRandom().nextFloat() * 360.0F);
                           }
                        }

                        if (world instanceof ServerLevel _levelx) {
                           Entity entityToSpawnxxxxxx = ApocalypsenowModEntities.RUNNER_43
                              .get()
                              .spawn(_levelx, BlockPos.containing(x - 4.0, y, z), MobSpawnType.MOB_SUMMONED);
                           if (entityToSpawnxxxxxx != null) {
                              entityToSpawnxxxxxx.setYRot(world.getRandom().nextFloat() * 360.0F);
                           }
                        }
                     }
                  );
               }
            );
            ApocalypsenowMod.queueServerWork(80, () -> {
               if (world instanceof ServerLevel _level) {
                  Entity entityToSpawn = ApocalypsenowModEntities.RUNNER_34.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
                  }
               }

               if (world instanceof ServerLevel _level) {
                  Entity entityToSpawn = ApocalypsenowModEntities.RUNNER_35.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
                  }
               }

               if (world instanceof ServerLevel _level) {
                  Entity entityToSpawn = ApocalypsenowModEntities.WALKER_26.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
                  }
               }

               if (world instanceof ServerLevel _level) {
                  Entity entityToSpawn = ApocalypsenowModEntities.RUNNER_36.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
                  }
               }

               if (world instanceof ServerLevel _level) {
                  Entity entityToSpawn = ApocalypsenowModEntities.RUNNER_54.get().spawn(_level, BlockPos.containing(x + 1.0, y, z), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
                  }
               }

               if (world instanceof ServerLevel _level) {
                  Entity entityToSpawn = ApocalypsenowModEntities.WALKER_15.get().spawn(_level, BlockPos.containing(x + 2.0, y, z), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
                  }
               }

               if (world instanceof ServerLevel _level) {
                  Entity entityToSpawn = ApocalypsenowModEntities.RUNNER_37.get().spawn(_level, BlockPos.containing(x + 3.0, y, z), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
                  }
               }

               if (world instanceof ServerLevel _level) {
                  Entity entityToSpawn = ApocalypsenowModEntities.RUNNER_42.get().spawn(_level, BlockPos.containing(x + 4.0, y, z), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
                  }
               }

               if (world instanceof ServerLevel _level) {
                  Entity entityToSpawn = ApocalypsenowModEntities.RUNNER_43.get().spawn(_level, BlockPos.containing(x - 1.0, y, z), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
                  }
               }

               if (world instanceof ServerLevel _level) {
                  Entity entityToSpawn = ApocalypsenowModEntities.RUNNER_45.get().spawn(_level, BlockPos.containing(x - 2.0, y, z), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
                  }
               }

               if (world instanceof ServerLevel _level) {
                  Entity entityToSpawn = ApocalypsenowModEntities.WALKER_19.get().spawn(_level, BlockPos.containing(x - 3.0, y, z), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
                  }
               }

               if (world instanceof ServerLevel _level) {
                  Entity entityToSpawn = ApocalypsenowModEntities.RUNNER_40.get().spawn(_level, BlockPos.containing(x - 4.0, y, z), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
                  }
               }
            });
            ApocalypsenowMod.queueServerWork(
               120,
               () -> {
                  if (world instanceof ServerLevel _level) {
                     Entity entityToSpawn = ApocalypsenowModEntities.RUNNER_34.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
                     if (entityToSpawn != null) {
                        entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
                     }
                  }

                  if (world instanceof ServerLevel _level) {
                     Entity entityToSpawn = ApocalypsenowModEntities.RUNNER_35.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
                     if (entityToSpawn != null) {
                        entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
                     }
                  }

                  if (world instanceof ServerLevel _level) {
                     Entity entityToSpawn = ApocalypsenowModEntities.RUNNER_45.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
                     if (entityToSpawn != null) {
                        entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
                     }
                  }

                  if (world instanceof ServerLevel _level) {
                     Entity entityToSpawn = ApocalypsenowModEntities.RUNNER_50.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
                     if (entityToSpawn != null) {
                        entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
                     }
                  }

                  if (world instanceof ServerLevel _level) {
                     Entity entityToSpawn = ApocalypsenowModEntities.RUNNER_34
                        .get()
                        .spawn(_level, BlockPos.containing(x + 1.0, y, z), MobSpawnType.MOB_SUMMONED);
                     if (entityToSpawn != null) {
                        entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
                     }
                  }

                  if (world instanceof ServerLevel _level) {
                     Entity entityToSpawn = ApocalypsenowModEntities.RUNNER_35
                        .get()
                        .spawn(_level, BlockPos.containing(x + 2.0, y, z), MobSpawnType.MOB_SUMMONED);
                     if (entityToSpawn != null) {
                        entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
                     }
                  }

                  if (world instanceof ServerLevel _level) {
                     Entity entityToSpawn = ApocalypsenowModEntities.WALKER_26
                        .get()
                        .spawn(_level, BlockPos.containing(x + 3.0, y, z), MobSpawnType.MOB_SUMMONED);
                     if (entityToSpawn != null) {
                        entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
                     }
                  }

                  if (world instanceof ServerLevel _level) {
                     Entity entityToSpawn = ApocalypsenowModEntities.RUNNER_50
                        .get()
                        .spawn(_level, BlockPos.containing(x + 4.0, y, z), MobSpawnType.MOB_SUMMONED);
                     if (entityToSpawn != null) {
                        entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
                     }
                  }

                  if (world instanceof ServerLevel _level) {
                     Entity entityToSpawn = ApocalypsenowModEntities.RUNNER_34
                        .get()
                        .spawn(_level, BlockPos.containing(x - 1.0, y, z), MobSpawnType.MOB_SUMMONED);
                     if (entityToSpawn != null) {
                        entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
                     }
                  }

                  if (world instanceof ServerLevel _level) {
                     Entity entityToSpawn = ApocalypsenowModEntities.RUNNER_35
                        .get()
                        .spawn(_level, BlockPos.containing(x - 2.0, y, z), MobSpawnType.MOB_SUMMONED);
                     if (entityToSpawn != null) {
                        entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
                     }
                  }

                  if (world instanceof ServerLevel _level) {
                     Entity entityToSpawn = ApocalypsenowModEntities.RUNNER_45
                        .get()
                        .spawn(_level, BlockPos.containing(x - 3.0, y, z), MobSpawnType.MOB_SUMMONED);
                     if (entityToSpawn != null) {
                        entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
                     }
                  }

                  if (world instanceof ServerLevel _level) {
                     Entity entityToSpawn = ApocalypsenowModEntities.RUNNER_46
                        .get()
                        .spawn(_level, BlockPos.containing(x - 4.0, y, z), MobSpawnType.MOB_SUMMONED);
                     if (entityToSpawn != null) {
                        entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
                     }
                  }

                  ApocalypsenowMod.queueServerWork(
                     20,
                     () -> {
                        if (world instanceof ServerLevel _levelxxxxxxx) {
                           Entity entityToSpawnxxxxxxxxxxxx = ApocalypsenowModEntities.WALKER_13
                              .get()
                              .spawn(_levelxxxxxxx, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
                           if (entityToSpawnxxxxxxxxxxxx != null) {
                              entityToSpawnxxxxxxxxxxxx.setYRot(world.getRandom().nextFloat() * 360.0F);
                           }
                        }

                        if (world instanceof ServerLevel _levelxxxxxx) {
                           Entity entityToSpawnxxxxxxxxxxx = ApocalypsenowModEntities.RUNNER_35
                              .get()
                              .spawn(_levelxxxxxx, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
                           if (entityToSpawnxxxxxxxxxxx != null) {
                              entityToSpawnxxxxxxxxxxx.setYRot(world.getRandom().nextFloat() * 360.0F);
                           }
                        }

                        if (world instanceof ServerLevel _levelxxxxxxxxxxxx) {
                           Entity entityToSpawnxxxxx = ApocalypsenowModEntities.WALKER_26
                              .get()
                              .spawn(_levelxxxxxxxxxxxx, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
                           if (entityToSpawnxxxxx != null) {
                              entityToSpawnxxxxx.setYRot(world.getRandom().nextFloat() * 360.0F);
                           }
                        }

                        if (world instanceof ServerLevel _levelxxxxx) {
                           Entity entityToSpawnxxxxxxxxxx = ApocalypsenowModEntities.WALKER_19
                              .get()
                              .spawn(_levelxxxxx, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
                           if (entityToSpawnxxxxxxxxxx != null) {
                              entityToSpawnxxxxxxxxxx.setYRot(world.getRandom().nextFloat() * 360.0F);
                           }
                        }

                        if (world instanceof ServerLevel _levelxxxxxxxxxxx) {
                           Entity entityToSpawnxxxx = ApocalypsenowModEntities.RUNNER_34
                              .get()
                              .spawn(_levelxxxxxxxxxxx, BlockPos.containing(x + 1.0, y, z), MobSpawnType.MOB_SUMMONED);
                           if (entityToSpawnxxxx != null) {
                              entityToSpawnxxxx.setYRot(world.getRandom().nextFloat() * 360.0F);
                           }
                        }

                        if (world instanceof ServerLevel _levelxxxx) {
                           Entity entityToSpawnxxxxxxxxx = ApocalypsenowModEntities.WALKER_15
                              .get()
                              .spawn(_levelxxxx, BlockPos.containing(x + 2.0, y, z), MobSpawnType.MOB_SUMMONED);
                           if (entityToSpawnxxxxxxxxx != null) {
                              entityToSpawnxxxxxxxxx.setYRot(world.getRandom().nextFloat() * 360.0F);
                           }
                        }

                        if (world instanceof ServerLevel _levelxxxxxxxxxx) {
                           Entity entityToSpawnxxx = ApocalypsenowModEntities.WALKER_26
                              .get()
                              .spawn(_levelxxxxxxxxxx, BlockPos.containing(x + 3.0, y, z), MobSpawnType.MOB_SUMMONED);
                           if (entityToSpawnxxx != null) {
                              entityToSpawnxxx.setYRot(world.getRandom().nextFloat() * 360.0F);
                           }
                        }

                        if (world instanceof ServerLevel _levelxxx) {
                           Entity entityToSpawnxxxxxxxx = ApocalypsenowModEntities.WALKER_18
                              .get()
                              .spawn(_levelxxx, BlockPos.containing(x + 4.0, y, z), MobSpawnType.MOB_SUMMONED);
                           if (entityToSpawnxxxxxxxx != null) {
                              entityToSpawnxxxxxxxx.setYRot(world.getRandom().nextFloat() * 360.0F);
                           }
                        }

                        if (world instanceof ServerLevel _levelxxxxxxxxx) {
                           Entity entityToSpawnxx = ApocalypsenowModEntities.WALKER_12
                              .get()
                              .spawn(_levelxxxxxxxxx, BlockPos.containing(x - 1.0, y, z), MobSpawnType.MOB_SUMMONED);
                           if (entityToSpawnxx != null) {
                              entityToSpawnxx.setYRot(world.getRandom().nextFloat() * 360.0F);
                           }
                        }

                        if (world instanceof ServerLevel _levelxx) {
                           Entity entityToSpawnxxxxxxx = ApocalypsenowModEntities.WALKER_17
                              .get()
                              .spawn(_levelxx, BlockPos.containing(x - 2.0, y, z), MobSpawnType.MOB_SUMMONED);
                           if (entityToSpawnxxxxxxx != null) {
                              entityToSpawnxxxxxxx.setYRot(world.getRandom().nextFloat() * 360.0F);
                           }
                        }

                        if (world instanceof ServerLevel _levelxxxxxxxx) {
                           Entity entityToSpawnx = ApocalypsenowModEntities.WALKER_19
                              .get()
                              .spawn(_levelxxxxxxxx, BlockPos.containing(x - 3.0, y, z), MobSpawnType.MOB_SUMMONED);
                           if (entityToSpawnx != null) {
                              entityToSpawnx.setYRot(world.getRandom().nextFloat() * 360.0F);
                           }
                        }

                        if (world instanceof ServerLevel _levelx) {
                           Entity entityToSpawnxxxxxx = ApocalypsenowModEntities.WALKER_27
                              .get()
                              .spawn(_levelx, BlockPos.containing(x - 4.0, y, z), MobSpawnType.MOB_SUMMONED);
                           if (entityToSpawnxxxxxx != null) {
                              entityToSpawnxxxxxx.setYRot(world.getRandom().nextFloat() * 360.0F);
                           }
                        }
                     }
                  );
                  ApocalypsenowMod.queueServerWork(
                     40,
                     () -> {
                        if (world instanceof ServerLevel _levelxxxxxxx) {
                           Entity entityToSpawnxxxxxxxxxxxx = ApocalypsenowModEntities.RUNNER_34
                              .get()
                              .spawn(_levelxxxxxxx, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
                           if (entityToSpawnxxxxxxxxxxxx != null) {
                              entityToSpawnxxxxxxxxxxxx.setYRot(world.getRandom().nextFloat() * 360.0F);
                           }
                        }

                        if (world instanceof ServerLevel _levelxxxxxx) {
                           Entity entityToSpawnxxxxxxxxxxx = ApocalypsenowModEntities.RUNNER_35
                              .get()
                              .spawn(_levelxxxxxx, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
                           if (entityToSpawnxxxxxxxxxxx != null) {
                              entityToSpawnxxxxxxxxxxx.setYRot(world.getRandom().nextFloat() * 360.0F);
                           }
                        }

                        if (world instanceof ServerLevel _levelxxxxxxxxxxxx) {
                           Entity entityToSpawnxxxxx = ApocalypsenowModEntities.WALKER_26
                              .get()
                              .spawn(_levelxxxxxxxxxxxx, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
                           if (entityToSpawnxxxxx != null) {
                              entityToSpawnxxxxx.setYRot(world.getRandom().nextFloat() * 360.0F);
                           }
                        }

                        if (world instanceof ServerLevel _levelxxxxx) {
                           Entity entityToSpawnxxxxxxxxxx = ApocalypsenowModEntities.RUNNER_36
                              .get()
                              .spawn(_levelxxxxx, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
                           if (entityToSpawnxxxxxxxxxx != null) {
                              entityToSpawnxxxxxxxxxx.setYRot(world.getRandom().nextFloat() * 360.0F);
                           }
                        }

                        if (world instanceof ServerLevel _levelxxxxxxxxxxx) {
                           Entity entityToSpawnxxxx = ApocalypsenowModEntities.RUNNER_34
                              .get()
                              .spawn(_levelxxxxxxxxxxx, BlockPos.containing(x + 1.0, y, z), MobSpawnType.MOB_SUMMONED);
                           if (entityToSpawnxxxx != null) {
                              entityToSpawnxxxx.setYRot(world.getRandom().nextFloat() * 360.0F);
                           }
                        }

                        if (world instanceof ServerLevel _levelxxxx) {
                           Entity entityToSpawnxxxxxxxxx = ApocalypsenowModEntities.WALKER_15
                              .get()
                              .spawn(_levelxxxx, BlockPos.containing(x + 2.0, y, z), MobSpawnType.MOB_SUMMONED);
                           if (entityToSpawnxxxxxxxxx != null) {
                              entityToSpawnxxxxxxxxx.setYRot(world.getRandom().nextFloat() * 360.0F);
                           }
                        }

                        if (world instanceof ServerLevel _levelxxxxxxxxxx) {
                           Entity entityToSpawnxxx = ApocalypsenowModEntities.WALKER_26
                              .get()
                              .spawn(_levelxxxxxxxxxx, BlockPos.containing(x + 3.0, y, z), MobSpawnType.MOB_SUMMONED);
                           if (entityToSpawnxxx != null) {
                              entityToSpawnxxx.setYRot(world.getRandom().nextFloat() * 360.0F);
                           }
                        }

                        if (world instanceof ServerLevel _levelxxx) {
                           Entity entityToSpawnxxxxxxxx = ApocalypsenowModEntities.RUNNER_42
                              .get()
                              .spawn(_levelxxx, BlockPos.containing(x + 4.0, y, z), MobSpawnType.MOB_SUMMONED);
                           if (entityToSpawnxxxxxxxx != null) {
                              entityToSpawnxxxxxxxx.setYRot(world.getRandom().nextFloat() * 360.0F);
                           }
                        }

                        if (world instanceof ServerLevel _levelxxxxxxxxx) {
                           Entity entityToSpawnxx = ApocalypsenowModEntities.WALKER_12
                              .get()
                              .spawn(_levelxxxxxxxxx, BlockPos.containing(x - 1.0, y, z), MobSpawnType.MOB_SUMMONED);
                           if (entityToSpawnxx != null) {
                              entityToSpawnxx.setYRot(world.getRandom().nextFloat() * 360.0F);
                           }
                        }

                        if (world instanceof ServerLevel _levelxx) {
                           Entity entityToSpawnxxxxxxx = ApocalypsenowModEntities.RUNNER_45
                              .get()
                              .spawn(_levelxx, BlockPos.containing(x - 2.0, y, z), MobSpawnType.MOB_SUMMONED);
                           if (entityToSpawnxxxxxxx != null) {
                              entityToSpawnxxxxxxx.setYRot(world.getRandom().nextFloat() * 360.0F);
                           }
                        }

                        if (world instanceof ServerLevel _levelxxxxxxxx) {
                           Entity entityToSpawnx = ApocalypsenowModEntities.WALKER_19
                              .get()
                              .spawn(_levelxxxxxxxx, BlockPos.containing(x - 3.0, y, z), MobSpawnType.MOB_SUMMONED);
                           if (entityToSpawnx != null) {
                              entityToSpawnx.setYRot(world.getRandom().nextFloat() * 360.0F);
                           }
                        }

                        if (world instanceof ServerLevel _levelx) {
                           Entity entityToSpawnxxxxxx = ApocalypsenowModEntities.RUNNER_43
                              .get()
                              .spawn(_levelx, BlockPos.containing(x - 4.0, y, z), MobSpawnType.MOB_SUMMONED);
                           if (entityToSpawnxxxxxx != null) {
                              entityToSpawnxxxxxx.setYRot(world.getRandom().nextFloat() * 360.0F);
                           }
                        }
                     }
                  );
               }
            );
         }
      }
   }
}

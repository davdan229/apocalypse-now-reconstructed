package net.mcreator.apocalypsenow.procedures;

import net.mcreator.apocalypsenow.ApocalypsenowMod;
import net.mcreator.apocalypsenow.init.ApocalypsenowModEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.level.LevelAccessor;

public class Horde1OnInitialEntitySpawnProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z) {
      if (Math.random() < 0.2) {
         ApocalypsenowMod.queueServerWork(20, () -> {
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
               Entity entityToSpawn = ApocalypsenowModEntities.RUNNER_34.get().spawn(_level, BlockPos.containing(x + 1.0, y, z), MobSpawnType.MOB_SUMMONED);
               if (entityToSpawn != null) {
                  entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
               }
            }

            if (world instanceof ServerLevel _level) {
               Entity entityToSpawn = ApocalypsenowModEntities.RUNNER_35.get().spawn(_level, BlockPos.containing(x + 2.0, y, z), MobSpawnType.MOB_SUMMONED);
               if (entityToSpawn != null) {
                  entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
               }
            }

            if (world instanceof ServerLevel _level) {
               Entity entityToSpawn = ApocalypsenowModEntities.RUNNER_45.get().spawn(_level, BlockPos.containing(x + 3.0, y, z), MobSpawnType.MOB_SUMMONED);
               if (entityToSpawn != null) {
                  entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
               }
            }

            if (world instanceof ServerLevel _level) {
               Entity entityToSpawn = ApocalypsenowModEntities.RUNNER_50.get().spawn(_level, BlockPos.containing(x + 4.0, y, z), MobSpawnType.MOB_SUMMONED);
               if (entityToSpawn != null) {
                  entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
               }
            }

            if (world instanceof ServerLevel _level) {
               Entity entityToSpawn = ApocalypsenowModEntities.RUNNER_34.get().spawn(_level, BlockPos.containing(x - 1.0, y, z), MobSpawnType.MOB_SUMMONED);
               if (entityToSpawn != null) {
                  entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
               }
            }

            if (world instanceof ServerLevel _level) {
               Entity entityToSpawn = ApocalypsenowModEntities.RUNNER_35.get().spawn(_level, BlockPos.containing(x - 2.0, y, z), MobSpawnType.MOB_SUMMONED);
               if (entityToSpawn != null) {
                  entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
               }
            }

            if (world instanceof ServerLevel _level) {
               Entity entityToSpawn = ApocalypsenowModEntities.RUNNER_45.get().spawn(_level, BlockPos.containing(x - 3.0, y, z), MobSpawnType.MOB_SUMMONED);
               if (entityToSpawn != null) {
                  entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
               }
            }

            if (world instanceof ServerLevel _level) {
               Entity entityToSpawn = ApocalypsenowModEntities.RUNNER_50.get().spawn(_level, BlockPos.containing(x - 4.0, y, z), MobSpawnType.MOB_SUMMONED);
               if (entityToSpawn != null) {
                  entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
               }
            }
         });
      }
   }
}

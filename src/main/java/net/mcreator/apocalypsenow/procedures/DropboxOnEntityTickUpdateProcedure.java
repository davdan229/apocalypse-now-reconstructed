package net.mcreator.apocalypsenow.procedures;

import net.mcreator.apocalypsenow.init.ApocalypsenowModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level.ExplosionInteraction;

public class DropboxOnEntityTickUpdateProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
      if (entity != null) {
         if (entity.onGround()) {
            if (!entity.level().isClientSide()) {
               entity.discard();
            }

            world.setBlock(BlockPos.containing(x, y, z), ApocalypsenowModBlocks.DROPBOXCOMMON.get().defaultBlockState(), 3);
            if (world instanceof Level _level && !_level.isClientSide()) {
               _level.explode(null, x, y, z, 0.0F, ExplosionInteraction.TNT);
            }
         }
      }
   }
}

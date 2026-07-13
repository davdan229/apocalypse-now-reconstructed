package net.mcreator.apocalypsenow.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.level.LevelAccessor;

public class VentturnEntityCollidesInTheBlockProcedure {
   public static void execute(LevelAccessor world, Entity entity) {
      if (entity != null) {
         if (!world.isClientSide()) {
            entity.setPose(Pose.SWIMMING);
         }
      }
   }
}

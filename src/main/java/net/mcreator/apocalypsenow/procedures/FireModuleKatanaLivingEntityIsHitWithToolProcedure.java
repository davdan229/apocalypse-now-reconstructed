package net.mcreator.apocalypsenow.procedures;

import net.minecraft.world.entity.Entity;

public class FireModuleKatanaLivingEntityIsHitWithToolProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         entity.setSecondsOnFire(15);
      }
   }
}

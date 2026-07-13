package net.mcreator.apocalypsenow.procedures;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

public class MilitaryMedicOnEntityTickUpdateProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z) {
      if (!(world instanceof ServerLevel level)) {
         return;
      }
      Vec3 center = new Vec3(x, y, z);
      for (Player player : level.getEntitiesOfClass(Player.class, new AABB(center, center).inflate(2.0), Player::isAlive)) {
         player.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 40, 1, false, false));
      }
   }
}

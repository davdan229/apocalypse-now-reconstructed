package net.mcreator.apocalypsenow.procedures;

import java.util.List;
import net.mcreator.apocalypsenow.init.ApocalypsenowModParticleTypes;
import net.mcreator.apocalypsenow.init.ApocalypsenowModSounds;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

public class ChainsawRightClickedInAirProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack chainsaw) {
      if (!(world instanceof ServerLevel level) || !(entity instanceof LivingEntity attacker)) {
         return;
      }

      Vec3 center = attacker.position().add(0.0, attacker.getBbHeight() * 0.5, 0.0).add(attacker.getLookAngle().scale(1.25));
      List<LivingEntity> targets = level.getEntitiesOfClass(
         LivingEntity.class,
         new AABB(center, center).inflate(1.5),
         target -> target != attacker && target.isAlive() && !target.isSpectator()
      );
      boolean hit = false;
      for (LivingEntity target : targets) {
         if (attacker instanceof Player player) {
            hit |= target.hurt(level.damageSources().playerAttack(player), 11.0F);
         } else {
            hit |= target.hurt(level.damageSources().mobAttack(attacker), 11.0F);
         }
      }

      if (hit) {
         chainsaw.hurtAndBreak(1, attacker, owner -> owner.broadcastBreakEvent(EquipmentSlot.MAINHAND));
      }
      if (attacker instanceof Player player) {
         player.getCooldowns().addCooldown(chainsaw.getItem(), 10);
      }
      level.playSound(null, attacker.blockPosition(), ApocalypsenowModSounds.CHAINSAW_NEW.get(), SoundSource.PLAYERS, 0.5F, 1.0F);
      level.sendParticles(ApocalypsenowModParticleTypes.SMOKE_1.get(), center.x, center.y, center.z, 2, 0.1, 0.1, 0.1, 0.02);
   }
}

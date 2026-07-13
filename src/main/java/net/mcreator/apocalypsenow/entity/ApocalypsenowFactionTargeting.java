package net.mcreator.apocalypsenow.entity;

import java.util.Locale;
import java.util.function.Predicate;
import net.mcreator.apocalypsenow.ApocalypsenowMod;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.animal.IronGolem;
import net.minecraft.world.entity.monster.Enemy;
import net.minecraft.world.entity.npc.AbstractVillager;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.registries.ForgeRegistries;

/** One target search per faction replaces thousands of per-variant MCreator goals. */
public final class ApocalypsenowFactionTargeting {
   private ApocalypsenowFactionTargeting() {
   }

   public static NearestAttackableTargetGoal<LivingEntity> goal(Mob attacker) {
      Predicate<LivingEntity> predicate = target -> shouldTarget(attacker, target);
      return new NearestAttackableTargetGoal<>(attacker, LivingEntity.class, 10, false, false, predicate);
   }

   public static boolean shouldTarget(Mob attacker, LivingEntity target) {
      if (attacker == target || !target.isAlive()) {
         return false;
      }
      if (target instanceof Player player && (player.isCreative() || player.isSpectator())) {
         return false;
      }

      Faction attackerFaction = faction(attacker);
      Faction targetFaction = faction(target);
      return switch (attackerFaction) {
         case INFECTED -> target instanceof Player
            || target instanceof AbstractVillager
            || target instanceof IronGolem
            || targetFaction == Faction.HUMAN
            || targetFaction == Faction.RAIDER;
         case HUMAN -> targetFaction == Faction.INFECTED
            || targetFaction == Faction.RAIDER
            || targetFaction == Faction.NONE && target instanceof Enemy;
         case RAIDER -> target instanceof Player
            || targetFaction == Faction.INFECTED
            || targetFaction == Faction.HUMAN
            || targetFaction == Faction.NONE && target instanceof Enemy;
         case NONE -> false;
      };
   }

   private static Faction faction(LivingEntity entity) {
      var key = ForgeRegistries.ENTITY_TYPES.getKey(entity.getType());
      if (key == null || !ApocalypsenowMod.MODID.equals(key.getNamespace())) {
         return Faction.NONE;
      }
      String id = key.getPath().toLowerCase(Locale.ROOT);
      if (startsWithAny(id, "walker", "runner", "crawler", "horde")) {
         return Faction.INFECTED;
      }
      if (startsWithAny(id, "survivor", "military_01", "military_02", "military_medic", "soldiers")) {
         return Faction.HUMAN;
      }
      if (startsWithAny(id, "looter", "cannibal", "hunter")) {
         return Faction.RAIDER;
      }
      return Faction.NONE;
   }

   private static boolean startsWithAny(String value, String... prefixes) {
      for (String prefix : prefixes) {
         if (value.startsWith(prefix)) {
            return true;
         }
      }
      return false;
   }

   private enum Faction {
      INFECTED,
      HUMAN,
      RAIDER,
      NONE
   }
}

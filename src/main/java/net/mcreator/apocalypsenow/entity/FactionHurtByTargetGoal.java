package net.mcreator.apocalypsenow.entity;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;

/** Retaliates only against entities that are enemies of the owner's faction. */
public class FactionHurtByTargetGoal extends HurtByTargetGoal {
   public FactionHurtByTargetGoal(PathfinderMob mob, Class<?>... ignoredDamageClasses) {
      super(mob, ignoredDamageClasses);
   }

   @Override
   public boolean canUse() {
      LivingEntity attacker = this.mob.getLastHurtByMob();
      return attacker != null && ApocalypsenowFactionTargeting.shouldTarget(this.mob, attacker) && super.canUse();
   }

   @Override
   public boolean canContinueToUse() {
      LivingEntity target = this.mob.getTarget();
      return target != null && ApocalypsenowFactionTargeting.shouldTarget(this.mob, target) && super.canContinueToUse();
   }
}

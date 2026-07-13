package net.mcreator.apocalypsenow.procedures;

import net.mcreator.apocalypsenow.init.ApocalypsenowModMobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;

public class CnvDisplayOverlayIngameProcedure {
   public static boolean execute(Entity entity) {
      return entity == null ? false : entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(ApocalypsenowModMobEffects.REDNIGHTVISIONEFFECT.get());
   }
}

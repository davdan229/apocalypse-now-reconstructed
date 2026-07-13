package net.mcreator.apocalypsenow.procedures;

import net.mcreator.apocalypsenow.init.ApocalypsenowModMobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;

public class NveDisplayOverlayIngameProcedure {
   public static boolean execute(Entity entity) {
      if (entity == null) {
         return false;
      } else if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(ApocalypsenowModMobEffects.NIGHTVISIONEFFECTT.get())) {
         return true;
      } else {
         return entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(ApocalypsenowModMobEffects.GPNVEFFECT.get())
            ? true
            : entity instanceof LivingEntity _livEnt2 && _livEnt2.hasEffect(ApocalypsenowModMobEffects.NVGEFFECT.get());
      }
   }
}

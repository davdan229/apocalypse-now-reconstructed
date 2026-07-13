package net.mcreator.apocalypsenow.procedures;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;

public class SeverebleedingeffectProcedure {
   public static void execute(LevelAccessor world, Entity entity) {
      if (entity != null && !entity.level().isClientSide()) {
         entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)), 2.0F);
      }
   }
}

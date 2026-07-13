package net.mcreator.apocalypsenow.procedures;

import net.mcreator.apocalypsenow.init.ApocalypsenowModMobEffects;
import net.mcreator.apocalypsenow.init.ApocalypsenowModParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.LevelAccessor;

public class HighqualitycigarretsProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
      if (!(world instanceof ServerLevel level) || !(entity instanceof Player player) || itemstack.isEmpty()) return;
      itemstack.shrink(1);
      level.sendParticles(ApocalypsenowModParticleTypes.SMOKE_1.get(), x + 0.2, y, z + 0.1, 4, -0.2, 0.5, 0.2, 0.2);
      player.removeEffect(ApocalypsenowModMobEffects.PAIN.get());
      player.addEffect(new MobEffectInstance(ApocalypsenowModMobEffects.PAINKILLERSEFFECT.get(), 300, 1, false, false));
      player.heal(2.0F);
   }
}

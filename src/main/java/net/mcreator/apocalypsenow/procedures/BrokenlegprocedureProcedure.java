package net.mcreator.apocalypsenow.procedures;

import javax.annotation.Nullable;
import net.mcreator.apocalypsenow.configuration.ApocalypsenowconfigurationConfiguration;
import net.mcreator.apocalypsenow.init.ApocalypsenowModMobEffects;
import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class BrokenlegprocedureProcedure {
   @SubscribeEvent
   public static void onEntityFall(LivingFallEvent event) {
      if (event != null && event.getEntity() != null) {
         execute(
            event,
            event.getEntity().level(),
            event.getEntity().getX(),
            event.getEntity().getY(),
            event.getEntity().getZ(),
            event.getEntity(),
            event.getDistance()
         );
      }
   }

   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, double distance) {
      execute(null, world, x, y, z, entity, distance);
   }

   private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, double distance) {
      if (entity != null) {
         if (world.getBlockState(BlockPos.containing(x, y - 1.0, z)).getBlock() != Blocks.SLIME_BLOCK
            && ApocalypsenowconfigurationConfiguration.BROKEN_LEG.get()
            && entity instanceof Player
            && distance > 9.0
            && FalldamageProcedure.execute(world, entity)
            && entity instanceof LivingEntity _entity
            && !_entity.level().isClientSide()) {
            _entity.addEffect(new MobEffectInstance(ApocalypsenowModMobEffects.BROKENLEG.get(), 99999, 0, false, false));
         }
      }
   }
}

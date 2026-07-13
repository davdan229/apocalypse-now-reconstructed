package net.mcreator.apocalypsenow.procedures;

import javax.annotation.Nullable;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class FalldamageProcedure {
   @SubscribeEvent
   public static void onEntityAttacked(LivingAttackEvent event) {
      if (event != null && event.getEntity() != null) {
         execute(event, event.getEntity().level(), event.getEntity());
      }
   }

   public static boolean execute(LevelAccessor world, Entity entity) {
      return execute(null, world, entity);
   }

   private static boolean execute(@Nullable Event event, LevelAccessor world, Entity entity) {
      return entity == null
         ? false
         : new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.FALL)).is(DamageTypes.FALL)
            && (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1.0F) < 8.0F;
   }
}

package net.mcreator.apocalypsenow.procedures;

import javax.annotation.Nullable;
import net.mcreator.apocalypsenow.configuration.ApocalypsenowconfigurationConfiguration;
import net.mcreator.apocalypsenow.init.ApocalypsenowModItems;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class HumandiesProcedure {
   @SubscribeEvent
   public static void onEntityDeath(LivingDeathEvent event) {
      if (event != null && event.getEntity() != null) {
         execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
      }
   }

   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
      execute(null, world, x, y, z, entity);
   }

   private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
      if (entity != null) {
         if (entity instanceof Player && ApocalypsenowconfigurationConfiguration.HUMAN_FLESH_DROP.get()) {
            if (Math.random() < 0.5 && world instanceof ServerLevel _level) {
               ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ApocalypsenowModItems.HUMAN_FLESH.get()));
               entityToSpawn.setPickUpDelay(10);
               _level.addFreshEntity(entityToSpawn);
            }

            if (Math.random() < 0.2) {
               if (world instanceof ServerLevel _level) {
                  ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ApocalypsenowModItems.HUMAN_FLESH.get()));
                  entityToSpawn.setPickUpDelay(10);
                  _level.addFreshEntity(entityToSpawn);
               }

               if (world instanceof ServerLevel _level) {
                  ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ApocalypsenowModItems.HUMAN_FLESH.get()));
                  entityToSpawn.setPickUpDelay(10);
                  _level.addFreshEntity(entityToSpawn);
               }
            }
         }
      }
   }
}

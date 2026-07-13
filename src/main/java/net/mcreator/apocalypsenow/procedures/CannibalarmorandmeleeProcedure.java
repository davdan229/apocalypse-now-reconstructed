package net.mcreator.apocalypsenow.procedures;

import javax.annotation.Nullable;
import net.mcreator.apocalypsenow.entity.CannibalEntity;
import net.mcreator.apocalypsenow.init.ApocalypsenowModItems;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class CannibalarmorandmeleeProcedure {
   @SubscribeEvent
   public static void onEntitySpawned(EntityJoinLevelEvent event) {
      execute(event, event.getEntity());
   }

   public static void execute(Entity entity) {
      execute(null, entity);
   }

   private static void execute(@Nullable Event event, Entity entity) {
      if (entity != null) {
         if (entity instanceof CannibalEntity && Math.random() < 0.1) {
            if (entity instanceof LivingEntity _entity) {
               ItemStack _setstack = new ItemStack(ApocalypsenowModItems.SERRATED_MACHETE.get()).copy();
               _setstack.setCount(1);
               _entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
               if (_entity instanceof Player _player) {
                  _player.getInventory().setChanged();
               }
            }

            Entity _entity = entity;
            if (_entity instanceof Player _player) {
               _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.JASONMASK_HELMET.get()));
               _player.getInventory().setChanged();
            } else if (_entity instanceof LivingEntity _living) {
               _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.JASONMASK_HELMET.get()));
            }
         }

         if (entity instanceof CannibalEntity && Math.random() < 0.1) {
            if (entity instanceof LivingEntity _entity) {
               ItemStack _setstack = new ItemStack(ApocalypsenowModItems.HEAVY_MACHETE.get()).copy();
               _setstack.setCount(1);
               _entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
               if (_entity instanceof Player _player) {
                  _player.getInventory().setChanged();
               }
            }

            Entity _entity = entity;
            if (_entity instanceof Player _player) {
               _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.BLACKHOCKEYMASK_HELMET.get()));
               _player.getInventory().setChanged();
            } else if (_entity instanceof LivingEntity _living) {
               _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.BLACKHOCKEYMASK_HELMET.get()));
            }
         }

         if (entity instanceof CannibalEntity && Math.random() < 0.1) {
            if (entity instanceof LivingEntity _entity) {
               ItemStack _setstack = new ItemStack(ApocalypsenowModItems.SCYTHE_KNIFE.get()).copy();
               _setstack.setCount(1);
               _entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
               if (_entity instanceof Player _player) {
                  _player.getInventory().setChanged();
               }
            }

            Entity _entity = entity;
            if (_entity instanceof Player _player) {
               _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.ROU_RESPIRATOR_HELMET.get()));
               _player.getInventory().setChanged();
            } else if (_entity instanceof LivingEntity _living) {
               _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.ROU_RESPIRATOR_HELMET.get()));
            }
         }

         if (entity instanceof CannibalEntity && Math.random() < 0.1) {
            if (entity instanceof LivingEntity _entity) {
               ItemStack _setstack = new ItemStack(ApocalypsenowModItems.CLEAVER.get()).copy();
               _setstack.setCount(1);
               _entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
               if (_entity instanceof Player _player) {
                  _player.getInventory().setChanged();
               }
            }

            Entity _entity = entity;
            if (_entity instanceof Player _player) {
               _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.BLACKHOCKEYMASK_HELMET.get()));
               _player.getInventory().setChanged();
            } else if (_entity instanceof LivingEntity _living) {
               _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.BLACKHOCKEYMASK_HELMET.get()));
            }
         }
      }
   }
}

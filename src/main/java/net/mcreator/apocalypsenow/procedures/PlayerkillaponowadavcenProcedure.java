package net.mcreator.apocalypsenow.procedures;

import javax.annotation.Nullable;
import net.mcreator.apocalypsenow.entity.CannibalEntity;
import net.mcreator.apocalypsenow.entity.Crawler1Entity;
import net.mcreator.apocalypsenow.entity.Crawler2Entity;
import net.mcreator.apocalypsenow.entity.Crawler3Entity;
import net.mcreator.apocalypsenow.entity.Crawler4Entity;
import net.mcreator.apocalypsenow.entity.Horde1Entity;
import net.mcreator.apocalypsenow.entity.Horde2Entity;
import net.mcreator.apocalypsenow.entity.Horde3Entity;
import net.mcreator.apocalypsenow.entity.Horde4Entity;
import net.mcreator.apocalypsenow.entity.Horde5Entity;
import net.mcreator.apocalypsenow.entity.Looter1Entity;
import net.mcreator.apocalypsenow.entity.Looter2Entity;
import net.mcreator.apocalypsenow.entity.Looter3Entity;
import net.mcreator.apocalypsenow.entity.Looter4Entity;
import net.mcreator.apocalypsenow.entity.Looter5Entity;
import net.mcreator.apocalypsenow.entity.Runner34Entity;
import net.mcreator.apocalypsenow.entity.Runner35Entity;
import net.mcreator.apocalypsenow.entity.Runner36Entity;
import net.mcreator.apocalypsenow.entity.Runner37Entity;
import net.mcreator.apocalypsenow.entity.Runner38Entity;
import net.mcreator.apocalypsenow.entity.Runner39Entity;
import net.mcreator.apocalypsenow.entity.Runner40Entity;
import net.mcreator.apocalypsenow.entity.Runner41Entity;
import net.mcreator.apocalypsenow.entity.Runner42Entity;
import net.mcreator.apocalypsenow.entity.Runner43Entity;
import net.mcreator.apocalypsenow.entity.Runner44Entity;
import net.mcreator.apocalypsenow.entity.Runner45Entity;
import net.mcreator.apocalypsenow.entity.Runner46Entity;
import net.mcreator.apocalypsenow.entity.Runner47Entity;
import net.mcreator.apocalypsenow.entity.Runner48Entity;
import net.mcreator.apocalypsenow.entity.Runner49Entity;
import net.mcreator.apocalypsenow.entity.Runner50Entity;
import net.mcreator.apocalypsenow.entity.Runner51Entity;
import net.mcreator.apocalypsenow.entity.Runner52Entity;
import net.mcreator.apocalypsenow.entity.Runner53Entity;
import net.mcreator.apocalypsenow.entity.Runner54Entity;
import net.mcreator.apocalypsenow.entity.Runner55Entity;
import net.mcreator.apocalypsenow.entity.Runner56Entity;
import net.mcreator.apocalypsenow.entity.Runner57Entity;
import net.mcreator.apocalypsenow.entity.Soldiers02Entity;
import net.mcreator.apocalypsenow.entity.SoldiersEntity;
import net.mcreator.apocalypsenow.entity.Walker10Entity;
import net.mcreator.apocalypsenow.entity.Walker11Entity;
import net.mcreator.apocalypsenow.entity.Walker12Entity;
import net.mcreator.apocalypsenow.entity.Walker13Entity;
import net.mcreator.apocalypsenow.entity.Walker14Entity;
import net.mcreator.apocalypsenow.entity.Walker15Entity;
import net.mcreator.apocalypsenow.entity.Walker16Entity;
import net.mcreator.apocalypsenow.entity.Walker17Entity;
import net.mcreator.apocalypsenow.entity.Walker18Entity;
import net.mcreator.apocalypsenow.entity.Walker19Entity;
import net.mcreator.apocalypsenow.entity.Walker1Entity;
import net.mcreator.apocalypsenow.entity.Walker20Entity;
import net.mcreator.apocalypsenow.entity.Walker21Entity;
import net.mcreator.apocalypsenow.entity.Walker22Entity;
import net.mcreator.apocalypsenow.entity.Walker23Entity;
import net.mcreator.apocalypsenow.entity.Walker24Entity;
import net.mcreator.apocalypsenow.entity.Walker25Entity;
import net.mcreator.apocalypsenow.entity.Walker26Entity;
import net.mcreator.apocalypsenow.entity.Walker27Entity;
import net.mcreator.apocalypsenow.entity.Walker28Entity;
import net.mcreator.apocalypsenow.entity.Walker29Entity;
import net.mcreator.apocalypsenow.entity.Walker2Entity;
import net.mcreator.apocalypsenow.entity.Walker30Entity;
import net.mcreator.apocalypsenow.entity.Walker31Entity;
import net.mcreator.apocalypsenow.entity.Walker32Entity;
import net.mcreator.apocalypsenow.entity.Walker33Entity;
import net.mcreator.apocalypsenow.entity.Walker3Entity;
import net.mcreator.apocalypsenow.entity.Walker4Entity;
import net.mcreator.apocalypsenow.entity.Walker5Entity;
import net.mcreator.apocalypsenow.entity.Walker6Entity;
import net.mcreator.apocalypsenow.entity.Walker7Entity;
import net.mcreator.apocalypsenow.entity.Walker8Entity;
import net.mcreator.apocalypsenow.entity.Walker9Entity;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class PlayerkillaponowadavcenProcedure {
   @SubscribeEvent
   public static void onEntityDeath(LivingDeathEvent event) {
      if (event != null && event.getEntity() != null) {
         execute(event, event.getEntity(), event.getSource().getEntity());
      }
   }

   public static void execute(Entity entity, Entity sourceentity) {
      execute(null, entity, sourceentity);
   }

   private static void execute(@Nullable Event event, Entity entity, Entity sourceentity) {
      if (entity != null && sourceentity != null) {
         if (sourceentity instanceof Player) {
            if (entity instanceof Crawler1Entity && sourceentity instanceof ServerPlayer _player) {
               Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/kill_a_mob"));
               AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
               if (!_ap.isDone()) {
                  for (String criteria : _ap.getRemainingCriteria()) {
                     _player.getAdvancements().award(_adv, criteria);
                  }
               }
            }

            if (entity instanceof Crawler2Entity && sourceentity instanceof ServerPlayer _player) {
               Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/kill_a_mob"));
               AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
               if (!_ap.isDone()) {
                  for (String criteria : _ap.getRemainingCriteria()) {
                     _player.getAdvancements().award(_adv, criteria);
                  }
               }
            }

            if (entity instanceof CannibalEntity && sourceentity instanceof ServerPlayer _player) {
               Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/kill_a_mob"));
               AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
               if (!_ap.isDone()) {
                  for (String criteria : _ap.getRemainingCriteria()) {
                     _player.getAdvancements().award(_adv, criteria);
                  }
               }
            }

            if (entity instanceof Crawler3Entity && sourceentity instanceof ServerPlayer _player) {
               Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/kill_a_mob"));
               AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
               if (!_ap.isDone()) {
                  for (String criteria : _ap.getRemainingCriteria()) {
                     _player.getAdvancements().award(_adv, criteria);
                  }
               }
            }

            if (entity instanceof Crawler4Entity && sourceentity instanceof ServerPlayer _player) {
               Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/kill_a_mob"));
               AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
               if (!_ap.isDone()) {
                  for (String criteria : _ap.getRemainingCriteria()) {
                     _player.getAdvancements().award(_adv, criteria);
                  }
               }
            }

            if (entity instanceof Horde1Entity && sourceentity instanceof ServerPlayer _player) {
               Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/kill_a_mob"));
               AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
               if (!_ap.isDone()) {
                  for (String criteria : _ap.getRemainingCriteria()) {
                     _player.getAdvancements().award(_adv, criteria);
                  }
               }
            }

            if (entity instanceof Horde2Entity && sourceentity instanceof ServerPlayer _player) {
               Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/kill_a_mob"));
               AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
               if (!_ap.isDone()) {
                  for (String criteria : _ap.getRemainingCriteria()) {
                     _player.getAdvancements().award(_adv, criteria);
                  }
               }
            }

            if (entity instanceof Horde3Entity && sourceentity instanceof ServerPlayer _player) {
               Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/kill_a_mob"));
               AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
               if (!_ap.isDone()) {
                  for (String criteria : _ap.getRemainingCriteria()) {
                     _player.getAdvancements().award(_adv, criteria);
                  }
               }
            }

            if (entity instanceof Horde4Entity && sourceentity instanceof ServerPlayer _player) {
               Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/kill_a_mob"));
               AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
               if (!_ap.isDone()) {
                  for (String criteria : _ap.getRemainingCriteria()) {
                     _player.getAdvancements().award(_adv, criteria);
                  }
               }
            }

            if (entity instanceof Horde5Entity && sourceentity instanceof ServerPlayer _player) {
               Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/kill_a_mob"));
               AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
               if (!_ap.isDone()) {
                  for (String criteria : _ap.getRemainingCriteria()) {
                     _player.getAdvancements().award(_adv, criteria);
                  }
               }
            }

            if (entity instanceof Horde5Entity && sourceentity instanceof ServerPlayer _player) {
               Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/kill_a_mob"));
               AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
               if (!_ap.isDone()) {
                  for (String criteria : _ap.getRemainingCriteria()) {
                     _player.getAdvancements().award(_adv, criteria);
                  }
               }
            }

            if (entity instanceof Looter1Entity && sourceentity instanceof ServerPlayer _player) {
               Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/kill_a_mob"));
               AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
               if (!_ap.isDone()) {
                  for (String criteria : _ap.getRemainingCriteria()) {
                     _player.getAdvancements().award(_adv, criteria);
                  }
               }
            }

            if (entity instanceof Looter2Entity && sourceentity instanceof ServerPlayer _player) {
               Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/kill_a_mob"));
               AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
               if (!_ap.isDone()) {
                  for (String criteria : _ap.getRemainingCriteria()) {
                     _player.getAdvancements().award(_adv, criteria);
                  }
               }
            }

            if (entity instanceof Looter3Entity && sourceentity instanceof ServerPlayer _player) {
               Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/kill_a_mob"));
               AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
               if (!_ap.isDone()) {
                  for (String criteria : _ap.getRemainingCriteria()) {
                     _player.getAdvancements().award(_adv, criteria);
                  }
               }
            }

            if (entity instanceof Looter4Entity && sourceentity instanceof ServerPlayer _player) {
               Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/kill_a_mob"));
               AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
               if (!_ap.isDone()) {
                  for (String criteria : _ap.getRemainingCriteria()) {
                     _player.getAdvancements().award(_adv, criteria);
                  }
               }
            }

            if (entity instanceof Looter5Entity && sourceentity instanceof ServerPlayer _player) {
               Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/kill_a_mob"));
               AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
               if (!_ap.isDone()) {
                  for (String criteria : _ap.getRemainingCriteria()) {
                     _player.getAdvancements().award(_adv, criteria);
                  }
               }
            }

            if (entity instanceof SoldiersEntity && sourceentity instanceof ServerPlayer _player) {
               Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/kill_a_mob"));
               AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
               if (!_ap.isDone()) {
                  for (String criteria : _ap.getRemainingCriteria()) {
                     _player.getAdvancements().award(_adv, criteria);
                  }
               }
            }

            if (entity instanceof Walker1Entity && sourceentity instanceof ServerPlayer _player) {
               Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/kill_a_mob"));
               AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
               if (!_ap.isDone()) {
                  for (String criteria : _ap.getRemainingCriteria()) {
                     _player.getAdvancements().award(_adv, criteria);
                  }
               }
            }

            if (entity instanceof Walker2Entity && sourceentity instanceof ServerPlayer _player) {
               Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/kill_a_mob"));
               AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
               if (!_ap.isDone()) {
                  for (String criteria : _ap.getRemainingCriteria()) {
                     _player.getAdvancements().award(_adv, criteria);
                  }
               }
            }

            if (entity instanceof Walker3Entity && sourceentity instanceof ServerPlayer _player) {
               Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/kill_a_mob"));
               AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
               if (!_ap.isDone()) {
                  for (String criteria : _ap.getRemainingCriteria()) {
                     _player.getAdvancements().award(_adv, criteria);
                  }
               }
            }

            if (entity instanceof Walker4Entity && sourceentity instanceof ServerPlayer _player) {
               Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/kill_a_mob"));
               AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
               if (!_ap.isDone()) {
                  for (String criteria : _ap.getRemainingCriteria()) {
                     _player.getAdvancements().award(_adv, criteria);
                  }
               }
            }

            if (entity instanceof Walker5Entity && sourceentity instanceof ServerPlayer _player) {
               Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/kill_a_mob"));
               AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
               if (!_ap.isDone()) {
                  for (String criteria : _ap.getRemainingCriteria()) {
                     _player.getAdvancements().award(_adv, criteria);
                  }
               }
            }

            if (entity instanceof Walker6Entity && sourceentity instanceof ServerPlayer _player) {
               Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/kill_a_mob"));
               AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
               if (!_ap.isDone()) {
                  for (String criteria : _ap.getRemainingCriteria()) {
                     _player.getAdvancements().award(_adv, criteria);
                  }
               }
            }

            if (entity instanceof Walker7Entity && sourceentity instanceof ServerPlayer _player) {
               Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/kill_a_mob"));
               AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
               if (!_ap.isDone()) {
                  for (String criteria : _ap.getRemainingCriteria()) {
                     _player.getAdvancements().award(_adv, criteria);
                  }
               }
            }

            if (entity instanceof Walker8Entity && sourceentity instanceof ServerPlayer _player) {
               Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/kill_a_mob"));
               AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
               if (!_ap.isDone()) {
                  for (String criteria : _ap.getRemainingCriteria()) {
                     _player.getAdvancements().award(_adv, criteria);
                  }
               }
            }

            if (entity instanceof Walker9Entity && sourceentity instanceof ServerPlayer _player) {
               Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/kill_a_mob"));
               AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
               if (!_ap.isDone()) {
                  for (String criteria : _ap.getRemainingCriteria()) {
                     _player.getAdvancements().award(_adv, criteria);
                  }
               }
            }

            if (entity instanceof Walker10Entity && sourceentity instanceof ServerPlayer _player) {
               Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/kill_a_mob"));
               AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
               if (!_ap.isDone()) {
                  for (String criteria : _ap.getRemainingCriteria()) {
                     _player.getAdvancements().award(_adv, criteria);
                  }
               }
            }

            if (entity instanceof Walker11Entity && sourceentity instanceof ServerPlayer _player) {
               Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/kill_a_mob"));
               AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
               if (!_ap.isDone()) {
                  for (String criteria : _ap.getRemainingCriteria()) {
                     _player.getAdvancements().award(_adv, criteria);
                  }
               }
            }

            if (entity instanceof Walker12Entity && sourceentity instanceof ServerPlayer _player) {
               Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/kill_a_mob"));
               AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
               if (!_ap.isDone()) {
                  for (String criteria : _ap.getRemainingCriteria()) {
                     _player.getAdvancements().award(_adv, criteria);
                  }
               }
            }

            if (entity instanceof Walker13Entity && sourceentity instanceof ServerPlayer _player) {
               Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/kill_a_mob"));
               AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
               if (!_ap.isDone()) {
                  for (String criteria : _ap.getRemainingCriteria()) {
                     _player.getAdvancements().award(_adv, criteria);
                  }
               }
            }

            if (entity instanceof Walker14Entity && sourceentity instanceof ServerPlayer _player) {
               Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/kill_a_mob"));
               AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
               if (!_ap.isDone()) {
                  for (String criteria : _ap.getRemainingCriteria()) {
                     _player.getAdvancements().award(_adv, criteria);
                  }
               }
            }

            if (entity instanceof Walker15Entity && sourceentity instanceof ServerPlayer _player) {
               Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/kill_a_mob"));
               AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
               if (!_ap.isDone()) {
                  for (String criteria : _ap.getRemainingCriteria()) {
                     _player.getAdvancements().award(_adv, criteria);
                  }
               }
            }

            if (entity instanceof Walker16Entity && sourceentity instanceof ServerPlayer _player) {
               Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/kill_a_mob"));
               AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
               if (!_ap.isDone()) {
                  for (String criteria : _ap.getRemainingCriteria()) {
                     _player.getAdvancements().award(_adv, criteria);
                  }
               }
            }

            if (entity instanceof Walker17Entity && sourceentity instanceof ServerPlayer _player) {
               Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/kill_a_mob"));
               AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
               if (!_ap.isDone()) {
                  for (String criteria : _ap.getRemainingCriteria()) {
                     _player.getAdvancements().award(_adv, criteria);
                  }
               }
            }

            if (entity instanceof Walker18Entity && sourceentity instanceof ServerPlayer _player) {
               Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/kill_a_mob"));
               AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
               if (!_ap.isDone()) {
                  for (String criteria : _ap.getRemainingCriteria()) {
                     _player.getAdvancements().award(_adv, criteria);
                  }
               }
            }

            if (entity instanceof Walker19Entity && sourceentity instanceof ServerPlayer _player) {
               Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/kill_a_mob"));
               AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
               if (!_ap.isDone()) {
                  for (String criteria : _ap.getRemainingCriteria()) {
                     _player.getAdvancements().award(_adv, criteria);
                  }
               }
            }

            if (entity instanceof Walker20Entity && sourceentity instanceof ServerPlayer _player) {
               Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/kill_a_mob"));
               AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
               if (!_ap.isDone()) {
                  for (String criteria : _ap.getRemainingCriteria()) {
                     _player.getAdvancements().award(_adv, criteria);
                  }
               }
            }

            if (entity instanceof Walker21Entity && sourceentity instanceof ServerPlayer _player) {
               Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/kill_a_mob"));
               AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
               if (!_ap.isDone()) {
                  for (String criteria : _ap.getRemainingCriteria()) {
                     _player.getAdvancements().award(_adv, criteria);
                  }
               }
            }

            if (entity instanceof Walker22Entity && sourceentity instanceof ServerPlayer _player) {
               Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/kill_a_mob"));
               AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
               if (!_ap.isDone()) {
                  for (String criteria : _ap.getRemainingCriteria()) {
                     _player.getAdvancements().award(_adv, criteria);
                  }
               }
            }

            if (entity instanceof Walker23Entity && sourceentity instanceof ServerPlayer _player) {
               Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/kill_a_mob"));
               AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
               if (!_ap.isDone()) {
                  for (String criteria : _ap.getRemainingCriteria()) {
                     _player.getAdvancements().award(_adv, criteria);
                  }
               }
            }

            if (entity instanceof Walker24Entity && sourceentity instanceof ServerPlayer _player) {
               Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/kill_a_mob"));
               AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
               if (!_ap.isDone()) {
                  for (String criteria : _ap.getRemainingCriteria()) {
                     _player.getAdvancements().award(_adv, criteria);
                  }
               }
            }

            if (entity instanceof Walker25Entity && sourceentity instanceof ServerPlayer _player) {
               Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/kill_a_mob"));
               AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
               if (!_ap.isDone()) {
                  for (String criteria : _ap.getRemainingCriteria()) {
                     _player.getAdvancements().award(_adv, criteria);
                  }
               }
            }

            if (entity instanceof Walker26Entity && sourceentity instanceof ServerPlayer _player) {
               Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/kill_a_mob"));
               AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
               if (!_ap.isDone()) {
                  for (String criteria : _ap.getRemainingCriteria()) {
                     _player.getAdvancements().award(_adv, criteria);
                  }
               }
            }

            if (entity instanceof Walker27Entity && sourceentity instanceof ServerPlayer _player) {
               Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/kill_a_mob"));
               AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
               if (!_ap.isDone()) {
                  for (String criteria : _ap.getRemainingCriteria()) {
                     _player.getAdvancements().award(_adv, criteria);
                  }
               }
            }

            if (entity instanceof Walker28Entity && sourceentity instanceof ServerPlayer _player) {
               Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/kill_a_mob"));
               AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
               if (!_ap.isDone()) {
                  for (String criteria : _ap.getRemainingCriteria()) {
                     _player.getAdvancements().award(_adv, criteria);
                  }
               }
            }

            if (entity instanceof Walker29Entity && sourceentity instanceof ServerPlayer _player) {
               Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/kill_a_mob"));
               AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
               if (!_ap.isDone()) {
                  for (String criteria : _ap.getRemainingCriteria()) {
                     _player.getAdvancements().award(_adv, criteria);
                  }
               }
            }

            if (entity instanceof Walker30Entity && sourceentity instanceof ServerPlayer _player) {
               Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/kill_a_mob"));
               AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
               if (!_ap.isDone()) {
                  for (String criteria : _ap.getRemainingCriteria()) {
                     _player.getAdvancements().award(_adv, criteria);
                  }
               }
            }

            if (entity instanceof Walker31Entity && sourceentity instanceof ServerPlayer _player) {
               Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/kill_a_mob"));
               AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
               if (!_ap.isDone()) {
                  for (String criteria : _ap.getRemainingCriteria()) {
                     _player.getAdvancements().award(_adv, criteria);
                  }
               }
            }

            if (entity instanceof Walker32Entity && sourceentity instanceof ServerPlayer _player) {
               Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/kill_a_mob"));
               AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
               if (!_ap.isDone()) {
                  for (String criteria : _ap.getRemainingCriteria()) {
                     _player.getAdvancements().award(_adv, criteria);
                  }
               }
            }

            if (entity instanceof Walker33Entity && sourceentity instanceof ServerPlayer _player) {
               Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/kill_a_mob"));
               AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
               if (!_ap.isDone()) {
                  for (String criteria : _ap.getRemainingCriteria()) {
                     _player.getAdvancements().award(_adv, criteria);
                  }
               }
            }

            if (entity instanceof Runner34Entity && sourceentity instanceof ServerPlayer _player) {
               Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/kill_a_mob"));
               AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
               if (!_ap.isDone()) {
                  for (String criteria : _ap.getRemainingCriteria()) {
                     _player.getAdvancements().award(_adv, criteria);
                  }
               }
            }

            if (entity instanceof Runner35Entity && sourceentity instanceof ServerPlayer _player) {
               Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/kill_a_mob"));
               AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
               if (!_ap.isDone()) {
                  for (String criteria : _ap.getRemainingCriteria()) {
                     _player.getAdvancements().award(_adv, criteria);
                  }
               }
            }

            if (entity instanceof Runner36Entity && sourceentity instanceof ServerPlayer _player) {
               Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/kill_a_mob"));
               AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
               if (!_ap.isDone()) {
                  for (String criteria : _ap.getRemainingCriteria()) {
                     _player.getAdvancements().award(_adv, criteria);
                  }
               }
            }

            if (entity instanceof Runner37Entity && sourceentity instanceof ServerPlayer _player) {
               Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/kill_a_mob"));
               AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
               if (!_ap.isDone()) {
                  for (String criteria : _ap.getRemainingCriteria()) {
                     _player.getAdvancements().award(_adv, criteria);
                  }
               }
            }

            if (entity instanceof Runner38Entity && sourceentity instanceof ServerPlayer _player) {
               Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/kill_a_mob"));
               AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
               if (!_ap.isDone()) {
                  for (String criteria : _ap.getRemainingCriteria()) {
                     _player.getAdvancements().award(_adv, criteria);
                  }
               }
            }

            if (entity instanceof Runner39Entity && sourceentity instanceof ServerPlayer _player) {
               Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/kill_a_mob"));
               AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
               if (!_ap.isDone()) {
                  for (String criteria : _ap.getRemainingCriteria()) {
                     _player.getAdvancements().award(_adv, criteria);
                  }
               }
            }

            if (entity instanceof Runner40Entity && sourceentity instanceof ServerPlayer _player) {
               Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/kill_a_mob"));
               AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
               if (!_ap.isDone()) {
                  for (String criteria : _ap.getRemainingCriteria()) {
                     _player.getAdvancements().award(_adv, criteria);
                  }
               }
            }

            if (entity instanceof Runner41Entity && sourceentity instanceof ServerPlayer _player) {
               Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/kill_a_mob"));
               AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
               if (!_ap.isDone()) {
                  for (String criteria : _ap.getRemainingCriteria()) {
                     _player.getAdvancements().award(_adv, criteria);
                  }
               }
            }

            if (entity instanceof Runner42Entity && sourceentity instanceof ServerPlayer _player) {
               Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/kill_a_mob"));
               AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
               if (!_ap.isDone()) {
                  for (String criteria : _ap.getRemainingCriteria()) {
                     _player.getAdvancements().award(_adv, criteria);
                  }
               }
            }

            if (entity instanceof Runner43Entity && sourceentity instanceof ServerPlayer _player) {
               Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/kill_a_mob"));
               AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
               if (!_ap.isDone()) {
                  for (String criteria : _ap.getRemainingCriteria()) {
                     _player.getAdvancements().award(_adv, criteria);
                  }
               }
            }

            if (entity instanceof Runner44Entity && sourceentity instanceof ServerPlayer _player) {
               Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/kill_a_mob"));
               AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
               if (!_ap.isDone()) {
                  for (String criteria : _ap.getRemainingCriteria()) {
                     _player.getAdvancements().award(_adv, criteria);
                  }
               }
            }

            if (entity instanceof Runner45Entity && sourceentity instanceof ServerPlayer _player) {
               Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/kill_a_mob"));
               AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
               if (!_ap.isDone()) {
                  for (String criteria : _ap.getRemainingCriteria()) {
                     _player.getAdvancements().award(_adv, criteria);
                  }
               }
            }

            if (entity instanceof Runner46Entity && sourceentity instanceof ServerPlayer _player) {
               Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/kill_a_mob"));
               AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
               if (!_ap.isDone()) {
                  for (String criteria : _ap.getRemainingCriteria()) {
                     _player.getAdvancements().award(_adv, criteria);
                  }
               }
            }

            if (entity instanceof Runner47Entity && sourceentity instanceof ServerPlayer _player) {
               Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/kill_a_mob"));
               AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
               if (!_ap.isDone()) {
                  for (String criteria : _ap.getRemainingCriteria()) {
                     _player.getAdvancements().award(_adv, criteria);
                  }
               }
            }

            if (entity instanceof Runner48Entity && sourceentity instanceof ServerPlayer _player) {
               Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/kill_a_mob"));
               AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
               if (!_ap.isDone()) {
                  for (String criteria : _ap.getRemainingCriteria()) {
                     _player.getAdvancements().award(_adv, criteria);
                  }
               }
            }

            if (entity instanceof Runner49Entity && sourceentity instanceof ServerPlayer _player) {
               Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/kill_a_mob"));
               AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
               if (!_ap.isDone()) {
                  for (String criteria : _ap.getRemainingCriteria()) {
                     _player.getAdvancements().award(_adv, criteria);
                  }
               }
            }

            if (entity instanceof Runner50Entity && sourceentity instanceof ServerPlayer _player) {
               Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/kill_a_mob"));
               AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
               if (!_ap.isDone()) {
                  for (String criteria : _ap.getRemainingCriteria()) {
                     _player.getAdvancements().award(_adv, criteria);
                  }
               }
            }

            if (entity instanceof Runner51Entity && sourceentity instanceof ServerPlayer _player) {
               Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/kill_a_mob"));
               AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
               if (!_ap.isDone()) {
                  for (String criteria : _ap.getRemainingCriteria()) {
                     _player.getAdvancements().award(_adv, criteria);
                  }
               }
            }

            if (entity instanceof Runner52Entity && sourceentity instanceof ServerPlayer _player) {
               Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/kill_a_mob"));
               AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
               if (!_ap.isDone()) {
                  for (String criteria : _ap.getRemainingCriteria()) {
                     _player.getAdvancements().award(_adv, criteria);
                  }
               }
            }

            if (entity instanceof Runner53Entity && sourceentity instanceof ServerPlayer _player) {
               Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/kill_a_mob"));
               AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
               if (!_ap.isDone()) {
                  for (String criteria : _ap.getRemainingCriteria()) {
                     _player.getAdvancements().award(_adv, criteria);
                  }
               }
            }

            if (entity instanceof Runner54Entity && sourceentity instanceof ServerPlayer _player) {
               Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/kill_a_mob"));
               AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
               if (!_ap.isDone()) {
                  for (String criteria : _ap.getRemainingCriteria()) {
                     _player.getAdvancements().award(_adv, criteria);
                  }
               }
            }

            if (entity instanceof Runner55Entity && sourceentity instanceof ServerPlayer _player) {
               Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/kill_a_mob"));
               AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
               if (!_ap.isDone()) {
                  for (String criteria : _ap.getRemainingCriteria()) {
                     _player.getAdvancements().award(_adv, criteria);
                  }
               }
            }

            if (entity instanceof Runner56Entity && sourceentity instanceof ServerPlayer _player) {
               Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/kill_a_mob"));
               AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
               if (!_ap.isDone()) {
                  for (String criteria : _ap.getRemainingCriteria()) {
                     _player.getAdvancements().award(_adv, criteria);
                  }
               }
            }

            if (entity instanceof Runner57Entity && sourceentity instanceof ServerPlayer _player) {
               Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/kill_a_mob"));
               AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
               if (!_ap.isDone()) {
                  for (String criteria : _ap.getRemainingCriteria()) {
                     _player.getAdvancements().award(_adv, criteria);
                  }
               }
            }

            if (entity instanceof Soldiers02Entity && sourceentity instanceof ServerPlayer _player) {
               Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/kill_a_mob"));
               AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
               if (!_ap.isDone()) {
                  for (String criteria : _ap.getRemainingCriteria()) {
                     _player.getAdvancements().award(_adv, criteria);
                  }
               }
            }
         }
      }
   }
}

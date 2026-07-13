package net.mcreator.apocalypsenow.procedures;

import javax.annotation.Nullable;
import net.mcreator.apocalypsenow.configuration.ApocalypsenowconfigurationConfiguration;
import net.mcreator.apocalypsenow.init.ApocalypsenowModItems;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.Husk;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class ZombiesArmorProcedure {
   @SubscribeEvent
   public static void onEntitySpawned(EntityJoinLevelEvent event) {
      execute(event, event.getLevel(), event.getEntity());
   }

   public static void execute(LevelAccessor world, Entity entity) {
      execute(null, world, entity);
   }

   private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
      if (entity != null) {
         if (ApocalypsenowconfigurationConfiguration.UNDEAD_GET_ARMOR.get() && !world.isClientSide() && entity instanceof Zombie) {
            if (Math.random() < 0.02) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.BLACK_FOOTBALL_ARMOR_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.BLACK_FOOTBALL_ARMOR_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.BLACK_FOOTBALL_ARMOR_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.BLACK_FOOTBALL_ARMOR_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.BLACK_FOOTBALL_ARMOR_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.BLACK_FOOTBALL_ARMOR_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.BLACK_FOOTBALL_ARMOR_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.BLACK_FOOTBALL_ARMOR_BOOTS.get()));
               }
            } else if (Math.random() < 0.02) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.LEVEL_A_HAZMATSUIT_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.LEVEL_A_HAZMATSUIT_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.LEVEL_A_HAZMATSUIT_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.LEVEL_A_HAZMATSUIT_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.LEVEL_A_HAZMATSUIT_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.LEVEL_A_HAZMATSUIT_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.LEVEL_A_HAZMATSUIT_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.LEVEL_A_HAZMATSUIT_BOOTS.get()));
               }
            } else if (Math.random() < 0.02) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.BRAZILIAN_ARMY_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.BRAZILIAN_ARMY_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.BRAZILIAN_ARMY_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.BRAZILIAN_ARMY_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.BRAZILIAN_ARMY_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.BRAZILIAN_ARMY_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.BRAZILIAN_ARMY_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.BRAZILIAN_ARMY_BOOTS.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.ITALIAN_BERSAGLIERI_ARMY_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.ITALIAN_BERSAGLIERI_ARMY_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.ITALIAN_BERSAGLIERI_ARMY_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.ITALIAN_BERSAGLIERI_ARMY_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.ITALIAN_BERSAGLIERI_ARMY_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.ITALIAN_BERSAGLIERI_ARMY_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.ITALIAN_BERSAGLIERI_ARMY_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.ITALIAN_BERSAGLIERI_ARMY_BOOTS.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.BLUE_FIGHTING_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.BLUE_FIGHTING_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.BLUE_FIGHTING_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.BLUE_FIGHTING_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.BLUE_FIGHTING_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.BLUE_FIGHTING_LEGGINGS.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.RED_FIGHTING_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.RED_FIGHTING_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.RED_FIGHTING_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.RED_FIGHTING_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.RED_FIGHTING_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.RED_FIGHTING_LEGGINGS.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.OFFICER_BERET_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.OFFICER_BERET_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.OFFICER_BERET_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.OFFICER_BERET_CHESTPLATE.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.PBF_HAMSTERGASMASK_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.PBF_HAMSTERGASMASK_HELMET.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.PLAGUE_MASK_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.PLAGUE_MASK_HELMET.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.CONTAMINATION_SUIT_GREEN_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.CONTAMINATION_SUIT_GREEN_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.CONTAMINATION_SUIT_GREEN_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.CONTAMINATION_SUIT_GREEN_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.CONTAMINATION_SUIT_GREEN_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.CONTAMINATION_SUIT_GREEN_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.CONTAMINATION_SUIT_WHITE_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.CONTAMINATION_SUIT_WHITE_BOOTS.get()));
               }
            } else if (Math.random() < 0.02) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.BRITISH_ARMY_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.BRITISH_ARMY_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.BRITISH_ARMY_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.BRITISH_ARMY_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.BRITISH_ARMY_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.BRITISH_ARMY_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.BRITISH_ARMY_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.BRITISH_ARMY_BOOTS.get()));
               }
            } else if (Math.random() < 0.02) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.USA_ARMOR_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.USA_ARMOR_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.USA_ARMOR_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.USA_ARMOR_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.USA_ARMOR_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.USA_ARMOR_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.USA_ARMOR_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.USA_ARMOR_BOOTS.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.UN_GAS_MASK_HELMET_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.UN_GAS_MASK_HELMET_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.MILITARY_PILOT_HEADSET_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.MILITARY_PILOT_HEADSET_CHESTPLATE.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.BALLISTIC_MASK_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.BALLISTIC_MASK_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.ATLAST_7_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.ATLAST_7_CHESTPLATE.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.GAS_MASK_HELMET_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.GAS_MASK_HELMET_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.DESERTCAMO_6B_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.DESERTCAMO_6B_CHESTPLATE.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.MILITARY_BERET_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.MILITARY_BERET_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.MILITARY_BERET_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.MILITARY_BERET_CHESTPLATE.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.BERET_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.BERET_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.GAS_TANK_VEST_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.GAS_TANK_VEST_CHESTPLATE.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.ROYAL_CANADA_POLICE_OFFICER_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.ROYAL_CANADA_POLICE_OFFICER_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.ROYAL_CANADA_POLICE_OFFICER_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.ROYAL_CANADA_POLICE_OFFICER_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.ROYAL_CANADA_POLICE_OFFICER_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.ROYAL_CANADA_POLICE_OFFICER_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.ROYAL_CANADA_POLICE_OFFICER_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.ROYAL_CANADA_POLICE_OFFICER_BOOTS.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.ADVANCED_HAZMAT_SUIT_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.ADVANCED_HAZMAT_SUIT_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.ADVANCED_HAZMAT_SUIT_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.ADVANCED_HAZMAT_SUIT_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.ADVANCED_HAZMAT_SUIT_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.ADVANCED_HAZMAT_SUIT_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.ADVANCED_HAZMAT_SUIT_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.ADVANCED_HAZMAT_SUIT_BOOTS.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.CHINESE_ARMY_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.CHINESE_ARMY_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.CHINESE_ARMY_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.CHINESE_ARMY_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.CHINESE_ARMY_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.CHINESE_ARMY_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.CHINESE_ARMY_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.CHINESE_ARMY_BOOTS.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.RUSSIAN_ARMY_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.RUSSIAN_ARMY_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.RUSSIAN_ARMY_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.RUSSIAN_ARMY_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.RUSSIAN_ARMY_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.RUSSIAN_ARMY_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.RUSSIAN_ARMY_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.RUSSIAN_ARMY_BOOTS.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.MILITARY_URBAN_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.MILITARY_URBAN_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.MILITARY_URBAN_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.MILITARY_URBAN_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.MILITARY_URBAN_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.MILITARY_URBAN_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.MILITARY_URBAN_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.MILITARY_URBAN_BOOTS.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.HELICOPTER_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.HELICOPTER_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.GAS_TANK_VEST_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.GAS_TANK_VEST_CHESTPLATE.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.NURSE_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.NURSE_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.NURSE_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.NURSE_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.NURSE_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.NURSE_BOOTS.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.MEXICAN_ARMY_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.MEXICAN_ARMY_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.MEXICAN_ARMY_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.MEXICAN_ARMY_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.MEXICAN_ARMY_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.MEXICAN_ARMY_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.MEXICAN_ARMY_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.MEXICAN_ARMY_BOOTS.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.BOMBSQUAD_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.BOMBSQUAD_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.BOMBSQUAD_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.BOMBSQUAD_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.BOMBSQUAD_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.BOMBSQUAD_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.BOMBSQUAD_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.BOMBSQUAD_BOOTS.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.TANK_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.TANK_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.BVD_ASSAULT_VEST_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.BVD_ASSAULT_VEST_CHESTPLATE.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.CONSTRUCTION_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.CONSTRUCTION_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.CONSTRUCTION_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.CONSTRUCTION_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.CONSTRUCTION_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.CONSTRUCTION_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.CONSTRUCTION_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.CONSTRUCTION_BOOTS.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.UN_ARMOR_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.UN_ARMOR_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.UN_ARMOR_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.UN_ARMOR_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.UN_ARMOR_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.UN_ARMOR_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.UN_ARMOR_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.UN_ARMOR_BOOTS.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.SNOWGHILLIE_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.SNOWGHILLIE_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.SNOWGHILLIE_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.SNOWGHILLIE_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.SNOWGHILLIE_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.SNOWGHILLIE_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.SNOWGHILLIE_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.SNOWGHILLIE_BOOTS.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.CANADIAN_ARMY_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.CANADIAN_ARMY_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.CANADIAN_ARMY_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.CANADIAN_ARMY_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.CANADIAN_ARMY_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.CANADIAN_ARMY_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.CANADIAN_ARMY_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.CANADIAN_ARMY_BOOTS.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.BOMBSQUAD_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.BOMBSQUAD_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.BOMBSQUAD_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.BOMBSQUAD_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.BOMBSQUAD_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.BOMBSQUAD_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.BOMBSQUAD_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.BOMBSQUAD_BOOTS.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.SWATRIOTCONTROL_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.SWATRIOTCONTROL_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.SWATRIOTCONTROL_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.SWATRIOTCONTROL_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.SWATRIOTCONTROL_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.SWATRIOTCONTROL_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.SWATRIOTCONTROL_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.SWATRIOTCONTROL_BOOTS.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.HAZMAT_SUIT_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.HAZMAT_SUIT_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.HAZMAT_SUIT_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.HAZMAT_SUIT_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.HAZMAT_SUIT_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.HAZMAT_SUIT_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.HAZMAT_SUIT_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.HAZMAT_SUIT_BOOTS.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.HOCKEY_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.HOCKEY_HELMET.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.BASEBALL_HELMET_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.BASEBALL_HELMET_HELMET.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.HUNTING_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.HUNTING_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.HUNTING_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.HUNTING_CHESTPLATE.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.LIFE_JACKET_BULLET_HELMET_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.LIFE_JACKET_BULLET_HELMET_HELMET.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.OLD_WEST_HAT_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.OLD_WEST_HAT_HELMET.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.COWBOY_HAT_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.COWBOY_HAT_HELMET.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.SHERIFF_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.SHERIFF_HELMET.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.SOVIET_USHANKA_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.SOVIET_USHANKA_HELMET.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.ROU_RESPIRATOR_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.ROU_RESPIRATOR_HELMET.get()));
               }
            } else if (Math.random() < 0.02) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.RED_FOOTBALL_ARMOR_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.RED_FOOTBALL_ARMOR_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.RED_FOOTBALL_ARMOR_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.RED_FOOTBALL_ARMOR_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.RED_FOOTBALL_ARMOR_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.RED_FOOTBALL_ARMOR_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.RED_FOOTBALL_ARMOR_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.RED_FOOTBALL_ARMOR_BOOTS.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.YELLOW_FOOTBALL_ARMOR_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.YELLOW_FOOTBALL_ARMOR_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.YELLOW_FOOTBALL_ARMOR_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.YELLOW_FOOTBALL_ARMOR_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.YELLOW_FOOTBALL_ARMOR_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.YELLOW_FOOTBALL_ARMOR_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.YELLOW_FOOTBALL_ARMOR_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.YELLOW_FOOTBALL_ARMOR_BOOTS.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.BLUE_FOOTBALL_ARMOR_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.BLUE_FOOTBALL_ARMOR_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.BLUE_FOOTBALL_ARMOR_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.BLUE_FOOTBALL_ARMOR_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.BLUE_FOOTBALL_ARMOR_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.BLUE_FOOTBALL_ARMOR_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.BLUE_FOOTBALL_ARMOR_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.BLUE_FOOTBALL_ARMOR_BOOTS.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.RUSTY_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.RUSTY_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.RUSTY_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.RUSTY_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.RUSTY_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.RUSTY_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.RUSTY_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.RUSTY_BOOTS.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.JASONMASK_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.JASONMASK_HELMET.get()));
               }
            } else if (Math.random() < 0.02) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.US_ARMY_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.US_ARMY_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.US_ARMY_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.US_ARMY_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.US_ARMY_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.US_ARMY_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.US_ARMY_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.US_ARMY_BOOTS.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.JET_PILOT_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.JET_PILOT_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.JET_PILOT_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.JET_PILOT_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.JET_PILOT_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.JET_PILOT_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.JET_PILOT_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.JET_PILOT_BOOTS.get()));
               }
            } else if (Math.random() < 0.02) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.FIRE_FIGTHER_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.FIRE_FIGTHER_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.FIRE_FIGTHER_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.FIRE_FIGTHER_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.FIRE_FIGTHER_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.FIRE_FIGTHER_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.FIRE_FIGTHER_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.FIRE_FIGTHER_BOOTS.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.BIOHAZARD_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.BIOHAZARD_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.BIOHAZARD_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.BIOHAZARD_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.BIOHAZARD_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.BIOHAZARD_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.BIOHAZARD_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.BIOHAZARD_BOOTS.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.ANARCHY_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.ANARCHY_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.ANARCHY_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.ANARCHY_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.ANARCHY_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.ANARCHY_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.ANARCHY_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.ANARCHY_BOOTS.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.ARMY_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.ARMY_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.ARMY_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.ARMY_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.ARMY_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.ARMY_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.ARMY_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.ARMY_BOOTS.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.SWAT_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.SWAT_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.SWAT_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.SWAT_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.SWAT_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.SWAT_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.SWAT_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.SWAT_BOOTS.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.CONTAMINATION_SUIT_BLUE_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.CONTAMINATION_SUIT_BLUE_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.CONTAMINATION_SUIT_BLUE_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.CONTAMINATION_SUIT_BLUE_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.CONTAMINATION_SUIT_BLUE_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.CONTAMINATION_SUIT_BLUE_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.CONTAMINATION_SUIT_WHITE_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.CONTAMINATION_SUIT_WHITE_BOOTS.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.CONTAMINATION_SUIT_WHITE_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.CONTAMINATION_SUIT_WHITE_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.CONTAMINATION_SUIT_WHITE_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.CONTAMINATION_SUIT_WHITE_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.CONTAMINATION_SUIT_WHITE_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.CONTAMINATION_SUIT_WHITE_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.CONTAMINATION_SUIT_WHITE_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.CONTAMINATION_SUIT_WHITE_BOOTS.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.WELDING_MASK_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.WELDING_MASK_HELMET.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.GHILLIESUIT_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.GHILLIESUIT_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.GHILLIESUIT_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.GHILLIESUIT_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.GHILLIESUIT_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.GHILLIESUIT_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.GHILLIESUIT_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.GHILLIESUIT_BOOTS.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.ORANGE_VISOR_GAS_MASK_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.ORANGE_VISOR_GAS_MASK_HELMET.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.JUGGERNAUT_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.JUGGERNAUT_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.JUGGERNAUT_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.JUGGERNAUT_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.JUGGERNAUT_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.JUGGERNAUT_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.JUGGERNAUT_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.JUGGERNAUT_BOOTS.get()));
               }
            } else if (Math.random() < 0.02) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.SOLDIER_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.SOLDIER_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.SOLDIER_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.SOLDIER_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.SOLDIER_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.SOLDIER_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.SOLDIER_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.SOLDIER_BOOTS.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.DIVINGSUIT_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.DIVINGSUIT_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.DIVINGSUIT_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.DIVINGSUIT_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.DIVINGSUIT_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.DIVINGSUIT_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.DIVINGSUIT_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.DIVINGSUIT_BOOTS.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.POLICE_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.POLICE_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.POLICE_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.POLICE_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.POLICE_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.POLICE_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.POLICE_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.POLICE_BOOTS.get()));
               }
            } else if (Math.random() < 0.02) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.PKM_4GASMASK_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.PKM_4GASMASK_HELMET.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.DESERTGHILLIE_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.DESERTGHILLIE_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.DESERTGHILLIE_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.DESERTGHILLIE_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.DESERTGHILLIE_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.DESERTGHILLIE_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.DESERTGHILLIE_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.DESERTGHILLIE_BOOTS.get()));
               }
            } else if (Math.random() < 0.02) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.BULLETPROOF_VEST_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.BULLETPROOF_VEST_CHESTPLATE.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.SPEC_OPS_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.SPEC_OPS_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.SPEC_OPS_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.SPEC_OPS_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.SPEC_OPS_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.SPEC_OPS_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.SPEC_OPS_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.SPEC_OPS_BOOTS.get()));
               }
            } else if (Math.random() < 0.02) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.MILITARY_RIOT_ARMOR_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.MILITARY_RIOT_ARMOR_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.MILITARY_RIOT_ARMOR_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.MILITARY_RIOT_ARMOR_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.MILITARY_RIOT_ARMOR_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.MILITARY_RIOT_ARMOR_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.MILITARY_RIOT_ARMOR_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.MILITARY_RIOT_ARMOR_BOOTS.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.RED_MOTORCYCLE_HELMET_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.RED_MOTORCYCLE_HELMET_HELMET.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.BLACK_MOTORCYCLE_HELMET_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.BLACK_MOTORCYCLE_HELMET_HELMET.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.RED_BIKERS_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.RED_BIKERS_HELMET.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.GREEN_BIKERS_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.GREEN_BIKERS_HELMET.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.BIKERS_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.BIKERS_HELMET.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.BLACK_BIKERS_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.BLACK_BIKERS_HELMET.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.PINK_BIKERS_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.PINK_BIKERS_HELMET.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.OFFICER_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.OFFICER_HELMET.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.VISOR_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.VISOR_HELMET.get()));
               }
            }
         }

         if (ApocalypsenowconfigurationConfiguration.UNDEAD_GET_ARMOR.get() && !world.isClientSide() && entity instanceof Husk) {
            if (Math.random() < 0.02) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.BLACK_FOOTBALL_ARMOR_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.BLACK_FOOTBALL_ARMOR_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.BLACK_FOOTBALL_ARMOR_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.BLACK_FOOTBALL_ARMOR_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.BLACK_FOOTBALL_ARMOR_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.BLACK_FOOTBALL_ARMOR_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.BLACK_FOOTBALL_ARMOR_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.BLACK_FOOTBALL_ARMOR_BOOTS.get()));
               }
            } else if (Math.random() < 0.02) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.LEVEL_A_HAZMATSUIT_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.LEVEL_A_HAZMATSUIT_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.LEVEL_A_HAZMATSUIT_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.LEVEL_A_HAZMATSUIT_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.LEVEL_A_HAZMATSUIT_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.LEVEL_A_HAZMATSUIT_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.LEVEL_A_HAZMATSUIT_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.LEVEL_A_HAZMATSUIT_BOOTS.get()));
               }
            } else if (Math.random() < 0.02) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.BRAZILIAN_ARMY_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.BRAZILIAN_ARMY_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.BRAZILIAN_ARMY_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.BRAZILIAN_ARMY_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.BRAZILIAN_ARMY_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.BRAZILIAN_ARMY_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.BRAZILIAN_ARMY_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.BRAZILIAN_ARMY_BOOTS.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.ITALIAN_BERSAGLIERI_ARMY_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.ITALIAN_BERSAGLIERI_ARMY_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.ITALIAN_BERSAGLIERI_ARMY_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.ITALIAN_BERSAGLIERI_ARMY_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.ITALIAN_BERSAGLIERI_ARMY_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.ITALIAN_BERSAGLIERI_ARMY_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.ITALIAN_BERSAGLIERI_ARMY_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.ITALIAN_BERSAGLIERI_ARMY_BOOTS.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.BLUE_FIGHTING_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.BLUE_FIGHTING_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.BLUE_FIGHTING_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.BLUE_FIGHTING_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.BLUE_FIGHTING_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.BLUE_FIGHTING_LEGGINGS.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.RED_FIGHTING_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.RED_FIGHTING_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.RED_FIGHTING_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.RED_FIGHTING_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.RED_FIGHTING_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.RED_FIGHTING_LEGGINGS.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.OFFICER_BERET_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.OFFICER_BERET_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.OFFICER_BERET_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.OFFICER_BERET_CHESTPLATE.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.PBF_HAMSTERGASMASK_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.PBF_HAMSTERGASMASK_HELMET.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.PLAGUE_MASK_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.PLAGUE_MASK_HELMET.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.CONTAMINATION_SUIT_GREEN_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.CONTAMINATION_SUIT_GREEN_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.CONTAMINATION_SUIT_GREEN_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.CONTAMINATION_SUIT_GREEN_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.CONTAMINATION_SUIT_GREEN_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.CONTAMINATION_SUIT_GREEN_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.CONTAMINATION_SUIT_WHITE_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.CONTAMINATION_SUIT_WHITE_BOOTS.get()));
               }
            } else if (Math.random() < 0.02) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.BRITISH_ARMY_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.BRITISH_ARMY_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.BRITISH_ARMY_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.BRITISH_ARMY_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.BRITISH_ARMY_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.BRITISH_ARMY_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.BRITISH_ARMY_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.BRITISH_ARMY_BOOTS.get()));
               }
            } else if (Math.random() < 0.02) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.USA_ARMOR_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.USA_ARMOR_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.USA_ARMOR_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.USA_ARMOR_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.USA_ARMOR_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.USA_ARMOR_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.USA_ARMOR_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.USA_ARMOR_BOOTS.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.UN_GAS_MASK_HELMET_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.UN_GAS_MASK_HELMET_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.MILITARY_PILOT_HEADSET_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.MILITARY_PILOT_HEADSET_CHESTPLATE.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.BALLISTIC_MASK_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.BALLISTIC_MASK_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.ATLAST_7_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.ATLAST_7_CHESTPLATE.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.GAS_MASK_HELMET_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.GAS_MASK_HELMET_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.DESERTCAMO_6B_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.DESERTCAMO_6B_CHESTPLATE.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.MILITARY_BERET_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.MILITARY_BERET_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.MILITARY_BERET_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.MILITARY_BERET_CHESTPLATE.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.BERET_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.BERET_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.GAS_TANK_VEST_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.GAS_TANK_VEST_CHESTPLATE.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.ROYAL_CANADA_POLICE_OFFICER_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.ROYAL_CANADA_POLICE_OFFICER_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.ROYAL_CANADA_POLICE_OFFICER_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.ROYAL_CANADA_POLICE_OFFICER_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.ROYAL_CANADA_POLICE_OFFICER_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.ROYAL_CANADA_POLICE_OFFICER_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.ROYAL_CANADA_POLICE_OFFICER_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.ROYAL_CANADA_POLICE_OFFICER_BOOTS.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.ADVANCED_HAZMAT_SUIT_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.ADVANCED_HAZMAT_SUIT_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.ADVANCED_HAZMAT_SUIT_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.ADVANCED_HAZMAT_SUIT_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.ADVANCED_HAZMAT_SUIT_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.ADVANCED_HAZMAT_SUIT_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.ADVANCED_HAZMAT_SUIT_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.ADVANCED_HAZMAT_SUIT_BOOTS.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.CHINESE_ARMY_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.CHINESE_ARMY_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.CHINESE_ARMY_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.CHINESE_ARMY_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.CHINESE_ARMY_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.CHINESE_ARMY_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.CHINESE_ARMY_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.CHINESE_ARMY_BOOTS.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.RUSSIAN_ARMY_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.RUSSIAN_ARMY_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.RUSSIAN_ARMY_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.RUSSIAN_ARMY_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.RUSSIAN_ARMY_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.RUSSIAN_ARMY_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.RUSSIAN_ARMY_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.RUSSIAN_ARMY_BOOTS.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.MILITARY_URBAN_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.MILITARY_URBAN_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.MILITARY_URBAN_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.MILITARY_URBAN_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.MILITARY_URBAN_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.MILITARY_URBAN_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.MILITARY_URBAN_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.MILITARY_URBAN_BOOTS.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.HELICOPTER_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.HELICOPTER_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.GAS_TANK_VEST_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.GAS_TANK_VEST_CHESTPLATE.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.NURSE_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.NURSE_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.NURSE_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.NURSE_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.NURSE_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.NURSE_BOOTS.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.MEXICAN_ARMY_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.MEXICAN_ARMY_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.MEXICAN_ARMY_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.MEXICAN_ARMY_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.MEXICAN_ARMY_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.MEXICAN_ARMY_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.MEXICAN_ARMY_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.MEXICAN_ARMY_BOOTS.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.BOMBSQUAD_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.BOMBSQUAD_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.BOMBSQUAD_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.BOMBSQUAD_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.BOMBSQUAD_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.BOMBSQUAD_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.BOMBSQUAD_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.BOMBSQUAD_BOOTS.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.TANK_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.TANK_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.BVD_ASSAULT_VEST_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.BVD_ASSAULT_VEST_CHESTPLATE.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.CONSTRUCTION_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.CONSTRUCTION_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.CONSTRUCTION_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.CONSTRUCTION_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.CONSTRUCTION_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.CONSTRUCTION_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.CONSTRUCTION_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.CONSTRUCTION_BOOTS.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.UN_ARMOR_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.UN_ARMOR_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.UN_ARMOR_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.UN_ARMOR_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.UN_ARMOR_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.UN_ARMOR_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.UN_ARMOR_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.UN_ARMOR_BOOTS.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.SNOWGHILLIE_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.SNOWGHILLIE_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.SNOWGHILLIE_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.SNOWGHILLIE_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.SNOWGHILLIE_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.SNOWGHILLIE_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.SNOWGHILLIE_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.SNOWGHILLIE_BOOTS.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.CANADIAN_ARMY_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.CANADIAN_ARMY_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.CANADIAN_ARMY_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.CANADIAN_ARMY_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.CANADIAN_ARMY_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.CANADIAN_ARMY_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.CANADIAN_ARMY_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.CANADIAN_ARMY_BOOTS.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.BOMBSQUAD_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.BOMBSQUAD_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.BOMBSQUAD_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.BOMBSQUAD_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.BOMBSQUAD_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.BOMBSQUAD_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.BOMBSQUAD_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.BOMBSQUAD_BOOTS.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.SWATRIOTCONTROL_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.SWATRIOTCONTROL_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.SWATRIOTCONTROL_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.SWATRIOTCONTROL_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.SWATRIOTCONTROL_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.SWATRIOTCONTROL_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.SWATRIOTCONTROL_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.SWATRIOTCONTROL_BOOTS.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.HAZMAT_SUIT_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.HAZMAT_SUIT_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.HAZMAT_SUIT_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.HAZMAT_SUIT_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.HAZMAT_SUIT_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.HAZMAT_SUIT_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.HAZMAT_SUIT_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.HAZMAT_SUIT_BOOTS.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.HOCKEY_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.HOCKEY_HELMET.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.BASEBALL_HELMET_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.BASEBALL_HELMET_HELMET.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.HUNTING_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.HUNTING_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.HUNTING_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.HUNTING_CHESTPLATE.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.LIFE_JACKET_BULLET_HELMET_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.LIFE_JACKET_BULLET_HELMET_HELMET.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.OLD_WEST_HAT_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.OLD_WEST_HAT_HELMET.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.COWBOY_HAT_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.COWBOY_HAT_HELMET.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.SHERIFF_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.SHERIFF_HELMET.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.SOVIET_USHANKA_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.SOVIET_USHANKA_HELMET.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.ROU_RESPIRATOR_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.ROU_RESPIRATOR_HELMET.get()));
               }
            } else if (Math.random() < 0.02) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.RED_FOOTBALL_ARMOR_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.RED_FOOTBALL_ARMOR_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.RED_FOOTBALL_ARMOR_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.RED_FOOTBALL_ARMOR_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.RED_FOOTBALL_ARMOR_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.RED_FOOTBALL_ARMOR_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.RED_FOOTBALL_ARMOR_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.RED_FOOTBALL_ARMOR_BOOTS.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.YELLOW_FOOTBALL_ARMOR_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.YELLOW_FOOTBALL_ARMOR_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.YELLOW_FOOTBALL_ARMOR_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.YELLOW_FOOTBALL_ARMOR_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.YELLOW_FOOTBALL_ARMOR_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.YELLOW_FOOTBALL_ARMOR_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.YELLOW_FOOTBALL_ARMOR_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.YELLOW_FOOTBALL_ARMOR_BOOTS.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.BLUE_FOOTBALL_ARMOR_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.BLUE_FOOTBALL_ARMOR_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.BLUE_FOOTBALL_ARMOR_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.BLUE_FOOTBALL_ARMOR_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.BLUE_FOOTBALL_ARMOR_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.BLUE_FOOTBALL_ARMOR_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.BLUE_FOOTBALL_ARMOR_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.BLUE_FOOTBALL_ARMOR_BOOTS.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.RUSTY_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.RUSTY_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.RUSTY_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.RUSTY_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.RUSTY_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.RUSTY_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.RUSTY_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.RUSTY_BOOTS.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.JASONMASK_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.JASONMASK_HELMET.get()));
               }
            } else if (Math.random() < 0.02) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.US_ARMY_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.US_ARMY_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.US_ARMY_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.US_ARMY_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.US_ARMY_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.US_ARMY_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.US_ARMY_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.US_ARMY_BOOTS.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.JET_PILOT_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.JET_PILOT_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.JET_PILOT_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.JET_PILOT_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.JET_PILOT_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.JET_PILOT_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.JET_PILOT_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.JET_PILOT_BOOTS.get()));
               }
            } else if (Math.random() < 0.02) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.FIRE_FIGTHER_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.FIRE_FIGTHER_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.FIRE_FIGTHER_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.FIRE_FIGTHER_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.FIRE_FIGTHER_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.FIRE_FIGTHER_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.FIRE_FIGTHER_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.FIRE_FIGTHER_BOOTS.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.BIOHAZARD_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.BIOHAZARD_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.BIOHAZARD_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.BIOHAZARD_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.BIOHAZARD_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.BIOHAZARD_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.BIOHAZARD_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.BIOHAZARD_BOOTS.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.ANARCHY_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.ANARCHY_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.ANARCHY_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.ANARCHY_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.ANARCHY_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.ANARCHY_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.ANARCHY_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.ANARCHY_BOOTS.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.ARMY_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.ARMY_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.ARMY_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.ARMY_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.ARMY_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.ARMY_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.ARMY_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.ARMY_BOOTS.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.SWAT_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.SWAT_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.SWAT_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.SWAT_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.SWAT_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.SWAT_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.SWAT_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.SWAT_BOOTS.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.CONTAMINATION_SUIT_BLUE_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.CONTAMINATION_SUIT_BLUE_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.CONTAMINATION_SUIT_BLUE_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.CONTAMINATION_SUIT_BLUE_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.CONTAMINATION_SUIT_BLUE_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.CONTAMINATION_SUIT_BLUE_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.CONTAMINATION_SUIT_WHITE_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.CONTAMINATION_SUIT_WHITE_BOOTS.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.CONTAMINATION_SUIT_WHITE_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.CONTAMINATION_SUIT_WHITE_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.CONTAMINATION_SUIT_WHITE_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.CONTAMINATION_SUIT_WHITE_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.CONTAMINATION_SUIT_WHITE_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.CONTAMINATION_SUIT_WHITE_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.CONTAMINATION_SUIT_WHITE_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.CONTAMINATION_SUIT_WHITE_BOOTS.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.WELDING_MASK_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.WELDING_MASK_HELMET.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.GHILLIESUIT_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.GHILLIESUIT_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.GHILLIESUIT_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.GHILLIESUIT_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.GHILLIESUIT_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.GHILLIESUIT_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.GHILLIESUIT_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.GHILLIESUIT_BOOTS.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.ORANGE_VISOR_GAS_MASK_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.ORANGE_VISOR_GAS_MASK_HELMET.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.JUGGERNAUT_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.JUGGERNAUT_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.JUGGERNAUT_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.JUGGERNAUT_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.JUGGERNAUT_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.JUGGERNAUT_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.JUGGERNAUT_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.JUGGERNAUT_BOOTS.get()));
               }
            } else if (Math.random() < 0.02) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.SOLDIER_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.SOLDIER_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.SOLDIER_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.SOLDIER_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.SOLDIER_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.SOLDIER_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.SOLDIER_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.SOLDIER_BOOTS.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.DIVINGSUIT_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.DIVINGSUIT_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.DIVINGSUIT_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.DIVINGSUIT_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.DIVINGSUIT_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.DIVINGSUIT_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.DIVINGSUIT_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.DIVINGSUIT_BOOTS.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.POLICE_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.POLICE_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.POLICE_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.POLICE_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.POLICE_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.POLICE_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.POLICE_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.POLICE_BOOTS.get()));
               }
            } else if (Math.random() < 0.02) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.PKM_4GASMASK_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.PKM_4GASMASK_HELMET.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.DESERTGHILLIE_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.DESERTGHILLIE_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.DESERTGHILLIE_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.DESERTGHILLIE_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.DESERTGHILLIE_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.DESERTGHILLIE_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.DESERTGHILLIE_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.DESERTGHILLIE_BOOTS.get()));
               }
            } else if (Math.random() < 0.02) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.BULLETPROOF_VEST_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.BULLETPROOF_VEST_CHESTPLATE.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.SPEC_OPS_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.SPEC_OPS_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.SPEC_OPS_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.SPEC_OPS_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.SPEC_OPS_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.SPEC_OPS_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.SPEC_OPS_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.SPEC_OPS_BOOTS.get()));
               }
            } else if (Math.random() < 0.02) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.MILITARY_RIOT_ARMOR_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.MILITARY_RIOT_ARMOR_HELMET.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(2, new ItemStack(ApocalypsenowModItems.MILITARY_RIOT_ARMOR_CHESTPLATE.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ApocalypsenowModItems.MILITARY_RIOT_ARMOR_CHESTPLATE.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(1, new ItemStack(ApocalypsenowModItems.MILITARY_RIOT_ARMOR_LEGGINGS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ApocalypsenowModItems.MILITARY_RIOT_ARMOR_LEGGINGS.get()));
               }

               _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(ApocalypsenowModItems.MILITARY_RIOT_ARMOR_BOOTS.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ApocalypsenowModItems.MILITARY_RIOT_ARMOR_BOOTS.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.RED_MOTORCYCLE_HELMET_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.RED_MOTORCYCLE_HELMET_HELMET.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.BLACK_MOTORCYCLE_HELMET_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.BLACK_MOTORCYCLE_HELMET_HELMET.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.RED_BIKERS_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.RED_BIKERS_HELMET.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.GREEN_BIKERS_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.GREEN_BIKERS_HELMET.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.BIKERS_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.BIKERS_HELMET.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.BLACK_BIKERS_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.BLACK_BIKERS_HELMET.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.PINK_BIKERS_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.PINK_BIKERS_HELMET.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.OFFICER_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.OFFICER_HELMET.get()));
               }
            } else if (Math.random() < 0.01) {
               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(3, new ItemStack(ApocalypsenowModItems.VISOR_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.VISOR_HELMET.get()));
               }
            }
         }
      }
   }
}

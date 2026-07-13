package net.mcreator.apocalypsenow.item;

import com.google.common.collect.Iterables;
import java.util.Collections;
import java.util.Map;
import java.util.function.Consumer;
import net.mcreator.apocalypsenow.client.model.Modelbrassoldp;
import net.mcreator.apocalypsenow.client.model.Modelurbansold;
import net.mcreator.apocalypsenow.init.ApocalypsenowModItems;
import net.mcreator.apocalypsenow.procedures.BombsquadBootsTickEventProcedure;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ArmorItem.Type;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import net.minecraftforge.registries.ForgeRegistries;

public abstract class MilitaryurbanItem extends ArmorItem {
   public MilitaryurbanItem(Type type, Properties properties) {
      super(
         new ArmorMaterial() {
            @Override
            public int getDurabilityForType(Type type) {
               return new int[]{13, 15, 16, 11}[type.getSlot().getIndex()] * 45;
            }

            @Override
            public int getDefenseForType(Type type) {
               return new int[]{4, 6, 6, 2}[type.getSlot().getIndex()];
            }

            @Override
            public int getEnchantmentValue() {
               return 9;
            }

            @Override
            public SoundEvent getEquipSound() {
               return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_iron"));
            }

            @Override
            public Ingredient getRepairIngredient() {
               return Ingredient.of(
                  new ItemStack(ApocalypsenowModItems.DUCTTAPE.get()),
                  new ItemStack(ApocalypsenowModItems.ARMORPLATE.get()),
                  new ItemStack(ApocalypsenowModItems.POLYESTER.get())
               );
            }

            @Override
            public String getName() {
               return "military_urban";
            }

            @Override
            public float getToughness() {
               return 0.2F;
            }

            @Override
            public float getKnockbackResistance() {
               return 0.0F;
            }
         },
         type,
         properties
      );
   }

   public static class Boots extends MilitaryurbanItem {
      public Boots() {
         super(Type.BOOTS, new Properties());
      }

      @Override
      public void initializeClient(Consumer<IClientItemExtensions> consumer) {
         consumer.accept(
            new IClientItemExtensions() {
               @OnlyIn(Dist.CLIENT)
               @Override
               public HumanoidModel getHumanoidArmorModel(LivingEntity living, ItemStack stack, EquipmentSlot slot, HumanoidModel defaultModel) {
                  HumanoidModel armorModel = new HumanoidModel(
                     new ModelPart(
                        Collections.emptyList(),
                        Map.of(
                           "left_leg",
                           (new Modelurbansold(Minecraft.getInstance().getEntityModels().bakeLayer(Modelurbansold.LAYER_LOCATION))).LeftLeg,
                           "right_leg",
                           (new Modelurbansold(Minecraft.getInstance().getEntityModels().bakeLayer(Modelurbansold.LAYER_LOCATION))).RightLeg,
                           "head",
                           new ModelPart(Collections.emptyList(), Collections.emptyMap()),
                           "hat",
                           new ModelPart(Collections.emptyList(), Collections.emptyMap()),
                           "body",
                           new ModelPart(Collections.emptyList(), Collections.emptyMap()),
                           "right_arm",
                           new ModelPart(Collections.emptyList(), Collections.emptyMap()),
                           "left_arm",
                           new ModelPart(Collections.emptyList(), Collections.emptyMap())
                        )
                     )
                  );
                  armorModel.crouching = living.isShiftKeyDown();
                  armorModel.riding = defaultModel.riding;
                  armorModel.young = living.isBaby();
                  return armorModel;
               }
            }
         );
      }

      @Override
      public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
         return "apocalypsenow:textures/entities/urbansold.png";
      }

      @Override
      public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
         super.inventoryTick(itemstack, world, entity, slot, selected);
         if (entity instanceof Player player && Iterables.contains(player.getArmorSlots(), itemstack)) {
            BombsquadBootsTickEventProcedure.execute(entity);
         }
      }
   }

   public static class Chestplate extends MilitaryurbanItem {
      public Chestplate() {
         super(Type.CHESTPLATE, new Properties());
      }

      @Override
      public void initializeClient(Consumer<IClientItemExtensions> consumer) {
         consumer.accept(
            new IClientItemExtensions() {
               @OnlyIn(Dist.CLIENT)
               @Override
               public HumanoidModel getHumanoidArmorModel(LivingEntity living, ItemStack stack, EquipmentSlot slot, HumanoidModel defaultModel) {
                  HumanoidModel armorModel = new HumanoidModel(
                     new ModelPart(
                        Collections.emptyList(),
                        Map.of(
                           "body",
                           (new Modelurbansold(Minecraft.getInstance().getEntityModels().bakeLayer(Modelurbansold.LAYER_LOCATION))).Body,
                           "left_arm",
                           (new Modelurbansold(Minecraft.getInstance().getEntityModels().bakeLayer(Modelurbansold.LAYER_LOCATION))).LeftArm,
                           "right_arm",
                           (new Modelurbansold(Minecraft.getInstance().getEntityModels().bakeLayer(Modelurbansold.LAYER_LOCATION))).RightArm,
                           "head",
                           new ModelPart(Collections.emptyList(), Collections.emptyMap()),
                           "hat",
                           new ModelPart(Collections.emptyList(), Collections.emptyMap()),
                           "right_leg",
                           new ModelPart(Collections.emptyList(), Collections.emptyMap()),
                           "left_leg",
                           new ModelPart(Collections.emptyList(), Collections.emptyMap())
                        )
                     )
                  );
                  armorModel.crouching = living.isShiftKeyDown();
                  armorModel.riding = defaultModel.riding;
                  armorModel.young = living.isBaby();
                  return armorModel;
               }
            }
         );
      }

      @Override
      public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
         return "apocalypsenow:textures/entities/urbansold.png";
      }
   }

   public static class Helmet extends MilitaryurbanItem {
      public Helmet() {
         super(Type.HELMET, new Properties());
      }

      @Override
      public void initializeClient(Consumer<IClientItemExtensions> consumer) {
         consumer.accept(
            new IClientItemExtensions() {
               @Override
               public HumanoidModel getHumanoidArmorModel(LivingEntity living, ItemStack stack, EquipmentSlot slot, HumanoidModel defaultModel) {
                  HumanoidModel armorModel = new HumanoidModel(
                     new ModelPart(
                        Collections.emptyList(),
                        Map.of(
                           "head",
                           (new Modelurbansold(Minecraft.getInstance().getEntityModels().bakeLayer(Modelurbansold.LAYER_LOCATION))).Head,
                           "hat",
                           new ModelPart(Collections.emptyList(), Collections.emptyMap()),
                           "body",
                           new ModelPart(Collections.emptyList(), Collections.emptyMap()),
                           "right_arm",
                           new ModelPart(Collections.emptyList(), Collections.emptyMap()),
                           "left_arm",
                           new ModelPart(Collections.emptyList(), Collections.emptyMap()),
                           "right_leg",
                           new ModelPart(Collections.emptyList(), Collections.emptyMap()),
                           "left_leg",
                           new ModelPart(Collections.emptyList(), Collections.emptyMap())
                        )
                     )
                  );
                  armorModel.crouching = living.isShiftKeyDown();
                  armorModel.riding = defaultModel.riding;
                  armorModel.young = living.isBaby();
                  return armorModel;
               }
            }
         );
      }

      @Override
      public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
         return "apocalypsenow:textures/entities/urbansold.png";
      }
   }

   public static class Leggings extends MilitaryurbanItem {
      public Leggings() {
         super(Type.LEGGINGS, new Properties());
      }

      @Override
      public void initializeClient(Consumer<IClientItemExtensions> consumer) {
         consumer.accept(
            new IClientItemExtensions() {
               @OnlyIn(Dist.CLIENT)
               @Override
               public HumanoidModel getHumanoidArmorModel(LivingEntity living, ItemStack stack, EquipmentSlot slot, HumanoidModel defaultModel) {
                  HumanoidModel armorModel = new HumanoidModel(
                     new ModelPart(
                        Collections.emptyList(),
                        Map.of(
                           "left_leg",
                           (new Modelbrassoldp(Minecraft.getInstance().getEntityModels().bakeLayer(Modelbrassoldp.LAYER_LOCATION))).LeftLeg,
                           "right_leg",
                           (new Modelbrassoldp(Minecraft.getInstance().getEntityModels().bakeLayer(Modelbrassoldp.LAYER_LOCATION))).RightLeg,
                           "head",
                           new ModelPart(Collections.emptyList(), Collections.emptyMap()),
                           "hat",
                           new ModelPart(Collections.emptyList(), Collections.emptyMap()),
                           "body",
                           new ModelPart(Collections.emptyList(), Collections.emptyMap()),
                           "right_arm",
                           new ModelPart(Collections.emptyList(), Collections.emptyMap()),
                           "left_arm",
                           new ModelPart(Collections.emptyList(), Collections.emptyMap())
                        )
                     )
                  );
                  armorModel.crouching = living.isShiftKeyDown();
                  armorModel.riding = defaultModel.riding;
                  armorModel.young = living.isBaby();
                  return armorModel;
               }
            }
         );
      }

      @Override
      public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
         return "apocalypsenow:textures/entities/urbansoldp.png";
      }
   }
}

package net.mcreator.apocalypsenow.item;

import com.google.common.collect.Iterables;
import java.util.Collections;
import java.util.Map;
import java.util.function.Consumer;
import net.mcreator.apocalypsenow.client.model.Modelcontaminacao;
import net.mcreator.apocalypsenow.client.model.Modelslimpants;
import net.mcreator.apocalypsenow.init.ApocalypsenowModItems;
import net.mcreator.apocalypsenow.procedures.BombsquadBootsTickEventProcedure;
import net.mcreator.apocalypsenow.procedures.GasmaskHelmetTickEventProcedure;
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

public abstract class ContaminationsuitwhiteItem extends ArmorItem {
   public ContaminationsuitwhiteItem(Type type, Properties properties) {
      super(
         new ArmorMaterial() {
            @Override
            public int getDurabilityForType(Type type) {
               return new int[]{13, 15, 16, 11}[type.getSlot().getIndex()] * 20;
            }

            @Override
            public int getDefenseForType(Type type) {
               return new int[]{2, 4, 5, 2}[type.getSlot().getIndex()];
            }

            @Override
            public int getEnchantmentValue() {
               return 9;
            }

            @Override
            public SoundEvent getEquipSound() {
               return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_leather"));
            }

            @Override
            public Ingredient getRepairIngredient() {
               return Ingredient.of(
                  new ItemStack(ApocalypsenowModItems.DUCTTAPE.get()),
                  new ItemStack(ApocalypsenowModItems.POLYESTER.get()),
                  new ItemStack(ApocalypsenowModItems.BREATHINGFILTERMODULE.get())
               );
            }

            @Override
            public String getName() {
               return "contamination_suit_white";
            }

            @Override
            public float getToughness() {
               return 0.0F;
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

   public static class Boots extends ContaminationsuitwhiteItem {
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
                           (new Modelcontaminacao(Minecraft.getInstance().getEntityModels().bakeLayer(Modelcontaminacao.LAYER_LOCATION))).LeftLeg,
                           "right_leg",
                           (new Modelcontaminacao(Minecraft.getInstance().getEntityModels().bakeLayer(Modelcontaminacao.LAYER_LOCATION))).RightLeg,
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
         return "apocalypsenow:textures/entities/contaminacao.png";
      }

      @Override
      public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
         super.inventoryTick(itemstack, world, entity, slot, selected);
         if (entity instanceof Player player && Iterables.contains(player.getArmorSlots(), itemstack)) {
            BombsquadBootsTickEventProcedure.execute(entity);
         }
      }
   }

   public static class Chestplate extends ContaminationsuitwhiteItem {
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
                           (new Modelcontaminacao(Minecraft.getInstance().getEntityModels().bakeLayer(Modelcontaminacao.LAYER_LOCATION))).Body,
                           "left_arm",
                           (new Modelcontaminacao(Minecraft.getInstance().getEntityModels().bakeLayer(Modelcontaminacao.LAYER_LOCATION))).LeftArm,
                           "right_arm",
                           (new Modelcontaminacao(Minecraft.getInstance().getEntityModels().bakeLayer(Modelcontaminacao.LAYER_LOCATION))).RightArm,
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
         return "apocalypsenow:textures/entities/contaminacao.png";
      }
   }

   public static class Helmet extends ContaminationsuitwhiteItem {
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
                           (new Modelcontaminacao(Minecraft.getInstance().getEntityModels().bakeLayer(Modelcontaminacao.LAYER_LOCATION))).Head,
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
         return "apocalypsenow:textures/entities/contaminacao.png";
      }

      @Override
      public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
         super.inventoryTick(itemstack, world, entity, slot, selected);
         if (entity instanceof Player player && Iterables.contains(player.getArmorSlots(), itemstack)) {
            GasmaskHelmetTickEventProcedure.execute(entity);
         }
      }
   }

   public static class Leggings extends ContaminationsuitwhiteItem {
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
                           (new Modelslimpants(Minecraft.getInstance().getEntityModels().bakeLayer(Modelslimpants.LAYER_LOCATION))).LeftLeg,
                           "right_leg",
                           (new Modelslimpants(Minecraft.getInstance().getEntityModels().bakeLayer(Modelslimpants.LAYER_LOCATION))).RightLeg,
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
         return "apocalypsenow:textures/entities/contaminacaopants2.png";
      }
   }
}

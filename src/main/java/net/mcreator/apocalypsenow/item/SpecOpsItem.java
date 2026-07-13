package net.mcreator.apocalypsenow.item;

import com.google.common.collect.Iterables;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import net.mcreator.apocalypsenow.client.model.Modelpants;
import net.mcreator.apocalypsenow.client.model.Modelspecopsn;
import net.mcreator.apocalypsenow.init.ApocalypsenowModItems;
import net.mcreator.apocalypsenow.procedures.BombsquadBootsTickEventProcedure;
import net.mcreator.apocalypsenow.procedures.FootballarmorBodyTickEventProcedure;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ArmorItem.Type;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import net.minecraftforge.registries.ForgeRegistries;

public abstract class SpecOpsItem extends ArmorItem {
   public SpecOpsItem(Type type, Properties properties) {
      super(
         new ArmorMaterial() {
            @Override
            public int getDurabilityForType(Type type) {
               return new int[]{13, 15, 16, 11}[type.getSlot().getIndex()] * 40;
            }

            @Override
            public int getDefenseForType(Type type) {
               return new int[]{7, 8, 9, 5}[type.getSlot().getIndex()];
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
                  new ItemStack(ApocalypsenowModItems.DUCTTAPE.get()), new ItemStack(Items.IRON_INGOT), new ItemStack(ApocalypsenowModItems.ARMORPLATE.get())
               );
            }

            @Override
            public String getName() {
               return "spec_ops";
            }

            @Override
            public float getToughness() {
               return 0.6F;
            }

            @Override
            public float getKnockbackResistance() {
               return 0.1F;
            }
         },
         type,
         properties
      );
   }

   public static class Boots extends SpecOpsItem {
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
                           (new Modelspecopsn(Minecraft.getInstance().getEntityModels().bakeLayer(Modelspecopsn.LAYER_LOCATION))).LeftLeg,
                           "right_leg",
                           (new Modelspecopsn(Minecraft.getInstance().getEntityModels().bakeLayer(Modelspecopsn.LAYER_LOCATION))).RightLeg,
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
         return "apocalypsenow:textures/entities/specnew.png";
      }

      @Override
      public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
         super.inventoryTick(itemstack, world, entity, slot, selected);
         if (entity instanceof Player player && Iterables.contains(player.getArmorSlots(), itemstack)) {
            BombsquadBootsTickEventProcedure.execute(entity);
         }
      }
   }

   public static class Chestplate extends SpecOpsItem {
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
                           (new Modelspecopsn(Minecraft.getInstance().getEntityModels().bakeLayer(Modelspecopsn.LAYER_LOCATION))).Body,
                           "left_arm",
                           (new Modelspecopsn(Minecraft.getInstance().getEntityModels().bakeLayer(Modelspecopsn.LAYER_LOCATION))).LeftArm,
                           "right_arm",
                           (new Modelspecopsn(Minecraft.getInstance().getEntityModels().bakeLayer(Modelspecopsn.LAYER_LOCATION))).RightArm,
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
         return "apocalypsenow:textures/entities/specnew.png";
      }

      @Override
      public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
         super.inventoryTick(itemstack, world, entity, slot, selected);
         if (entity instanceof Player player && Iterables.contains(player.getArmorSlots(), itemstack)) {
            FootballarmorBodyTickEventProcedure.execute(entity);
         }
      }
   }

   public static class Helmet extends SpecOpsItem {
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
                           (new Modelspecopsn(Minecraft.getInstance().getEntityModels().bakeLayer(Modelspecopsn.LAYER_LOCATION))).Head,
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
      public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
         super.appendHoverText(itemstack, level, list, flag);
         list.add(Component.translatable("text.apocalypsenow.press_n_to_turn_on_off_night_vision_1b4fc18a"));
      }

      @Override
      public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
         return "apocalypsenow:textures/entities/specnew.png";
      }
   }

   public static class Leggings extends SpecOpsItem {
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
                           (new Modelpants(Minecraft.getInstance().getEntityModels().bakeLayer(Modelpants.LAYER_LOCATION))).LeftLeg,
                           "right_leg",
                           (new Modelpants(Minecraft.getInstance().getEntityModels().bakeLayer(Modelpants.LAYER_LOCATION))).RightLeg,
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
         return "apocalypsenow:textures/entities/specopsnewp.png";
      }

      @Override
      public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
         super.inventoryTick(itemstack, world, entity, slot, selected);
         if (entity instanceof Player player && Iterables.contains(player.getArmorSlots(), itemstack)) {
            FootballarmorBodyTickEventProcedure.execute(entity);
         }
      }
   }
}

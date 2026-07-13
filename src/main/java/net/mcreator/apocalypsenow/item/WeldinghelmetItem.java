package net.mcreator.apocalypsenow.item;

import net.mcreator.apocalypsenow.init.ApocalypsenowModItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ArmorItem.Type;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.registries.ForgeRegistries;

public abstract class WeldinghelmetItem extends ArmorItem {
   public WeldinghelmetItem(Type type, Properties properties) {
      super(new ArmorMaterial() {
         @Override
         public int getDurabilityForType(Type type) {
            return new int[]{13, 15, 16, 11}[type.getSlot().getIndex()] * 40;
         }

         @Override
         public int getDefenseForType(Type type) {
            return new int[]{4, 4, 5, 7}[type.getSlot().getIndex()];
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
            return Ingredient.of(new ItemStack(Items.IRON_INGOT), new ItemStack(ApocalypsenowModItems.DUCTTAPE.get()));
         }

         @Override
         public String getName() {
            return "welding_mask";
         }

         @Override
         public float getToughness() {
            return 0.2F;
         }

         @Override
         public float getKnockbackResistance() {
            return 0.1F;
         }
      }, type, properties);
   }

   public static class Helmet extends WeldinghelmetItem {
      public Helmet() {
         super(Type.HELMET, new Properties());
      }

      @Override
      public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
         return "apocalypsenow:textures/models/armor/mascara_de_solda__layer_1.png";
      }
   }
}

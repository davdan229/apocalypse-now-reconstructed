package net.mcreator.apocalypsenow.item;

import net.mcreator.apocalypsenow.init.ApocalypsenowModItems;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ArmorItem.Type;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.crafting.Ingredient;

public abstract class PoliceofficerItem extends ArmorItem {
   public PoliceofficerItem(Type type, Properties properties) {
      super(new ArmorMaterial() {
         @Override
         public int getDurabilityForType(Type type) {
            return new int[]{13, 15, 16, 11}[type.getSlot().getIndex()] * 25;
         }

         @Override
         public int getDefenseForType(Type type) {
            return new int[]{2, 5, 2, 3}[type.getSlot().getIndex()];
         }

         @Override
         public int getEnchantmentValue() {
            return 9;
         }

         @Override
         public SoundEvent getEquipSound() {
            return SoundEvents.EMPTY;
         }

         @Override
         public Ingredient getRepairIngredient() {
            return Ingredient.of(new ItemStack(ApocalypsenowModItems.DUCTTAPE.get()), new ItemStack(ApocalypsenowModItems.PLASTICPLATE.get()));
         }

         @Override
         public String getName() {
            return "officer";
         }

         @Override
         public float getToughness() {
            return 0.0F;
         }

         @Override
         public float getKnockbackResistance() {
            return 0.0F;
         }
      }, type, properties);
   }

   public static class Helmet extends PoliceofficerItem {
      public Helmet() {
         super(Type.HELMET, new Properties());
      }

      @Override
      public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
         return "apocalypsenow:textures/models/armor/policeofficehelmet__layer_1.png";
      }
   }
}

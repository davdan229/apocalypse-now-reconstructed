package net.mcreator.apocalypsenow.item;

import com.google.common.collect.Iterables;
import net.mcreator.apocalypsenow.init.ApocalypsenowModItems;
import net.mcreator.apocalypsenow.procedures.SackHelmetTickEventProcedure;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ArmorItem.Type;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.minecraftforge.registries.ForgeRegistries;

public abstract class SackItem extends ArmorItem {
   public SackItem(Type type, Properties properties) {
      super(new ArmorMaterial() {
         @Override
         public int getDurabilityForType(Type type) {
            return new int[]{13, 15, 16, 11}[type.getSlot().getIndex()] * 6;
         }

         @Override
         public int getDefenseForType(Type type) {
            return new int[]{1, 1, 1, 0}[type.getSlot().getIndex()];
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
            return Ingredient.of(new ItemStack(ApocalypsenowModItems.CLOTH.get()));
         }

         @Override
         public String getName() {
            return "sack";
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

   public static class Helmet extends SackItem {
      public Helmet() {
         super(Type.HELMET, new Properties());
      }

      @Override
      public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
         return "apocalypsenow:textures/models/armor/saco__layer_1.png";
      }

      @Override
      public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
         super.inventoryTick(itemstack, world, entity, slot, selected);
         if (entity instanceof Player player && Iterables.contains(player.getArmorSlots(), itemstack)) {
            SackHelmetTickEventProcedure.execute(entity);
         }
      }
   }
}

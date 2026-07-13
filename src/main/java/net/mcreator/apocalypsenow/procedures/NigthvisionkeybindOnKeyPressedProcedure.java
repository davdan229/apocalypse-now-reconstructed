package net.mcreator.apocalypsenow.procedures;

import net.mcreator.apocalypsenow.init.ApocalypsenowModItems;
import net.mcreator.apocalypsenow.init.ApocalypsenowModMobEffects;
import net.mcreator.apocalypsenow.init.ApocalypsenowModSounds;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.LevelAccessor;

public class NigthvisionkeybindOnKeyPressedProcedure {
   private static final int ACTIVE_DURATION = 999999;

   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
      if (!(entity instanceof LivingEntity living) || living.level().isClientSide()) {
         return;
      }

      MobEffect selected = selectedMode(living);
      if (selected == null) {
         return;
      }

      boolean turningOff = living.hasEffect(selected);
      removeAllModes(living);
      SoundEvent sound = turningOff ? ApocalypsenowModSounds.BUTTON_CLICK.get() : ApocalypsenowModSounds.NV_ON.get();
      living.level().playSound(null, living.blockPosition(), sound, SoundSource.PLAYERS, 1.0F, 1.0F);
      if (!turningOff) {
         living.addEffect(new MobEffectInstance(selected, ACTIVE_DURATION, 0, false, false));
      }
   }

   private static MobEffect selectedMode(LivingEntity living) {
      Item helmet = living.getItemBySlot(EquipmentSlot.HEAD).getItem();
      if (helmet == ApocalypsenowModItems.SPEC_OPS_HELMET.get()) {
         return ApocalypsenowModMobEffects.NIGHTVISIONEFFECTT.get();
      }
      if (helmet == ApocalypsenowModItems.GPNVG_18_HELMET_HELMET.get()) {
         return ApocalypsenowModMobEffects.GPNVEFFECT.get();
      }
      if (living.hasEffect(ApocalypsenowModMobEffects.PLACEHOLDEREFFECTIGNORE.get())) {
         return ApocalypsenowModMobEffects.NVGEFFECT.get();
      }
      if (living.hasEffect(ApocalypsenowModMobEffects.PLACEHOLDERCIVILIANEFFECT.get())) {
         return ApocalypsenowModMobEffects.REDNIGHTVISIONEFFECT.get();
      }
      return null;
   }

   private static void removeAllModes(LivingEntity living) {
      living.removeEffect(ApocalypsenowModMobEffects.NIGHTVISIONEFFECTT.get());
      living.removeEffect(ApocalypsenowModMobEffects.GPNVEFFECT.get());
      living.removeEffect(ApocalypsenowModMobEffects.NVGEFFECT.get());
      living.removeEffect(ApocalypsenowModMobEffects.REDNIGHTVISIONEFFECT.get());
   }
}

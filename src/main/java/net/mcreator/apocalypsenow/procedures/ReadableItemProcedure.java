package net.mcreator.apocalypsenow.procedures;

import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.LevelAccessor;

final class ReadableItemProcedure {
   private ReadableItemProcedure() {
   }

   static void grantExperience(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack, int amount) {
      if (!(world instanceof ServerLevel level) || !(entity instanceof ServerPlayer) || itemstack.isEmpty()) {
         return;
      }
      itemstack.shrink(1);
      level.addFreshEntity(new ExperienceOrb(level, x, y, z, amount));
   }

   static void unlockAdvancement(Entity entity, ItemStack itemstack, String advancementId) {
      if (!(entity instanceof ServerPlayer player) || itemstack.isEmpty()) {
         return;
      }
      Advancement advancement = player.server.getAdvancements().getAdvancement(new ResourceLocation(advancementId));
      if (advancement == null) {
         return;
      }
      AdvancementProgress progress = player.getAdvancements().getOrStartProgress(advancement);
      if (!progress.isDone()) {
         for (String criterion : progress.getRemainingCriteria()) {
            player.getAdvancements().award(advancement, criterion);
         }
      }
      itemstack.shrink(1);
   }
}

package net.mcreator.apocalypsenow.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;

public class FullcanteenProcedure {
   private static final String[] NO_WATER_MESSAGES = {
      "text.apocalypsenow.not_enought_water_2b71a015",
      "text.apocalypsenow.there_is_no_water_here_3103cfaf",
      "text.apocalypsenow.maybe_somewhere_else_e1e3605b",
      "text.apocalypsenow.maybe_this_isn_t_appropriate_for_that_1adbc83c",
      "text.apocalypsenow.dry_like_a_desert_a80d91e4"
   };

   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
      if (!(world instanceof Level level) || level.isClientSide() || !(entity instanceof Player player)) {
         return;
      }

      BlockPos pos = BlockPos.containing(x, y, z);
      boolean water = level.getFluidState(pos).is(FluidTags.WATER) || level.getFluidState(pos.above()).is(FluidTags.WATER);
      if (!water) {
         player.displayClientMessage(Component.translatable(NO_WATER_MESSAGES[player.getRandom().nextInt(NO_WATER_MESSAGES.length)]), true);
         return;
      }
      if (itemstack.getDamageValue() <= 0) {
         return;
      }

      itemstack.setDamageValue(itemstack.getDamageValue() - 1);
      player.getCooldowns().addCooldown(itemstack.getItem(), 5);
      level.playSound(null, player.blockPosition(), SoundEvents.BOTTLE_FILL, SoundSource.PLAYERS, 1.0F, 1.0F);
   }
}

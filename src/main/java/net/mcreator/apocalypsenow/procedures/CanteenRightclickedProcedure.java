package net.mcreator.apocalypsenow.procedures;

import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;

public class CanteenRightclickedProcedure {
   private static final String[] FULL_MESSAGES = {
      "text.apocalypsenow.i_am_full_054a998d",
      "text.apocalypsenow.i_don_t_need_to_drink_anymore_9913fe20",
      "text.apocalypsenow.my_hunger_is_satisfied_bb26d740",
      "text.apocalypsenow.i_m_not_thirsty_28ad7a16"
   };

   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
      drink(world, entity, itemstack, 19, 40);
   }

   static void drink(LevelAccessor world, Entity entity, ItemStack itemstack, int emptyDamage, int cooldown) {
      if (!(world instanceof Level level) || level.isClientSide() || !(entity instanceof Player player)) {
         return;
      }
      if (itemstack.getDamageValue() >= emptyDamage) {
         player.displayClientMessage(Component.translatable("text.apocalypsenow.this_is_empty_9226cfb0"), true);
         return;
      }
      if (player.getFoodData().getFoodLevel() >= 20) {
         player.displayClientMessage(Component.translatable(FULL_MESSAGES[player.getRandom().nextInt(FULL_MESSAGES.length)]), true);
         return;
      }

      itemstack.setDamageValue(itemstack.getDamageValue() + 1);
      int food = Math.min(20, player.getFoodData().getFoodLevel() + 3);
      player.getFoodData().setFoodLevel(food);
      player.getFoodData().setSaturation(Math.min(food, player.getFoodData().getSaturationLevel() + 0.3F));
      player.getCooldowns().addCooldown(itemstack.getItem(), cooldown);
      level.playSound(null, player.blockPosition(), SoundEvents.GENERIC_DRINK, SoundSource.PLAYERS, 0.5F, 0.9F);
   }
}

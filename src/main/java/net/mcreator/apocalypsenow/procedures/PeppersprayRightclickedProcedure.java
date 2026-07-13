package net.mcreator.apocalypsenow.procedures;

import net.mcreator.apocalypsenow.entity.SpraypeppergasEntity;
import net.mcreator.apocalypsenow.init.ApocalypsenowModEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.registries.ForgeRegistries;

public class PeppersprayRightclickedProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack, InteractionHand hand) {
      if (!(world instanceof ServerLevel level) || !(entity instanceof Player player) || itemstack.isEmpty()
         || player.getCooldowns().isOnCooldown(itemstack.getItem())) return;
      SpraypeppergasEntity spray = new SpraypeppergasEntity(ApocalypsenowModEntities.SPRAYPEPPERGAS.get(), level);
      spray.setBaseDamage(0.0);
      spray.setKnockback(0);
      spray.setSilent(true);
      spray.setPos(player.getX(), player.getEyeY() - 0.1, player.getZ());
      spray.shoot(player.getLookAngle().x, player.getLookAngle().y, player.getLookAngle().z, 0.5F, 0.0F);
      level.addFreshEntity(spray);
      level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("apocalypsenow:pepperspray")), SoundSource.PLAYERS, 0.5F, 1.0F);
      itemstack.hurtAndBreak(1, player, owner -> owner.broadcastBreakEvent(hand));
      player.getCooldowns().addCooldown(itemstack.getItem(), 5);
   }
}

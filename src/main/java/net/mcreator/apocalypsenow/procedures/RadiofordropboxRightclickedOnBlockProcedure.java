package net.mcreator.apocalypsenow.procedures;

import net.mcreator.apocalypsenow.init.ApocalypsenowModEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.registries.ForgeRegistries;

public class RadiofordropboxRightclickedOnBlockProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
      if (!(world instanceof ServerLevel level) || !(entity instanceof Player player) || itemstack.isEmpty()) return;
      BlockPos position = BlockPos.containing(x, y, z);
      if (!world.canSeeSkyFromBelowWater(position)) {
         player.displayClientMessage(Component.translatable("text.apocalypsenow.go_to_an_open_filed_07fed25d"), true);
         return;
      }
      EntityType<?> type = level.random.nextBoolean() ? ApocalypsenowModEntities.DROPBOX.get() : ApocalypsenowModEntities.MEDICALDROPBOX.get();
      Entity drop = type.spawn(level, BlockPos.containing(x + level.random.nextDouble(), y + 500.0, z + level.random.nextDouble()), MobSpawnType.MOB_SUMMONED);
      if (drop != null) drop.setYRot(level.random.nextFloat() * 360.0F);
      level.playSound(null, position, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("apocalypsenow:blipblip")), SoundSource.NEUTRAL, 1.0F, 1.0F);
      player.displayClientMessage(Component.translatable("text.apocalypsenow.drop_box_incoming_26fe091a"), true);
      itemstack.shrink(1);
   }
}

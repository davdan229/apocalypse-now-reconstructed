package net.mcreator.apocalypsenow.procedures;

import net.mcreator.apocalypsenow.init.ApocalypsenowModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.registries.ForgeRegistries;

public class BeartrapEntityWalksOnTheBlockProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z, net.minecraft.world.entity.Entity entity) {
      if (!(world instanceof Level level) || level.isClientSide || !(entity instanceof LivingEntity)) {
         return;
      }
      if (entity instanceof Player player && (player.isCreative() || player.isSpectator())) {
         return;
      }
      BlockPos pos = BlockPos.containing(x, y, z);
      if (!level.getBlockState(pos).is(ApocalypsenowModBlocks.BEAR_TRAP.get())) {
         return;
      }
      var facing = level.getBlockState(pos).getValue(net.minecraft.world.level.block.HorizontalDirectionalBlock.FACING);
      level.setBlock(
         pos,
         ApocalypsenowModBlocks.BEARTRAPACTIVATED.get().defaultBlockState().setValue(net.minecraft.world.level.block.HorizontalDirectionalBlock.FACING, facing),
         3
      );
      level.playSound(
               (Player)null,
               pos,
               ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("apocalypsenow:beartrap")),
               SoundSource.NEUTRAL,
               1.0F,
               1.0F
            );
      BeartrapactivatedEntityWalksOnTheBlockProcedure.execute(level, x, y, z, entity);
   }
}

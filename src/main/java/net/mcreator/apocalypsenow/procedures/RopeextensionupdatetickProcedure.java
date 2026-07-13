package net.mcreator.apocalypsenow.procedures;

import net.mcreator.apocalypsenow.init.ApocalypsenowModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.ForgeRegistries;

public class RopeextensionupdatetickProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z) {
      if (world.getBlockState(BlockPos.containing(x, y - 1.0, z)).getBlock() == Blocks.AIR) {
         world.setBlock(BlockPos.containing(x, y - 1.0, z), ApocalypsenowModBlocks.ROPEEXTENSION.get().defaultBlockState(), 3);
         if (world instanceof Level _level) {
            if (!_level.isClientSide()) {
               _level.playSound(
                  (Player)null,
                  BlockPos.containing(x, y, z),
                  ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wool.place")),
                  SoundSource.NEUTRAL,
                  1.0F,
                  1.0F
               );
            } else {
               _level.playLocalSound(
                  x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wool.place")), SoundSource.NEUTRAL, 1.0F, 1.0F, false
               );
            }
         }
      }

      if (world.getBlockState(BlockPos.containing(x, y + 1.0, z)).getBlock() == Blocks.AIR) {
         world.destroyBlock(BlockPos.containing(x, y, z), false);
      }
   }
}

package net.mcreator.apocalypsenow.procedures;

import net.mcreator.apocalypsenow.init.ApocalypsenowModBlocks;
import net.mcreator.apocalypsenow.init.ApocalypsenowModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.ForgeRegistries;

public class TestProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
      if (entity != null) {
         if (world.getBlockState(BlockPos.containing(x, y - 1.0, z)).getBlock() == Blocks.AIR) {
            world.setBlock(BlockPos.containing(x, y - 1.0, z), ApocalypsenowModBlocks.CLIMBINGROPEHOOK.get().defaultBlockState(), 3);
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
         } else if (world.getBlockState(BlockPos.containing(x - 1.0, y, z)).getBlock() == Blocks.AIR && entity.getDirection() == Direction.WEST) {
            world.setBlock(BlockPos.containing(x + 1.0, y, z), ApocalypsenowModBlocks.CLIMBINGROPEHOOK.get().defaultBlockState(), 3);
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
         } else if (world.getBlockState(BlockPos.containing(x + 1.0, y, z)).getBlock() == Blocks.AIR && entity.getDirection() == Direction.WEST) {
            world.setBlock(BlockPos.containing(x + 1.0, y, z), ApocalypsenowModBlocks.CLIMBINGROPEHOOK.get().defaultBlockState(), 3);
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
         } else if (world.getBlockState(BlockPos.containing(x + 1.0, y, z)).getBlock() == Blocks.AIR && entity.getDirection() == Direction.EAST) {
            world.setBlock(BlockPos.containing(x - 1.0, y, z), ApocalypsenowModBlocks.CLIMBINGROPEHOOK.get().defaultBlockState(), 3);
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
         } else if (world.getBlockState(BlockPos.containing(x - 1.0, y, z)).getBlock() == Blocks.AIR && entity.getDirection() == Direction.EAST) {
            world.setBlock(BlockPos.containing(x - 1.0, y, z), ApocalypsenowModBlocks.CLIMBINGROPEHOOK.get().defaultBlockState(), 3);
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
         } else if (world.getBlockState(BlockPos.containing(x, y, z - 1.0)).getBlock() == Blocks.AIR && entity.getDirection() == Direction.NORTH) {
            world.setBlock(BlockPos.containing(x, y, z + 1.0), ApocalypsenowModBlocks.CLIMBINGROPEHOOK.get().defaultBlockState(), 3);
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
         } else if (world.getBlockState(BlockPos.containing(x, y, z + 1.0)).getBlock() == Blocks.AIR && entity.getDirection() == Direction.NORTH) {
            world.setBlock(BlockPos.containing(x, y, z + 1.0), ApocalypsenowModBlocks.CLIMBINGROPEHOOK.get().defaultBlockState(), 3);
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
         } else if (world.getBlockState(BlockPos.containing(x, y, z + 1.0)).getBlock() == Blocks.AIR && entity.getDirection() == Direction.SOUTH) {
            world.setBlock(BlockPos.containing(x, y, z - 1.0), ApocalypsenowModBlocks.CLIMBINGROPEHOOK.get().defaultBlockState(), 3);
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
         } else if (world.getBlockState(BlockPos.containing(x, y, z - 1.0)).getBlock() == Blocks.AIR && entity.getDirection() == Direction.SOUTH) {
            world.setBlock(BlockPos.containing(x, y, z - 1.0), ApocalypsenowModBlocks.CLIMBINGROPEHOOK.get().defaultBlockState(), 3);
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
         } else {
            if (world instanceof ServerLevel _level) {
               ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ApocalypsenowModItems.CLIMBINGROPEWITHHOOK.get()));
               entityToSpawn.setPickUpDelay(10);
               _level.addFreshEntity(entityToSpawn);
            }

            if (world instanceof Level _level) {
               if (!_level.isClientSide()) {
                  _level.playSound(
                     (Player)null,
                     BlockPos.containing(x, y, z),
                     ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.item.break")),
                     SoundSource.NEUTRAL,
                     1.0F,
                     1.0F
                  );
               } else {
                  _level.playLocalSound(
                     x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.item.break")), SoundSource.NEUTRAL, 1.0F, 1.0F, false
                  );
               }
            }
         }
      }
   }
}

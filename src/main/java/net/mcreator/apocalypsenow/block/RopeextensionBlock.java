package net.mcreator.apocalypsenow.block;

import net.mcreator.apocalypsenow.init.ApocalypsenowModBlocks;
import net.mcreator.apocalypsenow.procedures.RopeextensionupdatetickProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.phys.HitResult;

public class RopeextensionBlock extends IronBarsBlock {
   public RopeextensionBlock() {
      super(Properties.of().ignitedByLava().sound(SoundType.WOOL).strength(1.0F, 4.0F).friction(0.7F).speedFactor(1.1F).jumpFactor(0.9F));
   }

   @Override
   public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
      return 0;
   }

   @Override
   public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
      return 10;
   }

   @Override
   public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
      return 1;
   }

   @Override
   public ItemStack getCloneItemStack(BlockState state, HitResult target, BlockGetter world, BlockPos pos, Player player) {
      return new ItemStack(ApocalypsenowModBlocks.ROPE.get());
   }

   @Override
   public boolean isLadder(BlockState state, LevelReader world, BlockPos pos, LivingEntity entity) {
      return true;
   }

   @Override
   public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
      super.onPlace(blockstate, world, pos, oldState, moving);
      world.scheduleTick(pos, this, 10);
   }

   @Override
   public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
      super.tick(blockstate, world, pos, random);
      int x = pos.getX();
      int y = pos.getY();
      int z = pos.getZ();
      RopeextensionupdatetickProcedure.execute(world, x, y, z);
      world.scheduleTick(pos, this, 10);
   }
}

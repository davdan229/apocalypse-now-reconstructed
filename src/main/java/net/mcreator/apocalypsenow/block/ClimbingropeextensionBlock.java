package net.mcreator.apocalypsenow.block;

import net.mcreator.apocalypsenow.procedures.ClimbingropeextensionupdatetickProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class ClimbingropeextensionBlock extends IronBarsBlock {
   public ClimbingropeextensionBlock() {
      super(Properties.of().ignitedByLava().sound(SoundType.WOOL).strength(1.6F, 5.0F));
   }

   @Override
   public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
      return 0;
   }

   @Override
   public boolean isLadder(BlockState state, LevelReader world, BlockPos pos, LivingEntity entity) {
      return true;
   }

   @Override
   public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
      super.onPlace(blockstate, world, pos, oldState, moving);
      world.scheduleTick(pos, this, 8);
   }

   @Override
   public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
      super.tick(blockstate, world, pos, random);
      int x = pos.getX();
      int y = pos.getY();
      int z = pos.getZ();
      ClimbingropeextensionupdatetickProcedure.execute(world, x, y, z);
      world.scheduleTick(pos, this, 8);
   }
}

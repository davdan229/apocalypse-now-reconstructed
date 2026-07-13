package net.mcreator.apocalypsenow.block;

import net.mcreator.apocalypsenow.procedures.DropboxcommonOnBlockRightClickedProcedure;
import net.mcreator.apocalypsenow.procedures.DropboxcommonOnTickUpdateProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.phys.BlockHitResult;

public class MedicalairdropboxBlock extends FallingBlock {
   public MedicalairdropboxBlock() {
      super(Properties.of().sound(SoundType.METAL).strength(1.0F).requiresCorrectToolForDrops());
   }

   @Override
   public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
      return 15;
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
      DropboxcommonOnTickUpdateProcedure.execute(world, x, y, z);
      world.scheduleTick(pos, this, 10);
   }

   @Override
   public InteractionResult use(BlockState blockstate, Level world, BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
      super.use(blockstate, world, pos, entity, hand, hit);
      int x = pos.getX();
      int y = pos.getY();
      int z = pos.getZ();
      double hitX = hit.getLocation().x;
      double hitY = hit.getLocation().y;
      double hitZ = hit.getLocation().z;
      Direction direction = hit.getDirection();
      DropboxcommonOnBlockRightClickedProcedure.execute(entity);
      return InteractionResult.SUCCESS;
   }
}

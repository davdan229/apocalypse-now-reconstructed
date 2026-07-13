package net.mcreator.apocalypsenow.procedures;

import com.google.common.collect.UnmodifiableIterator;
import java.util.Map.Entry;
import net.mcreator.apocalypsenow.init.ApocalypsenowModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Property;

public class LeavesTrapEntityWalksOnTheBlockProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z) {
      if (world.isClientSide()) {
         return;
      }
      BlockPos _bp = BlockPos.containing(x, y, z);
      BlockState _bs = Blocks.AIR.defaultBlockState();
      BlockState _bso = world.getBlockState(_bp);
      UnmodifiableIterator var10 = _bso.getValues().entrySet().iterator();

      while (var10.hasNext()) {
         Entry<Property<?>, Comparable<?>> entry = (Entry<Property<?>, Comparable<?>>)var10.next();
         Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
         if (_property != null && _bs.getValue(_property) != null) {
            try {
               _bs = _bs.setValue(_property, (Comparable)entry.getValue());
            } catch (Exception var14) {
            }
         }
      }

      world.setBlock(_bp, _bs, 3);
      world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(ApocalypsenowModBlocks.LEAVES_TRAP.get().defaultBlockState()));
   }
}

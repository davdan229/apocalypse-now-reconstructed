package net.mcreator.apocalypsenow.procedures;

import net.mcreator.apocalypsenow.init.ApocalypsenowModItems;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.items.ItemHandlerHelper;

public class BandageddEffectExpiresProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         if (entity instanceof Player _player) {
            ItemStack _setstack = new ItemStack(ApocalypsenowModItems.BLOODYRAGS.get()).copy();
            _setstack.setCount(1);
            ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
         }
      }
   }
}

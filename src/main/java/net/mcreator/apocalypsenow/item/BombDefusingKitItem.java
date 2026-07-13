package net.mcreator.apocalypsenow.item;

import net.mcreator.apocalypsenow.procedures.BombDefusingKitRightclickedOnBlockProcedure;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.context.UseOnContext;

public class BombDefusingKitItem extends Item {
   public BombDefusingKitItem() {
      super(new Properties().durability(16).rarity(Rarity.COMMON));
   }

   @Override
   public InteractionResult useOn(UseOnContext context) {
      super.useOn(context);
      boolean handled = BombDefusingKitRightclickedOnBlockProcedure.execute(
         context.getLevel(),
         context.getClickedPos().getX(),
         context.getClickedPos().getY(),
         context.getClickedPos().getZ(),
         context.getPlayer(),
         context.getItemInHand(),
         context.getHand()
      );
      return handled ? InteractionResult.sidedSuccess(context.getLevel().isClientSide()) : InteractionResult.PASS;
   }
}

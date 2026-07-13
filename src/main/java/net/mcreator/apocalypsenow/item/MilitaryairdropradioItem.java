package net.mcreator.apocalypsenow.item;

import net.mcreator.apocalypsenow.procedures.MilitaryairdropradioclickProcedure;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class MilitaryairdropradioItem extends Item {
   public MilitaryairdropradioItem() {
      super(new Properties().stacksTo(1).rarity(Rarity.COMMON));
   }

   @OnlyIn(Dist.CLIENT)
   @Override
   public boolean isFoil(ItemStack itemstack) {
      return true;
   }

   @Override
   public InteractionResult useOn(UseOnContext context) {
      super.useOn(context);
      MilitaryairdropradioclickProcedure.execute(
         context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer(), context.getItemInHand()
      );
      return InteractionResult.sidedSuccess(context.getLevel().isClientSide());
   }
}

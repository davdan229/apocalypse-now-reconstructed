package net.mcreator.apocalypsenow.item;

import java.util.List;
import net.mcreator.apocalypsenow.procedures.MilitaryRadioRightclickedOnBlockProcedure;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;

public class MilitaryRadioItem extends Item {
   public MilitaryRadioItem() {
      super(new Properties().stacksTo(1).rarity(Rarity.COMMON));
   }

   @Override
   public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
      super.appendHoverText(itemstack, level, list, flag);
      list.add(Component.translatable("text.apocalypsenow.click_on_the_military_communications_rad_d0278950"));
   }

   @Override
   public InteractionResult useOn(UseOnContext context) {
      super.useOn(context);
      MilitaryRadioRightclickedOnBlockProcedure.execute(
         context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer(), context.getItemInHand()
      );
      return InteractionResult.sidedSuccess(context.getLevel().isClientSide());
   }
}

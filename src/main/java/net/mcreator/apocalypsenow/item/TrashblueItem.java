package net.mcreator.apocalypsenow.item;

import java.util.List;
import net.mcreator.apocalypsenow.procedures.BluetrashcanrightclickProcedure;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;

public class TrashblueItem extends Item {
   public TrashblueItem() {
      super(new Properties().stacksTo(64).rarity(Rarity.COMMON));
   }

   @Override
   public UseAnim getUseAnimation(ItemStack itemstack) {
      return UseAnim.EAT;
   }

   @Override
   public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
      super.appendHoverText(itemstack, level, list, flag);
      list.add(Component.translatable("text.apocalypsenow.shift_right_click_on_any_trash_can_to_cl_12893061"));
   }

   @Override
   public InteractionResult useOn(UseOnContext context) {
      super.useOn(context);
      BluetrashcanrightclickProcedure.execute(
         context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer(), context.getItemInHand()
      );
      return InteractionResult.sidedSuccess(context.getLevel().isClientSide());
   }
}

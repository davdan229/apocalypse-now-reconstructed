package net.mcreator.apocalypsenow.item;

import java.util.List;
import net.mcreator.apocalypsenow.procedures.FurnitureWrenchRightclickedOnBlockProcedure;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;

public class FurnitureWrenchItem extends Item {
   public FurnitureWrenchItem() {
      super(new Properties().stacksTo(1).rarity(Rarity.UNCOMMON));
   }

   @Override
   public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
      super.appendHoverText(itemstack, level, list, flag);
      list.add(Component.translatable("text.apocalypsenow.click_to_switch_between_variations_of_ap_760eddc0"));
   }

   @Override
   public InteractionResult useOn(UseOnContext context) {
      super.useOn(context);
      FurnitureWrenchRightclickedOnBlockProcedure.execute(
         context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer()
      );
      return InteractionResult.SUCCESS;
   }
}

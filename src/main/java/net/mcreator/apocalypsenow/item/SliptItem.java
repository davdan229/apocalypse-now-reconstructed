package net.mcreator.apocalypsenow.item;

import java.util.List;
import net.mcreator.apocalypsenow.procedures.SliptRightClickedInAirProcedure;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.level.Level;

public class SliptItem extends Item {
   public SliptItem() {
      super(new Properties().stacksTo(16).rarity(Rarity.UNCOMMON));
   }

   @Override
   public UseAnim getUseAnimation(ItemStack itemstack) {
      return UseAnim.EAT;
   }

   @Override
   public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
      super.appendHoverText(itemstack, level, list, flag);
      list.add(Component.translatable("text.apocalypsenow.use_to_fix_a_broken_leg_772f4a8e"));
   }

   @Override
   public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
      InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
      SliptRightClickedInAirProcedure.execute(entity, ar.getObject());
      return InteractionResultHolder.sidedSuccess(ar.getObject(), world.isClientSide());
   }
}

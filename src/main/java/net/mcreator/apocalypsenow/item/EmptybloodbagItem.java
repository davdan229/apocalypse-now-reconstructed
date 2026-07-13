package net.mcreator.apocalypsenow.item;

import java.util.List;
import net.mcreator.apocalypsenow.procedures.EmptybloodbagRightclickedProcedure;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.level.Level;

public class EmptybloodbagItem extends Item {
   public EmptybloodbagItem() {
      super(new Properties().stacksTo(64).rarity(Rarity.COMMON));
   }

   @Override
   public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
      super.appendHoverText(itemstack, level, list, flag);
      list.add(Component.translatable("text.apocalypsenow.use_it_to_take_your_blood_out_f2f69b94"));
   }

   @Override
   public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
      ItemStack itemstack = entity.getItemInHand(hand);
      EmptybloodbagRightclickedProcedure.execute(world, entity, itemstack, hand);
      return InteractionResultHolder.sidedSuccess(entity.getItemInHand(hand), world.isClientSide());
   }
}

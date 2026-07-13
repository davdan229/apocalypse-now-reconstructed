package net.mcreator.apocalypsenow.item;

import net.mcreator.apocalypsenow.procedures.BottleRightClickedOnBlockProcedure;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;

public class BottleItem extends Item {
   public BottleItem() {
      super(new Properties().stacksTo(64).rarity(Rarity.COMMON));
   }

   @Override
   public UseAnim getUseAnimation(ItemStack itemstack) {
      return UseAnim.EAT;
   }

   @Override
   public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
      ItemStack stack = entity.getItemInHand(hand);
      boolean filled = BottleRightClickedOnBlockProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity, hand, stack);
      return filled ? InteractionResultHolder.sidedSuccess(entity.getItemInHand(hand), world.isClientSide()) : InteractionResultHolder.pass(stack);
   }

   @Override
   public InteractionResult useOn(UseOnContext context) {
      boolean filled = BottleRightClickedOnBlockProcedure.execute(
         context.getLevel(),
         context.getClickedPos().getX(),
         context.getClickedPos().getY(),
         context.getClickedPos().getZ(),
         context.getPlayer(),
         context.getHand(),
         context.getItemInHand()
      );
      return filled ? InteractionResult.sidedSuccess(context.getLevel().isClientSide()) : InteractionResult.PASS;
   }
}

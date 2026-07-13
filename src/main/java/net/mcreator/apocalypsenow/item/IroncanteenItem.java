package net.mcreator.apocalypsenow.item;

import net.mcreator.apocalypsenow.procedures.FullcanteenProcedure;
import net.mcreator.apocalypsenow.procedures.IroncanteencraftProcedure;
import net.mcreator.apocalypsenow.procedures.IroncanteenrightclickProcedure;
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
import net.minecraft.world.level.block.state.BlockState;

public class IroncanteenItem extends Item {
   public IroncanteenItem() {
      super(new Properties().durability(10).rarity(Rarity.COMMON));
   }

   @Override
   public UseAnim getUseAnimation(ItemStack itemstack) {
      return UseAnim.DRINK;
   }

   @Override
   public int getUseDuration(ItemStack itemstack) {
      return 20;
   }

   @Override
   public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
      return 0.0F;
   }

   @Override
   public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
      ItemStack stack = entity.getItemInHand(hand);
      IroncanteenrightclickProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity, stack);
      return InteractionResultHolder.sidedSuccess(stack, world.isClientSide());
   }

   @Override
   public InteractionResult useOn(UseOnContext context) {
      FullcanteenProcedure.execute(
         context.getLevel(),
         context.getClickedPos().getX(),
         context.getClickedPos().getY(),
         context.getClickedPos().getZ(),
         context.getPlayer(),
         context.getItemInHand()
      );
      return InteractionResult.sidedSuccess(context.getLevel().isClientSide());
   }

   @Override
   public void onCraftedBy(ItemStack itemstack, Level world, Player entity) {
      super.onCraftedBy(itemstack, world, entity);
      IroncanteencraftProcedure.execute(itemstack);
   }
}

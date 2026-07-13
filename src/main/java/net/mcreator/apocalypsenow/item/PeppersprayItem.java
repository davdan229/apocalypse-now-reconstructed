package net.mcreator.apocalypsenow.item;

import net.mcreator.apocalypsenow.procedures.PeppersprayRightclickedProcedure;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.level.Level;

public class PeppersprayItem extends Item {
   public PeppersprayItem() {
      super(new Properties().durability(1000).rarity(Rarity.COMMON));
   }

   @Override
   public UseAnim getUseAnimation(ItemStack itemstack) {
      return UseAnim.BOW;
   }

   @Override
   public int getUseDuration(ItemStack itemstack) {
      return 72000;
   }

   @Override
   public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
      InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
      PeppersprayRightclickedProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity, ar.getObject(), hand);
      return InteractionResultHolder.sidedSuccess(ar.getObject(), world.isClientSide());
   }
}

package net.mcreator.apocalypsenow.item;

import net.minecraft.world.item.BoneMealItem;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Items;

public class FertilizerItem extends Item {
   public FertilizerItem() {
      super(new Properties().durability(40).rarity(Rarity.COMMON));
   }

   @Override
   public UseAnim getUseAnimation(ItemStack itemstack) {
      return UseAnim.EAT;
   }

   @Override
   public boolean hasCraftingRemainingItem() {
      return true;
   }

   @Override
   public ItemStack getCraftingRemainingItem(ItemStack itemstack) {
      ItemStack retval = new ItemStack(this);
      retval.setDamageValue(itemstack.getDamageValue() + 1);
      return retval.getDamageValue() >= retval.getMaxDamage() ? ItemStack.EMPTY : retval;
   }

   @Override
   public boolean isRepairable(ItemStack itemstack) {
      return false;
   }

   @Override
   public InteractionResult useOn(UseOnContext context) {
      if (context.getLevel().isClientSide()) {
         return InteractionResult.SUCCESS;
      }
      ItemStack boneMeal = new ItemStack(Items.BONE_MEAL);
      if (!BoneMealItem.growCrop(boneMeal, context.getLevel(), context.getClickedPos())
         && !BoneMealItem.growWaterPlant(boneMeal, context.getLevel(), context.getClickedPos(), context.getClickedFace())) {
         return InteractionResult.PASS;
      }
      context.getLevel().levelEvent(2005, context.getClickedPos(), 0);
      if (context.getPlayer() != null) {
         context.getItemInHand().hurtAndBreak(1, context.getPlayer(), player -> player.broadcastBreakEvent(context.getHand()));
      }
      return InteractionResult.CONSUME;
   }
}

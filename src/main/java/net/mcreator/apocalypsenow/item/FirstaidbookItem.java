package net.mcreator.apocalypsenow.item;

import net.mcreator.apocalypsenow.procedures.FirstaidbookRightClickedInAirProcedure;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.level.Level;

public class FirstaidbookItem extends Item {
   public FirstaidbookItem() {
      super(new Properties().stacksTo(1).rarity(Rarity.COMMON));
   }

   @Override
   public UseAnim getUseAnimation(ItemStack itemstack) {
      return UseAnim.EAT;
   }

   @Override
   public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
      InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
      FirstaidbookRightClickedInAirProcedure.execute(entity, ar.getObject());
      return InteractionResultHolder.sidedSuccess(ar.getObject(), world.isClientSide());
   }
}

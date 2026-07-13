package net.mcreator.apocalypsenow.item;

import net.mcreator.apocalypsenow.init.ApocalypsenowModItems;
import net.mcreator.apocalypsenow.procedures.BeerFoodEatenProcedure;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties.Builder;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

public class WineItem extends Item {
   public WineItem() {
      super(new Properties().stacksTo(64).rarity(Rarity.UNCOMMON).food(new Builder().nutrition(3).saturationMod(0.2F).build()));
   }

   @Override
   public UseAnim getUseAnimation(ItemStack itemstack) {
      return UseAnim.DRINK;
   }

   @Override
   public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
      return 0.0F;
   }

   @Override
   public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
      ItemStack retval = new ItemStack(ApocalypsenowModItems.GLASSBOTTLE.get());
      super.finishUsingItem(itemstack, world, entity);
      double x = entity.getX();
      double y = entity.getY();
      double z = entity.getZ();
      BeerFoodEatenProcedure.execute(entity);
      if (itemstack.isEmpty()) {
         return retval;
      }

      if (entity instanceof Player player && !player.getAbilities().instabuild && !player.getInventory().add(retval)) {
         player.drop(retval, false);
      }

      return itemstack;
   }
}

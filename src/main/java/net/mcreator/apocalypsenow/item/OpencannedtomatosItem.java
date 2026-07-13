package net.mcreator.apocalypsenow.item;

import net.mcreator.apocalypsenow.init.ApocalypsenowModItems;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties.Builder;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

public class OpencannedtomatosItem extends Item {
   public OpencannedtomatosItem() {
      super(new Properties().stacksTo(64).rarity(Rarity.COMMON).food(new Builder().nutrition(6).saturationMod(0.4F).build()));
   }

   @Override
   public int getUseDuration(ItemStack itemstack) {
      return 25;
   }

   @Override
   public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
      return 0.0F;
   }

   @Override
   public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
      ItemStack retval = new ItemStack(ApocalypsenowModItems.CAN.get());
      super.finishUsingItem(itemstack, world, entity);
      if (itemstack.isEmpty()) {
         return retval;
      }

      if (entity instanceof Player player && !player.getAbilities().instabuild && !player.getInventory().add(retval)) {
         player.drop(retval, false);
      }

      return itemstack;
   }
}

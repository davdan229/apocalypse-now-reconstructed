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

public class OpencannedrabbitsoupItem extends Item {
   public OpencannedrabbitsoupItem() {
      super(new Properties().stacksTo(64).rarity(Rarity.COMMON).food(new Builder().nutrition(14).saturationMod(1.5F).meat().build()));
   }

   @Override
   public int getUseDuration(ItemStack itemstack) {
      return 40;
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

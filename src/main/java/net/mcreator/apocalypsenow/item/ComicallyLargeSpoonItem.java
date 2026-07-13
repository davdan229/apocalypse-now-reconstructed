package net.mcreator.apocalypsenow.item;

import java.util.List;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;

public class ComicallyLargeSpoonItem extends PickaxeItem {
   public ComicallyLargeSpoonItem() {
      super(new Tier() {
         @Override
         public int getUses() {
            return 3000;
         }

         @Override
         public float getSpeed() {
            return 10.0F;
         }

         @Override
         public float getAttackDamageBonus() {
            return 998.0F;
         }

         @Override
         public int getLevel() {
            return 10;
         }

         @Override
         public int getEnchantmentValue() {
            return 9;
         }

         @Override
         public Ingredient getRepairIngredient() {
            return Ingredient.of(new ItemStack(Blocks.GOLD_BLOCK));
         }
      }, 1, -3.1F, new Properties());
   }

   @Override
   public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
      super.appendHoverText(itemstack, level, list, flag);
      list.add(Component.translatable("text.apocalypsenow.creative_item_only_7f72478e"));
   }
}

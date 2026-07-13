package net.mcreator.apocalypsenow.item;

import java.util.List;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.level.Level;

public class MorphinepotItem extends Item {
   public MorphinepotItem() {
      super(new Properties().stacksTo(64).rarity(Rarity.COMMON));
   }

   @Override
   public UseAnim getUseAnimation(ItemStack itemstack) {
      return UseAnim.EAT;
   }

   @Override
   public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
      super.appendHoverText(itemstack, level, list, flag);
      list.add(Component.translatable("text.apocalypsenow.use_with_a_syringe_ba4365d0"));
   }
}

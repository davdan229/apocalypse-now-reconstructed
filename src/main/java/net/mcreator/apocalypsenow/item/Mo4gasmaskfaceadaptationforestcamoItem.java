package net.mcreator.apocalypsenow.item;

import java.util.List;
import net.mcreator.apocalypsenow.procedures.GasmaskHelmetTickEventProcedure;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.level.Level;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

public class Mo4gasmaskfaceadaptationforestcamoItem extends Item implements ICurioItem {
   public Mo4gasmaskfaceadaptationforestcamoItem() {
      super(new Properties().stacksTo(1).rarity(Rarity.COMMON));
   }

   @Override
   public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
      super.appendHoverText(itemstack, level, list, flag);
      list.add(Component.translatable("text.apocalypsenow.face_adaptation_55b2c79c"));
   }

   public void curioTick(SlotContext slotContext, ItemStack stack) {
      GasmaskHelmetTickEventProcedure.execute(slotContext.entity());
   }
}

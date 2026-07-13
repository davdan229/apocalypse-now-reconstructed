package net.mcreator.apocalypsenow.item;

import net.mcreator.apocalypsenow.procedures.Ps31nvgWhileBaubleIsEquippedTickProcedure;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item.Properties;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

public class Ps31nvgItem extends Item implements ICurioItem {
   public Ps31nvgItem() {
      super(new Properties().stacksTo(1).rarity(Rarity.COMMON));
   }

   public void curioTick(SlotContext slotContext, ItemStack stack) {
      Ps31nvgWhileBaubleIsEquippedTickProcedure.execute(slotContext.entity());
   }
}

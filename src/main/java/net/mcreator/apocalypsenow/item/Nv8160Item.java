package net.mcreator.apocalypsenow.item;

import net.mcreator.apocalypsenow.procedures.Nv8160WhileBaubleIsEquippedTickProcedure;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item.Properties;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

public class Nv8160Item extends Item implements ICurioItem {
   public Nv8160Item() {
      super(new Properties().stacksTo(1).rarity(Rarity.COMMON));
   }

   public void curioTick(SlotContext slotContext, ItemStack stack) {
      Nv8160WhileBaubleIsEquippedTickProcedure.execute(slotContext.entity());
   }
}

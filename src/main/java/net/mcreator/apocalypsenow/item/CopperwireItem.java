package net.mcreator.apocalypsenow.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item.Properties;

public class CopperwireItem extends Item {
   public CopperwireItem() {
      super(new Properties().stacksTo(64).rarity(Rarity.COMMON));
   }
}

package net.mcreator.apocalypsenow.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item.Properties;

public class BadgeItem extends Item {
   public BadgeItem() {
      super(new Properties().stacksTo(64).rarity(Rarity.COMMON));
   }
}

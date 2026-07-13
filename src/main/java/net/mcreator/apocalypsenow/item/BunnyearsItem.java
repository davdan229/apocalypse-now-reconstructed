package net.mcreator.apocalypsenow.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item.Properties;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

public class BunnyearsItem extends Item implements ICurioItem {
   public BunnyearsItem() {
      super(new Properties().stacksTo(1).rarity(Rarity.COMMON));
   }
}

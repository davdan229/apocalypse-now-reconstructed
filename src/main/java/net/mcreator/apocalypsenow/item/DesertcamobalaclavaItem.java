package net.mcreator.apocalypsenow.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item.Properties;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

public class DesertcamobalaclavaItem extends Item implements ICurioItem {
   public DesertcamobalaclavaItem() {
      super(new Properties().stacksTo(1).rarity(Rarity.COMMON));
   }
}

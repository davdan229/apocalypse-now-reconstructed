package net.mcreator.apocalypsenow.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item.Properties;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

public class RedbandanaItem extends Item implements ICurioItem {
   public RedbandanaItem() {
      super(new Properties().stacksTo(1).rarity(Rarity.COMMON));
   }
}

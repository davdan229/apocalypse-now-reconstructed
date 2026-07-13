package net.mcreator.apocalypsenow.init;

import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class ApocalypsenowModFuels {
   @SubscribeEvent
   public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
      ItemStack itemstack = event.getItemStack();
      if (itemstack.getItem() == ApocalypsenowModItems.MONEY.get()) {
         event.setBurnTime(1600);
      } else if (itemstack.getItem() == ApocalypsenowModBlocks.MONEY_BLOCK.get().asItem()) {
         event.setBurnTime(300);
      } else if (itemstack.getItem() == ApocalypsenowModItems.TOILETPAPER.get()) {
         event.setBurnTime(400);
      } else if (itemstack.getItem() == ApocalypsenowModItems.FILES.get()) {
         event.setBurnTime(100);
      } else if (itemstack.getItem() == ApocalypsenowModBlocks.HIGHVALUEMONEYBLOCK.get().asItem()) {
         event.setBurnTime(600);
      }
   }
}

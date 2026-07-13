package net.mcreator.apocalypsenow.init;

import java.util.List;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.BasicItemListing;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.event.village.WandererTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@EventBusSubscriber(bus = Bus.FORGE)
public class ApocalypsenowModTrades {
   @SubscribeEvent
   public static void registerWanderingTrades(WandererTradesEvent event) {
      event.getGenericTrades()
         .add(new BasicItemListing(new ItemStack(ApocalypsenowModItems.WINE.get()), new ItemStack(ApocalypsenowModItems.CANNED_FOOD.get()), 10, 5, 0.05F));
      event.getGenericTrades()
         .add(
            new BasicItemListing(
               new ItemStack(ApocalypsenowModItems.CANNED_SOUP.get()), new ItemStack(ApocalypsenowModItems.WOODEN_FIRE_AXE.get()), 10, 5, 0.05F
            )
         );
      event.getGenericTrades()
         .add(new BasicItemListing(new ItemStack(ApocalypsenowModItems.VODKA.get()), new ItemStack(ApocalypsenowModItems.DONUT.get()), 10, 5, 0.05F));
      event.getGenericTrades()
         .add(new BasicItemListing(new ItemStack(ApocalypsenowModItems.VITAMINS.get(), 16), new ItemStack(ApocalypsenowModItems.SHURIKEN.get()), 10, 5, 0.05F));
      event.getGenericTrades()
         .add(new BasicItemListing(new ItemStack(ApocalypsenowModItems.MAGAZINE.get()), new ItemStack(ApocalypsenowModItems.BOTTLE.get()), 10, 5, 0.05F));
      event.getGenericTrades()
         .add(new BasicItemListing(new ItemStack(ApocalypsenowModItems.WHISKY.get()), new ItemStack(ApocalypsenowModItems.MOSQUITO_KNIFE.get()), 10, 5, 0.05F));
      event.getGenericTrades()
         .add(
            new BasicItemListing(new ItemStack(ApocalypsenowModItems.TOILETPAPER.get()), new ItemStack(ApocalypsenowModItems.CANNED_CARROT.get()), 10, 5, 0.05F)
         );
      event.getGenericTrades()
         .add(
            new BasicItemListing(new ItemStack(ApocalypsenowModItems.CIGARETTES.get()), new ItemStack(ApocalypsenowModItems.CANNED_CHILI.get()), 10, 5, 0.05F)
         );
      event.getGenericTrades()
         .add(
            new BasicItemListing(new ItemStack(ApocalypsenowModItems.TOOTHPASTE.get()), new ItemStack(ApocalypsenowModItems.BASEBALL_BAT.get()), 10, 5, 0.05F)
         );
      event.getGenericTrades()
         .add(
            new BasicItemListing(
               new ItemStack(ApocalypsenowModItems.TOOTHBRUSH.get()),
               new ItemStack(ApocalypsenowModItems.NEWSPAPER.get(), 2),
               new ItemStack(ApocalypsenowModItems.SUTUREKIT.get()),
               10,
               5,
               0.05F
            )
         );
      event.getGenericTrades()
         .add(
            new BasicItemListing(
               new ItemStack(ApocalypsenowModItems.SULFURICACID.get(), 3), new ItemStack(ApocalypsenowModItems.ADRENALINE_SYRINGE.get()), 10, 5, 0.05F
            )
         );
      event.getGenericTrades()
         .add(
            new BasicItemListing(
               new ItemStack(ApocalypsenowModItems.WINE.get(), 2),
               new ItemStack(ApocalypsenowModItems.GOLDENWATCH.get()),
               new ItemStack(ApocalypsenowModItems.BUTTER.get()),
               10,
               5,
               0.05F
            )
         );
      event.getGenericTrades()
         .add(new BasicItemListing(new ItemStack(ApocalypsenowModItems.BROKEN_RADIO.get()), new ItemStack(ApocalypsenowModItems.CEREAL.get()), 10, 5, 0.05F));
      event.getGenericTrades()
         .add(new BasicItemListing(new ItemStack(ApocalypsenowModItems.CELLPHONE.get(), 3), new ItemStack(ApocalypsenowModItems.MILK.get()), 10, 5, 0.05F));
      event.getGenericTrades()
         .add(
            new BasicItemListing(
               new ItemStack(ApocalypsenowModItems.SCRAPMETAL.get(), 32), new ItemStack(ApocalypsenowModBlocks.PACK_OF_CANNED_RABBIT_SOUP.get()), 10, 5, 0.05F
            )
         );
      event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.APPLE, 4), new ItemStack(ApocalypsenowModItems.CIGARETTES.get()), 10, 5, 0.05F));
      event.getGenericTrades()
         .add(new BasicItemListing(new ItemStack(ApocalypsenowModItems.BASEBALL_BAT.get()), new ItemStack(ApocalypsenowModItems.MAGAZINE.get()), 10, 5, 0.05F));
      event.getGenericTrades()
         .add(
            new BasicItemListing(new ItemStack(ApocalypsenowModItems.PLANK.get(), 7), new ItemStack(ApocalypsenowModItems.ELECTRICAL_SCRAP.get()), 10, 5, 0.05F)
         );
      event.getGenericTrades()
         .add(new BasicItemListing(new ItemStack(Blocks.WHITE_BED), new ItemStack(ApocalypsenowModItems.ENGINEERING_PARTS.get()), 10, 5, 0.05F));
      event.getGenericTrades()
         .add(
            new BasicItemListing(
               new ItemStack(ApocalypsenowModItems.HANDLEGRIPP.get(), 4), new ItemStack(ApocalypsenowModItems.TEXTILETHREAD.get()), 10, 5, 0.05F
            )
         );
   }

   @SubscribeEvent
   public static void registerTrades(VillagerTradesEvent event) {
      if (event.getType() == VillagerProfession.WEAPONSMITH) {
         ((List)event.getTrades().get(1))
            .add(
               new BasicItemListing(new ItemStack(ApocalypsenowModItems.MONEY.get(), 4), new ItemStack(ApocalypsenowModItems.BASEBALL_BAT.get()), 10, 5, 0.05F)
            );
         ((List)event.getTrades().get(2))
            .add(
               new BasicItemListing(
                  new ItemStack(ApocalypsenowModItems.MONEY.get(), 8), new ItemStack(ApocalypsenowModItems.SPIKED_BASEBALL_BAT.get()), 10, 6, 0.05F
               )
            );
         ((List)event.getTrades().get(2))
            .add(
               new BasicItemListing(
                  new ItemStack(ApocalypsenowModItems.MONEY.get(), 16), new ItemStack(ApocalypsenowModItems.WRAPPED_BASEBALL_BAT.get()), 10, 7, 0.05F
               )
            );
         ((List)event.getTrades().get(3))
            .add(
               new BasicItemListing(
                  new ItemStack(ApocalypsenowModItems.MONEY.get(), 16), new ItemStack(ApocalypsenowModItems.WIRED_BASEBALL_BAT.get()), 10, 8, 0.05F
               )
            );
         ((List)event.getTrades().get(4))
            .add(
               new BasicItemListing(
                  new ItemStack(ApocalypsenowModItems.MONEY.get(), 17), new ItemStack(ApocalypsenowModItems.ELECTRICAL_BASEBALL_BAT.get()), 10, 9, 0.05F
               )
            );
         ((List)event.getTrades().get(3))
            .add(
               new BasicItemListing(
                  new ItemStack(ApocalypsenowModItems.MONEY.get(), 20), new ItemStack(ApocalypsenowModItems.IRON_BASEBALL_BAT.get()), 10, 9, 0.05F
               )
            );
         ((List)event.getTrades().get(3))
            .add(
               new BasicItemListing(
                  new ItemStack(ApocalypsenowModItems.MONEY.get(), 25), new ItemStack(ApocalypsenowModItems.SPIKED_IRON_BASEBALL_BAT.get()), 10, 9, 0.05F
               )
            );
         ((List)event.getTrades().get(5))
            .add(
               new BasicItemListing(new ItemStack(ApocalypsenowModItems.MONEY.get(), 30), new ItemStack(ApocalypsenowModItems.CHAINSAW_BAT.get()), 10, 9, 0.05F)
            );
         ((List)event.getTrades().get(1))
            .add(
               new BasicItemListing(new ItemStack(ApocalypsenowModItems.MONEY.get(), 4), new ItemStack(ApocalypsenowModItems.NIGHT_STICK.get()), 10, 5, 0.05F)
            );
         ((List)event.getTrades().get(2))
            .add(
               new BasicItemListing(
                  new ItemStack(ApocalypsenowModItems.MONEY.get(), 64), new ItemStack(ApocalypsenowModItems.SLEDGE_HAMMER.get()), 10, 5, 0.05F
               )
            );
         ((List)event.getTrades().get(1))
            .add(
               new BasicItemListing(
                  new ItemStack(ApocalypsenowModItems.MONEY.get(), 50),
                  new ItemStack(ApocalypsenowModItems.COINS.get(), 30),
                  new ItemStack(ApocalypsenowModItems.FIRE_AXE.get()),
                  10,
                  5,
                  0.05F
               )
            );
         ((List)event.getTrades().get(1))
            .add(
               new BasicItemListing(
                  new ItemStack(ApocalypsenowModItems.MONEY.get(), 50),
                  new ItemStack(ApocalypsenowModItems.COINS.get(), 30),
                  new ItemStack(ApocalypsenowModItems.WOODEN_FIRE_AXE.get()),
                  10,
                  5,
                  0.05F
               )
            );
         ((List)event.getTrades().get(1))
            .add(new BasicItemListing(new ItemStack(ApocalypsenowModItems.MONEY.get(), 45), new ItemStack(ApocalypsenowModItems.KNIFE.get()), 10, 5, 0.05F));
         ((List)event.getTrades().get(2))
            .add(
               new BasicItemListing(
                  new ItemStack(ApocalypsenowModItems.MONEY.get(), 35), new ItemStack(ApocalypsenowModItems.TACTICAL_KNIFE.get()), 10, 5, 0.05F
               )
            );
         ((List)event.getTrades().get(3))
            .add(
               new BasicItemListing(
                  new ItemStack(ApocalypsenowModItems.MONEY.get(), 35), new ItemStack(ApocalypsenowModItems.SURVIVAL_KNIFE.get()), 10, 5, 0.05F
               )
            );
         ((List)event.getTrades().get(5))
            .add(
               new BasicItemListing(
                  new ItemStack(ApocalypsenowModBlocks.HIGHVALUEMONEYBLOCK.get(), 50),
                  new ItemStack(ApocalypsenowModItems.ELECTRIC_MODULE_KATANA.get()),
                  10,
                  9,
                  0.05F
               )
            );
         ((List)event.getTrades().get(1))
            .add(new BasicItemListing(new ItemStack(ApocalypsenowModItems.MONEY.get(), 9), new ItemStack(ApocalypsenowModItems.ICE_AXE.get()), 10, 5, 0.05F));
         ((List)event.getTrades().get(1))
            .add(new BasicItemListing(new ItemStack(ApocalypsenowModItems.MONEY.get(), 35), new ItemStack(ApocalypsenowModItems.TIMAHAWK.get()), 10, 5, 0.05F));
         ((List)event.getTrades().get(1))
            .add(
               new BasicItemListing(
                  new ItemStack(ApocalypsenowModItems.MONEY.get(), 25), new ItemStack(ApocalypsenowModItems.PREMIUM_HAMMER.get()), 10, 5, 0.05F
               )
            );
         ((List)event.getTrades().get(1))
            .add(new BasicItemListing(new ItemStack(ApocalypsenowModItems.MONEY.get()), new ItemStack(ApocalypsenowModItems.SLEDGEHAMMERR.get()), 10, 5, 0.05F));
      }

      if (event.getType() == VillagerProfession.ARMORER) {
         ((List)event.getTrades().get(1))
            .add(
               new BasicItemListing(new ItemStack(ApocalypsenowModItems.MONEY.get(), 8), new ItemStack(ApocalypsenowModItems.CANNED_FOOD.get()), 10, 5, 0.05F)
            );
         ((List)event.getTrades().get(1))
            .add(
               new BasicItemListing(new ItemStack(ApocalypsenowModItems.MONEY.get(), 8), new ItemStack(ApocalypsenowModItems.CANNED_SOUP.get()), 10, 5, 0.05F)
            );
         ((List)event.getTrades().get(1))
            .add(
               new BasicItemListing(new ItemStack(ApocalypsenowModItems.MONEY.get(), 8), new ItemStack(ApocalypsenowModItems.CANNED_BEANS.get()), 10, 5, 0.05F)
            );
         ((List)event.getTrades().get(1))
            .add(
               new BasicItemListing(new ItemStack(ApocalypsenowModItems.MONEY.get(), 8), new ItemStack(ApocalypsenowModItems.CANNED_CORN.get()), 10, 5, 0.05F)
            );
         ((List)event.getTrades().get(1))
            .add(
               new BasicItemListing(
                  new ItemStack(ApocalypsenowModItems.MONEY.get(), 8), new ItemStack(ApocalypsenowModItems.CANNED_STRAWBERRY.get()), 10, 5, 0.05F
               )
            );
         ((List)event.getTrades().get(1))
            .add(
               new BasicItemListing(new ItemStack(ApocalypsenowModItems.MONEY.get(), 5), new ItemStack(ApocalypsenowModItems.ORANGE_JUICE.get()), 10, 5, 0.05F)
            );
         ((List)event.getTrades().get(1))
            .add(
               new BasicItemListing(new ItemStack(ApocalypsenowModItems.MONEY.get(), 5), new ItemStack(ApocalypsenowModItems.GRAPE_JUICE.get()), 10, 5, 0.05F)
            );
         ((List)event.getTrades().get(1))
            .add(
               new BasicItemListing(new ItemStack(ApocalypsenowModItems.MONEY.get(), 5), new ItemStack(ApocalypsenowModItems.PEACH_JUICE.get()), 10, 5, 0.05F)
            );
         ((List)event.getTrades().get(1))
            .add(
               new BasicItemListing(
                  new ItemStack(ApocalypsenowModItems.MONEY.get(), 3), new ItemStack(ApocalypsenowModItems.ORANGEJUICEBOX.get()), 10, 5, 0.05F
               )
            );
         ((List)event.getTrades().get(1))
            .add(
               new BasicItemListing(new ItemStack(ApocalypsenowModItems.MONEY.get(), 3), new ItemStack(ApocalypsenowModItems.GRAPEJUICEBOX.get()), 10, 5, 0.05F)
            );
         ((List)event.getTrades().get(1))
            .add(
               new BasicItemListing(new ItemStack(ApocalypsenowModItems.MONEY.get(), 3), new ItemStack(ApocalypsenowModItems.APPLEJUICEBOX.get()), 10, 5, 0.05F)
            );
         ((List)event.getTrades().get(1))
            .add(
               new BasicItemListing(new ItemStack(ApocalypsenowModItems.MONEY.get(), 15), new ItemStack(ApocalypsenowModItems.MACANDCHEESE.get()), 10, 5, 0.05F)
            );
         ((List)event.getTrades().get(1))
            .add(new BasicItemListing(new ItemStack(ApocalypsenowModItems.MONEY.get(), 15), new ItemStack(ApocalypsenowModItems.CEREAL.get()), 10, 5, 0.05F));
      }

      if (event.getType() == VillagerProfession.ARMORER) {
         ((List)event.getTrades().get(1))
            .add(
               new BasicItemListing(new ItemStack(ApocalypsenowModItems.MONEY.get(), 35), new ItemStack(ApocalypsenowModItems.SWAT_HELMET.get()), 10, 5, 0.05F)
            );
         ((List)event.getTrades().get(1))
            .add(
               new BasicItemListing(
                  new ItemStack(ApocalypsenowModItems.MONEY.get(), 35), new ItemStack(ApocalypsenowModItems.SWAT_CHESTPLATE.get()), 10, 5, 0.05F
               )
            );
         ((List)event.getTrades().get(1))
            .add(
               new BasicItemListing(
                  new ItemStack(ApocalypsenowModItems.MONEY.get(), 35), new ItemStack(ApocalypsenowModItems.SWAT_LEGGINGS.get()), 10, 5, 0.05F
               )
            );
         ((List)event.getTrades().get(1))
            .add(
               new BasicItemListing(new ItemStack(ApocalypsenowModItems.MONEY.get(), 35), new ItemStack(ApocalypsenowModItems.SWAT_BOOTS.get()), 10, 5, 0.05F)
            );
         ((List)event.getTrades().get(1))
            .add(
               new BasicItemListing(
                  new ItemStack(ApocalypsenowModItems.MONEY.get(), 25), new ItemStack(ApocalypsenowModItems.BIOHAZARD_HELMET.get()), 10, 5, 0.05F
               )
            );
         ((List)event.getTrades().get(1))
            .add(
               new BasicItemListing(
                  new ItemStack(ApocalypsenowModItems.MONEY.get(), 25), new ItemStack(ApocalypsenowModItems.BIOHAZARD_CHESTPLATE.get()), 10, 5, 0.05F
               )
            );
         ((List)event.getTrades().get(1))
            .add(
               new BasicItemListing(
                  new ItemStack(ApocalypsenowModItems.MONEY.get(), 25), new ItemStack(ApocalypsenowModItems.BIOHAZARD_LEGGINGS.get()), 10, 5, 0.05F
               )
            );
         ((List)event.getTrades().get(1))
            .add(
               new BasicItemListing(
                  new ItemStack(ApocalypsenowModItems.MONEY.get(), 25), new ItemStack(ApocalypsenowModItems.BIOHAZARD_BOOTS.get()), 10, 5, 0.05F
               )
            );
         ((List)event.getTrades().get(1))
            .add(
               new BasicItemListing(
                  new ItemStack(ApocalypsenowModItems.MONEY.get(), 15), new ItemStack(ApocalypsenowModItems.POLICE_HELMET.get()), 10, 5, 0.05F
               )
            );
         ((List)event.getTrades().get(1))
            .add(
               new BasicItemListing(
                  new ItemStack(ApocalypsenowModItems.MONEY.get(), 15), new ItemStack(ApocalypsenowModItems.POLICE_CHESTPLATE.get()), 10, 5, 0.05F
               )
            );
         ((List)event.getTrades().get(1))
            .add(
               new BasicItemListing(
                  new ItemStack(ApocalypsenowModItems.MONEY.get(), 15), new ItemStack(ApocalypsenowModItems.POLICE_LEGGINGS.get()), 10, 5, 0.05F
               )
            );
         ((List)event.getTrades().get(1))
            .add(
               new BasicItemListing(new ItemStack(ApocalypsenowModItems.MONEY.get(), 15), new ItemStack(ApocalypsenowModItems.POLICE_BOOTS.get()), 10, 5, 0.05F)
            );
         ((List)event.getTrades().get(1))
            .add(
               new BasicItemListing(
                  new ItemStack(ApocalypsenowModItems.MONEY.get(), 25), new ItemStack(ApocalypsenowModItems.UN_ARMOR_HELMET.get()), 10, 5, 0.05F
               )
            );
         ((List)event.getTrades().get(1))
            .add(
               new BasicItemListing(
                  new ItemStack(ApocalypsenowModItems.MONEY.get(), 25), new ItemStack(ApocalypsenowModItems.UN_ARMOR_CHESTPLATE.get()), 10, 5, 0.05F
               )
            );
         ((List)event.getTrades().get(1))
            .add(
               new BasicItemListing(
                  new ItemStack(ApocalypsenowModItems.MONEY.get(), 25), new ItemStack(ApocalypsenowModItems.UN_ARMOR_LEGGINGS.get()), 10, 5, 0.05F
               )
            );
         ((List)event.getTrades().get(1))
            .add(
               new BasicItemListing(
                  new ItemStack(ApocalypsenowModItems.MONEY.get(), 25), new ItemStack(ApocalypsenowModItems.UN_ARMOR_BOOTS.get()), 10, 5, 0.05F
               )
            );
         ((List)event.getTrades().get(1))
            .add(
               new BasicItemListing(
                  new ItemStack(ApocalypsenowModItems.MONEY.get(), 25), new ItemStack(ApocalypsenowModItems.MCU2P_GASMASK_HELMET.get()), 10, 5, 0.05F
               )
            );
         ((List)event.getTrades().get(1))
            .add(
               new BasicItemListing(
                  new ItemStack(ApocalypsenowModItems.MONEY.get(), 25), new ItemStack(ApocalypsenowModItems.SIXSH_116_CHESTPLATE.get()), 10, 5, 0.05F
               )
            );
         ((List)event.getTrades().get(1))
            .add(
               new BasicItemListing(
                  new ItemStack(ApocalypsenowModItems.MONEY.get(), 25), new ItemStack(ApocalypsenowModItems.BLACKHOCKEYMASK_HELMET.get()), 10, 5, 0.05F
               )
            );
         ((List)event.getTrades().get(1))
            .add(
               new BasicItemListing(
                  new ItemStack(ApocalypsenowModItems.MONEY.get(), 25),
                  new ItemStack(ApocalypsenowModItems.PRESS_BULLETPROOF_VEST_CHESTPLATE.get()),
                  10,
                  5,
                  0.05F
               )
            );
         ((List)event.getTrades().get(1))
            .add(
               new BasicItemListing(
                  new ItemStack(ApocalypsenowModItems.MONEY.get(), 15), new ItemStack(ApocalypsenowModItems.GHILLIESUIT_HELMET.get()), 10, 5, 0.05F
               )
            );
         ((List)event.getTrades().get(1))
            .add(
               new BasicItemListing(
                  new ItemStack(ApocalypsenowModItems.MONEY.get(), 15), new ItemStack(ApocalypsenowModItems.GHILLIESUIT_CHESTPLATE.get()), 10, 5, 0.05F
               )
            );
         ((List)event.getTrades().get(1))
            .add(
               new BasicItemListing(
                  new ItemStack(ApocalypsenowModItems.MONEY.get(), 15), new ItemStack(ApocalypsenowModItems.GHILLIESUIT_LEGGINGS.get()), 10, 5, 0.05F
               )
            );
         ((List)event.getTrades().get(1))
            .add(
               new BasicItemListing(
                  new ItemStack(ApocalypsenowModItems.MONEY.get(), 15), new ItemStack(ApocalypsenowModItems.GHILLIESUIT_BOOTS.get()), 10, 5, 0.05F
               )
            );
         ((List)event.getTrades().get(1))
            .add(
               new BasicItemListing(
                  new ItemStack(ApocalypsenowModItems.MONEY.get(), 5), new ItemStack(ApocalypsenowModItems.AVIATOR_HAT_HELMET.get()), 10, 5, 0.05F
               )
            );
         ((List)event.getTrades().get(1))
            .add(
               new BasicItemListing(
                  new ItemStack(ApocalypsenowModItems.MONEY.get(), 20), new ItemStack(ApocalypsenowModItems.PKM_4GASMASK_HELMET.get()), 10, 5, 0.05F
               )
            );
         ((List)event.getTrades().get(1))
            .add(
               new BasicItemListing(
                  new ItemStack(ApocalypsenowModItems.MONEY.get(), 5), new ItemStack(ApocalypsenowModItems.SNOW_CAMO_BALACLAVA.get()), 10, 5, 0.05F
               )
            );
         ((List)event.getTrades().get(1))
            .add(new BasicItemListing(new ItemStack(ApocalypsenowModItems.MONEY.get(), 5), new ItemStack(ApocalypsenowModItems.BANDANA.get()), 10, 5, 0.05F));
         ((List)event.getTrades().get(1))
            .add(
               new BasicItemListing(
                  new ItemStack(ApocalypsenowModItems.MONEY.get(), 25), new ItemStack(ApocalypsenowModItems.MILITARY_URBAN_HELMET.get()), 10, 5, 0.05F
               )
            );
         ((List)event.getTrades().get(1))
            .add(
               new BasicItemListing(
                  new ItemStack(ApocalypsenowModItems.MONEY.get(), 25), new ItemStack(ApocalypsenowModItems.MILITARY_URBAN_CHESTPLATE.get()), 10, 5, 0.05F
               )
            );
         ((List)event.getTrades().get(1))
            .add(
               new BasicItemListing(
                  new ItemStack(ApocalypsenowModItems.MONEY.get(), 25), new ItemStack(ApocalypsenowModItems.MILITARY_URBAN_LEGGINGS.get()), 10, 5, 0.05F
               )
            );
         ((List)event.getTrades().get(1))
            .add(
               new BasicItemListing(
                  new ItemStack(ApocalypsenowModItems.MONEY.get(), 25), new ItemStack(ApocalypsenowModItems.MILITARY_URBAN_BOOTS.get()), 10, 5, 0.05F
               )
            );
      }
   }
}

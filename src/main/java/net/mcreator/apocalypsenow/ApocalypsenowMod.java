package net.mcreator.apocalypsenow;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.AbstractMap.SimpleEntry;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;
import net.mcreator.apocalypsenow.init.ApocalypsenowModBlockEntities;
import net.mcreator.apocalypsenow.init.ApocalypsenowModBlocks;
import net.mcreator.apocalypsenow.init.ApocalypsenowModEntities;
import net.mcreator.apocalypsenow.init.ApocalypsenowModItems;
import net.mcreator.apocalypsenow.init.ApocalypsenowModMenus;
import net.mcreator.apocalypsenow.init.ApocalypsenowModMobEffects;
import net.mcreator.apocalypsenow.init.ApocalypsenowModParticleTypes;
import net.mcreator.apocalypsenow.init.ApocalypsenowModPotions;
import net.mcreator.apocalypsenow.init.ApocalypsenowModRecipeSerializers;
import net.mcreator.apocalypsenow.init.ApocalypsenowModSounds;
import net.mcreator.apocalypsenow.init.ApocalypsenowModTabs;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent.Phase;
import net.minecraftforge.event.TickEvent.ServerTickEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.util.thread.SidedThreadGroups;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.NetworkEvent.Context;
import net.minecraftforge.network.simple.SimpleChannel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("apocalypsenow")
public class ApocalypsenowMod {
   public static final Logger LOGGER = LogManager.getLogger(ApocalypsenowMod.class);
   public static final String MODID = "apocalypsenow";
   private static final String PROTOCOL_VERSION = "1";
   public static final SimpleChannel PACKET_HANDLER = NetworkRegistry.newSimpleChannel(
      new ResourceLocation("apocalypsenow", "apocalypsenow"), () -> "1", "1"::equals, "1"::equals
   );
   private static int messageID = 0;
   private static final Collection<SimpleEntry<Runnable, Integer>> workQueue = new ConcurrentLinkedQueue<>();

   public ApocalypsenowMod() {
      MinecraftForge.EVENT_BUS.register(this);
      IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
      ApocalypsenowModSounds.REGISTRY.register(bus);
      ApocalypsenowModBlocks.REGISTRY.register(bus);
      ApocalypsenowModBlockEntities.REGISTRY.register(bus);
      ApocalypsenowModItems.REGISTRY.register(bus);
      ApocalypsenowModEntities.REGISTRY.register(bus);
      ApocalypsenowModTabs.REGISTRY.register(bus);
      ApocalypsenowModMobEffects.REGISTRY.register(bus);
      ApocalypsenowModPotions.REGISTRY.register(bus);
      ApocalypsenowModRecipeSerializers.REGISTRY.register(bus);
      ApocalypsenowModParticleTypes.REGISTRY.register(bus);
      ApocalypsenowModMenus.REGISTRY.register(bus);
   }

   public static <T> void addNetworkMessage(
      Class<T> messageType, BiConsumer<T, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, T> decoder, BiConsumer<T, Supplier<Context>> messageConsumer
   ) {
      PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
      messageID++;
   }

   public static void queueServerWork(int tick, Runnable action) {
      if (Thread.currentThread().getThreadGroup() == SidedThreadGroups.SERVER) {
         workQueue.add(new SimpleEntry<>(action, tick));
      }
   }

   @SubscribeEvent
   public void tick(ServerTickEvent event) {
      if (event.phase == Phase.END) {
         List<SimpleEntry<Runnable, Integer>> actions = new ArrayList<>();
         workQueue.forEach(work -> {
            work.setValue(work.getValue() - 1);
            if (work.getValue() == 0) {
               actions.add((SimpleEntry<Runnable, Integer>)work);
            }
         });
         actions.forEach(e -> e.getKey().run());
         workQueue.removeAll(actions);
      }
   }
}

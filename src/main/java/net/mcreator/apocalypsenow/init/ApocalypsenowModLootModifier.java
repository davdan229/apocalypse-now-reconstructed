package net.mcreator.apocalypsenow.init;

import com.google.common.base.Suppliers;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.function.Supplier;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.common.loot.LootModifier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries.Keys;

@EventBusSubscriber(modid = "apocalypsenow", bus = Bus.MOD)
public class ApocalypsenowModLootModifier {
   public static final DeferredRegister<Codec<? extends IGlobalLootModifier>> LOOT_MODIFIERS = DeferredRegister.create(
      Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, "apocalypsenow"
   );
   public static final RegistryObject<Codec<ApocalypsenowModLootModifier.ApocalypsenowModLootTableModifier>> LOOT_MODIFIER = LOOT_MODIFIERS.register(
      "apocalypsenow_loot_modifier", ApocalypsenowModLootModifier.ApocalypsenowModLootTableModifier.CODEC
   );

   @SubscribeEvent
   public static void register(FMLConstructModEvent event) {
      IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
      event.enqueueWork(() -> LOOT_MODIFIERS.register(bus));
   }

   public static class ApocalypsenowModLootTableModifier extends LootModifier {
      public static final Supplier<Codec<ApocalypsenowModLootModifier.ApocalypsenowModLootTableModifier>> CODEC = Suppliers.memoize(
         () -> RecordCodecBuilder.create(
            instance -> codecStart(instance)
               .and(ResourceLocation.CODEC.fieldOf("lootTable").forGetter(m -> m.lootTable))
               .apply(instance, ApocalypsenowModLootModifier.ApocalypsenowModLootTableModifier::new)
         )
      );
      private final ResourceLocation lootTable;

      public ApocalypsenowModLootTableModifier(LootItemCondition[] conditions, ResourceLocation lootTable) {
         super(conditions);
         this.lootTable = lootTable;
      }

      @Override
      protected ObjectArrayList<ItemStack> doApply(ObjectArrayList<ItemStack> generatedLoot, LootContext context) {
         context.getResolver().getLootTable(this.lootTable).getRandomItemsRaw(context, generatedLoot::add);
         return generatedLoot;
      }

      @Override
      public Codec<? extends IGlobalLootModifier> codec() {
         return CODEC.get();
      }
   }
}

package net.mcreator.apocalypsenow.init;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ApocalypsenowModPotions {
   public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, "apocalypsenow");
   public static final RegistryObject<Potion> BLEEDING = REGISTRY.register(
      "bleeding", () -> new Potion(new MobEffectInstance(ApocalypsenowModMobEffects.BLEEDING.get(), 3600, 0, false, true))
   );
   public static final RegistryObject<Potion> BROKENLEG = REGISTRY.register(
      "brokenleg", () -> new Potion(new MobEffectInstance(ApocalypsenowModMobEffects.BROKENLEG.get(), 3600, 0, false, true))
   );
   public static final RegistryObject<Potion> ELETRICALDAMAGE = REGISTRY.register(
      "eletricaldamage", () -> new Potion(new MobEffectInstance(ApocalypsenowModMobEffects.ELETRICALDAMAGE.get(), 3600, 0, false, true))
   );
   public static final RegistryObject<Potion> INFECTION = REGISTRY.register(
      "infection", () -> new Potion(new MobEffectInstance(ApocalypsenowModMobEffects.INFECTION.get(), 3600, 0, false, true))
   );
   public static final RegistryObject<Potion> ZOMBIFICATION = REGISTRY.register(
      "zombification", () -> new Potion(new MobEffectInstance(ApocalypsenowModMobEffects.ZOMBIFICATION.get(), 3600, 0, false, true))
   );
}

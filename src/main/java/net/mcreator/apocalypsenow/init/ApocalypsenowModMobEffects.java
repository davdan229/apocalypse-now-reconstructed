package net.mcreator.apocalypsenow.init;

import net.mcreator.apocalypsenow.potion.AntibioticseffectMobEffect;
import net.mcreator.apocalypsenow.potion.BandagedMobEffect;
import net.mcreator.apocalypsenow.potion.BandageddMobEffect;
import net.mcreator.apocalypsenow.potion.BiteMobEffect;
import net.mcreator.apocalypsenow.potion.BleedingMobEffect;
import net.mcreator.apocalypsenow.potion.BrokenlegMobEffect;
import net.mcreator.apocalypsenow.potion.EletricaldamageMobEffect;
import net.mcreator.apocalypsenow.potion.GasmaskeffectMobEffect;
import net.mcreator.apocalypsenow.potion.GpnveffectMobEffect;
import net.mcreator.apocalypsenow.potion.InfectionMobEffect;
import net.mcreator.apocalypsenow.potion.NightvisioneffecttMobEffect;
import net.mcreator.apocalypsenow.potion.NvgeffectMobEffect;
import net.mcreator.apocalypsenow.potion.OnguardMobEffect;
import net.mcreator.apocalypsenow.potion.PainMobEffect;
import net.mcreator.apocalypsenow.potion.PainkillerseffectMobEffect;
import net.mcreator.apocalypsenow.potion.PeppersprayeffectMobEffect;
import net.mcreator.apocalypsenow.potion.PlaceholdercivilianeffectMobEffect;
import net.mcreator.apocalypsenow.potion.PlaceholdereffectignoreMobEffect;
import net.mcreator.apocalypsenow.potion.PosbleedingMobEffect;
import net.mcreator.apocalypsenow.potion.PosbrokenlegMobEffect;
import net.mcreator.apocalypsenow.potion.PosinfectioneffectMobEffect;
import net.mcreator.apocalypsenow.potion.PospainMobEffect;
import net.mcreator.apocalypsenow.potion.PosscratchMobEffect;
import net.mcreator.apocalypsenow.potion.PosseverebleedingMobEffect;
import net.mcreator.apocalypsenow.potion.ProtectedfootMobEffect;
import net.mcreator.apocalypsenow.potion.ProtectedskinMobEffect;
import net.mcreator.apocalypsenow.potion.RadiationsicknessMobEffect;
import net.mcreator.apocalypsenow.potion.RednightvisioneffectMobEffect;
import net.mcreator.apocalypsenow.potion.ScratchMobEffect;
import net.mcreator.apocalypsenow.potion.SeverebleedingMobEffect;
import net.mcreator.apocalypsenow.potion.SplintedlegMobEffect;
import net.mcreator.apocalypsenow.potion.SutureeffectMobEffect;
import net.mcreator.apocalypsenow.potion.WalkingMobEffect;
import net.mcreator.apocalypsenow.potion.ZombificationMobEffect;
import net.minecraft.world.effect.MobEffect;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ApocalypsenowModMobEffects {
   public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, "apocalypsenow");
   public static final RegistryObject<MobEffect> BLEEDING = REGISTRY.register("bleeding", () -> new BleedingMobEffect());
   public static final RegistryObject<MobEffect> BROKENLEG = REGISTRY.register("brokenleg", () -> new BrokenlegMobEffect());
   public static final RegistryObject<MobEffect> ELETRICALDAMAGE = REGISTRY.register("eletricaldamage", () -> new EletricaldamageMobEffect());
   public static final RegistryObject<MobEffect> INFECTION = REGISTRY.register("infection", () -> new InfectionMobEffect());
   public static final RegistryObject<MobEffect> ZOMBIFICATION = REGISTRY.register("zombification", () -> new ZombificationMobEffect());
   public static final RegistryObject<MobEffect> SCRATCH = REGISTRY.register("scratch", () -> new ScratchMobEffect());
   public static final RegistryObject<MobEffect> BITE = REGISTRY.register("bite", () -> new BiteMobEffect());
   public static final RegistryObject<MobEffect> BANDAGED = REGISTRY.register("bandaged", () -> new BandagedMobEffect());
   public static final RegistryObject<MobEffect> BANDAGEDD = REGISTRY.register("bandagedd", () -> new BandageddMobEffect());
   public static final RegistryObject<MobEffect> PROTECTEDSKIN = REGISTRY.register("protectedskin", () -> new ProtectedskinMobEffect());
   public static final RegistryObject<MobEffect> PROTECTEDFOOT = REGISTRY.register("protectedfoot", () -> new ProtectedfootMobEffect());
   public static final RegistryObject<MobEffect> SEVEREBLEEDING = REGISTRY.register("severebleeding", () -> new SeverebleedingMobEffect());
   public static final RegistryObject<MobEffect> PAIN = REGISTRY.register("pain", () -> new PainMobEffect());
   public static final RegistryObject<MobEffect> SPLINTEDLEG = REGISTRY.register("splintedleg", () -> new SplintedlegMobEffect());
   public static final RegistryObject<MobEffect> POSBROKENLEG = REGISTRY.register("posbrokenleg", () -> new PosbrokenlegMobEffect());
   public static final RegistryObject<MobEffect> POSPAIN = REGISTRY.register("pospain", () -> new PospainMobEffect());
   public static final RegistryObject<MobEffect> PAINKILLERSEFFECT = REGISTRY.register("painkillerseffect", () -> new PainkillerseffectMobEffect());
   public static final RegistryObject<MobEffect> POSBLEEDING = REGISTRY.register("posbleeding", () -> new PosbleedingMobEffect());
   public static final RegistryObject<MobEffect> ANTIBIOTICSEFFECT = REGISTRY.register("antibioticseffect", () -> new AntibioticseffectMobEffect());
   public static final RegistryObject<MobEffect> POSINFECTIONEFFECT = REGISTRY.register("posinfectioneffect", () -> new PosinfectioneffectMobEffect());
   public static final RegistryObject<MobEffect> POSSCRATCH = REGISTRY.register("posscratch", () -> new PosscratchMobEffect());
   public static final RegistryObject<MobEffect> SUTUREEFFECT = REGISTRY.register("sutureeffect", () -> new SutureeffectMobEffect());
   public static final RegistryObject<MobEffect> POSSEVEREBLEEDING = REGISTRY.register("posseverebleeding", () -> new PosseverebleedingMobEffect());
   public static final RegistryObject<MobEffect> ONGUARD = REGISTRY.register("onguard", () -> new OnguardMobEffect());
   public static final RegistryObject<MobEffect> WALKING = REGISTRY.register("walking", () -> new WalkingMobEffect());
   public static final RegistryObject<MobEffect> NIGHTVISIONEFFECTT = REGISTRY.register("nightvisioneffectt", () -> new NightvisioneffecttMobEffect());
   public static final RegistryObject<MobEffect> REDNIGHTVISIONEFFECT = REGISTRY.register("rednightvisioneffect", () -> new RednightvisioneffectMobEffect());
   public static final RegistryObject<MobEffect> NVGEFFECT = REGISTRY.register("nvgeffect", () -> new NvgeffectMobEffect());
   public static final RegistryObject<MobEffect> GPNVEFFECT = REGISTRY.register("gpnveffect", () -> new GpnveffectMobEffect());
   public static final RegistryObject<MobEffect> PEPPERSPRAYEFFECT = REGISTRY.register("peppersprayeffect", () -> new PeppersprayeffectMobEffect());
   public static final RegistryObject<MobEffect> GASMASKEFFECT = REGISTRY.register("gasmaskeffect", () -> new GasmaskeffectMobEffect());
   public static final RegistryObject<MobEffect> PLACEHOLDEREFFECTIGNORE = REGISTRY.register(
      "placeholdereffectignore", () -> new PlaceholdereffectignoreMobEffect()
   );
   public static final RegistryObject<MobEffect> PLACEHOLDERCIVILIANEFFECT = REGISTRY.register(
      "placeholdercivilianeffect", () -> new PlaceholdercivilianeffectMobEffect()
   );
   public static final RegistryObject<MobEffect> RADIATIONSICKNESS = REGISTRY.register("radiationsickness", () -> new RadiationsicknessMobEffect());
}

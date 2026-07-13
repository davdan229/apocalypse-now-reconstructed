package net.mcreator.apocalypsenow.init;

import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ApocalypsenowModParticleTypes {
   public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, "apocalypsenow");
   public static final RegistryObject<SimpleParticleType> SMOKE_1 = REGISTRY.register("smoke_1", () -> new SimpleParticleType(true));
   public static final RegistryObject<SimpleParticleType> SMOKE_2 = REGISTRY.register("smoke_2", () -> new SimpleParticleType(true));
   public static final RegistryObject<SimpleParticleType> BLOOD = REGISTRY.register("blood", () -> new SimpleParticleType(true));
   public static final RegistryObject<SimpleParticleType> DROPBOXSMOKE = REGISTRY.register("dropboxsmoke", () -> new SimpleParticleType(true));
}

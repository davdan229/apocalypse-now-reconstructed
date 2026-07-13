package net.mcreator.apocalypsenow.init;

import net.mcreator.apocalypsenow.client.particle.BloodParticle;
import net.mcreator.apocalypsenow.client.particle.DropboxsmokeParticle;
import net.mcreator.apocalypsenow.client.particle.Smoke1Particle;
import net.mcreator.apocalypsenow.client.particle.Smoke2Particle;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@EventBusSubscriber(bus = Bus.MOD, value = Dist.CLIENT)
public class ApocalypsenowModParticles {
   @SubscribeEvent
   public static void registerParticles(RegisterParticleProvidersEvent event) {
      event.registerSpriteSet(ApocalypsenowModParticleTypes.SMOKE_1.get(), Smoke1Particle::provider);
      event.registerSpriteSet(ApocalypsenowModParticleTypes.SMOKE_2.get(), Smoke2Particle::provider);
      event.registerSpriteSet(ApocalypsenowModParticleTypes.BLOOD.get(), BloodParticle::provider);
      event.registerSpriteSet(ApocalypsenowModParticleTypes.DROPBOXSMOKE.get(), DropboxsmokeParticle::provider);
   }
}

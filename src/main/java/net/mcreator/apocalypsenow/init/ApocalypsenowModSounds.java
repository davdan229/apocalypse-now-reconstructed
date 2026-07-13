package net.mcreator.apocalypsenow.init;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ApocalypsenowModSounds {
   public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, "apocalypsenow");
   public static final RegistryObject<SoundEvent> BEARTRAP = REGISTRY.register(
      "beartrap", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("apocalypsenow", "beartrap"))
   );
   public static final RegistryObject<SoundEvent> CANOPENER = REGISTRY.register(
      "canopener", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("apocalypsenow", "canopener"))
   );
   public static final RegistryObject<SoundEvent> ZIP = REGISTRY.register(
      "zip", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("apocalypsenow", "zip"))
   );
   public static final RegistryObject<SoundEvent> UNZIP = REGISTRY.register(
      "unzip", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("apocalypsenow", "unzip"))
   );
   public static final RegistryObject<SoundEvent> THROW_EFFECT = REGISTRY.register(
      "throw_effect", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("apocalypsenow", "throw_effect"))
   );
   public static final RegistryObject<SoundEvent> TRASH_BREAKING = REGISTRY.register(
      "trash_breaking", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("apocalypsenow", "trash_breaking"))
   );
   public static final RegistryObject<SoundEvent> TRASH_PLACE = REGISTRY.register(
      "trash_place", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("apocalypsenow", "trash_place"))
   );
   public static final RegistryObject<SoundEvent> TRASH_WALK = REGISTRY.register(
      "trash_walk", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("apocalypsenow", "trash_walk"))
   );
   public static final RegistryObject<SoundEvent> CHAINSAW_NEW = REGISTRY.register(
      "chainsaw_new", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("apocalypsenow", "chainsaw_new"))
   );
   public static final RegistryObject<SoundEvent> NV_ON = REGISTRY.register(
      "nv_on", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("apocalypsenow", "nv_on"))
   );
   public static final RegistryObject<SoundEvent> BUTTON_CLICK = REGISTRY.register(
      "button-click", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("apocalypsenow", "button-click"))
   );
   public static final RegistryObject<SoundEvent> BLIPBLIP = REGISTRY.register(
      "blipblip", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("apocalypsenow", "blipblip"))
   );
   public static final RegistryObject<SoundEvent> PEPPERSPRAY = REGISTRY.register(
      "pepperspray", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("apocalypsenow", "pepperspray"))
   );
   public static final RegistryObject<SoundEvent> NAILGUN = REGISTRY.register(
      "nailgun", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("apocalypsenow", "nailgun"))
   );
   public static final RegistryObject<SoundEvent> COINS = REGISTRY.register(
      "coins", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("apocalypsenow", "coins"))
   );
}

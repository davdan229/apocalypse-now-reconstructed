package net.mcreator.apocalypsenow.init;

import net.mcreator.apocalypsenow.recipe.LegacySmithingRecipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ApocalypsenowModRecipeSerializers {
   public static final DeferredRegister<RecipeSerializer<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, "apocalypsenow");
   public static final RegistryObject<RecipeSerializer<LegacySmithingRecipe>> LEGACY_SMITHING = REGISTRY.register(
      "legacy_smithing", LegacySmithingRecipe.Serializer::new
   );
}

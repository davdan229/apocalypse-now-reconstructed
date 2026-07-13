package net.mcreator.apocalypsenow.recipe;

import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import net.mcreator.apocalypsenow.init.ApocalypsenowModRecipeSerializers;
import net.minecraft.core.RegistryAccess;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.Container;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.SmithingRecipe;
import net.minecraft.world.level.Level;
import net.minecraftforge.registries.ForgeRegistries;

public class LegacySmithingRecipe implements SmithingRecipe {
   private final ResourceLocation id;
   private final Ingredient base;
   private final Ingredient addition;
   private final ItemStack result;

   public LegacySmithingRecipe(ResourceLocation id, Ingredient base, Ingredient addition, ItemStack result) {
      this.id = id;
      this.base = base;
      this.addition = addition;
      this.result = result;
   }

   @Override
   public boolean matches(Container container, Level level) {
      return this.base.test(container.getItem(1)) && this.addition.test(container.getItem(2));
   }

   @Override
   public ItemStack assemble(Container container, RegistryAccess registryAccess) {
      ItemStack upgraded = this.result.copy();
      ItemStack source = container.getItem(1);
      if (source.hasTag()) {
         upgraded.setTag(source.getTag().copy());
      }

      return upgraded;
   }

   @Override
   public boolean isTemplateIngredient(ItemStack stack) {
      return false;
   }

   @Override
   public boolean isBaseIngredient(ItemStack stack) {
      return this.base.test(stack);
   }

   @Override
   public boolean isAdditionIngredient(ItemStack stack) {
      return this.addition.test(stack);
   }

   @Override
   public boolean canCraftInDimensions(int width, int height) {
      return false;
   }

   @Override
   public ItemStack getResultItem(RegistryAccess registryAccess) {
      return this.result;
   }

   @Override
   public ResourceLocation getId() {
      return this.id;
   }

   @Override
   public RecipeSerializer<?> getSerializer() {
      return ApocalypsenowModRecipeSerializers.LEGACY_SMITHING.get();
   }

   public static class Serializer implements RecipeSerializer<LegacySmithingRecipe> {
      @Override
      public LegacySmithingRecipe fromJson(ResourceLocation id, JsonObject json) {
         Ingredient base = Ingredient.fromJson(GsonHelper.getNonNull(json, "base"));
         Ingredient addition = Ingredient.fromJson(GsonHelper.getNonNull(json, "addition"));
         JsonObject resultJson = GsonHelper.getAsJsonObject(json, "result");
         ResourceLocation resultId = new ResourceLocation(GsonHelper.getAsString(resultJson, "item"));
         Item item = ForgeRegistries.ITEMS.getValue(resultId);
         if (item == null) {
            throw new JsonParseException("Unknown result item '" + resultId + "'");
         }

         ItemStack result = new ItemStack(item, GsonHelper.getAsInt(resultJson, "count", 1));
         return new LegacySmithingRecipe(id, base, addition, result);
      }

      @Override
      public LegacySmithingRecipe fromNetwork(ResourceLocation id, FriendlyByteBuf buffer) {
         return new LegacySmithingRecipe(id, Ingredient.fromNetwork(buffer), Ingredient.fromNetwork(buffer), buffer.readItem());
      }

      @Override
      public void toNetwork(FriendlyByteBuf buffer, LegacySmithingRecipe recipe) {
         recipe.base.toNetwork(buffer);
         recipe.addition.toNetwork(buffer);
         buffer.writeItem(recipe.result);
      }
   }
}

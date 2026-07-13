package net.mcreator.apocalypsenow.client.renderer;

import net.mcreator.apocalypsenow.client.model.Modelperninhadowns;
import net.mcreator.apocalypsenow.entity.Crawler4Entity;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.resources.ResourceLocation;

public class Crawler4Renderer extends MobRenderer<Crawler4Entity, Modelperninhadowns<Crawler4Entity>> {
   public Crawler4Renderer(Context context) {
      super(context, new Modelperninhadowns<>(context.bakeLayer(Modelperninhadowns.LAYER_LOCATION)), 0.5F);
   }

   public ResourceLocation getTextureLocation(Crawler4Entity entity) {
      return new ResourceLocation("apocalypsenow:textures/entities/perninhadown.png");
   }
}

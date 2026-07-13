package net.mcreator.apocalypsenow.client.renderer;

import net.mcreator.apocalypsenow.client.model.Modelperninhaas;
import net.mcreator.apocalypsenow.entity.Crawler3Entity;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.resources.ResourceLocation;

public class Crawler3Renderer extends MobRenderer<Crawler3Entity, Modelperninhaas<Crawler3Entity>> {
   public Crawler3Renderer(Context context) {
      super(context, new Modelperninhaas<>(context.bakeLayer(Modelperninhaas.LAYER_LOCATION)), 0.5F);
   }

   public ResourceLocation getTextureLocation(Crawler3Entity entity) {
      return new ResourceLocation("apocalypsenow:textures/entities/perninhaa.png");
   }
}

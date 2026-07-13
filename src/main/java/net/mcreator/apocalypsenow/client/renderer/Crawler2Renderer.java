package net.mcreator.apocalypsenow.client.renderer;

import net.mcreator.apocalypsenow.client.model.Modelperninhas;
import net.mcreator.apocalypsenow.entity.Crawler2Entity;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.resources.ResourceLocation;

public class Crawler2Renderer extends MobRenderer<Crawler2Entity, Modelperninhas<Crawler2Entity>> {
   public Crawler2Renderer(Context context) {
      super(context, new Modelperninhas<>(context.bakeLayer(Modelperninhas.LAYER_LOCATION)), 0.5F);
   }

   public ResourceLocation getTextureLocation(Crawler2Entity entity) {
      return new ResourceLocation("apocalypsenow:textures/entities/perninha.png");
   }
}

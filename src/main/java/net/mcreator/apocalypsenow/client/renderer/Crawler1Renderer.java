package net.mcreator.apocalypsenow.client.renderer;

import net.mcreator.apocalypsenow.client.model.Modelcaveiras;
import net.mcreator.apocalypsenow.entity.Crawler1Entity;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.resources.ResourceLocation;

public class Crawler1Renderer extends MobRenderer<Crawler1Entity, Modelcaveiras<Crawler1Entity>> {
   public Crawler1Renderer(Context context) {
      super(context, new Modelcaveiras<>(context.bakeLayer(Modelcaveiras.LAYER_LOCATION)), 0.5F);
   }

   public ResourceLocation getTextureLocation(Crawler1Entity entity) {
      return new ResourceLocation("apocalypsenow:textures/entities/caveira.png");
   }
}

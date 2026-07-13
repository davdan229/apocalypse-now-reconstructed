package net.mcreator.apocalypsenow.client.renderer;

import net.mcreator.apocalypsenow.client.model.Modelbarata;
import net.mcreator.apocalypsenow.entity.CockroachEntity;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.resources.ResourceLocation;

public class CockroachRenderer extends MobRenderer<CockroachEntity, Modelbarata<CockroachEntity>> {
   public CockroachRenderer(Context context) {
      super(context, new Modelbarata<>(context.bakeLayer(Modelbarata.LAYER_LOCATION)), 0.1F);
   }

   public ResourceLocation getTextureLocation(CockroachEntity entity) {
      return new ResourceLocation("apocalypsenow:textures/entities/barata.png");
   }
}

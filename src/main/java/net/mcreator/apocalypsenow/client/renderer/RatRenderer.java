package net.mcreator.apocalypsenow.client.renderer;

import net.mcreator.apocalypsenow.client.model.Modelrato;
import net.mcreator.apocalypsenow.entity.RatEntity;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.resources.ResourceLocation;

public class RatRenderer extends MobRenderer<RatEntity, Modelrato<RatEntity>> {
   public RatRenderer(Context context) {
      super(context, new Modelrato<>(context.bakeLayer(Modelrato.LAYER_LOCATION)), 0.1F);
   }

   public ResourceLocation getTextureLocation(RatEntity entity) {
      return new ResourceLocation("apocalypsenow:textures/entities/rato.png");
   }
}

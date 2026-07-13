package net.mcreator.apocalypsenow.client.renderer;

import net.mcreator.apocalypsenow.client.model.Modeldrop;
import net.mcreator.apocalypsenow.entity.MilitarydropEntity;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.resources.ResourceLocation;

public class MilitarydropRenderer extends MobRenderer<MilitarydropEntity, Modeldrop<MilitarydropEntity>> {
   public MilitarydropRenderer(Context context) {
      super(context, new Modeldrop<>(context.bakeLayer(Modeldrop.LAYER_LOCATION)), 0.5F);
   }

   public ResourceLocation getTextureLocation(MilitarydropEntity entity) {
      return new ResourceLocation("apocalypsenow:textures/entities/militarydrop.png");
   }
}

package net.mcreator.apocalypsenow.client.renderer;

import net.mcreator.apocalypsenow.entity.Soldiers02Entity;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.resources.ResourceLocation;

public class Soldiers02Renderer extends HumanoidMobRenderer<Soldiers02Entity, HumanoidModel<Soldiers02Entity>> {
   public Soldiers02Renderer(Context context) {
      super(context, new HumanoidModel<>(context.bakeLayer(ModelLayers.PLAYER)), 0.5F);
      this.addLayer(
         new HumanoidArmorLayer<>(
            this,
            new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)),
            new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)),
            context.getModelManager()
         )
      );
   }

   public ResourceLocation getTextureLocation(Soldiers02Entity entity) {
      return new ResourceLocation("apocalypsenow:textures/entities/saqueador4.png");
   }
}

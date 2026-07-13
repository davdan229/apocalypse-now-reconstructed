package net.mcreator.apocalypsenow.client.renderer;

import net.mcreator.apocalypsenow.client.model.ApocalypsenowZombieModel;

import net.mcreator.apocalypsenow.entity.Runner55Entity;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.resources.ResourceLocation;

public class Runner55Renderer extends HumanoidMobRenderer<Runner55Entity, ApocalypsenowZombieModel<Runner55Entity>> {
   public Runner55Renderer(Context context) {
      super(context, new ApocalypsenowZombieModel<>(context.bakeLayer(ModelLayers.PLAYER)), 0.5F);
      this.addLayer(
         new HumanoidArmorLayer<>(
            this,
            new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)),
            new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)),
            context.getModelManager()
         )
      );
   }

   public ResourceLocation getTextureLocation(Runner55Entity entity) {
      return new ResourceLocation("apocalypsenow:textures/entities/new55.png");
   }
}

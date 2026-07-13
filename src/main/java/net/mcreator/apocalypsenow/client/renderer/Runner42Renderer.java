package net.mcreator.apocalypsenow.client.renderer;

import net.mcreator.apocalypsenow.client.model.ApocalypsenowZombieModel;

import net.mcreator.apocalypsenow.entity.Runner42Entity;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.resources.ResourceLocation;

public class Runner42Renderer extends HumanoidMobRenderer<Runner42Entity, ApocalypsenowZombieModel<Runner42Entity>> {
   public Runner42Renderer(Context context) {
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

   public ResourceLocation getTextureLocation(Runner42Entity entity) {
      return new ResourceLocation("apocalypsenow:textures/entities/new42.png");
   }
}

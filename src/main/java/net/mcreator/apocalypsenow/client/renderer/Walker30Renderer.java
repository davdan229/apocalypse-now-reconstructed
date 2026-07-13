package net.mcreator.apocalypsenow.client.renderer;

import net.mcreator.apocalypsenow.client.model.ApocalypsenowZombieModel;

import net.mcreator.apocalypsenow.entity.Walker30Entity;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.resources.ResourceLocation;

public class Walker30Renderer extends HumanoidMobRenderer<Walker30Entity, ApocalypsenowZombieModel<Walker30Entity>> {
   public Walker30Renderer(Context context) {
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

   public ResourceLocation getTextureLocation(Walker30Entity entity) {
      return new ResourceLocation("apocalypsenow:textures/entities/new30.png");
   }
}

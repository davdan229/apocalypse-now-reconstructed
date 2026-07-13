package net.mcreator.apocalypsenow.client.renderer;

import net.mcreator.apocalypsenow.client.model.Modeldrop;
import net.mcreator.apocalypsenow.entity.MedicaldropboxEntity;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.resources.ResourceLocation;

public class MedicaldropboxRenderer extends MobRenderer<MedicaldropboxEntity, Modeldrop<MedicaldropboxEntity>> {
   public MedicaldropboxRenderer(Context context) {
      super(context, new Modeldrop<>(context.bakeLayer(Modeldrop.LAYER_LOCATION)), 0.5F);
   }

   public ResourceLocation getTextureLocation(MedicaldropboxEntity entity) {
      return new ResourceLocation("apocalypsenow:textures/entities/medicaldrop.png");
   }
}

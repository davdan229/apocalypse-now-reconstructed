package net.mcreator.apocalypsenow.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public class Modelbandana<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("apocalypsenow", "modelbandana"), "main");
   public final ModelPart Head;

   public Modelbandana(ModelPart root) {
      this.Head = root.getChild("Head");
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.getRoot();
      PartDefinition Head = partdefinition.addOrReplaceChild(
         "Head",
         CubeListBuilder.create()
            .texOffs(0, 6)
            .addBox(-5.0F, -4.0F, -4.5F, 0.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(0, 1)
            .addBox(5.0F, -4.0F, -4.5F, 0.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(8, 3)
            .addBox(-5.0F, -3.0F, -0.5F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(8, 6)
            .addBox(5.0F, -3.0F, -0.5F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(8, 10)
            .addBox(-5.0F, -2.0F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(10, 10)
            .addBox(5.0F, -2.0F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-5.0F, -4.0F, -4.5F, 10.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      return LayerDefinition.create(meshdefinition, 32, 32);
   }

   @Override
   public void renderToBuffer(
      PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha
   ) {
      this.Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
   }

   @Override
   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
      this.Head.yRot = netHeadYaw / (180.0F / (float)Math.PI);
      this.Head.xRot = headPitch / (180.0F / (float)Math.PI);
   }
}

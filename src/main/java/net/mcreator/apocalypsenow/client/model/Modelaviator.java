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

public class Modelaviator<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("apocalypsenow", "modelaviator"), "main");
   public final ModelPart Head;

   public Modelaviator(ModelPart root) {
      this.Head = root.getChild("Head");
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.getRoot();
      PartDefinition Head = partdefinition.addOrReplaceChild(
         "Head",
         CubeListBuilder.create()
            .texOffs(20, 22)
            .addBox(-4.5F, -9.0F, -5.0F, 9.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(32, 25)
            .addBox(-2.1F, -8.7F, -6.3F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-4.5F, -9.0F, -5.0F, 9.0F, 0.0F, 10.0F, new CubeDeformation(0.0F))
            .texOffs(20, 10)
            .addBox(-4.5F, -9.0F, 5.0F, 9.0F, 8.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(28, 8)
            .addBox(-3.5F, -1.0F, 5.0F, 7.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 8)
            .addBox(-4.5F, -9.0F, -5.0F, 0.0F, 8.0F, 10.0F, new CubeDeformation(0.0F))
            .texOffs(0, 18)
            .addBox(-5.1F, -8.0F, -4.9F, 0.0F, 2.0F, 10.0F, new CubeDeformation(0.0F))
            .texOffs(0, 16)
            .addBox(4.9F, -8.0F, -4.9F, 0.0F, 2.0F, 10.0F, new CubeDeformation(0.0F))
            .texOffs(20, 20)
            .addBox(-5.1F, -8.0F, 5.1F, 10.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(28, 0)
            .addBox(-6.4F, -7.1F, -2.0F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(20, 25)
            .addBox(4.4F, -7.1F, -2.0F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(20, 11)
            .addBox(-4.5F, -1.0F, -4.0F, 0.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
            .texOffs(2, 0)
            .addBox(-4.6F, -1.0F, -4.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(2, 3)
            .addBox(-4.6F, 1.0F, -5.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 3)
            .addBox(4.6F, 1.0F, -5.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(4.6F, -1.0F, -4.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(20, 10)
            .addBox(4.5F, -1.0F, -4.0F, 0.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(4.5F, -9.0F, -5.0F, 0.0F, 8.0F, 10.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition cube_r1 = Head.addOrReplaceChild(
         "cube_r1",
         CubeListBuilder.create().texOffs(0, 30).addBox(-4.0F, -3.0F, -6.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(2.8F, -5.8F, 0.7F, 0.0F, -0.4363F, 0.0F)
      );
      PartDefinition cube_r2 = Head.addOrReplaceChild(
         "cube_r2",
         CubeListBuilder.create().texOffs(30, 31).addBox(-5.0F, -3.0F, -6.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(1.8F, -5.8F, -1.6F, 0.0F, 0.4363F, 0.0F)
      );
      return LayerDefinition.create(meshdefinition, 64, 64);
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

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

public class Modelplague<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("apocalypsenow", "modelplague"), "main");
   public final ModelPart Head;

   public Modelplague(ModelPart root) {
      this.Head = root.getChild("Head");
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.getRoot();
      PartDefinition Head = partdefinition.addOrReplaceChild(
         "Head",
         CubeListBuilder.create()
            .texOffs(0, 9)
            .addBox(-4.0F, -8.0F, -6.0F, 8.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(13, 0)
            .addBox(-2.0F, -4.3F, -8.9F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-1.0F, -8.01F, -4.9F, 2.0F, 0.0F, 9.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-1.0F, -8.01F, 4.101F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 12)
            .addBox(4.01F, -5.4F, -4.9F, 0.0F, 2.0F, 9.0F, new CubeDeformation(0.0F))
            .texOffs(0, 10)
            .addBox(-4.01F, -5.4F, -4.9F, 0.0F, 2.0F, 9.0F, new CubeDeformation(0.0F))
            .texOffs(13, 7)
            .addBox(-4.01F, -5.4F, 4.1F, 8.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition cube_r1 = Head.addOrReplaceChild(
         "cube_r1",
         CubeListBuilder.create().texOffs(0, 3).addBox(-0.91F, -6.0F, 9.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-0.1F, -13.1F, 9.1F, -2.5307F, 0.0F, 0.0F)
      );
      PartDefinition cube_r2 = Head.addOrReplaceChild(
         "cube_r2",
         CubeListBuilder.create().texOffs(4, 0).addBox(-0.91F, -6.0F, 9.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-0.1F, -9.7F, -4.4F, -0.9425F, 0.0F, 0.0F)
      );
      PartDefinition cube_r3 = Head.addOrReplaceChild(
         "cube_r3",
         CubeListBuilder.create()
            .texOffs(4, 1)
            .addBox(1.0F, -2.0F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 4)
            .addBox(1.0F, -3.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-1.0F, 0.3F, -14.7F, 0.0698F, 0.0F, 0.0F)
      );
      PartDefinition cube_r4 = Head.addOrReplaceChild(
         "cube_r4",
         CubeListBuilder.create().texOffs(20, 9).addBox(-1.0F, -3.0F, -2.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, -11.9F, 0.0698F, 0.0F, 0.0F)
      );
      PartDefinition cube_r5 = Head.addOrReplaceChild(
         "cube_r5",
         CubeListBuilder.create().texOffs(18, 16).addBox(-2.0F, -3.0F, -2.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.5F, -0.8F, -9.4F, 0.0698F, 0.0F, 0.0F)
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

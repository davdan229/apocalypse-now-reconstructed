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
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;

public class Modelswat<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("apocalypsenow", "modelswat"), "main");
   public final ModelPart Head;
   public final ModelPart Body;
   public final ModelPart RightArm;
   public final ModelPart LeftArm;
   public final ModelPart RightLeg;
   public final ModelPart LeftLeg;

   public Modelswat(ModelPart root) {
      this.Head = root.getChild("Head");
      this.Body = root.getChild("Body");
      this.RightArm = root.getChild("RightArm");
      this.LeftArm = root.getChild("LeftArm");
      this.RightLeg = root.getChild("RightLeg");
      this.LeftLeg = root.getChild("LeftLeg");
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.getRoot();
      PartDefinition Head = partdefinition.addOrReplaceChild(
         "Head",
         CubeListBuilder.create()
            .texOffs(10, 16)
            .addBox(4.0F, -8.0F, -4.0F, 1.0F, 7.0F, 8.0F, new CubeDeformation(0.0F))
            .texOffs(20, 17)
            .addBox(4.5F, -2.3F, -6.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(20, 16)
            .addBox(3.5F, -2.3F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 9)
            .addBox(-5.0F, -8.0F, -4.0F, 1.0F, 7.0F, 8.0F, new CubeDeformation(0.0F))
            .texOffs(42, 33)
            .addBox(-4.0F, -8.0F, 4.0F, 8.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(10, 13)
            .addBox(-4.0F, -8.0F, -4.8F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(24, 0)
            .addBox(-4.0F, -6.0F, -5.0F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 29)
            .addBox(-4.0F, -3.0F, -5.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(20, 22)
            .addBox(1.0F, -3.0F, -5.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-4.0F, -9.0F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition Body = partdefinition.addOrReplaceChild(
         "Body",
         CubeListBuilder.create()
            .texOffs(40, 21)
            .addBox(-4.0F, 1.0F, -3.0F, 8.0F, 11.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 9)
            .addBox(0.8F, 5.7F, -3.6F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(24, 4)
            .addBox(0.8F, 1.7F, -3.6F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-2.4F, 5.7F, -3.6F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(42, 0)
            .addBox(-4.0F, 0.0F, -3.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(18, 36)
            .addBox(2.0F, 0.0F, -3.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 31)
            .addBox(-4.0F, 0.0F, 2.0F, 8.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(10, 9)
            .addBox(-4.0F, 2.0F, 2.6F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition Body_r1 = Body.addOrReplaceChild(
         "Body_r1",
         CubeListBuilder.create()
            .texOffs(20, 18)
            .addBox(-3.0F, -1.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(18, 31)
            .addBox(-4.0F, 0.0F, -4.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6109F)
      );
      PartDefinition RightArm = partdefinition.addOrReplaceChild(
         "RightArm",
         CubeListBuilder.create()
            .texOffs(54, 0)
            .addBox(-3.0F, -2.0F, -2.9F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(54, 50)
            .addBox(-3.0F, -2.2F, -1.9F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(46, 41)
            .addBox(-3.0F, -2.0F, 1.9F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 44)
            .addBox(-3.9F, -2.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(18, 39)
            .addBox(0.5F, -2.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-5.0F, 2.0F, 0.0F)
      );
      PartDefinition LeftArm = partdefinition.addOrReplaceChild(
         "LeftArm",
         CubeListBuilder.create()
            .texOffs(45, 54)
            .addBox(-1.0F, -2.0F, -2.9F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(27, 54)
            .addBox(-1.0F, -2.0F, 1.9F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(44, 16)
            .addBox(-1.0F, -2.2F, -2.1F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(44, 0)
            .addBox(2.9F, -2.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(36, 39)
            .addBox(-1.5F, -2.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offset(5.0F, 2.0F, 0.0F)
      );
      PartDefinition RightLeg = partdefinition.addOrReplaceChild(
         "RightLeg",
         CubeListBuilder.create()
            .texOffs(28, 5)
            .addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(54, 13)
            .addBox(-2.0F, 11.0F, -4.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(10, 51)
            .addBox(-2.5F, 8.0F, -1.9F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(0, 24)
            .addBox(-2.0F, 8.0F, 1.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(56, 41)
            .addBox(-2.0F, 8.5F, -2.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-2.0F, 12.0F, 0.0F)
      );
      PartDefinition cube_r1 = RightLeg.addOrReplaceChild(
         "cube_r1",
         CubeListBuilder.create().texOffs(6, 44).addBox(-2.0F, 8.6F, -7.8F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4363F, 0.0F, 0.0F)
      );
      PartDefinition LeftLeg = partdefinition.addOrReplaceChild(
         "LeftLeg",
         CubeListBuilder.create()
            .texOffs(24, 27)
            .addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(55, 55)
            .addBox(-2.0F, 11.0F, -4.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(16, 55)
            .addBox(1.5F, 8.0F, -1.9F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(56, 44)
            .addBox(-2.0F, 8.5F, -2.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(28, 22)
            .addBox(-2.0F, 8.0F, 1.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(2.0F, 12.0F, 0.0F)
      );
      PartDefinition cube_r2 = LeftLeg.addOrReplaceChild(
         "cube_r2",
         CubeListBuilder.create().texOffs(56, 16).addBox(-2.0F, 8.5F, -7.8F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4363F, 0.0F, 0.0F)
      );
      return LayerDefinition.create(meshdefinition, 128, 128);
   }

   @Override
   public void renderToBuffer(
      PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha
   ) {
      this.Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
      this.Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
      this.RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
      this.LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
      this.RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
      this.LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
   }

   @Override
   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
      this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
      this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
      this.Head.yRot = netHeadYaw / (180.0F / (float)Math.PI);
      this.Head.xRot = headPitch / (180.0F / (float)Math.PI);
      this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
      this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
   }
}

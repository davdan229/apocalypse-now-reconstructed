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

public class Modelforest<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("apocalypsenow", "modelforest"), "main");
   public final ModelPart Head;
   public final ModelPart Body;
   public final ModelPart RightArm;
   public final ModelPart LeftArm;
   public final ModelPart RightLeg;
   public final ModelPart LeftLeg;

   public Modelforest(ModelPart root) {
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
            .texOffs(32, 30)
            .addBox(4.0F, -8.0F, -4.0F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-7.0F, -6.0F, -6.0F, 14.0F, 1.0F, 12.0F, new CubeDeformation(0.0F))
            .texOffs(22, 13)
            .addBox(7.0F, -6.0F, -5.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
            .texOffs(0, 22)
            .addBox(-8.0F, -6.0F, -5.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
            .texOffs(34, 20)
            .addBox(-6.0F, -6.0F, -7.0F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(34, 18)
            .addBox(-6.0F, -6.0F, 6.0F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(10, 38)
            .addBox(-5.0F, -8.0F, -4.0F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F))
            .texOffs(40, 8)
            .addBox(-4.0F, -8.0F, 4.0F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(40, 0)
            .addBox(-4.0F, -8.0F, -5.0F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 13)
            .addBox(-4.0F, -9.0F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition Body = partdefinition.addOrReplaceChild(
         "Body",
         CubeListBuilder.create()
            .texOffs(22, 24)
            .addBox(-4.0F, 0.0F, -3.0F, 8.0F, 13.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 13)
            .addBox(1.3F, 1.7F, -3.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(34, 13)
            .addBox(-4.0F, -0.2F, -2.0F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(0, 33)
            .addBox(-4.0F, 0.0F, 1.7F, 8.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(28, 40)
            .addBox(-4.5F, 0.8F, -2.0F, 1.0F, 11.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(38, 40)
            .addBox(3.4F, 1.0F, -2.0F, 1.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition RightArm = partdefinition.addOrReplaceChild(
         "RightArm",
         CubeListBuilder.create()
            .texOffs(48, 52)
            .addBox(-3.0F, -2.0F, -2.9F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 8)
            .addBox(-3.0F, 4.0F, -2.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(42, 27)
            .addBox(-3.0F, -2.2F, -1.9F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(52, 32)
            .addBox(-3.0F, -2.0F, 1.9F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 46)
            .addBox(-3.9F, -2.0F, -1.9F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(0, 22)
            .addBox(-0.6F, -2.0F, -2.0F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-5.0F, 2.0F, 0.0F)
      );
      PartDefinition LeftArm = partdefinition.addOrReplaceChild(
         "LeftArm",
         CubeListBuilder.create()
            .texOffs(40, 3)
            .addBox(-1.0F, -2.2F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(0, 56)
            .addBox(-0.9F, -2.0F, -2.9F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(40, 22)
            .addBox(-1.1F, 3.3F, -1.9F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(37, 55)
            .addBox(-0.9F, -2.0F, 1.9F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(10, 48)
            .addBox(2.6F, -2.0F, -2.0F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(12, 22)
            .addBox(-1.4F, -2.0F, -2.0F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offset(5.0F, 2.0F, 0.0F)
      );
      PartDefinition RightLeg = partdefinition.addOrReplaceChild(
         "RightLeg",
         CubeListBuilder.create()
            .texOffs(52, 22)
            .addBox(-2.0F, 11.0F, -4.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(46, 36)
            .addBox(-2.5F, 8.0F, -1.9F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(46, 36)
            .addBox(1.3F, 8.0F, -1.9F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-2.0F, 12.0F, -1.9F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(54, 11)
            .addBox(-2.0F, 8.0F, 1.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(42, 32)
            .addBox(-2.0F, 8.0F, -2.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-2.0F, 12.0F, 0.0F)
      );
      PartDefinition cube_r1 = RightLeg.addOrReplaceChild(
         "cube_r1",
         CubeListBuilder.create().texOffs(52, 3).addBox(-2.0F, 8.6F, -7.8F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4363F, 0.0F, 0.0F)
      );
      PartDefinition LeftLeg = partdefinition.addOrReplaceChild(
         "LeftLeg",
         CubeListBuilder.create()
            .texOffs(20, 38)
            .addBox(-2.0F, 8.0F, 1.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(16, 48)
            .addBox(-2.0F, 11.0F, -4.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(48, 44)
            .addBox(1.5F, 8.0F, -1.9F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(48, 44)
            .addBox(-2.4F, 8.0F, -1.9F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(0, 4)
            .addBox(-2.0F, 12.0F, -1.9F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(54, 44)
            .addBox(-2.0F, 8.0F, -2.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(2.0F, 12.0F, 0.0F)
      );
      PartDefinition cube_r2 = LeftLeg.addOrReplaceChild(
         "cube_r2",
         CubeListBuilder.create().texOffs(54, 25).addBox(-1.9F, 8.5F, -7.8F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-0.1F, 0.0F, 0.0F, 0.4363F, 0.0F, 0.0F)
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

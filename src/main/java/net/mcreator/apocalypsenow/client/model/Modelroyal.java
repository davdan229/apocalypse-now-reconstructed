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

public class Modelroyal<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("apocalypsenow", "modelroyal"), "main");
   public final ModelPart Head;
   public final ModelPart Body;
   public final ModelPart RightArm;
   public final ModelPart LeftArm;
   public final ModelPart RightLeg;
   public final ModelPart LeftLeg;

   public Modelroyal(ModelPart root) {
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
            .texOffs(18, 41)
            .addBox(4.0F, -9.0F, -4.0F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.0F))
            .texOffs(36, 33)
            .addBox(-5.0F, -9.0F, -4.0F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-7.0F, -6.0F, -7.0F, 14.0F, 1.0F, 14.0F, new CubeDeformation(0.0F))
            .texOffs(34, 17)
            .addBox(-6.0F, -6.0F, 7.0F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(34, 15)
            .addBox(-6.0F, -6.0F, -8.0F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 25)
            .addBox(7.0F, -6.0F, -6.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F))
            .texOffs(20, 15)
            .addBox(-8.0F, -6.0F, -6.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F))
            .texOffs(52, 19)
            .addBox(-4.0F, -9.0F, 4.0F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(42, 10)
            .addBox(-4.0F, -9.0F, -4.8F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 15)
            .addBox(-4.0F, -10.0F, -4.0F, 8.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition Body = partdefinition.addOrReplaceChild(
         "Body",
         CubeListBuilder.create()
            .texOffs(0, 38)
            .addBox(-4.0F, 1.0F, -3.0F, 8.0F, 11.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(22, 82)
            .addBox(-4.0F, 8.0F, -4.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 77)
            .addBox(3.3F, 1.0F, -2.0F, 1.0F, 11.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(0, 53)
            .addBox(-4.2F, 1.0F, -2.0F, 1.0F, 11.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(56, 0)
            .addBox(-4.0F, 0.0F, -3.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(51, 55)
            .addBox(2.0F, 0.0F, -3.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(26, 28)
            .addBox(-4.0F, 0.0F, 2.0F, 8.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition RightArm = partdefinition.addOrReplaceChild(
         "RightArm",
         CubeListBuilder.create()
            .texOffs(10, 52)
            .addBox(-3.0F, -2.0F, -2.9F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(97, 0)
            .addBox(-4.0F, -2.2F, -3.0F, 5.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-3.4F, -2.0F, 1.9F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 50)
            .addBox(-3.9F, -2.0F, -1.9F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(46, 19)
            .addBox(0.1F, -2.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-5.0F, 2.0F, 0.0F)
      );
      PartDefinition LeftArm = partdefinition.addOrReplaceChild(
         "LeftArm",
         CubeListBuilder.create()
            .texOffs(54, 35)
            .addBox(-1.0F, -2.0F, -2.9F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(20, 52)
            .addBox(-1.0F, -2.0F, 1.9F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(83, 0)
            .addBox(-1.0F, -2.2F, -3.0F, 5.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
            .texOffs(46, 44)
            .addBox(-1.5F, -2.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(36, 44)
            .addBox(2.5F, -2.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offset(5.0F, 2.0F, 0.0F)
      );
      PartDefinition RightLeg = partdefinition.addOrReplaceChild(
         "RightLeg",
         CubeListBuilder.create()
            .texOffs(60, 54)
            .addBox(-2.0F, 11.0F, -4.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
            .texOffs(56, 23)
            .addBox(-2.5F, 5.0F, -2.0F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(0, 25)
            .addBox(1.5F, 5.0F, -2.0F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(34, 19)
            .addBox(-2.0F, 5.0F, 1.5F, 4.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(56, 48)
            .addBox(-2.0F, 5.5F, -2.5F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-2.0F, 12.0F, 0.0F)
      );
      PartDefinition cube_r1 = RightLeg.addOrReplaceChild(
         "cube_r1",
         CubeListBuilder.create().texOffs(28, 44).addBox(-2.0F, 8.6F, -7.8F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4363F, 0.0F, 0.0F)
      );
      PartDefinition LeftLeg = partdefinition.addOrReplaceChild(
         "LeftLeg",
         CubeListBuilder.create()
            .texOffs(60, 57)
            .addBox(-2.0F, 11.0F, -4.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
            .texOffs(30, 56)
            .addBox(1.5F, 5.0F, -2.0F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(14, 25)
            .addBox(-2.3F, 5.0F, -2.0F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(40, 60)
            .addBox(-2.1F, 5.5F, -2.5F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(60, 6)
            .addBox(-2.0F, 5.0F, 1.5F, 4.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(2.0F, 12.0F, 0.0F)
      );
      PartDefinition cube_r2 = LeftLeg.addOrReplaceChild(
         "cube_r2",
         CubeListBuilder.create().texOffs(61, 15).addBox(-2.0F, 8.6F, -7.6F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
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

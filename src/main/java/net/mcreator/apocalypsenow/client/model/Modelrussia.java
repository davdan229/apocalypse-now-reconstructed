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

public class Modelrussia<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("apocalypsenow", "modelrussia"), "main");
   public final ModelPart Head;
   public final ModelPart Body;
   public final ModelPart RightArm;
   public final ModelPart LeftArm;
   public final ModelPart RightLeg;
   public final ModelPart LeftLeg;

   public Modelrussia(ModelPart root) {
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
            .texOffs(38, 8)
            .addBox(-4.0F, -8.0F, 4.0F, 8.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(44, 2)
            .addBox(-4.0F, -8.0F, -5.0F, 8.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(52, 16)
            .addBox(-4.0F, -8.0F, -6.0F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(20, 21)
            .addBox(-4.0F, -5.0F, -6.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(10, 15)
            .addBox(1.0F, -5.0F, -6.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-4.0F, -9.0F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
            .texOffs(0, 9)
            .addBox(-5.0F, -8.0F, -4.0F, 1.0F, 7.0F, 8.0F, new CubeDeformation(0.0F))
            .texOffs(38, 0)
            .addBox(-5.0F, -1.0F, -1.0F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition Body = partdefinition.addOrReplaceChild(
         "Body",
         CubeListBuilder.create()
            .texOffs(28, 21)
            .addBox(-4.0F, 1.0F, -3.0F, 8.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(38, 16)
            .addBox(-3.7F, 7.0F, -4.0F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(10, 9)
            .addBox(-3.7F, 2.0F, -5.0F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(59, 46)
            .addBox(-0.2F, 6.1F, -4.5F, 4.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(0, 24)
            .addBox(-0.5F, 0.5F, -4.0F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(50, 44)
            .addBox(-4.0F, 11.0F, -3.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 55)
            .addBox(-4.0F, 0.0F, -3.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(54, 54)
            .addBox(1.0F, 0.0F, -3.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(56, 14)
            .addBox(-3.0F, 12.0F, -3.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(14, 31)
            .addBox(-2.0F, 13.0F, -3.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(24, 0)
            .addBox(2.0F, 0.0F, 2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(20, 9)
            .addBox(-4.0F, 1.0F, 2.0F, 8.0F, 11.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(46, 16)
            .addBox(3.0F, 1.0F, -2.0F, 1.0F, 11.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(40, 32)
            .addBox(-4.0F, 1.0F, -2.0F, 1.0F, 11.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(30, 48)
            .addBox(0.0F, 8.0F, 3.0F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(24, 2)
            .addBox(-4.0F, 0.0F, 2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(56, 12)
            .addBox(-3.0F, 12.0F, 2.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(14, 33)
            .addBox(-2.0F, 13.0F, 2.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition Body_r1 = Body.addOrReplaceChild(
         "Body_r1",
         CubeListBuilder.create().texOffs(60, 30).addBox(1.4F, -1.4F, -5.0F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3491F)
      );
      PartDefinition RightArm = partdefinition.addOrReplaceChild(
         "RightArm",
         CubeListBuilder.create()
            .texOffs(50, 31)
            .addBox(-3.0F, -2.0F, -2.6F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(49, 46)
            .addBox(-3.0F, -2.0F, 1.6F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(10, 39)
            .addBox(-3.6F, -2.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(0, 39)
            .addBox(0.4F, -2.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(26, 56)
            .addBox(-3.0F, -2.4F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(56, 25)
            .addBox(-3.0F, 9.4F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-5.0F, 2.0F, 0.0F)
      );
      PartDefinition LeftArm = partdefinition.addOrReplaceChild(
         "LeftArm",
         CubeListBuilder.create()
            .texOffs(20, 47)
            .addBox(-1.0F, -2.0F, -2.6F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(39, 47)
            .addBox(-1.0F, -2.0F, 1.6F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(20, 31)
            .addBox(-1.6F, -2.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(56, 7)
            .addBox(-1.0F, -2.4F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(30, 32)
            .addBox(2.6F, -2.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(56, 20)
            .addBox(-1.0F, 9.4F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offset(5.0F, 2.0F, 0.0F)
      );
      PartDefinition RightLeg = partdefinition.addOrReplaceChild(
         "RightLeg",
         CubeListBuilder.create()
            .texOffs(24, 0)
            .addBox(-2.0F, 10.0F, -4.0F, 4.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
            .texOffs(22, 61)
            .addBox(-2.0F, 8.0F, 1.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 61)
            .addBox(-2.0F, 8.0F, -2.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-2.5F, 8.0F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
            .texOffs(0, 9)
            .addBox(1.0F, 8.0F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-2.0F, 12.0F, 0.0F)
      );
      PartDefinition LeftLeg = partdefinition.addOrReplaceChild(
         "LeftLeg",
         CubeListBuilder.create()
            .texOffs(0, 31)
            .addBox(-2.0F, 10.0F, -4.0F, 4.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
            .texOffs(45, 59)
            .addBox(1.6F, 8.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(12, 57)
            .addBox(-2.4F, 8.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(55, 60)
            .addBox(-2.0F, 8.0F, 1.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(60, 36)
            .addBox(-2.0F, 8.0F, -2.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(2.0F, 12.0F, 0.0F)
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

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

public class Modelusa<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("apocalypsenow", "modelusa"), "main");
   public final ModelPart Head;
   public final ModelPart Body;
   public final ModelPart RightArm;
   public final ModelPart LeftArm;
   public final ModelPart RightLeg;
   public final ModelPart LeftLeg;

   public Modelusa(ModelPart root) {
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
            .addBox(4.0F, -8.0F, -4.0F, 1.0F, 6.0F, 8.0F, new CubeDeformation(0.0F))
            .texOffs(0, 10)
            .addBox(-5.0F, -8.0F, -4.0F, 1.0F, 6.0F, 8.0F, new CubeDeformation(0.0F))
            .texOffs(30, 43)
            .addBox(-4.0F, -8.0F, 4.0F, 8.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(50, 47)
            .addBox(-4.0F, -8.0F, -4.8F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(48, 13)
            .addBox(-4.0F, -8.5F, -5.8F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 10)
            .addBox(-4.0F, -5.5F, -5.8F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 6)
            .addBox(1.0F, -5.5F, -5.8F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-4.0F, -9.0F, -4.0F, 8.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition Body = partdefinition.addOrReplaceChild(
         "Body",
         CubeListBuilder.create()
            .texOffs(28, 23)
            .addBox(-4.0F, 1.0F, -3.0F, 8.0F, 11.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(58, 10)
            .addBox(-3.0F, 12.0F, -3.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-4.0F, 6.0F, -4.0F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(44, 47)
            .addBox(3.3F, 1.0F, -2.0F, 1.0F, 11.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(46, 19)
            .addBox(-4.2F, 1.0F, -2.0F, 1.0F, 11.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(58, 4)
            .addBox(-4.0F, 0.0F, -3.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(10, 54)
            .addBox(3.0F, 0.0F, -3.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(20, 10)
            .addBox(-4.0F, 0.0F, 2.0F, 8.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(58, 2)
            .addBox(-4.0F, 10.0F, 2.2F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(58, 0)
            .addBox(-4.0F, 8.0F, 2.2F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(54, 57)
            .addBox(-4.0F, 6.0F, 2.2F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(56, 32)
            .addBox(-4.0F, 4.0F, 2.2F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(56, 30)
            .addBox(-4.0F, 2.0F, 2.2F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(56, 28)
            .addBox(-4.0F, 0.1F, 2.2F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(54, 51)
            .addBox(-4.0F, 10.6F, -3.1F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(54, 53)
            .addBox(-4.0F, 8.6F, -3.1F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(54, 55)
            .addBox(-4.0F, 6.6F, -3.1F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(56, 22)
            .addBox(-4.0F, 4.6F, -3.1F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(56, 24)
            .addBox(-4.0F, 2.6F, -3.1F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(56, 26)
            .addBox(-4.0F, 0.7F, -3.1F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition RightArm = partdefinition.addOrReplaceChild(
         "RightArm",
         CubeListBuilder.create()
            .texOffs(0, 53)
            .addBox(-3.0F, -2.0F, -2.9F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 30)
            .addBox(-4.0F, -2.1F, -3.0F, 5.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
            .texOffs(30, 51)
            .addBox(-3.0F, -2.0F, 1.9F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(20, 42)
            .addBox(-3.5F, -2.0F, -1.9F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(38, 7)
            .addBox(0.1F, -2.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-5.0F, 2.0F, 0.0F)
      );
      PartDefinition LeftArm = partdefinition.addOrReplaceChild(
         "LeftArm",
         CubeListBuilder.create()
            .texOffs(50, 34)
            .addBox(-1.0F, -2.0F, -2.9F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(48, 0)
            .addBox(-1.0F, -2.0F, 1.9F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(52, 17)
            .addBox(-1.0F, 9.3F, -2.1F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(24, 0)
            .addBox(-1.0F, -2.1F, -3.0F, 5.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
            .texOffs(10, 38)
            .addBox(-1.5F, -2.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(0, 37)
            .addBox(2.5F, -2.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offset(5.0F, 2.0F, 0.0F)
      );
      PartDefinition RightLeg = partdefinition.addOrReplaceChild(
         "RightLeg",
         CubeListBuilder.create()
            .texOffs(16, 35)
            .addBox(-2.0F, 11.0F, -4.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
            .texOffs(10, 60)
            .addBox(-2.5F, 8.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(20, 58)
            .addBox(1.5F, 8.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(10, 10)
            .addBox(-2.0F, 8.0F, 1.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(60, 42)
            .addBox(-2.0F, 8.5F, -2.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-2.0F, 12.0F, 0.0F)
      );
      PartDefinition cube_r1 = RightLeg.addOrReplaceChild(
         "cube_r1",
         CubeListBuilder.create().texOffs(16, 30).addBox(-2.0F, 8.6F, -7.8F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4363F, 0.0F, 0.0F)
      );
      PartDefinition LeftLeg = partdefinition.addOrReplaceChild(
         "LeftLeg",
         CubeListBuilder.create()
            .texOffs(30, 36)
            .addBox(-2.0F, 11.0F, -4.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
            .texOffs(60, 34)
            .addBox(1.5F, 8.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(50, 59)
            .addBox(-2.3F, 8.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(32, 7)
            .addBox(-2.0F, 8.4F, -2.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 24)
            .addBox(-2.0F, 8.0F, 1.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(2.0F, 12.0F, 0.0F)
      );
      PartDefinition cube_r2 = LeftLeg.addOrReplaceChild(
         "cube_r2",
         CubeListBuilder.create().texOffs(56, 59).addBox(-2.1F, 8.6F, -7.6F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
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

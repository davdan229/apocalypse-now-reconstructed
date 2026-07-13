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

public class Modelchina<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("apocalypsenow", "modelchina"), "main");
   public final ModelPart Head;
   public final ModelPart Body;
   public final ModelPart RightArm;
   public final ModelPart LeftArm;
   public final ModelPart RightLeg;
   public final ModelPart LeftLeg;

   public Modelchina(ModelPart root) {
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
            .texOffs(24, 0)
            .addBox(-4.0F, -8.0F, 4.0F, 8.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(42, 0)
            .addBox(-4.0F, -8.0F, -5.0F, 8.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(46, 21)
            .addBox(-4.0F, -8.0F, -6.0F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(16, 31)
            .addBox(-4.0F, -5.0F, -6.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(20, 21)
            .addBox(1.0F, -5.0F, -6.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-4.0F, -9.0F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
            .texOffs(0, 9)
            .addBox(-5.0F, -8.0F, -4.0F, 1.0F, 7.0F, 8.0F, new CubeDeformation(0.0F))
            .texOffs(36, 32)
            .addBox(-5.0F, -1.0F, -1.0F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition Body = partdefinition.addOrReplaceChild(
         "Body",
         CubeListBuilder.create()
            .texOffs(28, 21)
            .addBox(-4.0F, 1.0F, -3.0F, 8.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(46, 57)
            .addBox(-3.9F, 4.0F, -4.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(40, 56)
            .addBox(1.9F, 4.0F, -4.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(55, 52)
            .addBox(-1.0F, 4.0F, -4.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(26, 32)
            .addBox(-2.5F, 9.3F, -4.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(48, 19)
            .addBox(-3.0F, 11.0F, -3.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(35, 47)
            .addBox(-4.0F, 0.0F, -3.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(20, 47)
            .addBox(2.0F, 0.0F, -3.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(42, 5)
            .addBox(-2.0F, 12.0F, -3.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(16, 33)
            .addBox(2.0F, 0.0F, 2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(20, 9)
            .addBox(-4.0F, 1.0F, 2.0F, 8.0F, 11.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(29, 48)
            .addBox(-4.0F, 0.0F, 2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(46, 30)
            .addBox(-3.0F, 12.0F, 2.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(10, 14)
            .addBox(-2.0F, 13.0F, 2.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition RightArm = partdefinition.addOrReplaceChild(
         "RightArm",
         CubeListBuilder.create()
            .texOffs(10, 47)
            .addBox(-3.0F, -2.0F, -2.6F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(40, 34)
            .addBox(-3.0F, -2.0F, 1.6F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(30, 32)
            .addBox(-3.6F, -2.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(20, 31)
            .addBox(0.4F, -2.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(48, 10)
            .addBox(-3.0F, -2.4F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(48, 5)
            .addBox(-3.0F, 9.4F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-5.0F, 2.0F, 0.0F)
      );
      PartDefinition LeftArm = partdefinition.addOrReplaceChild(
         "LeftArm",
         CubeListBuilder.create()
            .texOffs(38, 8)
            .addBox(-1.0F, -2.0F, -2.6F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 40)
            .addBox(-1.0F, -2.0F, 1.6F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 24)
            .addBox(-1.6F, -2.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(46, 25)
            .addBox(-1.0F, -2.4F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(10, 31)
            .addBox(2.4F, -2.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(46, 43)
            .addBox(-1.0F, 9.4F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offset(5.0F, 2.0F, 0.0F)
      );
      PartDefinition RightLeg = partdefinition.addOrReplaceChild(
         "RightLeg",
         CubeListBuilder.create()
            .texOffs(44, 11)
            .addBox(-2.0F, 10.0F, -4.0F, 4.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
            .texOffs(30, 53)
            .addBox(-2.0F, 8.0F, 1.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(20, 53)
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
            .texOffs(47, 44)
            .addBox(-2.0F, 10.0F, -4.0F, 4.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
            .texOffs(50, 34)
            .addBox(1.6F, 8.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(45, 49)
            .addBox(-2.4F, 8.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(0, 53)
            .addBox(-2.0F, 8.0F, 1.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(10, 9)
            .addBox(-2.0F, 8.0F, -2.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(2.0F, 12.0F, 0.0F)
      );
      return LayerDefinition.create(meshdefinition, 64, 64);
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

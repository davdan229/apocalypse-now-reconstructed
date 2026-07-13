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

public class Modeljuggernaut<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("apocalypsenow", "modeljuggernaut"), "main");
   public final ModelPart Head;
   public final ModelPart Body;
   public final ModelPart RightArm;
   public final ModelPart LeftArm;
   public final ModelPart RightLeg;
   public final ModelPart LeftLeg;

   public Modeljuggernaut(ModelPart root) {
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
            .texOffs(10, 35)
            .addBox(4.0F, -8.0F, -4.0F, 1.0F, 7.0F, 8.0F, new CubeDeformation(0.0F))
            .texOffs(19, 9)
            .addBox(5.0F, -3.0F, -4.0F, 2.0F, 3.0F, 9.0F, new CubeDeformation(0.0F))
            .texOffs(24, 25)
            .addBox(6.0F, -7.0F, -4.0F, 1.0F, 4.0F, 9.0F, new CubeDeformation(0.0F))
            .texOffs(32, 10)
            .addBox(-6.0F, -7.0F, 5.0F, 12.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(44, 37)
            .addBox(-6.0F, -4.0F, -6.0F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(13, 21)
            .addBox(-7.0F, -7.0F, -4.0F, 1.0F, 4.0F, 9.0F, new CubeDeformation(0.0F))
            .texOffs(24, 0)
            .addBox(-6.0F, -3.0F, -6.0F, 12.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(0, 16)
            .addBox(-7.0F, -3.0F, -4.0F, 2.0F, 3.0F, 9.0F, new CubeDeformation(0.0F))
            .texOffs(32, 5)
            .addBox(-6.0F, -3.0F, 4.0F, 12.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(58, 0)
            .addBox(-4.0F, -8.0F, 4.0F, 8.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(64, 6)
            .addBox(-4.0F, -8.0F, -5.0F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-4.0F, -9.0F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
            .texOffs(0, 28)
            .addBox(-5.0F, -8.0F, -4.0F, 1.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition Body = partdefinition.addOrReplaceChild(
         "Body",
         CubeListBuilder.create()
            .texOffs(28, 48)
            .addBox(-4.0F, 1.0F, -3.0F, 8.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(10, 58)
            .addBox(-4.4F, 5.0F, -4.0F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(35, 25)
            .addBox(-2.1F, 5.0F, -4.0F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 28)
            .addBox(0.1F, 5.0F, -4.0F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(70, 36)
            .addBox(-2.0F, 12.5F, -4.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 48)
            .addBox(2.4F, 5.0F, -4.0F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(62, 34)
            .addBox(-4.0F, 11.0F, -3.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 9)
            .addBox(-4.0F, 0.0F, -3.0F, 8.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
            .texOffs(44, 39)
            .addBox(-4.0F, 12.0F, -3.0F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(13, 16)
            .addBox(-3.0F, 14.0F, -3.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(24, 5)
            .addBox(-2.0F, 15.0F, -3.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(44, 25)
            .addBox(-4.0F, 1.0F, 2.0F, 8.0F, 11.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(68, 18)
            .addBox(-2.0F, 11.0F, 3.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(68, 10)
            .addBox(-3.0F, 8.0F, 3.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(14, 50)
            .addBox(-3.0F, 5.0F, 3.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(20, 38)
            .addBox(-3.0F, 2.0F, 3.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(26, 59)
            .addBox(3.0F, 1.0F, -2.0F, 1.0F, 11.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(58, 6)
            .addBox(-4.0F, 1.0F, -2.0F, 1.0F, 11.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(20, 41)
            .addBox(-3.0F, 12.0F, 2.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(10, 28)
            .addBox(-2.0F, 13.0F, 2.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition Body_r1 = Body.addOrReplaceChild(
         "Body_r1",
         CubeListBuilder.create()
            .texOffs(51, 15)
            .addBox(-4.2F, 0.4F, -4.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 9)
            .addBox(-1.5F, 1.1F, -4.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(22, 9)
            .addBox(1.2F, 1.6F, -4.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2618F)
      );
      PartDefinition RightArm = partdefinition.addOrReplaceChild(
         "RightArm",
         CubeListBuilder.create()
            .texOffs(66, 39)
            .addBox(-3.0F, -2.0F, -2.6F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(65, 65)
            .addBox(-3.0F, -2.0F, 1.6F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 58)
            .addBox(-3.6F, -2.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(0, 16)
            .addBox(-4.6F, 2.0F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(56, 50)
            .addBox(0.4F, -2.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(28, 38)
            .addBox(-4.0F, -2.4F, -3.0F, 5.0F, 4.0F, 6.0F, new CubeDeformation(0.0F))
            .texOffs(66, 52)
            .addBox(-3.0F, 9.4F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-5.0F, 2.0F, 0.0F)
      );
      PartDefinition LeftArm = partdefinition.addOrReplaceChild(
         "LeftArm",
         CubeListBuilder.create()
            .texOffs(36, 59)
            .addBox(-1.0F, -2.0F, -2.6F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(62, 21)
            .addBox(-1.0F, -2.0F, 1.6F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(46, 50)
            .addBox(-1.6F, -2.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(35, 15)
            .addBox(-1.0F, -2.4F, -3.0F, 5.0F, 4.0F, 6.0F, new CubeDeformation(0.0F))
            .texOffs(16, 54)
            .addBox(2.6F, -2.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(24, 21)
            .addBox(3.6F, 2.0F, -1.0F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(46, 66)
            .addBox(-1.0F, 9.4F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offset(5.0F, 2.0F, 0.0F)
      );
      PartDefinition RightLeg = partdefinition.addOrReplaceChild(
         "RightLeg",
         CubeListBuilder.create()
            .texOffs(46, 42)
            .addBox(-2.0F, 10.0F, -4.0F, 4.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
            .texOffs(55, 71)
            .addBox(-2.0F, 8.0F, 1.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(45, 71)
            .addBox(-2.0F, 8.0F, -2.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(22, 13)
            .addBox(-1.0F, 9.0F, -3.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-2.5F, 8.0F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
            .texOffs(13, 18)
            .addBox(1.0F, 8.0F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-2.0F, 12.0F, 0.0F)
      );
      PartDefinition LeftLeg = partdefinition.addOrReplaceChild(
         "LeftLeg",
         CubeListBuilder.create()
            .texOffs(0, 50)
            .addBox(-2.0F, 10.0F, -4.0F, 4.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
            .texOffs(66, 57)
            .addBox(1.6F, 8.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(10, 66)
            .addBox(-2.4F, 8.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(68, 13)
            .addBox(-2.0F, 8.0F, 1.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 43)
            .addBox(-2.0F, 8.0F, -2.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 13)
            .addBox(-1.0F, 9.0F, -3.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
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

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

public class Modelusriot<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("apocalypsenow", "modelusriot"), "main");
   public final ModelPart Head;
   public final ModelPart Body;
   public final ModelPart RightArm;
   public final ModelPart LeftArm;
   public final ModelPart RightLeg;
   public final ModelPart LeftLeg;

   public Modelusriot(ModelPart root) {
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
            .texOffs(0, 0)
            .addBox(-4.0F, -9.0F, -5.0F, 8.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
            .texOffs(25, 1)
            .addBox(-5.0F, -8.0F, -5.0F, 1.0F, 6.0F, 9.0F, new CubeDeformation(0.0F))
            .texOffs(15, 17)
            .addBox(4.0F, -8.0F, -5.0F, 1.0F, 6.0F, 9.0F, new CubeDeformation(0.0F))
            .texOffs(46, 50)
            .addBox(-4.0F, -6.8F, -6.0F, 8.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(6, 50)
            .addBox(1.6F, -5.9F, -7.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(43, 28)
            .addBox(-0.9F, -8.0F, -7.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(6, 44)
            .addBox(-3.4F, -5.9F, -7.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 4)
            .addBox(-1.4F, -8.8F, -6.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(46, 43)
            .addBox(-4.0F, -8.0F, 4.0F, 8.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition Body = partdefinition.addOrReplaceChild(
         "Body",
         CubeListBuilder.create()
            .texOffs(0, 0)
            .addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(34, 40)
            .addBox(-4.0F, 0.0F, -3.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(36, 0)
            .addBox(1.0F, 0.0F, -3.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 16)
            .addBox(-4.0F, 2.0F, -3.0F, 8.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(18, 40)
            .addBox(-3.0F, 12.0F, -3.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(23, 45)
            .addBox(1.4F, 3.3F, -3.6F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(44, 22)
            .addBox(-3.6F, 3.3F, -3.6F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 44)
            .addBox(-1.1F, 3.3F, -3.6F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(36, 13)
            .addBox(-3.6F, 7.6F, -3.6F, 7.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(12, 27)
            .addBox(-4.0F, 0.0F, 2.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(18, 16)
            .addBox(-4.0F, 2.0F, 2.0F, 8.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(40, 8)
            .addBox(-3.0F, 9.0F, 3.0F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 40)
            .addBox(-3.0F, 2.0F, 3.0F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(36, 18)
            .addBox(-3.0F, 5.4F, 3.0F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(18, 42)
            .addBox(-3.0F, 12.0F, 2.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(20, 0)
            .addBox(1.0F, 0.0F, 2.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition RightArm = partdefinition.addOrReplaceChild(
         "RightArm",
         CubeListBuilder.create()
            .texOffs(0, 27)
            .addBox(-3.0F, -2.0F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(42, 30)
            .addBox(-3.3F, 5.4F, 1.6F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(42, 28)
            .addBox(-3.2F, 5.4F, -2.4F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(16, 33)
            .addBox(-3.2F, 0.4F, -2.4F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(16, 27)
            .addBox(-3.2F, 2.8F, -2.4F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(31, 22)
            .addBox(-3.2F, -2.6F, -2.4F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(40, 0)
            .addBox(-4.0F, -0.6F, -2.4F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-5.0F, 2.0F, 0.0F)
      );
      PartDefinition cube_r1 = RightArm.addOrReplaceChild(
         "cube_r1",
         CubeListBuilder.create().texOffs(28, 40).addBox(-1.0F, 5.6F, -2.1F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4363F)
      );
      PartDefinition LeftArm = partdefinition.addOrReplaceChild(
         "LeftArm",
         CubeListBuilder.create()
            .texOffs(24, 0)
            .addBox(-1.0F, -2.0F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(42, 36)
            .addBox(-0.8F, 5.4F, -2.6F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(24, 13)
            .addBox(-0.8F, 2.8F, -2.6F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(29, 34)
            .addBox(-0.8F, -2.6F, -2.6F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(29, 28)
            .addBox(-0.8F, 0.4F, -2.6F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(11, 39)
            .addBox(3.0F, -0.6F, -2.6F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(42, 34)
            .addBox(-0.8F, 5.4F, 1.4F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(5.0F, 2.0F, 0.0F)
      );
      PartDefinition cube_r2 = LeftArm.addOrReplaceChild(
         "cube_r2",
         CubeListBuilder.create().texOffs(38, 40).addBox(0.1F, 5.4F, -2.1F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4363F)
      );
      PartDefinition RightLeg = partdefinition.addOrReplaceChild(
         "RightLeg",
         CubeListBuilder.create()
            .texOffs(31, 28)
            .addBox(-2.1F, 0.1F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(53, 11)
            .addBox(-2.1F, 10.1F, -4.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-2.0F, 12.0F, 0.0F)
      );
      PartDefinition cube_r3 = RightLeg.addOrReplaceChild(
         "cube_r3",
         CubeListBuilder.create().texOffs(0, 56).addBox(-2.0F, 9.0F, 2.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.1F, 0.0F, -0.4363F, 0.0F, 0.0F)
      );
      PartDefinition LeftLeg = partdefinition.addOrReplaceChild(
         "LeftLeg",
         CubeListBuilder.create()
            .texOffs(0, 28)
            .addBox(-2.0F, 0.1F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(44, 54)
            .addBox(-2.0F, 10.1F, -4.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(2.0F, 12.0F, 0.0F)
      );
      PartDefinition cube_r4 = LeftLeg.addOrReplaceChild(
         "cube_r4",
         CubeListBuilder.create().texOffs(10, 56).addBox(-2.1F, 9.0F, 2.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.1F, 0.0F, -0.4363F, 0.0F, 0.0F)
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
      this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
   }
}

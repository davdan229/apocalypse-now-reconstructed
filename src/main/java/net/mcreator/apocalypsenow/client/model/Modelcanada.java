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

public class Modelcanada<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("apocalypsenow", "modelcanada"), "main");
   public final ModelPart Head;
   public final ModelPart Body;
   public final ModelPart RightArm;
   public final ModelPart LeftArm;
   public final ModelPart RightLeg;
   public final ModelPart LeftLeg;

   public Modelcanada(ModelPart root) {
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
            .addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
            .texOffs(25, 8)
            .addBox(-3.0F, -7.3F, -4.6F, 6.0F, 2.0F, 8.0F, new CubeDeformation(0.5F))
            .texOffs(51, 41)
            .addBox(-4.0F, -8.0F, -6.0F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 16)
            .addBox(-4.0F, -9.0F, -5.0F, 8.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
            .texOffs(15, 33)
            .addBox(-5.0F, -8.0F, -5.0F, 1.0F, 6.0F, 9.0F, new CubeDeformation(0.0F))
            .texOffs(36, 21)
            .addBox(0.0F, -10.0F, -5.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
            .texOffs(25, 18)
            .addBox(4.0F, -8.0F, -5.0F, 1.0F, 6.0F, 9.0F, new CubeDeformation(0.0F))
            .texOffs(51, 34)
            .addBox(-4.0F, -8.0F, 4.0F, 8.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(25, 23)
            .addBox(-4.0F, -5.0F, -6.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(24, 6)
            .addBox(1.0F, -5.0F, -6.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition Body = partdefinition.addOrReplaceChild(
         "Body",
         CubeListBuilder.create()
            .texOffs(0, 26)
            .addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(59, 16)
            .addBox(-4.0F, 0.0F, -3.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(15, 59)
            .addBox(1.0F, 0.0F, -3.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(34, 49)
            .addBox(-4.0F, 2.0F, -3.0F, 8.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(57, 57)
            .addBox(2.0F, 7.0F, -4.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(59, 19)
            .addBox(2.0F, 3.0F, -4.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(52, 53)
            .addBox(-4.0F, 7.0F, -4.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(26, 36)
            .addBox(-1.0F, 7.0F, -4.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(25, 18)
            .addBox(-1.7F, 2.5F, -4.0F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(16, 48)
            .addBox(-4.0F, 2.0F, 2.0F, 8.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(24, 0)
            .addBox(-4.0F, 8.0F, 3.0F, 8.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(57, 0)
            .addBox(1.0F, 0.0F, 2.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(58, 53)
            .addBox(-4.0F, 0.0F, 2.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition cube_r1 = Body.addOrReplaceChild(
         "cube_r1",
         CubeListBuilder.create()
            .texOffs(0, 0)
            .addBox(-3.0F, 6.0F, -1.5F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(5, 0)
            .addBox(2.0F, 6.0F, -1.5F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6981F, 0.0F, 0.0F)
      );
      PartDefinition RightArm = partdefinition.addOrReplaceChild(
         "RightArm",
         CubeListBuilder.create()
            .texOffs(47, 18)
            .addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(0, 16)
            .addBox(-4.0F, -1.0F, -1.5F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-5.0F, 2.0F, 0.0F)
      );
      PartDefinition LeftArm = partdefinition.addOrReplaceChild(
         "LeftArm",
         CubeListBuilder.create()
            .texOffs(45, 0)
            .addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(3.0F, -1.0F, -1.5F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offset(5.0F, 2.0F, 0.0F)
      );
      PartDefinition RightLeg = partdefinition.addOrReplaceChild(
         "RightLeg",
         CubeListBuilder.create()
            .texOffs(0, 44)
            .addBox(-2.1F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(26, 33)
            .addBox(-2.1F, 11.0F, -4.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-2.0F, 12.0F, 0.0F)
      );
      PartDefinition cube_r2 = RightLeg.addOrReplaceChild(
         "cube_r2",
         CubeListBuilder.create().texOffs(51, 45).addBox(-1.9F, 9.0F, 2.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-0.1F, 0.0F, 0.0F, -0.4363F, 0.0F, 0.0F)
      );
      PartDefinition LeftLeg = partdefinition.addOrReplaceChild(
         "LeftLeg",
         CubeListBuilder.create()
            .texOffs(35, 33)
            .addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(36, 18)
            .addBox(-2.0F, 11.0F, -4.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(2.0F, 12.0F, 0.0F)
      );
      PartDefinition cube_r3 = LeftLeg.addOrReplaceChild(
         "cube_r3",
         CubeListBuilder.create().texOffs(52, 49).addBox(-2.1F, 9.0F, 2.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.4363F, 0.0F, 0.0F)
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

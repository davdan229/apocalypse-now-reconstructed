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

public class Modelriot<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("apocalypsenow", "modelriot"), "main");
   public final ModelPart Head;
   public final ModelPart Body;
   public final ModelPart RightArm;
   public final ModelPart LeftArm;
   public final ModelPart RightLeg;
   public final ModelPart LeftLeg;

   public Modelriot(ModelPart root) {
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
         CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.5F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition Body = partdefinition.addOrReplaceChild(
         "Body",
         CubeListBuilder.create()
            .texOffs(0, 16)
            .addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(40, 16)
            .addBox(-3.5F, 0.9F, -2.7F, 7.0F, 10.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(49, 46)
            .addBox(0.5F, 6.9F, -3.7F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(24, 16)
            .addBox(-1.0F, 9.4F, -3.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(20, 16)
            .addBox(-2.3F, 9.4F, -3.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 16)
            .addBox(-3.6F, 9.4F, -3.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 48)
            .addBox(-3.5F, -0.1F, -2.5F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
            .texOffs(39, 46)
            .addBox(1.5F, -0.1F, -2.6F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
            .texOffs(32, 32)
            .addBox(-3.5F, 0.9F, 1.3F, 7.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition RightArm = partdefinition.addOrReplaceChild(
         "RightArm",
         CubeListBuilder.create()
            .texOffs(16, 32)
            .addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(27, 51)
            .addBox(-3.9F, 7.4F, -1.6F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
            .texOffs(27, 44)
            .addBox(-3.5F, -2.6F, -2.6F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-5.0F, 2.0F, 0.0F)
      );
      PartDefinition cube_r1 = RightArm.addOrReplaceChild(
         "cube_r1",
         CubeListBuilder.create()
            .texOffs(48, 0)
            .addBox(-0.8F, 5.7F, -1.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
            .texOffs(48, 5)
            .addBox(-1.7F, 3.4F, -1.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
            .texOffs(10, 48)
            .addBox(-2.75F, 0.75F, -1.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4363F)
      );
      PartDefinition LeftArm = partdefinition.addOrReplaceChild(
         "LeftArm",
         CubeListBuilder.create()
            .texOffs(32, 0)
            .addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(45, 39)
            .addBox(-0.5F, -2.8F, -2.6F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(50, 33)
            .addBox(2.5F, 7.7F, -1.6F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offset(5.0F, 2.0F, 0.0F)
      );
      PartDefinition cube_r2 = LeftArm.addOrReplaceChild(
         "cube_r2",
         CubeListBuilder.create()
            .texOffs(48, 10)
            .addBox(-2.2F, 5.8F, -1.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
            .texOffs(20, 48)
            .addBox(-0.8F, 2.9F, -1.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
            .texOffs(48, 28)
            .addBox(0.4F, 0.1F, -1.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4363F)
      );
      PartDefinition RightLeg = partdefinition.addOrReplaceChild(
         "RightLeg",
         CubeListBuilder.create()
            .texOffs(0, 32)
            .addBox(-1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-1.4F, 7.0F, -3.0F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-2.0F, 12.0F, 0.0F)
      );
      PartDefinition LeftLeg = partdefinition.addOrReplaceChild(
         "LeftLeg",
         CubeListBuilder.create()
            .texOffs(24, 16)
            .addBox(-1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(24, 0)
            .addBox(-1.5F, 7.0F, -3.0F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
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

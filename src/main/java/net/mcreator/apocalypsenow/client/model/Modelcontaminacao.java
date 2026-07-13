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

public class Modelcontaminacao<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("apocalypsenow", "modelcontaminacao"), "main");
   public final ModelPart Head;
   public final ModelPart Body;
   public final ModelPart RightArm;
   public final ModelPart LeftArm;
   public final ModelPart RightLeg;
   public final ModelPart LeftLeg;

   public Modelcontaminacao(ModelPart root) {
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
            .addBox(-4.5F, -8.5F, -3.2F, 9.0F, 9.0F, 8.0F, new CubeDeformation(0.0F))
            .texOffs(36, 35)
            .addBox(-4.5F, -8.5F, -4.2F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(34, 14)
            .addBox(-4.5F, -0.5F, -4.2F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(4, 0)
            .addBox(-4.5F, -7.5F, -4.2F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(3.5F, -7.5F, -4.2F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(34, 9)
            .addBox(-4.0F, -6.6F, -5.0F, 8.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(48, 22)
            .addBox(-4.0F, -3.6F, -5.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(38, 47)
            .addBox(1.0F, -3.6F, -5.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition cube_r1 = Head.addOrReplaceChild(
         "cube_r1",
         CubeListBuilder.create().texOffs(20, 44).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-1.6F, -0.1F, -4.4F, -0.0848F, 0.5768F, -0.1204F)
      );
      PartDefinition cube_r2 = Head.addOrReplaceChild(
         "cube_r2",
         CubeListBuilder.create().texOffs(30, 44).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(1.8F, -0.1F, -4.4F, 0.0501F, -0.5008F, 0.077F)
      );
      PartDefinition cube_r3 = Head.addOrReplaceChild(
         "cube_r3",
         CubeListBuilder.create().texOffs(27, 44).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.1F, -0.6F, -5.9F, -0.1396F, 0.0F, 0.0F)
      );
      PartDefinition cube_r4 = Head.addOrReplaceChild(
         "cube_r4",
         CubeListBuilder.create().texOffs(39, 41).addBox(-1.0F, -3.0F, -1.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-0.5F, 0.0F, -4.4F, -0.1396F, 0.0F, 0.0F)
      );
      PartDefinition Body = partdefinition.addOrReplaceChild(
         "Body",
         CubeListBuilder.create().texOffs(0, 17).addBox(-4.5F, -0.009F, -2.5F, 9.0F, 13.0F, 5.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition cube_r5 = Body.addOrReplaceChild(
         "cube_r5",
         CubeListBuilder.create().texOffs(26, 6).addBox(-1.0F, -2.0F, -1.0F, 3.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.8F, 3.8F, -1.7F, 0.0F, 0.0F, 0.2094F)
      );
      PartDefinition RightArm = partdefinition.addOrReplaceChild(
         "RightArm",
         CubeListBuilder.create()
            .texOffs(0, 16)
            .addBox(1.6F, 4.6F, -2.705F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(2, 16)
            .addBox(1.6F, 4.6F, 1.695F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(26, 0)
            .addBox(0.6F, 4.6F, 2.695F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(36, 4)
            .addBox(-3.8F, 4.6F, 2.695F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 18)
            .addBox(-3.8F, 4.6F, 1.695F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(2, 18)
            .addBox(-3.8F, 4.6F, -2.705F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(23, 12)
            .addBox(1.5F, 4.6F, -2.505F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(23, 14)
            .addBox(-3.7F, 4.6F, -2.505F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(0, 37)
            .addBox(-3.8F, 4.6F, -2.705F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(26, 4)
            .addBox(-3.6F, 4.6F, -2.605F, 5.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(48, 25)
            .addBox(-3.6F, 4.6F, 2.595F, 5.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(28, 17)
            .addBox(-3.6F, -2.4F, -2.505F, 5.0F, 13.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(2, 37)
            .addBox(0.6F, 4.6F, -2.705F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-5.0F, 2.0F, 0.0F)
      );
      PartDefinition LeftArm = partdefinition.addOrReplaceChild(
         "LeftArm",
         CubeListBuilder.create()
            .texOffs(20, 39)
            .addBox(2.6F, 4.6F, -2.705F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(34, 8)
            .addBox(3.6F, 4.6F, -2.705F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(2, 34)
            .addBox(3.6F, 4.6F, 1.695F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(38, 4)
            .addBox(2.6F, 4.6F, 2.695F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(38, 0)
            .addBox(-1.8F, 4.6F, 2.695F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 34)
            .addBox(-1.8F, 4.6F, 1.695F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(32, 5)
            .addBox(-1.8F, 4.6F, -2.705F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(15, 32)
            .addBox(3.5F, 4.6F, -2.505F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(15, 30)
            .addBox(-1.7F, 4.6F, -2.505F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(36, 37)
            .addBox(-1.8F, 4.6F, -2.705F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(46, 47)
            .addBox(-1.6F, 4.6F, -2.605F, 5.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(48, 27)
            .addBox(-1.6F, 4.6F, 2.595F, 5.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 35)
            .addBox(-1.6F, -2.4F, -2.505F, 5.0F, 13.0F, 5.0F, new CubeDeformation(0.0F)),
         PartPose.offset(5.0F, 2.0F, 0.0F)
      );
      PartDefinition RightLeg = partdefinition.addOrReplaceChild(
         "RightLeg",
         CubeListBuilder.create()
            .texOffs(20, 35)
            .addBox(-2.71F, 9.0F, -3.4F, 5.0F, 3.0F, 6.0F, new CubeDeformation(0.0F))
            .texOffs(36, 37)
            .addBox(-2.71F, 10.0F, -5.4F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-1.9F, 12.0F, 0.0F)
      );
      PartDefinition cube_r6 = RightLeg.addOrReplaceChild(
         "cube_r6",
         CubeListBuilder.create().texOffs(43, 19).addBox(-4.1F, -1.0F, 2.0F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(1.4F, 8.3F, -5.5F, -0.7854F, 0.0F, 0.0F)
      );
      PartDefinition LeftLeg = partdefinition.addOrReplaceChild(
         "LeftLeg",
         CubeListBuilder.create()
            .texOffs(20, 35)
            .addBox(-2.51F, 9.0F, -3.4F, 5.0F, 3.0F, 6.0F, new CubeDeformation(0.0F))
            .texOffs(36, 37)
            .addBox(-2.51F, 10.0F, -5.4F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(1.9F, 12.0F, 0.0F)
      );
      PartDefinition cube_r7 = LeftLeg.addOrReplaceChild(
         "cube_r7",
         CubeListBuilder.create().texOffs(43, 19).addBox(-4.1F, -1.0F, 2.0F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(1.6F, 8.3F, -5.5F, -0.7854F, 0.0F, 0.0F)
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

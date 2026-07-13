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

public class Modelcontamination<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("apocalypsenow", "modelcontamination"), "main");
   public final ModelPart Head;
   public final ModelPart Body;
   public final ModelPart RightArm;
   public final ModelPart LeftArm;
   public final ModelPart RightLeg;
   public final ModelPart LeftLeg;

   public Modelcontamination(ModelPart root) {
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
            .texOffs(0, 9)
            .addBox(-5.0F, -9.0F, -4.4F, 10.0F, 0.0F, 9.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-5.0F, 0.0F, -4.4F, 10.0F, 0.0F, 9.0F, new CubeDeformation(0.0F))
            .texOffs(46, 49)
            .addBox(-5.0F, -9.0F, -4.4F, 10.0F, 4.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(2, 0)
            .addBox(4.0F, -5.0F, -4.4F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-5.0F, -5.0F, -4.4F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 18)
            .addBox(5.0F, -9.0F, -4.4F, 0.0F, 9.0F, 9.0F, new CubeDeformation(0.0F))
            .texOffs(0, 9)
            .addBox(-5.0F, -9.0F, -4.4F, 0.0F, 9.0F, 9.0F, new CubeDeformation(0.0F))
            .texOffs(36, 28)
            .addBox(-5.0F, -9.0F, 4.6F, 10.0F, 9.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(10, 61)
            .addBox(-4.0F, -3.9F, -5.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(37, 60)
            .addBox(1.0F, -3.9F, -5.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(36, 18)
            .addBox(-4.0F, -6.9F, -5.0F, 8.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition cube_r1 = Head.addOrReplaceChild(
         "cube_r1",
         CubeListBuilder.create().texOffs(30, 60).addBox(-1.0F, -2.0F, 22.1F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-2.3F, -0.7F, -26.9F, 0.0F, 0.0F, 0.7854F)
      );
      PartDefinition cube_r2 = Head.addOrReplaceChild(
         "cube_r2",
         CubeListBuilder.create().texOffs(57, 26).addBox(-1.0F, -2.0F, 22.1F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(1.0F, -0.5F, -27.0F, 0.0F, 0.0F, 0.7854F)
      );
      PartDefinition cube_r3 = Head.addOrReplaceChild(
         "cube_r3",
         CubeListBuilder.create().texOffs(0, 10).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, -1.4142F, -4.8F, 0.0F, 0.0F, 0.7854F)
      );
      PartDefinition cube_r4 = Head.addOrReplaceChild(
         "cube_r4",
         CubeListBuilder.create().texOffs(52, 42).addBox(-2.0F, -3.0F, 22.7F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-0.7F, 0.0F, -27.7F, 0.0F, 0.0F, 0.7854F)
      );
      PartDefinition Body = partdefinition.addOrReplaceChild(
         "Body",
         CubeListBuilder.create()
            .texOffs(0, 6)
            .addBox(1.0F, 0.0F, 1.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(2, 5)
            .addBox(-2.0F, 0.0F, 1.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 5)
            .addBox(-4.0F, 0.0F, -2.5F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(2, 6)
            .addBox(1.0F, 0.0F, -2.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(2.0F, 0.0F, -2.5F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(0, 5)
            .addBox(-2.0F, 0.0F, -2.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(20, 38)
            .addBox(-4.0F, 0.0F, -2.505F, 8.0F, 12.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(36, 37)
            .addBox(-4.0F, 0.0F, 2.505F, 8.0F, 12.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(10, 46)
            .addBox(4.004F, 2.0F, -2.5F, 0.0F, 10.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(20, 45)
            .addBox(-4.005F, 2.0F, -2.5F, 0.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition cube_r5 = Body.addOrReplaceChild(
         "cube_r5",
         CubeListBuilder.create().texOffs(110, 119).addBox(0.0F, -1.0F, 0.995F, 3.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 3.0F, -3.7F, 0.0F, 0.0F, 0.1745F)
      );
      PartDefinition RightArm = partdefinition.addOrReplaceChild(
         "RightArm",
         CubeListBuilder.create()
            .texOffs(76, 110)
            .addBox(-4.0F, 6.6F, -3.5F, 0.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
            .texOffs(88, 99)
            .addBox(-4.0F, 6.6F, 3.5F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(89, 106)
            .addBox(-4.0F, 6.6F, -3.5F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(86, 92)
            .addBox(2.0F, 6.6F, -3.5F, 0.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
            .texOffs(56, 13)
            .addBox(-3.5F, -2.4F, -2.5F, 5.0F, 13.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(55, 0)
            .addBox(-3.5F, -2.4F, 2.5F, 5.0F, 13.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 31)
            .addBox(-3.5F, -2.4F, -2.5F, 0.0F, 13.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(0, 44)
            .addBox(1.5F, -0.4F, -2.5F, 0.0F, 11.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(40, 9)
            .addBox(-3.5F, -2.405F, -2.5F, 5.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(39, 23)
            .addBox(-3.5F, 10.595F, -2.5F, 5.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-5.0F, 2.0F, 0.0F)
      );
      PartDefinition LeftArm = partdefinition.addOrReplaceChild(
         "LeftArm",
         CubeListBuilder.create()
            .texOffs(20, 60)
            .addBox(-1.5F, -2.4F, 2.5F, 5.0F, 13.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(56, 53)
            .addBox(-1.5F, -2.4F, -2.5F, 5.0F, 13.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(89, 106)
            .addBox(-2.0F, 6.6F, -3.5F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(88, 99)
            .addBox(-2.0F, 6.6F, 3.5F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(86, 92)
            .addBox(3.7F, 5.9F, -3.5F, 0.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
            .texOffs(76, 110)
            .addBox(-2.0F, 6.6F, -3.5F, 0.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
            .texOffs(10, 33)
            .addBox(3.5F, -2.4F, -2.5F, 0.0F, 13.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(36, 44)
            .addBox(-1.5F, -0.4F, -2.5F, 0.0F, 11.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(47, 37)
            .addBox(-1.5F, -2.405F, -2.5F, 5.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(40, 0)
            .addBox(-1.5F, 10.595F, -2.5F, 5.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)),
         PartPose.offset(5.0F, 2.0F, 0.0F)
      );
      PartDefinition RightLeg = partdefinition.addOrReplaceChild(
         "RightLeg",
         CubeListBuilder.create()
            .texOffs(29, 0)
            .addBox(-2.5F, 7.0F, -3.405F, 5.0F, 3.0F, 6.0F, new CubeDeformation(0.0F))
            .texOffs(10, 28)
            .addBox(-2.5F, 10.0F, -5.405F, 5.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-1.9F, 12.0F, 0.0F)
      );
      PartDefinition cube_r6 = RightLeg.addOrReplaceChild(
         "cube_r6",
         CubeListBuilder.create().texOffs(56, 34).addBox(-4.995F, -1.0F, -0.005F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(2.5F, 10.7F, -3.8F, 0.7679F, 0.0F, 0.0F)
      );
      PartDefinition LeftLeg = partdefinition.addOrReplaceChild(
         "LeftLeg",
         CubeListBuilder.create()
            .texOffs(10, 28)
            .addBox(-2.3F, 10.0F, -5.405F, 5.0F, 2.0F, 8.0F, new CubeDeformation(0.0F))
            .texOffs(29, 0)
            .addBox(-2.3F, 7.0F, -3.405F, 5.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
         PartPose.offset(1.9F, 12.0F, 0.0F)
      );
      PartDefinition cube_r7 = LeftLeg.addOrReplaceChild(
         "cube_r7",
         CubeListBuilder.create().texOffs(56, 34).addBox(-4.995F, -1.0F, -0.005F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(2.7F, 10.7F, -3.8F, 0.7679F, 0.0F, 0.0F)
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

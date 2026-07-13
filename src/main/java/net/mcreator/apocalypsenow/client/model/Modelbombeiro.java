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

public class Modelbombeiro<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("apocalypsenow", "modelbombeiro"), "main");
   public final ModelPart Body;
   public final ModelPart RightArm;
   public final ModelPart LeftArm;
   public final ModelPart RightLeg;
   public final ModelPart LeftLeg;

   public Modelbombeiro(ModelPart root) {
      this.Body = root.getChild("Body");
      this.RightArm = root.getChild("RightArm");
      this.LeftArm = root.getChild("LeftArm");
      this.RightLeg = root.getChild("RightLeg");
      this.LeftLeg = root.getChild("LeftLeg");
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.getRoot();
      PartDefinition Body = partdefinition.addOrReplaceChild(
         "Body",
         CubeListBuilder.create()
            .texOffs(27, 0)
            .addBox(-2.1F, 1.0F, -3.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(52, 53)
            .addBox(-3.1F, 9.0F, -3.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(48, 40)
            .addBox(-3.1F, 9.0F, 2.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(51, 5)
            .addBox(0.9F, -1.5F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(0, 53)
            .addBox(1.9F, -1.0F, -3.0F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 4)
            .addBox(-4.1F, -1.0F, -3.0F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(54, 19)
            .addBox(-2.1F, 8.0F, -3.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(47, 0)
            .addBox(-4.1F, -1.5F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(18, 29)
            .addBox(-4.1F, -1.0F, 2.0F, 8.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(18, 107)
            .addBox(-1.6F, -1.0F, 3.0F, 3.0F, 10.0F, 3.0F, new CubeDeformation(0.0F))
            .texOffs(10, 42)
            .addBox(-4.0F, 2.0F, -2.505F, 8.0F, 10.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 31)
            .addBox(-4.0F, 1.0F, 2.505F, 8.0F, 11.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(18, 25)
            .addBox(1.0F, 0.0F, 2.5F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(18, 24)
            .addBox(-4.0F, 0.0F, 2.5F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(18, 21)
            .addBox(-4.0F, 0.0F, -2.505F, 3.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(18, 23)
            .addBox(1.0F, 0.0F, -2.505F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(18, 16)
            .addBox(0.0F, 1.0F, -2.505F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(36, 37)
            .addBox(4.004F, 2.0F, -2.5F, 0.0F, 10.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(26, 37)
            .addBox(-4.005F, 2.0F, -2.5F, 0.0F, 10.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(13, 11)
            .addBox(-4.0F, 0.0F, -2.5F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(5, 5)
            .addBox(1.0F, 0.0F, -2.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(2.0F, 0.0F, -2.5F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(2, 3)
            .addBox(1.0F, 0.0F, 1.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 3)
            .addBox(-2.0F, 0.0F, 1.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(2, 0)
            .addBox(-2.0F, 0.0F, -2.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition tankersixbod_r1 = Body.addOrReplaceChild(
         "tankersixbod_r1",
         CubeListBuilder.create().texOffs(38, 110).addBox(0.0F, 8.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(1.3F, -9.4F, 2.4F, 0.0F, -0.7854F, 0.0F)
      );
      PartDefinition RightArm = partdefinition.addOrReplaceChild(
         "RightArm",
         CubeListBuilder.create()
            .texOffs(10, 52)
            .addBox(-3.5F, -2.4F, -2.5F, 5.0F, 11.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(46, 42)
            .addBox(-3.5F, -2.4F, 2.5F, 5.0F, 11.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(36, 24)
            .addBox(-3.5F, -2.4F, -2.5F, 0.0F, 11.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(44, 14)
            .addBox(1.5F, -0.4F, -2.5F, 0.0F, 9.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(29, 21)
            .addBox(-3.5F, -2.405F, -2.5F, 5.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-5.0F, 2.0F, 0.0F)
      );
      PartDefinition LeftArm = partdefinition.addOrReplaceChild(
         "LeftArm",
         CubeListBuilder.create()
            .texOffs(30, 52)
            .addBox(-1.5F, -2.4F, 2.5F, 5.0F, 11.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(20, 52)
            .addBox(-1.5F, -2.4F, -2.5F, 5.0F, 11.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 37)
            .addBox(3.5F, -2.4F, -2.5F, 0.0F, 11.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(46, 23)
            .addBox(-1.5F, -0.4F, -2.5F, 0.0F, 9.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(32, 0)
            .addBox(-1.5F, -2.405F, -2.5F, 5.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)),
         PartPose.offset(5.0F, 2.0F, 0.0F)
      );
      PartDefinition RightLeg = partdefinition.addOrReplaceChild(
         "RightLeg",
         CubeListBuilder.create()
            .texOffs(106, 118)
            .addBox(-2.5F, 6.0F, -3.405F, 5.0F, 4.0F, 6.0F, new CubeDeformation(0.0F))
            .texOffs(18, 11)
            .addBox(-2.5F, 10.0F, -5.405F, 5.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-1.9F, 12.0F, 0.0F)
      );
      PartDefinition cube_r1 = RightLeg.addOrReplaceChild(
         "cube_r1",
         CubeListBuilder.create().texOffs(54, 10).addBox(-4.995F, -1.0F, -0.005F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(2.5F, 10.7F, -3.8F, 0.7679F, 0.0F, 0.0F)
      );
      PartDefinition LeftLeg = partdefinition.addOrReplaceChild(
         "LeftLeg",
         CubeListBuilder.create()
            .texOffs(0, 9)
            .addBox(-2.3F, 10.0F, -5.405F, 5.0F, 2.0F, 8.0F, new CubeDeformation(0.0F))
            .texOffs(106, 118)
            .addBox(-2.3F, 6.0F, -3.405F, 5.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
         PartPose.offset(1.9F, 12.0F, 0.0F)
      );
      PartDefinition cube_r2 = LeftLeg.addOrReplaceChild(
         "cube_r2",
         CubeListBuilder.create().texOffs(40, 53).addBox(-4.995F, -1.0F, -0.005F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(2.7F, 10.7F, -3.8F, 0.7679F, 0.0F, 0.0F)
      );
      return LayerDefinition.create(meshdefinition, 128, 128);
   }

   @Override
   public void renderToBuffer(
      PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha
   ) {
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
      this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
      this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
   }
}

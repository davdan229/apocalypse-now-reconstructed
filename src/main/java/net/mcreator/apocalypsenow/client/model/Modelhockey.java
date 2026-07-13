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

public class Modelhockey<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("apocalypsenow", "modelhockey"), "main");
   public final ModelPart Head;
   public final ModelPart Body;
   public final ModelPart RightArm;
   public final ModelPart LeftArm;
   public final ModelPart RightLeg;
   public final ModelPart LeftLeg;

   public Modelhockey(ModelPart root) {
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
            .texOffs(52, 39)
            .addBox(-4.5F, -9.0F, -4.5F, 9.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-4.5F, -9.0F, -4.5F, 9.0F, 0.0F, 9.0F, new CubeDeformation(0.0F))
            .texOffs(48, 16)
            .addBox(-4.5F, -9.0F, 4.5F, 9.0F, 9.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(18, 23)
            .addBox(4.5F, -9.0F, -4.5F, 0.0F, 6.0F, 9.0F, new CubeDeformation(0.0F))
            .texOffs(15, 32)
            .addBox(4.5F, -3.0F, -1.5F, 0.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
            .texOffs(2, 12)
            .addBox(4.5F, -1.0F, -1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 12)
            .addBox(-4.5F, -1.0F, -1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(27, 16)
            .addBox(-4.5F, 0.0F, -1.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(28, 8)
            .addBox(-4.5F, -3.0F, -1.5F, 0.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
            .texOffs(0, 23)
            .addBox(-4.5F, -9.0F, -4.5F, 0.0F, 6.0F, 9.0F, new CubeDeformation(0.0F))
            .texOffs(0, 5)
            .addBox(-4.9F, -4.2F, -4.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
            .texOffs(2, 23)
            .addBox(-4.9F, -3.2F, -2.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 23)
            .addBox(-4.9F, -5.2F, -2.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(20, 22)
            .addBox(-4.9F, -7.2F, -2.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 8)
            .addBox(-4.9F, -2.2F, -4.5F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(0, 4)
            .addBox(-4.9F, -8.2F, -4.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
            .texOffs(52, 38)
            .addBox(-4.9F, -8.2F, -4.502F, 10.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(14, 52)
            .addBox(-4.9F, -6.2F, -4.502F, 10.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(46, 37)
            .addBox(-4.9F, -4.2F, -4.502F, 10.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(46, 36)
            .addBox(-4.9F, -2.2F, -4.502F, 10.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(52, 44)
            .addBox(-3.9F, -0.2F, -4.502F, 8.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(27, 3)
            .addBox(4.1F, -1.2F, -4.502F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(27, 1)
            .addBox(2.1F, -1.2F, -4.502F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 27)
            .addBox(4.1F, -3.2F, -4.502F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(26, 26)
            .addBox(2.1F, -3.2F, -4.502F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(24, 26)
            .addBox(-4.9F, -3.2F, -4.502F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(22, 26)
            .addBox(-2.9F, -3.2F, -4.502F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(4, 0)
            .addBox(-0.9F, -3.2F, -4.502F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 1)
            .addBox(-0.9F, -5.2F, -4.502F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 26)
            .addBox(4.1F, -5.2F, -4.502F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(2, 26)
            .addBox(-2.9F, -5.2F, -4.502F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(4, 26)
            .addBox(-4.9F, -5.2F, -4.502F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(20, 26)
            .addBox(2.1F, -5.2F, -4.502F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-0.9F, -7.2F, -4.502F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 25)
            .addBox(4.1F, -7.2F, -4.502F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(2, 25)
            .addBox(-2.9F, -7.2F, -4.502F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(4, 25)
            .addBox(-4.9F, -7.2F, -4.502F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(20, 25)
            .addBox(2.1F, -7.2F, -4.502F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(20, 24)
            .addBox(1.1F, -9.2F, -4.502F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(4, 24)
            .addBox(-1.9F, -9.2F, -4.502F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(27, 0)
            .addBox(-2.9F, -1.2F, -4.502F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(4, 1)
            .addBox(-0.9F, -1.2F, -4.502F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(2, 27)
            .addBox(-4.9F, -1.2F, -4.502F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 3)
            .addBox(-4.9F, -6.2F, -4.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(5.1F, -4.2F, -4.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
            .texOffs(0, 1)
            .addBox(5.1F, -8.2F, -4.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
            .texOffs(0, 2)
            .addBox(5.1F, -6.2F, -4.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
            .texOffs(0, 22)
            .addBox(5.1F, -3.2F, -2.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 7)
            .addBox(5.1F, -2.2F, -4.5F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(2, 22)
            .addBox(5.1F, -5.2F, -2.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(4, 22)
            .addBox(5.1F, -7.2F, -2.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition Body = partdefinition.addOrReplaceChild(
         "Body",
         CubeListBuilder.create()
            .texOffs(0, 9)
            .addBox(-4.5F, 1.0F, -2.6F, 9.0F, 9.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(45, 25)
            .addBox(-2.5F, 10.999F, -2.6F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(26, 26)
            .addBox(-3.5F, 10.0F, -2.6F, 7.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(49, 50)
            .addBox(2.0F, -0.6F, -2.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(35, 50)
            .addBox(-4.0F, -0.6F, -2.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(0, 23)
            .addBox(-3.5F, 2.0F, -3.2F, 7.0F, 3.0F, 6.0F, new CubeDeformation(0.0F))
            .texOffs(22, 17)
            .addBox(-3.5F, 5.5F, -3.2F, 7.0F, 3.0F, 6.0F, new CubeDeformation(0.0F))
            .texOffs(40, 41)
            .addBox(-1.5F, 8.8F, -3.2F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition RightArm = partdefinition.addOrReplaceChild(
         "RightArm",
         CubeListBuilder.create().texOffs(0, 38).addBox(-3.7F, 1.99F, -2.5F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-5.0F, 2.0F, 0.0F)
      );
      PartDefinition cube_r1 = RightArm.addOrReplaceChild(
         "cube_r1",
         CubeListBuilder.create().texOffs(40, 8).addBox(-1.0F, -2.0F, -2.003F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-2.7F, -0.6F, -0.6F, 0.0F, 0.0F, -0.192F)
      );
      PartDefinition LeftArm = partdefinition.addOrReplaceChild(
         "LeftArm",
         CubeListBuilder.create().texOffs(20, 41).addBox(-1.2F, 1.99F, -2.5F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)),
         PartPose.offset(5.0F, 2.0F, 0.0F)
      );
      PartDefinition cube_r2 = LeftArm.addOrReplaceChild(
         "cube_r2",
         CubeListBuilder.create().texOffs(39, 0).addBox(-1.0F, -2.0F, -2.003F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-0.2F, -1.0F, -0.6F, 0.0F, 0.0F, 0.192F)
      );
      PartDefinition RightLeg = partdefinition.addOrReplaceChild(
         "RightLeg",
         CubeListBuilder.create()
            .texOffs(23, 5)
            .addBox(-0.2F, 13.6F, -4.5F, 0.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
            .texOffs(2, 10)
            .addBox(-0.2F, 12.6F, 2.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(6, 2)
            .addBox(-0.2F, 11.6F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(27, 0)
            .addBox(-2.7F, 11.1F, -5.5F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-0.2F, 12.6F, -5.5F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(6, 4)
            .addBox(-0.2F, 11.6F, -3.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(23, 3)
            .addBox(-2.7F, 9.1F, -3.5F, 5.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-1.9F, 12.0F, 0.0F)
      );
      PartDefinition cube_r3 = RightLeg.addOrReplaceChild(
         "cube_r3",
         CubeListBuilder.create().texOffs(0, 49).addBox(-3.997F, -1.0F, -1.001F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(1.3F, 11.6F, -4.2F, 0.384F, 0.0F, 0.0F)
      );
      PartDefinition LeftLeg = partdefinition.addOrReplaceChild(
         "LeftLeg",
         CubeListBuilder.create()
            .texOffs(23, 6)
            .addBox(0.0F, 13.6F, -4.5F, 0.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
            .texOffs(4, 0)
            .addBox(0.0F, 12.6F, -5.5F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(2, 11)
            .addBox(0.0F, 12.6F, 2.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 10)
            .addBox(0.0F, 11.6F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(6, 6)
            .addBox(0.0F, 11.6F, -3.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(52, 41)
            .addBox(-2.5F, 11.1F, -5.5F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(30, 32)
            .addBox(-2.5F, 9.1F, -3.5F, 5.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
         PartPose.offset(1.9F, 12.0F, 0.0F)
      );
      PartDefinition cube_r4 = LeftLeg.addOrReplaceChild(
         "cube_r4",
         CubeListBuilder.create().texOffs(46, 31).addBox(-3.997F, -1.0F, -1.0F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(1.5F, 11.6F, -4.2F, 0.384F, 0.0F, 0.0F)
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

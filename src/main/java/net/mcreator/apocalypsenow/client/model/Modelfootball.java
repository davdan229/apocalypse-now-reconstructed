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

public class Modelfootball<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("apocalypsenow", "modelfootball"), "main");
   public final ModelPart Head;
   public final ModelPart Body;
   public final ModelPart RightArm;
   public final ModelPart LeftArm;
   public final ModelPart RightLeg;
   public final ModelPart LeftLeg;

   public Modelfootball(ModelPart root) {
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
            .addBox(-4.5F, -9.0F, -4.5F, 9.0F, 0.0F, 9.0F, new CubeDeformation(0.0F))
            .texOffs(28, 28)
            .addBox(-4.5F, -9.0F, -4.5F, 9.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(38, 31)
            .addBox(-4.5F, -7.0F, -4.8F, 9.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(15, 20)
            .addBox(4.503F, -7.0F, -4.8F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-4.501F, -7.0F, -4.8F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
            .texOffs(37, 0)
            .addBox(-4.5F, -9.0F, 4.5F, 9.0F, 6.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(22, 42)
            .addBox(-4.5F, -9.0F, 2.5F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(0, 39)
            .addBox(-4.5F, -9.0F, -1.5F, 0.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(18, 25)
            .addBox(-4.5F, -9.0F, -4.5F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
            .texOffs(32, 36)
            .addBox(4.5F, -9.0F, -1.5F, 0.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(0, 6)
            .addBox(4.5F, -9.0F, 2.5F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(15, 17)
            .addBox(4.5F, -9.0F, -4.5F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition cube_r1 = Head.addOrReplaceChild(
         "cube_r1",
         CubeListBuilder.create()
            .texOffs(0, 1)
            .addBox(4.9999F, 1.0F, -3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 1)
            .addBox(4.9999F, 0.0F, -3.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(0, 19)
            .addBox(4.9999F, 0.0F, 1.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(21, 9)
            .addBox(4.9999F, 5.0F, -3.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
            .texOffs(6, 0)
            .addBox(4.9999F, 3.0F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(4, 0)
            .addBox(4.9999F, 3.0F, -3.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(4.9999F, 2.0F, -3.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(2, 1)
            .addBox(-4.0001F, 1.0F, -3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(23, 19)
            .addBox(-4.0001F, 3.0F, -3.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(46, 39)
            .addBox(-3.0001F, 5.0F, -3.0F, 7.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(40, 46)
            .addBox(-3.0001F, 2.0F, -3.0F, 7.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(8, 47)
            .addBox(-3.0001F, 0.0F, -3.0F, 7.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(26, 44)
            .addBox(3.9999F, 0.0F, -3.0F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(23, 22)
            .addBox(0.9999F, 3.0F, -3.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(3, 0)
            .addBox(-1.0001F, 1.0F, -3.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(5, 0)
            .addBox(0.9999F, 1.0F, -3.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(29, 12)
            .addBox(-1.0001F, 3.0F, -3.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(28, 44)
            .addBox(-4.0001F, 0.0F, -3.0F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(21, 10)
            .addBox(-4.0001F, 5.0F, -3.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
            .texOffs(2, 19)
            .addBox(-4.0001F, 3.0F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 2)
            .addBox(-4.0001F, 2.0F, -3.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(0, 3)
            .addBox(-4.0001F, 0.0F, -3.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(21, 19)
            .addBox(-4.0001F, 0.0F, 1.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-0.5F, -5.4F, -4.1F, 0.4363F, 0.0F, 0.0F)
      );
      PartDefinition Body = partdefinition.addOrReplaceChild(
         "Body",
         CubeListBuilder.create()
            .texOffs(0, 36)
            .addBox(-4.0F, 2.0F, -3.0F, 8.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 9)
            .addBox(-3.999F, 6.0F, -2.5F, 8.0F, 6.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(42, 6)
            .addBox(3.5F, 5.999F, -2.001F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(40, 36)
            .addBox(-4.5F, 5.999F, -2.001F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(46, 16)
            .addBox(-3.0F, 8.0F, -3.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(46, 18)
            .addBox(-3.0F, 9.0F, 2.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 28)
            .addBox(-4.0F, 2.0F, 2.0F, 8.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(18, 28)
            .addBox(-4.1F, -1.0F, -3.0F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F))
            .texOffs(28, 31)
            .addBox(2.1F, -1.0F, -3.0F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(), PartPose.offset(-5.0F, 2.0F, 0.0F));
      PartDefinition cube_r2 = RightArm.addOrReplaceChild(
         "cube_r2",
         CubeListBuilder.create().texOffs(18, 37).addBox(-1.0F, -2.0F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-4.8F, 0.0F, 0.0F, 0.0F, 0.0F, -0.384F)
      );
      PartDefinition cube_r3 = RightArm.addOrReplaceChild(
         "cube_r3",
         CubeListBuilder.create().texOffs(20, 20).addBox(-1.0F, -2.1F, -3.0F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-2.8F, -0.8F, 0.5F, 0.0F, 0.0F, -0.096F)
      );
      PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(), PartPose.offset(5.0F, 2.0F, 0.0F));
      PartDefinition cube_r4 = LeftArm.addOrReplaceChild(
         "cube_r4",
         CubeListBuilder.create().texOffs(40, 20).addBox(-1.0F, -2.0F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(3.8F, -0.1F, 0.0F, 0.0F, 0.0F, 0.384F)
      );
      PartDefinition cube_r5 = LeftArm.addOrReplaceChild(
         "cube_r5",
         CubeListBuilder.create().texOffs(0, 20).addBox(-1.0F, -2.0F, -3.0F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-0.4F, -1.1F, 0.5F, 0.0F, 0.0F, 0.096F)
      );
      PartDefinition RightLeg = partdefinition.addOrReplaceChild(
         "RightLeg",
         CubeListBuilder.create()
            .texOffs(22, 4)
            .addBox(-2.7F, 9.001F, -2.8F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(38, 32)
            .addBox(-2.7F, 11.0F, -4.8F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-1.9F, 12.0F, 0.0F)
      );
      PartDefinition cube_r6 = RightLeg.addOrReplaceChild(
         "cube_r6",
         CubeListBuilder.create()
            .texOffs(37, 6)
            .addBox(-0.9999F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(26, 15)
            .addBox(-4.7999F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(2.2F, 9.5F, 0.9F, -0.6807F, 0.0F, 0.0F)
      );
      PartDefinition cube_r7 = RightLeg.addOrReplaceChild(
         "cube_r7",
         CubeListBuilder.create()
            .texOffs(35, 22)
            .addBox(-0.9999F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(26, 13)
            .addBox(-4.7999F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(2.2F, 9.5F, -0.1F, -0.6807F, 0.0F, 0.0F)
      );
      PartDefinition cube_r8 = RightLeg.addOrReplaceChild(
         "cube_r8",
         CubeListBuilder.create()
            .texOffs(35, 20)
            .addBox(-0.9999F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(20, 23)
            .addBox(-4.7999F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(2.2F, 9.5F, -1.1F, -0.6807F, 0.0F, 0.0F)
      );
      PartDefinition cube_r9 = RightLeg.addOrReplaceChild(
         "cube_r9",
         CubeListBuilder.create()
            .texOffs(33, 2)
            .addBox(-0.9999F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 23)
            .addBox(-4.7999F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(2.2F, 9.5F, -2.1F, -0.6807F, 0.0F, 0.0F)
      );
      PartDefinition cube_r10 = RightLeg.addOrReplaceChild(
         "cube_r10",
         CubeListBuilder.create()
            .texOffs(33, 0)
            .addBox(-0.9999F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-4.7999F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(2.2F, 9.5F, -3.1F, -0.6807F, 0.0F, 0.0F)
      );
      PartDefinition cube_r11 = RightLeg.addOrReplaceChild(
         "cube_r11",
         CubeListBuilder.create().texOffs(46, 27).addBox(-0.9999F, -1.0F, 1.0F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-1.7F, 9.5F, -4.1F, -0.6807F, 0.0F, 0.0F)
      );
      PartDefinition LeftLeg = partdefinition.addOrReplaceChild(
         "LeftLeg",
         CubeListBuilder.create()
            .texOffs(26, 12)
            .addBox(-2.5F, 9.001F, -2.8F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(8, 44)
            .addBox(-2.5F, 11.0F, -4.8F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(1.9F, 12.0F, 0.0F)
      );
      PartDefinition cube_r12 = LeftLeg.addOrReplaceChild(
         "cube_r12",
         CubeListBuilder.create()
            .texOffs(40, 7)
            .addBox(-0.9999F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(27, 0)
            .addBox(-4.7999F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(2.4F, 9.5F, 0.9F, -0.6807F, 0.0F, 0.0F)
      );
      PartDefinition cube_r13 = LeftLeg.addOrReplaceChild(
         "cube_r13",
         CubeListBuilder.create()
            .texOffs(18, 39)
            .addBox(-0.9999F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(27, 2)
            .addBox(-4.7999F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(2.4F, 9.5F, -0.1F, -0.6807F, 0.0F, 0.0F)
      );
      PartDefinition cube_r14 = LeftLeg.addOrReplaceChild(
         "cube_r14",
         CubeListBuilder.create()
            .texOffs(38, 35)
            .addBox(-0.9999F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(30, 1)
            .addBox(-4.7999F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(2.4F, 9.5F, -1.1F, -0.6807F, 0.0F, 0.0F)
      );
      PartDefinition cube_r15 = LeftLeg.addOrReplaceChild(
         "cube_r15",
         CubeListBuilder.create()
            .texOffs(38, 21)
            .addBox(-0.9999F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(18, 31)
            .addBox(-4.7999F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(2.4F, 9.5F, -2.1F, -0.6807F, 0.0F, 0.0F)
      );
      PartDefinition cube_r16 = LeftLeg.addOrReplaceChild(
         "cube_r16",
         CubeListBuilder.create()
            .texOffs(18, 37)
            .addBox(-0.9999F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(28, 31)
            .addBox(-4.7999F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(2.4F, 9.5F, -3.1F, -0.6807F, 0.0F, 0.0F)
      );
      PartDefinition cube_r17 = LeftLeg.addOrReplaceChild(
         "cube_r17",
         CubeListBuilder.create().texOffs(46, 35).addBox(-0.9999F, -1.0F, 1.0F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-1.5F, 9.5F, -4.1F, -0.6807F, 0.0F, 0.0F)
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

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

public class Modelitalian<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("apocalypsenow", "modelitalian"), "main");
   public final ModelPart Head;
   public final ModelPart Body;
   public final ModelPart RightArm;
   public final ModelPart LeftArm;
   public final ModelPart RightLeg;
   public final ModelPart LeftLeg;

   public Modelitalian(ModelPart root) {
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
            .addBox(4.0F, -8.0F, -4.0F, 1.0F, 6.0F, 8.0F, new CubeDeformation(0.0F))
            .texOffs(0, 10)
            .addBox(-5.0F, -8.0F, -4.0F, 1.0F, 6.0F, 8.0F, new CubeDeformation(0.0F))
            .texOffs(46, 0)
            .addBox(-4.0F, -8.0F, 4.0F, 8.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(42, 35)
            .addBox(-4.0F, -8.0F, -4.8F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-4.0F, -9.0F, -4.0F, 8.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition Head_r1 = Head.addOrReplaceChild(
         "Head_r1",
         CubeListBuilder.create().texOffs(41, 58).addBox(4.1F, -13.1F, -3.4F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(4.5F, -9.6F, 0.4F, -0.1219F, -0.0895F, -2.2706F)
      );
      PartDefinition Head_r2 = Head.addOrReplaceChild(
         "Head_r2",
         CubeListBuilder.create().texOffs(16, 31).addBox(4.2F, -11.8F, -4.4F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(4.5F, -9.6F, 0.4F, -0.1292F, -0.0786F, -2.1837F)
      );
      PartDefinition Head_r3 = Head.addOrReplaceChild(
         "Head_r3",
         CubeListBuilder.create().texOffs(22, 57).addBox(0.0F, -11.0F, -3.4F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(4.5F, -9.6F, 0.4F, -0.1468F, -0.0362F, -1.8807F)
      );
      PartDefinition Head_r4 = Head.addOrReplaceChild(
         "Head_r4",
         CubeListBuilder.create().texOffs(16, 28).addBox(10.3F, -11.3F, -4.4F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(4.5F, -9.6F, 0.4F, -0.0668F, -0.1357F, -2.7515F)
      );
      PartDefinition Head_r5 = Head.addOrReplaceChild(
         "Head_r5",
         CubeListBuilder.create().texOffs(42, 42).addBox(4.1F, -13.1F, -3.4F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(1.5F, -9.6F, 3.3F, 0.3844F, 0.3201F, -2.2098F)
      );
      PartDefinition Head_r6 = Head.addOrReplaceChild(
         "Head_r6",
         CubeListBuilder.create().texOffs(0, 38).addBox(4.2F, -11.8F, -4.4F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(1.5F, -9.6F, 3.3F, 0.4096F, 0.2863F, -2.1255F)
      );
      PartDefinition Head_r7 = Head.addOrReplaceChild(
         "Head_r7",
         CubeListBuilder.create().texOffs(56, 56).addBox(0.0F, -11.0F, -3.4F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(1.5F, -9.6F, 3.3F, 0.4721F, 0.1551F, -1.8426F)
      );
      PartDefinition Head_r8 = Head.addOrReplaceChild(
         "Head_r8",
         CubeListBuilder.create().texOffs(0, 35).addBox(10.3F, -11.3F, -4.4F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(1.5F, -9.6F, 3.3F, 0.1913F, 0.4595F, -2.7077F)
      );
      PartDefinition Head_r9 = Head.addOrReplaceChild(
         "Head_r9",
         CubeListBuilder.create().texOffs(40, 0).addBox(10.3F, -11.3F, -4.4F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(1.8F, -4.7F, 3.3F, 0.1913F, 0.4595F, -1.8351F)
      );
      PartDefinition Head_r10 = Head.addOrReplaceChild(
         "Head_r10",
         CubeListBuilder.create().texOffs(56, 43).addBox(0.0F, -11.0F, -3.4F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(1.8F, -4.7F, 3.3F, 0.4721F, 0.1551F, -0.9699F)
      );
      PartDefinition Head_r11 = Head.addOrReplaceChild(
         "Head_r11",
         CubeListBuilder.create().texOffs(22, 39).addBox(4.2F, -11.8F, -4.4F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(1.8F, -4.7F, 3.3F, 0.4096F, 0.2863F, -1.2529F)
      );
      PartDefinition Head_r12 = Head.addOrReplaceChild(
         "Head_r12",
         CubeListBuilder.create().texOffs(44, 8).addBox(4.1F, -13.1F, -3.4F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(1.8F, -4.7F, 3.3F, 0.3844F, 0.3201F, -1.3372F)
      );
      PartDefinition Head_r13 = Head.addOrReplaceChild(
         "Head_r13",
         CubeListBuilder.create().texOffs(10, 48).addBox(4.1F, -13.1F, -3.4F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(5.0F, -3.8F, -3.0F, -0.5468F, 0.3796F, -1.6785F)
      );
      PartDefinition Head_r14 = Head.addOrReplaceChild(
         "Head_r14",
         CubeListBuilder.create().texOffs(32, 40).addBox(4.2F, -11.8F, -4.4F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(5.0F, -3.8F, -3.0F, -0.5148F, 0.4239F, -1.5967F)
      );
      PartDefinition Head_r15 = Head.addOrReplaceChild(
         "Head_r15",
         CubeListBuilder.create().texOffs(48, 8).addBox(0.0F, -11.0F, -3.4F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(5.0F, -3.8F, -3.0F, -0.3663F, 0.5553F, -1.2836F)
      );
      PartDefinition Head_r16 = Head.addOrReplaceChild(
         "Head_r16",
         CubeListBuilder.create().texOffs(26, 40).addBox(10.3F, -11.3F, -4.4F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(5.0F, -3.8F, -3.0F, -0.6471F, 0.1059F, -2.0863F)
      );
      PartDefinition Head_r17 = Head.addOrReplaceChild(
         "Head_r17",
         CubeListBuilder.create().texOffs(48, 14).addBox(4.1F, -13.1F, -3.4F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(1.0F, 0.3F, -1.9F, -0.5468F, 0.3796F, -1.024F)
      );
      PartDefinition Head_r18 = Head.addOrReplaceChild(
         "Head_r18",
         CubeListBuilder.create().texOffs(0, 42).addBox(4.2F, -11.8F, -4.4F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(1.0F, 0.3F, -1.9F, -0.5148F, 0.4239F, -0.9422F)
      );
      PartDefinition Head_r19 = Head.addOrReplaceChild(
         "Head_r19",
         CubeListBuilder.create().texOffs(48, 11).addBox(0.0F, -11.0F, -3.4F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(1.0F, 0.3F, -1.9F, -0.3663F, 0.5553F, -0.6291F)
      );
      PartDefinition Head_r20 = Head.addOrReplaceChild(
         "Head_r20",
         CubeListBuilder.create().texOffs(36, 40).addBox(10.3F, -11.3F, -4.4F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(1.0F, 0.3F, -1.9F, -0.6471F, 0.1059F, -1.4318F)
      );
      PartDefinition Head_r21 = Head.addOrReplaceChild(
         "Head_r21",
         CubeListBuilder.create().texOffs(10, 13).addBox(10.3F, -11.3F, -4.4F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.3963F)
      );
      PartDefinition Head_r22 = Head.addOrReplaceChild(
         "Head_r22",
         CubeListBuilder.create().texOffs(14, 13).addBox(4.2F, -11.8F, -4.4F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.829F)
      );
      PartDefinition Head_r23 = Head.addOrReplaceChild(
         "Head_r23",
         CubeListBuilder.create().texOffs(10, 51).addBox(4.1F, -13.1F, -3.4F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.9163F)
      );
      PartDefinition Head_r24 = Head.addOrReplaceChild(
         "Head_r24",
         CubeListBuilder.create().texOffs(10, 54).addBox(0.0F, -11.0F, -3.4F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5236F)
      );
      PartDefinition Body = partdefinition.addOrReplaceChild(
         "Body",
         CubeListBuilder.create()
            .texOffs(28, 23)
            .addBox(-4.0F, 1.0F, -3.0F, 8.0F, 11.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 29)
            .addBox(-4.0F, 7.0F, -4.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(24, 0)
            .addBox(-1.8F, 7.0F, -4.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 10)
            .addBox(0.3F, 7.0F, -4.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(6, 44)
            .addBox(-0.5F, 2.0F, -3.6F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(2.5F, 7.0F, -4.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(42, 39)
            .addBox(-3.0F, 12.0F, -3.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(46, 19)
            .addBox(3.3F, 1.0F, -2.0F, 1.0F, 11.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(16, 31)
            .addBox(3.3F, 8.0F, -2.8F, 3.0F, 4.0F, 6.0F, new CubeDeformation(0.0F))
            .texOffs(0, 44)
            .addBox(-4.2F, 1.0F, -2.0F, 1.0F, 11.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(22, 58)
            .addBox(-4.0F, 0.0F, -3.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(15, 57)
            .addBox(3.0F, 0.0F, -3.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(20, 10)
            .addBox(-4.0F, 0.0F, 2.0F, 8.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition RightArm = partdefinition.addOrReplaceChild(
         "RightArm",
         CubeListBuilder.create()
            .texOffs(56, 21)
            .addBox(-3.0F, -2.0F, -2.9F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 30)
            .addBox(-3.7F, -2.1F, -3.0F, 5.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
            .texOffs(46, 55)
            .addBox(-3.0F, -2.0F, 1.9F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(36, 42)
            .addBox(-3.5F, -2.0F, -1.9F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(16, 41)
            .addBox(0.1F, -2.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-5.0F, 2.0F, 0.0F)
      );
      PartDefinition LeftArm = partdefinition.addOrReplaceChild(
         "LeftArm",
         CubeListBuilder.create()
            .texOffs(52, 8)
            .addBox(-1.0F, -2.0F, -2.9F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(46, 42)
            .addBox(-1.0F, -2.0F, 1.9F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(55, 51)
            .addBox(-1.0F, 9.3F, -2.1F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(24, 0)
            .addBox(-1.3F, -2.1F, -3.0F, 5.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
            .texOffs(26, 42)
            .addBox(-1.5F, -2.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(38, 7)
            .addBox(2.5F, -2.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offset(5.0F, 2.0F, 0.0F)
      );
      PartDefinition RightLeg = partdefinition.addOrReplaceChild(
         "RightLeg",
         CubeListBuilder.create()
            .texOffs(28, 35)
            .addBox(-2.0F, 11.0F, -4.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
            .texOffs(56, 43)
            .addBox(-2.5F, 8.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(10, 53)
            .addBox(1.5F, 8.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(10, 10)
            .addBox(-2.0F, 8.0F, 1.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(34, 61)
            .addBox(-2.0F, 8.5F, -2.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-2.0F, 12.0F, 0.0F)
      );
      PartDefinition cube_r1 = RightLeg.addOrReplaceChild(
         "cube_r1",
         CubeListBuilder.create().texOffs(29, 58).addBox(-2.0F, 8.6F, -7.8F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4363F, 0.0F, 0.0F)
      );
      PartDefinition LeftLeg = partdefinition.addOrReplaceChild(
         "LeftLeg",
         CubeListBuilder.create()
            .texOffs(0, 37)
            .addBox(-2.0F, 11.0F, -4.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
            .texOffs(56, 56)
            .addBox(1.5F, 8.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(56, 35)
            .addBox(-2.3F, 8.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(32, 7)
            .addBox(-2.0F, 8.4F, -2.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 24)
            .addBox(-2.0F, 8.0F, 1.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(2.0F, 12.0F, 0.0F)
      );
      PartDefinition cube_r2 = LeftLeg.addOrReplaceChild(
         "cube_r2",
         CubeListBuilder.create().texOffs(0, 59).addBox(-2.0F, 8.6F, -7.6F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4363F, 0.0F, 0.0F)
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

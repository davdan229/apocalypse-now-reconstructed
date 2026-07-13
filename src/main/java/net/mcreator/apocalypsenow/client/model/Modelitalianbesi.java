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

public class Modelitalianbesi<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("apocalypsenow", "modelitalianbesi"), "main");
   public final ModelPart Head;
   public final ModelPart Body;
   public final ModelPart RightArm;
   public final ModelPart LeftArm;
   public final ModelPart RightLeg;
   public final ModelPart LeftLeg;

   public Modelitalianbesi(ModelPart root) {
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
            .texOffs(39, 29)
            .addBox(-4.5F, 0.5F, -2.0F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(2, 2)
            .addBox(-4.5F, -0.5F, -2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 2)
            .addBox(4.5F, -0.5F, -2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-5.0F, 0.3F, -2.0F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-4.5F, -8.5F, -4.6F, 9.0F, 0.0F, 9.0F, new CubeDeformation(0.0F))
            .texOffs(51, 43)
            .addBox(-4.5F, -8.5F, -4.6F, 9.0F, 4.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(51, 39)
            .addBox(-4.0F, -8.7F, -5.2F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(3, 2)
            .addBox(-5.0F, -7.4F, -5.1F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(18, 11)
            .addBox(-5.0F, -7.4F, -5.1F, 0.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
            .texOffs(18, 0)
            .addBox(5.0F, -7.4F, -5.1F, 0.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
            .texOffs(40, 28)
            .addBox(-5.0F, -7.4F, 4.9F, 10.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(3, 1)
            .addBox(4.0F, -7.4F, -5.1F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 15)
            .addBox(-4.0F, -5.7F, -5.2F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 13)
            .addBox(1.0F, -5.7F, -5.2F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(48, 24)
            .addBox(-3.5F, -0.5F, 4.4F, 7.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(36, 11)
            .addBox(-4.5F, -8.5F, 4.4F, 9.0F, 8.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-4.5F, -0.5F, 4.4F, 9.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 16)
            .addBox(4.5F, -8.5F, -4.6F, 0.0F, 6.0F, 9.0F, new CubeDeformation(0.0F))
            .texOffs(0, 10)
            .addBox(-4.5F, -8.5F, -4.6F, 0.0F, 6.0F, 9.0F, new CubeDeformation(0.0F))
            .texOffs(16, 32)
            .addBox(-4.5F, -2.5F, -3.6F, 0.0F, 2.0F, 8.0F, new CubeDeformation(0.0F))
            .texOffs(27, 0)
            .addBox(4.5F, -2.5F, -3.6F, 0.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, -2.0F, 0.0F)
      );
      PartDefinition cube_r1 = Head.addOrReplaceChild(
         "cube_r1",
         CubeListBuilder.create().texOffs(118, 46).addBox(0.0F, -1.0F, -3.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-8.7F, -5.6F, 1.4F, -0.0882F, 0.1084F, -0.6855F)
      );
      PartDefinition cube_r2 = Head.addOrReplaceChild(
         "cube_r2",
         CubeListBuilder.create().texOffs(118, 46).addBox(0.0F, -1.0F, -3.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-6.8F, -7.2F, 1.1F, -0.0049F, 0.1395F, -0.0352F)
      );
      PartDefinition cube_r3 = Head.addOrReplaceChild(
         "cube_r3",
         CubeListBuilder.create().texOffs(118, 46).addBox(0.0F, -1.0F, -3.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-6.8F, -4.8F, -2.4F, -1.5757F, 0.1395F, -0.0352F)
      );
      PartDefinition cube_r4 = Head.addOrReplaceChild(
         "cube_r4",
         CubeListBuilder.create().texOffs(118, 46).addBox(0.0F, -1.0F, -3.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-7.0F, -3.5F, -2.5F, -1.659F, 0.1084F, -0.6855F)
      );
      PartDefinition cube_r5 = Head.addOrReplaceChild(
         "cube_r5",
         CubeListBuilder.create().texOffs(118, 46).addBox(0.0F, -1.0F, -3.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-6.9F, -4.2F, 0.3F, -0.0882F, 0.1084F, -1.2091F)
      );
      PartDefinition cube_r6 = Head.addOrReplaceChild(
         "cube_r6",
         CubeListBuilder.create().texOffs(118, 46).addBox(0.0F, -1.0F, -3.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-5.1F, -2.8F, -3.3F, -1.659F, 0.1084F, -1.2091F)
      );
      PartDefinition cube_r7 = Head.addOrReplaceChild(
         "cube_r7",
         CubeListBuilder.create().texOffs(118, 46).addBox(0.0F, -1.0F, -3.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-6.3F, -6.5F, 0.0F, -0.0049F, 0.1395F, -0.5588F)
      );
      PartDefinition cube_r8 = Head.addOrReplaceChild(
         "cube_r8",
         CubeListBuilder.create().texOffs(118, 46).addBox(0.0F, -1.0F, -3.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-5.3F, -4.2F, -3.5F, -1.5757F, 0.1395F, -0.5588F)
      );
      PartDefinition cube_r9 = Head.addOrReplaceChild(
         "cube_r9",
         CubeListBuilder.create().texOffs(118, 46).addBox(0.0F, -1.0F, -3.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-6.9F, -3.3F, 1.0F, -0.0882F, 0.1084F, -1.2091F)
      );
      PartDefinition cube_r10 = Head.addOrReplaceChild(
         "cube_r10",
         CubeListBuilder.create().texOffs(118, 46).addBox(0.0F, -1.0F, -3.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-5.1F, -1.9F, -2.6F, -1.659F, 0.1084F, -1.2091F)
      );
      PartDefinition cube_r11 = Head.addOrReplaceChild(
         "cube_r11",
         CubeListBuilder.create().texOffs(118, 46).addBox(0.0F, -1.0F, -3.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-6.3F, -5.6F, 0.7F, -0.0049F, 0.1395F, -0.5588F)
      );
      PartDefinition cube_r12 = Head.addOrReplaceChild(
         "cube_r12",
         CubeListBuilder.create().texOffs(118, 46).addBox(0.0F, -1.0F, -3.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-5.3F, -3.3F, -2.8F, -1.5757F, 0.1395F, -0.5588F)
      );
      PartDefinition cube_r13 = Head.addOrReplaceChild(
         "cube_r13",
         CubeListBuilder.create().texOffs(118, 46).addBox(0.0F, -1.0F, -3.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-5.3F, -2.7F, -4.2F, -1.5757F, 0.1395F, -0.5588F)
      );
      PartDefinition cube_r14 = Head.addOrReplaceChild(
         "cube_r14",
         CubeListBuilder.create().texOffs(118, 46).addBox(0.0F, -1.0F, -3.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-6.3F, -5.0F, -0.7F, -0.0049F, 0.1395F, -0.5588F)
      );
      PartDefinition cube_r15 = Head.addOrReplaceChild(
         "cube_r15",
         CubeListBuilder.create().texOffs(118, 46).addBox(0.0F, -1.0F, -3.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-5.1F, -1.3F, -4.0F, -1.659F, 0.1084F, -1.2091F)
      );
      PartDefinition cube_r16 = Head.addOrReplaceChild(
         "cube_r16",
         CubeListBuilder.create().texOffs(118, 46).addBox(0.0F, -1.0F, -3.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-6.9F, -2.7F, -0.4F, -0.0882F, 0.1084F, -1.2091F)
      );
      PartDefinition cube_r17 = Head.addOrReplaceChild(
         "cube_r17",
         CubeListBuilder.create().texOffs(118, 46).addBox(0.0F, -1.0F, -3.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-8.7F, -5.0F, -0.4F, -0.0882F, 0.1084F, -0.6855F)
      );
      PartDefinition cube_r18 = Head.addOrReplaceChild(
         "cube_r18",
         CubeListBuilder.create().texOffs(118, 46).addBox(0.0F, -1.0F, -3.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-6.8F, -6.6F, -0.7F, -0.0049F, 0.1395F, -0.0352F)
      );
      PartDefinition cube_r19 = Head.addOrReplaceChild(
         "cube_r19",
         CubeListBuilder.create().texOffs(118, 46).addBox(0.0F, -1.0F, -3.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-6.8F, -4.2F, -4.2F, -1.5757F, 0.1395F, -0.0352F)
      );
      PartDefinition cube_r20 = Head.addOrReplaceChild(
         "cube_r20",
         CubeListBuilder.create().texOffs(118, 46).addBox(0.0F, -1.0F, -3.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-7.6F, -3.1F, -4.0F, -1.659F, 0.1084F, -0.6855F)
      );
      PartDefinition cube_r21 = Head.addOrReplaceChild(
         "cube_r21",
         CubeListBuilder.create().texOffs(118, 46).addBox(0.0F, -1.0F, -3.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-8.7F, -6.3F, 0.1F, -0.0882F, 0.1084F, -0.6855F)
      );
      PartDefinition cube_r22 = Head.addOrReplaceChild(
         "cube_r22",
         CubeListBuilder.create().texOffs(118, 46).addBox(0.0F, -1.0F, -3.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-7.0F, -4.2F, -3.8F, -1.659F, 0.1084F, -0.6855F)
      );
      PartDefinition cube_r23 = Head.addOrReplaceChild(
         "cube_r23",
         CubeListBuilder.create().texOffs(118, 46).addBox(0.0F, -1.0F, -3.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-6.8F, -5.5F, -3.7F, -1.5757F, 0.1395F, -0.0352F)
      );
      PartDefinition cube_r24 = Head.addOrReplaceChild(
         "cube_r24",
         CubeListBuilder.create().texOffs(118, 46).addBox(0.0F, -1.0F, -3.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-6.8F, -7.9F, -0.2F, -0.0049F, 0.1395F, -0.0352F)
      );
      PartDefinition cube_r25 = Head.addOrReplaceChild(
         "cube_r25",
         CubeListBuilder.create().texOffs(118, 46).addBox(0.0F, -1.0F, -3.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-6.8F, -8.0F, 0.6F, 0.0F, 0.0F, -0.0349F)
      );
      PartDefinition cube_r26 = Head.addOrReplaceChild(
         "cube_r26",
         CubeListBuilder.create().texOffs(118, 46).addBox(0.0F, -1.0F, -3.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-6.8F, -5.6F, -2.9F, -1.5708F, 0.0F, -0.0349F)
      );
      PartDefinition cube_r27 = Head.addOrReplaceChild(
         "cube_r27",
         CubeListBuilder.create().texOffs(118, 46).addBox(0.0F, -1.0F, -3.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-8.7F, -6.4F, 0.5F, 0.0F, 0.0F, -0.6807F)
      );
      PartDefinition cube_r28 = Head.addOrReplaceChild(
         "cube_r28",
         CubeListBuilder.create().texOffs(118, 46).addBox(0.0F, -1.0F, -3.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-7.0F, -4.3F, -3.0F, -1.5708F, 0.0F, -0.6807F)
      );
      PartDefinition cube_r29 = Head.addOrReplaceChild(
         "cube_r29",
         CubeListBuilder.create().texOffs(118, 46).addBox(0.0F, -1.0F, -3.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-6.8F, -7.6F, -1.4F, 0.0F, 0.0F, -0.0349F)
      );
      PartDefinition cube_r30 = Head.addOrReplaceChild(
         "cube_r30",
         CubeListBuilder.create().texOffs(118, 46).addBox(0.0F, -1.0F, -3.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-6.8F, -5.2F, -4.9F, -1.5708F, 0.0F, -0.0349F)
      );
      PartDefinition cube_r31 = Head.addOrReplaceChild(
         "cube_r31",
         CubeListBuilder.create().texOffs(118, 46).addBox(0.0F, -1.0F, -3.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-7.0F, -3.9F, -5.0F, -1.5708F, 0.0F, -0.6807F)
      );
      PartDefinition cube_r32 = Head.addOrReplaceChild(
         "cube_r32",
         CubeListBuilder.create().texOffs(118, 46).addBox(0.0F, -1.0F, -3.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-8.7F, -6.0F, -1.5F, 0.0F, 0.0F, -0.6807F)
      );
      PartDefinition cube_r33 = Head.addOrReplaceChild(
         "cube_r33",
         CubeListBuilder.create().texOffs(118, 46).addBox(0.0F, -1.0F, -3.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-5.9F, -9.7F, -0.5F, 0.0F, 0.0F, 0.6109F)
      );
      PartDefinition cube_r34 = Head.addOrReplaceChild(
         "cube_r34",
         CubeListBuilder.create().texOffs(118, 46).addBox(0.0F, -1.0F, -3.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-7.4F, -7.5F, -4.0F, -1.5708F, 0.0F, 0.6109F)
      );
      PartDefinition cube_r35 = Head.addOrReplaceChild(
         "cube_r35",
         CubeListBuilder.create().texOffs(118, 46).addBox(0.0F, -1.0F, -3.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-9.4F, -9.6F, -4.1F, -1.5708F, 0.0F, 0.6807F)
      );
      PartDefinition cube_r36 = Head.addOrReplaceChild(
         "cube_r36",
         CubeListBuilder.create().texOffs(118, 46).addBox(0.0F, -1.0F, -3.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-7.9F, -11.5F, -0.6F, 0.0F, 0.0F, 0.6807F)
      );
      PartDefinition cube_r37 = Head.addOrReplaceChild(
         "cube_r37",
         CubeListBuilder.create().texOffs(118, 46).addBox(0.0F, -1.0F, -3.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-8.0F, -7.1F, -2.2F, -1.5708F, 0.0F, 0.6109F)
      );
      PartDefinition cube_r38 = Head.addOrReplaceChild(
         "cube_r38",
         CubeListBuilder.create().texOffs(118, 46).addBox(0.0F, -1.0F, -3.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-9.2F, -11.6F, 1.2F, 0.0F, 0.0F, 0.6807F)
      );
      PartDefinition cube_r39 = Head.addOrReplaceChild(
         "cube_r39",
         CubeListBuilder.create().texOffs(118, 46).addBox(0.0F, -1.0F, -3.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-10.7F, -9.7F, -2.3F, -1.5708F, 0.0F, 0.6807F)
      );
      PartDefinition cube_r40 = Head.addOrReplaceChild(
         "cube_r40",
         CubeListBuilder.create().texOffs(118, 46).addBox(0.0F, -1.0F, -3.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-7.0F, -9.5F, 1.3F, 0.0F, 0.0F, 0.6109F)
      );
      PartDefinition cube_r41 = Head.addOrReplaceChild(
         "cube_r41",
         CubeListBuilder.create().texOffs(118, 46).addBox(0.0F, -1.0F, -3.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-9.2F, -12.5F, 0.6F, 0.0F, 0.0F, 0.6807F)
      );
      PartDefinition cube_r42 = Head.addOrReplaceChild(
         "cube_r42",
         CubeListBuilder.create().texOffs(118, 46).addBox(0.0F, -1.0F, -3.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-10.7F, -10.6F, -2.9F, -1.5708F, 0.0F, 0.6807F)
      );
      PartDefinition cube_r43 = Head.addOrReplaceChild(
         "cube_r43",
         CubeListBuilder.create().texOffs(118, 46).addBox(0.0F, -1.0F, -3.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-8.0F, -8.0F, -2.8F, -1.5708F, 0.0F, 0.6109F)
      );
      PartDefinition cube_r44 = Head.addOrReplaceChild(
         "cube_r44",
         CubeListBuilder.create()
            .texOffs(118, 46)
            .addBox(0.0F, -1.0F, -3.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(118, 46)
            .addBox(0.0F, -1.0F, -5.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-7.0F, -10.4F, 0.7F, 0.0F, 0.0F, 0.6109F)
      );
      PartDefinition cube_r45 = Head.addOrReplaceChild(
         "cube_r45",
         CubeListBuilder.create().texOffs(118, 46).addBox(0.0F, -1.0F, -3.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-8.0F, -8.0F, -4.8F, -1.5708F, 0.0F, 0.6109F)
      );
      PartDefinition cube_r46 = Head.addOrReplaceChild(
         "cube_r46",
         CubeListBuilder.create().texOffs(118, 46).addBox(0.0F, -1.0F, -3.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-9.8F, -8.5F, -4.9F, -1.5708F, 0.0F, 0.2443F)
      );
      PartDefinition cube_r47 = Head.addOrReplaceChild(
         "cube_r47",
         CubeListBuilder.create().texOffs(118, 46).addBox(0.0F, -1.0F, -3.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-9.2F, -10.9F, -1.4F, 0.0F, 0.0F, 0.2443F)
      );
      PartDefinition cube_r48 = Head.addOrReplaceChild(
         "cube_r48",
         CubeListBuilder.create().texOffs(118, 46).addBox(0.0F, -1.0F, -3.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-9.2F, -9.7F, -0.4F, 0.0F, 0.0F, -0.0349F)
      );
      PartDefinition cube_r49 = Head.addOrReplaceChild(
         "cube_r49",
         CubeListBuilder.create().texOffs(118, 46).addBox(0.0F, -1.0F, -3.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-9.2F, -7.2F, -3.9F, -1.5708F, 0.0F, -0.0349F)
      );
      PartDefinition cube_r50 = Head.addOrReplaceChild(
         "cube_r50",
         CubeListBuilder.create().texOffs(118, 46).addBox(0.0F, -1.0F, -3.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-8.0F, -7.6F, -3.8F, -1.5708F, 0.0F, 0.6109F)
      );
      PartDefinition cube_r51 = Head.addOrReplaceChild(
         "cube_r51",
         CubeListBuilder.create().texOffs(118, 46).addBox(0.0F, -1.0F, -3.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-7.0F, -10.0F, -0.3F, 0.0F, 0.0F, 0.6109F)
      );
      PartDefinition cube_r52 = Head.addOrReplaceChild(
         "cube_r52",
         CubeListBuilder.create().texOffs(118, 46).addBox(0.0F, -1.0F, -3.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-8.2F, -5.6F, -4.9F, -1.5708F, 0.0F, -0.384F)
      );
      PartDefinition cube_r53 = Head.addOrReplaceChild(
         "cube_r53",
         CubeListBuilder.create().texOffs(118, 46).addBox(0.0F, -1.0F, -3.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-9.2F, -7.9F, -1.4F, 0.0F, 0.0F, -0.384F)
      );
      PartDefinition cube_r54 = Head.addOrReplaceChild(
         "cube_r54",
         CubeListBuilder.create().texOffs(118, 46).addBox(0.0F, -1.0F, -3.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-7.6F, -6.5F, -4.8F, -1.5708F, 0.0F, 0.2618F)
      );
      PartDefinition cube_r55 = Head.addOrReplaceChild(
         "cube_r55",
         CubeListBuilder.create().texOffs(118, 46).addBox(0.0F, -1.0F, -3.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-7.0F, -8.9F, -1.3F, 0.0F, 0.0F, 0.2618F)
      );
      PartDefinition Body = partdefinition.addOrReplaceChild(
         "Body",
         CubeListBuilder.create()
            .texOffs(108, 82)
            .addBox(2.9F, 3.0F, -2.0F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(70, 116)
            .addBox(-4.1F, 3.0F, -2.0F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(98, 101)
            .addBox(-4.1F, 1.0F, -3.0F, 8.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(99, 101)
            .addBox(-3.1F, 9.0F, -3.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(99, 101)
            .addBox(-3.1F, 9.0F, 2.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(70, 87)
            .addBox(-3.6F, 6.1F, -3.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(70, 87)
            .addBox(1.5F, 6.1F, -3.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(70, 87)
            .addBox(1.5F, 1.1F, -3.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(63, 103)
            .addBox(3.5F, 6.1F, -2.4F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(70, 87)
            .addBox(-1.0F, 6.1F, -3.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(114, 78)
            .addBox(0.9F, -1.5F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(117, 81)
            .addBox(0.9F, -1.0F, -3.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(117, 81)
            .addBox(-4.1F, -1.0F, -3.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(118, 81)
            .addBox(-0.1F, 0.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(106, 119)
            .addBox(-4.1F, -1.5F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(90, 87)
            .addBox(-4.1F, -1.0F, 2.0F, 8.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(35, 39)
            .addBox(-4.0F, 2.0F, -2.505F, 8.0F, 10.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 31)
            .addBox(-4.0F, 1.0F, 2.505F, 8.0F, 11.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(18, 27)
            .addBox(1.0F, 0.0F, 2.5F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(27, 5)
            .addBox(-4.0F, 0.0F, 2.5F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(43, 2)
            .addBox(-4.0F, 0.0F, -2.505F, 3.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(18, 16)
            .addBox(1.0F, 0.0F, -2.505F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(18, 9)
            .addBox(0.0F, 1.0F, -2.505F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 47)
            .addBox(4.004F, 2.0F, -2.5F, 0.0F, 10.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(40, 44)
            .addBox(-4.005F, 2.0F, -2.5F, 0.0F, 10.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(13, 11)
            .addBox(-4.0F, 0.0F, -2.5F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(2, 0)
            .addBox(1.0F, 0.0F, -2.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(2.0F, 0.0F, -2.5F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(0, 2)
            .addBox(1.0F, 0.0F, 1.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 1)
            .addBox(-2.0F, 0.0F, 1.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-2.0F, 0.0F, -2.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition tankersixbod_r1 = Body.addOrReplaceChild(
         "tankersixbod_r1",
         CubeListBuilder.create().texOffs(69, 86).addBox(-2.2F, 8.0F, -4.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-0.7F, -0.7F, -1.2F, 0.0F, 0.7854F, 0.0F)
      );
      PartDefinition tankersixbod_r2 = Body.addOrReplaceChild(
         "tankersixbod_r2",
         CubeListBuilder.create().texOffs(69, 86).addBox(-2.2F, 8.0F, -4.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(2.1F, -0.7F, 0.6F, 0.0F, -0.7854F, 0.0F)
      );
      PartDefinition RightArm = partdefinition.addOrReplaceChild(
         "RightArm",
         CubeListBuilder.create()
            .texOffs(50, 57)
            .addBox(-3.5F, -2.4F, -2.5F, 5.0F, 10.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(20, 57)
            .addBox(-3.5F, -2.4F, 2.5F, 5.0F, 10.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 37)
            .addBox(-3.5F, -2.4F, -2.5F, 0.0F, 10.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(10, 47)
            .addBox(1.5F, -0.4F, -2.5F, 0.0F, 8.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(15, 42)
            .addBox(-3.5F, -2.405F, -2.5F, 5.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-5.0F, 2.0F, 0.0F)
      );
      PartDefinition LeftArm = partdefinition.addOrReplaceChild(
         "LeftArm",
         CubeListBuilder.create()
            .texOffs(58, 29)
            .addBox(-1.5F, -2.4F, 2.5F, 5.0F, 10.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(58, 11)
            .addBox(-1.5F, -2.4F, -2.5F, 5.0F, 10.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(10, 37)
            .addBox(3.5F, -2.4F, -2.5F, 0.0F, 10.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(50, 44)
            .addBox(-1.5F, -0.4F, -2.5F, 0.0F, 8.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(43, 19)
            .addBox(-1.5F, -2.405F, -2.5F, 5.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)),
         PartPose.offset(5.0F, 2.0F, 0.0F)
      );
      PartDefinition RightLeg = partdefinition.addOrReplaceChild(
         "RightLeg",
         CubeListBuilder.create()
            .texOffs(19, 108)
            .addBox(-2.5F, 7.0F, -3.405F, 5.0F, 3.0F, 6.0F, new CubeDeformation(0.0F))
            .texOffs(0, 9)
            .addBox(-2.5F, 10.0F, -5.405F, 5.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-1.9F, 12.0F, 0.0F)
      );
      PartDefinition cube_r56 = RightLeg.addOrReplaceChild(
         "cube_r56",
         CubeListBuilder.create().texOffs(53, 0).addBox(-4.995F, -1.0F, -0.005F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(2.5F, 10.7F, -3.8F, 0.7679F, 0.0F, 0.0F)
      );
      PartDefinition LeftLeg = partdefinition.addOrReplaceChild(
         "LeftLeg",
         CubeListBuilder.create()
            .texOffs(18, 11)
            .addBox(-2.6F, 10.0F, -5.4F, 5.0F, 2.0F, 8.0F, new CubeDeformation(0.0F))
            .texOffs(28, 86)
            .addBox(-2.6F, 7.0F, -3.4F, 5.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
         PartPose.offset(1.9F, 12.0F, 0.0F)
      );
      PartDefinition cube_r57 = LeftLeg.addOrReplaceChild(
         "cube_r57",
         CubeListBuilder.create().texOffs(53, 3).addBox(-4.995F, -1.0F, 0.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(2.4F, 10.7F, -3.8F, 0.7679F, 0.0F, 0.0F)
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

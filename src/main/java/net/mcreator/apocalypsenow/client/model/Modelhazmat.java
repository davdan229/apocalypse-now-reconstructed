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

public class Modelhazmat<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("apocalypsenow", "modelhazmat"), "main");
   public final ModelPart Head;
   public final ModelPart Body;
   public final ModelPart RightArm;
   public final ModelPart LeftArm;
   public final ModelPart RightLeg;
   public final ModelPart LeftLeg;

   public Modelhazmat(ModelPart root) {
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
            .texOffs(24, 0)
            .addBox(4.0F, -8.0F, -4.0F, 0.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
            .texOffs(0, 8)
            .addBox(-4.0F, -8.0F, -4.0F, 8.0F, 0.0F, 8.0F, new CubeDeformation(0.0F))
            .texOffs(24, 0)
            .addBox(-4.0F, -8.0F, 4.0F, 8.0F, 8.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(36, 16)
            .addBox(-4.0F, -3.0F, -4.6F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(46, 53)
            .addBox(-4.0F, -8.0F, -4.6F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(32, 56)
            .addBox(-1.0F, -5.0F, -4.6F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(40, 3)
            .addBox(-3.0F, -5.0F, -4.2F, 6.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(45, 46)
            .addBox(-1.0F, -3.0F, -5.6F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 16)
            .addBox(3.0F, -5.0F, -4.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(16, 32)
            .addBox(-4.0F, -5.0F, -4.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-4.0F, 0.0F, -4.0F, 8.0F, 0.0F, 8.0F, new CubeDeformation(0.0F))
            .texOffs(0, 24)
            .addBox(-4.0F, -8.0F, -4.0F, 0.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition Head_r1 = Head.addOrReplaceChild(
         "Head_r1",
         CubeListBuilder.create()
            .texOffs(48, 11)
            .addBox(-1.8F, -10.0F, -5.3F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(48, 12)
            .addBox(-1.8F, -6.0F, -5.3F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 4.0F, 0.0F, 0.0F, -1.0472F, 0.0F)
      );
      PartDefinition Head_r2 = Head.addOrReplaceChild(
         "Head_r2",
         CubeListBuilder.create()
            .texOffs(40, 47)
            .addBox(1.6F, -6.0F, -5.2F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(42, 47)
            .addBox(1.6F, -10.0F, -5.2F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 4.0F, 0.0F, 0.0F, 1.2217F, 0.0F)
      );
      PartDefinition Head_r3 = Head.addOrReplaceChild(
         "Head_r3",
         CubeListBuilder.create()
            .texOffs(32, 39)
            .addBox(-4.2F, -10.0F, -3.5F, 0.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
            .texOffs(40, 0)
            .addBox(-4.2F, -6.0F, -3.5F, 0.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
            .texOffs(40, 8)
            .addBox(-3.5F, -6.0F, 4.2F, 7.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(40, 6)
            .addBox(-3.5F, -10.0F, 4.2F, 7.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(40, 9)
            .addBox(-4.4F, -6.1F, 4.3F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(39, 8)
            .addBox(-4.4F, -6.1F, 3.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(40, 9)
            .addBox(-4.4F, -10.0F, 4.3F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(39, 8)
            .addBox(-4.4F, -10.0F, 3.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(40, 9)
            .addBox(-4.5F, -10.0F, -4.3F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(39, 8)
            .addBox(-4.5F, -10.0F, -4.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(39, 8)
            .addBox(-4.5F, -6.0F, -4.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(40, 9)
            .addBox(-4.5F, -6.0F, -4.3F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(40, 9)
            .addBox(-3.7F, -6.0F, -4.3F, 7.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(40, 10)
            .addBox(-3.7F, -10.0F, -4.3F, 7.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 4.0F, 0.0F, 0.0F, 1.5708F, 0.0F)
      );
      PartDefinition Head_r4 = Head.addOrReplaceChild(
         "Head_r4",
         CubeListBuilder.create().texOffs(20, 16).addBox(-1.0F, -3.0F, -5.6F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4363F, 0.0F, 0.0F)
      );
      PartDefinition Head_r5 = Head.addOrReplaceChild(
         "Head_r5",
         CubeListBuilder.create()
            .texOffs(0, 0)
            .addBox(-3.9F, -2.5F, -6.7F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(44, 32)
            .addBox(-3.4F, -2.0F, -4.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.3054F)
      );
      PartDefinition Body = partdefinition.addOrReplaceChild(
         "Body",
         CubeListBuilder.create()
            .texOffs(0, 16)
            .addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(46, 20)
            .addBox(2.7F, 0.0F, -2.2F, 1.0F, 12.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(44, 20)
            .addBox(-3.3F, 0.0F, -2.2F, 1.0F, 12.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(40, 20)
            .addBox(2.7F, 0.0F, 2.1F, 1.0F, 12.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(42, 20)
            .addBox(-3.7F, 0.0F, 2.1F, 1.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition RightArm = partdefinition.addOrReplaceChild(
         "RightArm",
         CubeListBuilder.create()
            .texOffs(16, 32)
            .addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(0, 2)
            .addBox(-3.1F, 6.0F, -1.9F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(20, 15)
            .addBox(-3.2F, 6.0F, 1.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(14, 42)
            .addBox(-3.2F, 6.0F, 2.2F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(28, 34)
            .addBox(-3.1F, 6.0F, 2.1F, 4.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(14, 40)
            .addBox(0.2F, 6.0F, 2.2F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(6, 11)
            .addBox(1.2F, 6.0F, 1.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(1.1F, 6.0F, -1.9F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(0, 11)
            .addBox(1.2F, 6.0F, -2.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 11)
            .addBox(-3.2F, 6.0F, -2.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(6, 0)
            .addBox(0.2F, 6.0F, -2.2F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(28, 32)
            .addBox(-3.1F, 6.0F, -2.1F, 4.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-3.2F, 6.0F, -2.2F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-5.0F, 2.0F, 0.0F)
      );
      PartDefinition LeftArm = partdefinition.addOrReplaceChild(
         "LeftArm",
         CubeListBuilder.create()
            .texOffs(24, 16)
            .addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(40, 13)
            .addBox(-1.0F, 6.0F, -2.1F, 4.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(40, 11)
            .addBox(-1.0F, 6.0F, 2.1F, 4.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 6)
            .addBox(3.1F, 6.0F, -1.9F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(12, 39)
            .addBox(3.3F, 6.0F, -2.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(12, 42)
            .addBox(2.3F, 6.0F, -2.2F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 42)
            .addBox(-1.1F, 6.0F, -2.2F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(26, 15)
            .addBox(-1.1F, 6.0F, -2.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(2, 42)
            .addBox(2.3F, 6.0F, 2.2F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(2, 39)
            .addBox(-1.1F, 6.0F, 1.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 39)
            .addBox(3.3F, 6.0F, 1.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(44, 32)
            .addBox(-1.1F, 6.0F, 2.2F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 4)
            .addBox(-1.0F, 6.0F, -1.9F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offset(5.0F, 2.0F, 0.0F)
      );
      PartDefinition RightLeg = partdefinition.addOrReplaceChild(
         "RightLeg",
         CubeListBuilder.create().texOffs(0, 40).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-1.9F, 12.0F, 0.0F)
      );
      PartDefinition LeftLeg = partdefinition.addOrReplaceChild(
         "LeftLeg",
         CubeListBuilder.create().texOffs(32, 32).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offset(1.9F, 12.0F, 0.0F)
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

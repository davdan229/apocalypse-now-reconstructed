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

public class Modelbvdgasmask<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("apocalypsenow", "modelbvdgasmask"), "main");
   public final ModelPart Head;
   public final ModelPart Body;
   public final ModelPart RightArm;
   public final ModelPart LeftArm;
   public final ModelPart RightLeg;
   public final ModelPart LeftLeg;

   public Modelbvdgasmask(ModelPart root) {
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
            .texOffs(7, 7)
            .addBox(-4.0F, -8.0F, -4.2F, 8.0F, 8.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(13, 53)
            .addBox(4.0F, -8.0F, -4.2F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(38, 52)
            .addBox(-5.0F, -8.0F, -4.2F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(48, 4)
            .addBox(-4.0F, -9.0F, -4.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(43, 45)
            .addBox(-3.0F, -9.0F, -3.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
            .texOffs(34, 44)
            .addBox(2.0F, -9.0F, -3.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
            .texOffs(43, 44)
            .addBox(2.0F, -8.0F, 4.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(17, 53)
            .addBox(-3.0F, -8.0F, 4.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(42, 35)
            .addBox(-5.0F, -4.0F, -3.2F, 1.0F, 1.0F, 7.2F, new CubeDeformation(0.0F))
            .texOffs(24, 42)
            .addBox(4.0F, -4.0F, -3.2F, 1.0F, 1.0F, 7.2F, new CubeDeformation(0.0F))
            .texOffs(40, 30)
            .addBox(-4.0F, -4.0F, 4.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(44, 0)
            .addBox(-4.0F, -9.0F, -5.0F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(40, 26)
            .addBox(-4.0F, -3.0F, -5.0F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(52, 38)
            .addBox(-1.5F, -3.0F, -6.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(30, 0)
            .addBox(-1.0F, -4.0F, -5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition cube_r1 = Head.addOrReplaceChild(
         "cube_r1",
         CubeListBuilder.create().texOffs(52, 32).addBox(-1.6F, -3.0F, -7.0F, 3.2F, 3.0F, 3.2F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4363F, 0.0F, 0.0F)
      );
      PartDefinition cube_r2 = Head.addOrReplaceChild(
         "cube_r2",
         CubeListBuilder.create().texOffs(48, 6).addBox(2.5F, -3.0F, -6.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3054F)
      );
      PartDefinition Body = partdefinition.addOrReplaceChild(
         "Body",
         CubeListBuilder.create()
            .texOffs(0, 16)
            .addBox(3.0F, 8.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(0, 16)
            .addBox(-4.0F, 8.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(32, 32)
            .addBox(-4.0F, 2.0F, -3.0F, 8.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(24, 0)
            .addBox(-4.0F, 7.0F, -5.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(48, 12)
            .addBox(-4.0F, 10.0F, 3.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(2.0F, 7.0F, -5.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(34, 43)
            .addBox(3.0F, 0.0F, -4.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(52, 44)
            .addBox(-1.5F, 7.0F, -5.0F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(0, 48)
            .addBox(-2.5F, 2.5F, -5.0F, 5.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(50, 53)
            .addBox(-4.0F, 0.0F, -3.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(24, 51)
            .addBox(-4.0F, -0.5F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(14, 48)
            .addBox(1.0F, -0.5F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(42, 53)
            .addBox(1.0F, 0.0F, -3.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(20, 16)
            .addBox(-4.0F, 0.0F, 2.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(12, 32)
            .addBox(1.0F, 0.0F, 2.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(40, 16)
            .addBox(-4.0F, 3.0F, 2.0F, 8.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(), PartPose.offset(-5.0F, 2.0F, 0.0F));
      PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(), PartPose.offset(5.0F, 2.0F, 0.0F));
      PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(), PartPose.offset(-1.9F, 12.0F, 0.0F));
      PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(), PartPose.offset(1.9F, 12.0F, 0.0F));
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

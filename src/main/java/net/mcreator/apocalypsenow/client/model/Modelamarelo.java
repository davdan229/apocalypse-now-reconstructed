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

public class Modelamarelo<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("apocalypsenow", "modelamarelo"), "main");
   public final ModelPart Head;
   public final ModelPart Body;
   public final ModelPart RightArm;
   public final ModelPart LeftArm;
   public final ModelPart RightLeg;
   public final ModelPart LeftLeg;

   public Modelamarelo(ModelPart root) {
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
      PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
      PartDefinition Body = partdefinition.addOrReplaceChild(
         "Body",
         CubeListBuilder.create()
            .texOffs(0, 27)
            .addBox(1.9F, -0.2F, -2.6F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(25, 11)
            .addBox(-4.1F, -0.2F, -2.6F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-4.0F, 1.0F, 2.0F, 8.0F, 11.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(18, 16)
            .addBox(3.5F, 0.9F, -2.5F, 1.0F, 11.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(18, 0)
            .addBox(-4.5F, 0.9F, -2.5F, 1.0F, 11.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(28, 35)
            .addBox(1.6F, 7.9F, -4.6F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(20, 35)
            .addBox(-0.9F, 5.3F, -3.6F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(30, 18)
            .addBox(3.3F, 7.6F, -0.8F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
            .texOffs(30, 3)
            .addBox(-5.4F, 7.3F, -0.7F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
            .texOffs(30, 9)
            .addBox(-2.4F, 2.8F, -3.5F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(18, 0)
            .addBox(2.6F, 3.8F, -3.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(27, 29)
            .addBox(-3.2F, 8.5F, 1.8F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
            .texOffs(12, 35)
            .addBox(-3.2F, 5.3F, -3.6F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(30, 24)
            .addBox(-4.1F, 2.0F, -4.9F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(0, 12)
            .addBox(-4.0F, 1.0F, -3.0F, 8.0F, 11.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 34)
            .addBox(-3.0F, 12.0F, -3.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(13, 33)
            .addBox(-3.0F, 12.0F, 2.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition cube_r1 = Body.addOrReplaceChild(
         "cube_r1",
         CubeListBuilder.create().texOffs(9, 27).addBox(-1.0F, 7.0F, -1.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-3.7F, 0.0F, -1.9F, 0.0F, 0.829F, 0.0F)
      );
      PartDefinition cube_r2 = Body.addOrReplaceChild(
         "cube_r2",
         CubeListBuilder.create().texOffs(34, 11).addBox(-1.0F, 7.0F, 0.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(4.6F, 0.0F, -2.7F, 0.0F, -0.7505F, 0.0F)
      );
      PartDefinition cube_r3 = Body.addOrReplaceChild(
         "cube_r3",
         CubeListBuilder.create().texOffs(25, 0).addBox(-3.0F, 10.0F, 0.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-0.1F, -12.7F, 5.6F, -0.2618F, 0.0F, 0.0F)
      );
      PartDefinition cube_r4 = Body.addOrReplaceChild(
         "cube_r4",
         CubeListBuilder.create().texOffs(0, 24).addBox(-4.0F, 10.0F, 0.0F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-0.1F, -10.8F, 5.0F, -0.2618F, 0.0F, 0.0F)
      );
      PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(), PartPose.offset(-5.0F, 2.0F, 0.0F));
      PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(), PartPose.offset(5.0F, 2.0F, 0.0F));
      PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(), PartPose.offset(-1.9F, 12.0F, 0.0F));
      PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(), PartPose.offset(1.9F, 12.0F, 0.0F));
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
      this.Head.yRot = netHeadYaw / (180.0F / (float)Math.PI);
      this.Head.xRot = headPitch / (180.0F / (float)Math.PI);
      this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
   }
}

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

public class Modellevela<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("apocalypsenow", "modellevela"), "main");
   public final ModelPart Head;
   public final ModelPart Body;
   public final ModelPart RightArm;
   public final ModelPart LeftArm;
   public final ModelPart RightLeg;
   public final ModelPart LeftLeg;

   public Modellevela(ModelPart root) {
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
            .texOffs(0, 66)
            .addBox(-4.0F, -8.0F, -4.001F, 8.0F, 8.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(22, 65)
            .addBox(-4.0F, -8.0F, 4.001F, 8.0F, 8.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 38)
            .addBox(4.001F, -8.0F, -4.0F, 0.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
            .texOffs(40, 40)
            .addBox(-4.01F, -8.0F, -3.999F, 0.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
            .texOffs(22, 0)
            .addBox(-4.01F, -8.001F, -3.999F, 8.0F, 0.0F, 8.0F, new CubeDeformation(0.0F))
            .texOffs(56, 24)
            .addBox(4.0F, -2.0F, -4.0F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F))
            .texOffs(24, 10)
            .addBox(-5.0F, -2.0F, -4.0F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F))
            .texOffs(64, 19)
            .addBox(-5.0F, -2.0F, 4.0F, 10.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 63)
            .addBox(-5.0F, -2.0F, -5.0F, 10.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(60, 16)
            .addBox(-5.0F, -10.0F, -5.0F, 10.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 18)
            .addBox(-4.0F, -10.0F, -4.0F, 8.0F, 2.0F, 8.0F, new CubeDeformation(0.0F))
            .texOffs(58, 34)
            .addBox(-5.0F, -9.0F, -4.8F, 10.0F, 7.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(4, 16)
            .addBox(4.9F, -9.0F, -4.8F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(0, 16)
            .addBox(-4.9F, -9.0F, -4.8F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(38, 0)
            .addBox(4.0F, -10.0F, -4.0F, 1.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
            .texOffs(40, 32)
            .addBox(-5.0F, -10.0F, -4.0F, 1.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
            .texOffs(22, 56)
            .addBox(-5.0F, -10.0F, 4.0F, 10.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition Body = partdefinition.addOrReplaceChild(
         "Body",
         CubeListBuilder.create()
            .texOffs(0, 0)
            .addBox(-4.5F, 0.0F, -3.001F, 9.0F, 12.0F, 6.0F, new CubeDeformation(0.0F))
            .texOffs(22, 40)
            .addBox(-2.5F, 0.0F, 3.0F, 5.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition RightArm = partdefinition.addOrReplaceChild(
         "RightArm",
         CubeListBuilder.create()
            .texOffs(56, 9)
            .addBox(-3.8F, 9.2F, -2.5F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(26, 22)
            .addBox(-3.9F, -2.8F, -3.0F, 5.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-5.0F, 2.0F, 0.0F)
      );
      PartDefinition LeftArm = partdefinition.addOrReplaceChild(
         "LeftArm",
         CubeListBuilder.create()
            .texOffs(0, 28)
            .addBox(-1.3F, -2.8F, -3.0F, 5.0F, 12.0F, 6.0F, new CubeDeformation(0.0F))
            .texOffs(56, 43)
            .addBox(-1.3F, 9.2F, -2.5F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
         PartPose.offset(5.0F, 2.0F, 0.0F)
      );
      PartDefinition RightLeg = partdefinition.addOrReplaceChild(
         "RightLeg",
         CubeListBuilder.create().texOffs(0, 54).addBox(-2.7F, 9.001F, -3.7F, 5.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-1.9F, 12.0F, 0.0F)
      );
      PartDefinition LeftLeg = partdefinition.addOrReplaceChild(
         "LeftLeg",
         CubeListBuilder.create().texOffs(56, 0).addBox(-2.5F, 9.001F, -3.7F, 5.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
         PartPose.offset(1.9F, 12.0F, 0.0F)
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

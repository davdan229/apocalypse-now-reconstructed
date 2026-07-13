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
import net.minecraft.world.entity.Entity;

public class Modelbill<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("apocalypsenow", "modelbill"), "main");
   public final ModelPart Head;
   public final ModelPart Body;
   public final ModelPart RightArm;
   public final ModelPart LeftArm;
   public final ModelPart RightLeg;
   public final ModelPart LeftLeg;

   public Modelbill(ModelPart root) {
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
            .texOffs(6, 26)
            .addBox(-4.0F, -8.0F, -6.0F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(0, 26)
            .addBox(3.0F, -8.0F, -6.0F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(0, 21)
            .addBox(2.0F, -2.0F, -8.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(12, 26)
            .addBox(1.0F, -1.0F, -6.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(11, 22)
            .addBox(-3.0F, -1.0F, -6.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(11, 19)
            .addBox(-3.0F, -8.0F, -6.0F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(20, 22)
            .addBox(-3.0F, -7.0F, -6.0F, 6.0F, 6.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 16)
            .addBox(-1.0F, -3.0F, -6.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-0.4F, -2.4F, -6.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 16)
            .addBox(3.6F, -4.0F, -5.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
            .texOffs(11, 17)
            .addBox(-4.0F, -4.0F, 3.4F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(15, 7)
            .addBox(-4.4F, -4.0F, -5.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition Head_r1 = Head.addOrReplaceChild(
         "Head_r1",
         CubeListBuilder.create().texOffs(24, 0).addBox(2.6F, -5.3F, -8.3F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.3054F)
      );
      PartDefinition Body = partdefinition.addOrReplaceChild(
         "Body",
         CubeListBuilder.create()
            .texOffs(15, 32)
            .addBox(3.0F, 8.0F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(26, 11)
            .addBox(3.3F, 8.0F, -1.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(32, 13)
            .addBox(2.0F, 7.0F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(32, 11)
            .addBox(2.0F, 6.0F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(32, 8)
            .addBox(1.0F, 5.0F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(32, 6)
            .addBox(0.0F, 4.0F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(31, 27)
            .addBox(-1.0F, 3.0F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(26, 31)
            .addBox(-2.0F, 2.0F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(22, 31)
            .addBox(-3.0F, 1.0F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(31, 19)
            .addBox(-4.0F, 0.0F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(26, 6)
            .addBox(-4.5F, 0.0F, -1.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(4, 26)
            .addBox(-2.0F, 2.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(10, 26)
            .addBox(-1.0F, 3.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(12, 29)
            .addBox(0.0F, 4.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(29, 17)
            .addBox(1.0F, 5.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(15, 30)
            .addBox(3.0F, 8.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(30, 30)
            .addBox(2.0F, 6.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(31, 0)
            .addBox(2.0F, 7.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(12, 31)
            .addBox(-3.0F, 1.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(18, 31)
            .addBox(-4.0F, 0.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition cube_r1 = Body.addOrReplaceChild(
         "cube_r1",
         CubeListBuilder.create()
            .texOffs(26, 11)
            .addBox(1.0F, 2.2F, -3.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(20, 0)
            .addBox(-2.8F, 1.7F, -3.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(26, 6)
            .addBox(-1.5F, 1.7F, -3.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(27, 19)
            .addBox(-0.2F, 1.9F, -3.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(19, 28)
            .addBox(2.3F, 2.2F, -3.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(23, 28)
            .addBox(3.7F, 2.4F, -3.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(27, 28)
            .addBox(5.4F, 3.0F, -3.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.6109F)
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
      this.Head.yRot = netHeadYaw / (180.0F / (float)Math.PI);
      this.Head.xRot = headPitch / (180.0F / (float)Math.PI);
   }
}

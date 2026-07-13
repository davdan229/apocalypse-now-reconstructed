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

public class Modelberet<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("apocalypsenow", "modelberet"), "main");
   public final ModelPart Head;
   public final ModelPart Body;
   public final ModelPart RightArm;
   public final ModelPart LeftArm;
   public final ModelPart RightLeg;
   public final ModelPart LeftLeg;

   public Modelberet(ModelPart root) {
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
      PartDefinition cube_r1 = Head.addOrReplaceChild(
         "cube_r1",
         CubeListBuilder.create().texOffs(0, 0).addBox(-3.6F, -8.8F, -5.0F, 9.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1309F)
      );
      PartDefinition Body = partdefinition.addOrReplaceChild(
         "Body",
         CubeListBuilder.create()
            .texOffs(0, 26)
            .addBox(-4.0F, 0.0F, -3.0F, 8.0F, 11.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(36, 26)
            .addBox(1.5F, 3.6F, -4.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(16, 38)
            .addBox(1.5F, 1.0F, -4.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(38, 10)
            .addBox(-1.0F, 1.0F, -4.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 7)
            .addBox(-3.5F, 1.0F, -4.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(11, 13)
            .addBox(-3.5F, 3.6F, -4.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(8, 38)
            .addBox(0.5F, 10.4F, -3.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 38)
            .addBox(-3.4F, 10.4F, -3.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 13)
            .addBox(-1.0F, 3.6F, -4.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(32, 34)
            .addBox(2.0F, -0.6F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(11, 15)
            .addBox(4.0F, -1.6F, -4.0F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F))
            .texOffs(0, 13)
            .addBox(-5.0F, -1.6F, -4.0F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F))
            .texOffs(22, 21)
            .addBox(-4.0F, -1.6F, 4.0F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(34, 5)
            .addBox(-4.0F, -0.6F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(22, 17)
            .addBox(-4.0F, 10.9F, 2.0F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(34, 2)
            .addBox(-3.0F, 13.9F, 2.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(31, 24)
            .addBox(-3.0F, 14.0F, -3.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(22, 13)
            .addBox(-4.0F, 11.0F, -3.0F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(18, 26)
            .addBox(-4.0F, 0.0F, 2.0F, 8.0F, 11.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(28, 2)
            .addBox(-4.0F, 5.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(3.0F, 5.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(28, 0)
            .addBox(-4.0F, 0.0F, 3.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
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

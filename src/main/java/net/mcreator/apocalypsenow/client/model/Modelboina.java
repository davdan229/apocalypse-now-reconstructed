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

public class Modelboina<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("apocalypsenow", "modelboina"), "main");
   public final ModelPart Head;
   public final ModelPart Body;
   public final ModelPart RightArm;
   public final ModelPart LeftArm;
   public final ModelPart RightLeg;
   public final ModelPart LeftLeg;

   public Modelboina(ModelPart root) {
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
            .texOffs(18, 25)
            .addBox(-4.0F, 0.0F, -3.0F, 8.0F, 11.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(36, 19)
            .addBox(2.0F, -0.6F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(11, 14)
            .addBox(4.0F, -1.6F, -4.0F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F))
            .texOffs(0, 12)
            .addBox(-5.0F, -1.6F, -4.1F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F))
            .texOffs(28, 0)
            .addBox(-4.0F, -1.6F, 4.0F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(28, 5)
            .addBox(-4.0F, -0.6F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(22, 16)
            .addBox(-4.0F, 10.5F, 1.6F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(36, 5)
            .addBox(-3.0F, 13.5F, 1.6F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(35, 24)
            .addBox(-3.0F, 13.5F, -2.8F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(22, 12)
            .addBox(-4.0F, 10.5F, -2.8F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 25)
            .addBox(-4.0F, 0.0F, 2.0F, 8.0F, 11.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(32, 33)
            .addBox(-4.0F, 5.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(3.0F, 5.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(28, 3)
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

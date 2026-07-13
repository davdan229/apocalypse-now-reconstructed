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

public class Modelbandolier<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("apocalypsenow", "modelbandolier"), "main");
   public final ModelPart Body;
   public final ModelPart RightArm;
   public final ModelPart LeftArm;

   public Modelbandolier(ModelPart root) {
      this.Body = root.getChild("Body");
      this.RightArm = root.getChild("RightArm");
      this.LeftArm = root.getChild("LeftArm");
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.getRoot();
      PartDefinition Body = partdefinition.addOrReplaceChild(
         "Body",
         CubeListBuilder.create()
            .texOffs(18, 10)
            .addBox(-4.2F, -0.5F, -2.1F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(18, 5)
            .addBox(2.3F, -0.5F, -2.1F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(17, 17)
            .addBox(2.3F, 0.5F, -2.2F, 2.0F, 11.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 3)
            .addBox(-4.0F, 10.0F, -2.5F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(23, 21)
            .addBox(1.8F, 8.9F, -3.9F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(0, 19)
            .addBox(-1.6F, 8.9F, -3.9F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(18, 0)
            .addBox(0.2F, 8.9F, 1.8F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(23, 15)
            .addBox(-4.9F, 8.9F, -3.9F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-4.0F, 10.0F, 1.5F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 25)
            .addBox(-4.5F, 10.0F, -1.9F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(6, 21)
            .addBox(3.3F, 10.0F, -1.9F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(12, 6)
            .addBox(-4.2F, 0.5F, -2.2F, 2.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition cube_r1 = Body.addOrReplaceChild(
         "cube_r1",
         CubeListBuilder.create().texOffs(0, 6).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(3.0F, 0.9F, 3.3F, 0.0F, 0.0F, 0.4363F)
      );
      PartDefinition cube_r2 = Body.addOrReplaceChild(
         "cube_r2",
         CubeListBuilder.create().texOffs(6, 6).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-2.8F, 0.9F, 3.4F, 0.0F, 0.0F, -0.4363F)
      );
      PartDefinition cube_r3 = Body.addOrReplaceChild(
         "cube_r3",
         CubeListBuilder.create().texOffs(28, 3).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(3.7F, 3.3F, -0.9F, 0.0F, 0.0F, 0.6545F)
      );
      PartDefinition cube_r4 = Body.addOrReplaceChild(
         "cube_r4",
         CubeListBuilder.create().texOffs(28, 8).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(3.7F, 7.3F, -0.9F, 0.0F, 0.0F, 0.6545F)
      );
      PartDefinition cube_r5 = Body.addOrReplaceChild(
         "cube_r5",
         CubeListBuilder.create().texOffs(10, 27).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-2.0F, 6.4F, -0.9F, 0.0F, 0.0F, -0.6109F)
      );
      PartDefinition cube_r6 = Body.addOrReplaceChild(
         "cube_r6",
         CubeListBuilder.create().texOffs(21, 27).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-2.0F, 2.5F, -0.9F, 0.0F, 0.0F, -0.6109F)
      );
      PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(), PartPose.offset(-5.0F, 2.0F, 0.0F));
      PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(), PartPose.offset(5.0F, 2.0F, 0.0F));
      return LayerDefinition.create(meshdefinition, 64, 64);
   }

   @Override
   public void renderToBuffer(
      PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha
   ) {
      this.Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
      this.RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
      this.LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
   }

   @Override
   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
   }
}

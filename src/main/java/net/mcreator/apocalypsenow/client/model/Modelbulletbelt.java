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

public class Modelbulletbelt<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("apocalypsenow", "modelbulletbelt"), "main");
   public final ModelPart Body;
   public final ModelPart RightArm;
   public final ModelPart LeftArm;

   public Modelbulletbelt(ModelPart root) {
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
            .texOffs(12, 0)
            .addBox(-4.0F, -0.3F, -2.2F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(8, 10)
            .addBox(2.4F, 10.7F, -2.2F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition cube_r1 = Body.addOrReplaceChild(
         "cube_r1",
         CubeListBuilder.create()
            .texOffs(0, 0)
            .addBox(-1.0F, -2.0F, -1.0F, 2.0F, 13.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(6, 0)
            .addBox(-1.0F, -2.0F, -5.0F, 2.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-2.5F, 2.0F, 2.4F, 0.0F, 0.0F, -0.5672F)
      );
      PartDefinition cube_r2 = Body.addOrReplaceChild(
         "cube_r2",
         CubeListBuilder.create().texOffs(12, 5).addBox(-1.0F, 10.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-8.5F, -8.7F, -2.1F, 0.0F, 0.0F, -0.5672F)
      );
      PartDefinition cube_r3 = Body.addOrReplaceChild(
         "cube_r3",
         CubeListBuilder.create().texOffs(12, 5).addBox(-1.0F, 10.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-8.0F, -7.6F, -2.1F, 0.0F, 0.0F, -0.5672F)
      );
      PartDefinition cube_r4 = Body.addOrReplaceChild(
         "cube_r4",
         CubeListBuilder.create().texOffs(12, 5).addBox(-1.0F, 10.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-7.4F, -6.6F, -2.1F, 0.0F, 0.0F, -0.5672F)
      );
      PartDefinition cube_r5 = Body.addOrReplaceChild(
         "cube_r5",
         CubeListBuilder.create().texOffs(12, 5).addBox(-1.0F, 10.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-6.7F, -5.6F, -2.1F, 0.0F, 0.0F, -0.5672F)
      );
      PartDefinition cube_r6 = Body.addOrReplaceChild(
         "cube_r6",
         CubeListBuilder.create().texOffs(12, 5).addBox(-1.0F, 10.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-6.1F, -4.6F, -2.1F, 0.0F, 0.0F, -0.5672F)
      );
      PartDefinition cube_r7 = Body.addOrReplaceChild(
         "cube_r7",
         CubeListBuilder.create().texOffs(12, 5).addBox(-1.0F, 10.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-5.5F, -3.6F, -2.1F, 0.0F, 0.0F, -0.5672F)
      );
      PartDefinition cube_r8 = Body.addOrReplaceChild(
         "cube_r8",
         CubeListBuilder.create().texOffs(12, 5).addBox(-1.0F, 10.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-4.9F, -2.6F, -2.1F, 0.0F, 0.0F, -0.5672F)
      );
      PartDefinition cube_r9 = Body.addOrReplaceChild(
         "cube_r9",
         CubeListBuilder.create().texOffs(12, 5).addBox(-1.0F, 10.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-4.3F, -1.6F, -2.1F, 0.0F, 0.0F, -0.5672F)
      );
      PartDefinition cube_r10 = Body.addOrReplaceChild(
         "cube_r10",
         CubeListBuilder.create().texOffs(12, 5).addBox(-1.0F, 10.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-3.7F, -0.6F, -2.1F, 0.0F, 0.0F, -0.5672F)
      );
      PartDefinition cube_r11 = Body.addOrReplaceChild(
         "cube_r11",
         CubeListBuilder.create().texOffs(12, 5).addBox(-1.0F, 10.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-3.1F, 0.4F, -2.1F, 0.0F, 0.0F, -0.5672F)
      );
      PartDefinition cube_r12 = Body.addOrReplaceChild(
         "cube_r12",
         CubeListBuilder.create().texOffs(12, 5).addBox(-1.0F, 10.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-2.5F, 1.5F, -2.1F, 0.0F, 0.0F, -0.5672F)
      );
      PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(), PartPose.offset(-5.0F, 2.0F, 0.0F));
      PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(), PartPose.offset(5.0F, 2.0F, 0.0F));
      return LayerDefinition.create(meshdefinition, 32, 32);
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
      this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
      this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
   }
}

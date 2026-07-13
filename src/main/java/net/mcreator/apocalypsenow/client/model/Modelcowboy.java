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

public class Modelcowboy<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("apocalypsenow", "modelcowboy"), "main");
   public final ModelPart Head;

   public Modelcowboy(ModelPart root) {
      this.Head = root.getChild("Head");
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.getRoot();
      PartDefinition Head = partdefinition.addOrReplaceChild(
         "Head",
         CubeListBuilder.create()
            .texOffs(0, 18)
            .addBox(-4.5F, -9.0F, -5.0F, 9.0F, 4.0F, 10.0F, new CubeDeformation(0.0F))
            .texOffs(24, 24)
            .addBox(-4.5F, -5.0F, -9.0F, 9.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(24, 20)
            .addBox(-4.5F, -5.0F, 5.0F, 9.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(27, 19)
            .addBox(-8.0F, -5.0F, 9.0F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(27, 18)
            .addBox(-8.0F, -5.0F, -10.0F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(8, 0)
            .addBox(-8.5F, -5.0F, -9.0F, 4.0F, 0.0F, 18.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-9.4F, -5.0F, -8.0F, 1.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition cube_r1 = Head.addOrReplaceChild(
         "cube_r1",
         CubeListBuilder.create().texOffs(18, 0).addBox(1.0F, 1.0F, -12.0F, 1.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(7.2F, -6.4F, 4.0F, 0.0F, 0.0F, -0.1309F)
      );
      PartDefinition cube_r2 = Head.addOrReplaceChild(
         "cube_r2",
         CubeListBuilder.create()
            .texOffs(37, 41)
            .addBox(1.0F, 1.0F, 5.0F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(1.0F, 1.0F, 6.0F, 4.0F, 0.0F, 18.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(3.3F, -5.9F, -15.0F, 0.0F, 0.0F, -0.1309F)
      );
      PartDefinition cube_r3 = Head.addOrReplaceChild(
         "cube_r3",
         CubeListBuilder.create().texOffs(40, 45).addBox(1.0F, 1.01F, 5.0F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(2.8F, -5.9F, 4.0F, 0.0F, 0.0F, -0.1309F)
      );
      return LayerDefinition.create(meshdefinition, 64, 64);
   }

   @Override
   public void renderToBuffer(
      PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha
   ) {
      this.Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
   }

   @Override
   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
      this.Head.yRot = netHeadYaw / (180.0F / (float)Math.PI);
      this.Head.xRot = headPitch / (180.0F / (float)Math.PI);
   }
}

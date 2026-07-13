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

public class Modelnvgn<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("apocalypsenow", "modelnvgn"), "main");
   public final ModelPart Head;

   public Modelnvgn(ModelPart root) {
      this.Head = root.getChild("Head");
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.getRoot();
      PartDefinition Head = partdefinition.addOrReplaceChild(
         "Head",
         CubeListBuilder.create()
            .texOffs(0, 0)
            .addBox(-5.0F, 0.3F, -2.0F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-4.5F, -8.5F, -4.6F, 9.0F, 0.0F, 9.0F, new CubeDeformation(0.0F))
            .texOffs(18, 17)
            .addBox(-4.5F, -7.9F, -5.5F, 9.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(16, 22)
            .addBox(-4.5F, -8.5F, -4.6F, 9.0F, 4.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(27, 5)
            .addBox(-3.5F, -0.5F, 4.4F, 7.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(18, 9)
            .addBox(-4.5F, -8.5F, 4.4F, 9.0F, 8.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-4.5F, -0.5F, 4.4F, 9.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 6)
            .addBox(4.5F, -8.5F, -4.6F, 0.0F, 6.0F, 9.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-4.5F, -8.5F, -4.6F, 0.0F, 6.0F, 9.0F, new CubeDeformation(0.0F))
            .texOffs(0, 15)
            .addBox(-4.5F, -2.5F, -3.6F, 0.0F, 2.0F, 8.0F, new CubeDeformation(0.0F))
            .texOffs(0, 13)
            .addBox(4.5F, -2.5F, -3.6F, 0.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, -2.0F, 0.0F)
      );
      PartDefinition cube_r1 = Head.addOrReplaceChild(
         "cube_r1",
         CubeListBuilder.create().texOffs(10, 26).addBox(-1.0F, -2.0F, -2.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(3.8F, -4.9F, -4.9F, -0.2392F, -0.5166F, 0.5888F)
      );
      PartDefinition cube_r2 = Head.addOrReplaceChild(
         "cube_r2",
         CubeListBuilder.create().texOffs(0, 25).addBox(-1.0F, -2.0F, -2.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-4.7F, -5.1F, -4.6F, 0.4363F, 0.1309F, 0.7854F)
      );
      PartDefinition cube_r3 = Head.addOrReplaceChild(
         "cube_r3",
         CubeListBuilder.create().texOffs(20, 26).addBox(-1.0F, -2.0F, -2.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-2.3F, -5.0F, -5.0F, 0.0F, 0.0F, 0.7854F)
      );
      PartDefinition cube_r4 = Head.addOrReplaceChild(
         "cube_r4",
         CubeListBuilder.create().texOffs(27, 0).addBox(-1.0F, -2.0F, -2.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.9F, -5.0F, -5.0F, 0.0F, 0.0F, 0.7854F)
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

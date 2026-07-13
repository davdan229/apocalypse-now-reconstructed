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

public class Modelcnvg<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("apocalypsenow", "modelcnvg"), "main");
   public final ModelPart Head;

   public Modelcnvg(ModelPart root) {
      this.Head = root.getChild("Head");
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.getRoot();
      PartDefinition Head = partdefinition.addOrReplaceChild(
         "Head",
         CubeListBuilder.create()
            .texOffs(0, 11)
            .addBox(-3.1F, -5.0F, -7.7F, 6.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
            .texOffs(11, 0)
            .addBox(-2.1F, -8.9F, -4.5F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(0, 6)
            .addBox(1.2F, -7.7F, -4.2F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 5)
            .addBox(-4.3F, -7.7F, -4.2F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-4.3F, -7.7F, -4.2F, 0.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
            .texOffs(4, 1)
            .addBox(-4.4F, -7.7F, 3.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(4, 4)
            .addBox(-4.4F, -7.7F, 4.9F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(4, 0)
            .addBox(4.3F, -7.7F, 3.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(4, 3)
            .addBox(3.3F, -7.7F, 4.9F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 1)
            .addBox(4.2F, -7.7F, -4.2F, 0.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
            .texOffs(0, 7)
            .addBox(-4.1F, -7.7F, 4.8F, 8.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-1.1F, -8.6F, -2.5F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F))
            .texOffs(3, 0)
            .addBox(-1.1F, -8.6F, 4.5F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition cube_r1 = Head.addOrReplaceChild(
         "cube_r1",
         CubeListBuilder.create()
            .texOffs(0, 0)
            .addBox(-1.0F, -3.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 17)
            .addBox(-3.5F, -3.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(1.6F, -6.0F, -5.7F, -0.2618F, 0.0F, 0.0F)
      );
      PartDefinition cube_r2 = Head.addOrReplaceChild(
         "cube_r2",
         CubeListBuilder.create().texOffs(15, 14).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-2.5F, -2.8F, -7.0F, 0.0F, 0.0F, 0.7854F)
      );
      PartDefinition cube_r3 = Head.addOrReplaceChild(
         "cube_r3",
         CubeListBuilder.create().texOffs(15, 8).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.8F, -2.8F, -7.0F, 0.0F, 0.0F, 0.7854F)
      );
      return LayerDefinition.create(meshdefinition, 32, 32);
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

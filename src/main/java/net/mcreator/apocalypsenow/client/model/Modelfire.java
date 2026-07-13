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

public class Modelfire<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("apocalypsenow", "modelfire"), "main");
   public final ModelPart Head;

   public Modelfire(ModelPart root) {
      this.Head = root.getChild("Head");
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.getRoot();
      PartDefinition Head = partdefinition.addOrReplaceChild(
         "Head",
         CubeListBuilder.create()
            .texOffs(0, 0)
            .addBox(-4.5F, -9.0F, -5.0F, 9.0F, 3.0F, 10.0F, new CubeDeformation(0.0F))
            .texOffs(0, 19)
            .addBox(-2.5F, -10.1F, -5.7F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(4, 13)
            .addBox(4.5F, -6.0F, -7.0F, 2.0F, 0.0F, 12.0F, new CubeDeformation(0.0F))
            .texOffs(0, 13)
            .addBox(-6.5F, -6.0F, -7.0F, 2.0F, 0.0F, 12.0F, new CubeDeformation(0.0F))
            .texOffs(18, 13)
            .addBox(-6.5F, -6.0F, 5.0F, 13.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(17, 15)
            .addBox(-4.5F, -6.0F, -8.0F, 9.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
            .texOffs(19, 18)
            .addBox(-5.5F, -6.0F, 7.0F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(19, 22)
            .addBox(-3.5F, -6.0F, -9.0F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(16, 17)
            .addBox(4.2F, -4.0F, -4.0F, 0.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
            .texOffs(0, 17)
            .addBox(-4.1F, -4.0F, -4.0F, 0.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
            .texOffs(0, 5)
            .addBox(-4.2F, -4.0F, 4.1F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 1)
            .addBox(-4.2F, -4.0F, 3.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(3.3F, -4.0F, 4.1F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(4.3F, -4.0F, 3.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(20, 21)
            .addBox(-4.0F, -4.0F, 4.0F, 8.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition cube_r1 = Head.addOrReplaceChild(
         "cube_r1",
         CubeListBuilder.create().texOffs(0, 26).addBox(0.0F, -6.0F, 0.0F, 7.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-3.5F, 0.0F, -4.7F, -0.1047F, 0.0F, 0.0F)
      );
      PartDefinition cube_r2 = Head.addOrReplaceChild(
         "cube_r2",
         CubeListBuilder.create().texOffs(20, 19).addBox(-1.0F, 0.0F, 0.0F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-3.5F, 1.0F, -4.9F, -0.1047F, 0.0F, 0.0F)
      );
      PartDefinition cube_r3 = Head.addOrReplaceChild(
         "cube_r3",
         CubeListBuilder.create()
            .texOffs(14, 26)
            .addBox(-1.0F, -6.0F, 0.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(18, 26)
            .addBox(7.0F, -6.0F, 0.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-3.5F, 0.0F, -4.8F, -0.1047F, 0.0F, 0.0F)
      );
      PartDefinition cube_r4 = Head.addOrReplaceChild(
         "cube_r4",
         CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -3.0F, -2.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(1.0F, 2.7F, -4.5F, 0.2618F, 0.0F, 0.0F)
      );
      PartDefinition cube_r5 = Head.addOrReplaceChild(
         "cube_r5",
         CubeListBuilder.create().texOffs(0, 13).addBox(-2.0F, -3.0F, -2.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.5F, 1.8F, -3.8F, 0.2618F, 0.0F, 0.0F)
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

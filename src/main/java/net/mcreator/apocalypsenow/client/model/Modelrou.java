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

public class Modelrou<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("apocalypsenow", "modelrou"), "main");
   public final ModelPart Head;

   public Modelrou(ModelPart root) {
      this.Head = root.getChild("Head");
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.getRoot();
      PartDefinition Head = partdefinition.addOrReplaceChild(
         "Head",
         CubeListBuilder.create()
            .texOffs(0, 13)
            .addBox(-4.5F, -3.0F, -5.0F, 9.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 17)
            .addBox(-4.5F, -6.0F, -4.4F, 9.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(11, 0)
            .addBox(-0.5F, -6.0F, -5.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(4, 3)
            .addBox(3.5F, -6.0F, -5.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 3)
            .addBox(-4.5F, -6.0F, -5.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(16, 8)
            .addBox(-4.5F, -8.0F, -5.0F, 9.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-0.5F, -8.0F, -5.0F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F))
            .texOffs(4, 7)
            .addBox(-0.5F, -8.0F, 4.1F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 4)
            .addBox(4.2F, -2.0F, -4.0F, 0.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
            .texOffs(0, 3)
            .addBox(4.2F, -7.0F, -4.0F, 0.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
            .texOffs(0, 6)
            .addBox(-4.3F, -7.0F, 3.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(7, 3)
            .addBox(-4.3F, -7.0F, 4.1F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(3, 2)
            .addBox(-4.3F, -2.0F, 3.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(2, 7)
            .addBox(-4.3F, -2.0F, 4.1F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(6, 1)
            .addBox(4.3F, -2.0F, 3.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(7, 0)
            .addBox(3.3F, -2.0F, 4.2F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(5, 0)
            .addBox(3.3F, -7.0F, 4.2F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(6, 0)
            .addBox(4.3F, -7.0F, 3.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 1)
            .addBox(-4.2F, -7.0F, -4.0F, 0.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
            .texOffs(0, 2)
            .addBox(-4.2F, -2.0F, -4.0F, 0.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
            .texOffs(16, 11)
            .addBox(-4.0F, -7.0F, 4.0F, 8.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(16, 12)
            .addBox(-4.0F, -2.0F, 4.0F, 8.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition cube_r1 = Head.addOrReplaceChild(
         "cube_r1",
         CubeListBuilder.create().texOffs(11, 0).addBox(-2.0F, 0.0F, -4.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, -2.4F, -6.3F, 0.3927F, 0.0F, 0.0F)
      );
      PartDefinition cube_r2 = Head.addOrReplaceChild(
         "cube_r2",
         CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, -2.0F, -5.0F, 0.3927F, 0.0F, 0.0F)
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

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

public class Modelorangegas<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("apocalypsenow", "modelorangegas"), "main");
   public final ModelPart Head;

   public Modelorangegas(ModelPart root) {
      this.Head = root.getChild("Head");
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.getRoot();
      PartDefinition Head = partdefinition.addOrReplaceChild(
         "Head",
         CubeListBuilder.create()
            .texOffs(0, 0)
            .addBox(-4.5F, -0.8F, 4.4F, 9.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 2)
            .addBox(-4.499F, -8.4F, -4.7F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(20, 19)
            .addBox(-4.5F, -7.4F, -4.7F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(12, 19)
            .addBox(3.505F, -7.4F, -4.7F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 2)
            .addBox(4.508F, -5.4F, -4.3F, 0.0F, 2.0F, 9.0F, new CubeDeformation(0.0F))
            .texOffs(0, 4)
            .addBox(-4.495F, -5.4F, 4.7F, 9.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-4.495F, -5.4F, -4.3F, 0.0F, 2.0F, 9.0F, new CubeDeformation(0.0F))
            .texOffs(0, 13)
            .addBox(-3.499F, -7.4F, -4.5F, 7.0F, 6.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-4.5F, -0.4F, -4.7F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition cube_r1 = Head.addOrReplaceChild(
         "cube_r1",
         CubeListBuilder.create().texOffs(0, 19).addBox(-2.0F, -3.0F, 0.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-0.1F, 0.5F, -6.5F, 0.0349F, 0.0F, 0.0F)
      );
      PartDefinition cube_r2 = Head.addOrReplaceChild(
         "cube_r2",
         CubeListBuilder.create().texOffs(18, 9).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.3F, -7.2F, 0.0349F, 0.0F, 0.0F)
      );
      PartDefinition cube_r3 = Head.addOrReplaceChild(
         "cube_r3",
         CubeListBuilder.create().texOffs(14, 13).addBox(-2.0F, -2.0F, -1.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-1.9F, 0.6F, -6.0F, 0.1135F, 0.476F, -0.0819F)
      );
      PartDefinition cube_r4 = Head.addOrReplaceChild(
         "cube_r4",
         CubeListBuilder.create().texOffs(17, 3).addBox(-2.0F, -2.0F, -1.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(3.0F, 0.6F, -6.0F, 0.2493F, -0.5058F, -0.0193F)
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

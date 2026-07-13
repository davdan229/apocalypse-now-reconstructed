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

public class Modelpilotheadset<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("apocalypsenow", "modelpilotheadset"), "main");
   public final ModelPart Head;

   public Modelpilotheadset(ModelPart root) {
      this.Head = root.getChild("Head");
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.getRoot();
      PartDefinition Head = partdefinition.addOrReplaceChild(
         "Head",
         CubeListBuilder.create()
            .texOffs(8, 8)
            .addBox(4.0F, -5.0F, -2.0F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(0, 4)
            .addBox(-6.0F, -5.0F, -2.0F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(2, 4)
            .addBox(-5.0F, -8.0F, 1.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 4)
            .addBox(-5.0F, -8.0F, -2.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 1)
            .addBox(5.0F, -8.0F, -2.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(2, 1)
            .addBox(5.0F, -8.0F, 1.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(12, 6)
            .addBox(3.0F, -8.0001F, -2.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-3.0F, -8.0001F, -2.0F, 6.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(15, 0)
            .addBox(3.0F, -8.0001F, 1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(12, 4)
            .addBox(-5.0F, -8.0001F, -2.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(12, 5)
            .addBox(-5.0F, -8.0001F, 1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(8, 4)
            .addBox(4.6F, -2.2F, -5.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition cube_r1 = Head.addOrReplaceChild(
         "cube_r1",
         CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -2.001F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(4.3F, -0.3F, -6.1F, 0.0F, 0.5411F, 0.0F)
      );
      PartDefinition cube_r2 = Head.addOrReplaceChild(
         "cube_r2",
         CubeListBuilder.create().texOffs(0, 12).addBox(-1.0F, -2.001F, -3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(5.0F, -0.2F, -5.8F, 0.0F, 0.5411F, 0.0F)
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

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

public class Modeloculos<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("apocalypsenow", "modeloculos"), "main");
   public final ModelPart Head;

   public Modeloculos(ModelPart root) {
      this.Head = root.getChild("Head");
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.getRoot();
      PartDefinition Head = partdefinition.addOrReplaceChild(
         "Head",
         CubeListBuilder.create()
            .texOffs(0, 16)
            .addBox(-3.0F, -4.8F, -5.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-1.0F, -6.8F, -5.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(3, 4)
            .addBox(1.0F, -5.8F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 3)
            .addBox(-2.0F, -5.8F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(14, 16)
            .addBox(-0.5F, -6.3F, -5.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 5)
            .addBox(1.2F, -4.3F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(3, 6)
            .addBox(-2.2F, -4.3F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(32, 0)
            .addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.5F))
            .texOffs(0, 0)
            .addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
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

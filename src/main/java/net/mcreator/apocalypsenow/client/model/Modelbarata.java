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

public class Modelbarata<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("apocalypsenow", "modelbarata"), "main");
   public final ModelPart bb_main;

   public Modelbarata(ModelPart root) {
      this.bb_main = root.getChild("bb_main");
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.getRoot();
      PartDefinition bb_main = partdefinition.addOrReplaceChild(
         "bb_main",
         CubeListBuilder.create()
            .texOffs(0, 6)
            .addBox(-1.0F, -1.0F, -3.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-1.5543F, -1.1F, -2.6078F, 3.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 24.0F, 0.0F)
      );
      PartDefinition cube_r1 = bb_main.addOrReplaceChild(
         "cube_r1",
         CubeListBuilder.create()
            .texOffs(2, 2)
            .addBox(1.0F, 0.8F, 0.4F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(2, 5)
            .addBox(0.0F, 0.8F, -0.6F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 6)
            .addBox(1.3F, 0.8F, -3.1F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 7)
            .addBox(0.3F, 0.8F, -2.1F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 8)
            .addBox(0.3F, 0.2F, -6.1F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(2, 0)
            .addBox(1.3F, 0.2F, -5.1F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(7, 8)
            .addBox(0.3F, 0.2F, -3.1F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.8457F, -1.0F, -0.3078F, 0.0F, 0.1571F, 0.0F)
      );
      PartDefinition cube_r2 = bb_main.addOrReplaceChild(
         "cube_r2",
         CubeListBuilder.create()
            .texOffs(0, 2)
            .addBox(-3.9F, 0.7F, 0.4F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(0, 4)
            .addBox(-2.9F, 0.7F, -0.6F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(2, 4)
            .addBox(-3.9F, 0.7F, -3.1F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 5)
            .addBox(-2.9F, 0.7F, -2.1F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(7, 6)
            .addBox(-2.4F, 0.2F, -6.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-3.4F, 0.2F, -5.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(7, 7)
            .addBox(-2.4F, 0.2F, -3.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.8457F, -1.0F, -0.3078F, 0.0F, -0.0524F, 0.0F)
      );
      return LayerDefinition.create(meshdefinition, 32, 32);
   }

   @Override
   public void renderToBuffer(
      PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha
   ) {
      this.bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
   }

   @Override
   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
   }
}

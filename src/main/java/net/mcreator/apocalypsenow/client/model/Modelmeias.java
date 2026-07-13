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

public class Modelmeias<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("apocalypsenow", "modelmeias"), "main");
   public final ModelPart bb_main;

   public Modelmeias(ModelPart root) {
      this.bb_main = root.getChild("bb_main");
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.getRoot();
      PartDefinition bb_main = partdefinition.addOrReplaceChild(
         "bb_main",
         CubeListBuilder.create().texOffs(24, 8).addBox(-4.1F, -18.2F, -7.7F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 24.0F, 0.0F)
      );
      PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));
      PartDefinition Arm1_r1 = cube_r1.addOrReplaceChild(
         "Arm1_r1",
         CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -2.0F, -6.0F, 4.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(5.724F, -3.4361F, 6.1016F, -0.7412F, -0.0266F, -0.0347F)
      );
      PartDefinition arm2_r1 = cube_r1.addOrReplaceChild(
         "arm2_r1",
         CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, -2.0F, -6.0F, 4.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-6.2F, -3.2834F, 5.8881F, -0.6981F, 0.0F, 0.0F)
      );
      PartDefinition cube_r2 = bb_main.addOrReplaceChild(
         "cube_r2",
         CubeListBuilder.create()
            .texOffs(0, 0)
            .addBox(-1.0F, -11.4F, -1.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 7)
            .addBox(-2.0F, -8.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(6, 2)
            .addBox(-2.0F, -10.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(6, 0)
            .addBox(-0.5F, -12.4F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(5, 6)
            .addBox(1.0F, -8.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(6, 4)
            .addBox(1.0F, -10.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F)
      );
      PartDefinition cube_r2_r1 = cube_r2.addOrReplaceChild(
         "cube_r2_r1",
         CubeListBuilder.create().texOffs(28, 28).addBox(-4.0F, -3.9F, -7.8F, 8.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.011F, -0.0297F)
      );
      return LayerDefinition.create(meshdefinition, 64, 64);
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

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

public class Modelperninhabad2<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("apocalypsenow", "modelperninhabad_2"), "main");
   public final ModelPart bb_main;

   public Modelperninhabad2(ModelPart root) {
      this.bb_main = root.getChild("bb_main");
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.getRoot();
      PartDefinition bb_main = partdefinition.addOrReplaceChild(
         "bb_main",
         CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 24.0F, 0.0F)
      );
      PartDefinition cube_r1 = bb_main.addOrReplaceChild(
         "cube_r1",
         CubeListBuilder.create()
            .texOffs(32, 28)
            .addBox(-4.0F, 12.0F, 0.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(32, 0)
            .addBox(0.0F, 12.0F, 0.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(0, 30)
            .addBox(-8.0F, -12.0F, 0.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(20, 16)
            .addBox(4.0F, -12.0F, 0.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F)
      );
      PartDefinition cube_r2_r1 = cube_r1.addOrReplaceChild(
         "cube_r2_r1",
         CubeListBuilder.create().texOffs(16, 32).addBox(18.0F, 2.0F, 0.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5708F)
      );
      PartDefinition cube_r2 = bb_main.addOrReplaceChild(
         "cube_r2",
         CubeListBuilder.create()
            .texOffs(0, 16)
            .addBox(-4.0F, -12.0F, -2.0F, 8.0F, 12.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(36, 21)
            .addBox(-4.0F, -3.0F, -4.0F, 8.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(36, 16)
            .addBox(-4.0F, -12.0F, -4.0F, 8.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-4.0F, -9.0F, -4.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(32, 38)
            .addBox(3.0F, -7.0F, -4.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(24, 0)
            .addBox(-1.0F, -9.0F, -3.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(24, 0)
            .addBox(-2.0F, -21.0F, -3.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(40, 26)
            .addBox(2.0F, -4.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(12, 30)
            .addBox(2.0F, -5.0F, -4.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(39, 39)
            .addBox(1.0F, -5.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(28, 32)
            .addBox(2.0F, -7.0F, -3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(32, 16)
            .addBox(-2.0F, -5.0F, -3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(20, 16)
            .addBox(-2.0F, -9.0F, -3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(16, 30)
            .addBox(-2.0F, -9.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(4, 0)
            .addBox(-3.0F, -9.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(36, 38)
            .addBox(-3.0F, -7.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(30, 0)
            .addBox(2.0F, -9.0F, -4.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(0, 30)
            .addBox(3.0F, -9.0F, -3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(36, 26)
            .addBox(1.0F, -9.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(16, 33)
            .addBox(1.0F, -7.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F)
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

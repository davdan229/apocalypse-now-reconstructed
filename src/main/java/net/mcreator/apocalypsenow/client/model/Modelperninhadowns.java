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

public class Modelperninhadowns<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("apocalypsenow", "modelperninhadowns"), "main");
   public final ModelPart bb_main;
   public final ModelPart bb_main2;

   public Modelperninhadowns(ModelPart root) {
      this.bb_main = root.getChild("bb_main");
      this.bb_main2 = root.getChild("bb_main2");
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
            .texOffs(0, 32)
            .addBox(-8.0F, -12.0F, 0.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(24, 16)
            .addBox(4.0F, -12.0F, 0.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F)
      );
      PartDefinition cube_r2 = bb_main.addOrReplaceChild(
         "cube_r2",
         CubeListBuilder.create().texOffs(0, 16).addBox(-4.0F, -12.0F, -4.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F)
      );
      PartDefinition bb_main2 = partdefinition.addOrReplaceChild(
         "bb_main2",
         CubeListBuilder.create()
            .texOffs(3, 6)
            .addBox(-4.0F, 0.0F, 12.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(0, 5)
            .addBox(-3.0F, 0.0F, 12.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 2)
            .addBox(2.0F, -4.0F, 12.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(0, 4)
            .addBox(3.0F, -4.0F, 12.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(2.0F, 0.0F, 12.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(3.0F, 0.0F, 12.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(18, 16)
            .addBox(-1.9F, -4.0F, 12.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(0, 4)
            .addBox(-2.9F, -4.0F, 12.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
            .texOffs(3, 3)
            .addBox(-3.8F, -2.7F, 12.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
            .texOffs(3, 0)
            .addBox(2.0F, -2.2F, 12.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 24.0F, 0.0F)
      );
      PartDefinition cube_r3 = bb_main2.addOrReplaceChild(
         "cube_r3",
         CubeListBuilder.create()
            .texOffs(0, 6)
            .addBox(-0.5F, -6.0F, 14.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 16)
            .addBox(-2.0F, -6.0F, 13.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 18)
            .addBox(1.0F, -6.0F, 13.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(20, 18)
            .addBox(-2.0F, -6.0F, 10.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(24, 0)
            .addBox(-1.0F, -6.0F, 10.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(23, 17)
            .addBox(1.0F, -6.0F, 10.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3491F, 0.0F, 0.0F)
      );
      return LayerDefinition.create(meshdefinition, 64, 64);
   }

   @Override
   public void renderToBuffer(
      PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha
   ) {
      this.bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
      this.bb_main2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
   }

   @Override
   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
   }
}

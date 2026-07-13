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

public class Modeldynamiteroll_Converted<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("apocalypsenow", "modeldynamiteroll_converted"), "main");
   public final ModelPart bone;

   public Modeldynamiteroll_Converted(ModelPart root) {
      this.bone = root.getChild("bone");
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.getRoot();
      PartDefinition bone = partdefinition.addOrReplaceChild(
         "bone",
         CubeListBuilder.create()
            .texOffs(10, 5)
            .addBox(1.0F, -8.0F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(2, 21)
            .addBox(-3.0F, -8.0F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(0, 12)
            .addBox(-3.0F, -8.0F, 1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(5, 12)
            .addBox(1.0F, -8.0F, 1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(5, 12)
            .addBox(1.0F, -8.0F, -3.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(6, 20)
            .addBox(0.0F, -14.0F, -0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(23, 22)
            .addBox(-2.5F, -11.0F, 0.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(12, 23)
            .addBox(1.5F, -11.0F, 0.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(24, 0)
            .addBox(0.5F, -12.0F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(24, 0)
            .addBox(-1.5F, -12.0F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(24, 0)
            .addBox(-0.5F, -13.0F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(6, 22)
            .mirror()
            .addBox(0.0F, -11.0F, -2.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
            .mirror(false)
            .texOffs(7, 22)
            .addBox(0.0F, -11.0F, 1.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(24, -1)
            .addBox(0.0F, -12.0F, 0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(24, -1)
            .addBox(0.0F, -12.0F, -1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(4, 12)
            .addBox(-3.0F, -8.0F, -3.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(12, 5)
            .addBox(-1.0F, -8.0F, -3.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(4, 12)
            .addBox(-1.0F, -8.0F, 1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(0, 18)
            .addBox(-1.0F, -8.0F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 24.0F, 0.0F)
      );
      PartDefinition cube_r1 = bone.addOrReplaceChild(
         "cube_r1",
         CubeListBuilder.create()
            .texOffs(24, -1)
            .addBox(0.0F, -3.5F, 3.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(24, -1)
            .addBox(0.0F, -2.5F, 4.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(8, 22)
            .addBox(0.0F, -1.5F, 5.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(24, -1)
            .addBox(0.0F, -3.5F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(24, -1)
            .addBox(0.0F, -2.5F, 0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(9, 22)
            .addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-2.0F, -9.5F, -2.0F, 0.0F, 0.7854F, 0.0F)
      );
      PartDefinition cube_r2 = bone.addOrReplaceChild(
         "cube_r2",
         CubeListBuilder.create()
            .texOffs(24, 0)
            .addBox(-4.3F, -3.5F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(24, 0)
            .addBox(-5.3F, -2.5F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(6, 23)
            .addBox(-6.3F, -1.5F, 0.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(24, 0)
            .addBox(-2.8F, -3.5F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(24, 0)
            .addBox(-1.8F, -2.5F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(6, 23)
            .addBox(-0.8F, -1.5F, 0.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(2.1968F, -9.5F, -2.1381F, 0.0F, 0.7854F, 0.0F)
      );
      return LayerDefinition.create(meshdefinition, 32, 32);
   }

   @Override
   public void renderToBuffer(
      PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha
   ) {
      this.bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
   }

   @Override
   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
   }
}

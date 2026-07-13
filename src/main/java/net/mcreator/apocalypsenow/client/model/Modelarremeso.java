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

public class Modelarremeso<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("apocalypsenow", "modelarremeso"), "main");
   public final ModelPart bone;

   public Modelarremeso(ModelPart root) {
      this.bone = root.getChild("bone");
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.getRoot();
      PartDefinition bone = partdefinition.addOrReplaceChild(
         "bone", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.373F, 23.0076F, -0.6419F, 0.4704F, 1.2194F, 0.2384F)
      );
      PartDefinition cube_r1 = bone.addOrReplaceChild(
         "cube_r1",
         CubeListBuilder.create()
            .texOffs(13, 10)
            .addBox(-8.5F, -1.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(7, 6)
            .mirror()
            .addBox(-8.5F, -2.0F, 1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
            .mirror(false)
            .texOffs(12, 14)
            .addBox(-8.5F, -1.0F, 2.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(4, 14)
            .mirror()
            .addBox(-8.5F, -1.0F, 3.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
            .mirror(false)
            .texOffs(8, 14)
            .addBox(-8.5F, -1.0F, 4.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(2, 14)
            .addBox(-8.5F, 0.0F, 5.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(5, 14)
            .addBox(-8.5F, 1.0F, 6.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(4, 6)
            .addBox(-8.5F, 2.0F, 7.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(2, 5)
            .addBox(-8.5F, 3.0F, 8.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(13, 4)
            .addBox(-8.5F, 4.0F, 9.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(14, 14)
            .addBox(-8.5F, 8.0F, 10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(10, 11)
            .addBox(-8.5F, 6.0F, 8.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
            .texOffs(10, 10)
            .addBox(-8.5F, 7.0F, 9.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
            .texOffs(0, 10)
            .addBox(-8.5F, 8.0F, 11.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-3.8865F, -9.287F, -4.7478F, 0.1809F, -0.2879F, -1.7152F)
      );
      return LayerDefinition.create(meshdefinition, 16, 16);
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

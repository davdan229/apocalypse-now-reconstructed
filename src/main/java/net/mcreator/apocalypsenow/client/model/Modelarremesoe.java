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

public class Modelarremesoe<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("apocalypsenow", "modelarremesoe"), "main");
   public final ModelPart bone;

   public Modelarremesoe(ModelPart root) {
      this.bone = root.getChild("bone");
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.getRoot();
      PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(8.0F, 24.0F, -8.0F));
      PartDefinition cube_r1 = bone.addOrReplaceChild(
         "cube_r1",
         CubeListBuilder.create()
            .texOffs(14, 4)
            .addBox(-8.5F, -1.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(10, 11)
            .addBox(-8.5F, -2.0F, 1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(14, 0)
            .addBox(-8.5F, -1.0F, 2.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(12, 6)
            .addBox(-8.5F, -1.0F, 3.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(8, 7)
            .addBox(-8.5F, -1.0F, 4.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 10)
            .addBox(-8.5F, 0.0F, 5.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(10, 0)
            .addBox(-8.5F, 1.0F, 6.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(4, 10)
            .addBox(-8.5F, 2.0F, 7.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(8, 14)
            .addBox(-8.5F, 3.0F, 8.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(5, 0)
            .addBox(-8.5F, 4.0F, 9.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(14, 11)
            .addBox(-8.5F, 8.0F, 10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(5, 3)
            .addBox(-8.5F, 6.0F, 8.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
            .texOffs(0, 6)
            .addBox(-8.5F, 7.0F, 9.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-8.5F, 8.0F, 11.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7418F, 0.0F, 0.0F)
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

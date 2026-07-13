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
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;

public class Modelpress<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("apocalypsenow", "modelpress"), "main");
   public final ModelPart Body;
   public final ModelPart left;
   public final ModelPart right;

   public Modelpress(ModelPart root) {
      this.Body = root.getChild("Body");
      this.left = root.getChild("left");
      this.right = root.getChild("right");
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.getRoot();
      PartDefinition Body = partdefinition.addOrReplaceChild(
         "Body",
         CubeListBuilder.create()
            .texOffs(6, 27)
            .addBox(2.0F, 0.0F, -3.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 27)
            .addBox(-4.0F, 0.0F, -3.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 11)
            .addBox(-4.0F, 2.0F, -3.0F, 8.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(18, 0)
            .addBox(-3.5F, 5.3F, -3.4F, 7.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(20, 18)
            .addBox(-3.0F, 2.3F, -3.4F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-4.0F, 2.0F, 2.0F, 8.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(8, 22)
            .addBox(2.0F, 0.0F, 2.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(24, 22)
            .addBox(2.0F, -0.2F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(14, 18)
            .addBox(3.2F, 4.0F, -2.0F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(18, 7)
            .addBox(-4.3F, 4.0F, -2.0F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(0, 22)
            .addBox(-4.0F, -0.2F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(24, 7)
            .addBox(-4.0F, 0.0F, 2.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition left = partdefinition.addOrReplaceChild("left", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
      PartDefinition right = partdefinition.addOrReplaceChild("right", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
      return LayerDefinition.create(meshdefinition, 64, 64);
   }

   @Override
   public void renderToBuffer(
      PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha
   ) {
      this.Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
      this.left.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
      this.right.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
   }

   @Override
   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
      this.left.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
      this.right.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
   }
}

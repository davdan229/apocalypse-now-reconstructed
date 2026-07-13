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

public class Modelavancapants<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("apocalypsenow", "modelavancapants"), "main");
   public final ModelPart RightLeg;
   public final ModelPart LeftLeg;

   public Modelavancapants(ModelPart root) {
      this.RightLeg = root.getChild("RightLeg");
      this.LeftLeg = root.getChild("LeftLeg");
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.getRoot();
      PartDefinition RightLeg = partdefinition.addOrReplaceChild(
         "RightLeg",
         CubeListBuilder.create()
            .texOffs(0, 55)
            .addBox(-2.8F, 1.9F, -2.505F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(49, 55)
            .addBox(-2.9F, 1.9F, -2.705F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(23, 59)
            .addBox(-2.9F, 1.9F, -2.705F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(20, 62)
            .addBox(-2.6F, 1.9F, -2.605F, 5.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(32, 59)
            .addBox(1.6F, 1.9F, -2.705F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(60, 61)
            .addBox(2.6F, 1.9F, -2.705F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(10, 55)
            .addBox(2.5F, 1.9F, -2.505F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(58, 61)
            .addBox(2.6F, 1.9F, 1.695F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(30, 56)
            .addBox(1.6F, 1.9F, 2.695F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(46, 57)
            .addBox(-2.9F, 1.9F, 2.695F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(54, 55)
            .addBox(-2.9F, 1.9F, 1.695F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(10, 62)
            .addBox(-2.6F, 1.9F, 2.595F, 5.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(15, 13)
            .addBox(-2.7F, -2.0F, -2.5F, 5.0F, 13.0F, 5.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-1.9F, 12.0F, 0.0F)
      );
      PartDefinition LeftLeg = partdefinition.addOrReplaceChild(
         "LeftLeg",
         CubeListBuilder.create()
            .texOffs(15, 13)
            .addBox(-2.5F, -2.0F, -2.5F, 5.0F, 13.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(10, 62)
            .addBox(-2.5F, 1.9F, 2.595F, 5.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(49, 57)
            .addBox(-2.7F, 1.9F, 1.695F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(46, 57)
            .addBox(-2.7F, 1.9F, 2.695F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(30, 56)
            .addBox(1.7F, 1.9F, 2.695F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(58, 61)
            .addBox(2.7F, 1.9F, 1.695F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(10, 55)
            .addBox(2.6F, 1.9F, -2.505F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(60, 61)
            .addBox(2.7F, 1.9F, -2.705F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(32, 59)
            .addBox(1.7F, 1.9F, -2.705F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(20, 62)
            .addBox(-2.5F, 1.9F, -2.605F, 5.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(23, 59)
            .addBox(-2.7F, 1.9F, -2.705F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(49, 55)
            .addBox(-2.7F, 1.9F, -2.705F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 55)
            .addBox(-2.6F, 1.9F, -2.505F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
         PartPose.offset(1.9F, 12.0F, 0.0F)
      );
      return LayerDefinition.create(meshdefinition, 64, 64);
   }

   @Override
   public void renderToBuffer(
      PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha
   ) {
      this.RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
      this.LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
   }

   @Override
   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
      this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
      this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
   }
}

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

public class Modelpantsdefense<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("apocalypsenow", "modelpantsdefense"), "main");
   public final ModelPart RightLeg;
   public final ModelPart LeftLeg;

   public Modelpantsdefense(ModelPart root) {
      this.RightLeg = root.getChild("RightLeg");
      this.LeftLeg = root.getChild("LeftLeg");
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.getRoot();
      PartDefinition RightLeg = partdefinition.addOrReplaceChild(
         "RightLeg",
         CubeListBuilder.create()
            .texOffs(0, 7)
            .addBox(-2.8F, -0.6F, -2.6F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(15, 2)
            .addBox(-0.8F, 1.4F, -2.6F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(15, 0)
            .addBox(-2.0F, 6.0F, 2.0F, 4.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(15, 5)
            .addBox(-2.0F, 6.0F, -2.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(0, 17)
            .addBox(2.002F, 6.0F, -2.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(16, 14)
            .addBox(-2.0F, 5.0F, -3.0F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-1.9F, 12.0F, 0.0F)
      );
      PartDefinition LeftLeg = partdefinition.addOrReplaceChild(
         "LeftLeg",
         CubeListBuilder.create()
            .texOffs(0, 0)
            .addBox(-2.2F, -0.6F, -2.6F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(0, 14)
            .addBox(-1.9F, 1.4F, -2.6F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(15, 20)
            .addBox(-2.0F, 5.0F, -3.0F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(20, 7)
            .addBox(2.002F, 6.0F, -2.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(0, 19)
            .addBox(-1.8F, 6.0F, -2.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(23, 0)
            .addBox(-2.0F, 6.0F, 2.0F, 4.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offset(1.9F, 12.0F, 0.0F)
      );
      return LayerDefinition.create(meshdefinition, 32, 32);
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

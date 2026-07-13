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

public class Modeltshirt<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("apocalypsenow", "modeltshirt"), "main");
   public final ModelPart Body;
   public final ModelPart RightArm;
   public final ModelPart LeftArm;

   public Modeltshirt(ModelPart root) {
      this.Body = root.getChild("Body");
      this.RightArm = root.getChild("RightArm");
      this.LeftArm = root.getChild("LeftArm");
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.getRoot();
      PartDefinition Body = partdefinition.addOrReplaceChild(
         "Body",
         CubeListBuilder.create()
            .texOffs(0, 0)
            .addBox(-4.0F, 1.0F, 2.505F, 8.0F, 11.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 26)
            .addBox(4.004F, 2.0F, -2.5F, 0.0F, 10.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(20, 25)
            .addBox(-4.005F, 2.0F, -2.5F, 0.0F, 10.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(14, 35)
            .addBox(1.0F, 0.0F, 2.5F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(14, 34)
            .addBox(-4.0F, 0.0F, 2.5F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 11)
            .addBox(-4.0F, 2.0F, -2.505F, 8.0F, 10.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(14, 31)
            .addBox(-4.0F, 0.0F, -2.505F, 3.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(5, 31)
            .addBox(-4.0F, 0.0F, -2.5F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(35, 7)
            .addBox(1.0F, 0.0F, -2.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(35, 6)
            .addBox(1.0F, 0.0F, 1.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(17, 20)
            .addBox(-2.0F, 0.0F, 1.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(15, 20)
            .addBox(-2.0F, 0.0F, -2.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(31, 0)
            .addBox(2.0F, 0.0F, -2.5F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(14, 33)
            .addBox(1.0F, 0.0F, -2.505F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(36, 5)
            .addBox(0.0F, 1.0F, -2.505F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition RightArm = partdefinition.addOrReplaceChild(
         "RightArm",
         CubeListBuilder.create()
            .texOffs(11, 0)
            .addBox(-3.5F, -2.08F, -2.5F, 5.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(0, 16)
            .addBox(-3.5F, -2.0F, -2.5F, 0.0F, 10.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(16, 0)
            .addBox(1.5F, -2.0F, -2.5F, 0.0F, 10.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(26, 0)
            .addBox(-3.5F, -2.0F, 2.5F, 5.0F, 10.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(26, 10)
            .addBox(-3.5F, -2.0F, -2.5F, 5.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-5.0F, 2.0F, 0.0F)
      );
      PartDefinition LeftArm = partdefinition.addOrReplaceChild(
         "LeftArm",
         CubeListBuilder.create()
            .texOffs(20, 15)
            .addBox(-1.5F, -2.0F, -2.5F, 0.0F, 10.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(10, 16)
            .addBox(3.5F, -2.0F, -2.5F, 0.0F, 10.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(11, 15)
            .addBox(-1.5F, -2.08F, -2.5F, 5.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(30, 30)
            .addBox(-1.5F, -2.0F, 2.5F, 5.0F, 10.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(30, 20)
            .addBox(-1.5F, -2.0F, -2.5F, 5.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offset(5.0F, 2.0F, 0.0F)
      );
      return LayerDefinition.create(meshdefinition, 64, 64);
   }

   @Override
   public void renderToBuffer(
      PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha
   ) {
      this.Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
      this.RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
      this.LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
   }

   @Override
   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
      this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
      this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
   }
}

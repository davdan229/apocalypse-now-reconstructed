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

public class Modelgentextatical<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("apocalypsenow", "modelgentextatical"), "main");
   public final ModelPart Head;
   public final ModelPart body;
   public final ModelPart left;
   public final ModelPart rigth;

   public Modelgentextatical(ModelPart root) {
      this.Head = root.getChild("Head");
      this.body = root.getChild("body");
      this.left = root.getChild("left");
      this.rigth = root.getChild("rigth");
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.getRoot();
      PartDefinition Head = partdefinition.addOrReplaceChild(
         "Head",
         CubeListBuilder.create()
            .texOffs(10, 16)
            .addBox(4.0F, -8.0F, -4.0F, 1.0F, 7.0F, 8.0F, new CubeDeformation(0.0F))
            .texOffs(10, 44)
            .addBox(4.0F, -1.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(10, 9)
            .addBox(-5.0F, -1.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(44, 5)
            .addBox(-3.0F, -1.0F, 4.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(28, 36)
            .addBox(-4.0F, -8.0F, -5.0F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(38, 16)
            .addBox(-4.0F, -5.0F, -4.0F, 8.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 6)
            .addBox(-4.0F, -2.0F, -4.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 5)
            .addBox(1.0F, -2.0F, -4.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-4.0F, -9.0F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
            .texOffs(0, 9)
            .addBox(-5.0F, -8.0F, -4.0F, 1.0F, 7.0F, 8.0F, new CubeDeformation(0.0F))
            .texOffs(24, 0)
            .addBox(-4.0F, -8.0F, 4.0F, 8.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(14, 31)
            .addBox(-6.0F, -7.0F, -3.0F, 1.0F, 7.0F, 6.0F, new CubeDeformation(0.0F))
            .texOffs(0, 25)
            .addBox(5.0F, -7.0F, -3.0F, 1.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition bone = Head.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
      PartDefinition body = partdefinition.addOrReplaceChild(
         "body",
         CubeListBuilder.create()
            .texOffs(38, 4)
            .addBox(4.0F, 4.0F, -2.0F, 1.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(44, 0)
            .addBox(4.0F, -1.0F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(36, 41)
            .addBox(-7.0F, -1.0F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(0, 38)
            .addBox(-5.0F, 4.0F, -2.0F, 1.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(20, 9)
            .addBox(-4.0F, -1.0F, 2.0F, 8.0F, 13.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(28, 23)
            .addBox(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(38, 19)
            .addBox(-3.0F, 12.0F, -3.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(46, 22)
            .addBox(-2.0F, 14.0F, -3.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(22, 31)
            .addBox(0.5F, 8.0F, -4.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(3.2F, 8.0F, -4.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(24, 41)
            .addBox(5.0F, 8.0F, -2.0F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(32, 41)
            .addBox(-4.0F, 4.1F, -4.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(6, 38)
            .addBox(-1.6F, 4.1F, -4.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(46, 25)
            .addBox(-4.8F, 8.0F, -4.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 9)
            .addBox(-2.2F, 8.0F, -4.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(14, 31)
            .addBox(-2.5F, 6.0F, 3.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 24)
            .addBox(0.5F, 6.0F, 3.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition left = partdefinition.addOrReplaceChild("left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
      PartDefinition rigth = partdefinition.addOrReplaceChild("rigth", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
      return LayerDefinition.create(meshdefinition, 64, 64);
   }

   @Override
   public void renderToBuffer(
      PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha
   ) {
      this.Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
      this.body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
      this.left.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
      this.rigth.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
   }

   @Override
   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
      this.Head.yRot = netHeadYaw / (180.0F / (float)Math.PI);
      this.Head.xRot = headPitch / (180.0F / (float)Math.PI);
      this.rigth.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
      this.left.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
   }
}

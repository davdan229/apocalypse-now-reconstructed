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

public class Modelstoparmor<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("apocalypsenow", "modelstoparmor"), "main");
   public final ModelPart Body;
   public final ModelPart bone;
   public final ModelPart bone2;

   public Modelstoparmor(ModelPart root) {
      this.Body = root.getChild("Body");
      this.bone = root.getChild("bone");
      this.bone2 = root.getChild("bone2");
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.getRoot();
      PartDefinition Body = partdefinition.addOrReplaceChild(
         "Body",
         CubeListBuilder.create()
            .texOffs(0, 0)
            .addBox(-4.5F, -0.2F, 3.0F, 9.0F, 15.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 30)
            .addBox(4.5F, 8.8F, 3.0F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(8, 30)
            .addBox(5.5F, 8.8F, 3.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(16, 30)
            .addBox(6.5F, 8.8F, 3.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(24, 30)
            .addBox(7.5F, 8.8F, 3.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(2, 30)
            .addBox(-5.5F, 8.8F, 3.0F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(10, 30)
            .addBox(-6.5F, 8.8F, 3.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(26, 30)
            .addBox(-8.5F, 8.8F, 3.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(18, 30)
            .addBox(-7.5F, 8.8F, 3.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(28, 21)
            .addBox(4.5F, -0.2F, 3.0F, 5.0F, 9.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(18, 0)
            .addBox(5.5F, -0.2F, -3.0F, 4.0F, 0.0F, 6.0F, new CubeDeformation(0.0F))
            .texOffs(18, 6)
            .addBox(-9.5F, -0.2F, -3.0F, 4.0F, 0.0F, 6.0F, new CubeDeformation(0.0F))
            .texOffs(18, 12)
            .addBox(-9.5F, -0.2F, 3.0F, 5.0F, 9.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 15)
            .addBox(-4.5F, -0.2F, -3.0F, 9.0F, 15.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(6, 30)
            .addBox(4.5F, 8.8F, -3.0F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(14, 30)
            .addBox(5.5F, 8.8F, -3.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(22, 30)
            .addBox(6.5F, 8.8F, -3.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(30, 30)
            .addBox(7.5F, 8.8F, -3.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(4, 30)
            .addBox(-5.5F, 8.8F, -3.0F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(12, 30)
            .addBox(-6.5F, 8.8F, -3.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(28, 30)
            .addBox(-8.5F, 8.8F, -3.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(24, 32)
            .addBox(-9.5F, 8.8F, -3.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(20, 30)
            .addBox(-7.5F, 8.8F, -3.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(28, 12)
            .addBox(4.5F, -0.2F, -3.0F, 5.0F, 9.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(18, 21)
            .addBox(-9.5F, -0.2F, -3.0F, 5.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(-8.5F, 8.8F, 2.0F));
      PartDefinition bone2 = partdefinition.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(-8.5F, 8.8F, 2.0F));
      return LayerDefinition.create(meshdefinition, 64, 64);
   }

   @Override
   public void renderToBuffer(
      PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha
   ) {
      this.Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
      this.bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
      this.bone2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
   }

   @Override
   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
   }
}

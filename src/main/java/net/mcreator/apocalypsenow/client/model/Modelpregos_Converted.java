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

public class Modelpregos_Converted<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("apocalypsenow", "modelpregos_converted"), "main");
   public final ModelPart bone;

   public Modelpregos_Converted(ModelPart root) {
      this.bone = root.getChild("bone");
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.getRoot();
      PartDefinition bone = partdefinition.addOrReplaceChild(
         "bone",
         CubeListBuilder.create()
            .texOffs(0, 0)
            .addBox(-3.0F, -7.0F, -2.0F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(0.3F, -4.7F, -4.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-2.1F, -2.0F, -4.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(1.0F, -5.8F, -4.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-1.3F, -6.4F, -4.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-2.3F, -5.0F, -4.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(1.0F, -2.0F, -4.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-1.0F, -3.3F, -4.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(0.3F, -4.7F, 3.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-2.1F, -2.0F, 3.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-5.1F, -2.0F, -1.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-5.1F, -4.6F, 2.3F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-5.1F, -5.6F, 1.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-5.1F, -6.6F, -1.6F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-5.1F, -6.6F, 2.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-5.1F, -6.6F, 0.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-5.1F, -3.0F, 0.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-5.1F, -3.0F, 2.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-5.1F, -2.0F, 1.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-5.1F, -5.0F, -1.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-5.1F, -5.0F, 0.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(1.9F, -2.0F, -1.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(1.9F, -4.6F, 2.3F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(1.9F, -3.0F, 0.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(1.9F, -3.0F, 2.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(1.9F, -2.0F, 1.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(1.9F, -5.0F, -1.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(1.9F, -5.0F, 0.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(1.9F, -5.6F, 1.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(1.9F, -6.6F, -1.6F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(1.9F, -6.6F, 2.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(1.9F, -6.6F, 0.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(1.0F, -5.8F, 3.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-1.3F, -6.4F, 3.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-2.3F, -5.0F, 3.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(1.0F, -2.0F, 3.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-1.0F, -3.3F, 3.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 24.0F, 0.0F)
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

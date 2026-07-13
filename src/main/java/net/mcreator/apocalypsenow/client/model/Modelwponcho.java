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

public class Modelwponcho<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("apocalypsenow", "modelwponcho"), "main");
   public final ModelPart Body;

   public Modelwponcho(ModelPart root) {
      this.Body = root.getChild("Body");
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.getRoot();
      PartDefinition Body = partdefinition.addOrReplaceChild(
         "Body",
         CubeListBuilder.create()
            .texOffs(0, 0)
            .addBox(-9.5F, 0.0F, -3.5F, 19.0F, 0.0F, 7.0F, new CubeDeformation(0.0F))
            .texOffs(0, 17)
            .addBox(-9.5F, 0.0F, -3.5F, 0.0F, 3.0F, 7.0F, new CubeDeformation(0.0F))
            .texOffs(0, 28)
            .addBox(-9.5F, 3.0F, -2.5F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(10, 28)
            .addBox(9.5F, 3.0F, -2.5F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(14, 17)
            .addBox(9.5F, 0.0F, -3.5F, 0.0F, 3.0F, 7.0F, new CubeDeformation(0.0F))
            .texOffs(0, 7)
            .addBox(-9.5F, 0.0F, 3.5F, 19.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 9)
            .addBox(-9.5F, 0.0F, -3.5F, 19.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 11)
            .addBox(-9.5F, 2.0F, -3.5F, 17.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 13)
            .addBox(-9.5F, 3.0F, -3.5F, 15.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 15)
            .addBox(-9.5F, 4.0F, -3.5F, 13.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(26, 15)
            .addBox(-9.5F, 5.0F, -3.5F, 11.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 27)
            .addBox(-9.5F, 6.0F, -3.5F, 9.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(28, 17)
            .addBox(-9.5F, 7.0F, -3.5F, 7.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(18, 27)
            .addBox(-9.5F, 6.0F, 3.5F, 9.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(26, 16)
            .addBox(-9.5F, 5.0F, 3.5F, 11.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(28, 18)
            .addBox(-9.5F, 7.0F, 3.5F, 7.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 16)
            .addBox(-9.5F, 4.0F, 3.5F, 13.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 14)
            .addBox(-9.5F, 3.0F, 3.5F, 15.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 12)
            .addBox(-9.5F, 2.0F, 3.5F, 17.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      return LayerDefinition.create(meshdefinition, 64, 64);
   }

   @Override
   public void renderToBuffer(
      PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha
   ) {
      this.Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
   }

   @Override
   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
   }
}

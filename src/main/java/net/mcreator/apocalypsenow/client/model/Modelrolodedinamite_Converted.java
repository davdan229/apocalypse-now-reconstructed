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

public class Modelrolodedinamite_Converted<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
      new ResourceLocation("apocalypsenow", "modelrolodedinamite_converted"), "main"
   );
   public final ModelPart bone;

   public Modelrolodedinamite_Converted(ModelPart root) {
      this.bone = root.getChild("bone");
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.getRoot();
      PartDefinition bone = partdefinition.addOrReplaceChild(
         "bone",
         CubeListBuilder.create()
            .texOffs(0, 0)
            .addBox(2.0F, -7.0F, 0.1F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(2.0F, -7.0F, -3.9F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-5.0F, -7.0F, -2.9F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-2.7F, -7.0F, 3.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(1.0F, -7.0F, 3.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-5.0F, -7.0F, 1.1F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-2.0F, -7.0F, -4.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-3.0F, -7.0F, -2.0F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(0.3F, -8.0F, 1.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-1.1F, -8.0F, -3.1F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-1.4F, -8.0F, 1.2F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-1.9F, -9.0F, -0.1F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-1.6F, -11.0F, 0.9F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 24.0F, 0.0F)
      );
      PartDefinition cube_r1 = bone.addOrReplaceChild(
         "cube_r1",
         CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, -1.0F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(2.9F, -7.5F, -2.1F, 0.0F, -0.7854F, 0.0F)
      );
      PartDefinition cube_r2 = bone.addOrReplaceChild(
         "cube_r2",
         CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -0.5F, -3.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(1.6F, -7.5F, 3.2F, 0.0F, 0.7854F, 0.0F)
      );
      PartDefinition cube_r3 = bone.addOrReplaceChild(
         "cube_r3",
         CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -0.5F, 0.3F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-3.3F, -7.5F, -1.9F, 0.0F, -0.7854F, 0.0F)
      );
      PartDefinition cube_r4 = bone.addOrReplaceChild(
         "cube_r4",
         CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -0.5F, 0.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-3.3F, -7.5F, 2.0F, 0.0F, 0.3927F, 0.0F)
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

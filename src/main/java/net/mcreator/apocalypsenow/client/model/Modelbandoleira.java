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

public class Modelbandoleira<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("apocalypsenow", "modelbandoleira"), "main");
   public final ModelPart Head;
   public final ModelPart Body;
   public final ModelPart RightArm;
   public final ModelPart LeftArm;
   public final ModelPart RightLeg;
   public final ModelPart LeftLeg;

   public Modelbandoleira(ModelPart root) {
      this.Head = root.getChild("Head");
      this.Body = root.getChild("Body");
      this.RightArm = root.getChild("RightArm");
      this.LeftArm = root.getChild("LeftArm");
      this.RightLeg = root.getChild("RightLeg");
      this.LeftLeg = root.getChild("LeftLeg");
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.getRoot();
      PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
      PartDefinition Body = partdefinition.addOrReplaceChild(
         "Body",
         CubeListBuilder.create()
            .texOffs(8, 11)
            .addBox(1.8F, 10.0F, -3.7F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(8, 7)
            .addBox(-0.5F, 10.0F, -3.7F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-4.0F, 11.0F, -2.7F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition cube_r1 = Body.addOrReplaceChild(
         "cube_r1",
         CubeListBuilder.create()
            .texOffs(14, 2)
            .addBox(-0.6F, 1.8F, -3.4F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(14, 7)
            .addBox(-3.4F, 2.2F, -3.4F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(14, 11)
            .addBox(-6.2F, 2.6F, -3.4F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(7, 15)
            .addBox(-9.2F, 3.0F, -3.4F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7854F)
      );
      PartDefinition cube_r2 = Body.addOrReplaceChild(
         "cube_r2",
         CubeListBuilder.create()
            .texOffs(8, 2)
            .addBox(2.6F, -2.4F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(0, 2)
            .addBox(2.6F, -2.0F, 1.3F, 1.0F, 13.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(4, 2)
            .addBox(2.6F, -2.0F, -2.7F, 1.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.6109F)
      );
      PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(), PartPose.offset(-5.0F, 2.0F, 0.0F));
      PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(), PartPose.offset(5.0F, 2.0F, 0.0F));
      PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(), PartPose.offset(-1.9F, 12.0F, 0.0F));
      PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(), PartPose.offset(1.9F, 12.0F, 0.0F));
      return LayerDefinition.create(meshdefinition, 32, 32);
   }

   @Override
   public void renderToBuffer(
      PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha
   ) {
      this.Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
      this.Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
      this.RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
      this.LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
      this.RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
      this.LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
   }

   @Override
   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
   }
}

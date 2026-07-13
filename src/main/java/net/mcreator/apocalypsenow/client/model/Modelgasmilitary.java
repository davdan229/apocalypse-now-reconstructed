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

public class Modelgasmilitary<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("apocalypsenow", "modelgasmilitary"), "main");
   public final ModelPart Head;
   public final ModelPart Body;
   public final ModelPart RightArm;
   public final ModelPart LeftArm;
   public final ModelPart RightLeg;
   public final ModelPart LeftLeg;

   public Modelgasmilitary(ModelPart root) {
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
      PartDefinition Head = partdefinition.addOrReplaceChild(
         "Head",
         CubeListBuilder.create()
            .texOffs(10, 15)
            .addBox(3.7F, -8.0F, -4.0F, 1.0F, 5.0F, 8.0F, new CubeDeformation(0.0F))
            .texOffs(30, 14)
            .addBox(4.0F, -3.0F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
            .texOffs(25, 0)
            .addBox(-5.0F, -3.0F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
            .texOffs(35, 6)
            .addBox(-4.0F, -3.0F, 4.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 10)
            .addBox(-4.7F, -8.0F, -4.0F, 1.0F, 5.0F, 8.0F, new CubeDeformation(0.0F))
            .texOffs(35, 0)
            .addBox(-4.0F, -8.0F, 4.0F, 8.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-4.0F, -9.0F, -4.4F, 8.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition cube_r1 = Head.addOrReplaceChild(
         "cube_r1",
         CubeListBuilder.create()
            .texOffs(45, 27)
            .addBox(3.0F, -7.8F, -4.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(21, 45)
            .addBox(-2.0F, -2.8F, -5.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(28, 23)
            .addBox(-3.0F, -1.8F, -5.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(40, 20)
            .addBox(-3.0F, -7.8F, -4.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(43, 46)
            .addBox(-4.0F, -7.8F, -4.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, -0.0436F, 0.0F, 0.0F)
      );
      PartDefinition cube_r2 = Head.addOrReplaceChild(
         "cube_r2",
         CubeListBuilder.create().texOffs(24, 39).addBox(-3.0F, -7.8F, -3.0F, 6.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, -1.7F, -0.0436F, 0.0F, 0.0F)
      );
      PartDefinition cube_r3 = Head.addOrReplaceChild(
         "cube_r3",
         CubeListBuilder.create().texOffs(33, 44).addBox(4.1F, -2.3F, -6.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, -0.0436F, 0.0F, 0.0F)
      );
      PartDefinition cube_r4 = Head.addOrReplaceChild(
         "cube_r4",
         CubeListBuilder.create().texOffs(0, 6).addBox(1.6F, -1.3F, -4.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, -1.9F, -0.0436F, 0.0F, 0.0F)
      );
      PartDefinition Body = partdefinition.addOrReplaceChild(
         "Body",
         CubeListBuilder.create()
            .texOffs(0, 39)
            .addBox(2.0F, -0.2F, -2.6F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(0, 40)
            .addBox(-4.0F, -0.2F, -2.6F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(20, 10)
            .addBox(-4.0F, 1.0F, 2.0F, 8.0F, 11.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(12, 28)
            .addBox(3.5F, 0.9F, -2.5F, 1.0F, 11.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(0, 23)
            .addBox(-4.5F, 0.9F, -2.5F, 1.0F, 11.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(10, 10)
            .addBox(1.3F, 7.0F, -3.6F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(11, 44)
            .addBox(3.3F, 8.0F, -0.9F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
            .texOffs(40, 14)
            .addBox(-5.5F, 8.0F, -0.9F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
            .texOffs(44, 23)
            .addBox(-0.4F, 2.0F, -3.2F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(36, 39)
            .addBox(-0.2F, 8.6F, 1.8F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(25, 0)
            .addBox(-1.0F, 7.0F, -3.6F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(0, 10)
            .addBox(-3.3F, 7.0F, -3.6F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-3.7F, 2.0F, -3.5F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(27, 27)
            .addBox(-4.0F, 1.0F, -3.0F, 8.0F, 11.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 45)
            .addBox(-3.0F, 12.0F, -3.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(40, 44)
            .addBox(-3.0F, 12.0F, 2.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition cube_r5 = Body.addOrReplaceChild(
         "cube_r5",
         CubeListBuilder.create().texOffs(19, 28).addBox(-1.0F, 7.0F, -1.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-4.1F, 0.0F, -2.1F, 0.0F, 0.829F, 0.0F)
      );
      PartDefinition cube_r6 = Body.addOrReplaceChild(
         "cube_r6",
         CubeListBuilder.create().texOffs(46, 36).addBox(-1.0F, 7.0F, 0.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(4.6F, 0.0F, -2.7F, 0.0F, -0.7505F, 0.0F)
      );
      PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(), PartPose.offset(-5.0F, 2.0F, 0.0F));
      PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(), PartPose.offset(5.0F, 2.0F, 0.0F));
      PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(), PartPose.offset(-1.9F, 12.0F, 0.0F));
      PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(), PartPose.offset(1.9F, 12.0F, 0.0F));
      return LayerDefinition.create(meshdefinition, 64, 64);
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
      this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
      this.Head.yRot = netHeadYaw / (180.0F / (float)Math.PI);
      this.Head.xRot = headPitch / (180.0F / (float)Math.PI);
      this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
   }
}

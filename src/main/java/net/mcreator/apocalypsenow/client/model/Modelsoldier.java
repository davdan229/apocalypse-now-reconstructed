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

public class Modelsoldier<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("apocalypsenow", "modelsoldier"), "main");
   public final ModelPart Head;
   public final ModelPart Body;
   public final ModelPart RightArm;
   public final ModelPart LeftArm;
   public final ModelPart RightLeg;
   public final ModelPart LeftLeg;

   public Modelsoldier(ModelPart root) {
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
            .texOffs(35, 18)
            .addBox(4.02F, -6.4F, -4.0F, 0.0F, 2.0F, 8.0F, new CubeDeformation(0.0F))
            .texOffs(35, 16)
            .addBox(4.02F, -3.0F, -4.0F, 0.0F, 2.0F, 8.0F, new CubeDeformation(0.0F))
            .texOffs(35, 20)
            .addBox(-4.02F, -6.4F, -4.0F, 0.0F, 2.0F, 8.0F, new CubeDeformation(0.0F))
            .texOffs(0, 29)
            .addBox(-4.02F, -3.0F, -4.0F, 0.0F, 2.0F, 8.0F, new CubeDeformation(0.0F))
            .texOffs(38, 2)
            .addBox(-4.02F, -3.0F, 4.02F, 8.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(38, 0)
            .addBox(-4.02F, -6.4F, 4.02F, 8.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(10, 27)
            .addBox(0.58F, -8.02F, -3.98F, 2.0F, 0.0F, 8.0F, new CubeDeformation(0.0F))
            .texOffs(51, 11)
            .addBox(0.58F, -8.02F, 4.003F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 16)
            .addBox(-2.62F, -8.02F, -3.98F, 2.0F, 0.0F, 8.0F, new CubeDeformation(0.0F))
            .texOffs(51, 24)
            .addBox(-2.62F, -8.02F, 4.003F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(35, 15)
            .addBox(-4.0F, -8.0F, -5.0F, 8.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(46, 6)
            .addBox(-1.5F, -3.0F, -7.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(0, 50)
            .addBox(-2.8F, -2.0F, -6.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(49, 47)
            .addBox(-1.0F, -2.5F, -7.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition cube_r1 = Head.addOrReplaceChild(
         "cube_r1",
         CubeListBuilder.create().texOffs(0, 21).addBox(-1.0F, -2.0F, -2.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(3.3F, -0.6F, -5.7F, -0.0357F, 0.0522F, 0.3011F)
      );
      PartDefinition cube_r2 = Head.addOrReplaceChild(
         "cube_r2",
         CubeListBuilder.create().texOffs(49, 50).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(1.6F, -1.0F, -5.7F, -0.0357F, 0.0522F, 0.3011F)
      );
      PartDefinition Head_r1 = Head.addOrReplaceChild(
         "Head_r1",
         CubeListBuilder.create()
            .texOffs(13, 2)
            .addBox(7.98F, -3.02F, -3.98F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(13, 0)
            .addBox(11.18F, -3.02F, -3.98F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-10.6F, -6.1F, 0.5F, 0.2618F, 0.0F, 0.0F)
      );
      PartDefinition Head_r2 = Head.addOrReplaceChild(
         "Head_r2",
         CubeListBuilder.create()
            .texOffs(22, 25)
            .addBox(4.98F, -5.0F, -4.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(22, 27)
            .addBox(4.98F, -8.4F, -4.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-9.9F, 2.0F, -1.6F, 0.0F, -0.2793F, 0.0F)
      );
      PartDefinition Head_r3 = Head.addOrReplaceChild(
         "Head_r3",
         CubeListBuilder.create()
            .texOffs(0, 0)
            .addBox(5.02F, -5.0F, -4.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(10, 22)
            .addBox(5.02F, -8.4F, -4.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.2F, 2.0F, 0.8F, 0.0F, 0.2793F, 0.0F)
      );
      PartDefinition Body = partdefinition.addOrReplaceChild(
         "Body",
         CubeListBuilder.create()
            .texOffs(0, 27)
            .addBox(-4.0F, 1.0F, -3.0F, 8.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(9, 49)
            .addBox(1.1F, 5.3F, -3.7F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 47)
            .addBox(-0.9F, 8.7F, 3.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 16)
            .addBox(-1.0F, 5.3F, -3.6F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(25, 40)
            .addBox(0.4F, 2.1F, -3.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(5, 51)
            .addBox(2.0F, 2.1F, -3.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(47, 38)
            .addBox(0.2F, 2.0F, -3.7F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(43, 47)
            .addBox(-3.1F, 5.3F, -3.7F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(35, 31)
            .addBox(-4.3F, 0.9F, -2.4F, 1.0F, 9.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(13, 35)
            .addBox(3.3F, 0.9F, -2.4F, 1.0F, 9.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(42, 34)
            .addBox(-3.0F, 10.0F, -3.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(47, 36)
            .addBox(-2.0F, 11.0F, -3.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(38, 4)
            .addBox(-3.0F, 11.0F, 2.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(27, 47)
            .addBox(-2.0F, 12.0F, 2.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(20, 0)
            .addBox(-4.0F, 1.0F, 2.0F, 8.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(42, 40)
            .addBox(1.99F, -0.3F, -2.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(25, 40)
            .addBox(-3.99F, -0.3F, -2.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition Body_r1 = Body.addOrReplaceChild(
         "Body_r1",
         CubeListBuilder.create().texOffs(15, 49).addBox(2.0F, 6.0F, -2.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-3.9F, -0.7F, -6.1F, 0.0F, -2.0944F, 0.0F)
      );
      PartDefinition Body_r2 = Body.addOrReplaceChild(
         "Body_r2",
         CubeListBuilder.create().texOffs(29, 49).addBox(2.0F, 6.0F, -2.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(6.8F, -0.7F, -0.5F, 0.0F, 2.0944F, 0.0F)
      );
      PartDefinition RightArm = partdefinition.addOrReplaceChild(
         "RightArm",
         CubeListBuilder.create()
            .texOffs(15, 11)
            .addBox(-3.6F, -2.1F, -2.49F, 5.0F, 11.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(23, 47)
            .addBox(-4.4F, 1.0F, -1.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-5.0F, 2.0F, 0.0F)
      );
      PartDefinition LeftArm = partdefinition.addOrReplaceChild(
         "LeftArm",
         CubeListBuilder.create()
            .texOffs(0, 0)
            .addBox(-1.7F, -2.1F, -2.49F, 5.0F, 11.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(37, 45)
            .addBox(3.1F, 1.0F, -1.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(5.0F, 2.0F, 0.0F)
      );
      PartDefinition RightLeg = partdefinition.addOrReplaceChild(
         "RightLeg",
         CubeListBuilder.create()
            .texOffs(20, 36)
            .addBox(-2.11F, 10.0F, -4.2F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(22, 27)
            .addBox(-2.1F, 8.001F, -2.8F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-1.9F, 12.0F, 0.0F)
      );
      PartDefinition cube_r3 = RightLeg.addOrReplaceChild(
         "cube_r3",
         CubeListBuilder.create().texOffs(0, 39).addBox(1.98F, -2.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-4.1F, 10.8F, -3.0F, -0.6109F, 0.0F, 0.0F)
      );
      PartDefinition LeftLeg = partdefinition.addOrReplaceChild(
         "LeftLeg",
         CubeListBuilder.create()
            .texOffs(33, 6)
            .addBox(-1.9F, 8.001F, -2.8F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(0, 43)
            .addBox(-1.91F, 10.0F, -4.2F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(1.9F, 12.0F, 0.0F)
      );
      PartDefinition cube_r4 = LeftLeg.addOrReplaceChild(
         "cube_r4",
         CubeListBuilder.create().texOffs(42, 30).addBox(1.98F, -2.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-3.9F, 10.8F, -3.0F, -0.6109F, 0.0F, 0.0F)
      );
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
      this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
      this.Head.yRot = netHeadYaw / (180.0F / (float)Math.PI);
      this.Head.xRot = headPitch / (180.0F / (float)Math.PI);
      this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
      this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
   }
}

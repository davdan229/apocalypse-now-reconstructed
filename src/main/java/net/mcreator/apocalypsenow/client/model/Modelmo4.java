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

public class Modelmo4<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("apocalypsenow", "modelmo_4"), "main");
   public final ModelPart Head;
   public final ModelPart Body;
   public final ModelPart RightArm;
   public final ModelPart LeftArm;
   public final ModelPart RightLeg;
   public final ModelPart LeftLeg;

   public Modelmo4(ModelPart root) {
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
            .texOffs(0, 0)
            .addBox(-4.0F, -3.0F, -4.6F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 11)
            .addBox(-4.0F, -7.0F, -4.8F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 4)
            .addBox(-4.0F, -4.0F, -4.8F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 9)
            .addBox(-4.0F, -8.0F, -4.6F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(6, 18)
            .addBox(-3.0F, -6.0F, -4.5F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(18, 5)
            .addBox(1.0F, -6.0F, -4.4F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 13)
            .addBox(-2.0F, -3.7F, -5.6F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(19, 19)
            .addBox(3.0F, -6.0F, -4.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(18, 9)
            .addBox(-1.0F, -6.0F, -4.8F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(8, 20)
            .addBox(-4.0F, -6.0F, -4.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition Head_r1 = Head.addOrReplaceChild(
         "Head_r1",
         CubeListBuilder.create()
            .texOffs(18, 16)
            .addBox(-1.8F, -10.0F, -5.3F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 19)
            .addBox(-1.8F, -6.0F, -5.3F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 4.0F, 0.0F, 0.0F, -1.0472F, 0.0F)
      );
      PartDefinition Head_r2 = Head.addOrReplaceChild(
         "Head_r2",
         CubeListBuilder.create()
            .texOffs(18, 12)
            .addBox(1.6F, -6.0F, -5.2F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(18, 15)
            .addBox(1.6F, -10.0F, -5.2F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 4.0F, 0.0F, 0.0F, 1.2217F, 0.0F)
      );
      PartDefinition Head_r3 = Head.addOrReplaceChild(
         "Head_r3",
         CubeListBuilder.create()
            .texOffs(18, 0)
            .addBox(-4.3F, -12.2F, -0.3F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-4.2F, -10.0F, -3.5F, 0.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
            .texOffs(0, 1)
            .addBox(-4.2F, -6.0F, -3.5F, 0.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
            .texOffs(14, 7)
            .addBox(-3.5F, -6.0F, 4.2F, 7.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(16, 0)
            .addBox(-4.3F, -12.2F, -0.4F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 6)
            .addBox(-3.5F, -12.1F, -0.4F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(9, 13)
            .addBox(-3.5F, -10.0F, 4.2F, 7.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(11, 20)
            .addBox(-4.4F, -6.1F, 4.3F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(10, 14)
            .addBox(-4.4F, -6.1F, 3.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(20, 12)
            .addBox(-4.4F, -10.0F, 4.3F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(10, 15)
            .addBox(-4.4F, -10.0F, 3.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(13, 20)
            .addBox(-4.5F, -10.0F, -4.3F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 17)
            .addBox(-4.5F, -10.0F, -4.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(17, 8)
            .addBox(-4.5F, -6.0F, -4.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(15, 20)
            .addBox(-4.5F, -6.0F, -4.3F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(14, 8)
            .addBox(-3.7F, -6.0F, -4.3F, 7.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(10, 14)
            .addBox(-3.7F, -10.0F, -4.3F, 7.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 4.0F, 0.0F, 0.0F, 1.5708F, 0.0F)
      );
      PartDefinition Head_r4 = Head.addOrReplaceChild(
         "Head_r4",
         CubeListBuilder.create().texOffs(0, 18).addBox(-1.0F, -4.5F, -5.6F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4363F, 0.0F, 0.0F)
      );
      PartDefinition Head_r5 = Head.addOrReplaceChild(
         "Head_r5",
         CubeListBuilder.create()
            .texOffs(10, 15)
            .addBox(-4.4F, -3.0F, -7.4F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(17, 1)
            .addBox(-3.4F, -2.0F, -5.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.3054F)
      );
      PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
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
      this.Head.yRot = netHeadYaw / (180.0F / (float)Math.PI);
      this.Head.xRot = headPitch / (180.0F / (float)Math.PI);
   }
}

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

public class Modelgranadavisao<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("apocalypsenow", "modelgranadavisao"), "main");
   public final ModelPart Head;
   public final ModelPart Body;
   public final ModelPart RightArm;
   public final ModelPart LeftArm;
   public final ModelPart RightLeg;
   public final ModelPart LeftLeg;

   public Modelgranadavisao(ModelPart root) {
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
            .texOffs(10, 16)
            .addBox(-5.0F, -8.0F, -4.0F, 1.0F, 7.0F, 8.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-4.0F, -9.0F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
            .texOffs(28, 22)
            .addBox(-4.0F, -8.0F, -5.0F, 8.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(24, 0)
            .addBox(-4.3F, -6.3F, -6.3F, 8.5F, 2.7F, 1.3F, new CubeDeformation(0.0F))
            .texOffs(11, 31)
            .addBox(0.2F, -5.8F, -8.7F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(6, 24)
            .addBox(0.5F, -5.3F, -7.2F, 1.2F, 1.2F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(4, 5)
            .addBox(-2.0F, -5.3F, -7.2F, 1.2F, 1.2F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(24, 4)
            .addBox(-2.3F, -7.3F, -6.2F, 4.5F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 9)
            .addBox(4.0F, -8.0F, -4.0F, 1.0F, 7.0F, 8.0F, new CubeDeformation(0.0F))
            .texOffs(20, 13)
            .addBox(-4.0F, -8.0F, 4.0F, 8.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition Head_r1 = Head.addOrReplaceChild(
         "Head_r1",
         CubeListBuilder.create()
            .texOffs(20, 22)
            .addBox(-0.4F, -6.0F, -7.2F, 1.2F, 1.2F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(11, 31)
            .addBox(-0.5F, -6.5F, -8.7F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.7F, 0.0F, 0.0F, -0.3927F, 0.0F)
      );
      PartDefinition Head_r2 = Head.addOrReplaceChild(
         "Head_r2",
         CubeListBuilder.create().texOffs(4, 14).addBox(-1.0F, -6.0F, -7.4F, 1.2F, 1.2F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.7F, 0.0F, 0.0F, 0.3927F, 0.0F)
      );
      PartDefinition Head_r3 = Head.addOrReplaceChild(
         "Head_r3",
         CubeListBuilder.create().texOffs(11, 31).addBox(-1.3F, -6.5F, -8.7F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.7F, 0.0F, 0.0F, 0.1047F, 0.0F)
      );
      PartDefinition Head_r4 = Head.addOrReplaceChild(
         "Head_r4",
         CubeListBuilder.create().texOffs(11, 31).addBox(-2.4F, -6.5F, -8.7F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.7F, 0.0F, 0.0F, 0.2618F, 0.0F)
      );
      PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
      PartDefinition Body_r1 = Body.addOrReplaceChild(
         "Body_r1",
         CubeListBuilder.create()
            .texOffs(0, 0)
            .addBox(-2.0F, 2.7F, -4.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(0, 9)
            .addBox(1.0F, 2.7F, -4.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(10, 13)
            .addBox(-2.0F, 3.7F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
            .texOffs(5, 28)
            .addBox(9.0F, 3.7F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
            .texOffs(10, 9)
            .addBox(-2.0F, 3.7F, 1.5F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(10, 11)
            .addBox(-2.0F, 3.7F, -2.5F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 24)
            .addBox(4.0F, 2.7F, -4.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(15, 13)
            .addBox(-0.4F, 2.3F, -3.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(17, 31)
            .addBox(2.6F, 2.3F, -3.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(21, 31)
            .addBox(5.6F, 2.3F, -3.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(25, 31)
            .addBox(8.6F, 2.3F, -3.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(28, 27)
            .addBox(7.0F, 2.7F, -4.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.7854F)
      );
      PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(), PartPose.offset(-5.0F, 2.0F, 0.0F));
      PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(), PartPose.offset(5.0F, 2.0F, 0.0F));
      PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(), PartPose.offset(-2.0F, 12.0F, 0.0F));
      PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(), PartPose.offset(2.0F, 36.0F, 0.0F));
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

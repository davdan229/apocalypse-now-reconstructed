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

public class Modeldrop<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("apocalypsenow", "modeldrop"), "main");
   public final ModelPart Crate;
   public final ModelPart Ropes;
   public final ModelPart Parachute;

   public Modeldrop(ModelPart root) {
      this.Crate = root.getChild("Crate");
      this.Ropes = root.getChild("Ropes");
      this.Parachute = root.getChild("Parachute");
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.getRoot();
      PartDefinition Crate = partdefinition.addOrReplaceChild(
         "Crate",
         CubeListBuilder.create().texOffs(0, 0).addBox(-16.0F, 12.0F, 0.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)),
         PartPose.offset(8.0F, -4.0F, -8.0F)
      );
      PartDefinition Ropes = partdefinition.addOrReplaceChild("Ropes", CubeListBuilder.create(), PartPose.offset(8.0F, 24.0F, -8.0F));
      PartDefinition cube_r1 = Ropes.addOrReplaceChild(
         "cube_r1",
         CubeListBuilder.create()
            .texOffs(48, 0)
            .addBox(-1.0F, -11.0F, 0.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
            .texOffs(52, 73)
            .addBox(-1.0F, -20.0F, -1.0F, 1.0F, 20.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-15.0F, -15.5F, 3.0F, 0.0F, 0.0F, -0.3927F)
      );
      PartDefinition cube_r2 = Ropes.addOrReplaceChild(
         "cube_r2",
         CubeListBuilder.create()
            .texOffs(48, 73)
            .addBox(0.0F, -20.0F, 0.0F, 1.0F, 20.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(60, 1)
            .addBox(0.0F, -11.0F, 1.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-1.0F, -15.5F, 2.0F, 0.0F, 0.0F, 0.3927F)
      );
      PartDefinition cube_r3 = Ropes.addOrReplaceChild(
         "cube_r3",
         CubeListBuilder.create().texOffs(56, 74).addBox(0.0F, -20.0F, 0.0F, 1.0F, 20.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-16.0F, -15.5F, 13.0F, 0.0F, 0.0F, -0.3927F)
      );
      PartDefinition cube_r4 = Ropes.addOrReplaceChild(
         "cube_r4",
         CubeListBuilder.create().texOffs(60, 74).addBox(-1.0F, -20.0F, 0.0F, 1.0F, 20.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, -15.5F, 13.0F, 0.0F, 0.0F, 0.3927F)
      );
      PartDefinition Parachute = partdefinition.addOrReplaceChild(
         "Parachute",
         CubeListBuilder.create().texOffs(73, 13).addBox(-1.0F, -32.4F, -10.5F, 2.0F, 1.0F, 20.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 16.0F, 0.0F)
      );
      PartDefinition cube_r5 = Parachute.addOrReplaceChild(
         "cube_r5",
         CubeListBuilder.create().texOffs(0, 32).addBox(-3.0F, -2.0F, -4.0F, 5.0F, 1.0F, 19.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(7.9F, -28.4F, -6.0F, 0.0F, 0.0F, 0.2618F)
      );
      PartDefinition cube_r6 = Parachute.addOrReplaceChild(
         "cube_r6",
         CubeListBuilder.create().texOffs(45, 13).addBox(-3.0F, -2.0F, -4.0F, 5.0F, 1.0F, 19.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(12.3F, -26.4F, -6.0F, 0.0F, 0.0F, 0.3491F)
      );
      PartDefinition cube_r7 = Parachute.addOrReplaceChild(
         "cube_r7",
         CubeListBuilder.create().texOffs(29, 53).addBox(-3.0F, -2.0F, -4.0F, 5.0F, 1.0F, 19.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(16.5F, -23.8F, -6.0F, 0.0F, 0.0F, 0.4363F)
      );
      PartDefinition cube_r8 = Parachute.addOrReplaceChild(
         "cube_r8",
         CubeListBuilder.create().texOffs(58, 54).addBox(-3.0F, -2.0F, -4.0F, 5.0F, 1.0F, 19.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(3.3F, -29.6F, -6.0F, 0.0F, 0.0F, 0.1745F)
      );
      PartDefinition cube_r9 = Parachute.addOrReplaceChild(
         "cube_r9",
         CubeListBuilder.create().texOffs(29, 33).addBox(-2.0F, -2.0F, -4.0F, 5.0F, 1.0F, 19.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-3.3F, -29.6F, -6.0F, 0.0F, 0.0F, -0.1745F)
      );
      PartDefinition cube_r10 = Parachute.addOrReplaceChild(
         "cube_r10",
         CubeListBuilder.create().texOffs(0, 52).addBox(-2.0F, -2.0F, -4.0F, 5.0F, 1.0F, 19.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-7.9F, -28.4F, -6.0F, 0.0F, 0.0F, -0.2618F)
      );
      PartDefinition cube_r11 = Parachute.addOrReplaceChild(
         "cube_r11",
         CubeListBuilder.create().texOffs(58, 34).addBox(-2.0F, -2.0F, -4.0F, 5.0F, 1.0F, 19.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-12.3F, -26.4F, -6.0F, 0.0F, 0.0F, -0.3491F)
      );
      PartDefinition cube_r12 = Parachute.addOrReplaceChild(
         "cube_r12",
         CubeListBuilder.create().texOffs(0, 72).addBox(-2.0F, -2.0F, -4.0F, 5.0F, 1.0F, 19.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-16.5F, -23.8F, -6.0F, 0.0F, 0.0F, -0.4363F)
      );
      return LayerDefinition.create(meshdefinition, 128, 128);
   }

   @Override
   public void renderToBuffer(
      PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha
   ) {
      this.Crate.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
      this.Ropes.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
      this.Parachute.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
   }

   @Override
   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
   }
}

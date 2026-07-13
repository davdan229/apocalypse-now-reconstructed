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

public class Modelavanca<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("apocalypsenow", "modelavanca"), "main");
   public final ModelPart Head;
   public final ModelPart Body;
   public final ModelPart RightArm;
   public final ModelPart LeftArm;
   public final ModelPart RightLeg;
   public final ModelPart LeftLeg;

   public Modelavanca(ModelPart root) {
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
            .addBox(-4.5F, -8.5F, -2.2F, 9.0F, 9.0F, 7.0F, new CubeDeformation(0.0F))
            .texOffs(34, 29)
            .addBox(-3.2F, -8.6F, -4.2F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F))
            .texOffs(1, 0)
            .addBox(-3.2F, -8.7F, 4.1F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 37)
            .addBox(-3.2F, -8.7F, 5.1F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-3.2F, -8.6F, 5.0F, 1.0F, 7.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(2.2F, -8.6F, 5.0F, 1.0F, 7.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(1, 0)
            .addBox(2.2F, -8.7F, 4.1F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(34, 29)
            .addBox(2.2F, -8.6F, -4.2F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F))
            .texOffs(0, 37)
            .addBox(2.2F, -8.7F, 5.1F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(43, 36)
            .addBox(-4.5F, -8.5F, -4.2F, 9.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(43, 11)
            .addBox(-4.5F, -0.5F, -4.2F, 9.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(28, 49)
            .addBox(-4.5F, -7.5F, -4.2F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(22, 49)
            .addBox(3.5F, -7.5F, -4.2F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(0, 35)
            .addBox(4.6F, -6.5F, -4.2F, 0.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
            .texOffs(0, 34)
            .addBox(4.6F, -2.5F, -4.2F, 0.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
            .texOffs(25, 1)
            .addBox(4.7F, -2.5F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(4, 37)
            .addBox(3.7F, -2.5F, 5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(2, 37)
            .addBox(3.7F, -6.5F, 5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(23, 19)
            .addBox(4.7F, -6.5F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(2, 38)
            .addBox(-4.7F, -6.5F, 5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(2, 19)
            .addBox(-4.7F, -6.5F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 19)
            .addBox(-4.7F, -2.5F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 38)
            .addBox(-4.7F, -2.5F, 5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(32, 0)
            .addBox(-4.6F, -2.5F, -4.2F, 0.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
            .texOffs(32, 1)
            .addBox(-4.6F, -6.5F, -4.2F, 0.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
            .texOffs(45, 29)
            .addBox(-4.5F, -2.5F, 4.9F, 9.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(45, 30)
            .addBox(-4.5F, -6.5F, 4.9F, 9.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(108, 105)
            .addBox(-4.6F, -8.605F, -4.7F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(94, 109)
            .addBox(-4.6F, -1.405F, -4.7F, 9.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(91, 50)
            .addBox(-4.4F, -8.505F, -4.4F, 9.0F, 7.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 59)
            .addBox(-4.0F, -7.105F, -4.3F, 8.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition cube_r1 = Head.addOrReplaceChild(
         "cube_r1",
         CubeListBuilder.create().texOffs(69, 118).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.8F, 0.7F, -7.3F, 0.3665F, 0.0F, 0.0F)
      );
      PartDefinition cube_r2 = Head.addOrReplaceChild(
         "cube_r2",
         CubeListBuilder.create().texOffs(93, 123).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.5F, -7.2F, -0.1396F, 0.0F, 0.0F)
      );
      PartDefinition cube_r3 = Head.addOrReplaceChild(
         "cube_r3",
         CubeListBuilder.create().texOffs(80, 116).addBox(-2.0F, -3.0F, 0.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-0.1F, 0.7F, -6.5F, -0.1396F, 0.0F, 0.0F)
      );
      PartDefinition cube_r4 = Head.addOrReplaceChild(
         "cube_r4",
         CubeListBuilder.create().texOffs(50, 49).addBox(-3.0F, -6.005F, 0.0F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-2.2F, -2.5F, -5.5F, 0.0F, 0.4363F, 0.0F)
      );
      PartDefinition cube_r5 = Head.addOrReplaceChild(
         "cube_r5",
         CubeListBuilder.create().texOffs(50, 16).addBox(-3.0F, -6.005F, 0.0F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(6.8F, -2.5F, -3.6F, 0.0F, -0.4363F, 0.0F)
      );
      PartDefinition Body = partdefinition.addOrReplaceChild(
         "Body",
         CubeListBuilder.create()
            .texOffs(0, 16)
            .addBox(-4.5F, -0.009F, -2.5F, 9.0F, 13.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(20, 49)
            .addBox(2.5F, -0.009F, -2.6F, 1.0F, 13.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(45, 35)
            .addBox(-2.5F, 0.991F, -2.6F, 5.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(45, 35)
            .addBox(-2.5F, 10.991F, -2.6F, 5.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(21, 36)
            .addBox(1.5F, 6.991F, 2.6F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(36, 2)
            .addBox(-2.5F, 6.991F, 2.6F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(36, 0)
            .addBox(-1.5F, 5.991F, 2.6F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(36, 1)
            .addBox(0.5F, 5.991F, 2.6F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(34, 2)
            .addBox(-0.5F, 4.991F, 2.6F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(4, 0)
            .addBox(-0.5F, 3.991F, 2.6F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(25, 6)
            .addBox(0.5F, 2.991F, 2.6F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(25, 20)
            .addBox(1.5F, 1.991F, 2.6F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(27, 6)
            .addBox(-1.5F, 2.991F, 2.6F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(29, 6)
            .addBox(-2.5F, 1.991F, 2.6F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(48, 16)
            .addBox(-3.5F, -0.009F, -2.6F, 1.0F, 13.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(36, 47)
            .addBox(-3.5F, -0.009F, 2.6F, 1.0F, 13.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(38, 47)
            .addBox(2.5F, -0.009F, 2.6F, 1.0F, 13.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition cube_r6 = Body.addOrReplaceChild(
         "cube_r6",
         CubeListBuilder.create().texOffs(16, 34).addBox(-1.0F, -2.0F, -1.0F, 3.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.8F, 3.8F, -1.7F, 0.0F, 0.0F, 0.2094F)
      );
      PartDefinition RightArm = partdefinition.addOrReplaceChild(
         "RightArm",
         CubeListBuilder.create()
            .texOffs(2, 0)
            .addBox(1.6F, 4.6F, -2.705F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(2, 2)
            .addBox(1.6F, 4.6F, 1.695F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 18)
            .addBox(0.6F, 4.6F, 2.695F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(2, 18)
            .addBox(-3.8F, 4.6F, 2.695F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(4, 0)
            .addBox(-3.8F, 4.6F, 1.695F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(2, 4)
            .addBox(-3.8F, 4.6F, -2.705F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(16, 42)
            .addBox(1.5F, 4.6F, -2.505F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(26, 42)
            .addBox(-3.7F, 4.6F, -2.505F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(23, 16)
            .addBox(-3.8F, 4.6F, -2.705F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(50, 9)
            .addBox(-3.6F, 4.6F, -2.605F, 5.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 51)
            .addBox(-3.6F, 4.6F, 2.595F, 5.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(28, 11)
            .addBox(-3.6F, -2.4F, -2.505F, 5.0F, 13.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(23, 18)
            .addBox(0.6F, 4.6F, -2.705F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(50, 9)
            .addBox(-3.6F, -1.9F, -2.605F, 5.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(23, 16)
            .addBox(-3.8F, -1.9F, -2.705F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(2, 4)
            .addBox(-3.8F, -1.9F, -2.705F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(26, 42)
            .addBox(-3.7F, -1.9F, -2.505F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(4, 0)
            .addBox(-3.8F, -1.9F, 1.695F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(2, 18)
            .addBox(-3.8F, -1.9F, 2.695F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 51)
            .addBox(-3.6F, -1.9F, 2.595F, 5.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(0, 18)
            .addBox(0.6F, -1.9F, 2.695F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(2, 2)
            .addBox(1.6F, -1.9F, 1.695F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(16, 42)
            .addBox(1.5F, -1.9F, -2.505F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(23, 18)
            .addBox(0.6F, -1.9F, -2.705F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(2, 0)
            .addBox(1.6F, -1.9F, -2.705F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-5.0F, 2.0F, 0.0F)
      );
      PartDefinition LeftArm = partdefinition.addOrReplaceChild(
         "LeftArm",
         CubeListBuilder.create()
            .texOffs(34, 0)
            .addBox(2.6F, 4.6F, -2.705F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(2, 15)
            .addBox(3.6F, 4.6F, -2.705F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 15)
            .addBox(3.6F, 4.6F, 1.695F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(25, 18)
            .addBox(2.6F, 4.6F, 2.695F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(25, 16)
            .addBox(-1.8F, 4.6F, 2.695F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(4, 4)
            .addBox(-1.8F, 4.6F, 1.695F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(4, 2)
            .addBox(-1.8F, 4.6F, -2.705F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(10, 44)
            .addBox(3.5F, 4.6F, -2.505F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(0, 44)
            .addBox(-1.7F, 4.6F, -2.505F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(25, 0)
            .addBox(-1.8F, 4.6F, -2.705F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(50, 26)
            .addBox(-1.6F, 4.6F, -2.605F, 5.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(10, 51)
            .addBox(-1.6F, 4.6F, 2.595F, 5.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(50, 26)
            .addBox(-1.6F, -1.9F, -2.605F, 5.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(34, 0)
            .addBox(2.6F, -1.9F, -2.705F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(2, 15)
            .addBox(3.6F, -1.9F, -2.705F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(10, 44)
            .addBox(3.5F, -1.9F, -2.505F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(0, 15)
            .addBox(3.6F, -1.9F, 1.695F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(25, 18)
            .addBox(2.6F, -1.9F, 2.695F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(10, 51)
            .addBox(-1.6F, -1.9F, 2.595F, 5.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(25, 16)
            .addBox(-1.8F, -1.9F, 2.695F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(4, 4)
            .addBox(-1.8F, -1.9F, 1.695F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 44)
            .addBox(-1.7F, -1.9F, -2.505F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(25, 0)
            .addBox(-1.8F, -1.9F, -2.705F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(4, 2)
            .addBox(-1.8F, -1.9F, -2.705F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(23, 29)
            .addBox(-1.6F, -2.4F, -2.505F, 5.0F, 13.0F, 5.0F, new CubeDeformation(0.0F)),
         PartPose.offset(5.0F, 2.0F, 0.0F)
      );
      PartDefinition RightLeg = partdefinition.addOrReplaceChild(
         "RightLeg",
         CubeListBuilder.create()
            .texOffs(0, 118)
            .addBox(-2.71F, 8.0F, -3.4F, 5.0F, 4.0F, 6.0F, new CubeDeformation(0.0F))
            .texOffs(41, 45)
            .addBox(-2.71F, 10.0F, -5.4F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-1.9F, 12.0F, 0.0F)
      );
      PartDefinition cube_r7 = RightLeg.addOrReplaceChild(
         "cube_r7",
         CubeListBuilder.create().texOffs(48, 0).addBox(-4.1F, -1.0F, 2.0F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(1.4F, 8.3F, -5.5F, -0.7854F, 0.0F, 0.0F)
      );
      PartDefinition LeftLeg = partdefinition.addOrReplaceChild(
         "LeftLeg",
         CubeListBuilder.create()
            .texOffs(0, 118)
            .addBox(-2.51F, 8.0F, -3.4F, 5.0F, 4.0F, 6.0F, new CubeDeformation(0.0F))
            .texOffs(45, 31)
            .addBox(-2.51F, 10.0F, -5.4F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(1.9F, 12.0F, 0.0F)
      );
      PartDefinition cube_r8 = LeftLeg.addOrReplaceChild(
         "cube_r8",
         CubeListBuilder.create().texOffs(48, 3).addBox(-4.1F, -1.0F, 2.0F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(1.6F, 8.3F, -5.5F, -0.7854F, 0.0F, 0.0F)
      );
      return LayerDefinition.create(meshdefinition, 128, 128);
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

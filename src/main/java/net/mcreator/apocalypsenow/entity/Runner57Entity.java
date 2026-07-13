package net.mcreator.apocalypsenow.entity;

import net.mcreator.apocalypsenow.init.ApocalypsenowModEntities;
import net.mcreator.apocalypsenow.procedures.SantaclauswalkerProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.SpawnPlacements.Type;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.OpenDoorGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ambient.AmbientCreature;
import net.minecraft.world.entity.animal.IronGolem;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.Heightmap.Types;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages.SpawnEntity;
import net.minecraftforge.registries.ForgeRegistries;

public class Runner57Entity extends Monster {
   public Runner57Entity(SpawnEntity packet, Level world) {
      this(ApocalypsenowModEntities.RUNNER_57.get(), world);
   }

   public Runner57Entity(EntityType<Runner57Entity> type, Level world) {
      super(type, world);
      this.setMaxUpStep(0.6F);
      this.xpReward = 3;
      this.setNoAi(false);
   }

   @Override
   public Packet<ClientGamePacketListener> getAddEntityPacket() {
      return NetworkHooks.getEntitySpawningPacket(this);
   }

   @Override
   protected void registerGoals() {
      super.registerGoals();
      this.targetSelector.addGoal(2, ApocalypsenowFactionTargeting.goal(this));
      this.getNavigation().getNodeEvaluator().setCanOpenDoors(true);
      this.goalSelector.addGoal(20, new MeleeAttackGoal(this, 1.2, false) {
         @Override
         protected double getAttackReachSqr(LivingEntity entity) {
            return super.getAttackReachSqr(entity);
         }
      });
      this.targetSelector.addGoal(1, new FactionHurtByTargetGoal(this));
      this.goalSelector.addGoal(22, new OpenDoorGoal(this, false));
      this.goalSelector.addGoal(23, new OpenDoorGoal(this, true));
      this.goalSelector.addGoal(24, new RandomStrollGoal(this, 0.8));
      this.goalSelector.addGoal(25, new FloatGoal(this));
      this.goalSelector.addGoal(26, new RandomLookAroundGoal(this));
   }

   @Override
   public MobType getMobType() {
      return MobType.UNDEFINED;
   }

   @Override
   public double getMyRidingOffset() {
      return -0.35;
   }

   @Override
   public SoundEvent getAmbientSound() {
      return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie.ambient"));
   }

   @Override
   public void playStepSound(BlockPos pos, BlockState blockIn) {
      this.playSound(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie.step")), 0.15F, 1.0F);
   }

   @Override
   public SoundEvent getHurtSound(DamageSource ds) {
      return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie_horse.hurt"));
   }

   @Override
   public SoundEvent getDeathSound() {
      return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie.death"));
   }

   public static void init() {
      SpawnPlacements.register(
         ApocalypsenowModEntities.RUNNER_57.get(), Type.ON_GROUND, Types.MOTION_BLOCKING_NO_LEAVES, (entityType, world, reason, pos, random) -> {
            int x = pos.getX();
            int y = pos.getY();
            int z = pos.getZ();
            return SantaclauswalkerProcedure.execute(world, x, y, z);
         }
      );
   }

   public static Builder createAttributes() {
      Builder builder = Mob.createMobAttributes();
      builder = builder.add(Attributes.MOVEMENT_SPEED, 0.4);
      builder = builder.add(Attributes.MAX_HEALTH, 20.0);
      builder = builder.add(Attributes.ARMOR, 10.0);
      builder = builder.add(Attributes.ATTACK_DAMAGE, 5.0);
      return builder.add(Attributes.FOLLOW_RANGE, 16.0);
   }
}

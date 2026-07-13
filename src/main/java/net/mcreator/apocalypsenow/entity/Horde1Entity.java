package net.mcreator.apocalypsenow.entity;

import javax.annotation.Nullable;
import net.mcreator.apocalypsenow.init.ApocalypsenowModEntities;
import net.mcreator.apocalypsenow.procedures.Horde1OnInitialEntitySpawnProcedure;
import net.mcreator.apocalypsenow.procedures.HordesgameruleProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.SpawnPlacements.Type;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ambient.AmbientCreature;
import net.minecraft.world.entity.animal.IronGolem;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.Heightmap.Types;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages.SpawnEntity;
import net.minecraftforge.registries.ForgeRegistries;

public class Horde1Entity extends Monster {
   public Horde1Entity(SpawnEntity packet, Level world) {
      this(ApocalypsenowModEntities.HORDE_1.get(), world);
   }

   public Horde1Entity(EntityType<Horde1Entity> type, Level world) {
      super(type, world);
      this.setMaxUpStep(0.6F);
      this.xpReward = 6;
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
      this.goalSelector.addGoal(20, new MeleeAttackGoal(this, 1.2, false) {
         @Override
         protected double getAttackReachSqr(LivingEntity entity) {
            return super.getAttackReachSqr(entity);
         }
      });
      this.targetSelector.addGoal(1, new FactionHurtByTargetGoal(this));
      this.goalSelector.addGoal(22, new RandomStrollGoal(this, 0.8));
      this.goalSelector.addGoal(23, new FloatGoal(this));
      this.goalSelector.addGoal(24, new RandomLookAroundGoal(this));
   }

   @Override
   public MobType getMobType() {
      return MobType.UNDEAD;
   }

   @Override
   public double getMyRidingOffset() {
      return -0.35;
   }

   @Override
   protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
      super.dropCustomDeathLoot(source, looting, recentlyHitIn);
      this.spawnAtLocation(new ItemStack(Items.ROTTEN_FLESH));
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
      return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie.hurt"));
   }

   @Override
   public SoundEvent getDeathSound() {
      return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie.death"));
   }

   @Override
   public SpawnGroupData finalizeSpawn(
      ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag
   ) {
      SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
      Horde1OnInitialEntitySpawnProcedure.execute(world, this.getX(), this.getY(), this.getZ());
      return retval;
   }

   public static void init() {
      SpawnPlacements.register(
         ApocalypsenowModEntities.HORDE_1.get(), Type.ON_GROUND, Types.MOTION_BLOCKING_NO_LEAVES, (entityType, world, reason, pos, random) -> {
            int x = pos.getX();
            int y = pos.getY();
            int z = pos.getZ();
            return HordesgameruleProcedure.execute(world, x, y, z);
         }
      );
   }

   public static Builder createAttributes() {
      Builder builder = Mob.createMobAttributes();
      builder = builder.add(Attributes.MOVEMENT_SPEED, 0.2);
      builder = builder.add(Attributes.MAX_HEALTH, 15.0);
      builder = builder.add(Attributes.ARMOR, 0.0);
      builder = builder.add(Attributes.ATTACK_DAMAGE, 3.0);
      return builder.add(Attributes.FOLLOW_RANGE, 30.0);
   }
}

package net.mcreator.apocalypsenow.entity;

import net.mcreator.apocalypsenow.init.ApocalypsenowModEntities;
import net.mcreator.apocalypsenow.init.ApocalypsenowModItems;
import net.mcreator.apocalypsenow.procedures.HumansEntitySpawningConditionProcedure;
import net.mcreator.apocalypsenow.procedures.MilitaryMedicOnEntityTickUpdateProcedure;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.SpawnPlacements.Type;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.OpenDoorGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.WaterAvoidingRandomStrollGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.monster.CaveSpider;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.entity.monster.Husk;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.Pillager;
import net.minecraft.world.entity.monster.Skeleton;
import net.minecraft.world.entity.monster.Slime;
import net.minecraft.world.entity.monster.Spider;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.levelgen.Heightmap.Types;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages.SpawnEntity;
import net.minecraftforge.registries.ForgeRegistries;

public class MilitaryMedicEntity extends HumanFactionMob {
   public MilitaryMedicEntity(SpawnEntity packet, Level world) {
      this(ApocalypsenowModEntities.MILITARY_MEDIC.get(), world);
   }

   public MilitaryMedicEntity(EntityType<MilitaryMedicEntity> type, Level world) {
      super(type, world);
      this.setMaxUpStep(0.6F);
      this.xpReward = 0;
      this.setNoAi(false);
      this.setPersistenceRequired();
      this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(ApocalypsenowModItems.MEDICALKIT.get()));
      this.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.US_ARMY_HELMET.get()));
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
      this.goalSelector.addGoal(1, new RandomStrollGoal(this, 0.8));
      this.goalSelector.addGoal(2, new WaterAvoidingRandomStrollGoal(this, 0.8));
      this.goalSelector.addGoal(3, new OpenDoorGoal(this, false));
      this.goalSelector.addGoal(4, new OpenDoorGoal(this, true));
      this.goalSelector.addGoal(5, new RandomLookAroundGoal(this));
      this.goalSelector.addGoal(6, new FloatGoal(this));
   }

   @Override
   public MobType getMobType() {
      return MobType.UNDEFINED;
   }

   @Override
   public boolean removeWhenFarAway(double distanceToClosestPlayer) {
      return false;
   }

   @Override
   public double getMyRidingOffset() {
      return -0.35;
   }

   @Override
   public SoundEvent getAmbientSound() {
      return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.ambient"));
   }

   @Override
   public SoundEvent getHurtSound(DamageSource ds) {
      return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
   }

   @Override
   public SoundEvent getDeathSound() {
      return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
   }

   @Override
   public void baseTick() {
      super.baseTick();
      if (!this.level().isClientSide() && this.tickCount % 20 == 0) {
         MilitaryMedicOnEntityTickUpdateProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ());
      }
   }

   public static void init() {
      SpawnPlacements.register(
         ApocalypsenowModEntities.MILITARY_MEDIC.get(), Type.ON_GROUND, Types.MOTION_BLOCKING_NO_LEAVES, (entityType, world, reason, pos, random) -> {
            int x = pos.getX();
            int y = pos.getY();
            int z = pos.getZ();
            return HumansEntitySpawningConditionProcedure.execute(world);
         }
      );
   }

   public static Builder createAttributes() {
      Builder builder = Mob.createMobAttributes();
      builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
      builder = builder.add(Attributes.MAX_HEALTH, 25.0);
      builder = builder.add(Attributes.ARMOR, 0.0);
      builder = builder.add(Attributes.ATTACK_DAMAGE, 3.0);
      return builder.add(Attributes.FOLLOW_RANGE, 16.0);
   }
}

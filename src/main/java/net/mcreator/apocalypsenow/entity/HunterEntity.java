package net.mcreator.apocalypsenow.entity;

import net.mcreator.apocalypsenow.init.ApocalypsenowModEntities;
import net.mcreator.apocalypsenow.init.ApocalypsenowModItems;
import net.mcreator.apocalypsenow.procedures.HumansEntitySpawningConditionProcedure;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
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
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.levelgen.Heightmap.Types;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages.SpawnEntity;
import net.minecraftforge.registries.ForgeRegistries;

public class HunterEntity extends Monster {
   public HunterEntity(SpawnEntity packet, Level world) {
      this(ApocalypsenowModEntities.HUNTER.get(), world);
   }

   public HunterEntity(EntityType<HunterEntity> type, Level world) {
      super(type, world);
      this.setMaxUpStep(0.6F);
      this.xpReward = 0;
      this.setNoAi(false);
      this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(ApocalypsenowModItems.HUNTING_KNIFE.get()));
      this.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ApocalypsenowModItems.HUNTING_HELMET.get()));
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
      this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.2, true) {
         @Override
         protected double getAttackReachSqr(LivingEntity entity) {
            return super.getAttackReachSqr(entity);
         }
      });
      this.goalSelector.addGoal(2, new RandomStrollGoal(this, 1.0));
      this.targetSelector.addGoal(1, new FactionHurtByTargetGoal(this));
      this.goalSelector.addGoal(6, new OpenDoorGoal(this, false));
      this.goalSelector.addGoal(7, new OpenDoorGoal(this, true));
      this.goalSelector.addGoal(8, new RandomLookAroundGoal(this));
      this.goalSelector.addGoal(9, new FloatGoal(this));
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
   protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
      super.dropCustomDeathLoot(source, looting, recentlyHitIn);
      this.spawnAtLocation(new ItemStack(Items.LEATHER));
   }

   @Override
   public SoundEvent getHurtSound(DamageSource ds) {
      return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
   }

   @Override
   public SoundEvent getDeathSound() {
      return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
   }

   public static void init() {
      SpawnPlacements.register(
         ApocalypsenowModEntities.HUNTER.get(), Type.ON_GROUND, Types.MOTION_BLOCKING_NO_LEAVES, (entityType, world, reason, pos, random) -> {
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
      builder = builder.add(Attributes.MAX_HEALTH, 10.0);
      builder = builder.add(Attributes.ARMOR, 0.0);
      builder = builder.add(Attributes.ATTACK_DAMAGE, 3.0);
      return builder.add(Attributes.FOLLOW_RANGE, 16.0);
   }
}

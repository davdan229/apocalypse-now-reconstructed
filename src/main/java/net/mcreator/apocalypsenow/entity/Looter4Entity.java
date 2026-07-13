package net.mcreator.apocalypsenow.entity;

import net.mcreator.apocalypsenow.init.ApocalypsenowModEntities;
import net.mcreator.apocalypsenow.init.ApocalypsenowModItems;
import net.mcreator.apocalypsenow.procedures.LooternaturalspawnProcedure;
import net.mcreator.apocalypsenow.procedures.Survivor6EntityDiesProcedure;
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
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.monster.CaveSpider;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.entity.monster.Husk;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.Skeleton;
import net.minecraft.world.entity.monster.Slime;
import net.minecraft.world.entity.monster.Spider;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.levelgen.Heightmap.Types;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages.SpawnEntity;
import net.minecraftforge.registries.ForgeRegistries;

public class Looter4Entity extends Monster {
   public Looter4Entity(SpawnEntity packet, Level world) {
      this(ApocalypsenowModEntities.LOOTER_4.get(), world);
   }

   public Looter4Entity(EntityType<Looter4Entity> type, Level world) {
      super(type, world);
      this.setMaxUpStep(0.6F);
      this.xpReward = 6;
      this.setNoAi(false);
      this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(ApocalypsenowModItems.CLEAVER.get()));
   }

   @Override
   public Packet<ClientGamePacketListener> getAddEntityPacket() {
      return NetworkHooks.getEntitySpawningPacket(this);
   }

   @Override
   protected void registerGoals() {
      super.registerGoals();
      this.targetSelector.addGoal(2, ApocalypsenowFactionTargeting.goal(this));
      this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.2, false) {
         @Override
         protected double getAttackReachSqr(LivingEntity entity) {
            return super.getAttackReachSqr(entity);
         }
      });
      this.targetSelector.addGoal(1, new FactionHurtByTargetGoal(this).setAlertOthers());
      this.goalSelector.addGoal(3, new RandomStrollGoal(this, 0.8));
      this.goalSelector.addGoal(4, new RandomLookAroundGoal(this));
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
      return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.pillager.ambient"));
   }

   @Override
   public SoundEvent getHurtSound(DamageSource ds) {
      return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.pillager.hurt"));
   }

   @Override
   public SoundEvent getDeathSound() {
      return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.pillager.death"));
   }

   @Override
   public void die(DamageSource source) {
      super.die(source);
      Survivor6EntityDiesProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ());
   }

   public static void init() {
      SpawnPlacements.register(
         ApocalypsenowModEntities.LOOTER_4.get(), Type.ON_GROUND, Types.MOTION_BLOCKING_NO_LEAVES, (entityType, world, reason, pos, random) -> {
            int x = pos.getX();
            int y = pos.getY();
            int z = pos.getZ();
            return LooternaturalspawnProcedure.execute(world, x, y, z);
         }
      );
   }

   public static Builder createAttributes() {
      Builder builder = Mob.createMobAttributes();
      builder = builder.add(Attributes.MOVEMENT_SPEED, 0.2);
      builder = builder.add(Attributes.MAX_HEALTH, 20.0);
      builder = builder.add(Attributes.ARMOR, 0.0);
      builder = builder.add(Attributes.ATTACK_DAMAGE, 3.0);
      return builder.add(Attributes.FOLLOW_RANGE, 16.0);
   }
}

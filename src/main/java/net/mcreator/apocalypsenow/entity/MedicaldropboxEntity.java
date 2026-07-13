package net.mcreator.apocalypsenow.entity;

import javax.annotation.Nullable;
import net.mcreator.apocalypsenow.init.ApocalypsenowModEntities;
import net.mcreator.apocalypsenow.procedures.DropboxOnInitialEntitySpawnProcedure;
import net.mcreator.apocalypsenow.procedures.MedicaldropboxhitthegroundProcedure;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.AreaEffectCloud;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.ThrownPotion;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages.SpawnEntity;

public class MedicaldropboxEntity extends Monster {
   public MedicaldropboxEntity(SpawnEntity packet, Level world) {
      this(ApocalypsenowModEntities.MEDICALDROPBOX.get(), world);
   }

   public MedicaldropboxEntity(EntityType<MedicaldropboxEntity> type, Level world) {
      super(type, world);
      this.setMaxUpStep(0.6F);
      this.xpReward = 0;
      this.setNoAi(false);
      this.setPersistenceRequired();
   }

   @Override
   public Packet<ClientGamePacketListener> getAddEntityPacket() {
      return NetworkHooks.getEntitySpawningPacket(this);
   }

   @Override
   protected void registerGoals() {
      super.registerGoals();
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
   public boolean hurt(DamageSource damagesource, float amount) {
      if (damagesource.getDirectEntity() instanceof AbstractArrow) {
         return false;
      } else if (damagesource.getDirectEntity() instanceof ThrownPotion || damagesource.getDirectEntity() instanceof AreaEffectCloud) {
         return false;
      } else if (damagesource.is(DamageTypes.CACTUS)) {
         return false;
      } else if (damagesource.is(DamageTypes.DROWN)) {
         return false;
      } else if (damagesource.is(DamageTypes.LIGHTNING_BOLT)) {
         return false;
      } else if (damagesource.is(DamageTypes.EXPLOSION) || damagesource.is(DamageTypes.PLAYER_EXPLOSION)) {
         return false;
      } else if (damagesource.is(DamageTypes.TRIDENT)) {
         return false;
      } else if (damagesource.is(DamageTypes.FALLING_ANVIL)) {
         return false;
      } else if (damagesource.is(DamageTypes.DRAGON_BREATH)) {
         return false;
      } else {
         return !damagesource.is(DamageTypes.WITHER) && !damagesource.is(DamageTypes.WITHER_SKULL) ? super.hurt(damagesource, amount) : false;
      }
   }

   @Override
   public boolean ignoreExplosion() {
      return true;
   }

   @Override
   public SpawnGroupData finalizeSpawn(
      ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag
   ) {
      SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
      DropboxOnInitialEntitySpawnProcedure.execute(this);
      return retval;
   }

   @Override
   public void baseTick() {
      super.baseTick();
      MedicaldropboxhitthegroundProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ(), this);
   }

   public static void init() {
   }

   public static Builder createAttributes() {
      Builder builder = Mob.createMobAttributes();
      builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
      builder = builder.add(Attributes.MAX_HEALTH, 50.0);
      builder = builder.add(Attributes.ARMOR, 0.0);
      builder = builder.add(Attributes.ATTACK_DAMAGE, 0.0);
      builder = builder.add(Attributes.FOLLOW_RANGE, 16.0);
      return builder.add(Attributes.KNOCKBACK_RESISTANCE, 900.0);
   }
}

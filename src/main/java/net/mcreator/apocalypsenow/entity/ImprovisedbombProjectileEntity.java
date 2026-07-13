package net.mcreator.apocalypsenow.entity;

import net.mcreator.apocalypsenow.init.ApocalypsenowModEntities;
import net.mcreator.apocalypsenow.init.ApocalypsenowModItems;
import net.mcreator.apocalypsenow.procedures.GrenadeBulletHitsBlockProcedure;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages.SpawnEntity;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class ImprovisedbombProjectileEntity extends AbstractArrow implements ItemSupplier {
   public static final ItemStack PROJECTILE_ITEM = new ItemStack(ApocalypsenowModItems.IMPROVISEDBOMB.get());

   public ImprovisedbombProjectileEntity(SpawnEntity packet, Level world) {
      super(ApocalypsenowModEntities.IMPROVISEDBOMB_PROJECTILE.get(), world);
   }

   public ImprovisedbombProjectileEntity(EntityType<? extends ImprovisedbombProjectileEntity> type, Level world) {
      super(type, world);
   }

   public ImprovisedbombProjectileEntity(EntityType<? extends ImprovisedbombProjectileEntity> type, double x, double y, double z, Level world) {
      super(type, x, y, z, world);
   }

   public ImprovisedbombProjectileEntity(EntityType<? extends ImprovisedbombProjectileEntity> type, LivingEntity entity, Level world) {
      super(type, entity, world);
   }

   @Override
   public Packet<ClientGamePacketListener> getAddEntityPacket() {
      return NetworkHooks.getEntitySpawningPacket(this);
   }

   @OnlyIn(Dist.CLIENT)
   @Override
   public ItemStack getItem() {
      return PROJECTILE_ITEM;
   }

   @Override
   protected ItemStack getPickupItem() {
      return PROJECTILE_ITEM;
   }

   @Override
   protected void doPostHurtEffects(LivingEntity entity) {
      super.doPostHurtEffects(entity);
      entity.setArrowCount(entity.getArrowCount() - 1);
   }

   @Override
   public void onHitEntity(EntityHitResult entityHitResult) {
      super.onHitEntity(entityHitResult);
      GrenadeBulletHitsBlockProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ());
   }

   @Override
   public void onHitBlock(BlockHitResult blockHitResult) {
      super.onHitBlock(blockHitResult);
      GrenadeBulletHitsBlockProcedure.execute(
         this.level(), blockHitResult.getBlockPos().getX(), blockHitResult.getBlockPos().getY(), blockHitResult.getBlockPos().getZ()
      );
   }

   @Override
   public void tick() {
      super.tick();
      if (this.inGround) {
         this.discard();
      }
   }

   public static ImprovisedbombProjectileEntity shoot(Level world, LivingEntity entity, RandomSource source) {
      return shoot(world, entity, source, 1.0F, 2.0, 1);
   }

   public static ImprovisedbombProjectileEntity shoot(Level world, LivingEntity entity, RandomSource random, float power, double damage, int knockback) {
      ImprovisedbombProjectileEntity entityarrow = new ImprovisedbombProjectileEntity(ApocalypsenowModEntities.IMPROVISEDBOMB_PROJECTILE.get(), entity, world);
      entityarrow.shoot(entity.getViewVector(1.0F).x, entity.getViewVector(1.0F).y, entity.getViewVector(1.0F).z, power * 2.0F, 0.0F);
      entityarrow.setSilent(true);
      entityarrow.setCritArrow(false);
      entityarrow.setBaseDamage(damage);
      entityarrow.setKnockback(knockback);
      world.addFreshEntity(entityarrow);
      return entityarrow;
   }

   public static ImprovisedbombProjectileEntity shoot(LivingEntity entity, LivingEntity target) {
      ImprovisedbombProjectileEntity entityarrow = new ImprovisedbombProjectileEntity(
         ApocalypsenowModEntities.IMPROVISEDBOMB_PROJECTILE.get(), entity, entity.level()
      );
      double dx = target.getX() - entity.getX();
      double dy = target.getY() + target.getEyeHeight() - 1.1;
      double dz = target.getZ() - entity.getZ();
      entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.2F, dz, 2.0F, 12.0F);
      entityarrow.setSilent(true);
      entityarrow.setBaseDamage(2.0);
      entityarrow.setKnockback(1);
      entityarrow.setCritArrow(false);
      entity.level().addFreshEntity(entityarrow);
      return entityarrow;
   }
}

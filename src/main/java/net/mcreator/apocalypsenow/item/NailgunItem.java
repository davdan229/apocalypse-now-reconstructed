package net.mcreator.apocalypsenow.item;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import net.mcreator.apocalypsenow.entity.NailprojectileEntity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier.Operation;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow.Pickup;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ProjectileWeaponItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.level.Level;

public class NailgunItem extends Item {
   public NailgunItem() {
      super(new Properties().stacksTo(1).rarity(Rarity.COMMON));
   }

   @Override
   public UseAnim getUseAnimation(ItemStack itemstack) {
      return UseAnim.BOW;
   }

   @Override
   public int getUseDuration(ItemStack itemstack) {
      return 28000;
   }

   @Override
   public Multimap<Attribute, AttributeModifier> getDefaultAttributeModifiers(EquipmentSlot equipmentSlot) {
      if (equipmentSlot == EquipmentSlot.MAINHAND) {
         Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
         builder.putAll(super.getDefaultAttributeModifiers(equipmentSlot));
         builder.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(BASE_ATTACK_DAMAGE_UUID, "Item modifier", 1.0, Operation.ADDITION));
         builder.put(Attributes.ATTACK_SPEED, new AttributeModifier(BASE_ATTACK_SPEED_UUID, "Item modifier", -2.4, Operation.ADDITION));
         return builder.build();
      } else {
         return super.getDefaultAttributeModifiers(equipmentSlot);
      }
   }

   @Override
   public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
      InteractionResultHolder<ItemStack> ar = InteractionResultHolder.fail(entity.getItemInHand(hand));
      if (entity.getAbilities().instabuild || this.findAmmo(entity) != ItemStack.EMPTY) {
         ar = InteractionResultHolder.success(entity.getItemInHand(hand));
         entity.startUsingItem(hand);
      }

      return ar;
   }

   @Override
   public void releaseUsing(ItemStack itemstack, Level world, LivingEntity entity, int time) {
      if (!world.isClientSide() && entity instanceof ServerPlayer player) {
         ItemStack stack = this.findAmmo(player);
         if (player.getAbilities().instabuild || stack != ItemStack.EMPTY) {
            NailprojectileEntity projectile = NailprojectileEntity.shoot(world, entity, world.getRandom());
            if (player.getAbilities().instabuild) {
               projectile.pickup = Pickup.CREATIVE_ONLY;
            } else if (stack.isDamageableItem()) {
               if (stack.hurt(1, world.getRandom(), player)) {
                  stack.shrink(1);
                  stack.setDamageValue(0);
                  if (stack.isEmpty()) {
                     player.getInventory().removeItem(stack);
                  }
               }
            } else {
               stack.shrink(1);
               if (stack.isEmpty()) {
                  player.getInventory().removeItem(stack);
               }
            }
         }
      }
   }

   private ItemStack findAmmo(Player player) {
      ItemStack stack = ProjectileWeaponItem.getHeldProjectile(player, e -> e.getItem() == NailprojectileEntity.PROJECTILE_ITEM.getItem());
      if (stack == ItemStack.EMPTY) {
         for (int i = 0; i < player.getInventory().items.size(); i++) {
            ItemStack teststack = player.getInventory().items.get(i);
            if (teststack != null && teststack.getItem() == NailprojectileEntity.PROJECTILE_ITEM.getItem()) {
               stack = teststack;
               break;
            }
         }
      }

      return stack;
   }
}

package net.mcreator.apocalypsenow.item;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import net.mcreator.apocalypsenow.procedures.ChainsawRightClickedInAirProcedure;
import net.mcreator.apocalypsenow.procedures.ChainsawRightclickedOnBlockProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier.Operation;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

public class ChainsawItem extends Item {
   public ChainsawItem() {
      super(new Properties().durability(900));
   }

   @Override
   public float getDestroySpeed(ItemStack itemstack, BlockState blockstate) {
      return 1.0F;
   }

   @Override
   public boolean mineBlock(ItemStack itemstack, Level world, BlockState blockstate, BlockPos pos, LivingEntity entity) {
      itemstack.hurtAndBreak(1, entity, i -> i.broadcastBreakEvent(EquipmentSlot.MAINHAND));
      return true;
   }

   @Override
   public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
      itemstack.hurtAndBreak(2, sourceentity, i -> i.broadcastBreakEvent(EquipmentSlot.MAINHAND));
      return true;
   }

   @Override
   public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
      ItemStack stack = entity.getItemInHand(hand);
      ChainsawRightClickedInAirProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity, stack);
      return InteractionResultHolder.sidedSuccess(stack, world.isClientSide());
   }

   @Override
   public int getEnchantmentValue() {
      return 3;
   }

   @Override
   public Multimap<Attribute, AttributeModifier> getDefaultAttributeModifiers(EquipmentSlot equipmentSlot) {
      if (equipmentSlot == EquipmentSlot.MAINHAND) {
         Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
         builder.putAll(super.getDefaultAttributeModifiers(equipmentSlot));
         builder.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(BASE_ATTACK_DAMAGE_UUID, "Tool modifier", 10.0, Operation.ADDITION));
         builder.put(Attributes.ATTACK_SPEED, new AttributeModifier(BASE_ATTACK_SPEED_UUID, "Tool modifier", 1.0, Operation.ADDITION));
         return builder.build();
      } else {
         return super.getDefaultAttributeModifiers(equipmentSlot);
      }
   }

   @Override
   public InteractionResult useOn(UseOnContext context) {
      super.useOn(context);
      boolean handled = ChainsawRightclickedOnBlockProcedure.execute(
         context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer(), context.getItemInHand(), context.getHand()
      );
      return handled ? InteractionResult.sidedSuccess(context.getLevel().isClientSide()) : InteractionResult.PASS;
   }
}

package net.mcreator.apocalypsenow.item;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import net.mcreator.apocalypsenow.init.ApocalypsenowModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier.Operation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TieredItem;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolAction;
import net.minecraftforge.common.ToolActions;

public class SurvivalshovelItem extends TieredItem {
   public SurvivalshovelItem() {
      super(new Tier() {
         @Override
         public int getUses() {
            return 1200;
         }

         @Override
         public float getSpeed() {
            return 5.0F;
         }

         @Override
         public float getAttackDamageBonus() {
            return 4.4F;
         }

         @Override
         public int getLevel() {
            return 2;
         }

         @Override
         public int getEnchantmentValue() {
            return 2;
         }

         @Override
         public Ingredient getRepairIngredient() {
            return Ingredient.of(new ItemStack(ApocalypsenowModItems.SCRAPMETAL.get()), new ItemStack(ApocalypsenowModItems.DUCTTAPE.get()));
         }
      }, new Properties());
   }

   @Override
   public boolean isCorrectToolForDrops(BlockState blockstate) {
      int tier = 2;
      if (tier < 3 && blockstate.is(BlockTags.NEEDS_DIAMOND_TOOL)) {
         return false;
      } else if (tier < 2 && blockstate.is(BlockTags.NEEDS_IRON_TOOL)) {
         return false;
      } else {
         return tier < 1 && blockstate.is(BlockTags.NEEDS_STONE_TOOL)
            ? false
            : blockstate.is(BlockTags.MINEABLE_WITH_AXE)
               || blockstate.is(BlockTags.MINEABLE_WITH_HOE)
               || blockstate.is(BlockTags.MINEABLE_WITH_PICKAXE)
               || blockstate.is(BlockTags.MINEABLE_WITH_SHOVEL);
      }
   }

   @Override
   public boolean canPerformAction(ItemStack stack, ToolAction toolAction) {
      return ToolActions.DEFAULT_AXE_ACTIONS.contains(toolAction)
         || ToolActions.DEFAULT_HOE_ACTIONS.contains(toolAction)
         || ToolActions.DEFAULT_SHOVEL_ACTIONS.contains(toolAction)
         || ToolActions.DEFAULT_PICKAXE_ACTIONS.contains(toolAction)
         || ToolActions.DEFAULT_SWORD_ACTIONS.contains(toolAction);
   }

   @Override
   public float getDestroySpeed(ItemStack itemstack, BlockState blockstate) {
      return 5.0F;
   }

   @Override
   public Multimap<Attribute, AttributeModifier> getDefaultAttributeModifiers(EquipmentSlot equipmentSlot) {
      if (equipmentSlot == EquipmentSlot.MAINHAND) {
         Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
         builder.putAll(super.getDefaultAttributeModifiers(equipmentSlot));
         builder.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(BASE_ATTACK_DAMAGE_UUID, "Tool modifier", 5.4F, Operation.ADDITION));
         builder.put(Attributes.ATTACK_SPEED, new AttributeModifier(BASE_ATTACK_SPEED_UUID, "Tool modifier", -2.6, Operation.ADDITION));
         return builder.build();
      } else {
         return super.getDefaultAttributeModifiers(equipmentSlot);
      }
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
}

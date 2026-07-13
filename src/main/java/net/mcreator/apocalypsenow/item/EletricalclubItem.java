package net.mcreator.apocalypsenow.item;

import java.util.List;
import net.mcreator.apocalypsenow.init.ApocalypsenowModItems;
import net.mcreator.apocalypsenow.procedures.EletricaldamageweaponProcedure;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;

public class EletricalclubItem extends SwordItem {
   public EletricalclubItem() {
      super(
         new Tier() {
            @Override
            public int getUses() {
               return 300;
            }

            @Override
            public float getSpeed() {
               return 4.0F;
            }

            @Override
            public float getAttackDamageBonus() {
               return 1.0F;
            }

            @Override
            public int getLevel() {
               return 1;
            }

            @Override
            public int getEnchantmentValue() {
               return 2;
            }

            @Override
            public Ingredient getRepairIngredient() {
               return Ingredient.of(
                  new ItemStack(ApocalypsenowModItems.GLUE.get()),
                  new ItemStack(ApocalypsenowModItems.DUCTTAPE.get()),
                  new ItemStack(ApocalypsenowModItems.ELECTRICAL_SCRAP.get()),
                  new ItemStack(ApocalypsenowModItems.PLANK.get())
               );
            }
         },
         3,
         -2.8F,
         new Properties()
      );
   }

   @Override
   public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
      boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
      EletricaldamageweaponProcedure.execute(entity.level(), entity);
      return retval;
   }

   @Override
   public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
      super.appendHoverText(itemstack, level, list, flag);
      list.add(Component.translatable("text.apocalypsenow.electrical_damage_effect_cf2ad738"));
   }
}

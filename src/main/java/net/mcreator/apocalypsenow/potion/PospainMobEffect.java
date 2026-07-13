package net.mcreator.apocalypsenow.potion;

import java.util.function.Consumer;
import net.mcreator.apocalypsenow.procedures.PospainontickupdateProcedure;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.EffectRenderingInventoryScreen;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraftforge.client.extensions.common.IClientMobEffectExtensions;

public class PospainMobEffect extends MobEffect {
   public PospainMobEffect() {
      super(MobEffectCategory.NEUTRAL, -1);
   }

   @Override
   public void applyEffectTick(LivingEntity entity, int amplifier) {
      PospainontickupdateProcedure.execute(entity);
   }

   @Override
   public boolean isDurationEffectTick(int duration, int amplifier) {
      return duration % 20 == 0;
   }

   @Override
   public void initializeClient(Consumer<IClientMobEffectExtensions> consumer) {
      consumer.accept(
         new IClientMobEffectExtensions() {
            @Override
            public boolean isVisibleInInventory(MobEffectInstance effect) {
               return false;
            }

            @Override
            public boolean renderInventoryText(
               MobEffectInstance instance, EffectRenderingInventoryScreen<?> screen, GuiGraphics guiGraphics, int x, int y, int blitOffset
            ) {
               return false;
            }

            @Override
            public boolean isVisibleInGui(MobEffectInstance effect) {
               return false;
            }
         }
      );
   }
}

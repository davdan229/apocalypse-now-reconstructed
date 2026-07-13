package net.mcreator.apocalypsenow.client;

import java.util.ArrayDeque;
import java.util.Deque;
import net.mcreator.apocalypsenow.ApocalypsenowMod;
import net.minecraft.client.model.PlayerModel;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber(modid = ApocalypsenowMod.MODID, value = Dist.CLIENT)
public final class ApocalypsenowArmorSkinLayerHandler {
   private static final ThreadLocal<Deque<LayerState>> STATES = ThreadLocal.withInitial(ArrayDeque::new);

   private ApocalypsenowArmorSkinLayerHandler() {
   }

   @SubscribeEvent(priority = EventPriority.LOWEST)
   public static void beforePlayerRender(RenderPlayerEvent.Pre event) {
      PlayerModel<AbstractClientPlayer> model = event.getRenderer().getModel();
      STATES.get().push(new LayerState(model));

      var player = event.getEntity();
      if (isApocalypseArmor(player.getItemBySlot(EquipmentSlot.HEAD))) {
         model.hat.visible = false;
      }

      if (isApocalypseArmor(player.getItemBySlot(EquipmentSlot.CHEST))) {
         model.jacket.visible = false;
         model.leftSleeve.visible = false;
         model.rightSleeve.visible = false;
      }

      if (isApocalypseArmor(player.getItemBySlot(EquipmentSlot.LEGS)) || isApocalypseArmor(player.getItemBySlot(EquipmentSlot.FEET))) {
         model.leftPants.visible = false;
         model.rightPants.visible = false;
      }
   }

   @SubscribeEvent(priority = EventPriority.HIGHEST)
   public static void afterPlayerRender(RenderPlayerEvent.Post event) {
      Deque<LayerState> states = STATES.get();
      if (!states.isEmpty()) {
         states.pop().restore();
      }

      if (states.isEmpty()) {
         STATES.remove();
      }
   }

   private static boolean isApocalypseArmor(ItemStack stack) {
      return stack.getItem() instanceof ArmorItem
         && ApocalypsenowMod.MODID.equals(BuiltInRegistries.ITEM.getKey(stack.getItem()).getNamespace());
   }

   private record LayerState(
      PlayerModel<AbstractClientPlayer> model,
      boolean hat,
      boolean jacket,
      boolean leftSleeve,
      boolean rightSleeve,
      boolean leftPants,
      boolean rightPants
   ) {
      private LayerState(PlayerModel<AbstractClientPlayer> model) {
         this(
            model,
            model.hat.visible,
            model.jacket.visible,
            model.leftSleeve.visible,
            model.rightSleeve.visible,
            model.leftPants.visible,
            model.rightPants.visible
         );
      }

      private void restore() {
         this.model.hat.visible = this.hat;
         this.model.jacket.visible = this.jacket;
         this.model.leftSleeve.visible = this.leftSleeve;
         this.model.rightSleeve.visible = this.rightSleeve;
         this.model.leftPants.visible = this.leftPants;
         this.model.rightPants.visible = this.rightPants;
      }
   }
}

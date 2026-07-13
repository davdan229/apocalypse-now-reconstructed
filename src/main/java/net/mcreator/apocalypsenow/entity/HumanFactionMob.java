package net.mcreator.apocalypsenow.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.level.Level;

/** Base for persistent human NPCs that must remain available on Peaceful. */
public abstract class HumanFactionMob extends PathfinderMob {
   protected HumanFactionMob(EntityType<? extends PathfinderMob> type, Level level) {
      super(type, level);
   }

   @Override
   protected boolean shouldDespawnInPeaceful() {
      return false;
   }
}

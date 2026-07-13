package net.mcreator.apocalypsenow.client.model;

import net.minecraft.client.model.AbstractZombieModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.world.entity.monster.Monster;

/** Vanilla zombie arm animation adapted to Apocalypse Now infected entities. */
public class ApocalypsenowZombieModel<T extends Monster> extends AbstractZombieModel<T> {
   public ApocalypsenowZombieModel(ModelPart root) {
      super(root);
   }

   @Override
   public boolean isAggressive(T entity) {
      return entity.isAggressive();
   }
}

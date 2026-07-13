package net.mcreator.apocalypsenow.procedures;

import net.mcreator.apocalypsenow.configuration.ApocalypsenowconfigurationConfiguration;
import net.mcreator.apocalypsenow.init.ApocalypsenowModParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.LevelAccessor;

public class DropboxcommonOnTickUpdateProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z) {
      if (ApocalypsenowconfigurationConfiguration.DROP_BOX_SMOKE.get() && world instanceof ServerLevel _level) {
         _level.sendParticles(ApocalypsenowModParticleTypes.DROPBOXSMOKE.get(), x, y + 3.0, z, 3, 0.5, 3.0, 0.5, 0.0);
      }
   }
}

package net.mcreator.apocalypsenow.configuration;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.Builder;
import net.minecraftforge.common.ForgeConfigSpec.ConfigValue;

public class ApocalypsenowconfigurationConfiguration {
   public static final Builder BUILDER = new Builder();
   public static final ForgeConfigSpec SPEC;
   public static final ConfigValue<Double> POPULATION_DENSITY;
   public static final ConfigValue<Boolean> WALKERS_RUNNERS_SPAWN;
   public static final ConfigValue<Boolean> RUNNERS_SPAWN;
   public static final ConfigValue<Boolean> WALKERS_SPAWN;
   public static final ConfigValue<Boolean> HUMANS_SPAWN;
   public static final ConfigValue<Boolean> LOOTERS_SPAWN;
   public static final ConfigValue<Boolean> AMBIENT_SPAWN;
   public static final ConfigValue<Boolean> BLEEDING_EFFECT;
   public static final ConfigValue<Boolean> BROKEN_LEG;
   public static final ConfigValue<Boolean> ELETRICAL_DAMAGE;
   public static final ConfigValue<Boolean> INFECTION_EFFECT;
   public static final ConfigValue<Boolean> ZOMBIFICATION_EFFECT;
   public static final ConfigValue<Boolean> SCRATCH_EFFECT;
   public static final ConfigValue<Boolean> BITE_EFFECT;
   public static final ConfigValue<Boolean> SEVERE_BLEEDING_EFFECT;
   public static final ConfigValue<Boolean> PAIN_EFFECT;
   public static final ConfigValue<Boolean> RADIATION_EFFECT;
   public static final ConfigValue<Boolean> UNDEAD_GET_ARMOR;
   public static final ConfigValue<Boolean> HORDES_SPAWN;
   public static final ConfigValue<Boolean> AMORS_HAVE_EFFECT;
   public static final ConfigValue<Boolean> HUMAN_FLESH_DROP;
   public static final ConfigValue<Boolean> ENABLES_ALL_EFFECTS;
   public static final ConfigValue<Boolean> DROP_BOX_SMOKE;

   static {
      BUILDER.push("population_density");
      POPULATION_DENSITY = BUILDER.comment("Change from 0.1 to 0.5 to increase the number of walkers that appear")
         .define("Increase in Population Density", 0.0);
      BUILDER.pop();

      BUILDER.push("walkers_runners_spawn");
      WALKERS_RUNNERS_SPAWN = BUILDER.comment("disables the spawn of walkers and runners in this mod")
         .define("Walkers and Runners Spawn", true);
      RUNNERS_SPAWN = BUILDER.comment("Disable only the runners ").define("Runners Spawn", true);
      WALKERS_SPAWN = BUILDER.comment("Disable only the walkers").define("Walkers Spawn", true);
      BUILDER.pop();

      BUILDER.push("humans_spawn");
      HUMANS_SPAWN = BUILDER.comment("disables the spawn of humans in this mod").define("Humans Spawn", true);
      LOOTERS_SPAWN = BUILDER.comment("disables the spawn of looters in this mod").define("Looters Spawn", true);
      BUILDER.pop();

      BUILDER.push("ambient_spawn");
      AMBIENT_SPAWN = BUILDER.comment("Disables the spawn of ambient creatures in this mod").define("Ambient Spawn", true);
      BUILDER.pop();

      BUILDER.push("Effects Disable [Will not affect mod weapons and defenses]");
      BLEEDING_EFFECT = BUILDER.comment("Disable Bleeding Effect").define("Bleeding Effect", true);
      BROKEN_LEG = BUILDER.comment("Disable Broken Leg Effect").define("Broken Leg Effect", true);
      ELETRICAL_DAMAGE = BUILDER.comment("Disable Eletric Damage").define("Electric Damage", true);
      INFECTION_EFFECT = BUILDER.comment("Disable Infection Effect").define("Infection Effect", true);
      ZOMBIFICATION_EFFECT = BUILDER.comment("Disable Zombification Effect").define("Zombification Effect", true);
      SCRATCH_EFFECT = BUILDER.comment("Disable Scratch Effect").define("Scratch Effect", true);
      BITE_EFFECT = BUILDER.comment("Disable Bite Effect").define("Bite Effect", true);
      SEVERE_BLEEDING_EFFECT = BUILDER.comment("Disable Severe Bleeding Effect").define("Severe Bleeding Effect", true);
      PAIN_EFFECT = BUILDER.comment("Disable Pain Effect").define("Pain Effect", true);
      RADIATION_EFFECT = BUILDER.comment("Disables the radiation effect").define("Radiation Effect", true);
      BUILDER.pop();

      BUILDER.push("undead get armor");
      UNDEAD_GET_ARMOR = BUILDER.comment("Disables the armor spawing on undeade like mob").define("Undead Get Armor", true);
      BUILDER.pop();

      BUILDER.push("Hordes Spawn");
      HORDES_SPAWN = BUILDER.comment("Disalbes the spawn of hordes").define("Hordes Spawn", true);
      BUILDER.pop();

      BUILDER.push("Armors have effects");
      AMORS_HAVE_EFFECT = BUILDER.comment("Enables special effects from apnow armos").define("Armos Have Effect", true);
      BUILDER.pop();

      BUILDER.push("Human Flesh Drop");
      HUMAN_FLESH_DROP = BUILDER.comment("Disables the drop of human flesh from mobs and players").define("Human Flesh Drop", true);
      BUILDER.pop();

      BUILDER.push("Enables all apnow effects");
      ENABLES_ALL_EFFECTS = BUILDER.comment(
            "Enables and disables all mod effects, turning this to false will disable all mod effect from working"
         )
         .define("Enables mod effects", true);
      BUILDER.pop();

      BUILDER.push("Drop Box Smoke ");
      DROP_BOX_SMOKE = BUILDER.comment("Enables the smoke that comes from the drop box").define("Drop Box smoke", true);
      BUILDER.pop();

      SPEC = BUILDER.build();
   }
}

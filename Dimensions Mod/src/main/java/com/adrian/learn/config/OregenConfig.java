package com.adrian.learn.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class OregenConfig {
    public static ForgeConfigSpec.IntValue copper_ore_chance;
    public static ForgeConfigSpec.BooleanValue generate_overworld;

    public static void init(ForgeConfigSpec.Builder server, ForgeConfigSpec.Builder client)
    {
        server.comment("Oregen Config");

        copper_ore_chance = server
                .comment("Maximum number of ore veins of copper ore that can spawn in one chunk.")
                .defineInRange("oregen.copper_ore_chance",20,1,1000000);

        generate_overworld = server
                .comment("Decide if you want Copper mod ores to spawn in the overworld")
                .define("oregen.generate_overworld",true);

    }
}

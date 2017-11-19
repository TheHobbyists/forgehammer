package com.thehobbyists.inclusive;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = main.modId, name = main.name, version = main.version, acceptedMinecraftVersions = "[1.12.2]")
public class main {

    public static final String modId = "hobbyists";
    public static final String name = "Inclusive";
    public static final String version = "1.0.0";

    @Mod.Instance(modId)
    public static main instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println(name + " is loading!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }

}

package com.thehobbyists.inclusive;

import com.thehobbyists.inclusive.Blocks.ModBlocks;
import com.thehobbyists.inclusive.Items.ModItems;
import com.thehobbyists.inclusive.Items.ModRecipes;
import com.thehobbyists.inclusive.Tabs.MainTab;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import com.thehobbyists.inclusive.Proxies.*;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = main.modId, name = main.name, version = main.version, acceptedMinecraftVersions = "[1.12.2]")
public class main {

    public static final String modId = "hobbyists";
    public static final String name = "Inclusive";
    public static final String version = "1.0.0";

    public static final MainTab creativeTab = new MainTab();

    @SidedProxy(serverSide = "com.thehobbyists.inclusive.Proxies.CommonProxy", clientSide = "com.thehobbyists.inclusive.Proxies.ClientProxy")
    public static CommonProxy proxy;

    @Mod.Instance(modId)
    public static main instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println(name + " is loading!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        ModRecipes.init();

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }

    @Mod.EventBusSubscriber
    public static class RegistrationHandler {

        @SubscribeEvent
        public static void registerBlocks(RegistryEvent.Register<Block> event) {
            ModBlocks.register(event.getRegistry());
        }

        @SubscribeEvent
        public static void registerItems(RegistryEvent.Register<Item> event) {
            ModItems.register(event.getRegistry());
            ModBlocks.registerItemBlocks(event.getRegistry());
        }

        @SubscribeEvent
        public static void registerItems(ModelRegistryEvent event) {
            ModItems.registerModels();
            ModBlocks.registerModels();
        }

    }

}

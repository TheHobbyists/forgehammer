package com.thehobbyists.inclusive.Items;

import com.thehobbyists.inclusive.Blocks.ModBlocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

    public static void init() {
        GameRegistry.addSmelting(ModBlocks.oreCopper, new ItemStack(ModItems.ingotCopper), 0.7f);
    }
}



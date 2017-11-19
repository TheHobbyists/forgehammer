package com.thehobbyists.inclusive.Tabs;

import com.thehobbyists.inclusive.Items.ModItems;
import com.thehobbyists.inclusive.main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;


public class MainTab extends CreativeTabs{
    public MainTab() {
        super(main.modId);
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.ingotCopper);
    }

}

package com.thehobbyists.inclusive.Items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import com.thehobbyists.inclusive.main;

public class ItemBase extends Item {
    protected String name;

    public ItemBase(String name) {
        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
    }

    public void registerItemModel() {
        main.proxy.registerItemRenderer(this, 0, name);
    }

    @Override
    public ItemBase setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(main.creativeTab);
        return this;
    }
}

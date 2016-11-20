package com.nfinitdev.redstonefluxarsenal.creativetab;

import com.nfinitdev.redstonefluxarsenal.Main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabMain extends CreativeTabs {
    
    public CreativeTabMain() {
        
        super("redstonefluxarsenal");
    }
    
    @Override
    public Item getTabIconItem () {
        
        return Main.itemrfpickaxe;
    }
}
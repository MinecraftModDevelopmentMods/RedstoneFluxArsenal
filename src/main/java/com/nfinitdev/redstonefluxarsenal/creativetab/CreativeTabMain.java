package com.nfinitdev.redstonefluxarsenal.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CreativeTabMain extends CreativeTabs {
    
    public CreativeTabMain() {
        
        super("redstonefluxarsenal");
    }
/*
	@Override
	public ItemStack getIconItemStack() {
	     return new ItemStack(Main.itemrfpickaxe);	}
    
*/
	
	
    @Override
    @SideOnly(Side.CLIENT)
    public ItemStack getTabIconItem() {
        return getIconItemStack();
    }
	
	
	
	
	
	
}
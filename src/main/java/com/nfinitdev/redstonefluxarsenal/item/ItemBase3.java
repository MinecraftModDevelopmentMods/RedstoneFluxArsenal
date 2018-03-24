package com.nfinitdev.redstonefluxarsenal.item;

import com.nfinitdev.redstonefluxarsenal.Main;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemBase3 extends Item {
	
	private String name = "";

	public ItemBase3(String name) {
		this.name = name;
		setUnlocalizedName(this.name);
		setMaxStackSize(1);
		setMaxDamage(0);
      //  setCreativeTab(Main.tab);
    	
	}


}
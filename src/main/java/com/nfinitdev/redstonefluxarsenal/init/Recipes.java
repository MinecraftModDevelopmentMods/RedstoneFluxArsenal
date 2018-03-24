package com.nfinitdev.redstonefluxarsenal.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class Recipes {
	
    public static void init()
    {
        addOreRegistration();
        addSmeltingRecipes();
    }
	
	
	
	public static void addSmeltingRecipes() {

		GameRegistry.addSmelting(ModItems.itemrfenergizedgem, new ItemStack(ModItems.itemrfenergizedcrystal), 0.7f);
	}

    public static void addOreRegistration()
    {

    }

}         

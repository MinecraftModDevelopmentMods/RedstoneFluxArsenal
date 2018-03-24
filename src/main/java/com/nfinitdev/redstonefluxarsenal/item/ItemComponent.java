package com.nfinitdev.redstonefluxarsenal.item;

import com.nfinitdev.redstonefluxarsenal.init.ModItems;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

public class ItemComponent extends ItemBase {

    public ItemComponent()
    {
        super();
        setUnlocalizedName("redstonefluxarsenal.itemcomponent");
        setRegistryName("itemcomponent");
    }
    public void registerItemModel() {
	    ModelLoader.setCustomModelResourceLocation(ModItems.itemcomponent, 0, new ModelResourceLocation(ModItems.itemcomponent.getRegistryName(), "inventory"));
	}
}
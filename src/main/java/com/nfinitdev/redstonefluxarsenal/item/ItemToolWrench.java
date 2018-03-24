package com.nfinitdev.redstonefluxarsenal.item;

import com.nfinitdev.redstonefluxarsenal.init.ModItems;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

public class ItemToolWrench extends ItemBase {

    public ItemToolWrench()
    {
        super();
        setUnlocalizedName("redstonefluxarsenal.itemtoolrfwrench");
        setRegistryName("itemtoolrfwrench");
    }
    public void registerItemModel() {
	    ModelLoader.setCustomModelResourceLocation(ModItems.itemrfsword, 0, new ModelResourceLocation(ModItems.itemrfsword.getRegistryName(), "inventory"));
	}
}
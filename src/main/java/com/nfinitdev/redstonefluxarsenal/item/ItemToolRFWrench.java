package com.nfinitdev.redstonefluxarsenal.item;

import com.nfinitdev.redstonefluxarsenal.init.ModItems;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

public class ItemToolRFWrench extends ItemBase {

    public ItemToolRFWrench()
    {
        super();
        setUnlocalizedName("redstonefluxarsenal.itemtoolwrench");
        setRegistryName("itemtoolwrench");
    }
    public void registerItemModel() {
	    ModelLoader.setCustomModelResourceLocation(ModItems.itemtoolrfwrench, 0, new ModelResourceLocation(ModItems.itemtoolrfwrench.getRegistryName(), "inventory"));
	}
}
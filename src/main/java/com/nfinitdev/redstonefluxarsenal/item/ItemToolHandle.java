package com.nfinitdev.redstonefluxarsenal.item;

import com.nfinitdev.redstonefluxarsenal.init.ModItems;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

public class ItemToolHandle extends ItemBase {

    public ItemToolHandle()
    {
        super();
        setUnlocalizedName("redstonefluxarsenal.itemtoolhandle");
        setRegistryName("itemtoolhandle");
    }
    public void registerItemModel() {
	    ModelLoader.setCustomModelResourceLocation(ModItems.itemtoolhandle, 0, new ModelResourceLocation(ModItems.itemtoolhandle.getRegistryName(), "inventory"));
	}
}
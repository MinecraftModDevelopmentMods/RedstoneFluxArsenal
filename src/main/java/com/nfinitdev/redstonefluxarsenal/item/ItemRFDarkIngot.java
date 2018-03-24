package com.nfinitdev.redstonefluxarsenal.item;

import com.nfinitdev.redstonefluxarsenal.init.ModItems;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

public class ItemRFDarkIngot extends ItemBase {

    public ItemRFDarkIngot()
    {
        super();
        setUnlocalizedName("redstonefluxarsenal.itemrfdarkingot");
        setRegistryName("itemrfdarkingot");
    }
    public void registerItemModel() {
	    ModelLoader.setCustomModelResourceLocation(ModItems.itemrfdarkingot, 0, new ModelResourceLocation(ModItems.itemrfdarkingot.getRegistryName(), "inventory"));
	}
}
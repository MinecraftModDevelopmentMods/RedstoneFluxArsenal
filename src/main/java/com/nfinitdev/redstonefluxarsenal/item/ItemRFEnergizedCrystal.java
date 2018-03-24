package com.nfinitdev.redstonefluxarsenal.item;

import com.nfinitdev.redstonefluxarsenal.init.ModItems;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

public class ItemRFEnergizedCrystal extends ItemBase {

    public ItemRFEnergizedCrystal()
    {
        super();
        setUnlocalizedName("redstonefluxarsenal.itemrfenergizedcrystal");
        setRegistryName("itemrfenergizedcrystal");
    }
    public void registerItemModel() {
	    ModelLoader.setCustomModelResourceLocation(ModItems.itemrfenergizedcrystal, 0, new ModelResourceLocation(ModItems.itemrfenergizedcrystal.getRegistryName(), "inventory"));
	}
}
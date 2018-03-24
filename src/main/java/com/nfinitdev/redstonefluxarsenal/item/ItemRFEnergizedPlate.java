package com.nfinitdev.redstonefluxarsenal.item;

import com.nfinitdev.redstonefluxarsenal.init.ModItems;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

public class ItemRFEnergizedPlate extends ItemBase {

    public ItemRFEnergizedPlate()
    {
        super();
        setUnlocalizedName("redstonefluxarsenal.itemrfenergizedplate");
        setRegistryName("itemrfenergizedplate");
    }
    public void registerItemModel() {
	    ModelLoader.setCustomModelResourceLocation(ModItems.itemrfenergizedplate, 0, new ModelResourceLocation(ModItems.itemrfenergizedplate.getRegistryName(), "inventory"));
	}
}
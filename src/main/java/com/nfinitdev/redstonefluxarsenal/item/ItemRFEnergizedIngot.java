package com.nfinitdev.redstonefluxarsenal.item;

import com.nfinitdev.redstonefluxarsenal.init.ModItems;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

public class ItemRFEnergizedIngot extends ItemBase {

    public ItemRFEnergizedIngot()
    {
        super();
        setUnlocalizedName("redstonefluxarsenal.itemrfenergizedingot");
        setRegistryName("itemrfenergizedingot");
    }
    public void registerItemModel() {
	    ModelLoader.setCustomModelResourceLocation(ModItems.itemrfenergizedingot, 0, new ModelResourceLocation(ModItems.itemrfenergizedingot.getRegistryName(), "inventory"));
	}
}
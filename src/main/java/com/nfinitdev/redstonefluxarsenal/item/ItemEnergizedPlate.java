package com.nfinitdev.redstonefluxarsenal.item;

import com.nfinitdev.redstonefluxarsenal.init.ModItems;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

public class ItemEnergizedPlate extends ItemBase {

    public ItemEnergizedPlate()
    {
        super();
        setUnlocalizedName("redstonefluxarsenal.itemenergizedplate");
        setRegistryName("itemenergizedplate");
    }
    public void registerItemModel() {
	    ModelLoader.setCustomModelResourceLocation(ModItems.itemrfsword, 0, new ModelResourceLocation(ModItems.itemrfsword.getRegistryName(), "inventory"));
	}
}
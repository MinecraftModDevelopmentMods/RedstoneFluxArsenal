package com.nfinitdev.redstonefluxarsenal.item;

import com.nfinitdev.redstonefluxarsenal.init.ModItems;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

public class ItemRFEnergizedGem extends ItemBase {

    public ItemRFEnergizedGem()
    {
        super();
        setUnlocalizedName("redstonefluxarsenal.itemrfenergizedgem");
        setRegistryName("itemrfenergizedgem");
    }
    public void registerItemModel() {
	    ModelLoader.setCustomModelResourceLocation(ModItems.itemrfenergizedgem, 0, new ModelResourceLocation(ModItems.itemrfenergizedgem.getRegistryName(), "inventory"));
	}
}
package com.nfinitdev.redstonefluxarsenal.item;

import com.nfinitdev.redstonefluxarsenal.init.ModItems;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

public class ItemEnergizedIngot extends ItemBase {

    public ItemEnergizedIngot()
    {
        super();
        setUnlocalizedName("redstonefluxarsenal.itemenergizedingot");
        setRegistryName("itemenergizedingot");
    }
    public void registerItemModel() {
	    ModelLoader.setCustomModelResourceLocation(ModItems.itemrfsword, 0, new ModelResourceLocation(ModItems.itemrfsword.getRegistryName(), "inventory"));
	}
}
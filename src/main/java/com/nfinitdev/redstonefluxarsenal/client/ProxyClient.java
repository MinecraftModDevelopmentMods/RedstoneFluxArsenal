package com.nfinitdev.redstonefluxarsenal.client;

import com.nfinitdev.redstonefluxarsenal.Main;
import com.nfinitdev.redstonefluxarsenal.common.ProxyCommon;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ProxyClient extends ProxyCommon {
    
	@Override
	public void registerItemRenderer(Item item, int meta, String id) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(Main.instance + ":" + id, "inventory"));
	}

	@Override
    public void preInit(FMLPreInitializationEvent e) {
		super.preInit(e);	
		
		
		/*
	    ModelLoader.setCustomModelResourceLocation(Items.itemrfpickaxe, 0, new ModelResourceLocation(Items.itemrfpickaxe.getRegistryName(), "inventory"));

	    //RF Armor
	    ModelLoader.setCustomModelResourceLocation(Items.rfArmorHelmet, 3, new ModelResourceLocation(Items.rfArmorHelmet.getRegistryName(), "inventory"));
	    ModelLoader.setCustomModelResourceLocation(Items.rfArmorBoots, 0, new ModelResourceLocation(Items.rfArmorBoots.getRegistryName(), "inventory"));
	    ModelLoader.setCustomModelResourceLocation(Items.rfArmorChestplate, 2, new ModelResourceLocation(Items.rfArmorChestplate.getRegistryName(), "inventory"));
	    ModelLoader.setCustomModelResourceLocation(Items.rfArmorLeggings, 1, new ModelResourceLocation(Items.rfArmorLeggings.getRegistryName(), "inventory"));

	    //Capacitors RF
	    ModelLoader.setCustomModelResourceLocation(Items.itemcapacitorRF, 0, new ModelResourceLocation(Items.itemcapacitorRF.getRegistryName(), "inventory"));
	    ModelLoader.setCustomModelResourceLocation(Items.itemcapacitorTier2RF, 0, new ModelResourceLocation(Items.itemcapacitorTier2RF.getRegistryName(), "inventory"));
	    ModelLoader.setCustomModelResourceLocation(Items.itemcapacitorTier3RF, 0, new ModelResourceLocation(Items.itemcapacitorTier3RF.getRegistryName(), "inventory"));
	    ModelLoader.setCustomModelResourceLocation(Items.itemcapacitorCreativeRF, 0, new ModelResourceLocation(Items.itemcapacitorCreativeRF.getRegistryName(), "inventory"));
	    
	    //RF Tools
	   // ModelLoader.setCustomModelResourceLocation(Items.itemrfpickaxe, 0, new ModelResourceLocation(Items.itemrfpickaxe.getRegistryName(), "inventory"));
	    ModelLoader.setCustomModelResourceLocation(Items.itemrfshovel, 0, new ModelResourceLocation(Items.itemrfshovel.getRegistryName(), "inventory"));
	    ModelLoader.setCustomModelResourceLocation(Items.itemrfsword, 0, new ModelResourceLocation(Items.itemrfsword.getRegistryName(), "inventory"));
	    ModelLoader.setCustomModelResourceLocation(Items.itemrfaxe, 0, new ModelResourceLocation(Items.itemrfaxe.getRegistryName(), "inventory"));
	    ModelLoader.setCustomModelResourceLocation(Items.itemrfhoe, 0, new ModelResourceLocation(Items.itemrfhoe.getRegistryName(), "inventory"));
	    
	    //Items
	    ModelLoader.setCustomModelResourceLocation(Items.itemrfenergizedcrystal, 0, new ModelResourceLocation(Items.itemrfenergizedcrystal.getRegistryName(), "inventory"));
	    ModelLoader.setCustomModelResourceLocation(Items.itemrfenergizedgem, 0, new ModelResourceLocation(Items.itemrfenergizedgem.getRegistryName(), "inventory"));
	    ModelLoader.setCustomModelResourceLocation(Items.itemrfdarkingot, 0, new ModelResourceLocation(Items.itemrfdarkingot.getRegistryName(), "inventory"));

	    ModelLoader.setCustomModelResourceLocation(Items.itemrfenergizedingot, 0, new ModelResourceLocation(Items.itemrfenergizedingot.getRegistryName(), "inventory"));
	    ModelLoader.setCustomModelResourceLocation(Items.itemrfenergizedplate, 0, new ModelResourceLocation(Items.itemrfenergizedplate.getRegistryName(), "inventory"));
	    ModelLoader.setCustomModelResourceLocation(Items.itemcomponent, 0, new ModelResourceLocation(Items.itemcomponent.getRegistryName(), "inventory"));
	    ModelLoader.setCustomModelResourceLocation(Items.itemtoolhandle, 0, new ModelResourceLocation(Items.itemtoolhandle.getRegistryName(), "inventory"));
	    ModelLoader.setCustomModelResourceLocation(Items.itemtoolrfwrench, 0, new ModelResourceLocation(Items.itemtoolrfwrench.getRegistryName(), "inventory"));
*/
	}
	
	@Override
    public void init(FMLInitializationEvent e) {	
    }
}

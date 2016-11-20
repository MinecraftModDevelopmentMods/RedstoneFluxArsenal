package com.nfinitdev.redstonefluxarsenal.client;

import com.nfinitdev.redstonefluxarsenal.Main;
import com.nfinitdev.redstonefluxarsenal.common.ProxyCommon;
import com.nfinitdev.redstonefluxarsenal.crafting.ModCrafting;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Items;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

public class ProxyClient extends ProxyCommon {
    
    @Override
    public void preInit () {
        
       // ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(TeslaArsenal.blockCharger), 0, new ModelResourceLocation(TeslaArsenal.blockCharger.getRegistryName(), "inventory"));

    //RF Tools
    ModelLoader.setCustomModelResourceLocation(Main.itemrfpickaxe, 0, new ModelResourceLocation(Main.itemrfpickaxe.getRegistryName(), "inventory"));
    ModelLoader.setCustomModelResourceLocation(Main.itemrfshovel, 0, new ModelResourceLocation(Main.itemrfshovel.getRegistryName(), "inventory"));
    ModelLoader.setCustomModelResourceLocation(Main.itemrfsword, 0, new ModelResourceLocation(Main.itemrfsword.getRegistryName(), "inventory"));
    ModelLoader.setCustomModelResourceLocation(Main.itemrfaxe, 0, new ModelResourceLocation(Main.itemrfaxe.getRegistryName(), "inventory"));
    ModelLoader.setCustomModelResourceLocation(Main.itemrfhoe, 0, new ModelResourceLocation(Main.itemrfhoe.getRegistryName(), "inventory"));

    //RF Armor
    ModelLoader.setCustomModelResourceLocation(Main.rfArmorHelmet, 0, new ModelResourceLocation(Main.rfArmorHelmet.getRegistryName(), "inventory"));
    ModelLoader.setCustomModelResourceLocation(Main.rfArmorBoots, 0, new ModelResourceLocation(Main.rfArmorBoots.getRegistryName(), "inventory"));
    ModelLoader.setCustomModelResourceLocation(Main.rfArmorChestplate, 0, new ModelResourceLocation(Main.rfArmorChestplate.getRegistryName(), "inventory"));
    ModelLoader.setCustomModelResourceLocation(Main.rfArmorLeggings, 0, new ModelResourceLocation(Main.rfArmorLeggings.getRegistryName(), "inventory"));

    //Items
    ModelLoader.setCustomModelResourceLocation(Main.itemrfenergizedcrystal, 0, new ModelResourceLocation(Main.itemrfenergizedcrystal.getRegistryName(), "inventory"));

    ModelLoader.setCustomModelResourceLocation(Main.itemrfenergizedingot, 0, new ModelResourceLocation(Main.itemrfenergizedingot.getRegistryName(), "inventory"));
    ModelLoader.setCustomModelResourceLocation(Main.itemrfenergizedplate, 0, new ModelResourceLocation(Main.itemrfenergizedplate.getRegistryName(), "inventory"));
    ModelLoader.setCustomModelResourceLocation(Main.itemcomponent, 0, new ModelResourceLocation(Main.itemcomponent.getRegistryName(), "inventory"));
    ModelLoader.setCustomModelResourceLocation(Main.itemtoolhandle, 0, new ModelResourceLocation(Main.itemtoolhandle.getRegistryName(), "inventory"));
    ModelLoader.setCustomModelResourceLocation(Main.itemteslawrench, 0, new ModelResourceLocation(Main.itemteslawrench.getRegistryName(), "inventory"));

    //Capacitors RF
    ModelLoader.setCustomModelResourceLocation(Main.itemcapacitorRF, 0, new ModelResourceLocation(Main.itemcapacitorRF.getRegistryName(), "inventory"));
    ModelLoader.setCustomModelResourceLocation(Main.itemcapacitorTier2RF, 0, new ModelResourceLocation(Main.itemcapacitorTier2RF.getRegistryName(), "inventory"));
    ModelLoader.setCustomModelResourceLocation(Main.itemcapacitorTier3RF, 0, new ModelResourceLocation(Main.itemcapacitorTier3RF.getRegistryName(), "inventory"));
    ModelLoader.setCustomModelResourceLocation(Main.itemcapacitorCreativeRF, 0, new ModelResourceLocation(Main.itemcapacitorCreativeRF.getRegistryName(), "inventory"));
    

    
    
    }
    
    

    
    
    
    
    
    
    
}

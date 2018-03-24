package com.nfinitdev.redstonefluxarsenal;


import com.nfinitdev.redstonefluxarsenal.common.ProxyCommon;
import com.nfinitdev.redstonefluxarsenal.init.ModItems;
import com.nfinitdev.redstonefluxarsenal.init.Recipes;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;



@Mod(modid = "redstonefluxarsenal", name = "Redstone Flux Arsenal", version = "1.2.0",dependencies = "required-after:forge", updateJSON = "https://raw.githubusercontent.com/knoxhack/Tesla-Arsenal/master/update.json")
public class Main {
    
    @SidedProxy(serverSide = "com.nfinitdev.redstonefluxarsenal.common.ProxyCommon", clientSide = "com.nfinitdev.redstonefluxarsenal.client.ProxyClient")
    public static ProxyCommon proxy;
    
    @Mod.Instance
    public static Main instance;
    
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	proxy.preInit(event);
    }
    
    @Mod.EventHandler
    public void init(FMLInitializationEvent e){
    	proxy.init(e);
		Recipes.init();
    }
    
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e)
    {
    	proxy.postInit(e);
    	
    }
	@Mod.EventBusSubscriber
	public static class RegistrationHandler {
		
		@SubscribeEvent
		public static void registerBlocks(RegistryEvent.Register<Block> event) {
			//Blocks.register(event.getRegistry());
		}
		
		@SubscribeEvent
		public static void registerItems(RegistryEvent.Register<Item> event) {
		      ModItems.register(event.getRegistry());
			//Blocks.registerItemBlocks(event.getRegistry());

			}
		@SubscribeEvent
		public static void registerItemModels(ModelRegistryEvent event) {
		
		
		{
			//MCe
			ModItems.registerModels();
			//Blocks.registerItemModels();

		}

		}
}
}

package com.nfinitdev.redstonefluxarsenal;

import com.nfinitdev.redstonefluxarsenal.common.ProxyCommon;
import com.nfinitdev.redstonefluxarsenal.crafting.ModCrafting;
import com.nfinitdev.redstonefluxarsenal.creativetab.CreativeTabMain;
import com.nfinitdev.redstonefluxarsenal.item.*;

import net.minecraft.item.ItemArmor;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.inventory.EntityEquipmentSlot;



@Mod(modid = "redstonefluxarsenal", name = "Redstone Flux Arsenal", version = "1.0",dependencies = "required-after:Forge", updateJSON = "https://raw.githubusercontent.com/knoxhack/Tesla-Arsenal/master/update.json")
public class Main {
    
    @SidedProxy(serverSide = "com.nfinitdev.redstonefluxarsenal.common.ProxyCommon", clientSide = "com.nfinitdev.redstonefluxarsenal.client.ProxyClient")
    public static ProxyCommon proxy;
    
    @Mod.Instance("redstonefluxarsenal")
    public static Main instance;
    public static CreativeTabs tab;
    public static Item itemteslawrench,itemnetherstardust,itemteslariumdust,itemteslariumingot,itemtoolhandle;
	public static Main MODID;
	ToolMaterial WOODTOOL;
	
	
	//Armor Plates
	public static Item itemrfenergizedplate;
	public static Item itemrfenergizedcrystal;

	public static Item itemrfenergizedingot;
	public static Item itemcomponent;

	
	//Armor Plates
	public static Item coreTesla;
	public static Item coreRF;
	public static Item coreFE;

	
	public static Item itemcapacitorRF;
	public static Item itemcapacitorTier2RF;
	public static Item itemcapacitorTier3RF;
	public static Item itemcapacitorCreativeRF;


	//Armor (Helmet)
	public static Item rfArmorHelmet;
	//Armor (Chestplate)
	public static Item rfArmorChestplate;
	//Armor (Leggings)
	public static Item rfArmorLeggings;
	//Armor (Boots)
	public static Item rfArmorBoots;
	
	
	//Tools (Redstone Flux)
	public static Item itemrfpickaxe;
	public static Item itemrfaxe;
	public static Item itemrfshovel;
	public static Item itemrfhoe;
	public static Item itemrfsword;
	//Tools (Forge Energy)



	
	
    @EventHandler
    public void preInit (FMLPreInitializationEvent event) {
      
        tab = new CreativeTabMain();

        //Tools (Redstone Flux)
         itemrfpickaxe = registerItem(new ItemRFPickaxe());
         itemrfaxe = registerItem(new ItemRFAxe());
         itemrfshovel = registerItem(new ItemRFShovel());
         itemrfhoe = registerItem(new ItemRFHoe());
         itemrfsword = registerItem(new ItemRFSword(WOODTOOL.DIAMOND));
      
      

        
    	//Items
       // itemnetherstardust = registerItem(new ItemNetherStarDust());
       // itemteslariumdust = registerItem(new ItemTeslariumDust());
       // itemteslariumingot = registerItem(new ItemTeslariumIngot());
        itemtoolhandle = registerItem(new ItemToolHandle());
        itemteslawrench = registerItem(new ItemToolWrench());
        

        
        //Capacitor Tier 2

       
       itemcapacitorRF = registerItem(new ItemRFCapacitor1());
       itemcapacitorTier2RF = registerItem(new ItemRFCapacitor2());
       itemcapacitorTier3RF = registerItem(new ItemRFCapacitor3());
       itemcapacitorCreativeRF = registerItem(new ItemRFCapacitorCreative());

       
        
       //Dark Steel
       itemrfenergizedcrystal = registerItem(new ItemRFEnergizedCrystal());

       itemrfenergizedplate = registerItem(new ItemRFEnergizedPlate());
       itemrfenergizedingot = registerItem(new ItemRFEnergizedIngot());
       itemcomponent = registerItem(new ItemComponent());
       
       
       
       
       

		
    	//Armor (Helmet)(Redstone Flux)
        rfArmorHelmet = new ItemRFEnergizedArmor(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.HEAD, 0, 200,
				200, 100000, 0, 0).setRegistryName("rfenergizedarmour.helmet");
		GameRegistry.register(rfArmorHelmet);
		

		

		
    	//Armor (Chestplate)(Redstone Flux)
		rfArmorChestplate = new ItemRFEnergizedArmor(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.CHEST, 0,
				200, 200, 100000, 0, 0).setRegistryName("rfenergizedarmour.chestplate");
		GameRegistry.register(rfArmorChestplate);
		

		

		
    	//Armor (Leggings)(Redstone Flux)
		rfArmorLeggings = new ItemRFEnergizedArmor(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.LEGS, 0,
				200, 200, 100000, 0, 0).setRegistryName("rfenergizedarmour.leggings");
		GameRegistry.register(rfArmorLeggings);


		
    	//Armor (Boots)(Redstone Flux)
		rfArmorBoots = new ItemRFEnergizedArmor(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.FEET, 0, 200,
				200, 100000, 0, 0).setRegistryName("rfenergizedarmour.boots");
		GameRegistry.register(rfArmorBoots);

		
        
        proxy.preInit();
    }
	public static Item registerItem (Item item) {
        GameRegistry.register(item);
        return item;
    }
    
    public static boolean hasTesla() {
        return Loader.isModLoaded("tesla");
    }
    
    @EventHandler
    public void init(FMLInitializationEvent e) {
    	
        ModCrafting.initCrafting();

    }
    }

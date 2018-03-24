package com.nfinitdev.redstonefluxarsenal.init;

import com.nfinitdev.redstonefluxarsenal.item.ItemComponent;
import com.nfinitdev.redstonefluxarsenal.item.ItemRFAxe;
import com.nfinitdev.redstonefluxarsenal.item.ItemRFCapacitor1;
import com.nfinitdev.redstonefluxarsenal.item.ItemRFCapacitor2;
import com.nfinitdev.redstonefluxarsenal.item.ItemRFCapacitor3;
import com.nfinitdev.redstonefluxarsenal.item.ItemRFCapacitorCreative;
import com.nfinitdev.redstonefluxarsenal.item.ItemRFDarkIngot;
import com.nfinitdev.redstonefluxarsenal.item.ItemRFEnergizedArmor;
import com.nfinitdev.redstonefluxarsenal.item.ItemRFEnergizedCrystal;
import com.nfinitdev.redstonefluxarsenal.item.ItemRFEnergizedGem;
import com.nfinitdev.redstonefluxarsenal.item.ItemRFEnergizedIngot;
import com.nfinitdev.redstonefluxarsenal.item.ItemRFEnergizedPlate;
import com.nfinitdev.redstonefluxarsenal.item.ItemRFHoe;
import com.nfinitdev.redstonefluxarsenal.item.ItemRFPickaxe;
import com.nfinitdev.redstonefluxarsenal.item.ItemRFShovel;
import com.nfinitdev.redstonefluxarsenal.item.ItemRFSword;
import com.nfinitdev.redstonefluxarsenal.item.ItemToolHandle;
import com.nfinitdev.redstonefluxarsenal.item.ItemToolRFWrench;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {

	public static ItemRFEnergizedArmor rfArmorHelmet = (ItemRFEnergizedArmor) new ItemRFEnergizedArmor(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.HEAD, 0, 500,
			500, 500000, 0, 0).setRegistryName("rfenergizedarmour.helmet");
	
	public static ItemRFEnergizedArmor rfArmorChestplate = (ItemRFEnergizedArmor) new ItemRFEnergizedArmor(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.CHEST, 0,
			500, 500, 500000, 0, 0).setRegistryName("rfenergizedarmour.chestplate");
	
	public static ItemRFEnergizedArmor rfArmorLeggings = (ItemRFEnergizedArmor) new ItemRFEnergizedArmor(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.LEGS, 0,
			500, 500, 500000, 0, 0).setRegistryName("rfenergizedarmour.leggings");
	
	public static ItemRFEnergizedArmor rfArmorBoots = (ItemRFEnergizedArmor) new ItemRFEnergizedArmor(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.FEET, 0, 500,
			500, 500000, 0, 0).setRegistryName("rfenergizedarmour.boots");
    //Tools (Redstone Flux)
	
	public static ItemRFPickaxe itemrfpickaxe = (ItemRFPickaxe) new ItemRFPickaxe();
	public static ItemRFAxe itemrfaxe = (ItemRFAxe) new ItemRFAxe();
	public static ItemRFShovel itemrfshovel = (ItemRFShovel) new ItemRFShovel();
	public static ItemRFHoe itemrfhoe = (ItemRFHoe) new ItemRFHoe();
	public static ItemRFSword itemrfsword = (ItemRFSword) new ItemRFSword(ToolMaterial.DIAMOND);

	public static ItemToolHandle itemtoolhandle = (ItemToolHandle) new ItemToolHandle();
	public static ItemRFCapacitor1 itemcapacitorRF = (ItemRFCapacitor1) new ItemRFCapacitor1();
	public static ItemRFCapacitor2 itemcapacitorTier2RF = (ItemRFCapacitor2) new ItemRFCapacitor2();
	public static ItemRFCapacitor3 itemcapacitorTier3RF = (ItemRFCapacitor3) new ItemRFCapacitor3();
	public static ItemRFCapacitorCreative itemcapacitorCreativeRF = (ItemRFCapacitorCreative) new ItemRFCapacitorCreative();
	public static ItemRFEnergizedIngot itemrfenergizedingot = (ItemRFEnergizedIngot) new ItemRFEnergizedIngot();
	public static ItemRFEnergizedPlate itemrfenergizedplate = (ItemRFEnergizedPlate) new ItemRFEnergizedPlate();
	public static ItemRFEnergizedGem itemrfenergizedgem = (ItemRFEnergizedGem) new ItemRFEnergizedGem();
	public static ItemRFEnergizedCrystal itemrfenergizedcrystal = (ItemRFEnergizedCrystal) new ItemRFEnergizedCrystal();
	public static ItemRFDarkIngot itemrfdarkingot = (ItemRFDarkIngot) new ItemRFDarkIngot();
	public static ItemComponent itemcomponent = (ItemComponent) new ItemComponent();
	public static ItemToolRFWrench itemtoolrfwrench = (ItemToolRFWrench) new ItemToolRFWrench();

	public static void register(IForgeRegistry<Item> registry) {
		registry.registerAll(
				rfArmorHelmet,
				rfArmorChestplate,
				rfArmorLeggings,
				rfArmorBoots,
				itemrfpickaxe,
				itemrfaxe,
				itemrfshovel,
				itemrfhoe,
				itemrfsword,
				itemtoolhandle,
				itemcapacitorRF,
				itemcapacitorTier2RF,
				itemcapacitorTier3RF,
				itemcapacitorCreativeRF,
				itemrfenergizedingot,
				itemrfenergizedplate,
				itemrfenergizedgem,
				itemrfenergizedcrystal,
				itemrfdarkingot,
				itemcomponent,
				itemtoolrfwrench
			
		);
	}

	
	
	public static void registerModels() {
		rfArmorHelmet.registerItemModel();
		rfArmorChestplate.registerItemModel();
		rfArmorLeggings.registerItemModel();
		rfArmorBoots.registerItemModel();
		itemrfpickaxe.registerItemModel();
		itemrfaxe.registerItemModel();
		itemrfshovel.registerItemModel();
		itemrfhoe.registerItemModel();
		itemrfsword.registerItemModel();
		itemtoolhandle.registerItemModel();
		itemcapacitorRF.registerItemModel();
		itemcapacitorTier2RF.registerItemModel();
		itemcapacitorTier3RF.registerItemModel();
		itemcapacitorCreativeRF.registerItemModel();
		itemrfenergizedingot.registerItemModel();
		itemrfenergizedplate.registerItemModel();
		itemrfenergizedgem.registerItemModel();
		itemrfenergizedcrystal.registerItemModel();
		itemrfdarkingot.registerItemModel();
		itemcomponent.registerItemModel();
		itemtoolrfwrench.registerItemModel();

	}
}
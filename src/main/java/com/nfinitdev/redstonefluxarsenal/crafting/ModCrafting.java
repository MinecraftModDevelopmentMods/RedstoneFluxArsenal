package com.nfinitdev.redstonefluxarsenal.crafting;

import com.nfinitdev.redstonefluxarsenal.Main;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.GameRegistry;
public final class ModCrafting {

	public static void initCrafting() {

		
		GameRegistry.addRecipe(new ItemStack(Main.itemcomponent, 1), new Object[] {" # ", "ICI", " # ", '#', Items.REDSTONE, 'I', new ItemStack(Items.DYE, 1, 4),'C',Main.itemrfenergizedgem});
		GameRegistry.addRecipe(new ItemStack(Main.itemrfenergizedgem, 1), new Object[] {"###", "#C#", "###", '#', Items.REDSTONE, 'I', new ItemStack(Items.DYE, 1, 4),'C',Items.DIAMOND});
		GameRegistry.addRecipe(new ItemStack(Main.itemrfenergizedingot, 1), new Object[] {"###", "#C#", "###", '#', Items.REDSTONE, 'I', new ItemStack(Items.DYE, 1, 4),'C',Main.itemrfdarkingot});
		GameRegistry.addRecipe(new ItemStack(Main.itemrfenergizedplate, 4), new Object[] {"## ", "## ", "   ", '#', Main.itemrfenergizedingot});
		GameRegistry.addRecipe(new ItemStack(Main.itemcapacitorRF, 1), new Object[] {"C#C", "#I#", "C#C", '#', Items.REDSTONE, 'I',Main.itemcomponent, 'C',Blocks.GLASS});
		GameRegistry.addRecipe(new ItemStack(Main.itemcapacitorTier2RF, 1), new Object[] {"C#C", "#I#", "C#C", '#', Blocks.REDSTONE_BLOCK, 'I',Main.itemcomponent, 'C',Blocks.GLASS});
		GameRegistry.addRecipe(new ItemStack(Main.itemcapacitorTier3RF, 1), new Object[] {"C#C", "#I#", "C#C", '#', Blocks.REDSTONE_BLOCK, 'I',Main.itemcomponent, 'C',Blocks.IRON_BLOCK});
		GameRegistry.addRecipe(new ItemStack(Main.itemrfpickaxe, 1), new Object[] {"###", " C ", " I ", '#', Main.itemrfenergizedingot, 'I',Main.itemtoolhandle, 'C',Main.itemcapacitorRF});
		GameRegistry.addRecipe(new ItemStack(Main.itemrfaxe, 1), new Object[] {"## ", "#C ", " I ", '#', Main.itemrfenergizedingot, 'I',Main.itemtoolhandle, 'C',Main.itemcapacitorRF});
		GameRegistry.addRecipe(new ItemStack(Main.itemrfshovel, 1), new Object[] {" # ", " C ", " I ", '#',Main.itemrfenergizedingot, 'I',Main.itemtoolhandle, 'C',Main.itemcapacitorRF});
		GameRegistry.addRecipe(new ItemStack(Main.itemrfsword, 1), new Object[] {" # ", " I ", " C ", '#', Main.itemrfenergizedingot, 'I',Main.itemtoolhandle, 'C',Main.itemcapacitorRF});
		GameRegistry.addRecipe(new ItemStack(Main.itemrfhoe, 1), new Object[] {"## ", " C ", " I ", '#', Main.itemrfenergizedingot, 'I',Main.itemtoolhandle, 'C',Main.itemcapacitorRF});
		GameRegistry.addRecipe(new ItemStack(Main.itemtoolhandle, 1), new Object[] {"   ", " I ", " I ",'I', Main.itemrfenergizedingot});
		GameRegistry.addRecipe(new ItemStack(Main.rfArmorHelmet, 1), new Object[] {"###", "#C#", "   ", '#', Main.itemrfenergizedplate, 'C',Main.itemcapacitorRF});
		GameRegistry.addRecipe(new ItemStack(Main.rfArmorChestplate, 1), new Object[] {"#C#", "###", "###", '#', Main.itemrfenergizedplate, 'C',Main.itemcapacitorRF});
		GameRegistry.addRecipe(new ItemStack(Main.rfArmorLeggings, 1), new Object[] {"###", "#C#", "# #", '#', Main.itemrfenergizedplate, 'C',Main.itemcapacitorRF});
		GameRegistry.addRecipe(new ItemStack(Main.rfArmorBoots, 1), new Object[] {"   ", "# #", "#C#", '#', Main.itemrfenergizedplate, 'C',Main.itemcapacitorRF});
		GameRegistry.addSmelting(Items.IRON_INGOT, new ItemStack(Main.itemrfdarkingot), 1.0F);

	}	
	

	}
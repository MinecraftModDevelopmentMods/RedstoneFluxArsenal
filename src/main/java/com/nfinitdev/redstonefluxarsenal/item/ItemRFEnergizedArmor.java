package com.nfinitdev.redstonefluxarsenal.item;

import java.util.List;

import com.nfinitdev.redstonefluxarsenal.Main;

import cofh.api.energy.IEnergyContainerItem;

import com.mojang.realmsclient.gui.ChatFormatting;

import net.minecraft.client.resources.I18n;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemRFEnergizedArmor extends ItemRFArmor  implements IEnergyContainerItem{
	
	
    private static String name;
	public long cost = 200;
	public ItemRFEnergizedArmor(ArmorMaterial material, EntityEquipmentSlot slot, long maxCapacity, long input, long output, int capacity, int maxReceive, int maxExtract) {
		super(material, slot, capacity, name);
		if (slot == EntityEquipmentSlot.HEAD)
			setUnlocalizedName( "redstonefluxarsenal.rfenergizedarmour.helmet");
		if (slot == EntityEquipmentSlot.CHEST)
			setUnlocalizedName( "redstonefluxarsenal.rfenergizedarmour.chestplate");
		if (slot == EntityEquipmentSlot.LEGS)
			setUnlocalizedName( "redstonefluxarsenal.rfenergizedarmour.leggings");
		if (slot == EntityEquipmentSlot.FEET)
			setUnlocalizedName( "redstonefluxarsenal.rfenergizedarmour.boots");
        setCreativeTab(Main.tab);
	
	}

	@Override
	@SideOnly(Side.CLIENT)
	public boolean showDurabilityBar(ItemStack stack) {
		return this.getEnergyStored(stack) < this.getMaxEnergyStored(stack);
	}

	public double getDurabilityForDisplay(ItemStack stack) {
		return 1 - ((double) this.getEnergyStored(stack) / (double) this.getMaxEnergyStored(stack));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
        tooltip.add(ChatFormatting.DARK_RED + I18n.format("")+ this.getEnergyStored(stack) + "/" + this.getMaxEnergyStored(stack)+ I18n.format(" RF"));

	}
	
	@Override
	public String getArmorTexture(ItemStack itemStack, Entity entity, EntityEquipmentSlot slot, String layer)
	{
		if(armorType == EntityEquipmentSlot.LEGS)
		{
			return "redstonefluxarsenal:textures/armor/RF_armor_layer_2.png";
		}
		return "redstonefluxarsenal:textures/armor/RF_armor_layer_1.png";
	}
	

	public int damageArmor(EntityLivingBase entity, ItemStack stack, DamageSource source, int damage,
	int slot)
	
	{
	
	int cost = 200;
	this.extractEnergy(stack, cost, true);
	
    return cost;

		
		
}
    		
}
    
    
    
	
	
	
	
	

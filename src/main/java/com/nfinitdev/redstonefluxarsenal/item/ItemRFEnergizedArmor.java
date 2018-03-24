package com.nfinitdev.redstonefluxarsenal.item;



import com.mojang.realmsclient.gui.ChatFormatting;
import com.nfinitdev.redstonefluxarsenal.init.ModItems;

import cofh.redstoneflux.api.IEnergyContainerItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.world.World;



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
       // setCreativeTab(Main.tab);
	
	}

	@Override
	@SideOnly(Side.CLIENT)
	public boolean showDurabilityBar(ItemStack stack) {
		return this.getEnergyStored(stack) < this.getMaxEnergyStored(stack);
	}
	@SideOnly(Side.CLIENT)
	@Override
	public double getDurabilityForDisplay(ItemStack stack) {
		return 1 - ((double) this.getEnergyStored(stack) / (double) this.getMaxEnergyStored(stack));
	}
	
    /**
     * Returns the packed int RGB value used to render the durability bar in the GUI.
     * Defaults to a value based on the hue scaled based on {@link #getDurabilityForDisplay}, but can be overriden.
     *
     * @param stack Stack to get durability from
     * @return A packed RGB value for the durability colour (0x00RRGGBB)
     */
	@SideOnly(Side.CLIENT)
	@Override
    public int getRGBDurabilityForDisplay(ItemStack stack)
    {
        return MathHelper.hsvToRGB(Math.max(0.0F, (float) (1.0F - getDurabilityForDisplay(stack))) / 237.0F, 18.0F, 18.0F);
    }

	
	/*
	@Override
	public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
        tooltip.add(ChatFormatting.DARK_RED + I18n.format("")+ this.getEnergyStored(stack) + "/" + this.getMaxEnergyStored(stack)+ I18n.format(" RF"));

	}
	*/
	
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn)
    {
        tooltip.add(ChatFormatting.WHITE + I18n.format("Charge: ")+ ChatFormatting.RED + this.getEnergyStored(stack) + "/" + this.getMaxEnergyStored(stack)+ I18n.format(" RF"));
    }
    
    
    
    @Override
    public int getItemEnchantability()
    {
        return 0;
    }
	@Override
	public String getArmorTexture(ItemStack itemStack, Entity entity, EntityEquipmentSlot slot, String layer)
	{
		if(armorType == EntityEquipmentSlot.LEGS)
		{
			return "redstonefluxarsenal:textures/armor/rf_armor_layer_2.png";
		}
		return "redstonefluxarsenal:textures/armor/rf_armor_layer_1.png";
	}
	

	public int damageArmor(EntityLivingBase entity, ItemStack stack, DamageSource source, int damage,
	int slot)
	
	{
	
	int cost = 200;
	this.extractEnergy(stack, cost, true);
	
    return cost;

		
		
}
    public void registerItemModel() {
	    ModelLoader.setCustomModelResourceLocation(ModItems.rfArmorHelmet, 0, new ModelResourceLocation(ModItems.rfArmorHelmet.getRegistryName(), "inventory"));
	    ModelLoader.setCustomModelResourceLocation(ModItems.rfArmorChestplate, 0, new ModelResourceLocation(ModItems.rfArmorChestplate.getRegistryName(), "inventory"));
	    ModelLoader.setCustomModelResourceLocation(ModItems.rfArmorLeggings, 0, new ModelResourceLocation(ModItems.rfArmorLeggings.getRegistryName(), "inventory"));
	    ModelLoader.setCustomModelResourceLocation(ModItems.rfArmorBoots, 0, new ModelResourceLocation(ModItems.rfArmorBoots.getRegistryName(), "inventory"));

	}
}
    
    
    
	
	
	
	
	

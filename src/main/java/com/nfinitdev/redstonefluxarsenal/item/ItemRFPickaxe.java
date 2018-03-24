package com.nfinitdev.redstonefluxarsenal.item;
import java.util.List;

import javax.annotation.Nullable;

import com.mojang.realmsclient.gui.ChatFormatting;
import com.nfinitdev.redstonefluxarsenal.init.ModItems;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemRFPickaxe extends ItemRF {

	protected double distanceFromPlayer;
	protected static String name = "itemrfpickaxe";

	public ItemRFPickaxe() {
		super(500000, 100, name);
		setMaxStackSize(1);
		this.distanceFromPlayer = 6.5;
		canRepair = false;
		setMaxDamage(0);

	}

	@Override
	@SideOnly(Side.CLIENT)
	public boolean showDurabilityBar(ItemStack stack) {
		return this.getEnergyStored(stack) < this.getMaxEnergyStored(stack);
	}

	public double getDurabilityForDisplay(ItemStack stack) {
		return 1 - ((double) this.getEnergyStored(stack) / (double) this.getMaxEnergyStored(stack));
	}

	@Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn)
    {
        tooltip.add(ChatFormatting.WHITE + I18n.format("Charge: ")+ ChatFormatting.RED + this.getEnergyStored(stack) + "/" + this.getMaxEnergyStored(stack)+ I18n.format(" RF"));
    }


    @Override
    public boolean onBlockDestroyed(ItemStack stack, World worldIn, IBlockState state, BlockPos pos, EntityLivingBase entityLiving)
    {
    	int cost = 200;
		this.extractEnergy(stack, cost, false);
		return true;
    }
	@SideOnly(Side.CLIENT)
	@Override
    public int getRGBDurabilityForDisplay(ItemStack stack)
    {
        return MathHelper.hsvToRGB(Math.max(0.0F, (float) (1.0F - getDurabilityForDisplay(stack))) / 237.0F, 18.0F, 18.0F);
    }
    @Override
    public boolean canHarvestBlock(IBlockState state)
    {
        return Items.DIAMOND_PICKAXE.canHarvestBlock(state);
    }
/*
    @Override
    public float getStrVsBlock(ItemStack stack, IBlockState state)
    {
        int cost = 200;
		if (this.getEnergyStored(stack) < cost)
        {
            return 0.5F;
        }
        if (Items.WOODEN_PICKAXE.getStrVsBlock(stack, state) > 1.0F)
        {
            return 5.5F;
        }
        else
        {
            return super.getStrVsBlock(stack, state);
        }
    }
    */
    public void registerItemModel() {
	    ModelLoader.setCustomModelResourceLocation(ModItems.itemrfpickaxe, 0, new ModelResourceLocation(ModItems.itemrfpickaxe.getRegistryName(), "inventory"));
	}
}

	



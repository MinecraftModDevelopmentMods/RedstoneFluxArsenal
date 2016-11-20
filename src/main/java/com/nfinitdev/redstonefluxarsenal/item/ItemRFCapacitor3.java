package com.nfinitdev.redstonefluxarsenal.item;
import java.util.Iterator;
import java.util.List;

import com.nfinitdev.redstonefluxarsenal.Main;
import com.mojang.realmsclient.gui.ChatFormatting;

import cofh.api.energy.IEnergyContainerItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.event.entity.player.PlayerPickupXpEvent;
import net.minecraftforge.fml.common.eventhandler.Event.Result;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemRFCapacitor3 extends ItemRF {

	protected double distanceFromPlayer;
	protected static String name = "itemrfcapacitortier3";

	public ItemRFCapacitor3() {
		super(5000000, 1000, name);
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

	@SideOnly(Side.CLIENT)
	@Override
	public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
        tooltip.add(ChatFormatting.GRAY + I18n.format("Charges other RF items in your inventory") );

        tooltip.add(ChatFormatting.DARK_RED + I18n.format("[Energy Mode: ON]") );

        tooltip.add(ChatFormatting.DARK_RED + I18n.format("")+ this.getEnergyStored(stack) + "/" + this.getMaxEnergyStored(stack)+ I18n.format(" RF"));

	}







    @Override
    public void onUpdate(ItemStack stack, World world, Entity entity, int itemSlot, boolean isSelected){
        if(!world.isRemote && entity instanceof EntityPlayer){
            EntityPlayer player = (EntityPlayer)entity;
            for(int i = 0; i < player.inventory.getSizeInventory(); i++){
                ItemStack slot = player.inventory.getStackInSlot(i);
                if(slot != null){
                    int received = 0;

                    Item item = slot.getItem();
                    if(item instanceof IEnergyContainerItem){
                        received = ((IEnergyContainerItem)item).receiveEnergy(slot, this.getEnergyStored(stack), false);
   
                    }

                    if(received > 0){
                        this.extractEnergy(stack, 2000, false);
                    }
                }
            }
        }
    }
}


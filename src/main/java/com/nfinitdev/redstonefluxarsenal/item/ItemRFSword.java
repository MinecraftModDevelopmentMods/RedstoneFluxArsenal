package com.nfinitdev.redstonefluxarsenal.item;
import java.util.Iterator;
import java.util.List;

import javax.annotation.Nullable;

import com.google.common.collect.Multimap;
import com.mojang.realmsclient.gui.ChatFormatting;
import com.nfinitdev.redstonefluxarsenal.init.ModItems;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.event.entity.player.PlayerPickupXpEvent;
import net.minecraftforge.fml.common.eventhandler.Event.Result;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.common.util.EnumHelper;
public class ItemRFSword extends ItemRF {

	protected double distanceFromPlayer;
	protected static String name = "itemrfsword";
	  ToolMaterial DIAMONTOOL = EnumHelper.addToolMaterial("DIAMONTOOL", 3, 1000, 15.0F, 4.0F, 30);
	  ToolMaterial WOODTOOL = EnumHelper.addToolMaterial("WOODTOOL", 3, 1000, 1.0F, 8.0F, 30);
	    private final Item.ToolMaterial material;
	    private float attackDamage;
		
	public ItemRFSword(ToolMaterial material) {
		super(500000, 100, name);
		setMaxStackSize(1);
		this.distanceFromPlayer = 6.5;
		canRepair = false;
		setMaxDamage(0);
        this.material = material;
       // this.attackDamage = 5.0F + material.getDamageVsEntity();

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

    public float getDamageVsEntity()
    {
        return this.material.getAttackDamage();
    }

    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)
    {
    	int cost = 200;
		if (this.getEnergyStored(stack) < cost)
    		return true;

		this.extractEnergy(stack, cost, false);

        return false;
    }

    public Multimap<String, AttributeModifier> getItemAttributeModifiers(EntityEquipmentSlot equipmentSlot)
    {
        @SuppressWarnings("deprecation")
		Multimap<String, AttributeModifier> multimap = super.getItemAttributeModifiers(equipmentSlot);

        if (equipmentSlot == EntityEquipmentSlot.MAINHAND)
        {
           // multimap.put(SharedMonsterAttributes.ATTACK_DAMAGE., new AttributeModifier(ATTACK_DAMAGE_MODIFIER, "Weapon modifier", (double)this.attackDamage, 0));
           // multimap.put(SharedMonsterAttributes.ATTACK_SPEED.getAttributeUnlocalizedName(), new AttributeModifier(ATTACK_SPEED_MODIFIER, "Weapon modifier", -2.4000000953674316D, 0));
        }

        return multimap;
    }
	 

	@Override
    public boolean onBlockDestroyed(ItemStack stack, World worldIn, IBlockState state, BlockPos pos, EntityLivingBase entityLiving)
    {
    	int cost = 200;
		this.extractEnergy(stack, cost, false);
		return true;
    }

    @Override
    public boolean canHarvestBlock(IBlockState state)
    {
        return Items.DIAMOND_SWORD.canHarvestBlock(state) ;
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
        if (Items.WOODEN_SWORD.getStrVsBlock(stack, state) > 1.0F )
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
	    ModelLoader.setCustomModelResourceLocation(ModItems.itemrfsword, 0, new ModelResourceLocation(ModItems.itemrfsword.getRegistryName(), "inventory"));
	}
	@SideOnly(Side.CLIENT)
	@Override
    public int getRGBDurabilityForDisplay(ItemStack stack)
    {
        return MathHelper.hsvToRGB(Math.max(0.0F, (float) (1.0F - getDurabilityForDisplay(stack))) / 237.0F, 18.0F, 18.0F);
    }
    }

	



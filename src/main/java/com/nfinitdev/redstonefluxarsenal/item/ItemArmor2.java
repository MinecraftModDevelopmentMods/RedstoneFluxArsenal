package com.nfinitdev.redstonefluxarsenal.item;

import com.nfinitdev.redstonefluxarsenal.Main;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemArmor2  extends ItemArmor{
	private String name = "";

	public ItemArmor2(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn,String name) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		this.name = name;
		setUnlocalizedName(this.name);
		setMaxStackSize(1);
		setMaxDamage(0);
        setCreativeTab(Main.tab);
	}



	


}

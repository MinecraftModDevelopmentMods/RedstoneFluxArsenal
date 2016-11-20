package com.nfinitdev.redstonefluxarsenal.item;

import net.minecraft.item.ItemStack;

public class ItemNetherStarDust extends ItemBase {

    public ItemNetherStarDust()
    {
        super();
        setUnlocalizedName("redstonefluxarsenal.itemnetherstardust");
        setRegistryName("itemnetherstardust");
    }

    @Override
    public boolean hasEffect(ItemStack stack) {
        return true;
    }
}
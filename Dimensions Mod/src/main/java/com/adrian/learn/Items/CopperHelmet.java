package com.adrian.learn.Items;

import net.minecraft.item.Item;


public class CopperHelmet extends Item{
    public CopperHelmet(){
        super(new Item.Properties().maxStackSize(1));
        setRegistryName("copper_helmet");
    }
}

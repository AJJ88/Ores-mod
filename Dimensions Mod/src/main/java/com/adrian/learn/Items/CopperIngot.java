package com.adrian.learn.Items;

import net.minecraft.item.Item;

public class CopperIngot extends Item {
    public CopperIngot() {
        super(new Item.Properties()
                .maxStackSize(64));
        setRegistryName("copper_ingot");
    }
}

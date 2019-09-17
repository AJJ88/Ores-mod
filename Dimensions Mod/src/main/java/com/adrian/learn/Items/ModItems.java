package com.adrian.learn.Items;

import com.adrian.learn.blocks.CopperOre;
import net.minecraft.item.ArmorMaterial;
import net.minecraftforge.registries.ObjectHolder;
import org.omg.DynamicAny.DynEnumHelper;

public class ModItems {
    @ObjectHolder("ores:copper_ingot")
    public static CopperIngot COPPER_INGOT;

    @ObjectHolder("ores:copper_helmet")
    public static CopperHelmet COPPER_HELMET;
}

package com.adrian.learn.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class CopperOre extends Block {

    public CopperOre() {
        super(Properties.create(Material.IRON)
                        .sound(SoundType.STONE)
                        .hardnessAndResistance(3.0f)
                        .lightValue(0)
                        .harvestLevel(1)
                        .harvestTool(ToolType.get("pickaxe"))
        );
        setRegistryName("copper_ore");
    }
}

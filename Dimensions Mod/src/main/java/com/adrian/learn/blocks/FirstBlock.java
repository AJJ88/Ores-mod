package com.adrian.learn.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class FirstBlock extends Block {
    public FirstBlock() {
        super(Properties.create(Material.IRON)
                        .sound(SoundType.METAL)
                        .hardnessAndResistance(2.0f)
                        .lightValue(0)
        );
        setRegistryName("firstblock");

    }
}

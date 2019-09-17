package com.adrian.learn;

import com.adrian.learn.Items.CopperIngot;
import com.adrian.learn.blocks.CopperOre;
import com.adrian.learn.blocks.FirstBlock;
import com.adrian.learn.blocks.ModBlocks;
import com.adrian.learn.setup.ClientProxy;
import com.adrian.learn.setup.IProxy;
import com.adrian.learn.setup.ModSetup;
import com.adrian.learn.setup.ServerProxy;
import com.adrian.learn.world.OreGeneration;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("ores")
public class ores
{
    public static ModSetup setup = new ModSetup();
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public ores() {
        // Register the com.adrian.learn.setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);



    }


    private void setup(final FMLCommonSetupEvent event)
    {
        OreGeneration.setupOreGeneration();
    }


    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
            event.getRegistry().register(new FirstBlock());
            event.getRegistry().register(new CopperOre());
        }
        @SubscribeEvent
        public static void onItemRegistry(final RegistryEvent.Register<Item> event) {
            Item.Properties properties = new Item.Properties();
            event.getRegistry().register(new BlockItem(ModBlocks.FIRSTBLOCK, new Item.Properties()).setRegistryName("firstblock"));
            event.getRegistry().register(new BlockItem(ModBlocks.COPPER_ORE, new Item.Properties()).setRegistryName("copper_ore"));
            event.getRegistry().register(new CopperIngot());
        }


    }

}

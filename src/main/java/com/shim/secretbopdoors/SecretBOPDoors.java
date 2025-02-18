package com.shim.secretbopdoors;

import com.shim.secretdoors.registry.SDBlocks;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("secretbopdoors")
public class SecretBOPDoors {
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "secretbopdoors";

    public SecretBOPDoors() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        SBDBlocks.BLOCKS.register(modEventBus);
        SBDBlocks.ITEMS.register(modEventBus);
        modEventBus.addListener(SBDBlocks::addCreative);

        MinecraftForge.EVENT_BUS.register(this);
    }
}

package com.shim.secretbopdoors;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(SecretBOPDoors.MODID)
public class SecretBOPDoors {
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "secretbopdoors";

    public SecretBOPDoors(IEventBus modEventBus) {

        SBDBlocks.BLOCKS.register(modEventBus);
        SBDBlocks.ITEMS.register(modEventBus);

        modEventBus.addListener(SBDBlocks::addCreative);
    }
}
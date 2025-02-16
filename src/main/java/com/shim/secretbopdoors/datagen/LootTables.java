package com.shim.secretbopdoors.datagen;

import com.shim.secretbopdoors.SBDBlocks;
import com.shim.secretdoors.datagen.BaseLootTableProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

public class LootTables extends BaseLootTableProvider {

    public LootTables(DataGenerator dataGeneratorIn) {
        super(dataGeneratorIn);
    }

    @Override
    protected void addTables() {

        for (RegistryObject<? extends Block> block : SBDBlocks.DOOR_LOOT_TABLE) lootTables.put(block.get(), createSimpleDoorTable(block.get()));
        for (RegistryObject<? extends Block> block : SBDBlocks.TRAPDOOR_LOOT_TABLE) lootTables.put(block.get(), createSimplerTable(block.get()));

    }
}

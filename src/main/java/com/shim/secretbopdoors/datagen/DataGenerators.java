package com.shim.secretbopdoors.datagen;

import com.shim.secretbopdoors.SecretBOPDoors;
import com.shim.secretdoors.datagen.SBDLootTables;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = SecretBOPDoors.MODID, bus = EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        ExistingFileHelper helper = event.getExistingFileHelper();

        generator.addProvider(event.includeClient(), new BlockStates(packOutput, helper));
        generator.addProvider(event.includeClient(), new ItemModels(packOutput, helper));
        generator.addProvider(event.includeClient(), new LangProvider(packOutput, "en_us"));

        SBDBlockTags blockTags = new SBDBlockTags(packOutput, lookupProvider, helper);
        generator.addProvider(event.includeServer(), blockTags);
        generator.addProvider(event.includeServer(), new SBDItemTags(packOutput, lookupProvider, blockTags, helper));
        generator.addProvider(event.includeServer(), new SBDRecipes(packOutput, lookupProvider));
        generator.addProvider(event.includeServer(), new LootTableProvider(packOutput, Collections.emptySet(), List.of(new LootTableProvider.SubProviderEntry(LootTables::new, LootContextParamSets.BLOCK)), lookupProvider));
    }
}
package com.shim.secretbopdoors.datagen;

import com.shim.secretbopdoors.SecretBOPDoors;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.List;
import java.util.Set;

@EventBusSubscriber(modid = SecretBOPDoors.MODID, bus = EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent.Client event) {

        event.createProvider((output, lookupProvider) ->
                new LootTableProvider(output, Set.of(), List.of(new LootTableProvider.SubProviderEntry(SBDLootTables::new, LootContextParamSets.BLOCK)), lookupProvider));

        event.createProvider(SBDRecipes.Runner::new);
        event.createProvider(SBDLangProvider::new);
        event.createProvider(SBDModelProvider::new);

        event.createBlockAndItemTags(SBDBlockTags::new, SBDItemTags::new);

    }
}
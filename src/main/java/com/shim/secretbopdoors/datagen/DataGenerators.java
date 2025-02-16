package com.shim.secretbopdoors.datagen;

import com.shim.secretbopdoors.SecretBOPDoors;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = SecretBOPDoors.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
            generator.addProvider(event.includeServer(), new SBDRecipes(generator));
            generator.addProvider(event.includeServer(), new LootTables(generator));

            SBDBlockTags blockTags = new SBDBlockTags(generator, event.getExistingFileHelper());
            generator.addProvider(event.includeServer(), blockTags);
            generator.addProvider(event.includeServer(), new SBDItemTags(generator, blockTags, event.getExistingFileHelper()));

            generator.addProvider(event.includeClient(), new BlockStates(generator, event.getExistingFileHelper()));
            generator.addProvider(event.includeClient(), new ItemModels(generator, event.getExistingFileHelper()));
            generator.addProvider(event.includeClient(), new LangProvider(generator, "en_us"));


    }
}
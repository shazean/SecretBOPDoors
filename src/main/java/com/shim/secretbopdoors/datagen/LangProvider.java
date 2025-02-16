package com.shim.secretbopdoors.datagen;

import com.shim.secretbopdoors.SBDBlocks;
import com.shim.secretbopdoors.SecretBOPDoors;
import com.shim.secretdoors.registry.SDBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.registries.RegistryObject;

public class LangProvider extends LanguageProvider {
    public LangProvider(DataGenerator gen, String locale) {
        super(gen, SecretBOPDoors.MODID, locale);
    }

    @Override
    protected void addTranslations() {

        for (RegistryObject<? extends Block> block : SBDBlocks.BLOCK_LANG_EN_US.keySet()) this.add(block.get(), SBDBlocks.BLOCK_LANG_EN_US.get(block));

    }
}

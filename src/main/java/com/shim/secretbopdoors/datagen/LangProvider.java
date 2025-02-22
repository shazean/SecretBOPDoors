package com.shim.secretbopdoors.datagen;

import com.shim.secretbopdoors.SBDBlocks;
import com.shim.secretbopdoors.SecretBOPDoors;
import com.shim.secretdoors.SecretDoors;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.LanguageProvider;
import net.neoforged.neoforge.registries.DeferredBlock;

public class LangProvider extends LanguageProvider {

    public LangProvider(PackOutput output, String locale) {
        super(output, SecretBOPDoors.MODID, locale);
    }

    @Override
    protected void addTranslations() {

        SecretDoors.LOGGER.debug(SBDBlocks.BLOCK_LANG_EN_US);

        for (DeferredBlock<? extends Block> block : SBDBlocks.BLOCK_LANG_EN_US.keySet()) this.add(block.get(), SBDBlocks.BLOCK_LANG_EN_US.get(block));
    }
}
package com.shim.secretbopdoors.datagen;

import com.shim.secretbopdoors.SecretBOPDoors;
import com.shim.secretdoors.registry.SDTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.BlockTagsProvider;

import java.util.concurrent.CompletableFuture;

public class SBDItemTags extends ItemTagsProvider {

    public SBDItemTags(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags) {
        super(packOutput, lookupProvider, blockTags, SecretBOPDoors.MODID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        this.copy(SDTags.Blocks.SECRET_WOODEN_PLANK_DOORS, SDTags.Items.SECRET_WOODEN_PLANK_DOORS);
        this.copy(SDTags.Blocks.SECRET_WOODEN_PLANK_TRAPDOORS, SDTags.Items.SECRET_WOODEN_PLANK_TRAPDOORS);

        this.copy(SDTags.Blocks.SECRET_LOG_DOORS, SDTags.Items.SECRET_LOG_DOORS);
        this.copy(SDTags.Blocks.SECRET_LOG_TRAPDOORS, SDTags.Items.SECRET_LOG_TRAPDOORS);

        this.copy(SDTags.Blocks.SECRET_WOODEN_DOORS, SDTags.Items.SECRET_WOODEN_DOORS);
        this.copy(SDTags.Blocks.SECRET_WOODEN_TRAPDOORS, SDTags.Items.SECRET_WOODEN_TRAPDOORS);

        this.copy(SDTags.Blocks.SECRET_STONE_DOORS, SDTags.Items.SECRET_STONE_DOORS);
        this.copy(SDTags.Blocks.SECRET_STONE_TRAPDOORS, SDTags.Items.SECRET_STONE_TRAPDOORS);

        this.copy(BlockTags.WOODEN_DOORS, ItemTags.WOODEN_DOORS);
        this.copy(BlockTags.WOODEN_TRAPDOORS, ItemTags.WOODEN_TRAPDOORS);

        this.copy(BlockTags.DOORS, ItemTags.DOORS);
        this.copy(BlockTags.TRAPDOORS, ItemTags.TRAPDOORS);


    }
}
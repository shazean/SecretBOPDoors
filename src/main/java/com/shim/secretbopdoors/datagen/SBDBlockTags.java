package com.shim.secretbopdoors.datagen;

import com.shim.secretbopdoors.SBDBlocks;
import com.shim.secretbopdoors.SecretBOPDoors;
import com.shim.secretdoors.registry.SDTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class SBDBlockTags extends BlockTagsProvider {

    public SBDBlockTags(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, SecretBOPDoors.MODID, helper);
    }

    @Override
    protected void addTags() {

        //---- DOORS -------------------------------------------------------------------------------
        tag(SDTags.Blocks.SECRET_WOODEN_PLANK_DOORS)
                .add(SBDBlocks.SECRET_FIR_PLANK_DOOR.get()).add(SBDBlocks.SECRET_REDWOOD_PLANK_DOOR.get()).add(SBDBlocks.SECRET_CHERRY_PLANK_DOOR.get())
                .add(SBDBlocks.SECRET_MAHOGANY_PLANK_DOOR.get()).add(SBDBlocks.SECRET_JACARANDA_PLANK_DOOR.get()).add(SBDBlocks.SECRET_PALM_PLANK_DOOR.get())
                .add(SBDBlocks.SECRET_WILLOW_PLANK_DOOR.get()).add(SBDBlocks.SECRET_DEAD_PLANK_DOOR.get()).add(SBDBlocks.SECRET_MAGIC_PLANK_DOOR.get())
                .add(SBDBlocks.SECRET_UMBRAN_PLANK_DOOR.get()).add(SBDBlocks.SECRET_HELLBARK_PLANK_DOOR.get());

        tag(SDTags.Blocks.SECRET_LOG_DOORS)
                .add(SBDBlocks.SECRET_FIR_LOG_DOOR.get()).add(SBDBlocks.SECRET_REDWOOD_LOG_DOOR.get()).add(SBDBlocks.SECRET_CHERRY_LOG_DOOR.get())
                .add(SBDBlocks.SECRET_MAHOGANY_LOG_DOOR.get()).add(SBDBlocks.SECRET_JACARANDA_LOG_DOOR.get()).add(SBDBlocks.SECRET_PALM_LOG_DOOR.get())
                .add(SBDBlocks.SECRET_WILLOW_LOG_DOOR.get()).add(SBDBlocks.SECRET_DEAD_LOG_DOOR.get()).add(SBDBlocks.SECRET_MAGIC_LOG_DOOR.get())
                .add(SBDBlocks.SECRET_UMBRAN_LOG_DOOR.get()).add(SBDBlocks.SECRET_HELLBARK_LOG_DOOR.get())

                .add(SBDBlocks.SECRET_STRIPPED_FIR_LOG_DOOR.get()).add(SBDBlocks.SECRET_STRIPPED_REDWOOD_LOG_DOOR.get()).add(SBDBlocks.SECRET_STRIPPED_CHERRY_LOG_DOOR.get())
                .add(SBDBlocks.SECRET_STRIPPED_MAHOGANY_LOG_DOOR.get()).add(SBDBlocks.SECRET_STRIPPED_JACARANDA_LOG_DOOR.get()).add(SBDBlocks.SECRET_STRIPPED_PALM_LOG_DOOR.get())
                .add(SBDBlocks.SECRET_STRIPPED_WILLOW_LOG_DOOR.get()).add(SBDBlocks.SECRET_STRIPPED_DEAD_LOG_DOOR.get()).add(SBDBlocks.SECRET_STRIPPED_MAGIC_LOG_DOOR.get())
                .add(SBDBlocks.SECRET_STRIPPED_UMBRAN_LOG_DOOR.get()).add(SBDBlocks.SECRET_STRIPPED_HELLBARK_LOG_DOOR.get())

                .add(SBDBlocks.SECRET_STRIPPED_HORIZONTAL_FIR_LOG_DOOR.get()).add(SBDBlocks.SECRET_STRIPPED_HORIZONTAL_REDWOOD_LOG_DOOR.get()).add(SBDBlocks.SECRET_STRIPPED_HORIZONTAL_CHERRY_LOG_DOOR.get())
                .add(SBDBlocks.SECRET_STRIPPED_HORIZONTAL_MAHOGANY_LOG_DOOR.get()).add(SBDBlocks.SECRET_STRIPPED_HORIZONTAL_JACARANDA_LOG_DOOR.get()).add(SBDBlocks.SECRET_STRIPPED_HORIZONTAL_PALM_LOG_DOOR.get())
                .add(SBDBlocks.SECRET_STRIPPED_HORIZONTAL_WILLOW_LOG_DOOR.get()).add(SBDBlocks.SECRET_STRIPPED_HORIZONTAL_DEAD_LOG_DOOR.get()).add(SBDBlocks.SECRET_STRIPPED_HORIZONTAL_MAGIC_LOG_DOOR.get())
                .add(SBDBlocks.SECRET_STRIPPED_HORIZONTAL_UMBRAN_LOG_DOOR.get()).add(SBDBlocks.SECRET_STRIPPED_HORIZONTAL_HELLBARK_LOG_DOOR.get())

                .add(SBDBlocks.SECRET_HORIZONTAL_FIR_LOG_DOOR.get()).add(SBDBlocks.SECRET_HORIZONTAL_REDWOOD_LOG_DOOR.get()).add(SBDBlocks.SECRET_HORIZONTAL_CHERRY_LOG_DOOR.get())
                .add(SBDBlocks.SECRET_HORIZONTAL_MAHOGANY_LOG_DOOR.get()).add(SBDBlocks.SECRET_HORIZONTAL_JACARANDA_LOG_DOOR.get()).add(SBDBlocks.SECRET_HORIZONTAL_PALM_LOG_DOOR.get())
                .add(SBDBlocks.SECRET_HORIZONTAL_WILLOW_LOG_DOOR.get()).add(SBDBlocks.SECRET_HORIZONTAL_DEAD_LOG_DOOR.get()).add(SBDBlocks.SECRET_HORIZONTAL_MAGIC_LOG_DOOR.get())
                .add(SBDBlocks.SECRET_HORIZONTAL_UMBRAN_LOG_DOOR.get()).add(SBDBlocks.SECRET_HORIZONTAL_HELLBARK_LOG_DOOR.get());

        tag(SDTags.Blocks.SECRET_STONE_DOORS)
                .add(SBDBlocks.SECRET_WHITE_SANDSTONE_DOOR.get()).add(SBDBlocks.SECRET_CUT_WHITE_SANDSTONE_DOOR.get()).add(SBDBlocks.SECRET_SMOOTH_WHITE_SANDSTONE_DOOR.get())
                .add(SBDBlocks.SECRET_ORANGE_SANDSTONE_DOOR.get()).add(SBDBlocks.SECRET_CUT_ORANGE_SANDSTONE_DOOR.get()).add(SBDBlocks.SECRET_SMOOTH_ORANGE_SANDSTONE_DOOR.get())
                .add(SBDBlocks.SECRET_BLACK_SANDSTONE_DOOR.get()).add(SBDBlocks.SECRET_CUT_BLACK_SANDSTONE_DOOR.get()).add(SBDBlocks.SECRET_SMOOTH_BLACK_SANDSTONE_DOOR.get())

                .add(SBDBlocks.SECRET_MUD_BRICKS_DOOR.get());

        tag(SDTags.Blocks.SECRET_WOODEN_DOORS)
                .addTag(SDTags.Blocks.SECRET_WOODEN_PLANK_DOORS)
                .addTag(SDTags.Blocks.SECRET_LOG_DOORS);

        tag(net.minecraft.tags.BlockTags.WOODEN_DOORS)
                .addTag(SDTags.Blocks.SECRET_WOODEN_DOORS);

        tag(net.minecraft.tags.BlockTags.DOORS)
                .addTag(SDTags.Blocks.SECRET_WOODEN_DOORS)
                .addTag(SDTags.Blocks.SECRET_STONE_DOORS);


        //---- TRAPDOORS -------------------------------------------------------------------------------
        tag(SDTags.Blocks.SECRET_WOODEN_PLANK_TRAPDOORS)
                .add(SBDBlocks.SECRET_FIR_PLANK_TRAPDOOR.get()).add(SBDBlocks.SECRET_REDWOOD_PLANK_TRAPDOOR.get()).add(SBDBlocks.SECRET_CHERRY_PLANK_TRAPDOOR.get())
                .add(SBDBlocks.SECRET_MAHOGANY_PLANK_TRAPDOOR.get()).add(SBDBlocks.SECRET_JACARANDA_PLANK_TRAPDOOR.get()).add(SBDBlocks.SECRET_PALM_PLANK_TRAPDOOR.get())
                .add(SBDBlocks.SECRET_WILLOW_PLANK_TRAPDOOR.get()).add(SBDBlocks.SECRET_DEAD_PLANK_TRAPDOOR.get()).add(SBDBlocks.SECRET_MAGIC_PLANK_TRAPDOOR.get())
                .add(SBDBlocks.SECRET_UMBRAN_PLANK_TRAPDOOR.get()).add(SBDBlocks.SECRET_HELLBARK_PLANK_TRAPDOOR.get());

        tag(SDTags.Blocks.SECRET_LOG_TRAPDOORS)
                .add(SBDBlocks.SECRET_FIR_LOG_TRAPDOOR.get()).add(SBDBlocks.SECRET_REDWOOD_LOG_TRAPDOOR.get()).add(SBDBlocks.SECRET_CHERRY_LOG_TRAPDOOR.get())
                .add(SBDBlocks.SECRET_MAHOGANY_LOG_TRAPDOOR.get()).add(SBDBlocks.SECRET_JACARANDA_LOG_TRAPDOOR.get()).add(SBDBlocks.SECRET_PALM_LOG_TRAPDOOR.get())
                .add(SBDBlocks.SECRET_WILLOW_LOG_TRAPDOOR.get()).add(SBDBlocks.SECRET_DEAD_LOG_TRAPDOOR.get()).add(SBDBlocks.SECRET_MAGIC_LOG_TRAPDOOR.get())
                .add(SBDBlocks.SECRET_UMBRAN_LOG_TRAPDOOR.get()).add(SBDBlocks.SECRET_HELLBARK_LOG_TRAPDOOR.get())

                .add(SBDBlocks.SECRET_STRIPPED_FIR_LOG_TRAPDOOR.get()).add(SBDBlocks.SECRET_STRIPPED_REDWOOD_LOG_TRAPDOOR.get()).add(SBDBlocks.SECRET_STRIPPED_CHERRY_LOG_TRAPDOOR.get())
                .add(SBDBlocks.SECRET_STRIPPED_MAHOGANY_LOG_TRAPDOOR.get()).add(SBDBlocks.SECRET_STRIPPED_JACARANDA_LOG_TRAPDOOR.get()).add(SBDBlocks.SECRET_STRIPPED_PALM_LOG_TRAPDOOR.get())
                .add(SBDBlocks.SECRET_STRIPPED_WILLOW_LOG_TRAPDOOR.get()).add(SBDBlocks.SECRET_STRIPPED_DEAD_LOG_TRAPDOOR.get()).add(SBDBlocks.SECRET_STRIPPED_MAGIC_LOG_TRAPDOOR.get())
                .add(SBDBlocks.SECRET_STRIPPED_UMBRAN_LOG_TRAPDOOR.get()).add(SBDBlocks.SECRET_STRIPPED_HELLBARK_LOG_TRAPDOOR.get());

        tag(SDTags.Blocks.SECRET_STONE_TRAPDOORS)
                .add(SBDBlocks.SECRET_WHITE_SANDSTONE_TRAPDOOR.get()).add(SBDBlocks.SECRET_CUT_WHITE_SANDSTONE_TRAPDOOR.get()).add(SBDBlocks.SECRET_SMOOTH_WHITE_SANDSTONE_TRAPDOOR.get())
                .add(SBDBlocks.SECRET_ORANGE_SANDSTONE_TRAPDOOR.get()).add(SBDBlocks.SECRET_CUT_ORANGE_SANDSTONE_TRAPDOOR.get()).add(SBDBlocks.SECRET_SMOOTH_ORANGE_SANDSTONE_TRAPDOOR.get())
                .add(SBDBlocks.SECRET_BLACK_SANDSTONE_TRAPDOOR.get()).add(SBDBlocks.SECRET_CUT_BLACK_SANDSTONE_TRAPDOOR.get()).add(SBDBlocks.SECRET_SMOOTH_BLACK_SANDSTONE_TRAPDOOR.get())

                .add(SBDBlocks.SECRET_MUD_BRICKS_TRAPDOOR.get());

        tag(SDTags.Blocks.SECRET_WOODEN_TRAPDOORS)
                .addTag(SDTags.Blocks.SECRET_WOODEN_PLANK_TRAPDOORS)
                .addTag(SDTags.Blocks.SECRET_LOG_TRAPDOORS);

        tag(net.minecraft.tags.BlockTags.WOODEN_TRAPDOORS)
                .addTag(SDTags.Blocks.SECRET_WOODEN_TRAPDOORS);

        tag(net.minecraft.tags.BlockTags.TRAPDOORS)
                .addTag(SDTags.Blocks.SECRET_WOODEN_TRAPDOORS)
                .addTag(SDTags.Blocks.SECRET_STONE_TRAPDOORS);
    }
}

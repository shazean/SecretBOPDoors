package com.shim.secretbopdoors.datagen;

import com.shim.secretbopdoors.SBDBlocks;
import com.shim.secretbopdoors.SecretBOPDoors;
import com.shim.secretdoors.SecretDoors;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ItemModels extends ItemModelProvider {
    
    public ItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, SecretBOPDoors.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        generatedModel(SBDBlocks.SECRET_FIR_PLANK_DOOR.get());
        generatedModel(SBDBlocks.SECRET_REDWOOD_PLANK_DOOR.get());
        generatedModel(SBDBlocks.SECRET_CHERRY_PLANK_DOOR.get());
        generatedModel(SBDBlocks.SECRET_MAHOGANY_PLANK_DOOR.get());
        generatedModel(SBDBlocks.SECRET_JACARANDA_PLANK_DOOR.get());
        generatedModel(SBDBlocks.SECRET_PALM_PLANK_DOOR.get());
        generatedModel(SBDBlocks.SECRET_WILLOW_PLANK_DOOR.get());
        generatedModel(SBDBlocks.SECRET_DEAD_PLANK_DOOR.get());
        generatedModel(SBDBlocks.SECRET_MAGIC_PLANK_DOOR.get());
        generatedModel(SBDBlocks.SECRET_UMBRAN_PLANK_DOOR.get());
        generatedModel(SBDBlocks.SECRET_HELLBARK_PLANK_DOOR.get());

        generatedModel(SBDBlocks.SECRET_FIR_LOG_DOOR.get());
        generatedModel(SBDBlocks.SECRET_REDWOOD_LOG_DOOR.get());
        generatedModel(SBDBlocks.SECRET_CHERRY_LOG_DOOR.get());
        generatedModel(SBDBlocks.SECRET_MAHOGANY_LOG_DOOR.get());
        generatedModel(SBDBlocks.SECRET_JACARANDA_LOG_DOOR.get());
        generatedModel(SBDBlocks.SECRET_PALM_LOG_DOOR.get());
        generatedModel(SBDBlocks.SECRET_WILLOW_LOG_DOOR.get());
        generatedModel(SBDBlocks.SECRET_DEAD_LOG_DOOR.get());
        generatedModel(SBDBlocks.SECRET_MAGIC_LOG_DOOR.get());
        generatedModel(SBDBlocks.SECRET_UMBRAN_LOG_DOOR.get());
        generatedModel(SBDBlocks.SECRET_HELLBARK_LOG_DOOR.get());

        generatedModel(SBDBlocks.SECRET_STRIPPED_FIR_LOG_DOOR.get());
        generatedModel(SBDBlocks.SECRET_STRIPPED_REDWOOD_LOG_DOOR.get());
        generatedModel(SBDBlocks.SECRET_STRIPPED_CHERRY_LOG_DOOR.get());
        generatedModel(SBDBlocks.SECRET_STRIPPED_MAHOGANY_LOG_DOOR.get());
        generatedModel(SBDBlocks.SECRET_STRIPPED_JACARANDA_LOG_DOOR.get());
        generatedModel(SBDBlocks.SECRET_STRIPPED_PALM_LOG_DOOR.get());
        generatedModel(SBDBlocks.SECRET_STRIPPED_WILLOW_LOG_DOOR.get());
        generatedModel(SBDBlocks.SECRET_STRIPPED_DEAD_LOG_DOOR.get());
        generatedModel(SBDBlocks.SECRET_STRIPPED_MAGIC_LOG_DOOR.get());
        generatedModel(SBDBlocks.SECRET_STRIPPED_UMBRAN_LOG_DOOR.get());
        generatedModel(SBDBlocks.SECRET_STRIPPED_HELLBARK_LOG_DOOR.get());

        generatedModel(SBDBlocks.SECRET_STRIPPED_HORIZONTAL_FIR_LOG_DOOR.get());
        generatedModel(SBDBlocks.SECRET_STRIPPED_HORIZONTAL_REDWOOD_LOG_DOOR.get());
        generatedModel(SBDBlocks.SECRET_STRIPPED_HORIZONTAL_CHERRY_LOG_DOOR.get());
        generatedModel(SBDBlocks.SECRET_STRIPPED_HORIZONTAL_MAHOGANY_LOG_DOOR.get());
        generatedModel(SBDBlocks.SECRET_STRIPPED_HORIZONTAL_JACARANDA_LOG_DOOR.get());
        generatedModel(SBDBlocks.SECRET_STRIPPED_HORIZONTAL_PALM_LOG_DOOR.get());
        generatedModel(SBDBlocks.SECRET_STRIPPED_HORIZONTAL_WILLOW_LOG_DOOR.get());
        generatedModel(SBDBlocks.SECRET_STRIPPED_HORIZONTAL_DEAD_LOG_DOOR.get());
        generatedModel(SBDBlocks.SECRET_STRIPPED_HORIZONTAL_MAGIC_LOG_DOOR.get());
        generatedModel(SBDBlocks.SECRET_STRIPPED_HORIZONTAL_UMBRAN_LOG_DOOR.get());
        generatedModel(SBDBlocks.SECRET_STRIPPED_HORIZONTAL_HELLBARK_LOG_DOOR.get());

        generatedModel(SBDBlocks.SECRET_HORIZONTAL_FIR_LOG_DOOR.get());
        generatedModel(SBDBlocks.SECRET_HORIZONTAL_REDWOOD_LOG_DOOR.get());
        generatedModel(SBDBlocks.SECRET_HORIZONTAL_CHERRY_LOG_DOOR.get());
        generatedModel(SBDBlocks.SECRET_HORIZONTAL_MAHOGANY_LOG_DOOR.get());
        generatedModel(SBDBlocks.SECRET_HORIZONTAL_JACARANDA_LOG_DOOR.get());
        generatedModel(SBDBlocks.SECRET_HORIZONTAL_PALM_LOG_DOOR.get());
        generatedModel(SBDBlocks.SECRET_HORIZONTAL_WILLOW_LOG_DOOR.get());
        generatedModel(SBDBlocks.SECRET_HORIZONTAL_DEAD_LOG_DOOR.get());
        generatedModel(SBDBlocks.SECRET_HORIZONTAL_MAGIC_LOG_DOOR.get());
        generatedModel(SBDBlocks.SECRET_HORIZONTAL_UMBRAN_LOG_DOOR.get());
        generatedModel(SBDBlocks.SECRET_HORIZONTAL_HELLBARK_LOG_DOOR.get());

        generatedModel(SBDBlocks.SECRET_WHITE_SANDSTONE_DOOR.get());
        generatedModel(SBDBlocks.SECRET_CUT_WHITE_SANDSTONE_DOOR.get());
        generatedModel(SBDBlocks.SECRET_SMOOTH_WHITE_SANDSTONE_DOOR.get());
        generatedModel(SBDBlocks.SECRET_ORANGE_SANDSTONE_DOOR.get());
        generatedModel(SBDBlocks.SECRET_CUT_ORANGE_SANDSTONE_DOOR.get());
        generatedModel(SBDBlocks.SECRET_SMOOTH_ORANGE_SANDSTONE_DOOR.get());
        generatedModel(SBDBlocks.SECRET_BLACK_SANDSTONE_DOOR.get());
        generatedModel(SBDBlocks.SECRET_CUT_BLACK_SANDSTONE_DOOR.get());
        generatedModel(SBDBlocks.SECRET_SMOOTH_BLACK_SANDSTONE_DOOR.get());


        trapdoorModel(SBDBlocks.SECRET_FIR_PLANK_TRAPDOOR.get());
        trapdoorModel(SBDBlocks.SECRET_REDWOOD_PLANK_TRAPDOOR.get());
        trapdoorModel(SBDBlocks.SECRET_CHERRY_PLANK_TRAPDOOR.get());
        trapdoorModel(SBDBlocks.SECRET_MAHOGANY_PLANK_TRAPDOOR.get());
        trapdoorModel(SBDBlocks.SECRET_JACARANDA_PLANK_TRAPDOOR.get());
        trapdoorModel(SBDBlocks.SECRET_PALM_PLANK_TRAPDOOR.get());
        trapdoorModel(SBDBlocks.SECRET_WILLOW_PLANK_TRAPDOOR.get());
        trapdoorModel(SBDBlocks.SECRET_DEAD_PLANK_TRAPDOOR.get());
        trapdoorModel(SBDBlocks.SECRET_MAGIC_PLANK_TRAPDOOR.get());
        trapdoorModel(SBDBlocks.SECRET_UMBRAN_PLANK_TRAPDOOR.get());
        trapdoorModel(SBDBlocks.SECRET_HELLBARK_PLANK_TRAPDOOR.get());

        trapdoorModel(SBDBlocks.SECRET_FIR_LOG_TRAPDOOR.get());
        trapdoorModel(SBDBlocks.SECRET_REDWOOD_LOG_TRAPDOOR.get());
        trapdoorModel(SBDBlocks.SECRET_CHERRY_LOG_TRAPDOOR.get());
        trapdoorModel(SBDBlocks.SECRET_MAHOGANY_LOG_TRAPDOOR.get());
        trapdoorModel(SBDBlocks.SECRET_JACARANDA_LOG_TRAPDOOR.get());
        trapdoorModel(SBDBlocks.SECRET_PALM_LOG_TRAPDOOR.get());
        trapdoorModel(SBDBlocks.SECRET_WILLOW_LOG_TRAPDOOR.get());
        trapdoorModel(SBDBlocks.SECRET_DEAD_LOG_TRAPDOOR.get());
        trapdoorModel(SBDBlocks.SECRET_MAGIC_LOG_TRAPDOOR.get());
        trapdoorModel(SBDBlocks.SECRET_UMBRAN_LOG_TRAPDOOR.get());
        trapdoorModel(SBDBlocks.SECRET_HELLBARK_LOG_TRAPDOOR.get());

        trapdoorModel(SBDBlocks.SECRET_STRIPPED_FIR_LOG_TRAPDOOR.get());
        trapdoorModel(SBDBlocks.SECRET_STRIPPED_REDWOOD_LOG_TRAPDOOR.get());
        trapdoorModel(SBDBlocks.SECRET_STRIPPED_CHERRY_LOG_TRAPDOOR.get());
        trapdoorModel(SBDBlocks.SECRET_STRIPPED_MAHOGANY_LOG_TRAPDOOR.get());
        trapdoorModel(SBDBlocks.SECRET_STRIPPED_JACARANDA_LOG_TRAPDOOR.get());
        trapdoorModel(SBDBlocks.SECRET_STRIPPED_PALM_LOG_TRAPDOOR.get());
        trapdoorModel(SBDBlocks.SECRET_STRIPPED_WILLOW_LOG_TRAPDOOR.get());
        trapdoorModel(SBDBlocks.SECRET_STRIPPED_DEAD_LOG_TRAPDOOR.get());
        trapdoorModel(SBDBlocks.SECRET_STRIPPED_MAGIC_LOG_TRAPDOOR.get());
        trapdoorModel(SBDBlocks.SECRET_STRIPPED_UMBRAN_LOG_TRAPDOOR.get());
        trapdoorModel(SBDBlocks.SECRET_STRIPPED_HELLBARK_LOG_TRAPDOOR.get());

        trapdoorModel(SBDBlocks.SECRET_WHITE_SANDSTONE_TRAPDOOR.get());
        trapdoorModel(SBDBlocks.SECRET_CUT_WHITE_SANDSTONE_TRAPDOOR.get());
        trapdoorModel(SBDBlocks.SECRET_SMOOTH_WHITE_SANDSTONE_TRAPDOOR.get());
        trapdoorModel(SBDBlocks.SECRET_ORANGE_SANDSTONE_TRAPDOOR.get());
        trapdoorModel(SBDBlocks.SECRET_CUT_ORANGE_SANDSTONE_TRAPDOOR.get());
        trapdoorModel(SBDBlocks.SECRET_SMOOTH_ORANGE_SANDSTONE_TRAPDOOR.get());
        trapdoorModel(SBDBlocks.SECRET_BLACK_SANDSTONE_TRAPDOOR.get());
        trapdoorModel(SBDBlocks.SECRET_CUT_BLACK_SANDSTONE_TRAPDOOR.get());
        trapdoorModel(SBDBlocks.SECRET_SMOOTH_BLACK_SANDSTONE_TRAPDOOR.get());
    }


    public void generatedModel(Block item) {
        singleTexture(SecretDoors.name(item), new ResourceLocation("item/generated"), "layer0", new ResourceLocation(SecretBOPDoors.MODID, "item/" + SecretDoors.name(item)));
    }

    public void trapdoorModel(Block item) {
        withExistingParent(SecretDoors.name(item), modLoc("block/" + SecretDoors.name(item) + "_bottom"));
    }
}
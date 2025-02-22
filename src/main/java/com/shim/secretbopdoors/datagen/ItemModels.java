package com.shim.secretbopdoors.datagen;

import com.shim.secretbopdoors.SBDBlocks;
import com.shim.secretbopdoors.SecretBOPDoors;
import com.shim.secretdoors.SecretDoors;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ItemModels extends ItemModelProvider {

    public ItemModels(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, SecretBOPDoors.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        basicItem(SBDBlocks.SECRET_FIR_PLANK_DOOR.get());
        basicItem(SBDBlocks.SECRET_REDWOOD_PLANK_DOOR.get());
        basicItem(SBDBlocks.SECRET_MAHOGANY_PLANK_DOOR.get());
        basicItem(SBDBlocks.SECRET_JACARANDA_PLANK_DOOR.get());
        basicItem(SBDBlocks.SECRET_PALM_PLANK_DOOR.get());
        basicItem(SBDBlocks.SECRET_WILLOW_PLANK_DOOR.get());
        basicItem(SBDBlocks.SECRET_DEAD_PLANK_DOOR.get());
        basicItem(SBDBlocks.SECRET_MAGIC_PLANK_DOOR.get());
        basicItem(SBDBlocks.SECRET_UMBRAN_PLANK_DOOR.get());
        basicItem(SBDBlocks.SECRET_HELLBARK_PLANK_DOOR.get());
        basicItem(SBDBlocks.SECRET_EMPYREAL_PLANK_DOOR.get());
        basicItem(SBDBlocks.SECRET_MAPLE_PLANK_DOOR.get());
        basicItem(SBDBlocks.SECRET_PINE_PLANK_DOOR.get());

        basicItem(SBDBlocks.SECRET_FIR_LOG_DOOR.get());
        basicItem(SBDBlocks.SECRET_REDWOOD_LOG_DOOR.get());
        basicItem(SBDBlocks.SECRET_MAHOGANY_LOG_DOOR.get());
        basicItem(SBDBlocks.SECRET_JACARANDA_LOG_DOOR.get());
        basicItem(SBDBlocks.SECRET_PALM_LOG_DOOR.get());
        basicItem(SBDBlocks.SECRET_WILLOW_LOG_DOOR.get());
        basicItem(SBDBlocks.SECRET_DEAD_LOG_DOOR.get());
        basicItem(SBDBlocks.SECRET_MAGIC_LOG_DOOR.get());
        basicItem(SBDBlocks.SECRET_UMBRAN_LOG_DOOR.get());
        basicItem(SBDBlocks.SECRET_HELLBARK_LOG_DOOR.get());
        basicItem(SBDBlocks.SECRET_EMPYREAL_LOG_DOOR.get());
        basicItem(SBDBlocks.SECRET_MAPLE_LOG_DOOR.get());
        basicItem(SBDBlocks.SECRET_PINE_LOG_DOOR.get());

        basicItem(SBDBlocks.SECRET_STRIPPED_FIR_LOG_DOOR.get());
        basicItem(SBDBlocks.SECRET_STRIPPED_REDWOOD_LOG_DOOR.get());
        basicItem(SBDBlocks.SECRET_STRIPPED_MAHOGANY_LOG_DOOR.get());
        basicItem(SBDBlocks.SECRET_STRIPPED_JACARANDA_LOG_DOOR.get());
        basicItem(SBDBlocks.SECRET_STRIPPED_PALM_LOG_DOOR.get());
        basicItem(SBDBlocks.SECRET_STRIPPED_WILLOW_LOG_DOOR.get());
        basicItem(SBDBlocks.SECRET_STRIPPED_DEAD_LOG_DOOR.get());
        basicItem(SBDBlocks.SECRET_STRIPPED_MAGIC_LOG_DOOR.get());
        basicItem(SBDBlocks.SECRET_STRIPPED_UMBRAN_LOG_DOOR.get());
        basicItem(SBDBlocks.SECRET_STRIPPED_HELLBARK_LOG_DOOR.get());
        basicItem(SBDBlocks.SECRET_STRIPPED_EMPYREAL_LOG_DOOR.get());
        basicItem(SBDBlocks.SECRET_STRIPPED_MAPLE_LOG_DOOR.get());
        basicItem(SBDBlocks.SECRET_STRIPPED_PINE_LOG_DOOR.get());

        basicItem(SBDBlocks.SECRET_STRIPPED_HORIZONTAL_FIR_LOG_DOOR.get());
        basicItem(SBDBlocks.SECRET_STRIPPED_HORIZONTAL_REDWOOD_LOG_DOOR.get());
        basicItem(SBDBlocks.SECRET_STRIPPED_HORIZONTAL_MAHOGANY_LOG_DOOR.get());
        basicItem(SBDBlocks.SECRET_STRIPPED_HORIZONTAL_JACARANDA_LOG_DOOR.get());
        basicItem(SBDBlocks.SECRET_STRIPPED_HORIZONTAL_PALM_LOG_DOOR.get());
        basicItem(SBDBlocks.SECRET_STRIPPED_HORIZONTAL_WILLOW_LOG_DOOR.get());
        basicItem(SBDBlocks.SECRET_STRIPPED_HORIZONTAL_DEAD_LOG_DOOR.get());
        basicItem(SBDBlocks.SECRET_STRIPPED_HORIZONTAL_MAGIC_LOG_DOOR.get());
        basicItem(SBDBlocks.SECRET_STRIPPED_HORIZONTAL_UMBRAN_LOG_DOOR.get());
        basicItem(SBDBlocks.SECRET_STRIPPED_HORIZONTAL_HELLBARK_LOG_DOOR.get());
        basicItem(SBDBlocks.SECRET_STRIPPED_HORIZONTAL_EMPYREAL_LOG_DOOR.get());
        basicItem(SBDBlocks.SECRET_STRIPPED_HORIZONTAL_MAPLE_LOG_DOOR.get());
        basicItem(SBDBlocks.SECRET_STRIPPED_HORIZONTAL_PINE_LOG_DOOR.get());

        basicItem(SBDBlocks.SECRET_HORIZONTAL_FIR_LOG_DOOR.get());
        basicItem(SBDBlocks.SECRET_HORIZONTAL_REDWOOD_LOG_DOOR.get());
        basicItem(SBDBlocks.SECRET_HORIZONTAL_MAHOGANY_LOG_DOOR.get());
        basicItem(SBDBlocks.SECRET_HORIZONTAL_JACARANDA_LOG_DOOR.get());
        basicItem(SBDBlocks.SECRET_HORIZONTAL_PALM_LOG_DOOR.get());
        basicItem(SBDBlocks.SECRET_HORIZONTAL_WILLOW_LOG_DOOR.get());
        basicItem(SBDBlocks.SECRET_HORIZONTAL_DEAD_LOG_DOOR.get());
        basicItem(SBDBlocks.SECRET_HORIZONTAL_MAGIC_LOG_DOOR.get());
        basicItem(SBDBlocks.SECRET_HORIZONTAL_UMBRAN_LOG_DOOR.get());
        basicItem(SBDBlocks.SECRET_HORIZONTAL_HELLBARK_LOG_DOOR.get());
        basicItem(SBDBlocks.SECRET_HORIZONTAL_EMPYREAL_LOG_DOOR.get());
        basicItem(SBDBlocks.SECRET_HORIZONTAL_MAPLE_LOG_DOOR.get());
        basicItem(SBDBlocks.SECRET_HORIZONTAL_PINE_LOG_DOOR.get());

        basicItem(SBDBlocks.SECRET_WHITE_SANDSTONE_DOOR.get());
        basicItem(SBDBlocks.SECRET_CUT_WHITE_SANDSTONE_DOOR.get());
        basicItem(SBDBlocks.SECRET_SMOOTH_WHITE_SANDSTONE_DOOR.get());
        basicItem(SBDBlocks.SECRET_ORANGE_SANDSTONE_DOOR.get());
        basicItem(SBDBlocks.SECRET_CUT_ORANGE_SANDSTONE_DOOR.get());
        basicItem(SBDBlocks.SECRET_SMOOTH_ORANGE_SANDSTONE_DOOR.get());
        basicItem(SBDBlocks.SECRET_BLACK_SANDSTONE_DOOR.get());
        basicItem(SBDBlocks.SECRET_CUT_BLACK_SANDSTONE_DOOR.get());
        basicItem(SBDBlocks.SECRET_SMOOTH_BLACK_SANDSTONE_DOOR.get());


        trapdoorModel(SBDBlocks.SECRET_FIR_PLANK_TRAPDOOR.get());
        trapdoorModel(SBDBlocks.SECRET_REDWOOD_PLANK_TRAPDOOR.get());
        trapdoorModel(SBDBlocks.SECRET_MAHOGANY_PLANK_TRAPDOOR.get());
        trapdoorModel(SBDBlocks.SECRET_JACARANDA_PLANK_TRAPDOOR.get());
        trapdoorModel(SBDBlocks.SECRET_PALM_PLANK_TRAPDOOR.get());
        trapdoorModel(SBDBlocks.SECRET_WILLOW_PLANK_TRAPDOOR.get());
        trapdoorModel(SBDBlocks.SECRET_DEAD_PLANK_TRAPDOOR.get());
        trapdoorModel(SBDBlocks.SECRET_MAGIC_PLANK_TRAPDOOR.get());
        trapdoorModel(SBDBlocks.SECRET_UMBRAN_PLANK_TRAPDOOR.get());
        trapdoorModel(SBDBlocks.SECRET_HELLBARK_PLANK_TRAPDOOR.get());
        trapdoorModel(SBDBlocks.SECRET_EMPYREAL_PLANK_TRAPDOOR.get());
        trapdoorModel(SBDBlocks.SECRET_MAPLE_PLANK_TRAPDOOR.get());
        trapdoorModel(SBDBlocks.SECRET_PINE_PLANK_TRAPDOOR.get());

        trapdoorModel(SBDBlocks.SECRET_FIR_LOG_TRAPDOOR.get());
        trapdoorModel(SBDBlocks.SECRET_REDWOOD_LOG_TRAPDOOR.get());
        trapdoorModel(SBDBlocks.SECRET_MAHOGANY_LOG_TRAPDOOR.get());
        trapdoorModel(SBDBlocks.SECRET_JACARANDA_LOG_TRAPDOOR.get());
        trapdoorModel(SBDBlocks.SECRET_PALM_LOG_TRAPDOOR.get());
        trapdoorModel(SBDBlocks.SECRET_WILLOW_LOG_TRAPDOOR.get());
        trapdoorModel(SBDBlocks.SECRET_DEAD_LOG_TRAPDOOR.get());
        trapdoorModel(SBDBlocks.SECRET_MAGIC_LOG_TRAPDOOR.get());
        trapdoorModel(SBDBlocks.SECRET_UMBRAN_LOG_TRAPDOOR.get());
        trapdoorModel(SBDBlocks.SECRET_HELLBARK_LOG_TRAPDOOR.get());
        trapdoorModel(SBDBlocks.SECRET_EMPYREAL_LOG_TRAPDOOR.get());
        trapdoorModel(SBDBlocks.SECRET_MAPLE_LOG_TRAPDOOR.get());
        trapdoorModel(SBDBlocks.SECRET_PINE_LOG_TRAPDOOR.get());

        trapdoorModel(SBDBlocks.SECRET_STRIPPED_FIR_LOG_TRAPDOOR.get());
        trapdoorModel(SBDBlocks.SECRET_STRIPPED_REDWOOD_LOG_TRAPDOOR.get());
        trapdoorModel(SBDBlocks.SECRET_STRIPPED_MAHOGANY_LOG_TRAPDOOR.get());
        trapdoorModel(SBDBlocks.SECRET_STRIPPED_JACARANDA_LOG_TRAPDOOR.get());
        trapdoorModel(SBDBlocks.SECRET_STRIPPED_PALM_LOG_TRAPDOOR.get());
        trapdoorModel(SBDBlocks.SECRET_STRIPPED_WILLOW_LOG_TRAPDOOR.get());
        trapdoorModel(SBDBlocks.SECRET_STRIPPED_DEAD_LOG_TRAPDOOR.get());
        trapdoorModel(SBDBlocks.SECRET_STRIPPED_MAGIC_LOG_TRAPDOOR.get());
        trapdoorModel(SBDBlocks.SECRET_STRIPPED_UMBRAN_LOG_TRAPDOOR.get());
        trapdoorModel(SBDBlocks.SECRET_STRIPPED_HELLBARK_LOG_TRAPDOOR.get());
        trapdoorModel(SBDBlocks.SECRET_STRIPPED_EMPYREAL_LOG_TRAPDOOR.get());
        trapdoorModel(SBDBlocks.SECRET_STRIPPED_MAPLE_LOG_TRAPDOOR.get());
        trapdoorModel(SBDBlocks.SECRET_STRIPPED_PINE_LOG_TRAPDOOR.get());

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


    public void basicItem(Block item) {
        singleTexture(SecretDoors.key(item), ResourceLocation.withDefaultNamespace("item/generated"), "layer0", modLoc("item/" + SecretDoors.key(item)));
    }

    public void trapdoorModel(Block block) {
        withExistingParent(SecretDoors.key(block), modLoc("block/" + SecretDoors.key(block) + "_bottom"));
    }
}
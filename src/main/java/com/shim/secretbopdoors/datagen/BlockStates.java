package com.shim.secretbopdoors.datagen;

import biomesoplenty.core.BiomesOPlenty;
import com.shim.secretbopdoors.SBDBlocks;
import com.shim.secretbopdoors.SecretBOPDoors;
import com.shim.secretdoors.SecretDoors;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BlockStates extends BlockStateProvider {


    public BlockStates(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, SecretBOPDoors.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {


        secretDoorBlock(SBDBlocks.SECRET_FIR_PLANK_DOOR.get(), "fir_planks");
        secretDoorBlock(SBDBlocks.SECRET_REDWOOD_PLANK_DOOR.get(), "redwood_planks");
        secretDoorBlock(SBDBlocks.SECRET_CHERRY_PLANK_DOOR.get(), "cherry_planks");
        secretDoorBlock(SBDBlocks.SECRET_MAHOGANY_PLANK_DOOR.get(), "mahogany_planks");
        secretDoorBlock(SBDBlocks.SECRET_JACARANDA_PLANK_DOOR.get(), "jacaranda_planks");
        secretDoorBlock(SBDBlocks.SECRET_PALM_PLANK_DOOR.get(), "palm_planks");
        secretDoorBlock(SBDBlocks.SECRET_WILLOW_PLANK_DOOR.get(), "willow_planks");
        secretDoorBlock(SBDBlocks.SECRET_DEAD_PLANK_DOOR.get(), "dead_planks");
        secretDoorBlock(SBDBlocks.SECRET_MAGIC_PLANK_DOOR.get(), "magic_planks");
        secretDoorBlock(SBDBlocks.SECRET_UMBRAN_PLANK_DOOR.get(), "umbran_planks");
        secretDoorBlock(SBDBlocks.SECRET_HELLBARK_PLANK_DOOR.get(), "hellbark_planks");

        secretDoorBlock(SBDBlocks.SECRET_FIR_LOG_DOOR.get(), "fir_log");
        secretDoorBlock(SBDBlocks.SECRET_REDWOOD_LOG_DOOR.get(), "redwood_log");
        secretDoorBlock(SBDBlocks.SECRET_CHERRY_LOG_DOOR.get(), "cherry_log");
        secretDoorBlock(SBDBlocks.SECRET_MAHOGANY_LOG_DOOR.get(), "mahogany_log");
        secretDoorBlock(SBDBlocks.SECRET_JACARANDA_LOG_DOOR.get(), "jacaranda_log");
        secretDoorBlock(SBDBlocks.SECRET_PALM_LOG_DOOR.get(), "palm_log");
        secretDoorBlock(SBDBlocks.SECRET_WILLOW_LOG_DOOR.get(), "willow_log");
        secretDoorBlock(SBDBlocks.SECRET_DEAD_LOG_DOOR.get(), "dead_log");
        secretDoorBlock(SBDBlocks.SECRET_MAGIC_LOG_DOOR.get(), "magic_log");
        secretDoorBlock(SBDBlocks.SECRET_UMBRAN_LOG_DOOR.get(), "umbran_log");
        secretDoorBlock(SBDBlocks.SECRET_HELLBARK_LOG_DOOR.get(), "hellbark_log");

        secretDoorBlock(SBDBlocks.SECRET_STRIPPED_FIR_LOG_DOOR.get(), "stripped_fir_log");
        secretDoorBlock(SBDBlocks.SECRET_STRIPPED_REDWOOD_LOG_DOOR.get(), "stripped_redwood_log");
        secretDoorBlock(SBDBlocks.SECRET_STRIPPED_CHERRY_LOG_DOOR.get(), "stripped_cherry_log");
        secretDoorBlock(SBDBlocks.SECRET_STRIPPED_MAHOGANY_LOG_DOOR.get(), "stripped_mahogany_log");
        secretDoorBlock(SBDBlocks.SECRET_STRIPPED_JACARANDA_LOG_DOOR.get(), "stripped_jacaranda_log");
        secretDoorBlock(SBDBlocks.SECRET_STRIPPED_PALM_LOG_DOOR.get(), "stripped_palm_log");
        secretDoorBlock(SBDBlocks.SECRET_STRIPPED_WILLOW_LOG_DOOR.get(), "stripped_willow_log");
        secretDoorBlock(SBDBlocks.SECRET_STRIPPED_DEAD_LOG_DOOR.get(), "stripped_dead_log");
        secretDoorBlock(SBDBlocks.SECRET_STRIPPED_MAGIC_LOG_DOOR.get(), "stripped_magic_log");
        secretDoorBlock(SBDBlocks.SECRET_STRIPPED_UMBRAN_LOG_DOOR.get(), "stripped_umbran_log");
        secretDoorBlock(SBDBlocks.SECRET_STRIPPED_HELLBARK_LOG_DOOR.get(), "stripped_hellbark_log");

        horizontalBOPDoorBlock(SBDBlocks.SECRET_STRIPPED_HORIZONTAL_FIR_LOG_DOOR.get(), "stripped_fir_log");
        horizontalBOPDoorBlock(SBDBlocks.SECRET_STRIPPED_HORIZONTAL_REDWOOD_LOG_DOOR.get(), "stripped_redwood_log");
        horizontalBOPDoorBlock(SBDBlocks.SECRET_STRIPPED_HORIZONTAL_CHERRY_LOG_DOOR.get(), "stripped_cherry_log");
        horizontalBOPDoorBlock(SBDBlocks.SECRET_STRIPPED_HORIZONTAL_MAHOGANY_LOG_DOOR.get(), "stripped_mahogany_log");
        horizontalBOPDoorBlock(SBDBlocks.SECRET_STRIPPED_HORIZONTAL_JACARANDA_LOG_DOOR.get(), "stripped_jacaranda_log");
        horizontalBOPDoorBlock(SBDBlocks.SECRET_STRIPPED_HORIZONTAL_PALM_LOG_DOOR.get(), "stripped_palm_log");
        horizontalBOPDoorBlock(SBDBlocks.SECRET_STRIPPED_HORIZONTAL_WILLOW_LOG_DOOR.get(), "stripped_willow_log");
        horizontalBOPDoorBlock(SBDBlocks.SECRET_STRIPPED_HORIZONTAL_DEAD_LOG_DOOR.get(), "stripped_dead_log");
        horizontalBOPDoorBlock(SBDBlocks.SECRET_STRIPPED_HORIZONTAL_MAGIC_LOG_DOOR.get(), "stripped_magic_log");
        horizontalBOPDoorBlock(SBDBlocks.SECRET_STRIPPED_HORIZONTAL_UMBRAN_LOG_DOOR.get(), "stripped_umbran_log");
        horizontalBOPDoorBlock(SBDBlocks.SECRET_STRIPPED_HORIZONTAL_HELLBARK_LOG_DOOR.get(), "stripped_hellbark_log");

        horizontalBOPDoorBlock(SBDBlocks.SECRET_HORIZONTAL_FIR_LOG_DOOR.get(), "fir_log");
        horizontalBOPDoorBlock(SBDBlocks.SECRET_HORIZONTAL_REDWOOD_LOG_DOOR.get(), "redwood_log");
        horizontalBOPDoorBlock(SBDBlocks.SECRET_HORIZONTAL_CHERRY_LOG_DOOR.get(), "cherry_log");
        horizontalBOPDoorBlock(SBDBlocks.SECRET_HORIZONTAL_MAHOGANY_LOG_DOOR.get(), "mahogany_log");
        horizontalBOPDoorBlock(SBDBlocks.SECRET_HORIZONTAL_JACARANDA_LOG_DOOR.get(), "jacaranda_log");
        horizontalBOPDoorBlock(SBDBlocks.SECRET_HORIZONTAL_PALM_LOG_DOOR.get(), "palm_log");
        horizontalBOPDoorBlock(SBDBlocks.SECRET_HORIZONTAL_WILLOW_LOG_DOOR.get(), "willow_log");
        horizontalBOPDoorBlock(SBDBlocks.SECRET_HORIZONTAL_DEAD_LOG_DOOR.get(), "dead_log");
        horizontalBOPDoorBlock(SBDBlocks.SECRET_HORIZONTAL_MAGIC_LOG_DOOR.get(), "magic_log");
        horizontalBOPDoorBlock(SBDBlocks.SECRET_HORIZONTAL_UMBRAN_LOG_DOOR.get(), "umbran_log");
        horizontalBOPDoorBlock(SBDBlocks.SECRET_HORIZONTAL_HELLBARK_LOG_DOOR.get(), "hellbark_log");

        secretDoorBlock(SBDBlocks.SECRET_WHITE_SANDSTONE_DOOR.get(), "white_sandstone");
        secretDoorBlock(SBDBlocks.SECRET_CUT_WHITE_SANDSTONE_DOOR.get(), "cut_white_sandstone");
        secretDoorBlock(SBDBlocks.SECRET_SMOOTH_WHITE_SANDSTONE_DOOR.get(), "white_sandstone_top");
        secretDoorBlock(SBDBlocks.SECRET_ORANGE_SANDSTONE_DOOR.get(), "orange_sandstone");
        secretDoorBlock(SBDBlocks.SECRET_CUT_ORANGE_SANDSTONE_DOOR.get(), "cut_orange_sandstone");
        secretDoorBlock(SBDBlocks.SECRET_SMOOTH_ORANGE_SANDSTONE_DOOR.get(), "orange_sandstone_top");
        secretDoorBlock(SBDBlocks.SECRET_BLACK_SANDSTONE_DOOR.get(), "black_sandstone");
        secretDoorBlock(SBDBlocks.SECRET_CUT_BLACK_SANDSTONE_DOOR.get(), "cut_black_sandstone");
        secretDoorBlock(SBDBlocks.SECRET_SMOOTH_BLACK_SANDSTONE_DOOR.get(), "black_sandstone_top");

        secretDoorBlock(SBDBlocks.SECRET_MUD_BRICKS_DOOR.get(), "mud_bricks");


        secretTrapdoorBlock(SBDBlocks.SECRET_FIR_PLANK_TRAPDOOR.get(), "fir_planks");
        secretTrapdoorBlock(SBDBlocks.SECRET_REDWOOD_PLANK_TRAPDOOR.get(), "redwood_planks");
        secretTrapdoorBlock(SBDBlocks.SECRET_CHERRY_PLANK_TRAPDOOR.get(), "cherry_planks");
        secretTrapdoorBlock(SBDBlocks.SECRET_MAHOGANY_PLANK_TRAPDOOR.get(), "mahogany_planks");
        secretTrapdoorBlock(SBDBlocks.SECRET_JACARANDA_PLANK_TRAPDOOR.get(), "jacaranda_planks");
        secretTrapdoorBlock(SBDBlocks.SECRET_PALM_PLANK_TRAPDOOR.get(), "palm_planks");
        secretTrapdoorBlock(SBDBlocks.SECRET_WILLOW_PLANK_TRAPDOOR.get(), "willow_planks");
        secretTrapdoorBlock(SBDBlocks.SECRET_DEAD_PLANK_TRAPDOOR.get(), "dead_planks");
        secretTrapdoorBlock(SBDBlocks.SECRET_MAGIC_PLANK_TRAPDOOR.get(), "magic_planks");
        secretTrapdoorBlock(SBDBlocks.SECRET_UMBRAN_PLANK_TRAPDOOR.get(), "umbran_planks");
        secretTrapdoorBlock(SBDBlocks.SECRET_HELLBARK_PLANK_TRAPDOOR.get(), "hellbark_planks");

        secretTrapdoorBlock(SBDBlocks.SECRET_FIR_LOG_TRAPDOOR.get(), "fir_log");
        secretTrapdoorBlock(SBDBlocks.SECRET_REDWOOD_LOG_TRAPDOOR.get(), "redwood_log");
        secretTrapdoorBlock(SBDBlocks.SECRET_CHERRY_LOG_TRAPDOOR.get(), "cherry_log");
        secretTrapdoorBlock(SBDBlocks.SECRET_MAHOGANY_LOG_TRAPDOOR.get(), "mahogany_log");
        secretTrapdoorBlock(SBDBlocks.SECRET_JACARANDA_LOG_TRAPDOOR.get(), "jacaranda_log");
        secretTrapdoorBlock(SBDBlocks.SECRET_PALM_LOG_TRAPDOOR.get(), "palm_log");
        secretTrapdoorBlock(SBDBlocks.SECRET_WILLOW_LOG_TRAPDOOR.get(), "willow_log");
        secretTrapdoorBlock(SBDBlocks.SECRET_DEAD_LOG_TRAPDOOR.get(), "dead_log");
        secretTrapdoorBlock(SBDBlocks.SECRET_MAGIC_LOG_TRAPDOOR.get(), "magic_log");
        secretTrapdoorBlock(SBDBlocks.SECRET_UMBRAN_LOG_TRAPDOOR.get(), "umbran_log");
        secretTrapdoorBlock(SBDBlocks.SECRET_HELLBARK_LOG_TRAPDOOR.get(), "hellbark_log");

        secretTrapdoorBlock(SBDBlocks.SECRET_STRIPPED_FIR_LOG_TRAPDOOR.get(), "stripped_fir_log");
        secretTrapdoorBlock(SBDBlocks.SECRET_STRIPPED_REDWOOD_LOG_TRAPDOOR.get(), "stripped_redwood_log");
        secretTrapdoorBlock(SBDBlocks.SECRET_STRIPPED_CHERRY_LOG_TRAPDOOR.get(), "stripped_cherry_log");
        secretTrapdoorBlock(SBDBlocks.SECRET_STRIPPED_MAHOGANY_LOG_TRAPDOOR.get(), "stripped_mahogany_log");
        secretTrapdoorBlock(SBDBlocks.SECRET_STRIPPED_JACARANDA_LOG_TRAPDOOR.get(), "stripped_jacaranda_log");
        secretTrapdoorBlock(SBDBlocks.SECRET_STRIPPED_PALM_LOG_TRAPDOOR.get(), "stripped_palm_log");
        secretTrapdoorBlock(SBDBlocks.SECRET_STRIPPED_WILLOW_LOG_TRAPDOOR.get(), "stripped_willow_log");
        secretTrapdoorBlock(SBDBlocks.SECRET_STRIPPED_DEAD_LOG_TRAPDOOR.get(), "stripped_dead_log");
        secretTrapdoorBlock(SBDBlocks.SECRET_STRIPPED_MAGIC_LOG_TRAPDOOR.get(), "stripped_magic_log");
        secretTrapdoorBlock(SBDBlocks.SECRET_STRIPPED_UMBRAN_LOG_TRAPDOOR.get(), "stripped_umbran_log");
        secretTrapdoorBlock(SBDBlocks.SECRET_STRIPPED_HELLBARK_LOG_TRAPDOOR.get(), "stripped_hellbark_log");

        secretTrapdoorBlock(SBDBlocks.SECRET_WHITE_SANDSTONE_TRAPDOOR.get(), "white_sandstone");
        secretTrapdoorBlock(SBDBlocks.SECRET_CUT_WHITE_SANDSTONE_TRAPDOOR.get(), "cut_white_sandstone");
        secretTrapdoorBlock(SBDBlocks.SECRET_SMOOTH_WHITE_SANDSTONE_TRAPDOOR.get(), "white_sandstone_top");
        secretTrapdoorBlock(SBDBlocks.SECRET_ORANGE_SANDSTONE_TRAPDOOR.get(), "orange_sandstone");
        secretTrapdoorBlock(SBDBlocks.SECRET_CUT_ORANGE_SANDSTONE_TRAPDOOR.get(), "cut_orange_sandstone");
        secretTrapdoorBlock(SBDBlocks.SECRET_SMOOTH_ORANGE_SANDSTONE_TRAPDOOR.get(), "orange_sandstone_top");
        secretTrapdoorBlock(SBDBlocks.SECRET_BLACK_SANDSTONE_TRAPDOOR.get(), "black_sandstone");
        secretTrapdoorBlock(SBDBlocks.SECRET_CUT_BLACK_SANDSTONE_TRAPDOOR.get(), "cut_black_sandstone");
        secretTrapdoorBlock(SBDBlocks.SECRET_SMOOTH_BLACK_SANDSTONE_TRAPDOOR.get(), "black_sandstone_top");

        secretTrapdoorBlock(SBDBlocks.SECRET_MUD_BRICKS_TRAPDOOR.get(), "mud_bricks");
    }
    
    public void secretDoorBlock(DoorBlock block, String texture) {
        doorBlock(block, new ResourceLocation(BiomesOPlenty.MOD_ID, "block/" + texture), new ResourceLocation(BiomesOPlenty.MOD_ID, "block/" + texture));
    }
//
//    public void horizontalDoorBlock(DoorBlock block, String texture) {
//        doorBlock(block, modLoc("block/" + texture), modLoc("block/" + texture));
//    }

    public void secretTrapdoorBlock(TrapDoorBlock block, String texture) {
        trapdoorBlock(block, new ResourceLocation(BiomesOPlenty.MOD_ID, "block/" + texture), true);
    }

    public ResourceLocation bopLoc(String name) {
        return new ResourceLocation(BiomesOPlenty.MOD_ID, name);
    }


    protected void horizontalDoorBlock(DoorBlock block, String texture) {
        this.doorBlock(block, models().withExistingParent(block.getRegistryName().getPath() + "_bottom", modLoc("horizontal_door_bottom")).texture("bottom", mcLoc("block/" + texture)).texture("particle", mcLoc("block/" + texture)),
                models().withExistingParent(block.getRegistryName().getPath() + "_bottom_hinge", modLoc("horizontal_door_bottom_rh")).texture("bottom", mcLoc("block/" + texture)).texture("particle", mcLoc("block/" + texture)),
                models().withExistingParent(block.getRegistryName().getPath() + "_top", modLoc("horizontal_door_top")).texture("top", mcLoc("block/" + texture)).texture("particle", mcLoc("block/" + texture)),
                models().withExistingParent(block.getRegistryName().getPath() + "_top_hinge", modLoc("horizontal_door_top_rh")).texture("top", mcLoc("block/" + texture)).texture("particle", mcLoc("block/" + texture)));
    }

    protected void horizontalBOPDoorBlock(DoorBlock block, String texture) {
        this.doorBlock(block, models().withExistingParent(block.getRegistryName().getPath() + "_bottom", modLoc("horizontal_door_bottom")).texture("bottom", bopLoc("block/" + texture)).texture("particle", bopLoc("block/" + texture)),
                models().withExistingParent(block.getRegistryName().getPath() + "_bottom_hinge", modLoc("horizontal_door_bottom_rh")).texture("bottom", bopLoc("block/" + texture)).texture("particle", bopLoc("block/" + texture)),
                models().withExistingParent(block.getRegistryName().getPath() + "_top", modLoc("horizontal_door_top")).texture("top", bopLoc("block/" + texture)).texture("particle", bopLoc("block/" + texture)),
                models().withExistingParent(block.getRegistryName().getPath() + "_top_hinge", modLoc("horizontal_door_top_rh")).texture("top", bopLoc("block/" + texture)).texture("particle", bopLoc("block/" + texture)));
    }

    protected void horizontalDoorBlock(DoorBlock block, ResourceLocation textureLoc) {
        this.doorBlock(block, models().withExistingParent(block.getRegistryName().getPath() + "_bottom", modLoc("horizontal_door_bottom")).texture("bottom", textureLoc).texture("particle", textureLoc),
                models().withExistingParent(block.getRegistryName().getPath() + "_bottom_hinge", modLoc("horizontal_door_bottom_rh")).texture("bottom", textureLoc).texture("particle", textureLoc),
                models().withExistingParent(block.getRegistryName().getPath() + "_top", modLoc("horizontal_door_top")).texture("top", textureLoc).texture("particle", textureLoc),
                models().withExistingParent(block.getRegistryName().getPath() + "_top_hinge", modLoc("horizontal_door_top_rh")).texture("top", textureLoc).texture("particle", textureLoc));
    }
}
package com.shim.secretbopdoors.datagen;

import biomesoplenty.core.BiomesOPlenty;
import com.shim.secretbopdoors.SBDBlocks;
import com.shim.secretbopdoors.SecretBOPDoors;
import com.shim.secretdoors.SecretDoors;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;

public class SBDModelProvider extends ModelProvider {

    public SBDModelProvider(PackOutput output) {
        super(output, SecretBOPDoors.MODID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {

        createSecretDoor(SBDBlocks.SECRET_FIR_PLANK_DOOR.get(), blockModels, "fir_planks");
        createSecretDoor(SBDBlocks.SECRET_REDWOOD_PLANK_DOOR.get(), blockModels, "redwood_planks");
        createSecretDoor(SBDBlocks.SECRET_MAHOGANY_PLANK_DOOR.get(), blockModels, "mahogany_planks");
        createSecretDoor(SBDBlocks.SECRET_JACARANDA_PLANK_DOOR.get(), blockModels, "jacaranda_planks");
        createSecretDoor(SBDBlocks.SECRET_PALM_PLANK_DOOR.get(), blockModels, "palm_planks");
        createSecretDoor(SBDBlocks.SECRET_WILLOW_PLANK_DOOR.get(), blockModels, "willow_planks");
        createSecretDoor(SBDBlocks.SECRET_DEAD_PLANK_DOOR.get(), blockModels, "dead_planks");
        createSecretDoor(SBDBlocks.SECRET_MAGIC_PLANK_DOOR.get(), blockModels, "magic_planks");
        createSecretDoor(SBDBlocks.SECRET_UMBRAN_PLANK_DOOR.get(), blockModels, "umbran_planks");
        createSecretDoor(SBDBlocks.SECRET_HELLBARK_PLANK_DOOR.get(), blockModels, "hellbark_planks");
        createSecretDoor(SBDBlocks.SECRET_EMPYREAL_PLANK_DOOR.get(), blockModels, "empyreal_planks");
        createSecretDoor(SBDBlocks.SECRET_MAPLE_PLANK_DOOR.get(), blockModels, "maple_planks");
        createSecretDoor(SBDBlocks.SECRET_PINE_PLANK_DOOR.get(), blockModels, "pine_planks");

        createSecretDoor(SBDBlocks.SECRET_FIR_LOG_DOOR.get(), blockModels, "fir_log");
        createSecretDoor(SBDBlocks.SECRET_REDWOOD_LOG_DOOR.get(), blockModels, "redwood_log");
        createSecretDoor(SBDBlocks.SECRET_MAHOGANY_LOG_DOOR.get(), blockModels, "mahogany_log");
        createSecretDoor(SBDBlocks.SECRET_JACARANDA_LOG_DOOR.get(), blockModels, "jacaranda_log");
        createSecretDoor(SBDBlocks.SECRET_PALM_LOG_DOOR.get(), blockModels, "palm_log");
        createSecretDoor(SBDBlocks.SECRET_WILLOW_LOG_DOOR.get(), blockModels, "willow_log");
        createSecretDoor(SBDBlocks.SECRET_DEAD_LOG_DOOR.get(), blockModels, "dead_log");
        createSecretDoor(SBDBlocks.SECRET_MAGIC_LOG_DOOR.get(), blockModels, "magic_log");
        createSecretDoor(SBDBlocks.SECRET_UMBRAN_LOG_DOOR.get(), blockModels, "umbran_log");
        createSecretDoor(SBDBlocks.SECRET_HELLBARK_LOG_DOOR.get(), blockModels, "hellbark_log");
        createSecretDoor(SBDBlocks.SECRET_EMPYREAL_LOG_DOOR.get(), blockModels, "empyreal_log");
        createSecretDoor(SBDBlocks.SECRET_MAPLE_LOG_DOOR.get(), blockModels, "maple_log");
        createSecretDoor(SBDBlocks.SECRET_PINE_LOG_DOOR.get(), blockModels, "pine_log");

        createSecretDoor(SBDBlocks.SECRET_STRIPPED_FIR_LOG_DOOR.get(), blockModels, "stripped_fir_log");
        createSecretDoor(SBDBlocks.SECRET_STRIPPED_REDWOOD_LOG_DOOR.get(), blockModels, "stripped_redwood_log");
        createSecretDoor(SBDBlocks.SECRET_STRIPPED_MAHOGANY_LOG_DOOR.get(), blockModels, "stripped_mahogany_log");
        createSecretDoor(SBDBlocks.SECRET_STRIPPED_JACARANDA_LOG_DOOR.get(), blockModels, "stripped_jacaranda_log");
        createSecretDoor(SBDBlocks.SECRET_STRIPPED_PALM_LOG_DOOR.get(), blockModels, "stripped_palm_log");
        createSecretDoor(SBDBlocks.SECRET_STRIPPED_WILLOW_LOG_DOOR.get(), blockModels, "stripped_willow_log");
        createSecretDoor(SBDBlocks.SECRET_STRIPPED_DEAD_LOG_DOOR.get(), blockModels, "stripped_dead_log");
        createSecretDoor(SBDBlocks.SECRET_STRIPPED_MAGIC_LOG_DOOR.get(), blockModels, "stripped_magic_log");
        createSecretDoor(SBDBlocks.SECRET_STRIPPED_UMBRAN_LOG_DOOR.get(), blockModels, "stripped_umbran_log");
        createSecretDoor(SBDBlocks.SECRET_STRIPPED_HELLBARK_LOG_DOOR.get(), blockModels, "stripped_hellbark_log");
        createSecretDoor(SBDBlocks.SECRET_STRIPPED_EMPYREAL_LOG_DOOR.get(), blockModels, "stripped_empyreal_log");
        createSecretDoor(SBDBlocks.SECRET_STRIPPED_MAPLE_LOG_DOOR.get(), blockModels, "stripped_maple_log");
        createSecretDoor(SBDBlocks.SECRET_STRIPPED_PINE_LOG_DOOR.get(), blockModels, "stripped_pine_log");

        createSecretHorizontalDoor(SBDBlocks.SECRET_STRIPPED_HORIZONTAL_FIR_LOG_DOOR.get(), blockModels, "stripped_fir_log");
        createSecretHorizontalDoor(SBDBlocks.SECRET_STRIPPED_HORIZONTAL_REDWOOD_LOG_DOOR.get(), blockModels, "stripped_redwood_log");
        createSecretHorizontalDoor(SBDBlocks.SECRET_STRIPPED_HORIZONTAL_MAHOGANY_LOG_DOOR.get(), blockModels, "stripped_mahogany_log");
        createSecretHorizontalDoor(SBDBlocks.SECRET_STRIPPED_HORIZONTAL_JACARANDA_LOG_DOOR.get(), blockModels, "stripped_jacaranda_log");
        createSecretHorizontalDoor(SBDBlocks.SECRET_STRIPPED_HORIZONTAL_PALM_LOG_DOOR.get(), blockModels, "stripped_palm_log");
        createSecretHorizontalDoor(SBDBlocks.SECRET_STRIPPED_HORIZONTAL_WILLOW_LOG_DOOR.get(), blockModels, "stripped_willow_log");
        createSecretHorizontalDoor(SBDBlocks.SECRET_STRIPPED_HORIZONTAL_DEAD_LOG_DOOR.get(), blockModels, "stripped_dead_log");
        createSecretHorizontalDoor(SBDBlocks.SECRET_STRIPPED_HORIZONTAL_MAGIC_LOG_DOOR.get(), blockModels, "stripped_magic_log");
        createSecretHorizontalDoor(SBDBlocks.SECRET_STRIPPED_HORIZONTAL_UMBRAN_LOG_DOOR.get(), blockModels, "stripped_umbran_log");
        createSecretHorizontalDoor(SBDBlocks.SECRET_STRIPPED_HORIZONTAL_HELLBARK_LOG_DOOR.get(), blockModels, "stripped_hellbark_log");
        createSecretHorizontalDoor(SBDBlocks.SECRET_STRIPPED_HORIZONTAL_EMPYREAL_LOG_DOOR.get(), blockModels, "stripped_empyreal_log");
        createSecretHorizontalDoor(SBDBlocks.SECRET_STRIPPED_HORIZONTAL_MAPLE_LOG_DOOR.get(), blockModels, "stripped_maple_log");
        createSecretHorizontalDoor(SBDBlocks.SECRET_STRIPPED_HORIZONTAL_PINE_LOG_DOOR.get(), blockModels, "stripped_pine_log");

        createSecretHorizontalDoor(SBDBlocks.SECRET_HORIZONTAL_FIR_LOG_DOOR.get(), blockModels, "fir_log");
        createSecretHorizontalDoor(SBDBlocks.SECRET_HORIZONTAL_REDWOOD_LOG_DOOR.get(), blockModels, "redwood_log");
        createSecretHorizontalDoor(SBDBlocks.SECRET_HORIZONTAL_MAHOGANY_LOG_DOOR.get(), blockModels, "mahogany_log");
        createSecretHorizontalDoor(SBDBlocks.SECRET_HORIZONTAL_JACARANDA_LOG_DOOR.get(), blockModels, "jacaranda_log");
        createSecretHorizontalDoor(SBDBlocks.SECRET_HORIZONTAL_PALM_LOG_DOOR.get(), blockModels, "palm_log");
        createSecretHorizontalDoor(SBDBlocks.SECRET_HORIZONTAL_WILLOW_LOG_DOOR.get(), blockModels, "willow_log");
        createSecretHorizontalDoor(SBDBlocks.SECRET_HORIZONTAL_DEAD_LOG_DOOR.get(), blockModels, "dead_log");
        createSecretHorizontalDoor(SBDBlocks.SECRET_HORIZONTAL_MAGIC_LOG_DOOR.get(), blockModels, "magic_log");
        createSecretHorizontalDoor(SBDBlocks.SECRET_HORIZONTAL_UMBRAN_LOG_DOOR.get(), blockModels, "umbran_log");
        createSecretHorizontalDoor(SBDBlocks.SECRET_HORIZONTAL_HELLBARK_LOG_DOOR.get(), blockModels, "hellbark_log");
        createSecretHorizontalDoor(SBDBlocks.SECRET_HORIZONTAL_EMPYREAL_LOG_DOOR.get(), blockModels, "empyreal_log");
        createSecretHorizontalDoor(SBDBlocks.SECRET_HORIZONTAL_MAPLE_LOG_DOOR.get(), blockModels, "maple_log");
        createSecretHorizontalDoor(SBDBlocks.SECRET_HORIZONTAL_PINE_LOG_DOOR.get(), blockModels, "pine_log");

        createSecretDoor(SBDBlocks.SECRET_WHITE_SANDSTONE_DOOR.get(), blockModels, "white_sandstone");
        createSecretDoor(SBDBlocks.SECRET_CUT_WHITE_SANDSTONE_DOOR.get(), blockModels, "cut_white_sandstone");
        createSecretDoor(SBDBlocks.SECRET_SMOOTH_WHITE_SANDSTONE_DOOR.get(), blockModels, "white_sandstone_top");
        createSecretDoor(SBDBlocks.SECRET_ORANGE_SANDSTONE_DOOR.get(), blockModels, "orange_sandstone");
        createSecretDoor(SBDBlocks.SECRET_CUT_ORANGE_SANDSTONE_DOOR.get(), blockModels, "cut_orange_sandstone");
        createSecretDoor(SBDBlocks.SECRET_SMOOTH_ORANGE_SANDSTONE_DOOR.get(), blockModels, "orange_sandstone_top");
        createSecretDoor(SBDBlocks.SECRET_BLACK_SANDSTONE_DOOR.get(), blockModels, "black_sandstone");
        createSecretDoor(SBDBlocks.SECRET_CUT_BLACK_SANDSTONE_DOOR.get(), blockModels, "cut_black_sandstone");
        createSecretDoor(SBDBlocks.SECRET_SMOOTH_BLACK_SANDSTONE_DOOR.get(), blockModels, "black_sandstone_top");


        createSecretTrapdoor(SBDBlocks.SECRET_FIR_PLANK_TRAPDOOR.get(), blockModels, "fir_planks");
        createSecretTrapdoor(SBDBlocks.SECRET_REDWOOD_PLANK_TRAPDOOR.get(), blockModels, "redwood_planks");
        createSecretTrapdoor(SBDBlocks.SECRET_MAHOGANY_PLANK_TRAPDOOR.get(), blockModels, "mahogany_planks");
        createSecretTrapdoor(SBDBlocks.SECRET_JACARANDA_PLANK_TRAPDOOR.get(), blockModels, "jacaranda_planks");
        createSecretTrapdoor(SBDBlocks.SECRET_PALM_PLANK_TRAPDOOR.get(), blockModels, "palm_planks");
        createSecretTrapdoor(SBDBlocks.SECRET_WILLOW_PLANK_TRAPDOOR.get(), blockModels, "willow_planks");
        createSecretTrapdoor(SBDBlocks.SECRET_DEAD_PLANK_TRAPDOOR.get(), blockModels, "dead_planks");
        createSecretTrapdoor(SBDBlocks.SECRET_MAGIC_PLANK_TRAPDOOR.get(), blockModels, "magic_planks");
        createSecretTrapdoor(SBDBlocks.SECRET_UMBRAN_PLANK_TRAPDOOR.get(), blockModels, "umbran_planks");
        createSecretTrapdoor(SBDBlocks.SECRET_HELLBARK_PLANK_TRAPDOOR.get(), blockModels, "hellbark_planks");
        createSecretTrapdoor(SBDBlocks.SECRET_EMPYREAL_PLANK_TRAPDOOR.get(), blockModels, "empyreal_planks");
        createSecretTrapdoor(SBDBlocks.SECRET_MAPLE_PLANK_TRAPDOOR.get(), blockModels, "maple_planks");
        createSecretTrapdoor(SBDBlocks.SECRET_PINE_PLANK_TRAPDOOR.get(), blockModels, "pine_planks");

        createSecretTrapdoor(SBDBlocks.SECRET_FIR_LOG_TRAPDOOR.get(), blockModels, "fir_log");
        createSecretTrapdoor(SBDBlocks.SECRET_REDWOOD_LOG_TRAPDOOR.get(), blockModels, "redwood_log");
        createSecretTrapdoor(SBDBlocks.SECRET_MAHOGANY_LOG_TRAPDOOR.get(), blockModels, "mahogany_log");
        createSecretTrapdoor(SBDBlocks.SECRET_JACARANDA_LOG_TRAPDOOR.get(), blockModels, "jacaranda_log");
        createSecretTrapdoor(SBDBlocks.SECRET_PALM_LOG_TRAPDOOR.get(), blockModels, "palm_log");
        createSecretTrapdoor(SBDBlocks.SECRET_WILLOW_LOG_TRAPDOOR.get(), blockModels, "willow_log");
        createSecretTrapdoor(SBDBlocks.SECRET_DEAD_LOG_TRAPDOOR.get(), blockModels, "dead_log");
        createSecretTrapdoor(SBDBlocks.SECRET_MAGIC_LOG_TRAPDOOR.get(), blockModels, "magic_log");
        createSecretTrapdoor(SBDBlocks.SECRET_UMBRAN_LOG_TRAPDOOR.get(), blockModels, "umbran_log");
        createSecretTrapdoor(SBDBlocks.SECRET_HELLBARK_LOG_TRAPDOOR.get(), blockModels, "hellbark_log");
        createSecretTrapdoor(SBDBlocks.SECRET_EMPYREAL_LOG_TRAPDOOR.get(), blockModels, "empyreal_log");
        createSecretTrapdoor(SBDBlocks.SECRET_MAPLE_LOG_TRAPDOOR.get(), blockModels, "maple_log");
        createSecretTrapdoor(SBDBlocks.SECRET_PINE_LOG_TRAPDOOR.get(), blockModels, "pine_log");

        createSecretTrapdoor(SBDBlocks.SECRET_STRIPPED_FIR_LOG_TRAPDOOR.get(), blockModels, "stripped_fir_log");
        createSecretTrapdoor(SBDBlocks.SECRET_STRIPPED_REDWOOD_LOG_TRAPDOOR.get(), blockModels, "stripped_redwood_log");
        createSecretTrapdoor(SBDBlocks.SECRET_STRIPPED_MAHOGANY_LOG_TRAPDOOR.get(), blockModels, "stripped_mahogany_log");
        createSecretTrapdoor(SBDBlocks.SECRET_STRIPPED_JACARANDA_LOG_TRAPDOOR.get(), blockModels, "stripped_jacaranda_log");
        createSecretTrapdoor(SBDBlocks.SECRET_STRIPPED_PALM_LOG_TRAPDOOR.get(), blockModels, "stripped_palm_log");
        createSecretTrapdoor(SBDBlocks.SECRET_STRIPPED_WILLOW_LOG_TRAPDOOR.get(), blockModels, "stripped_willow_log");
        createSecretTrapdoor(SBDBlocks.SECRET_STRIPPED_DEAD_LOG_TRAPDOOR.get(), blockModels, "stripped_dead_log");
        createSecretTrapdoor(SBDBlocks.SECRET_STRIPPED_MAGIC_LOG_TRAPDOOR.get(), blockModels, "stripped_magic_log");
        createSecretTrapdoor(SBDBlocks.SECRET_STRIPPED_UMBRAN_LOG_TRAPDOOR.get(), blockModels, "stripped_umbran_log");
        createSecretTrapdoor(SBDBlocks.SECRET_STRIPPED_HELLBARK_LOG_TRAPDOOR.get(), blockModels, "stripped_hellbark_log");
        createSecretTrapdoor(SBDBlocks.SECRET_STRIPPED_EMPYREAL_LOG_TRAPDOOR.get(), blockModels, "stripped_empyreal_log");
        createSecretTrapdoor(SBDBlocks.SECRET_STRIPPED_MAPLE_LOG_TRAPDOOR.get(), blockModels, "stripped_maple_log");
        createSecretTrapdoor(SBDBlocks.SECRET_STRIPPED_PINE_LOG_TRAPDOOR.get(), blockModels, "stripped_pine_log");

        createSecretTrapdoor(SBDBlocks.SECRET_WHITE_SANDSTONE_TRAPDOOR.get(), blockModels, "white_sandstone");
        createSecretTrapdoor(SBDBlocks.SECRET_CUT_WHITE_SANDSTONE_TRAPDOOR.get(), blockModels, "cut_white_sandstone");
        createSecretTrapdoor(SBDBlocks.SECRET_SMOOTH_WHITE_SANDSTONE_TRAPDOOR.get(), blockModels, "white_sandstone_top");
        createSecretTrapdoor(SBDBlocks.SECRET_ORANGE_SANDSTONE_TRAPDOOR.get(), blockModels, "orange_sandstone");
        createSecretTrapdoor(SBDBlocks.SECRET_CUT_ORANGE_SANDSTONE_TRAPDOOR.get(), blockModels, "cut_orange_sandstone");
        createSecretTrapdoor(SBDBlocks.SECRET_SMOOTH_ORANGE_SANDSTONE_TRAPDOOR.get(), blockModels, "orange_sandstone_top");
        createSecretTrapdoor(SBDBlocks.SECRET_BLACK_SANDSTONE_TRAPDOOR.get(), blockModels, "black_sandstone");
        createSecretTrapdoor(SBDBlocks.SECRET_CUT_BLACK_SANDSTONE_TRAPDOOR.get(), blockModels, "cut_black_sandstone");
        createSecretTrapdoor(SBDBlocks.SECRET_SMOOTH_BLACK_SANDSTONE_TRAPDOOR.get(), blockModels, "black_sandstone_top");

    }


    public static void createSecretDoor(Block doorBlock, BlockModelGenerators blockModel, String doorTexture) {
        TextureMapping texturemapping = (new TextureMapping()).put(TextureSlot.TOP, ResourceLocation.fromNamespaceAndPath(BiomesOPlenty.MOD_ID, "block/" + doorTexture)).put(TextureSlot.BOTTOM, ResourceLocation.fromNamespaceAndPath(BiomesOPlenty.MOD_ID, "block/" + doorTexture));
        ResourceLocation resourcelocation = ModelTemplates.DOOR_BOTTOM_LEFT.create(doorBlock, texturemapping, blockModel.modelOutput);
        ResourceLocation resourcelocation1 = ModelTemplates.DOOR_BOTTOM_LEFT_OPEN.create(doorBlock, texturemapping, blockModel.modelOutput);
        ResourceLocation resourcelocation2 = ModelTemplates.DOOR_BOTTOM_RIGHT.create(doorBlock, texturemapping, blockModel.modelOutput);
        ResourceLocation resourcelocation3 = ModelTemplates.DOOR_BOTTOM_RIGHT_OPEN.create(doorBlock, texturemapping, blockModel.modelOutput);
        ResourceLocation resourcelocation4 = ModelTemplates.DOOR_TOP_LEFT.create(doorBlock, texturemapping, blockModel.modelOutput);
        ResourceLocation resourcelocation5 = ModelTemplates.DOOR_TOP_LEFT_OPEN.create(doorBlock, texturemapping, blockModel.modelOutput);
        ResourceLocation resourcelocation6 = ModelTemplates.DOOR_TOP_RIGHT.create(doorBlock, texturemapping, blockModel.modelOutput);
        ResourceLocation resourcelocation7 = ModelTemplates.DOOR_TOP_RIGHT_OPEN.create(doorBlock, texturemapping, blockModel.modelOutput);
        blockModel.registerSimpleFlatItemModel(doorBlock.asItem());
        blockModel.blockStateOutput.accept(BlockModelGenerators.createDoor(doorBlock, resourcelocation, resourcelocation1, resourcelocation2, resourcelocation3, resourcelocation4, resourcelocation5, resourcelocation6, resourcelocation7));
    }

    public void createSecretHorizontalDoor(Block doorBlock, BlockModelGenerators blockModel, String doorTexture) {
        TextureMapping texturemapping = (new TextureMapping()).put(TextureSlot.BOTTOM, ResourceLocation.fromNamespaceAndPath(BiomesOPlenty.MOD_ID, "block/" + doorTexture)).put(TextureSlot.TOP, ResourceLocation.fromNamespaceAndPath(BiomesOPlenty.MOD_ID, "block/" + doorTexture));

        ResourceLocation bottomLeft = ModelTemplates.DOOR_BOTTOM_LEFT.extend().parent(ResourceLocation.fromNamespaceAndPath(SecretDoors.MODID, "block/horizontal_door_bottom_left")).build().create(doorBlock, texturemapping, blockModel.modelOutput);
        ResourceLocation bottomLeftO = ModelTemplates.DOOR_BOTTOM_LEFT_OPEN.extend().parent(ResourceLocation.fromNamespaceAndPath(SecretDoors.MODID, "block/horizontal_door_bottom_left_open")).build().create(doorBlock, texturemapping, blockModel.modelOutput);
        ResourceLocation bottomRight = ModelTemplates.DOOR_BOTTOM_RIGHT.extend().parent(ResourceLocation.fromNamespaceAndPath(SecretDoors.MODID, "block/horizontal_door_bottom_right")).build().create(doorBlock, texturemapping, blockModel.modelOutput);
        ResourceLocation bottomRightO = ModelTemplates.DOOR_BOTTOM_RIGHT_OPEN.extend().parent(ResourceLocation.fromNamespaceAndPath(SecretDoors.MODID, "block/horizontal_door_bottom_right_open")).build().create(doorBlock, texturemapping, blockModel.modelOutput);
        ResourceLocation topLeft = ModelTemplates.DOOR_TOP_LEFT.extend().parent(ResourceLocation.fromNamespaceAndPath(SecretDoors.MODID, "block/horizontal_door_top_left")).build().create(doorBlock, texturemapping, blockModel.modelOutput);
        ResourceLocation topLeftO = ModelTemplates.DOOR_TOP_LEFT_OPEN.extend().parent(ResourceLocation.fromNamespaceAndPath(SecretDoors.MODID, "block/horizontal_door_top_left_open")).build().create(doorBlock, texturemapping, blockModel.modelOutput);
        ResourceLocation topRight = ModelTemplates.DOOR_TOP_RIGHT.extend().parent(ResourceLocation.fromNamespaceAndPath(SecretDoors.MODID, "block/horizontal_door_top_right")).build().create(doorBlock, texturemapping, blockModel.modelOutput);
        ResourceLocation topRightO = ModelTemplates.DOOR_TOP_RIGHT_OPEN.extend().parent(ResourceLocation.fromNamespaceAndPath(SecretDoors.MODID, "block/horizontal_door_top_right_open")).build().create(doorBlock, texturemapping, blockModel.modelOutput);
        blockModel.registerSimpleFlatItemModel(doorBlock.asItem());
        blockModel.blockStateOutput.accept(BlockModelGenerators.createDoor(doorBlock, bottomLeft, bottomLeftO, bottomRight, bottomRightO, topLeft, topLeftO, topRight, topRightO));
    }

    public static void createSecretTrapdoor(Block trapdoorBlock, BlockModelGenerators blockModel, String trapdoorTexture) {
        TextureMapping texturemapping = (new TextureMapping()).put(TextureSlot.TEXTURE, ResourceLocation.fromNamespaceAndPath(BiomesOPlenty.MOD_ID, "block/" + trapdoorTexture));
        ResourceLocation resourcelocation = ModelTemplates.ORIENTABLE_TRAPDOOR_TOP.create(trapdoorBlock, texturemapping, blockModel.modelOutput);
        ResourceLocation resourcelocation1 = ModelTemplates.ORIENTABLE_TRAPDOOR_BOTTOM.create(trapdoorBlock, texturemapping, blockModel.modelOutput);
        ResourceLocation resourcelocation2 = ModelTemplates.ORIENTABLE_TRAPDOOR_OPEN.create(trapdoorBlock, texturemapping, blockModel.modelOutput);
        blockModel.blockStateOutput.accept(BlockModelGenerators.createOrientableTrapdoor(trapdoorBlock, resourcelocation, resourcelocation1, resourcelocation2));
        blockModel.registerSimpleItemModel(trapdoorBlock, resourcelocation1);
    }
}
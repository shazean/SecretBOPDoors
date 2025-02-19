package com.shim.secretbopdoors.datagen;

import biomesoplenty.api.block.BOPBlocks;
import com.shim.secretbopdoors.SBDBlocks;
import com.shim.secretdoors.SecretDoors;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

public class SBDRecipes extends RecipeProvider implements IConditionBuilder {

    public SBDRecipes(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput output) {


        woodenDoor(SBDBlocks.SECRET_FIR_PLANK_DOOR.get(), BOPBlocks.FIR_PLANKS, output);
        woodenDoor(SBDBlocks.SECRET_REDWOOD_PLANK_DOOR.get(), BOPBlocks.REDWOOD_PLANKS, output);
        woodenDoor(SBDBlocks.SECRET_MAHOGANY_PLANK_DOOR.get(), BOPBlocks.MAHOGANY_PLANKS, output);
        woodenDoor(SBDBlocks.SECRET_JACARANDA_PLANK_DOOR.get(), BOPBlocks.JACARANDA_PLANKS, output);
        woodenDoor(SBDBlocks.SECRET_PALM_PLANK_DOOR.get(), BOPBlocks.PALM_PLANKS, output);
        woodenDoor(SBDBlocks.SECRET_WILLOW_PLANK_DOOR.get(), BOPBlocks.WILLOW_PLANKS, output);
        woodenDoor(SBDBlocks.SECRET_DEAD_PLANK_DOOR.get(), BOPBlocks.DEAD_PLANKS, output);
        woodenDoor(SBDBlocks.SECRET_MAGIC_PLANK_DOOR.get(), BOPBlocks.MAGIC_PLANKS, output);
        woodenDoor(SBDBlocks.SECRET_UMBRAN_PLANK_DOOR.get(), BOPBlocks.UMBRAN_PLANKS, output);
        woodenDoor(SBDBlocks.SECRET_HELLBARK_PLANK_DOOR.get(), BOPBlocks.HELLBARK_PLANKS, output);

        verticalAndHorizontalDoor(SBDBlocks.SECRET_FIR_LOG_DOOR.get(), SBDBlocks.SECRET_HORIZONTAL_FIR_LOG_DOOR.get(), BOPBlocks.FIR_LOG, output);
        verticalAndHorizontalDoor(SBDBlocks.SECRET_REDWOOD_LOG_DOOR.get(), SBDBlocks.SECRET_HORIZONTAL_REDWOOD_LOG_DOOR.get(), BOPBlocks.REDWOOD_LOG, output);
        verticalAndHorizontalDoor(SBDBlocks.SECRET_MAHOGANY_LOG_DOOR.get(), SBDBlocks.SECRET_HORIZONTAL_MAHOGANY_LOG_DOOR.get(), BOPBlocks.MAHOGANY_LOG, output);
        verticalAndHorizontalDoor(SBDBlocks.SECRET_JACARANDA_LOG_DOOR.get(), SBDBlocks.SECRET_HORIZONTAL_JACARANDA_LOG_DOOR.get(), BOPBlocks.JACARANDA_LOG, output);
        verticalAndHorizontalDoor(SBDBlocks.SECRET_PALM_LOG_DOOR.get(), SBDBlocks.SECRET_HORIZONTAL_PALM_LOG_DOOR.get(), BOPBlocks.PALM_LOG, output);
        verticalAndHorizontalDoor(SBDBlocks.SECRET_WILLOW_LOG_DOOR.get(), SBDBlocks.SECRET_HORIZONTAL_WILLOW_LOG_DOOR.get(), BOPBlocks.WILLOW_LOG, output);
        verticalAndHorizontalDoor(SBDBlocks.SECRET_DEAD_LOG_DOOR.get(), SBDBlocks.SECRET_HORIZONTAL_DEAD_LOG_DOOR.get(), BOPBlocks.DEAD_LOG, output);
        verticalAndHorizontalDoor(SBDBlocks.SECRET_MAGIC_LOG_DOOR.get(), SBDBlocks.SECRET_HORIZONTAL_MAGIC_LOG_DOOR.get(), BOPBlocks.MAGIC_LOG, output);
        verticalAndHorizontalDoor(SBDBlocks.SECRET_UMBRAN_LOG_DOOR.get(), SBDBlocks.SECRET_HORIZONTAL_UMBRAN_LOG_DOOR.get(), BOPBlocks.UMBRAN_LOG, output);
        verticalAndHorizontalDoor(SBDBlocks.SECRET_HELLBARK_LOG_DOOR.get(), SBDBlocks.SECRET_HORIZONTAL_HELLBARK_LOG_DOOR.get(), BOPBlocks.HELLBARK_LOG, output);

        verticalAndHorizontalDoor(SBDBlocks.SECRET_STRIPPED_FIR_LOG_DOOR.get(), SBDBlocks.SECRET_STRIPPED_HORIZONTAL_FIR_LOG_DOOR.get(), BOPBlocks.STRIPPED_FIR_LOG, output);
        verticalAndHorizontalDoor(SBDBlocks.SECRET_STRIPPED_REDWOOD_LOG_DOOR.get(), SBDBlocks.SECRET_STRIPPED_HORIZONTAL_REDWOOD_LOG_DOOR.get(), BOPBlocks.STRIPPED_REDWOOD_LOG, output);
        verticalAndHorizontalDoor(SBDBlocks.SECRET_STRIPPED_MAHOGANY_LOG_DOOR.get(), SBDBlocks.SECRET_STRIPPED_HORIZONTAL_MAHOGANY_LOG_DOOR.get(), BOPBlocks.STRIPPED_MAHOGANY_LOG, output);
        verticalAndHorizontalDoor(SBDBlocks.SECRET_STRIPPED_JACARANDA_LOG_DOOR.get(), SBDBlocks.SECRET_STRIPPED_HORIZONTAL_JACARANDA_LOG_DOOR.get(), BOPBlocks.STRIPPED_JACARANDA_LOG, output);
        verticalAndHorizontalDoor(SBDBlocks.SECRET_STRIPPED_PALM_LOG_DOOR.get(), SBDBlocks.SECRET_STRIPPED_HORIZONTAL_PALM_LOG_DOOR.get(), BOPBlocks.STRIPPED_PALM_LOG, output);
        verticalAndHorizontalDoor(SBDBlocks.SECRET_STRIPPED_WILLOW_LOG_DOOR.get(), SBDBlocks.SECRET_STRIPPED_HORIZONTAL_WILLOW_LOG_DOOR.get(), BOPBlocks.STRIPPED_WILLOW_LOG, output);
        verticalAndHorizontalDoor(SBDBlocks.SECRET_STRIPPED_DEAD_LOG_DOOR.get(), SBDBlocks.SECRET_STRIPPED_HORIZONTAL_DEAD_LOG_DOOR.get(), BOPBlocks.STRIPPED_DEAD_LOG, output);
        verticalAndHorizontalDoor(SBDBlocks.SECRET_STRIPPED_MAGIC_LOG_DOOR.get(), SBDBlocks.SECRET_STRIPPED_HORIZONTAL_MAGIC_LOG_DOOR.get(), BOPBlocks.STRIPPED_MAGIC_LOG, output);
        verticalAndHorizontalDoor(SBDBlocks.SECRET_STRIPPED_UMBRAN_LOG_DOOR.get(), SBDBlocks.SECRET_STRIPPED_HORIZONTAL_UMBRAN_LOG_DOOR.get(), BOPBlocks.STRIPPED_UMBRAN_LOG, output);
        verticalAndHorizontalDoor(SBDBlocks.SECRET_STRIPPED_HELLBARK_LOG_DOOR.get(), SBDBlocks.SECRET_STRIPPED_HORIZONTAL_HELLBARK_LOG_DOOR.get(), BOPBlocks.STRIPPED_HELLBARK_LOG, output);
        

        door(SBDBlocks.SECRET_WHITE_SANDSTONE_DOOR.get(), BOPBlocks.WHITE_SANDSTONE, output);
        door(SBDBlocks.SECRET_CUT_WHITE_SANDSTONE_DOOR.get(), BOPBlocks.CUT_WHITE_SANDSTONE, output);
        door(SBDBlocks.SECRET_SMOOTH_WHITE_SANDSTONE_DOOR.get(), BOPBlocks.SMOOTH_WHITE_SANDSTONE, output);
        door(SBDBlocks.SECRET_ORANGE_SANDSTONE_DOOR.get(), BOPBlocks.ORANGE_SANDSTONE, output);
        door(SBDBlocks.SECRET_CUT_ORANGE_SANDSTONE_DOOR.get(), BOPBlocks.CUT_ORANGE_SANDSTONE, output);
        door(SBDBlocks.SECRET_SMOOTH_ORANGE_SANDSTONE_DOOR.get(), BOPBlocks.SMOOTH_ORANGE_SANDSTONE, output);
        door(SBDBlocks.SECRET_BLACK_SANDSTONE_DOOR.get(), BOPBlocks.BLACK_SANDSTONE, output);
        door(SBDBlocks.SECRET_CUT_BLACK_SANDSTONE_DOOR.get(), BOPBlocks.CUT_BLACK_SANDSTONE, output);
        door(SBDBlocks.SECRET_SMOOTH_BLACK_SANDSTONE_DOOR.get(), BOPBlocks.SMOOTH_BLACK_SANDSTONE, output);

        woodenTrapdoor(SBDBlocks.SECRET_FIR_PLANK_TRAPDOOR.get(), BOPBlocks.FIR_PLANKS, output);
        woodenTrapdoor(SBDBlocks.SECRET_REDWOOD_PLANK_TRAPDOOR.get(), BOPBlocks.REDWOOD_PLANKS, output);
        woodenTrapdoor(SBDBlocks.SECRET_MAHOGANY_PLANK_TRAPDOOR.get(), BOPBlocks.MAHOGANY_PLANKS, output);
        woodenTrapdoor(SBDBlocks.SECRET_JACARANDA_PLANK_TRAPDOOR.get(), BOPBlocks.JACARANDA_PLANKS, output);
        woodenTrapdoor(SBDBlocks.SECRET_PALM_PLANK_TRAPDOOR.get(), BOPBlocks.PALM_PLANKS, output);
        woodenTrapdoor(SBDBlocks.SECRET_WILLOW_PLANK_TRAPDOOR.get(), BOPBlocks.WILLOW_PLANKS, output);
        woodenTrapdoor(SBDBlocks.SECRET_DEAD_PLANK_TRAPDOOR.get(), BOPBlocks.DEAD_PLANKS, output);
        woodenTrapdoor(SBDBlocks.SECRET_MAGIC_PLANK_TRAPDOOR.get(), BOPBlocks.MAGIC_PLANKS, output);
        woodenTrapdoor(SBDBlocks.SECRET_UMBRAN_PLANK_TRAPDOOR.get(), BOPBlocks.UMBRAN_PLANKS, output);
        woodenTrapdoor(SBDBlocks.SECRET_HELLBARK_PLANK_TRAPDOOR.get(), BOPBlocks.HELLBARK_PLANKS, output);

        woodenTrapdoor(SBDBlocks.SECRET_FIR_LOG_TRAPDOOR.get(), BOPBlocks.FIR_LOG, output);
        woodenTrapdoor(SBDBlocks.SECRET_REDWOOD_LOG_TRAPDOOR.get(), BOPBlocks.REDWOOD_LOG, output);
        woodenTrapdoor(SBDBlocks.SECRET_MAHOGANY_LOG_TRAPDOOR.get(), BOPBlocks.MAHOGANY_LOG, output);
        woodenTrapdoor(SBDBlocks.SECRET_JACARANDA_LOG_TRAPDOOR.get(), BOPBlocks.JACARANDA_LOG, output);
        woodenTrapdoor(SBDBlocks.SECRET_PALM_LOG_TRAPDOOR.get(), BOPBlocks.PALM_LOG, output);
        woodenTrapdoor(SBDBlocks.SECRET_WILLOW_LOG_TRAPDOOR.get(), BOPBlocks.WILLOW_LOG, output);
        woodenTrapdoor(SBDBlocks.SECRET_DEAD_LOG_TRAPDOOR.get(), BOPBlocks.DEAD_LOG, output);
        woodenTrapdoor(SBDBlocks.SECRET_MAGIC_LOG_TRAPDOOR.get(), BOPBlocks.MAGIC_LOG, output);
        woodenTrapdoor(SBDBlocks.SECRET_UMBRAN_LOG_TRAPDOOR.get(), BOPBlocks.UMBRAN_LOG, output);
        woodenTrapdoor(SBDBlocks.SECRET_HELLBARK_LOG_TRAPDOOR.get(), BOPBlocks.HELLBARK_LOG, output);

        woodenTrapdoor(SBDBlocks.SECRET_STRIPPED_FIR_LOG_TRAPDOOR.get(), BOPBlocks.STRIPPED_FIR_LOG, output);
        woodenTrapdoor(SBDBlocks.SECRET_STRIPPED_REDWOOD_LOG_TRAPDOOR.get(), BOPBlocks.STRIPPED_REDWOOD_LOG, output);
        woodenTrapdoor(SBDBlocks.SECRET_STRIPPED_MAHOGANY_LOG_TRAPDOOR.get(), BOPBlocks.STRIPPED_MAHOGANY_LOG, output);
        woodenTrapdoor(SBDBlocks.SECRET_STRIPPED_JACARANDA_LOG_TRAPDOOR.get(), BOPBlocks.STRIPPED_JACARANDA_LOG, output);
        woodenTrapdoor(SBDBlocks.SECRET_STRIPPED_PALM_LOG_TRAPDOOR.get(), BOPBlocks.STRIPPED_PALM_LOG, output);
        woodenTrapdoor(SBDBlocks.SECRET_STRIPPED_WILLOW_LOG_TRAPDOOR.get(), BOPBlocks.STRIPPED_WILLOW_LOG, output);
        woodenTrapdoor(SBDBlocks.SECRET_STRIPPED_DEAD_LOG_TRAPDOOR.get(), BOPBlocks.STRIPPED_DEAD_LOG, output);
        woodenTrapdoor(SBDBlocks.SECRET_STRIPPED_MAGIC_LOG_TRAPDOOR.get(), BOPBlocks.STRIPPED_MAGIC_LOG, output);
        woodenTrapdoor(SBDBlocks.SECRET_STRIPPED_UMBRAN_LOG_TRAPDOOR.get(), BOPBlocks.STRIPPED_UMBRAN_LOG, output);
        woodenTrapdoor(SBDBlocks.SECRET_STRIPPED_HELLBARK_LOG_TRAPDOOR.get(), BOPBlocks.STRIPPED_HELLBARK_LOG, output);
        
        trapdoor(SBDBlocks.SECRET_WHITE_SANDSTONE_TRAPDOOR.get(), BOPBlocks.WHITE_SANDSTONE, output);
        trapdoor(SBDBlocks.SECRET_CUT_WHITE_SANDSTONE_TRAPDOOR.get(), BOPBlocks.CUT_WHITE_SANDSTONE, output);
        trapdoor(SBDBlocks.SECRET_SMOOTH_WHITE_SANDSTONE_TRAPDOOR.get(), BOPBlocks.SMOOTH_WHITE_SANDSTONE, output);
        trapdoor(SBDBlocks.SECRET_ORANGE_SANDSTONE_TRAPDOOR.get(), BOPBlocks.ORANGE_SANDSTONE, output);
        trapdoor(SBDBlocks.SECRET_CUT_ORANGE_SANDSTONE_TRAPDOOR.get(), BOPBlocks.CUT_ORANGE_SANDSTONE, output);
        trapdoor(SBDBlocks.SECRET_SMOOTH_ORANGE_SANDSTONE_TRAPDOOR.get(), BOPBlocks.SMOOTH_ORANGE_SANDSTONE, output);
        trapdoor(SBDBlocks.SECRET_BLACK_SANDSTONE_TRAPDOOR.get(), BOPBlocks.BLACK_SANDSTONE, output);
        trapdoor(SBDBlocks.SECRET_CUT_BLACK_SANDSTONE_TRAPDOOR.get(), BOPBlocks.CUT_BLACK_SANDSTONE, output);
        trapdoor(SBDBlocks.SECRET_SMOOTH_BLACK_SANDSTONE_TRAPDOOR.get(), BOPBlocks.SMOOTH_BLACK_SANDSTONE, output);
    }

    public static void woodenDoor(Block doorItem, Block craftItem, RecipeOutput output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, doorItem).pattern("X X").pattern(" # ").pattern("X X").define('X', craftItem).define('#', ItemTags.WOODEN_DOORS).unlockedBy("has_" + SecretDoors.key(craftItem), has(craftItem)).save(output);
    }

    public static void door(Block doorItem, Block craftItem, RecipeOutput output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, doorItem)
                .pattern("X X").pattern(" # ").pattern("X X")
                .define('X', craftItem).define('#', ItemTags.DOORS)
                .unlockedBy("has_" + SecretDoors.key(craftItem), has(craftItem)).save(output);
    }

    public static void horizontalDoor(Block doorItem, Block craftItem, RecipeOutput output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, doorItem)
                .pattern("XXX").pattern(" # ").pattern("XXX")
                .define('X', craftItem).define('#', ItemTags.WOODEN_DOORS)
                .unlockedBy("has_" + SecretDoors.key(craftItem), has(craftItem)).save(output);
    }

    public static void verticalDoor(Block doorItem, Block craftItem, RecipeOutput output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, doorItem)
                .pattern("X X").pattern("X#X").pattern("X X")
                .define('X', craftItem).define('#', ItemTags.WOODEN_DOORS)
                .unlockedBy("has_" + SecretDoors.key(craftItem), has(craftItem)).save(output);
    }

    public static void verticalAndHorizontalDoor(Block verticalDoor, Block horizontalDoor, Block craftItem, RecipeOutput output) {
        verticalDoor(verticalDoor, craftItem, output);
        horizontalDoor(horizontalDoor, craftItem, output);
    }

    public static void woodenTrapdoor(Block doorItem, Block craftItem, RecipeOutput output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, doorItem)
                .pattern("X X").pattern(" # ").pattern("X X")
                .define('X', craftItem).define('#', ItemTags.WOODEN_TRAPDOORS)
                .unlockedBy("has_" + SecretDoors.key(craftItem), has(craftItem)).save(output);
    }

    public static void trapdoor(Block doorItem, Block craftItem, RecipeOutput output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, doorItem)
                .pattern("X X").pattern(" # ").pattern("X X")
                .define('X', craftItem).define('#', ItemTags.TRAPDOORS)
                .unlockedBy("has_" + SecretDoors.key(craftItem), has(craftItem)).save(output);
    }
}
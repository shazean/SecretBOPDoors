package com.shim.secretbopdoors.datagen;

import biomesoplenty.api.block.BOPBlocks;
import com.shim.secretbopdoors.SBDBlocks;
import com.shim.secretdoors.datagen.Recipes;
import com.shim.secretdoors.registry.SDBlocks;
import com.shim.secretdoors.registry.SDItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;

import java.util.function.Consumer;

public class SBDRecipes extends RecipeProvider {

    public SBDRecipes(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {

        woodenDoor(SBDBlocks.SECRET_FIR_PLANK_DOOR.get(), BOPBlocks.FIR_PLANKS, consumer);
        woodenDoor(SBDBlocks.SECRET_REDWOOD_PLANK_DOOR.get(), BOPBlocks.REDWOOD_PLANKS, consumer);
        woodenDoor(SBDBlocks.SECRET_CHERRY_PLANK_DOOR.get(), BOPBlocks.CHERRY_PLANKS, consumer);
        woodenDoor(SBDBlocks.SECRET_MAHOGANY_PLANK_DOOR.get(), BOPBlocks.MAHOGANY_PLANKS, consumer);
        woodenDoor(SBDBlocks.SECRET_JACARANDA_PLANK_DOOR.get(), BOPBlocks.JACARANDA_PLANKS, consumer);
        woodenDoor(SBDBlocks.SECRET_PALM_PLANK_DOOR.get(), BOPBlocks.PALM_PLANKS, consumer);
        woodenDoor(SBDBlocks.SECRET_WILLOW_PLANK_DOOR.get(), BOPBlocks.WILLOW_PLANKS, consumer);
        woodenDoor(SBDBlocks.SECRET_DEAD_PLANK_DOOR.get(), BOPBlocks.DEAD_PLANKS, consumer);
        woodenDoor(SBDBlocks.SECRET_MAGIC_PLANK_DOOR.get(), BOPBlocks.MAGIC_PLANKS, consumer);
        woodenDoor(SBDBlocks.SECRET_UMBRAN_PLANK_DOOR.get(), BOPBlocks.UMBRAN_PLANKS, consumer);
        woodenDoor(SBDBlocks.SECRET_HELLBARK_PLANK_DOOR.get(), BOPBlocks.HELLBARK_PLANKS, consumer);

        verticalAndHorizontalDoor(SBDBlocks.SECRET_FIR_LOG_DOOR.get(), SBDBlocks.SECRET_HORIZONTAL_FIR_LOG_DOOR.get(), BOPBlocks.FIR_LOG, consumer);
        verticalAndHorizontalDoor(SBDBlocks.SECRET_REDWOOD_LOG_DOOR.get(), SBDBlocks.SECRET_HORIZONTAL_REDWOOD_LOG_DOOR.get(), BOPBlocks.REDWOOD_LOG, consumer);
        verticalAndHorizontalDoor(SBDBlocks.SECRET_CHERRY_LOG_DOOR.get(), SBDBlocks.SECRET_HORIZONTAL_CHERRY_LOG_DOOR.get(), BOPBlocks.CHERRY_LOG, consumer);
        verticalAndHorizontalDoor(SBDBlocks.SECRET_MAHOGANY_LOG_DOOR.get(), SBDBlocks.SECRET_HORIZONTAL_MAHOGANY_LOG_DOOR.get(), BOPBlocks.MAHOGANY_LOG, consumer);
        verticalAndHorizontalDoor(SBDBlocks.SECRET_JACARANDA_LOG_DOOR.get(), SBDBlocks.SECRET_HORIZONTAL_JACARANDA_LOG_DOOR.get(), BOPBlocks.JACARANDA_LOG, consumer);
        verticalAndHorizontalDoor(SBDBlocks.SECRET_PALM_LOG_DOOR.get(), SBDBlocks.SECRET_HORIZONTAL_PALM_LOG_DOOR.get(), BOPBlocks.PALM_LOG, consumer);
        verticalAndHorizontalDoor(SBDBlocks.SECRET_WILLOW_LOG_DOOR.get(), SBDBlocks.SECRET_HORIZONTAL_WILLOW_LOG_DOOR.get(), BOPBlocks.WILLOW_LOG, consumer);
        verticalAndHorizontalDoor(SBDBlocks.SECRET_DEAD_LOG_DOOR.get(), SBDBlocks.SECRET_HORIZONTAL_DEAD_LOG_DOOR.get(), BOPBlocks.DEAD_LOG, consumer);
        verticalAndHorizontalDoor(SBDBlocks.SECRET_MAGIC_LOG_DOOR.get(), SBDBlocks.SECRET_HORIZONTAL_MAGIC_LOG_DOOR.get(), BOPBlocks.MAGIC_LOG, consumer);
        verticalAndHorizontalDoor(SBDBlocks.SECRET_UMBRAN_LOG_DOOR.get(), SBDBlocks.SECRET_HORIZONTAL_UMBRAN_LOG_DOOR.get(), BOPBlocks.UMBRAN_LOG, consumer);
        verticalAndHorizontalDoor(SBDBlocks.SECRET_HELLBARK_LOG_DOOR.get(), SBDBlocks.SECRET_HORIZONTAL_HELLBARK_LOG_DOOR.get(), BOPBlocks.HELLBARK_LOG, consumer);

        verticalAndHorizontalDoor(SBDBlocks.SECRET_STRIPPED_FIR_LOG_DOOR.get(), SBDBlocks.SECRET_STRIPPED_HORIZONTAL_FIR_LOG_DOOR.get(), BOPBlocks.STRIPPED_FIR_LOG, consumer);
        verticalAndHorizontalDoor(SBDBlocks.SECRET_STRIPPED_REDWOOD_LOG_DOOR.get(), SBDBlocks.SECRET_STRIPPED_HORIZONTAL_REDWOOD_LOG_DOOR.get(), BOPBlocks.STRIPPED_REDWOOD_LOG, consumer);
        verticalAndHorizontalDoor(SBDBlocks.SECRET_STRIPPED_CHERRY_LOG_DOOR.get(), SBDBlocks.SECRET_STRIPPED_HORIZONTAL_CHERRY_LOG_DOOR.get(), BOPBlocks.STRIPPED_CHERRY_LOG, consumer);
        verticalAndHorizontalDoor(SBDBlocks.SECRET_STRIPPED_MAHOGANY_LOG_DOOR.get(), SBDBlocks.SECRET_STRIPPED_HORIZONTAL_MAHOGANY_LOG_DOOR.get(), BOPBlocks.STRIPPED_MAHOGANY_LOG, consumer);
        verticalAndHorizontalDoor(SBDBlocks.SECRET_STRIPPED_JACARANDA_LOG_DOOR.get(), SBDBlocks.SECRET_STRIPPED_HORIZONTAL_JACARANDA_LOG_DOOR.get(), BOPBlocks.STRIPPED_JACARANDA_LOG, consumer);
        verticalAndHorizontalDoor(SBDBlocks.SECRET_STRIPPED_PALM_LOG_DOOR.get(), SBDBlocks.SECRET_STRIPPED_HORIZONTAL_PALM_LOG_DOOR.get(), BOPBlocks.STRIPPED_PALM_LOG, consumer);
        verticalAndHorizontalDoor(SBDBlocks.SECRET_STRIPPED_WILLOW_LOG_DOOR.get(), SBDBlocks.SECRET_STRIPPED_HORIZONTAL_WILLOW_LOG_DOOR.get(), BOPBlocks.STRIPPED_WILLOW_LOG, consumer);
        verticalAndHorizontalDoor(SBDBlocks.SECRET_STRIPPED_DEAD_LOG_DOOR.get(), SBDBlocks.SECRET_STRIPPED_HORIZONTAL_DEAD_LOG_DOOR.get(), BOPBlocks.STRIPPED_DEAD_LOG, consumer);
        verticalAndHorizontalDoor(SBDBlocks.SECRET_STRIPPED_MAGIC_LOG_DOOR.get(), SBDBlocks.SECRET_STRIPPED_HORIZONTAL_MAGIC_LOG_DOOR.get(), BOPBlocks.STRIPPED_MAGIC_LOG, consumer);
        verticalAndHorizontalDoor(SBDBlocks.SECRET_STRIPPED_UMBRAN_LOG_DOOR.get(), SBDBlocks.SECRET_STRIPPED_HORIZONTAL_UMBRAN_LOG_DOOR.get(), BOPBlocks.STRIPPED_UMBRAN_LOG, consumer);
        verticalAndHorizontalDoor(SBDBlocks.SECRET_STRIPPED_HELLBARK_LOG_DOOR.get(), SBDBlocks.SECRET_STRIPPED_HORIZONTAL_HELLBARK_LOG_DOOR.get(), BOPBlocks.STRIPPED_HELLBARK_LOG, consumer);
        

        door(SBDBlocks.SECRET_WHITE_SANDSTONE_DOOR.get(), BOPBlocks.WHITE_SANDSTONE, consumer);
        door(SBDBlocks.SECRET_CUT_WHITE_SANDSTONE_DOOR.get(), BOPBlocks.CUT_WHITE_SANDSTONE, consumer);
        door(SBDBlocks.SECRET_SMOOTH_WHITE_SANDSTONE_DOOR.get(), BOPBlocks.SMOOTH_WHITE_SANDSTONE, consumer);
        door(SBDBlocks.SECRET_ORANGE_SANDSTONE_DOOR.get(), BOPBlocks.ORANGE_SANDSTONE, consumer);
        door(SBDBlocks.SECRET_CUT_ORANGE_SANDSTONE_DOOR.get(), BOPBlocks.CUT_ORANGE_SANDSTONE, consumer);
        door(SBDBlocks.SECRET_SMOOTH_ORANGE_SANDSTONE_DOOR.get(), BOPBlocks.SMOOTH_ORANGE_SANDSTONE, consumer);
        door(SBDBlocks.SECRET_BLACK_SANDSTONE_DOOR.get(), BOPBlocks.BLACK_SANDSTONE, consumer);
        door(SBDBlocks.SECRET_CUT_BLACK_SANDSTONE_DOOR.get(), BOPBlocks.CUT_BLACK_SANDSTONE, consumer);
        door(SBDBlocks.SECRET_SMOOTH_BLACK_SANDSTONE_DOOR.get(), BOPBlocks.SMOOTH_BLACK_SANDSTONE, consumer);

        door(SBDBlocks.SECRET_MUD_BRICKS_DOOR.get(), BOPBlocks.MUD_BRICKS, consumer);

        woodenTrapdoor(SBDBlocks.SECRET_FIR_PLANK_TRAPDOOR.get(), BOPBlocks.FIR_PLANKS, consumer);
        woodenTrapdoor(SBDBlocks.SECRET_REDWOOD_PLANK_TRAPDOOR.get(), BOPBlocks.REDWOOD_PLANKS, consumer);
        woodenTrapdoor(SBDBlocks.SECRET_CHERRY_PLANK_TRAPDOOR.get(), BOPBlocks.CHERRY_PLANKS, consumer);
        woodenTrapdoor(SBDBlocks.SECRET_MAHOGANY_PLANK_TRAPDOOR.get(), BOPBlocks.MAHOGANY_PLANKS, consumer);
        woodenTrapdoor(SBDBlocks.SECRET_JACARANDA_PLANK_TRAPDOOR.get(), BOPBlocks.JACARANDA_PLANKS, consumer);
        woodenTrapdoor(SBDBlocks.SECRET_PALM_PLANK_TRAPDOOR.get(), BOPBlocks.PALM_PLANKS, consumer);
        woodenTrapdoor(SBDBlocks.SECRET_WILLOW_PLANK_TRAPDOOR.get(), BOPBlocks.WILLOW_PLANKS, consumer);
        woodenTrapdoor(SBDBlocks.SECRET_DEAD_PLANK_TRAPDOOR.get(), BOPBlocks.DEAD_PLANKS, consumer);
        woodenTrapdoor(SBDBlocks.SECRET_MAGIC_PLANK_TRAPDOOR.get(), BOPBlocks.MAGIC_PLANKS, consumer);
        woodenTrapdoor(SBDBlocks.SECRET_UMBRAN_PLANK_TRAPDOOR.get(), BOPBlocks.UMBRAN_PLANKS, consumer);
        woodenTrapdoor(SBDBlocks.SECRET_HELLBARK_PLANK_TRAPDOOR.get(), BOPBlocks.HELLBARK_PLANKS, consumer);

        woodenTrapdoor(SBDBlocks.SECRET_FIR_LOG_TRAPDOOR.get(), BOPBlocks.FIR_LOG, consumer);
        woodenTrapdoor(SBDBlocks.SECRET_REDWOOD_LOG_TRAPDOOR.get(), BOPBlocks.REDWOOD_LOG, consumer);
        woodenTrapdoor(SBDBlocks.SECRET_CHERRY_LOG_TRAPDOOR.get(), BOPBlocks.CHERRY_LOG, consumer);
        woodenTrapdoor(SBDBlocks.SECRET_MAHOGANY_LOG_TRAPDOOR.get(), BOPBlocks.MAHOGANY_LOG, consumer);
        woodenTrapdoor(SBDBlocks.SECRET_JACARANDA_LOG_TRAPDOOR.get(), BOPBlocks.JACARANDA_LOG, consumer);
        woodenTrapdoor(SBDBlocks.SECRET_PALM_LOG_TRAPDOOR.get(), BOPBlocks.PALM_LOG, consumer);
        woodenTrapdoor(SBDBlocks.SECRET_WILLOW_LOG_TRAPDOOR.get(), BOPBlocks.WILLOW_LOG, consumer);
        woodenTrapdoor(SBDBlocks.SECRET_DEAD_LOG_TRAPDOOR.get(), BOPBlocks.DEAD_LOG, consumer);
        woodenTrapdoor(SBDBlocks.SECRET_MAGIC_LOG_TRAPDOOR.get(), BOPBlocks.MAGIC_LOG, consumer);
        woodenTrapdoor(SBDBlocks.SECRET_UMBRAN_LOG_TRAPDOOR.get(), BOPBlocks.UMBRAN_LOG, consumer);
        woodenTrapdoor(SBDBlocks.SECRET_HELLBARK_LOG_TRAPDOOR.get(), BOPBlocks.HELLBARK_LOG, consumer);

        woodenTrapdoor(SBDBlocks.SECRET_STRIPPED_FIR_LOG_TRAPDOOR.get(), BOPBlocks.STRIPPED_FIR_LOG, consumer);
        woodenTrapdoor(SBDBlocks.SECRET_STRIPPED_REDWOOD_LOG_TRAPDOOR.get(), BOPBlocks.STRIPPED_REDWOOD_LOG, consumer);
        woodenTrapdoor(SBDBlocks.SECRET_STRIPPED_CHERRY_LOG_TRAPDOOR.get(), BOPBlocks.STRIPPED_CHERRY_LOG, consumer);
        woodenTrapdoor(SBDBlocks.SECRET_STRIPPED_MAHOGANY_LOG_TRAPDOOR.get(), BOPBlocks.STRIPPED_MAHOGANY_LOG, consumer);
        woodenTrapdoor(SBDBlocks.SECRET_STRIPPED_JACARANDA_LOG_TRAPDOOR.get(), BOPBlocks.STRIPPED_JACARANDA_LOG, consumer);
        woodenTrapdoor(SBDBlocks.SECRET_STRIPPED_PALM_LOG_TRAPDOOR.get(), BOPBlocks.STRIPPED_PALM_LOG, consumer);
        woodenTrapdoor(SBDBlocks.SECRET_STRIPPED_WILLOW_LOG_TRAPDOOR.get(), BOPBlocks.STRIPPED_WILLOW_LOG, consumer);
        woodenTrapdoor(SBDBlocks.SECRET_STRIPPED_DEAD_LOG_TRAPDOOR.get(), BOPBlocks.STRIPPED_DEAD_LOG, consumer);
        woodenTrapdoor(SBDBlocks.SECRET_STRIPPED_MAGIC_LOG_TRAPDOOR.get(), BOPBlocks.STRIPPED_MAGIC_LOG, consumer);
        woodenTrapdoor(SBDBlocks.SECRET_STRIPPED_UMBRAN_LOG_TRAPDOOR.get(), BOPBlocks.STRIPPED_UMBRAN_LOG, consumer);
        woodenTrapdoor(SBDBlocks.SECRET_STRIPPED_HELLBARK_LOG_TRAPDOOR.get(), BOPBlocks.STRIPPED_HELLBARK_LOG, consumer);
        
        trapdoor(SBDBlocks.SECRET_WHITE_SANDSTONE_TRAPDOOR.get(), BOPBlocks.WHITE_SANDSTONE, consumer);
        trapdoor(SBDBlocks.SECRET_CUT_WHITE_SANDSTONE_TRAPDOOR.get(), BOPBlocks.CUT_WHITE_SANDSTONE, consumer);
        trapdoor(SBDBlocks.SECRET_SMOOTH_WHITE_SANDSTONE_TRAPDOOR.get(), BOPBlocks.SMOOTH_WHITE_SANDSTONE, consumer);
        trapdoor(SBDBlocks.SECRET_ORANGE_SANDSTONE_TRAPDOOR.get(), BOPBlocks.ORANGE_SANDSTONE, consumer);
        trapdoor(SBDBlocks.SECRET_CUT_ORANGE_SANDSTONE_TRAPDOOR.get(), BOPBlocks.CUT_ORANGE_SANDSTONE, consumer);
        trapdoor(SBDBlocks.SECRET_SMOOTH_ORANGE_SANDSTONE_TRAPDOOR.get(), BOPBlocks.SMOOTH_ORANGE_SANDSTONE, consumer);
        trapdoor(SBDBlocks.SECRET_BLACK_SANDSTONE_TRAPDOOR.get(), BOPBlocks.BLACK_SANDSTONE, consumer);
        trapdoor(SBDBlocks.SECRET_CUT_BLACK_SANDSTONE_TRAPDOOR.get(), BOPBlocks.CUT_BLACK_SANDSTONE, consumer);
        trapdoor(SBDBlocks.SECRET_SMOOTH_BLACK_SANDSTONE_TRAPDOOR.get(), BOPBlocks.SMOOTH_BLACK_SANDSTONE, consumer);

        trapdoor(SBDBlocks.SECRET_MUD_BRICKS_TRAPDOOR.get(), BOPBlocks.MUD_BRICKS, consumer);

    }

    public static void woodenDoor(Block doorItem, Block craftItem, Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(doorItem).pattern("X X").pattern(" # ").pattern("X X").define('X', craftItem).define('#', ItemTags.WOODEN_DOORS).unlockedBy("has_" + craftItem.getRegistryName().getPath(), has(craftItem)).save(consumer);
    }

    public static void door(Block doorItem, Block craftItem, Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(doorItem)
                .pattern("X X").pattern(" # ").pattern("X X")
                .define('X', craftItem).define('#', ItemTags.DOORS)
                .unlockedBy("has_" + craftItem.getRegistryName().getPath(), has(craftItem)).save(consumer);
    }

    public static void horizontalDoor(Block doorItem, Block craftItem, Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(doorItem)
                .pattern("XXX").pattern(" # ").pattern("XXX")
                .define('X', craftItem).define('#', ItemTags.WOODEN_DOORS)
                .unlockedBy("has_" + craftItem.getRegistryName().getPath(), has(craftItem)).save(consumer);
    }

    public static void verticalDoor(Block doorItem, Block craftItem, Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(doorItem)
                .pattern("X X").pattern("X#X").pattern("X X")
                .define('X', craftItem).define('#', ItemTags.WOODEN_DOORS)
                .unlockedBy("has_" + craftItem.getRegistryName().getPath(), has(craftItem)).save(consumer);
    }

    public static void verticalAndHorizontalDoor(Block verticalDoor, Block horizontalDoor, Block craftItem, Consumer<FinishedRecipe> consumer) {
        verticalDoor(verticalDoor, craftItem, consumer);
        horizontalDoor(horizontalDoor, craftItem, consumer);
    }

    public static void woodenTrapdoor(Block doorItem, Block craftItem, Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(doorItem)
                .pattern("X X").pattern(" # ").pattern("X X")
                .define('X', craftItem).define('#', ItemTags.WOODEN_TRAPDOORS)
                .unlockedBy("has_" + craftItem.getRegistryName().getPath(), has(craftItem)).save(consumer);
    }

    public static void trapdoor(Block doorItem, Block craftItem, Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(doorItem)
                .pattern("X X").pattern(" # ").pattern("X X")
                .define('X', craftItem).define('#', ItemTags.TRAPDOORS)
                .unlockedBy("has_" + craftItem.getRegistryName().getPath(), has(craftItem)).save(consumer);
    }
}

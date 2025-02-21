package com.shim.secretbopdoors;

import biomesoplenty.api.block.BOPBlockSetTypes;
import biomesoplenty.api.block.BOPBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.function.Function;

public class SBDBlocks {

    public static final net.neoforged.neoforge.registries.DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(SecretBOPDoors.MODID);
    public static final net.neoforged.neoforge.registries.DeferredRegister.Items ITEMS = DeferredRegister.createItems(SecretBOPDoors.MODID);

    public static final Map<DeferredBlock<? extends Block>, String> BLOCK_LANG_EN_US = new HashMap<>();
    public static final LinkedList<DeferredBlock<? extends Block>> DOOR_LOOT_TABLE = new LinkedList<>();
    public static final LinkedList<DeferredBlock<? extends Block>> TRAPDOOR_LOOT_TABLE = new LinkedList<>();
    public static final LinkedList<DeferredBlock<? extends Block>> BUILDING_BLOCKS_CREATIVE_TAB = new LinkedList<>();

    enum BOPWoodType {
        FIR("fir", "Fir"),
        REDWOOD("redwood", "Redwood"),
        MAHOGANY("mahogany", "Mahogany"),
        JACARANDA("jacaranda", "Jacaranda"),
        PALM("palm", "Palm"),
        WILLOW("willow", "Willow"),
        DEAD("dead", "Dead"),
        MAGIC("magic", "Magic"),
        UMBRAN("umbran", "Umbran"),
        HELLBARK("hellbark", "Hellbark"),
        EMPYREAL("empyreal", "Empyreal"),
        MAPLE("maple", "Maple"),
        PINE("pine", "Pine");

        final String name;
        final String localization;

        BOPWoodType(String name, String localization) {
            this.name = name;
            this.localization = localization;
        }
    }

    public static DeferredBlock<DoorBlock> SECRET_FIR_PLANK_DOOR = registerPlankDoorBlock(BOPWoodType.FIR, id -> doorBlock(BOPBlocks.FIR_PLANKS, BOPBlockSetTypes.FIR, id));
    public static DeferredBlock<DoorBlock> SECRET_REDWOOD_PLANK_DOOR = registerPlankDoorBlock(BOPWoodType.REDWOOD, id -> doorBlock(BOPBlocks.REDWOOD_PLANKS, BOPBlockSetTypes.REDWOOD, id));
    public static DeferredBlock<DoorBlock> SECRET_MAHOGANY_PLANK_DOOR = registerPlankDoorBlock(BOPWoodType.MAHOGANY, id -> doorBlock(BOPBlocks.MAHOGANY_PLANKS, BOPBlockSetTypes.MAHOGANY, id));
    public static DeferredBlock<DoorBlock> SECRET_JACARANDA_PLANK_DOOR = registerPlankDoorBlock(BOPWoodType.JACARANDA, id -> doorBlock(BOPBlocks.JACARANDA_PLANKS, BOPBlockSetTypes.JACARANDA, id));
    public static DeferredBlock<DoorBlock> SECRET_PALM_PLANK_DOOR = registerPlankDoorBlock(BOPWoodType.PALM, id -> doorBlock(BOPBlocks.PALM_PLANKS, BOPBlockSetTypes.PALM, id));
    public static DeferredBlock<DoorBlock> SECRET_WILLOW_PLANK_DOOR = registerPlankDoorBlock(BOPWoodType.WILLOW, id -> doorBlock(BOPBlocks.WILLOW_PLANKS, BOPBlockSetTypes.WILLOW, id));
    public static DeferredBlock<DoorBlock> SECRET_DEAD_PLANK_DOOR = registerPlankDoorBlock(BOPWoodType.DEAD, id -> doorBlock(BOPBlocks.DEAD_PLANKS, BOPBlockSetTypes.DEAD, id));
    public static DeferredBlock<DoorBlock> SECRET_MAGIC_PLANK_DOOR = registerPlankDoorBlock(BOPWoodType.MAGIC, id -> doorBlock(BOPBlocks.MAGIC_PLANKS, BOPBlockSetTypes.MAGIC, id));
    public static DeferredBlock<DoorBlock> SECRET_UMBRAN_PLANK_DOOR = registerPlankDoorBlock(BOPWoodType.UMBRAN, id -> doorBlock(BOPBlocks.UMBRAN_PLANKS, BOPBlockSetTypes.UMBRAN, id));
    public static DeferredBlock<DoorBlock> SECRET_HELLBARK_PLANK_DOOR = registerPlankDoorBlock(BOPWoodType.HELLBARK, id -> doorBlock(BOPBlocks.HELLBARK_PLANKS, BOPBlockSetTypes.HELLBARK, id));
    public static DeferredBlock<DoorBlock> SECRET_EMPYREAL_PLANK_DOOR = registerPlankDoorBlock(BOPWoodType.EMPYREAL, id -> doorBlock(BOPBlocks.EMPYREAL_PLANKS, BOPBlockSetTypes.EMPYREAL, id));
    public static DeferredBlock<DoorBlock> SECRET_MAPLE_PLANK_DOOR = registerPlankDoorBlock(BOPWoodType.MAPLE, id -> doorBlock(BOPBlocks.MAPLE_PLANKS, BOPBlockSetTypes.MAPLE, id));
    public static DeferredBlock<DoorBlock> SECRET_PINE_PLANK_DOOR = registerPlankDoorBlock(BOPWoodType.PINE, id -> doorBlock(BOPBlocks.PINE_PLANKS, BOPBlockSetTypes.PINE, id));

    public static DeferredBlock<DoorBlock> SECRET_FIR_LOG_DOOR = registerLogDoorBlock(BOPWoodType.FIR, id -> doorBlock(BOPBlocks.FIR_LOG, BOPBlockSetTypes.FIR, id));
    public static DeferredBlock<DoorBlock> SECRET_REDWOOD_LOG_DOOR = registerLogDoorBlock(BOPWoodType.REDWOOD, id -> doorBlock(BOPBlocks.REDWOOD_LOG, BOPBlockSetTypes.REDWOOD, id));
    public static DeferredBlock<DoorBlock> SECRET_MAHOGANY_LOG_DOOR = registerLogDoorBlock(BOPWoodType.MAHOGANY, id -> doorBlock(BOPBlocks.MAHOGANY_LOG, BOPBlockSetTypes.MAHOGANY, id));
    public static DeferredBlock<DoorBlock> SECRET_JACARANDA_LOG_DOOR = registerLogDoorBlock(BOPWoodType.JACARANDA, id -> doorBlock(BOPBlocks.JACARANDA_LOG, BOPBlockSetTypes.JACARANDA, id));
    public static DeferredBlock<DoorBlock> SECRET_PALM_LOG_DOOR = registerLogDoorBlock(BOPWoodType.PALM, id -> doorBlock(BOPBlocks.PALM_LOG, BOPBlockSetTypes.PALM, id));
    public static DeferredBlock<DoorBlock> SECRET_WILLOW_LOG_DOOR = registerLogDoorBlock(BOPWoodType.WILLOW, id -> doorBlock(BOPBlocks.WILLOW_LOG, BOPBlockSetTypes.WILLOW, id));
    public static DeferredBlock<DoorBlock> SECRET_DEAD_LOG_DOOR = registerLogDoorBlock(BOPWoodType.DEAD, id -> doorBlock(BOPBlocks.DEAD_LOG, BOPBlockSetTypes.DEAD, id));
    public static DeferredBlock<DoorBlock> SECRET_MAGIC_LOG_DOOR = registerLogDoorBlock(BOPWoodType.MAGIC, id -> doorBlock(BOPBlocks.MAGIC_LOG, BOPBlockSetTypes.MAGIC, id));
    public static DeferredBlock<DoorBlock> SECRET_UMBRAN_LOG_DOOR = registerLogDoorBlock(BOPWoodType.UMBRAN, id -> doorBlock(BOPBlocks.UMBRAN_LOG, BOPBlockSetTypes.UMBRAN, id));
    public static DeferredBlock<DoorBlock> SECRET_HELLBARK_LOG_DOOR = registerLogDoorBlock(BOPWoodType.HELLBARK, id -> doorBlock(BOPBlocks.HELLBARK_LOG, BOPBlockSetTypes.HELLBARK, id));
    public static DeferredBlock<DoorBlock> SECRET_EMPYREAL_LOG_DOOR = registerLogDoorBlock(BOPWoodType.EMPYREAL, id -> doorBlock(BOPBlocks.EMPYREAL_LOG, BOPBlockSetTypes.EMPYREAL, id));
    public static DeferredBlock<DoorBlock> SECRET_MAPLE_LOG_DOOR = registerLogDoorBlock(BOPWoodType.MAPLE, id -> doorBlock(BOPBlocks.MAPLE_LOG, BOPBlockSetTypes.MAPLE, id));
    public static DeferredBlock<DoorBlock> SECRET_PINE_LOG_DOOR = registerLogDoorBlock(BOPWoodType.PINE, id -> doorBlock(BOPBlocks.PINE_LOG, BOPBlockSetTypes.PINE, id));

    public static DeferredBlock<DoorBlock> SECRET_STRIPPED_FIR_LOG_DOOR = registerStrippedLogDoorBlock(BOPWoodType.FIR, id -> doorBlock(BOPBlocks.STRIPPED_FIR_LOG, BOPBlockSetTypes.FIR, id));
    public static DeferredBlock<DoorBlock> SECRET_STRIPPED_REDWOOD_LOG_DOOR = registerStrippedLogDoorBlock(BOPWoodType.REDWOOD, id -> doorBlock(BOPBlocks.STRIPPED_REDWOOD_LOG, BOPBlockSetTypes.REDWOOD, id));
    public static DeferredBlock<DoorBlock> SECRET_STRIPPED_MAHOGANY_LOG_DOOR = registerStrippedLogDoorBlock(BOPWoodType.MAHOGANY, id -> doorBlock(BOPBlocks.STRIPPED_MAHOGANY_LOG, BOPBlockSetTypes.MAHOGANY, id));
    public static DeferredBlock<DoorBlock> SECRET_STRIPPED_JACARANDA_LOG_DOOR = registerStrippedLogDoorBlock(BOPWoodType.JACARANDA, id -> doorBlock(BOPBlocks.STRIPPED_JACARANDA_LOG, BOPBlockSetTypes.JACARANDA, id));
    public static DeferredBlock<DoorBlock> SECRET_STRIPPED_PALM_LOG_DOOR = registerStrippedLogDoorBlock(BOPWoodType.PALM, id -> doorBlock(BOPBlocks.STRIPPED_PALM_LOG, BOPBlockSetTypes.PALM, id));
    public static DeferredBlock<DoorBlock> SECRET_STRIPPED_WILLOW_LOG_DOOR = registerStrippedLogDoorBlock(BOPWoodType.WILLOW, id -> doorBlock(BOPBlocks.STRIPPED_WILLOW_LOG, BOPBlockSetTypes.WILLOW, id));
    public static DeferredBlock<DoorBlock> SECRET_STRIPPED_DEAD_LOG_DOOR = registerStrippedLogDoorBlock(BOPWoodType.DEAD, id -> doorBlock(BOPBlocks.STRIPPED_DEAD_LOG, BOPBlockSetTypes.DEAD, id));
    public static DeferredBlock<DoorBlock> SECRET_STRIPPED_MAGIC_LOG_DOOR = registerStrippedLogDoorBlock(BOPWoodType.MAGIC, id -> doorBlock(BOPBlocks.STRIPPED_MAGIC_LOG, BOPBlockSetTypes.MAGIC, id));
    public static DeferredBlock<DoorBlock> SECRET_STRIPPED_UMBRAN_LOG_DOOR = registerStrippedLogDoorBlock(BOPWoodType.UMBRAN, id -> doorBlock(BOPBlocks.STRIPPED_UMBRAN_LOG, BOPBlockSetTypes.UMBRAN, id));
    public static DeferredBlock<DoorBlock> SECRET_STRIPPED_HELLBARK_LOG_DOOR = registerStrippedLogDoorBlock(BOPWoodType.HELLBARK, id -> doorBlock(BOPBlocks.STRIPPED_HELLBARK_LOG, BOPBlockSetTypes.HELLBARK, id));
    public static DeferredBlock<DoorBlock> SECRET_STRIPPED_EMPYREAL_LOG_DOOR = registerStrippedLogDoorBlock(BOPWoodType.EMPYREAL, id -> doorBlock(BOPBlocks.STRIPPED_EMPYREAL_LOG, BOPBlockSetTypes.EMPYREAL, id));
    public static DeferredBlock<DoorBlock> SECRET_STRIPPED_MAPLE_LOG_DOOR = registerStrippedLogDoorBlock(BOPWoodType.MAPLE, id -> doorBlock(BOPBlocks.STRIPPED_MAPLE_LOG, BOPBlockSetTypes.MAPLE, id));
    public static DeferredBlock<DoorBlock> SECRET_STRIPPED_PINE_LOG_DOOR = registerStrippedLogDoorBlock(BOPWoodType.PINE, id -> doorBlock(BOPBlocks.STRIPPED_PINE_LOG, BOPBlockSetTypes.PINE, id));

    public static DeferredBlock<DoorBlock> SECRET_STRIPPED_HORIZONTAL_FIR_LOG_DOOR = registerStrippedHorizontalLogDoorBlock(BOPWoodType.FIR, id -> doorBlock(BOPBlocks.STRIPPED_FIR_LOG, BOPBlockSetTypes.FIR, id));
    public static DeferredBlock<DoorBlock> SECRET_STRIPPED_HORIZONTAL_REDWOOD_LOG_DOOR = registerStrippedHorizontalLogDoorBlock(BOPWoodType.REDWOOD, id -> doorBlock(BOPBlocks.STRIPPED_REDWOOD_LOG, BOPBlockSetTypes.REDWOOD, id));
    public static DeferredBlock<DoorBlock> SECRET_STRIPPED_HORIZONTAL_MAHOGANY_LOG_DOOR = registerStrippedHorizontalLogDoorBlock(BOPWoodType.MAHOGANY, id -> doorBlock(BOPBlocks.STRIPPED_MAHOGANY_LOG, BOPBlockSetTypes.MAHOGANY, id));
    public static DeferredBlock<DoorBlock> SECRET_STRIPPED_HORIZONTAL_JACARANDA_LOG_DOOR = registerStrippedHorizontalLogDoorBlock(BOPWoodType.JACARANDA, id -> doorBlock(BOPBlocks.STRIPPED_JACARANDA_LOG, BOPBlockSetTypes.JACARANDA, id));
    public static DeferredBlock<DoorBlock> SECRET_STRIPPED_HORIZONTAL_PALM_LOG_DOOR = registerStrippedHorizontalLogDoorBlock(BOPWoodType.PALM, id -> doorBlock(BOPBlocks.STRIPPED_PALM_LOG, BOPBlockSetTypes.PALM, id));
    public static DeferredBlock<DoorBlock> SECRET_STRIPPED_HORIZONTAL_WILLOW_LOG_DOOR = registerStrippedHorizontalLogDoorBlock(BOPWoodType.WILLOW, id -> doorBlock(BOPBlocks.STRIPPED_WILLOW_LOG, BOPBlockSetTypes.WILLOW, id));
    public static DeferredBlock<DoorBlock> SECRET_STRIPPED_HORIZONTAL_DEAD_LOG_DOOR = registerStrippedHorizontalLogDoorBlock(BOPWoodType.DEAD, id -> doorBlock(BOPBlocks.STRIPPED_DEAD_LOG, BOPBlockSetTypes.DEAD, id));
    public static DeferredBlock<DoorBlock> SECRET_STRIPPED_HORIZONTAL_MAGIC_LOG_DOOR = registerStrippedHorizontalLogDoorBlock(BOPWoodType.MAGIC, id -> doorBlock(BOPBlocks.STRIPPED_MAGIC_LOG, BOPBlockSetTypes.MAGIC, id));
    public static DeferredBlock<DoorBlock> SECRET_STRIPPED_HORIZONTAL_UMBRAN_LOG_DOOR = registerStrippedHorizontalLogDoorBlock(BOPWoodType.UMBRAN, id -> doorBlock(BOPBlocks.STRIPPED_UMBRAN_LOG, BOPBlockSetTypes.UMBRAN, id));
    public static DeferredBlock<DoorBlock> SECRET_STRIPPED_HORIZONTAL_HELLBARK_LOG_DOOR = registerStrippedHorizontalLogDoorBlock(BOPWoodType.HELLBARK, id -> doorBlock(BOPBlocks.STRIPPED_HELLBARK_LOG, BOPBlockSetTypes.HELLBARK, id));
    public static DeferredBlock<DoorBlock> SECRET_STRIPPED_HORIZONTAL_EMPYREAL_LOG_DOOR = registerStrippedHorizontalLogDoorBlock(BOPWoodType.EMPYREAL, id -> doorBlock(BOPBlocks.STRIPPED_EMPYREAL_LOG, BOPBlockSetTypes.EMPYREAL, id));
    public static DeferredBlock<DoorBlock> SECRET_STRIPPED_HORIZONTAL_MAPLE_LOG_DOOR = registerStrippedHorizontalLogDoorBlock(BOPWoodType.MAPLE, id -> doorBlock(BOPBlocks.STRIPPED_MAPLE_LOG, BOPBlockSetTypes.MAPLE, id));
    public static DeferredBlock<DoorBlock> SECRET_STRIPPED_HORIZONTAL_PINE_LOG_DOOR = registerStrippedHorizontalLogDoorBlock(BOPWoodType.PINE, id -> doorBlock(BOPBlocks.STRIPPED_PINE_LOG, BOPBlockSetTypes.PINE, id));

    public static DeferredBlock<DoorBlock> SECRET_HORIZONTAL_FIR_LOG_DOOR = registerHorizontalLogDoorBlock(BOPWoodType.FIR, id -> doorBlock(BOPBlocks.FIR_LOG, BOPBlockSetTypes.FIR, id));
    public static DeferredBlock<DoorBlock> SECRET_HORIZONTAL_REDWOOD_LOG_DOOR = registerHorizontalLogDoorBlock(BOPWoodType.REDWOOD, id -> doorBlock(BOPBlocks.REDWOOD_LOG, BOPBlockSetTypes.REDWOOD, id));
    public static DeferredBlock<DoorBlock> SECRET_HORIZONTAL_MAHOGANY_LOG_DOOR = registerHorizontalLogDoorBlock(BOPWoodType.MAHOGANY, id -> doorBlock(BOPBlocks.MAHOGANY_LOG, BOPBlockSetTypes.MAHOGANY, id));
    public static DeferredBlock<DoorBlock> SECRET_HORIZONTAL_JACARANDA_LOG_DOOR = registerHorizontalLogDoorBlock(BOPWoodType.JACARANDA, id -> doorBlock(BOPBlocks.JACARANDA_LOG, BOPBlockSetTypes.JACARANDA, id));
    public static DeferredBlock<DoorBlock> SECRET_HORIZONTAL_PALM_LOG_DOOR = registerHorizontalLogDoorBlock(BOPWoodType.PALM, id -> doorBlock(BOPBlocks.PALM_LOG, BOPBlockSetTypes.PALM, id));
    public static DeferredBlock<DoorBlock> SECRET_HORIZONTAL_WILLOW_LOG_DOOR = registerHorizontalLogDoorBlock(BOPWoodType.WILLOW, id -> doorBlock(BOPBlocks.WILLOW_LOG, BOPBlockSetTypes.WILLOW, id));
    public static DeferredBlock<DoorBlock> SECRET_HORIZONTAL_DEAD_LOG_DOOR = registerHorizontalLogDoorBlock(BOPWoodType.DEAD, id -> doorBlock(BOPBlocks.DEAD_LOG, BOPBlockSetTypes.DEAD, id));
    public static DeferredBlock<DoorBlock> SECRET_HORIZONTAL_MAGIC_LOG_DOOR = registerHorizontalLogDoorBlock(BOPWoodType.MAGIC, id -> doorBlock(BOPBlocks.MAGIC_LOG, BOPBlockSetTypes.MAGIC, id));
    public static DeferredBlock<DoorBlock> SECRET_HORIZONTAL_UMBRAN_LOG_DOOR = registerHorizontalLogDoorBlock(BOPWoodType.UMBRAN, id -> doorBlock(BOPBlocks.UMBRAN_LOG, BOPBlockSetTypes.UMBRAN, id));
    public static DeferredBlock<DoorBlock> SECRET_HORIZONTAL_HELLBARK_LOG_DOOR = registerHorizontalLogDoorBlock(BOPWoodType.HELLBARK, id -> doorBlock(BOPBlocks.HELLBARK_LOG, BOPBlockSetTypes.HELLBARK, id));
    public static DeferredBlock<DoorBlock> SECRET_HORIZONTAL_EMPYREAL_LOG_DOOR = registerHorizontalLogDoorBlock(BOPWoodType.EMPYREAL, id -> doorBlock(BOPBlocks.EMPYREAL_LOG, BOPBlockSetTypes.EMPYREAL, id));
    public static DeferredBlock<DoorBlock> SECRET_HORIZONTAL_MAPLE_LOG_DOOR = registerHorizontalLogDoorBlock(BOPWoodType.MAPLE, id -> doorBlock(BOPBlocks.MAPLE_LOG, BOPBlockSetTypes.MAPLE, id));
    public static DeferredBlock<DoorBlock> SECRET_HORIZONTAL_PINE_LOG_DOOR = registerHorizontalLogDoorBlock(BOPWoodType.PINE, id -> doorBlock(BOPBlocks.PINE_LOG, BOPBlockSetTypes.PINE, id));

    public static DeferredBlock<DoorBlock> SECRET_WHITE_SANDSTONE_DOOR = registerSandstoneDoorBlock("white", "White", id -> doorBlock(BOPBlocks.WHITE_SANDSTONE, BlockSetType.STONE, id));
    public static DeferredBlock<DoorBlock> SECRET_CUT_WHITE_SANDSTONE_DOOR = registerSandstoneDoorBlock("cut_white", "Cut White", id -> doorBlock(BOPBlocks.CUT_WHITE_SANDSTONE, BlockSetType.STONE, id));
    public static DeferredBlock<DoorBlock> SECRET_SMOOTH_WHITE_SANDSTONE_DOOR = registerSandstoneDoorBlock("smooth_white", "Smooth White", id -> doorBlock(BOPBlocks.SMOOTH_WHITE_SANDSTONE, BlockSetType.STONE, id));
    public static DeferredBlock<DoorBlock> SECRET_ORANGE_SANDSTONE_DOOR = registerSandstoneDoorBlock("orange", "Orange", id -> doorBlock(BOPBlocks.ORANGE_SANDSTONE, BlockSetType.STONE, id));
    public static DeferredBlock<DoorBlock> SECRET_CUT_ORANGE_SANDSTONE_DOOR = registerSandstoneDoorBlock("cut_orange", "Cut Orange", id -> doorBlock(BOPBlocks.CUT_ORANGE_SANDSTONE, BlockSetType.STONE, id));
    public static DeferredBlock<DoorBlock> SECRET_SMOOTH_ORANGE_SANDSTONE_DOOR = registerSandstoneDoorBlock("smooth_orange", "Smooth Orange", id -> doorBlock(BOPBlocks.SMOOTH_ORANGE_SANDSTONE, BlockSetType.STONE, id));
    public static DeferredBlock<DoorBlock> SECRET_BLACK_SANDSTONE_DOOR = registerSandstoneDoorBlock("black", "Black", id -> doorBlock(BOPBlocks.BLACK_SANDSTONE, BlockSetType.STONE, id));
    public static DeferredBlock<DoorBlock> SECRET_CUT_BLACK_SANDSTONE_DOOR = registerSandstoneDoorBlock("cut_black", "Cut Black", id -> doorBlock(BOPBlocks.CUT_BLACK_SANDSTONE, BlockSetType.STONE, id));
    public static DeferredBlock<DoorBlock> SECRET_SMOOTH_BLACK_SANDSTONE_DOOR = registerSandstoneDoorBlock("smooth_black", "Smooth Black", id -> doorBlock(BOPBlocks.SMOOTH_BLACK_SANDSTONE, BlockSetType.STONE, id));


    public static DeferredBlock<TrapDoorBlock> SECRET_FIR_PLANK_TRAPDOOR = registerPlankTrapdoorBlock(BOPWoodType.FIR, id -> trapDoorBlock(BOPBlocks.FIR_PLANKS, BOPBlockSetTypes.FIR, id));
    public static DeferredBlock<TrapDoorBlock> SECRET_REDWOOD_PLANK_TRAPDOOR = registerPlankTrapdoorBlock(BOPWoodType.REDWOOD, id -> trapDoorBlock(BOPBlocks.REDWOOD_PLANKS, BOPBlockSetTypes.REDWOOD, id));
    public static DeferredBlock<TrapDoorBlock> SECRET_MAHOGANY_PLANK_TRAPDOOR = registerPlankTrapdoorBlock(BOPWoodType.MAHOGANY, id -> trapDoorBlock(BOPBlocks.MAHOGANY_PLANKS, BOPBlockSetTypes.MAHOGANY, id));
    public static DeferredBlock<TrapDoorBlock> SECRET_JACARANDA_PLANK_TRAPDOOR = registerPlankTrapdoorBlock(BOPWoodType.JACARANDA, id -> trapDoorBlock(BOPBlocks.JACARANDA_PLANKS, BOPBlockSetTypes.JACARANDA, id));
    public static DeferredBlock<TrapDoorBlock> SECRET_PALM_PLANK_TRAPDOOR = registerPlankTrapdoorBlock(BOPWoodType.PALM, id -> trapDoorBlock(BOPBlocks.PALM_PLANKS, BOPBlockSetTypes.PALM, id));
    public static DeferredBlock<TrapDoorBlock> SECRET_WILLOW_PLANK_TRAPDOOR = registerPlankTrapdoorBlock(BOPWoodType.WILLOW, id -> trapDoorBlock(BOPBlocks.WILLOW_PLANKS, BOPBlockSetTypes.WILLOW, id));
    public static DeferredBlock<TrapDoorBlock> SECRET_DEAD_PLANK_TRAPDOOR = registerPlankTrapdoorBlock(BOPWoodType.DEAD, id -> trapDoorBlock(BOPBlocks.DEAD_PLANKS, BOPBlockSetTypes.DEAD, id));
    public static DeferredBlock<TrapDoorBlock> SECRET_MAGIC_PLANK_TRAPDOOR = registerPlankTrapdoorBlock(BOPWoodType.MAGIC, id -> trapDoorBlock(BOPBlocks.MAGIC_PLANKS, BOPBlockSetTypes.MAGIC, id));
    public static DeferredBlock<TrapDoorBlock> SECRET_UMBRAN_PLANK_TRAPDOOR = registerPlankTrapdoorBlock(BOPWoodType.UMBRAN, id -> trapDoorBlock(BOPBlocks.UMBRAN_PLANKS, BOPBlockSetTypes.UMBRAN, id));
    public static DeferredBlock<TrapDoorBlock> SECRET_HELLBARK_PLANK_TRAPDOOR = registerPlankTrapdoorBlock(BOPWoodType.HELLBARK, id -> trapDoorBlock(BOPBlocks.HELLBARK_PLANKS, BOPBlockSetTypes.HELLBARK, id));
    public static DeferredBlock<TrapDoorBlock> SECRET_EMPYREAL_PLANK_TRAPDOOR = registerPlankTrapdoorBlock(BOPWoodType.EMPYREAL, id -> trapDoorBlock(BOPBlocks.EMPYREAL_PLANKS, BOPBlockSetTypes.EMPYREAL, id));
    public static DeferredBlock<TrapDoorBlock> SECRET_MAPLE_PLANK_TRAPDOOR = registerPlankTrapdoorBlock(BOPWoodType.MAPLE, id -> trapDoorBlock(BOPBlocks.MAPLE_PLANKS, BOPBlockSetTypes.MAPLE, id));
    public static DeferredBlock<TrapDoorBlock> SECRET_PINE_PLANK_TRAPDOOR = registerPlankTrapdoorBlock(BOPWoodType.PINE, id -> trapDoorBlock(BOPBlocks.PINE_PLANKS, BOPBlockSetTypes.PINE, id));

    public static DeferredBlock<TrapDoorBlock> SECRET_FIR_LOG_TRAPDOOR = registerLogTrapdoorBlock(BOPWoodType.FIR, id -> trapDoorBlock(BOPBlocks.FIR_LOG, BOPBlockSetTypes.FIR, id));
    public static DeferredBlock<TrapDoorBlock> SECRET_REDWOOD_LOG_TRAPDOOR = registerLogTrapdoorBlock(BOPWoodType.REDWOOD, id -> trapDoorBlock(BOPBlocks.REDWOOD_LOG, BOPBlockSetTypes.REDWOOD, id));
    public static DeferredBlock<TrapDoorBlock> SECRET_MAHOGANY_LOG_TRAPDOOR = registerLogTrapdoorBlock(BOPWoodType.MAHOGANY, id -> trapDoorBlock(BOPBlocks.MAHOGANY_LOG, BOPBlockSetTypes.MAHOGANY, id));
    public static DeferredBlock<TrapDoorBlock> SECRET_JACARANDA_LOG_TRAPDOOR = registerLogTrapdoorBlock(BOPWoodType.JACARANDA, id -> trapDoorBlock(BOPBlocks.JACARANDA_LOG, BOPBlockSetTypes.JACARANDA, id));
    public static DeferredBlock<TrapDoorBlock> SECRET_PALM_LOG_TRAPDOOR = registerLogTrapdoorBlock(BOPWoodType.PALM, id -> trapDoorBlock(BOPBlocks.PALM_LOG, BOPBlockSetTypes.PALM, id));
    public static DeferredBlock<TrapDoorBlock> SECRET_WILLOW_LOG_TRAPDOOR = registerLogTrapdoorBlock(BOPWoodType.WILLOW, id -> trapDoorBlock(BOPBlocks.WILLOW_LOG, BOPBlockSetTypes.WILLOW, id));
    public static DeferredBlock<TrapDoorBlock> SECRET_DEAD_LOG_TRAPDOOR = registerLogTrapdoorBlock(BOPWoodType.DEAD, id -> trapDoorBlock(BOPBlocks.DEAD_LOG, BOPBlockSetTypes.DEAD, id));
    public static DeferredBlock<TrapDoorBlock> SECRET_MAGIC_LOG_TRAPDOOR = registerLogTrapdoorBlock(BOPWoodType.MAGIC, id -> trapDoorBlock(BOPBlocks.MAGIC_LOG, BOPBlockSetTypes.MAGIC, id));
    public static DeferredBlock<TrapDoorBlock> SECRET_UMBRAN_LOG_TRAPDOOR = registerLogTrapdoorBlock(BOPWoodType.UMBRAN, id -> trapDoorBlock(BOPBlocks.UMBRAN_LOG, BOPBlockSetTypes.UMBRAN, id));
    public static DeferredBlock<TrapDoorBlock> SECRET_HELLBARK_LOG_TRAPDOOR = registerLogTrapdoorBlock(BOPWoodType.HELLBARK, id -> trapDoorBlock(BOPBlocks.HELLBARK_LOG, BOPBlockSetTypes.HELLBARK, id));
    public static DeferredBlock<TrapDoorBlock> SECRET_EMPYREAL_LOG_TRAPDOOR = registerLogTrapdoorBlock(BOPWoodType.EMPYREAL, id -> trapDoorBlock(BOPBlocks.EMPYREAL_LOG, BOPBlockSetTypes.EMPYREAL, id));
    public static DeferredBlock<TrapDoorBlock> SECRET_MAPLE_LOG_TRAPDOOR = registerLogTrapdoorBlock(BOPWoodType.MAPLE, id -> trapDoorBlock(BOPBlocks.MAPLE_LOG, BOPBlockSetTypes.MAPLE, id));
    public static DeferredBlock<TrapDoorBlock> SECRET_PINE_LOG_TRAPDOOR = registerLogTrapdoorBlock(BOPWoodType.PINE, id -> trapDoorBlock(BOPBlocks.PINE_LOG, BOPBlockSetTypes.PINE, id));

    public static DeferredBlock<TrapDoorBlock> SECRET_STRIPPED_FIR_LOG_TRAPDOOR = registerStrippedLogTrapdoorBlock(BOPWoodType.FIR, id -> trapDoorBlock(BOPBlocks.STRIPPED_FIR_LOG, BOPBlockSetTypes.FIR, id));
    public static DeferredBlock<TrapDoorBlock> SECRET_STRIPPED_REDWOOD_LOG_TRAPDOOR = registerStrippedLogTrapdoorBlock(BOPWoodType.REDWOOD, id -> trapDoorBlock(BOPBlocks.STRIPPED_REDWOOD_LOG, BOPBlockSetTypes.REDWOOD, id));
    public static DeferredBlock<TrapDoorBlock> SECRET_STRIPPED_MAHOGANY_LOG_TRAPDOOR = registerStrippedLogTrapdoorBlock(BOPWoodType.MAHOGANY, id -> trapDoorBlock(BOPBlocks.STRIPPED_MAHOGANY_LOG, BOPBlockSetTypes.MAHOGANY, id));
    public static DeferredBlock<TrapDoorBlock> SECRET_STRIPPED_JACARANDA_LOG_TRAPDOOR = registerStrippedLogTrapdoorBlock(BOPWoodType.JACARANDA, id -> trapDoorBlock(BOPBlocks.STRIPPED_JACARANDA_LOG, BOPBlockSetTypes.JACARANDA, id));
    public static DeferredBlock<TrapDoorBlock> SECRET_STRIPPED_PALM_LOG_TRAPDOOR = registerStrippedLogTrapdoorBlock(BOPWoodType.PALM, id -> trapDoorBlock(BOPBlocks.STRIPPED_PALM_LOG, BOPBlockSetTypes.PALM, id));
    public static DeferredBlock<TrapDoorBlock> SECRET_STRIPPED_WILLOW_LOG_TRAPDOOR = registerStrippedLogTrapdoorBlock(BOPWoodType.WILLOW, id -> trapDoorBlock(BOPBlocks.STRIPPED_WILLOW_LOG, BOPBlockSetTypes.WILLOW, id));
    public static DeferredBlock<TrapDoorBlock> SECRET_STRIPPED_DEAD_LOG_TRAPDOOR = registerStrippedLogTrapdoorBlock(BOPWoodType.DEAD, id -> trapDoorBlock(BOPBlocks.STRIPPED_DEAD_LOG, BOPBlockSetTypes.DEAD, id));
    public static DeferredBlock<TrapDoorBlock> SECRET_STRIPPED_MAGIC_LOG_TRAPDOOR = registerStrippedLogTrapdoorBlock(BOPWoodType.MAGIC, id -> trapDoorBlock(BOPBlocks.STRIPPED_MAGIC_LOG, BOPBlockSetTypes.MAGIC, id));
    public static DeferredBlock<TrapDoorBlock> SECRET_STRIPPED_UMBRAN_LOG_TRAPDOOR = registerStrippedLogTrapdoorBlock(BOPWoodType.UMBRAN, id -> trapDoorBlock(BOPBlocks.STRIPPED_UMBRAN_LOG, BOPBlockSetTypes.UMBRAN, id));
    public static DeferredBlock<TrapDoorBlock> SECRET_STRIPPED_HELLBARK_LOG_TRAPDOOR = registerStrippedLogTrapdoorBlock(BOPWoodType.HELLBARK, id -> trapDoorBlock(BOPBlocks.STRIPPED_HELLBARK_LOG, BOPBlockSetTypes.HELLBARK, id));
    public static DeferredBlock<TrapDoorBlock> SECRET_STRIPPED_EMPYREAL_LOG_TRAPDOOR = registerStrippedLogTrapdoorBlock(BOPWoodType.EMPYREAL, id -> trapDoorBlock(BOPBlocks.STRIPPED_EMPYREAL_LOG, BOPBlockSetTypes.EMPYREAL, id));
    public static DeferredBlock<TrapDoorBlock> SECRET_STRIPPED_MAPLE_LOG_TRAPDOOR = registerStrippedLogTrapdoorBlock(BOPWoodType.MAPLE, id -> trapDoorBlock(BOPBlocks.STRIPPED_MAPLE_LOG, BOPBlockSetTypes.MAPLE, id));
    public static DeferredBlock<TrapDoorBlock> SECRET_STRIPPED_PINE_LOG_TRAPDOOR = registerStrippedLogTrapdoorBlock(BOPWoodType.PINE, id -> trapDoorBlock(BOPBlocks.STRIPPED_PINE_LOG, BOPBlockSetTypes.PINE, id));

    public static DeferredBlock<TrapDoorBlock> SECRET_WHITE_SANDSTONE_TRAPDOOR = registerSandstoneTrapdoorBlock("white", "White", id -> trapDoorBlock(BOPBlocks.WHITE_SANDSTONE, BlockSetType.STONE, id));
    public static DeferredBlock<TrapDoorBlock> SECRET_CUT_WHITE_SANDSTONE_TRAPDOOR = registerSandstoneTrapdoorBlock("cut_white", "Cut White", id -> trapDoorBlock(BOPBlocks.CUT_WHITE_SANDSTONE, BlockSetType.STONE, id));
    public static DeferredBlock<TrapDoorBlock> SECRET_SMOOTH_WHITE_SANDSTONE_TRAPDOOR = registerSandstoneTrapdoorBlock("smooth_white", "Smooth White", id -> trapDoorBlock(BOPBlocks.SMOOTH_WHITE_SANDSTONE, BlockSetType.STONE, id));
    public static DeferredBlock<TrapDoorBlock> SECRET_ORANGE_SANDSTONE_TRAPDOOR = registerSandstoneTrapdoorBlock("orange", "Orange", id -> trapDoorBlock(BOPBlocks.ORANGE_SANDSTONE, BlockSetType.STONE, id));
    public static DeferredBlock<TrapDoorBlock> SECRET_CUT_ORANGE_SANDSTONE_TRAPDOOR = registerSandstoneTrapdoorBlock("cut_orange", "Cut Orange", id -> trapDoorBlock(BOPBlocks.CUT_ORANGE_SANDSTONE, BlockSetType.STONE, id));
    public static DeferredBlock<TrapDoorBlock> SECRET_SMOOTH_ORANGE_SANDSTONE_TRAPDOOR = registerSandstoneTrapdoorBlock("smooth_orange", "Smooth Orange", id -> trapDoorBlock(BOPBlocks.SMOOTH_ORANGE_SANDSTONE, BlockSetType.STONE, id));
    public static DeferredBlock<TrapDoorBlock> SECRET_BLACK_SANDSTONE_TRAPDOOR = registerSandstoneTrapdoorBlock("black", "Black", id -> trapDoorBlock(BOPBlocks.BLACK_SANDSTONE, BlockSetType.STONE, id));
    public static DeferredBlock<TrapDoorBlock> SECRET_CUT_BLACK_SANDSTONE_TRAPDOOR = registerSandstoneTrapdoorBlock("cut_black", "Cut Black", id -> trapDoorBlock(BOPBlocks.CUT_BLACK_SANDSTONE, BlockSetType.STONE, id));
    public static DeferredBlock<TrapDoorBlock> SECRET_SMOOTH_BLACK_SANDSTONE_TRAPDOOR = registerSandstoneTrapdoorBlock("smooth_black", "Smooth Black", id -> trapDoorBlock(BOPBlocks.SMOOTH_BLACK_SANDSTONE, BlockSetType.STONE, id));

    public static DoorBlock doorBlock(Block blockToCopy, BlockSetType type, ResourceLocation id) {
        return new DoorBlock(type, BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, id)).mapColor(blockToCopy.defaultMapColor()).instrument(blockToCopy.defaultBlockState().instrument()).strength(3.0F).noOcclusion().ignitedByLava().pushReaction(PushReaction.DESTROY));
    }

    public static TrapDoorBlock trapDoorBlock(Block blockToCopy, BlockSetType type, ResourceLocation id) {
        return new TrapDoorBlock(type, BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, id)).mapColor(blockToCopy.defaultMapColor()).instrument(blockToCopy.defaultBlockState().instrument()).strength(3.0F).noOcclusion().isValidSpawn(SBDBlocks::never).ignitedByLava());
    }

    public static void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            for (DeferredBlock<? extends Block> block : BUILDING_BLOCKS_CREATIVE_TAB) {
                event.accept(block);
            }
        }
    }

    private static Boolean never(BlockState state, BlockGetter blockGetter, BlockPos pose, EntityType<?> entityType) {
        return false;
    }

    private static <T extends DoorBlock> DeferredBlock<T> registerDoorBlockBase(String nameIn, String localizationIn, Function<ResourceLocation, ? extends T> blockIn) {
        DeferredBlock<T> block = BLOCKS.register(nameIn, blockIn);
        ITEMS.registerSimpleBlockItem(block);
        BLOCK_LANG_EN_US.put(block, localizationIn);
        DOOR_LOOT_TABLE.add(block);
        BUILDING_BLOCKS_CREATIVE_TAB.add(block);
        return block;
    }

    public static <T extends DoorBlock> DeferredBlock<T> registerDoorBlock(String doorNameIn, String doorLocalizationIn, Function<ResourceLocation, ? extends T> blockIn) {
        return registerDoorBlockBase("secret_" + doorNameIn + "_door", "Secret " + doorLocalizationIn + " Door", blockIn);
    }

    public static <T extends DoorBlock> DeferredBlock<T> registerPlankDoorBlock(BOPWoodType wood, Function<ResourceLocation, ? extends T> blockIn) {
        return registerDoorBlock(wood.name + "_plank", wood.localization + " Plank", blockIn);
    }

    public static <T extends DoorBlock> DeferredBlock<T> registerLogDoorBlock(BOPWoodType wood, Function<ResourceLocation, ? extends T> blockIn) {
        return registerDoorBlock(wood.name + "_log", wood.localization + " Log", blockIn);
    }

    public static <T extends DoorBlock> DeferredBlock<T> registerStrippedLogDoorBlock(BOPWoodType wood, Function<ResourceLocation, ? extends T> blockIn) {
        return registerDoorBlock("stripped_" + wood.name + "_log", "Stripped " + wood.localization + " Log", blockIn);
    }

    public static <T extends DoorBlock> DeferredBlock<T> registerStrippedHorizontalLogDoorBlock(BOPWoodType wood, Function<ResourceLocation, ? extends T> blockIn) {
        return registerDoorBlock("stripped_horizontal_" + wood.name + "_log", "Stripped Horizontal " + wood.localization + " Log", blockIn);
    }

    public static <T extends DoorBlock> DeferredBlock<T> registerHorizontalLogDoorBlock(BOPWoodType wood, Function<ResourceLocation, ? extends T> blockIn) {
        return registerDoorBlock("horizontal_" + wood.name + "_log", "Horizontal " + wood.localization + " Log", blockIn);
    }

    public static <T extends DoorBlock> DeferredBlock<T> registerSandstoneDoorBlock(String name, String localization, Function<ResourceLocation, ? extends T> blockIn) {
        return registerDoorBlock(name + "_sandstone", localization + " Sandstone", blockIn);
    }

    private static <T extends Block> DeferredBlock<T> registerTrapdoorBlockBase(String nameIn, String localizationIn, Function<ResourceLocation, ? extends T> blockIn) {
        DeferredBlock<T> block = BLOCKS.register(nameIn, blockIn);
        ITEMS.registerSimpleBlockItem(block);
        BLOCK_LANG_EN_US.put(block, localizationIn);
        TRAPDOOR_LOOT_TABLE.add(block);
        BUILDING_BLOCKS_CREATIVE_TAB.add(block);
        return block;
    }

    public static <T extends TrapDoorBlock> DeferredBlock<T> registerTrapdoorBlock(String doorNameIn, String doorLocalizationIn, Function<ResourceLocation, ? extends T> blockIn) {
        return registerTrapdoorBlockBase("secret_" + doorNameIn + "_trapdoor", "Secret " + doorLocalizationIn + " Trapdoor", blockIn);
    }

    public static <T extends TrapDoorBlock> DeferredBlock<T> registerPlankTrapdoorBlock(BOPWoodType wood, Function<ResourceLocation, ? extends T> blockIn) {
        return registerTrapdoorBlock(wood.name + "_plank", wood.localization + " Plank", blockIn);
    }

    public static <T extends TrapDoorBlock> DeferredBlock<T> registerLogTrapdoorBlock(BOPWoodType wood, Function<ResourceLocation, ? extends T> blockIn) {
        return registerTrapdoorBlock(wood.name + "_log", wood.localization + " Log", blockIn);
    }

    public static <T extends TrapDoorBlock> DeferredBlock<T> registerStrippedLogTrapdoorBlock(BOPWoodType wood, Function<ResourceLocation, ? extends T> blockIn) {
        return registerTrapdoorBlock("stripped_" + wood.name + "_log", "Stripped " + wood.localization + " Log", blockIn);
    }

    public static <T extends TrapDoorBlock> DeferredBlock<T> registerSandstoneTrapdoorBlock(String name, String localization, Function<ResourceLocation, ? extends T> blockIn) {
        return registerTrapdoorBlock(name + "_sandstone", localization + " Sandstone", blockIn);
    }
}
package com.shim.secretbopdoors;

import biomesoplenty.api.block.BOPBlockSetTypes;
import biomesoplenty.api.block.BOPBlocks;
import com.shim.secretdoors.SecretDoors;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
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
import java.util.function.Supplier;

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

    public static DeferredBlock<DoorBlock> SECRET_FIR_PLANK_DOOR = registerPlankDoorBlock(BOPWoodType.FIR, () -> doorBlock(BOPBlocks.FIR_PLANKS, BOPBlockSetTypes.FIR));
    public static DeferredBlock<DoorBlock> SECRET_REDWOOD_PLANK_DOOR = registerPlankDoorBlock(BOPWoodType.REDWOOD, () -> doorBlock(BOPBlocks.REDWOOD_PLANKS, BOPBlockSetTypes.REDWOOD));
    public static DeferredBlock<DoorBlock> SECRET_MAHOGANY_PLANK_DOOR = registerPlankDoorBlock(BOPWoodType.MAHOGANY, () -> doorBlock(BOPBlocks.MAHOGANY_PLANKS, BOPBlockSetTypes.MAHOGANY));
    public static DeferredBlock<DoorBlock> SECRET_JACARANDA_PLANK_DOOR = registerPlankDoorBlock(BOPWoodType.JACARANDA, () -> doorBlock(BOPBlocks.JACARANDA_PLANKS, BOPBlockSetTypes.JACARANDA));
    public static DeferredBlock<DoorBlock> SECRET_PALM_PLANK_DOOR = registerPlankDoorBlock(BOPWoodType.PALM, () -> doorBlock(BOPBlocks.PALM_PLANKS, BOPBlockSetTypes.PALM));
    public static DeferredBlock<DoorBlock> SECRET_WILLOW_PLANK_DOOR = registerPlankDoorBlock(BOPWoodType.WILLOW, () -> doorBlock(BOPBlocks.WILLOW_PLANKS, BOPBlockSetTypes.WILLOW));
    public static DeferredBlock<DoorBlock> SECRET_DEAD_PLANK_DOOR = registerPlankDoorBlock(BOPWoodType.DEAD, () -> doorBlock(BOPBlocks.DEAD_PLANKS, BOPBlockSetTypes.DEAD));
    public static DeferredBlock<DoorBlock> SECRET_MAGIC_PLANK_DOOR = registerPlankDoorBlock(BOPWoodType.MAGIC, () -> doorBlock(BOPBlocks.MAGIC_PLANKS, BOPBlockSetTypes.MAGIC));
    public static DeferredBlock<DoorBlock> SECRET_UMBRAN_PLANK_DOOR = registerPlankDoorBlock(BOPWoodType.UMBRAN, () -> doorBlock(BOPBlocks.UMBRAN_PLANKS, BOPBlockSetTypes.UMBRAN));
    public static DeferredBlock<DoorBlock> SECRET_HELLBARK_PLANK_DOOR = registerPlankDoorBlock(BOPWoodType.HELLBARK, () -> doorBlock(BOPBlocks.HELLBARK_PLANKS, BOPBlockSetTypes.HELLBARK));
    public static DeferredBlock<DoorBlock> SECRET_EMPYREAL_PLANK_DOOR = registerPlankDoorBlock(BOPWoodType.EMPYREAL, () -> doorBlock(BOPBlocks.EMPYREAL_PLANKS, BOPBlockSetTypes.EMPYREAL));
    public static DeferredBlock<DoorBlock> SECRET_MAPLE_PLANK_DOOR = registerPlankDoorBlock(BOPWoodType.MAPLE, () -> doorBlock(BOPBlocks.MAPLE_PLANKS, BOPBlockSetTypes.MAPLE));
    public static DeferredBlock<DoorBlock> SECRET_PINE_PLANK_DOOR = registerPlankDoorBlock(BOPWoodType.PINE, () -> doorBlock(BOPBlocks.PINE_PLANKS, BOPBlockSetTypes.PINE));

    public static DeferredBlock<DoorBlock> SECRET_FIR_LOG_DOOR = registerLogDoorBlock(BOPWoodType.FIR, () -> doorBlock(BOPBlocks.FIR_LOG, BOPBlockSetTypes.FIR));
    public static DeferredBlock<DoorBlock> SECRET_REDWOOD_LOG_DOOR = registerLogDoorBlock(BOPWoodType.REDWOOD, () -> doorBlock(BOPBlocks.REDWOOD_LOG, BOPBlockSetTypes.REDWOOD));
    public static DeferredBlock<DoorBlock> SECRET_MAHOGANY_LOG_DOOR = registerLogDoorBlock(BOPWoodType.MAHOGANY, () -> doorBlock(BOPBlocks.MAHOGANY_LOG, BOPBlockSetTypes.MAHOGANY));
    public static DeferredBlock<DoorBlock> SECRET_JACARANDA_LOG_DOOR = registerLogDoorBlock(BOPWoodType.JACARANDA, () -> doorBlock(BOPBlocks.JACARANDA_LOG, BOPBlockSetTypes.JACARANDA));
    public static DeferredBlock<DoorBlock> SECRET_PALM_LOG_DOOR = registerLogDoorBlock(BOPWoodType.PALM, () -> doorBlock(BOPBlocks.PALM_LOG, BOPBlockSetTypes.PALM));
    public static DeferredBlock<DoorBlock> SECRET_WILLOW_LOG_DOOR = registerLogDoorBlock(BOPWoodType.WILLOW, () -> doorBlock(BOPBlocks.WILLOW_LOG, BOPBlockSetTypes.WILLOW));
    public static DeferredBlock<DoorBlock> SECRET_DEAD_LOG_DOOR = registerLogDoorBlock(BOPWoodType.DEAD, () -> doorBlock(BOPBlocks.DEAD_LOG, BOPBlockSetTypes.DEAD));
    public static DeferredBlock<DoorBlock> SECRET_MAGIC_LOG_DOOR = registerLogDoorBlock(BOPWoodType.MAGIC, () -> doorBlock(BOPBlocks.MAGIC_LOG, BOPBlockSetTypes.MAGIC));
    public static DeferredBlock<DoorBlock> SECRET_UMBRAN_LOG_DOOR = registerLogDoorBlock(BOPWoodType.UMBRAN, () -> doorBlock(BOPBlocks.UMBRAN_LOG, BOPBlockSetTypes.UMBRAN));
    public static DeferredBlock<DoorBlock> SECRET_HELLBARK_LOG_DOOR = registerLogDoorBlock(BOPWoodType.HELLBARK, () -> doorBlock(BOPBlocks.HELLBARK_LOG, BOPBlockSetTypes.HELLBARK));
    public static DeferredBlock<DoorBlock> SECRET_EMPYREAL_LOG_DOOR = registerLogDoorBlock(BOPWoodType.EMPYREAL, () -> doorBlock(BOPBlocks.EMPYREAL_LOG, BOPBlockSetTypes.HELLBARK));
    public static DeferredBlock<DoorBlock> SECRET_MAPLE_LOG_DOOR = registerLogDoorBlock(BOPWoodType.MAPLE, () -> doorBlock(BOPBlocks.MAPLE_LOG, BOPBlockSetTypes.MAPLE));
    public static DeferredBlock<DoorBlock> SECRET_PINE_LOG_DOOR = registerLogDoorBlock(BOPWoodType.PINE, () -> doorBlock(BOPBlocks.PINE_LOG, BOPBlockSetTypes.PINE));

    public static DeferredBlock<DoorBlock> SECRET_STRIPPED_FIR_LOG_DOOR = registerStrippedLogDoorBlock(BOPWoodType.FIR, () -> doorBlock(BOPBlocks.STRIPPED_FIR_LOG, BOPBlockSetTypes.FIR));
    public static DeferredBlock<DoorBlock> SECRET_STRIPPED_REDWOOD_LOG_DOOR = registerStrippedLogDoorBlock(BOPWoodType.REDWOOD, () -> doorBlock(BOPBlocks.STRIPPED_REDWOOD_LOG, BOPBlockSetTypes.REDWOOD));
    public static DeferredBlock<DoorBlock> SECRET_STRIPPED_MAHOGANY_LOG_DOOR = registerStrippedLogDoorBlock(BOPWoodType.MAHOGANY, () -> doorBlock(BOPBlocks.STRIPPED_MAHOGANY_LOG, BOPBlockSetTypes.MAHOGANY));
    public static DeferredBlock<DoorBlock> SECRET_STRIPPED_JACARANDA_LOG_DOOR = registerStrippedLogDoorBlock(BOPWoodType.JACARANDA, () -> doorBlock(BOPBlocks.STRIPPED_JACARANDA_LOG, BOPBlockSetTypes.JACARANDA));
    public static DeferredBlock<DoorBlock> SECRET_STRIPPED_PALM_LOG_DOOR = registerStrippedLogDoorBlock(BOPWoodType.PALM, () -> doorBlock(BOPBlocks.STRIPPED_PALM_LOG, BOPBlockSetTypes.PALM));
    public static DeferredBlock<DoorBlock> SECRET_STRIPPED_WILLOW_LOG_DOOR = registerStrippedLogDoorBlock(BOPWoodType.WILLOW, () -> doorBlock(BOPBlocks.STRIPPED_WILLOW_LOG, BOPBlockSetTypes.WILLOW));
    public static DeferredBlock<DoorBlock> SECRET_STRIPPED_DEAD_LOG_DOOR = registerStrippedLogDoorBlock(BOPWoodType.DEAD, () -> doorBlock(BOPBlocks.STRIPPED_DEAD_LOG, BOPBlockSetTypes.DEAD));
    public static DeferredBlock<DoorBlock> SECRET_STRIPPED_MAGIC_LOG_DOOR = registerStrippedLogDoorBlock(BOPWoodType.MAGIC, () -> doorBlock(BOPBlocks.STRIPPED_MAGIC_LOG, BOPBlockSetTypes.MAGIC));
    public static DeferredBlock<DoorBlock> SECRET_STRIPPED_UMBRAN_LOG_DOOR = registerStrippedLogDoorBlock(BOPWoodType.UMBRAN, () -> doorBlock(BOPBlocks.STRIPPED_UMBRAN_LOG, BOPBlockSetTypes.UMBRAN));
    public static DeferredBlock<DoorBlock> SECRET_STRIPPED_HELLBARK_LOG_DOOR = registerStrippedLogDoorBlock(BOPWoodType.HELLBARK, () -> doorBlock(BOPBlocks.STRIPPED_HELLBARK_LOG, BOPBlockSetTypes.HELLBARK));
    public static DeferredBlock<DoorBlock> SECRET_STRIPPED_EMPYREAL_LOG_DOOR = registerStrippedLogDoorBlock(BOPWoodType.EMPYREAL, () -> doorBlock(BOPBlocks.STRIPPED_EMPYREAL_LOG, BOPBlockSetTypes.EMPYREAL));
    public static DeferredBlock<DoorBlock> SECRET_STRIPPED_MAPLE_LOG_DOOR = registerStrippedLogDoorBlock(BOPWoodType.MAPLE, () -> doorBlock(BOPBlocks.STRIPPED_MAPLE_LOG, BOPBlockSetTypes.MAPLE));
    public static DeferredBlock<DoorBlock> SECRET_STRIPPED_PINE_LOG_DOOR = registerStrippedLogDoorBlock(BOPWoodType.PINE, () -> doorBlock(BOPBlocks.STRIPPED_PINE_LOG, BOPBlockSetTypes.PINE));

    public static DeferredBlock<DoorBlock> SECRET_STRIPPED_HORIZONTAL_FIR_LOG_DOOR = registerStrippedHorizontalLogDoorBlock(BOPWoodType.FIR, () -> doorBlock(BOPBlocks.STRIPPED_FIR_LOG, BOPBlockSetTypes.FIR));
    public static DeferredBlock<DoorBlock> SECRET_STRIPPED_HORIZONTAL_REDWOOD_LOG_DOOR = registerStrippedHorizontalLogDoorBlock(BOPWoodType.REDWOOD, () -> doorBlock(BOPBlocks.STRIPPED_REDWOOD_LOG, BOPBlockSetTypes.REDWOOD));
    public static DeferredBlock<DoorBlock> SECRET_STRIPPED_HORIZONTAL_MAHOGANY_LOG_DOOR = registerStrippedHorizontalLogDoorBlock(BOPWoodType.MAHOGANY, () -> doorBlock(BOPBlocks.STRIPPED_MAHOGANY_LOG, BOPBlockSetTypes.MAHOGANY));
    public static DeferredBlock<DoorBlock> SECRET_STRIPPED_HORIZONTAL_JACARANDA_LOG_DOOR = registerStrippedHorizontalLogDoorBlock(BOPWoodType.JACARANDA, () -> doorBlock(BOPBlocks.STRIPPED_JACARANDA_LOG, BOPBlockSetTypes.JACARANDA));
    public static DeferredBlock<DoorBlock> SECRET_STRIPPED_HORIZONTAL_PALM_LOG_DOOR = registerStrippedHorizontalLogDoorBlock(BOPWoodType.PALM, () -> doorBlock(BOPBlocks.STRIPPED_PALM_LOG, BOPBlockSetTypes.PALM));
    public static DeferredBlock<DoorBlock> SECRET_STRIPPED_HORIZONTAL_WILLOW_LOG_DOOR = registerStrippedHorizontalLogDoorBlock(BOPWoodType.WILLOW, () -> doorBlock(BOPBlocks.STRIPPED_WILLOW_LOG, BOPBlockSetTypes.WILLOW));
    public static DeferredBlock<DoorBlock> SECRET_STRIPPED_HORIZONTAL_DEAD_LOG_DOOR = registerStrippedHorizontalLogDoorBlock(BOPWoodType.DEAD, () -> doorBlock(BOPBlocks.STRIPPED_DEAD_LOG, BOPBlockSetTypes.DEAD));
    public static DeferredBlock<DoorBlock> SECRET_STRIPPED_HORIZONTAL_MAGIC_LOG_DOOR = registerStrippedHorizontalLogDoorBlock(BOPWoodType.MAGIC, () -> doorBlock(BOPBlocks.STRIPPED_MAGIC_LOG, BOPBlockSetTypes.MAGIC));
    public static DeferredBlock<DoorBlock> SECRET_STRIPPED_HORIZONTAL_UMBRAN_LOG_DOOR = registerStrippedHorizontalLogDoorBlock(BOPWoodType.UMBRAN, () -> doorBlock(BOPBlocks.STRIPPED_UMBRAN_LOG, BOPBlockSetTypes.UMBRAN));
    public static DeferredBlock<DoorBlock> SECRET_STRIPPED_HORIZONTAL_HELLBARK_LOG_DOOR = registerStrippedHorizontalLogDoorBlock(BOPWoodType.HELLBARK, () -> doorBlock(BOPBlocks.STRIPPED_HELLBARK_LOG, BOPBlockSetTypes.HELLBARK));
    public static DeferredBlock<DoorBlock> SECRET_STRIPPED_HORIZONTAL_EMPYREAL_LOG_DOOR = registerStrippedHorizontalLogDoorBlock(BOPWoodType.EMPYREAL, () -> doorBlock(BOPBlocks.STRIPPED_EMPYREAL_LOG, BOPBlockSetTypes.EMPYREAL));
    public static DeferredBlock<DoorBlock> SECRET_STRIPPED_HORIZONTAL_MAPLE_LOG_DOOR = registerStrippedHorizontalLogDoorBlock(BOPWoodType.MAPLE, () -> doorBlock(BOPBlocks.STRIPPED_MAPLE_LOG, BOPBlockSetTypes.MAPLE));
    public static DeferredBlock<DoorBlock> SECRET_STRIPPED_HORIZONTAL_PINE_LOG_DOOR = registerStrippedHorizontalLogDoorBlock(BOPWoodType.PINE, () -> doorBlock(BOPBlocks.STRIPPED_PINE_LOG, BOPBlockSetTypes.PINE));

    public static DeferredBlock<DoorBlock> SECRET_HORIZONTAL_FIR_LOG_DOOR = registerHorizontalLogDoorBlock(BOPWoodType.FIR, () -> doorBlock(BOPBlocks.FIR_LOG, BOPBlockSetTypes.FIR));
    public static DeferredBlock<DoorBlock> SECRET_HORIZONTAL_REDWOOD_LOG_DOOR = registerHorizontalLogDoorBlock(BOPWoodType.REDWOOD, () -> doorBlock(BOPBlocks.REDWOOD_LOG, BOPBlockSetTypes.REDWOOD));
    public static DeferredBlock<DoorBlock> SECRET_HORIZONTAL_MAHOGANY_LOG_DOOR = registerHorizontalLogDoorBlock(BOPWoodType.MAHOGANY, () -> doorBlock(BOPBlocks.MAHOGANY_LOG, BOPBlockSetTypes.MAHOGANY));
    public static DeferredBlock<DoorBlock> SECRET_HORIZONTAL_JACARANDA_LOG_DOOR = registerHorizontalLogDoorBlock(BOPWoodType.JACARANDA, () -> doorBlock(BOPBlocks.JACARANDA_LOG, BOPBlockSetTypes.JACARANDA));
    public static DeferredBlock<DoorBlock> SECRET_HORIZONTAL_PALM_LOG_DOOR = registerHorizontalLogDoorBlock(BOPWoodType.PALM, () -> doorBlock(BOPBlocks.PALM_LOG, BOPBlockSetTypes.PALM));
    public static DeferredBlock<DoorBlock> SECRET_HORIZONTAL_WILLOW_LOG_DOOR = registerHorizontalLogDoorBlock(BOPWoodType.WILLOW, () -> doorBlock(BOPBlocks.WILLOW_LOG, BOPBlockSetTypes.WILLOW));
    public static DeferredBlock<DoorBlock> SECRET_HORIZONTAL_DEAD_LOG_DOOR = registerHorizontalLogDoorBlock(BOPWoodType.DEAD, () -> doorBlock(BOPBlocks.DEAD_LOG, BOPBlockSetTypes.DEAD));
    public static DeferredBlock<DoorBlock> SECRET_HORIZONTAL_MAGIC_LOG_DOOR = registerHorizontalLogDoorBlock(BOPWoodType.MAGIC, () -> doorBlock(BOPBlocks.MAGIC_LOG, BOPBlockSetTypes.MAGIC));
    public static DeferredBlock<DoorBlock> SECRET_HORIZONTAL_UMBRAN_LOG_DOOR = registerHorizontalLogDoorBlock(BOPWoodType.UMBRAN, () -> doorBlock(BOPBlocks.UMBRAN_LOG, BOPBlockSetTypes.UMBRAN));
    public static DeferredBlock<DoorBlock> SECRET_HORIZONTAL_HELLBARK_LOG_DOOR = registerHorizontalLogDoorBlock(BOPWoodType.HELLBARK, () -> doorBlock(BOPBlocks.HELLBARK_LOG, BOPBlockSetTypes.HELLBARK));
    public static DeferredBlock<DoorBlock> SECRET_HORIZONTAL_EMPYREAL_LOG_DOOR = registerHorizontalLogDoorBlock(BOPWoodType.EMPYREAL, () -> doorBlock(BOPBlocks.EMPYREAL_LOG, BOPBlockSetTypes.EMPYREAL));
    public static DeferredBlock<DoorBlock> SECRET_HORIZONTAL_MAPLE_LOG_DOOR = registerHorizontalLogDoorBlock(BOPWoodType.MAPLE, () -> doorBlock(BOPBlocks.MAPLE_LOG, BOPBlockSetTypes.MAPLE));
    public static DeferredBlock<DoorBlock> SECRET_HORIZONTAL_PINE_LOG_DOOR = registerHorizontalLogDoorBlock(BOPWoodType.PINE, () -> doorBlock(BOPBlocks.PINE_LOG, BOPBlockSetTypes.PINE));

    public static DeferredBlock<DoorBlock> SECRET_WHITE_SANDSTONE_DOOR = registerSandstoneDoorBlock("white", "White", () -> doorBlock(BOPBlocks.WHITE_SANDSTONE, BlockSetType.STONE));
    public static DeferredBlock<DoorBlock> SECRET_CUT_WHITE_SANDSTONE_DOOR = registerSandstoneDoorBlock("cut_white", "Cut White", () -> doorBlock(BOPBlocks.CUT_WHITE_SANDSTONE, BlockSetType.STONE));
    public static DeferredBlock<DoorBlock> SECRET_SMOOTH_WHITE_SANDSTONE_DOOR = registerSandstoneDoorBlock("smooth_white", "Smooth White", () -> doorBlock(BOPBlocks.SMOOTH_WHITE_SANDSTONE, BlockSetType.STONE));
    public static DeferredBlock<DoorBlock> SECRET_ORANGE_SANDSTONE_DOOR = registerSandstoneDoorBlock("orange", "Orange", () -> doorBlock(BOPBlocks.ORANGE_SANDSTONE, BlockSetType.STONE));
    public static DeferredBlock<DoorBlock> SECRET_CUT_ORANGE_SANDSTONE_DOOR = registerSandstoneDoorBlock("cut_orange", "Cut Orange", () -> doorBlock(BOPBlocks.CUT_ORANGE_SANDSTONE, BlockSetType.STONE));
    public static DeferredBlock<DoorBlock> SECRET_SMOOTH_ORANGE_SANDSTONE_DOOR = registerSandstoneDoorBlock("smooth_orange", "Smooth Orange", () -> doorBlock(BOPBlocks.SMOOTH_ORANGE_SANDSTONE, BlockSetType.STONE));
    public static DeferredBlock<DoorBlock> SECRET_BLACK_SANDSTONE_DOOR = registerSandstoneDoorBlock("black", "Black", () -> doorBlock(BOPBlocks.BLACK_SANDSTONE, BlockSetType.STONE));
    public static DeferredBlock<DoorBlock> SECRET_CUT_BLACK_SANDSTONE_DOOR = registerSandstoneDoorBlock("cut_black", "Cut Black", () -> doorBlock(BOPBlocks.CUT_BLACK_SANDSTONE, BlockSetType.STONE));
    public static DeferredBlock<DoorBlock> SECRET_SMOOTH_BLACK_SANDSTONE_DOOR = registerSandstoneDoorBlock("smooth_black", "Smooth Black", () -> doorBlock(BOPBlocks.SMOOTH_BLACK_SANDSTONE, BlockSetType.STONE));


    public static DeferredBlock<TrapDoorBlock> SECRET_FIR_PLANK_TRAPDOOR = registerPlankTrapdoorBlock(BOPWoodType.FIR, () -> trapDoorBlock(BOPBlocks.FIR_PLANKS, BOPBlockSetTypes.FIR));
    public static DeferredBlock<TrapDoorBlock> SECRET_REDWOOD_PLANK_TRAPDOOR = registerPlankTrapdoorBlock(BOPWoodType.REDWOOD, () -> trapDoorBlock(BOPBlocks.REDWOOD_PLANKS, BOPBlockSetTypes.REDWOOD));
    public static DeferredBlock<TrapDoorBlock> SECRET_MAHOGANY_PLANK_TRAPDOOR = registerPlankTrapdoorBlock(BOPWoodType.MAHOGANY, () -> trapDoorBlock(BOPBlocks.MAHOGANY_PLANKS, BOPBlockSetTypes.MAHOGANY));
    public static DeferredBlock<TrapDoorBlock> SECRET_JACARANDA_PLANK_TRAPDOOR = registerPlankTrapdoorBlock(BOPWoodType.JACARANDA, () -> trapDoorBlock(BOPBlocks.JACARANDA_PLANKS, BOPBlockSetTypes.JACARANDA));
    public static DeferredBlock<TrapDoorBlock> SECRET_PALM_PLANK_TRAPDOOR = registerPlankTrapdoorBlock(BOPWoodType.PALM, () -> trapDoorBlock(BOPBlocks.PALM_PLANKS, BOPBlockSetTypes.PALM));
    public static DeferredBlock<TrapDoorBlock> SECRET_WILLOW_PLANK_TRAPDOOR = registerPlankTrapdoorBlock(BOPWoodType.WILLOW, () -> trapDoorBlock(BOPBlocks.WILLOW_PLANKS, BOPBlockSetTypes.WILLOW));
    public static DeferredBlock<TrapDoorBlock> SECRET_DEAD_PLANK_TRAPDOOR = registerPlankTrapdoorBlock(BOPWoodType.DEAD, () -> trapDoorBlock(BOPBlocks.DEAD_PLANKS, BOPBlockSetTypes.DEAD));
    public static DeferredBlock<TrapDoorBlock> SECRET_MAGIC_PLANK_TRAPDOOR = registerPlankTrapdoorBlock(BOPWoodType.MAGIC, () -> trapDoorBlock(BOPBlocks.MAGIC_PLANKS, BOPBlockSetTypes.MAGIC));
    public static DeferredBlock<TrapDoorBlock> SECRET_UMBRAN_PLANK_TRAPDOOR = registerPlankTrapdoorBlock(BOPWoodType.UMBRAN, () -> trapDoorBlock(BOPBlocks.UMBRAN_PLANKS, BOPBlockSetTypes.UMBRAN));
    public static DeferredBlock<TrapDoorBlock> SECRET_HELLBARK_PLANK_TRAPDOOR = registerPlankTrapdoorBlock(BOPWoodType.HELLBARK, () -> trapDoorBlock(BOPBlocks.HELLBARK_PLANKS, BOPBlockSetTypes.HELLBARK));
    public static DeferredBlock<TrapDoorBlock> SECRET_EMPYREAL_PLANK_TRAPDOOR = registerPlankTrapdoorBlock(BOPWoodType.EMPYREAL, () -> trapDoorBlock(BOPBlocks.EMPYREAL_PLANKS, BOPBlockSetTypes.EMPYREAL));
    public static DeferredBlock<TrapDoorBlock> SECRET_MAPLE_PLANK_TRAPDOOR = registerPlankTrapdoorBlock(BOPWoodType.MAPLE, () -> trapDoorBlock(BOPBlocks.MAPLE_PLANKS, BOPBlockSetTypes.MAPLE));
    public static DeferredBlock<TrapDoorBlock> SECRET_PINE_PLANK_TRAPDOOR = registerPlankTrapdoorBlock(BOPWoodType.PINE, () -> trapDoorBlock(BOPBlocks.PINE_PLANKS, BOPBlockSetTypes.PINE));

    public static DeferredBlock<TrapDoorBlock> SECRET_FIR_LOG_TRAPDOOR = registerLogTrapdoorBlock(BOPWoodType.FIR, () -> trapDoorBlock(BOPBlocks.FIR_LOG, BOPBlockSetTypes.FIR));
    public static DeferredBlock<TrapDoorBlock> SECRET_REDWOOD_LOG_TRAPDOOR = registerLogTrapdoorBlock(BOPWoodType.REDWOOD, () -> trapDoorBlock(BOPBlocks.REDWOOD_LOG, BOPBlockSetTypes.REDWOOD));
    public static DeferredBlock<TrapDoorBlock> SECRET_MAHOGANY_LOG_TRAPDOOR = registerLogTrapdoorBlock(BOPWoodType.MAHOGANY, () -> trapDoorBlock(BOPBlocks.MAHOGANY_LOG, BOPBlockSetTypes.MAHOGANY));
    public static DeferredBlock<TrapDoorBlock> SECRET_JACARANDA_LOG_TRAPDOOR = registerLogTrapdoorBlock(BOPWoodType.JACARANDA, () -> trapDoorBlock(BOPBlocks.JACARANDA_LOG, BOPBlockSetTypes.JACARANDA));
    public static DeferredBlock<TrapDoorBlock> SECRET_PALM_LOG_TRAPDOOR = registerLogTrapdoorBlock(BOPWoodType.PALM, () -> trapDoorBlock(BOPBlocks.PALM_LOG, BOPBlockSetTypes.PALM));
    public static DeferredBlock<TrapDoorBlock> SECRET_WILLOW_LOG_TRAPDOOR = registerLogTrapdoorBlock(BOPWoodType.WILLOW, () -> trapDoorBlock(BOPBlocks.WILLOW_LOG, BOPBlockSetTypes.WILLOW));
    public static DeferredBlock<TrapDoorBlock> SECRET_DEAD_LOG_TRAPDOOR = registerLogTrapdoorBlock(BOPWoodType.DEAD, () -> trapDoorBlock(BOPBlocks.DEAD_LOG, BOPBlockSetTypes.DEAD));
    public static DeferredBlock<TrapDoorBlock> SECRET_MAGIC_LOG_TRAPDOOR = registerLogTrapdoorBlock(BOPWoodType.MAGIC, () -> trapDoorBlock(BOPBlocks.MAGIC_LOG, BOPBlockSetTypes.MAGIC));
    public static DeferredBlock<TrapDoorBlock> SECRET_UMBRAN_LOG_TRAPDOOR = registerLogTrapdoorBlock(BOPWoodType.UMBRAN, () -> trapDoorBlock(BOPBlocks.UMBRAN_LOG, BOPBlockSetTypes.UMBRAN));
    public static DeferredBlock<TrapDoorBlock> SECRET_HELLBARK_LOG_TRAPDOOR = registerLogTrapdoorBlock(BOPWoodType.HELLBARK, () -> trapDoorBlock(BOPBlocks.HELLBARK_LOG, BOPBlockSetTypes.HELLBARK));
    public static DeferredBlock<TrapDoorBlock> SECRET_EMPYREAL_LOG_TRAPDOOR = registerLogTrapdoorBlock(BOPWoodType.EMPYREAL, () -> trapDoorBlock(BOPBlocks.EMPYREAL_LOG, BOPBlockSetTypes.EMPYREAL));
    public static DeferredBlock<TrapDoorBlock> SECRET_MAPLE_LOG_TRAPDOOR = registerLogTrapdoorBlock(BOPWoodType.MAPLE, () -> trapDoorBlock(BOPBlocks.MAPLE_LOG, BOPBlockSetTypes.MAPLE));
    public static DeferredBlock<TrapDoorBlock> SECRET_PINE_LOG_TRAPDOOR = registerLogTrapdoorBlock(BOPWoodType.PINE, () -> trapDoorBlock(BOPBlocks.PINE_LOG, BOPBlockSetTypes.PINE));

    public static DeferredBlock<TrapDoorBlock> SECRET_STRIPPED_FIR_LOG_TRAPDOOR = registerStrippedLogTrapdoorBlock(BOPWoodType.FIR, () -> trapDoorBlock(BOPBlocks.STRIPPED_FIR_LOG, BOPBlockSetTypes.FIR));
    public static DeferredBlock<TrapDoorBlock> SECRET_STRIPPED_REDWOOD_LOG_TRAPDOOR = registerStrippedLogTrapdoorBlock(BOPWoodType.REDWOOD, () -> trapDoorBlock(BOPBlocks.STRIPPED_REDWOOD_LOG, BOPBlockSetTypes.REDWOOD));
    public static DeferredBlock<TrapDoorBlock> SECRET_STRIPPED_MAHOGANY_LOG_TRAPDOOR = registerStrippedLogTrapdoorBlock(BOPWoodType.MAHOGANY, () -> trapDoorBlock(BOPBlocks.STRIPPED_MAHOGANY_LOG, BOPBlockSetTypes.MAHOGANY));
    public static DeferredBlock<TrapDoorBlock> SECRET_STRIPPED_JACARANDA_LOG_TRAPDOOR = registerStrippedLogTrapdoorBlock(BOPWoodType.JACARANDA, () -> trapDoorBlock(BOPBlocks.STRIPPED_JACARANDA_LOG, BOPBlockSetTypes.JACARANDA));
    public static DeferredBlock<TrapDoorBlock> SECRET_STRIPPED_PALM_LOG_TRAPDOOR = registerStrippedLogTrapdoorBlock(BOPWoodType.PALM, () -> trapDoorBlock(BOPBlocks.STRIPPED_PALM_LOG, BOPBlockSetTypes.PALM));
    public static DeferredBlock<TrapDoorBlock> SECRET_STRIPPED_WILLOW_LOG_TRAPDOOR = registerStrippedLogTrapdoorBlock(BOPWoodType.WILLOW, () -> trapDoorBlock(BOPBlocks.STRIPPED_WILLOW_LOG, BOPBlockSetTypes.WILLOW));
    public static DeferredBlock<TrapDoorBlock> SECRET_STRIPPED_DEAD_LOG_TRAPDOOR = registerStrippedLogTrapdoorBlock(BOPWoodType.DEAD, () -> trapDoorBlock(BOPBlocks.STRIPPED_DEAD_LOG, BOPBlockSetTypes.DEAD));
    public static DeferredBlock<TrapDoorBlock> SECRET_STRIPPED_MAGIC_LOG_TRAPDOOR = registerStrippedLogTrapdoorBlock(BOPWoodType.MAGIC, () -> trapDoorBlock(BOPBlocks.STRIPPED_MAGIC_LOG, BOPBlockSetTypes.MAGIC));
    public static DeferredBlock<TrapDoorBlock> SECRET_STRIPPED_UMBRAN_LOG_TRAPDOOR = registerStrippedLogTrapdoorBlock(BOPWoodType.UMBRAN, () -> trapDoorBlock(BOPBlocks.STRIPPED_UMBRAN_LOG, BOPBlockSetTypes.UMBRAN));
    public static DeferredBlock<TrapDoorBlock> SECRET_STRIPPED_HELLBARK_LOG_TRAPDOOR = registerStrippedLogTrapdoorBlock(BOPWoodType.HELLBARK, () -> trapDoorBlock(BOPBlocks.STRIPPED_HELLBARK_LOG, BOPBlockSetTypes.HELLBARK));
    public static DeferredBlock<TrapDoorBlock> SECRET_STRIPPED_EMPYREAL_LOG_TRAPDOOR = registerStrippedLogTrapdoorBlock(BOPWoodType.EMPYREAL, () -> trapDoorBlock(BOPBlocks.STRIPPED_EMPYREAL_LOG, BOPBlockSetTypes.EMPYREAL));
    public static DeferredBlock<TrapDoorBlock> SECRET_STRIPPED_MAPLE_LOG_TRAPDOOR = registerStrippedLogTrapdoorBlock(BOPWoodType.MAPLE, () -> trapDoorBlock(BOPBlocks.STRIPPED_MAPLE_LOG, BOPBlockSetTypes.MAPLE));
    public static DeferredBlock<TrapDoorBlock> SECRET_STRIPPED_PINE_LOG_TRAPDOOR = registerStrippedLogTrapdoorBlock(BOPWoodType.PINE, () -> trapDoorBlock(BOPBlocks.STRIPPED_PINE_LOG, BOPBlockSetTypes.PINE));

    public static DeferredBlock<TrapDoorBlock> SECRET_WHITE_SANDSTONE_TRAPDOOR = registerSandstoneTrapdoorBlock("white", "White", () -> trapDoorBlock(BOPBlocks.WHITE_SANDSTONE, BlockSetType.STONE));
    public static DeferredBlock<TrapDoorBlock> SECRET_CUT_WHITE_SANDSTONE_TRAPDOOR = registerSandstoneTrapdoorBlock("cut_white", "Cut White", () -> trapDoorBlock(BOPBlocks.CUT_WHITE_SANDSTONE, BlockSetType.STONE));
    public static DeferredBlock<TrapDoorBlock> SECRET_SMOOTH_WHITE_SANDSTONE_TRAPDOOR = registerSandstoneTrapdoorBlock("smooth_white", "Smooth White", () -> trapDoorBlock(BOPBlocks.SMOOTH_WHITE_SANDSTONE, BlockSetType.STONE));
    public static DeferredBlock<TrapDoorBlock> SECRET_ORANGE_SANDSTONE_TRAPDOOR = registerSandstoneTrapdoorBlock("orange", "Orange", () -> trapDoorBlock(BOPBlocks.ORANGE_SANDSTONE, BlockSetType.STONE));
    public static DeferredBlock<TrapDoorBlock> SECRET_CUT_ORANGE_SANDSTONE_TRAPDOOR = registerSandstoneTrapdoorBlock("cut_orange", "Cut Orange", () -> trapDoorBlock(BOPBlocks.CUT_ORANGE_SANDSTONE, BlockSetType.STONE));
    public static DeferredBlock<TrapDoorBlock> SECRET_SMOOTH_ORANGE_SANDSTONE_TRAPDOOR = registerSandstoneTrapdoorBlock("smooth_orange", "Smooth Orange", () -> trapDoorBlock(BOPBlocks.SMOOTH_ORANGE_SANDSTONE, BlockSetType.STONE));
    public static DeferredBlock<TrapDoorBlock> SECRET_BLACK_SANDSTONE_TRAPDOOR = registerSandstoneTrapdoorBlock("black", "Black", () -> trapDoorBlock(BOPBlocks.BLACK_SANDSTONE, BlockSetType.STONE));
    public static DeferredBlock<TrapDoorBlock> SECRET_CUT_BLACK_SANDSTONE_TRAPDOOR = registerSandstoneTrapdoorBlock("cut_black", "Cut Black", () -> trapDoorBlock(BOPBlocks.CUT_BLACK_SANDSTONE, BlockSetType.STONE));
    public static DeferredBlock<TrapDoorBlock> SECRET_SMOOTH_BLACK_SANDSTONE_TRAPDOOR = registerSandstoneTrapdoorBlock("smooth_black", "Smooth Black", () -> trapDoorBlock(BOPBlocks.SMOOTH_BLACK_SANDSTONE, BlockSetType.STONE));

    public static DoorBlock doorBlock (Block blockToCopy, BlockSetType type) {
        return new DoorBlock(type, BlockBehaviour.Properties.of().mapColor(blockToCopy.defaultMapColor()).instrument(blockToCopy.defaultBlockState().instrument()).strength(3.0F).noOcclusion().ignitedByLava().pushReaction(PushReaction.DESTROY));
    }

    public static TrapDoorBlock trapDoorBlock (Block blockToCopy, BlockSetType type) {
        return new TrapDoorBlock(type, BlockBehaviour.Properties.of().mapColor(blockToCopy.defaultMapColor()).instrument(blockToCopy.defaultBlockState().instrument()).strength(3.0F).noOcclusion().isValidSpawn(SBDBlocks::never).ignitedByLava());
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

    private static <T extends DoorBlock> DeferredBlock<T> registerDoorBlockBase(String nameIn, String localizationIn, Supplier<T> blockIn) {
        DeferredBlock<T> block = BLOCKS.register(nameIn, blockIn);
        ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
        BLOCK_LANG_EN_US.put(block, localizationIn);
        DOOR_LOOT_TABLE.add(block);
        BUILDING_BLOCKS_CREATIVE_TAB.add(block);
        return block;
    }

    public static <T extends DoorBlock> DeferredBlock<T> registerDoorBlock(String doorNameIn, String doorLocalizationIn, Supplier<T> blockIn) {
        return registerDoorBlockBase("secret_" + doorNameIn + "_door", "Secret " + doorLocalizationIn + " Door", blockIn);
    }

    public static <T extends DoorBlock> DeferredBlock<T> registerPlankDoorBlock(BOPWoodType wood, Supplier<T> blockIn) {
        return registerDoorBlock(wood.name + "_plank", wood.localization + " Plank", blockIn);
    }

    public static <T extends DoorBlock> DeferredBlock<T> registerLogDoorBlock(BOPWoodType wood, Supplier<T> blockIn) {
        return registerDoorBlock(wood.name + "_log", wood.localization + " Log", blockIn);
    }

    public static <T extends DoorBlock> DeferredBlock<T> registerStrippedLogDoorBlock(BOPWoodType wood, Supplier<T> blockIn) {
        return registerDoorBlock("stripped_" + wood.name + "_log", "Stripped " + wood.localization + " Log", blockIn);
    }

    public static <T extends DoorBlock> DeferredBlock<T> registerStrippedHorizontalLogDoorBlock(BOPWoodType wood, Supplier<T> blockIn) {
        return registerDoorBlock("stripped_horizontal_" + wood.name + "_log", "Stripped Horizontal " + wood.localization + " Log", blockIn);
    }

    public static <T extends DoorBlock> DeferredBlock<T> registerHorizontalLogDoorBlock(BOPWoodType wood, Supplier<T> blockIn) {
        return registerDoorBlock("horizontal_" + wood.name + "_log", "Horizontal " + wood.localization + " Log", blockIn);
    }

    public static <T extends DoorBlock> DeferredBlock<T> registerSandstoneDoorBlock(String name, String localization, Supplier<T> blockIn) {
        return registerDoorBlock(name + "_sandstone", localization + " Sandstone", blockIn);
    }

    private static <T extends Block> DeferredBlock<T> registerTrapdoorBlockBase(String nameIn, String localizationIn, Supplier<T> blockIn) {
        DeferredBlock<T> block = BLOCKS.register(nameIn, blockIn);
        ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
        BLOCK_LANG_EN_US.put(block, localizationIn);
        TRAPDOOR_LOOT_TABLE.add(block);
        BUILDING_BLOCKS_CREATIVE_TAB.add(block);
        return block;
    }

    public static <T extends TrapDoorBlock> DeferredBlock<T> registerTrapdoorBlock(String doorNameIn, String doorLocalizationIn, Supplier<T> blockIn) {
        return registerTrapdoorBlockBase("secret_" + doorNameIn + "_trapdoor", "Secret " + doorLocalizationIn + " Trapdoor", blockIn);
    }

    public static <T extends TrapDoorBlock> DeferredBlock<T> registerPlankTrapdoorBlock(BOPWoodType wood, Supplier<T> blockIn) {
        return registerTrapdoorBlock(wood.name + "_plank", wood.localization + " Plank", blockIn);
    }

    public static <T extends TrapDoorBlock> DeferredBlock<T> registerLogTrapdoorBlock(BOPWoodType wood, Supplier<T> blockIn) {
        return registerTrapdoorBlock(wood.name + "_log", wood.localization + " Log", blockIn);
    }

    public static <T extends TrapDoorBlock> DeferredBlock<T> registerStrippedLogTrapdoorBlock(BOPWoodType wood, Supplier<T> blockIn) {
        return registerTrapdoorBlock("stripped_" + wood.name + "_log", "Stripped " + wood.localization + " Log", blockIn);
    }

    public static <T extends TrapDoorBlock> DeferredBlock<T> registerSandstoneTrapdoorBlock(String name, String localization, Supplier<T> blockIn) {
        return registerTrapdoorBlock(name + "_sandstone", localization + " Sandstone", blockIn);
    }
}
package de.lordhahaha.timberframemod.block;

import de.lordhahaha.timberframemod.Timberframemod;
import de.lordhahaha.timberframemod.block.custom.RotationalBlock;
import de.lordhahaha.timberframemod.item.ModCreativeModeTab;
import de.lordhahaha.timberframemod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Timberframemod.MOD_ID);

    // Define Material with values
    private static final BlockBehaviour.Properties TimberframeMaterial = BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD);
    // Register all new blocks
    public static final RegistryObject<Block> PLASTER_BLOCK = registerBlock("plaster_block", () -> new RotationalBlock(TimberframeMaterial) {}, ModCreativeModeTab.TIMBERFRAME_TAB);
    public static final RegistryObject<Block> BASIC_BLOCK = registerBlock("basic_block", () -> new RotationalBlock(TimberframeMaterial) {}, ModCreativeModeTab.TIMBERFRAME_TAB);
    public static final RegistryObject<Block> DOWN_BLOCK = registerBlock("down_block", () -> new RotationalBlock(TimberframeMaterial) {}, ModCreativeModeTab.TIMBERFRAME_TAB);
    public static final RegistryObject<Block> UP_BLOCK = registerBlock("up_block", () -> new RotationalBlock(TimberframeMaterial) {}, ModCreativeModeTab.TIMBERFRAME_TAB);
    public static final RegistryObject<Block> CROSS_BLOCK = registerBlock("cross_block", () -> new RotationalBlock(TimberframeMaterial) {}, ModCreativeModeTab.TIMBERFRAME_TAB);
    public static final RegistryObject<Block> SMALL_STRAIGHT_CROSS_BLOCK = registerBlock("smallstraightcross_block", () -> new RotationalBlock(TimberframeMaterial) {}, ModCreativeModeTab.TIMBERFRAME_TAB);
    public static final RegistryObject<Block> SMALL_CURVED_CROSS_BLOCK = registerBlock("smallcurvedcross_block", () -> new RotationalBlock(TimberframeMaterial) {}, ModCreativeModeTab.TIMBERFRAME_TAB);
    public static final RegistryObject<Block> RING_CROSS_BLOCK = registerBlock("ringcross_block", () -> new RotationalBlock(TimberframeMaterial) {}, ModCreativeModeTab.TIMBERFRAME_TAB);
    public static final RegistryObject<Block> SINGLE_STRAIGHT_BLOCK = registerBlock("singlestraight_block", () -> new RotationalBlock(TimberframeMaterial) {}, ModCreativeModeTab.TIMBERFRAME_TAB);
    public static final RegistryObject<Block> DOUBLE_STRAIGHT_BLOCK = registerBlock("doublestraight_block", () -> new RotationalBlock(TimberframeMaterial) {}, ModCreativeModeTab.TIMBERFRAME_TAB);
    public static final RegistryObject<Block> UP_LEFT_BLOCK = registerBlock("upl_block", () -> new RotationalBlock(TimberframeMaterial) {}, ModCreativeModeTab.TIMBERFRAME_TAB);
    public static final RegistryObject<Block> UP_RIGHT_BLOCK = registerBlock("upr_block", () -> new RotationalBlock(TimberframeMaterial) {}, ModCreativeModeTab.TIMBERFRAME_TAB);
    public static final RegistryObject<Block> DOWN_LEFT_BLOCK = registerBlock("downl_block", () -> new RotationalBlock(TimberframeMaterial) {}, ModCreativeModeTab.TIMBERFRAME_TAB);
    public static final RegistryObject<Block> DOWN_RIGHT_BLOCK = registerBlock("downr_block", () -> new RotationalBlock(TimberframeMaterial) {}, ModCreativeModeTab.TIMBERFRAME_TAB);
    public static final RegistryObject<Block> EDGE_BLOCK = registerBlock("edge_block", () -> new RotationalBlock(TimberframeMaterial) {}, ModCreativeModeTab.TIMBERFRAME_TAB);
    public static final RegistryObject<Block> CEILING_EDGE_BLOCK = registerBlock("ceiling_edge_block", () -> new RotationalBlock(TimberframeMaterial) {}, ModCreativeModeTab.TIMBERFRAME_TAB);
    public static final RegistryObject<Block> CEILING_BLOCK = registerBlock("ceiling_block", () -> new RotationalBlock(TimberframeMaterial) {}, ModCreativeModeTab.TIMBERFRAME_TAB);
    public static final RegistryObject<Block> HEXA_BLOCK = registerBlock("hexa_block", () -> new RotationalBlock(TimberframeMaterial) {}, ModCreativeModeTab.TIMBERFRAME_TAB);
    public static final RegistryObject<Block> MAN_LEFT_BLOCK = registerBlock("manleft_block", () -> new RotationalBlock(TimberframeMaterial) {}, ModCreativeModeTab.TIMBERFRAME_TAB);
    public static final RegistryObject<Block> MAN_RIGHT_BLOCK = registerBlock("manright_block", () -> new RotationalBlock(TimberframeMaterial) {}, ModCreativeModeTab.TIMBERFRAME_TAB);
    public static final RegistryObject<Block> PEDIMENT_LEFT_BLOCK = registerBlock("pedimentleft_block", () -> new RotationalBlock(TimberframeMaterial) {}, ModCreativeModeTab.TIMBERFRAME_TAB);
    public static final RegistryObject<Block> PEDIMENT_RIGHT_BLOCK = registerBlock("pedimentright_block", () -> new RotationalBlock(TimberframeMaterial) {}, ModCreativeModeTab.TIMBERFRAME_TAB);
    public static final RegistryObject<Block> SHUTTER_LEFT_BLOCK = registerBlock("shutterleft_block", () -> new RotationalBlock(TimberframeMaterial) {}, ModCreativeModeTab.TIMBERFRAME_TAB);
    public static final RegistryObject<Block> SHUTTER_RIGHT_BLOCK = registerBlock("shutterright_block", () -> new RotationalBlock(TimberframeMaterial) {}, ModCreativeModeTab.TIMBERFRAME_TAB);

    // --- Helper-functions ---
    // Register a new Block with Blockitem
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    // Create and Register the Blockitem for a given Block
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);

    }
}

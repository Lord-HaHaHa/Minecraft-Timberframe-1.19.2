package de.lordhahaha.fachwerkmod.block;

import de.lordhahaha.fachwerkmod.Fachwerkmod;
import de.lordhahaha.fachwerkmod.item.ModCreativeModeTab;
import de.lordhahaha.fachwerkmod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Fachwerkmod.MOD_ID);

    // Register all new blocks
    public static final RegistryObject<Block> BASIC_BLOCK = registerBlock("basic_block",
            () -> new BasicBlock(BlockBehaviour.Properties.of(Material.STONE)) {
            }, ModCreativeModeTab.FACHWERK_TAB);
    public static final RegistryObject<Block> CROSS_BLOCK = registerBlock("cross_block",
            () -> new BasicBlock(BlockBehaviour.Properties.of(Material.STONE)) {
            }, ModCreativeModeTab.FACHWERK_TAB);
    public static final RegistryObject<Block> DOUBLESSTRAIGHT_BLOCK = registerBlock("doublesstraight_block",
            () -> new BasicBlock(BlockBehaviour.Properties.of(Material.STONE)) {
            }, ModCreativeModeTab.FACHWERK_TAB);
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

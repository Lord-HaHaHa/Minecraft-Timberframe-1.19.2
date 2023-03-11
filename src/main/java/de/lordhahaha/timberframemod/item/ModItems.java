package de.lordhahaha.timberframemod.item;

import de.lordhahaha.timberframemod.Timberframemod;
import de.lordhahaha.timberframemod.tab.ModCreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Timberframemod.MOD_ID);

    // Register all items of the Mod
    public static final RegistryObject<Item> WATTLE_DAUB = ITEMS.register("wattle_daub", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TIMBERFRAME_TAB)));

    // Frames
    public static final RegistryObject<Item> FRAME = ITEMS.register("frame", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TIMBERFRAME_TAB)));
    public static final RegistryObject<Item> CROSS_FRAME = ITEMS.register("frame_cross", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TIMBERFRAME_TAB)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}

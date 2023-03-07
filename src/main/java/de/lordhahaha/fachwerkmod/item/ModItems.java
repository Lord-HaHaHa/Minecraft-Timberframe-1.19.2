package de.lordhahaha.fachwerkmod.item;

import de.lordhahaha.fachwerkmod.Fachwerkmod;
import net.minecraft.client.tutorial.Tutorial;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Fachwerkmod.MOD_ID);

    // Register all items of the Mod
    public static final RegistryObject<Item> WATTLE_DAUB = ITEMS.register("wattle_daub",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FACHWERK_TAB)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}

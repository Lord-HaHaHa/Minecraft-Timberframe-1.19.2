package de.lordhahaha.fachwerkmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab FACHWERK_TAB = new CreativeModeTab("fachwerktab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.WATTLE_DAUB.get());
        }
    };
}

package de.lordhahaha.timberframemod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab TIMBERFRAME_TAB = new CreativeModeTab("timberframetab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.WATTLE_DAUB.get());
        }
    };
}

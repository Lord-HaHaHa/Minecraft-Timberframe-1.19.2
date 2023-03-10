package de.lordhahaha.timberframemod.events;

import de.lordhahaha.timberframemod.Timberframemod;
import de.lordhahaha.timberframemod.foundation.ModFilePackResources;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.repository.Pack;
import net.minecraft.server.packs.repository.PackSource;
import net.minecraftforge.event.AddPackFindersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forgespi.language.IModFileInfo;
import net.minecraftforge.forgespi.locating.IModFile;

@Mod.EventBusSubscriber(modid = Timberframemod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CommonEvents {

    // Add High Quality Texturpack to the Mod
    // Taken form the Create Mod
    @SubscribeEvent
    public static void addPackFinders(AddPackFindersEvent event){
        if(event.getPackType() == PackType.CLIENT_RESOURCES){
            IModFileInfo modFileInfo = ModList.get().getModFileById(Timberframemod.MOD_ID);
            if (modFileInfo == null){
                return;
            }
            IModFile modFile = modFileInfo.getFile();
            event.addRepositorySource((consumer, constructor) -> {
                consumer.accept(Pack.create(Timberframemod.asResource("timberframe_high").toString(), false, () -> new ModFilePackResources("Timberframe High", modFile, "resourcepacks/timberframe_high"), constructor, Pack.Position.TOP, PackSource.DEFAULT));
            });
        }
    }
}

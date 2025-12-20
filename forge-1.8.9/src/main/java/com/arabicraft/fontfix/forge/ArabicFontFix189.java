package com.arabicraft.fontfix.forge;

import com.arabicraft.fontfix.core.ArabicReshaper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = "arabicfontfix", name = "Arabic Font Fix", version = "1.0", acceptedMinecraftVersions = "[1.8.9]")
public class ArabicFontFix189 {

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println("Arabic Font Fix for 1.8.9 is initializing...");
    }
}

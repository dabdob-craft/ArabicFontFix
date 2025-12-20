package com.arabicraft.fontfix.forge;

import com.arabicraft.fontfix.core.ArabicReshaper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent;

@Mod("arabicfontfix")
public class ArabicFontFix1165 {
    public ArabicFontFix1165() {
        System.out.println("Arabic Font Fix for 1.16.5 Forge is Loading...");
        MinecraftForge.EVENT_BUS.register(this);
    }
}

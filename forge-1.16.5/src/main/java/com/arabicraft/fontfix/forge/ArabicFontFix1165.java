package com.arabicraft.fontfix.forge;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.common.MinecraftForge;

@Mod("arabicfontfix")
public class ArabicFontFix1165 {
    public ArabicFontFix1165() {
        MinecraftForge.EVENT_BUS.register(this);
    }
}

package com.arabicraft.fontfix;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FabricFontFixClient implements ClientModInitializer {
    
    public static final String MOD_ID = "arabicfontfix";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitializeClient() {
        LOGGER.info("Arabic Font Fix Mod Initializing... By Arabicraft Team!");
    }
}

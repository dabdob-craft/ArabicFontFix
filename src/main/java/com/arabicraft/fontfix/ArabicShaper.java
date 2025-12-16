package com.arabicraft.fontfix;

import io.github.harf.harfbuzz.HarfBuzz;
import io.github.harf.harfbuzz.HBBuffer;
import io.github.harf.harfbuzz.HBScript;

public class ArabicShaper {

    static {
        try {
            HarfBuzz.initialize();
        } catch (Exception e) {
            System.err.println("Failed to initialize HarfBuzz: " + e.getMessage());
        }
    }

    public static String fixText(String original) {
        if (original == null || original.isEmpty()) {
            return original;
        }

        try {
            HBBuffer buffer = new HBBuffer();
            
            buffer.addString(original);
            
            buffer.setDirection(HBBuffer.HBDirection.RTL);
            buffer.setScript(HBScript.Arabic);
            
            HarfBuzz.shape(buffer);

            return buffer.toString(); 

        } catch (Exception e) {
            System.err.println("HarfBuzz Text Fix Error: " + e.getMessage());
            return original;
        }
    }
}

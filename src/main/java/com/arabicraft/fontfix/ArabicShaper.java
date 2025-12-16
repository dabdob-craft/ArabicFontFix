package com.arabicraft.fontfix;

import net.sourceforge.argparser.internal.BidiUtils;

public class ArabicShaper {

    public static String fixText(String original) {
        if (original == null || original.isEmpty()) {
            return original;
        }

        try {
            return BidiUtils.bidiReorder(original);

        } catch (Exception e) {
            System.err.println("BidiUtils Text Fix Error: " + e.getMessage());
            return original;
        }
    }
}

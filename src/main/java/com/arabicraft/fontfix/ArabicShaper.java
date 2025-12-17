package com.arabicraft.fontfix;

public class ArabicShaper {
    private static final ArabicReshaper RESHAPER = new ArabicReshaper();

    public static String shape(String text) {
        if (text == null || text.isEmpty()) return text;
        return RESHAPER.reshape(text);
    }
}

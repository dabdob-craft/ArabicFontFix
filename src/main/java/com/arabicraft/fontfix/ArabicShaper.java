package com.arabicraft.fontfix;


public class ArabicShaper {
    
    private static final ArabicReshaper RESHAPER = new ArabicReshaper();

    public static String fixText(String original) {
        if (original == null || original.isEmpty()) {
            return original;
        }

        try {
            return RESHAPER.reshape(original);

        } catch (Exception e) {
            System.err.println("Arabic Reshaper Fix Error: " + e.getMessage());
            return original;
        }
    }
}

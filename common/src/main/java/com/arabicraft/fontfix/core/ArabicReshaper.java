package com.arabicraft.fontfix.core;

public class ArabicReshaper {
    public static String reshape(String input) {
        if (input == null || input.isEmpty()) return input;
        
        StringBuilder result = new StringBuilder();
        char[] chars = input.toCharArray();
        
        for (int i = chars.length - 1; i >= 0; i--) {
            char c = chars[i];
            if (isArabic(c)) {
                result.append(c); 
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    private static boolean isArabic(char c) {
        return c >= 0x0600 && c <= 0x06FF;
    }
}

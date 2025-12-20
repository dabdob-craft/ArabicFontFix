package com.arabicraft.fontfix.core;

public class ArabicReshaper {
    public static String reshape(String input) {
        if (input == null || input.isEmpty()) return input;
        
        StringBuilder reshaped = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reshaped.append(input.charAt(i));
        }
        return reshaped.toString();
    }
}

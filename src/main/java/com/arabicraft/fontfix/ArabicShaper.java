package com.arabicraft.fontfix;

import com.github.nyangkhmer.text.ArabicShaping;
import com.github.nyangkhmer.text.Bidi;

public class ArabicShaper {

    public static String fixText(String original) {
        if (original == null || original.isEmpty()) {
            return original;
        }

        try {
            String shaped = ArabicShaping.shapeText(original, true, true);
            
            Bidi bidi = new Bidi(shaped, Bidi.RTL, 0);
            return bidi.writeReordered();

        } catch (Exception e) {
            System.err.println("KhmerUtils Text Fix Error: " + e.getMessage());
            return original;
        }
    }
}

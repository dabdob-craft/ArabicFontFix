package com.arabicraft.fontfix;

import com.ibm.icu.text.Bidi;
import com.ibm.icu.text.ArabicShaping;
import com.ibm.icu.text.ArabicShapingException;

public class ArabicShaper {
    private static final int SHAPING_OPTIONS = 2;

    public static String fixText(String original) {
        if (original == null || original.isEmpty()) {
            return original;
        }

        try {
            ArabicShaping shaper = new ArabicShaping(SHAPING_OPTIONS);
            String shaped = shaper.shape(original);
            
            Bidi bidi = new Bidi();
            bidi.setPara(shaped, Bidi.RTL, null);
            return bidi.writeReordered(Bidi.DO_MIRRORING);

        } catch (ArabicShapingException e) {
            System.err.println("Arabic Shaping Error: " + e.getMessage());
            return original;
        } catch (Exception e) {
             System.err.println("General Text Fix Error: " + e.getMessage());
             return original;
        }
    }
}

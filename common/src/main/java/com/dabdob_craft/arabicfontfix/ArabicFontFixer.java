package com.dabdob_craft.arabicfontfix;

import com.ibm.icu.text.Bidi;
import com.ibm.icu.text.ArabicShaping;
import com.ibm.icu.text.ArabicShapingException;

public class ArabicFontFixer {

    private static final int SHAPING_FLAGS = 
        ArabicShaping.SHAPE_MODE_LENGTH_FIXED 
        | ArabicShaping.SHAPE_TAIL_ALIGNED 
        | ArabicShaping.LETTERS_SHAPE;      

    public static String fixText(String originalText, boolean isRightToLeft) {
        if (originalText == null || originalText.isEmpty()) {
            return originalText;
        }

        String shapedText;
        try {
            shapedText = new ArabicShaping(SHAPING_FLAGS).shape(originalText);
        } catch (ArabicShapingException e) {
            System.err.println("Failed to perform Arabic shaping: " + e.getMessage());
            return originalText;
        }

        Bidi bidi = new Bidi();
        bidi.setText(shapedText);
        
        bidi.setParaLevel(isRightToLeft ? Bidi.RTL : Bidi.LTR); 
        
        try {
            return bidi.writeReordered(Bidi.WRITE_RTL_ENTRIES_FOR_TEXT_LEVEL);
        } catch (Exception e) {
            System.err.println("Failed to perform Bi-Directional reordering: " + e.getMessage());
            return shapedText;
        }
    }
}

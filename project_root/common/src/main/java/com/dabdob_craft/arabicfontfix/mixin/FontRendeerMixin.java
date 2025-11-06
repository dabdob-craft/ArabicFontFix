package com.dabdob_craft.arabicfontfix.mixin;

import com.dabdob_craft.arabicfontfix.ArabicFontFixer;
import net.minecraft.client.font.TextRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(TextRenderer.class)
public class FontRendererMixin {

    @ModifyVariable(
        method = "drawInternal(Ljava/lang/String;FFIZLorg/joml/Matrix4f;Lnet/minecraft/client/render/RenderLayer;ZIZ)F",
        at = @At("HEAD"), 
        argsOnly = true, 
        index = 1
    )
    private String injectArabicFix(String text) {
        return ArabicFontFixer.fixText(text, true); 
    }
  }

package com.arabicraft.fontfix.mixin;

import com.arabicraft.fontfix.ArabicShaper;
import net.minecraft.client.font.TextRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(TextRenderer.class)
public abstract class TextRendererMixin {

    @ModifyVariable(
        method = "drawInternal(Ljava/lang/String;FFIZLorg/joml/Matrix4f;Z)F", 
        at = @At(value = "HEAD"),
        argsOnly = true,
        ordinal = 0 
    )
    private String arabicfontfix_modifyTextBeforeDrawing(String text) {
        return ArabicShaper.fixText(text);
    }
}

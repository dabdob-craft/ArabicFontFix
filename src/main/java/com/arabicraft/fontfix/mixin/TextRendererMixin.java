package com.arabicraft.fontfix.mixin;

import com.arabicraft.fontfix.ArabicReshaper;
import net.minecraft.client.font.TextRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(TextRenderer.class)
public class TextRendererMixin {
    @ModifyVariable(method = "draw(Ljava/lang/String;FFIZLnet/minecraft/util/math/Matrix4f;Lnet/minecraft/client/render/VertexConsumerProvider;ZII)I", at = @At("HEAD"), argsOnly = true)
    private String onDraw(String text) {
        return ArabicReshaper.reshape(text);
    }
}

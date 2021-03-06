package com.rettichlp.UnicacityAddon.mixin;

import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Minecraft.class)
public class UnicacityAddonMixin {

    @Inject(method = "runTick", at = @At("HEAD"))
    private void injectRunTick(CallbackInfo ci) {}
}

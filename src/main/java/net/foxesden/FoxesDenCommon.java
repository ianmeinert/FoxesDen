package net.foxesden;

import net.fabricmc.api.ModInitializer;
import net.foxesden.registry.FoxesDenItems;
import net.minecraft.util.Identifier;

public class FoxesDenCommon implements ModInitializer {
    public static final String MOD_ID = "foxesden";

    public static Identifier identifier(String name) {
        return new Identifier(MOD_ID, name);
    }

    @Override
    public void onInitialize() {
        FoxesDenItems.initialize();
    }
}

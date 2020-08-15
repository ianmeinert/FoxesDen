package net.foxesden.registry;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.foxesden.FoxesDenCommon;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class FoxesDenItemGroups {
    public static final ItemGroup FOXESDEN = FabricItemGroupBuilder.build(FoxesDenCommon.identifier("shit"), () -> new ItemStack(FoxesDenItems.ITEM));

    public static void initialize() {
        // Unused.
    }
}

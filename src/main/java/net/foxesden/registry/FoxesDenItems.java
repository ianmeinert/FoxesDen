package net.foxesden.registry;

import net.foxesden.FoxesDenCommon;
import net.foxesden.common.item.FoxTotemItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class FoxesDenItems {
    public static final Item ITEM = register("item", new Item(new Item.Settings()));

    // an instance of the fox totem
    public static final Item FOX_TOTEM = register("fox_totem", new FoxTotemItem(getBasicSettings().maxCount(1)));

    public static void initialize() {
    }

    /**
     * @param name
     *        Name of item instance to be registered
     * @param item
     *        Item instance to be registered
     * @return Item instanced registered
     */
    public static <T extends Item> T register(String name, T item) {
        return register(FoxesDenCommon.identifier(name), item);
    }

    /**
     * @param name
     *        Identifier of item instance to be registered
     * @param item
     *        Item instance to be registered
     * @return Item instance registered
     */
    public static <T extends Item> T register(Identifier name, T item) {
        return Registry.register(Registry.ITEM, name, item);
    }

    public static Item.Settings getBasicSettings() {
        return new Item.Settings().group(FoxesDenItemGroups.FOXESDEN);
    }
}
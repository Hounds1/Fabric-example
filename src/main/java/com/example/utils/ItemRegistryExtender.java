package com.example.utils;

import com.example.constant.HoundsModReference;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ItemRegistryExtender {

    public static Item register(Item item, String id) {
        Identifier itemId = new Identifier(HoundsModReference.MOD_ID, id);

        return Registry.register(Registries.ITEM, itemId, item);
    }

    public static void addEntries(Item item) {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
                .register((itemGroup) -> itemGroup.add(item));
    }
}

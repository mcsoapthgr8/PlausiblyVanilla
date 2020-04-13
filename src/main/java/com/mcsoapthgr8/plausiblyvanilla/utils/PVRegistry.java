package com.mcsoapthgr8.plausiblyvanilla.utils;

import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

public class PVRegistry {
    public static void register(String name, Item itemToRegister) {
        Registry.register(Registry.ITEM, Factory.createIdentifier(name), itemToRegister);
    }
}

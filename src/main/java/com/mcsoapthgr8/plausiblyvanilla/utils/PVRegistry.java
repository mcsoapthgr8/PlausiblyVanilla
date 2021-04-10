package com.mcsoapthgr8.plausiblyvanilla.utils;

import com.mcsoapthgr8.plausiblyvanilla.containers.PVItemGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

public class PVRegistry {
    private static <V, T extends V> void register(Registry<V> registry, String name, T instance) {
        Registry.register(registry, Factory.createIdentifier(name), instance);
    }

    public static void registerItem(String name, Item itemToRegister) {
        register(Registry.ITEM, name, itemToRegister);
    }

    public static void registerBlock(String name, Block blockToRegister) {
        register(Registry.BLOCK, name, blockToRegister);
        register(Registry.ITEM, name, new BlockItem(blockToRegister, new FabricItemSettings().group(PVItemGroups.BLAZE_POWER)));
    }

    public static void registerEnchantment(String name, Enchantment enchantmentToRegister) {
        register(Registry.ENCHANTMENT, name, enchantmentToRegister);
    }
}

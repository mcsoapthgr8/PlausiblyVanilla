package com.mcsoapthgr8.plausiblyvanilla.containers;

import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;

import java.util.Locale;

public class PVItems {
    public static Item BLANK_RECIPE_CARD;
    public static Item PRINTED_RECIPE_CARD;
    public static Item BLAZE_CORE;

    public static Item WOODEN_GRINDING_GEARSET;
    public static Item STONE_GRINDING_GEARSET;
    public static Item IRON_GRINDING_GEARSET;
    public static Item GOLDEN_GRINDING_GEARSET;
    public static Item DIAMOND_GRINDING_GEARSET;
    public static Item NETHERITE_GRINDING_GEARSET;

    public static Item WOODEN_PRINTING_PLATEN;
    public static Item STONE_PRINTING_PLATEN;
    public static Item IRON_PRINTING_PLATEN;
    public static Item GOLDEN_PRINTING_PLATEN;
    public static Item DIAMOND_PRINTING_PLATEN;
    public static Item NETHERITE_PRINTING_PLATEN;

    public enum Grounds implements ItemConvertible {
        IRON, GOLD, COAL, CHARCOAL, NETHERRACK, WHEAT, ANCIENT_DEBRIS;

        public final String name;
        public final Item item;

        Grounds() {
            name = this.toString().toLowerCase(Locale.ROOT);
            item = new Item(new Item.Settings().group(PVItemGroups.BLAZE_POWER));
        }

        public ItemStack getStack() {
            return new ItemStack(item);
        }

        public ItemStack getStack(int amount) {
            return new ItemStack(item, amount);
        }

        @Override
        public Item asItem() {
            return item;
        }
    }

    public enum MiscMaterials implements ItemConvertible {
        SILICON, SULFUR, NITER;

        public final String name;
        public final Item item;

        MiscMaterials() {
            name = this.toString().toLowerCase(Locale.ROOT);
            item = new Item(new Item.Settings().group(PVItemGroups.BLAZE_POWER));
        }

        public ItemStack getStack() {
            return new ItemStack(item);
        }

        public ItemStack getStack(int amount) {
            return new ItemStack(item, amount);
        }

        @Override
        public Item asItem() {
            return item;
        }
    }
}

package com.mcsoapthgr8.plausiblyvanilla.items;

import com.mcsoapthgr8.plausiblyvanilla.base.Constants;
import com.mcsoapthgr8.plausiblyvanilla.containers.PVItems;
import com.mcsoapthgr8.plausiblyvanilla.utils.PVRegistry;
import net.minecraft.item.ToolMaterials;

import java.text.MessageFormat;
import java.util.Arrays;

public class ItemsInitializer {
    public static void initialize() {
        PVRegistry.registerItem(Constants.NAME_ITEM_BLANK_RECIPE_CARD, PVItems.BLANK_RECIPE_CARD = new BlankRecipeCardItem());
        PVRegistry.registerItem(Constants.NAME_ITEM_BLAZE_CORE, PVItems.BLAZE_CORE = new BlazeCoreItem());
        PVRegistry.registerItem(Constants.NAME_ITEM_PRINTED_RECIPE_CARD, PVItems.PRINTED_RECIPE_CARD = new PrintedRecipeCardItem());

        PVRegistry.registerItem(prefixName(Constants.WOODEN_TIER, Constants.NAME_ITEM_GRINDING_GEARSET), PVItems.WOODEN_GRINDING_GEARSET = new GrindingGearsetItem(ToolMaterials.WOOD));
        PVRegistry.registerItem(prefixName(Constants.STONE_TIER, Constants.NAME_ITEM_GRINDING_GEARSET), PVItems.STONE_GRINDING_GEARSET = new GrindingGearsetItem(ToolMaterials.STONE));
        PVRegistry.registerItem(prefixName(Constants.IRON_TIER, Constants.NAME_ITEM_GRINDING_GEARSET), PVItems.IRON_GRINDING_GEARSET = new GrindingGearsetItem(ToolMaterials.IRON));
        PVRegistry.registerItem(prefixName(Constants.GOLDEN_TIER, Constants.NAME_ITEM_GRINDING_GEARSET), PVItems.GOLDEN_GRINDING_GEARSET = new GrindingGearsetItem(ToolMaterials.GOLD));
        PVRegistry.registerItem(prefixName(Constants.DIAMOND_TIER, Constants.NAME_ITEM_GRINDING_GEARSET), PVItems.DIAMOND_GRINDING_GEARSET = new GrindingGearsetItem(ToolMaterials.DIAMOND));
        PVRegistry.registerItem(prefixName(Constants.NETHERITE_TIER, Constants.NAME_ITEM_GRINDING_GEARSET), PVItems.NETHERITE_GRINDING_GEARSET = new GrindingGearsetItem(ToolMaterials.NETHERITE));

        PVRegistry.registerItem(prefixName(Constants.WOODEN_TIER, Constants.NAME_ITEM_PRINTING_PLATEN), PVItems.WOODEN_PRINTING_PLATEN = new PrintingPlatenItem(ToolMaterials.WOOD));
        PVRegistry.registerItem(prefixName(Constants.STONE_TIER, Constants.NAME_ITEM_PRINTING_PLATEN), PVItems.STONE_PRINTING_PLATEN = new PrintingPlatenItem(ToolMaterials.STONE));
        PVRegistry.registerItem(prefixName(Constants.IRON_TIER, Constants.NAME_ITEM_PRINTING_PLATEN), PVItems.IRON_PRINTING_PLATEN = new PrintingPlatenItem(ToolMaterials.IRON));
        PVRegistry.registerItem(prefixName(Constants.GOLDEN_TIER, Constants.NAME_ITEM_PRINTING_PLATEN), PVItems.GOLDEN_PRINTING_PLATEN = new PrintingPlatenItem(ToolMaterials.GOLD));
        PVRegistry.registerItem(prefixName(Constants.DIAMOND_TIER, Constants.NAME_ITEM_PRINTING_PLATEN), PVItems.DIAMOND_PRINTING_PLATEN = new PrintingPlatenItem(ToolMaterials.DIAMOND));
        PVRegistry.registerItem(prefixName(Constants.NETHERITE_TIER, Constants.NAME_ITEM_PRINTING_PLATEN), PVItems.NETHERITE_PRINTING_PLATEN = new PrintingPlatenItem(ToolMaterials.NETHERITE));

        Arrays.stream(PVItems.Grounds.values()).forEach(value -> PVRegistry.registerItem(prefixName(Constants.GROUND_PREFIX, value.name), value.item));
        Arrays.stream(PVItems.MiscMaterials.values()).forEach(value -> PVRegistry.registerItem(value.name, value.item));
    }

    private static String prefixName(String prefix, String itemName) {
        return MessageFormat.format("{0}{1}{2}", prefix, Constants.IDENTIFIER_SEPARATOR, itemName);
    }
}

package com.mcsoapthgr8.plausiblyvanilla.items;

import com.mcsoapthgr8.plausiblyvanilla.base.Constants;
import com.mcsoapthgr8.plausiblyvanilla.config.Configuration;
import com.mcsoapthgr8.plausiblyvanilla.containers.PVItems;
import com.mcsoapthgr8.plausiblyvanilla.utils.PVRegistry;
import net.minecraft.item.ToolMaterials;
import java.text.MessageFormat;
import java.util.Arrays;

public class ItemsInitializer {
    public static void initialize(Configuration config) {
        PVRegistry.register(Constants.NAME_ITEM_BLANK_RECIPE_CARD, PVItems.BLANK_RECIPE_CARD = new BlankRecipeCardItem());
        PVRegistry.register(Constants.NAME_ITEM_BLAZE_CORE, PVItems.BLAZE_CORE = new BlazeCoreItem());
        PVRegistry.register(Constants.NAME_ITEM_PRINTED_RECIPE_CARD, PVItems.PRINTED_RECIPE_CARD = new PrintedRecipeCardItem());

        PVRegistry.register(prefixName(Constants.WOODEN_TIER, Constants.NAME_ITEM_GRINDING_GEARSET), PVItems.WOODEN_GRINDING_GEARSET = new GrindingGearsetItem(ToolMaterials.WOOD));
        PVRegistry.register(prefixName(Constants.STONE_TIER, Constants.NAME_ITEM_GRINDING_GEARSET), PVItems.STONE_GRINDING_GEARSET = new GrindingGearsetItem(ToolMaterials.STONE));
        PVRegistry.register(prefixName(Constants.IRON_TIER, Constants.NAME_ITEM_GRINDING_GEARSET), PVItems.IRON_GRINDING_GEARSET = new GrindingGearsetItem(ToolMaterials.IRON));
        PVRegistry.register(prefixName(Constants.GOLDEN_TIER, Constants.NAME_ITEM_GRINDING_GEARSET), PVItems.GOLDEN_GRINDING_GEARSET = new GrindingGearsetItem(ToolMaterials.GOLD));
        PVRegistry.register(prefixName(Constants.DIAMOND_TIER, Constants.NAME_ITEM_GRINDING_GEARSET), PVItems.DIAMOND_GRINDING_GEARSET = new GrindingGearsetItem(ToolMaterials.DIAMOND));
        //PVRegistry.register(getTieredName(Constants.NETHERITE_TIER, Constants.NAME_ITEM_GRINDING_GEARSET), PVItems.NETHERITE_GRINDING_GEARSET = new GrindingGearsetItem(ToolMaterials.NETHERITE));

        PVRegistry.register(prefixName(Constants.WOODEN_TIER, Constants.NAME_ITEM_PRINTING_PLATEN), PVItems.WOODEN_PRINTING_PLATEN = new PrintingPlatenItem(ToolMaterials.WOOD));
        PVRegistry.register(prefixName(Constants.STONE_TIER, Constants.NAME_ITEM_PRINTING_PLATEN), PVItems.STONE_PRINTING_PLATEN = new PrintingPlatenItem(ToolMaterials.STONE));
        PVRegistry.register(prefixName(Constants.IRON_TIER, Constants.NAME_ITEM_PRINTING_PLATEN), PVItems.IRON_PRINTING_PLATEN = new PrintingPlatenItem(ToolMaterials.IRON));
        PVRegistry.register(prefixName(Constants.GOLDEN_TIER, Constants.NAME_ITEM_PRINTING_PLATEN), PVItems.GOLDEN_PRINTING_PLATEN = new PrintingPlatenItem(ToolMaterials.GOLD));
        PVRegistry.register(prefixName(Constants.DIAMOND_TIER, Constants.NAME_ITEM_PRINTING_PLATEN), PVItems.DIAMOND_PRINTING_PLATEN = new PrintingPlatenItem(ToolMaterials.DIAMOND));
        //PVRegistry.register(getTieredName(Constants.NETHERITE_TIER, Constants.NAME_ITEM_PRINTING_PLATEN), PVItems.NETHERITE_PRINTING_PLATEN = new PrintingPlatenItem(ToolMaterials.NETHERITE));

        Arrays.stream(PVItems.Grounds.values()).forEach(value -> PVRegistry.register(prefixName(Constants.GROUND_PREFIX, value.name), value.item));
        Arrays.stream(PVItems.MiscMaterials.values()).forEach(value -> PVRegistry.register(value.name, value.item));
    }

    private static String prefixName(String prefix, String itemName) {
        return MessageFormat.format("{0}{1}{2}", prefix, Constants.IDENTIFIER_SEPARATOR, itemName);
    }
}

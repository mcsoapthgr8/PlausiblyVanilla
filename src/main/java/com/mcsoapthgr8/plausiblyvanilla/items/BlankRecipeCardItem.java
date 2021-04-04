package com.mcsoapthgr8.plausiblyvanilla.items;

import com.mcsoapthgr8.plausiblyvanilla.containers.PVItemGroups;
import net.minecraft.item.Item;

public class BlankRecipeCardItem extends Item {
    public BlankRecipeCardItem() {
        super(new Item.Settings().group(PVItemGroups.BLAZE_POWER));
    }
}

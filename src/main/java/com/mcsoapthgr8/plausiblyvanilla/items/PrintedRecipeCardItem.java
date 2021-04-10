package com.mcsoapthgr8.plausiblyvanilla.items;

import com.mcsoapthgr8.plausiblyvanilla.base.interfaces.IDamageable;
import com.mcsoapthgr8.plausiblyvanilla.containers.PVItemGroups;
import net.minecraft.item.Item;

public class PrintedRecipeCardItem extends Item implements IDamageable {
    public PrintedRecipeCardItem() {
        super(new Item.Settings().group(PVItemGroups.BLAZE_POWER).maxCount(1));
    }
}

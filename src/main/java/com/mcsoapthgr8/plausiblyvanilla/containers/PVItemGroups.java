package com.mcsoapthgr8.plausiblyvanilla.containers;

import com.mcsoapthgr8.plausiblyvanilla.base.Constants;
import com.mcsoapthgr8.plausiblyvanilla.utils.Factory;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class PVItemGroups {
    public static ItemGroup BLAZE_POWER;

    public static void initialize() {
        BLAZE_POWER = FabricItemGroupBuilder.build(
                Factory.createIdentifier(Constants.NAME_ITEM_GROUP),
                () -> new ItemStack(Items.BLAZE_POWDER));
    }
}

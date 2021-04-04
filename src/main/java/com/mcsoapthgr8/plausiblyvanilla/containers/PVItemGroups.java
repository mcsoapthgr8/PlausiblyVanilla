package com.mcsoapthgr8.plausiblyvanilla.containers;

import com.mcsoapthgr8.plausiblyvanilla.base.Constants;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class PVItemGroups {
    public static ItemGroup BLAZE_POWER;

    public static void initialize() {
        BLAZE_POWER = FabricItemGroupBuilder.build(
                new Identifier(Constants.MOD_ID, Constants.NAME_BLAZE_POWER),
                () -> new ItemStack(Items.BLAZE_POWDER));
    }
}

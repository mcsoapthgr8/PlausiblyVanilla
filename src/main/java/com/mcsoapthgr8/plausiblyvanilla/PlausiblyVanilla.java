package com.mcsoapthgr8.plausiblyvanilla;

import com.mcsoapthgr8.plausiblyvanilla.containers.PVItemGroups;
import com.mcsoapthgr8.plausiblyvanilla.enchantments.EnchantmentsInitializer;
import com.mcsoapthgr8.plausiblyvanilla.items.ItemsInitializer;
import com.mcsoapthgr8.plausiblyvanilla.machines.MachinesInitializer;
import net.fabricmc.api.ModInitializer;

public class PlausiblyVanilla implements ModInitializer {

    @Override
    public void onInitialize()
    {
        PVItemGroups.initialize();
        EnchantmentsInitializer.initialize();
        ItemsInitializer.initialize();
        MachinesInitializer.initialize();
    }
}

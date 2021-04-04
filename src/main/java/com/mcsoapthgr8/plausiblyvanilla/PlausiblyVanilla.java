package com.mcsoapthgr8.plausiblyvanilla;

import com.mcsoapthgr8.plausiblyvanilla.config.Configuration;
import com.mcsoapthgr8.plausiblyvanilla.containers.PVItemGroups;
import com.mcsoapthgr8.plausiblyvanilla.enchantments.EnchantmentsInitializer;
import com.mcsoapthgr8.plausiblyvanilla.items.ItemsInitializer;
import com.mcsoapthgr8.plausiblyvanilla.machines.MachinesInitializer;
import com.mcsoapthgr8.plausiblyvanilla.utils.LogAdapter;
import net.fabricmc.api.ModInitializer;

public class PlausiblyVanilla implements ModInitializer {
    public static final LogAdapter LOGGER = new LogAdapter();

    @Override
    public void onInitialize() {
        Configuration config = Configuration.initialize(LOGGER);
        PVItemGroups.initialize();
        EnchantmentsInitializer.initialize(config);
        ItemsInitializer.initialize(config);
        MachinesInitializer.initialize(config);
    }
}

package com.mcsoapthgr8.plausiblyvanilla;

import com.mcsoapthgr8.plausiblyvanilla.config.Configuration;
import com.mcsoapthgr8.plausiblyvanilla.containers.PVItemGroups;
import com.mcsoapthgr8.plausiblyvanilla.enchantments.EnchantmentsInitializer;
import com.mcsoapthgr8.plausiblyvanilla.items.ItemsInitializer;
import com.mcsoapthgr8.plausiblyvanilla.machines.MachinesInitializer;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.Logger;

public class PlausiblyVanilla implements ModInitializer {
    public static Logger logger;

    @Override
    public void onInitialize()
    {
        Configuration config = Configuration.initialize(logger);
        PVItemGroups.initialize();
        EnchantmentsInitializer.initialize(config);
        ItemsInitializer.initialize(config);
        MachinesInitializer.initialize(config);
    }
}

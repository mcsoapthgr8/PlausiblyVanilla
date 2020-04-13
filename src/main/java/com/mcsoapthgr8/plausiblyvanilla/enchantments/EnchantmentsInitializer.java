package com.mcsoapthgr8.plausiblyvanilla.enchantments;

import com.mcsoapthgr8.plausiblyvanilla.base.Constants;
import com.mcsoapthgr8.plausiblyvanilla.config.Configuration;
import com.mcsoapthgr8.plausiblyvanilla.containers.PVEnchantments;
import com.mcsoapthgr8.plausiblyvanilla.utils.Factory;
import net.minecraft.util.registry.Registry;

public class EnchantmentsInitializer {
    public static void initialize(Configuration config) {
        PVEnchantments.FUEL_EFFICIENCY = Registry.register(
                Registry.ENCHANTMENT,
                Factory.createIdentifier(Constants.NAME_ENCHANTMENT_FUEL_EFFICIENCY),
                new FuelEfficiencyEnchantment());
    }
}

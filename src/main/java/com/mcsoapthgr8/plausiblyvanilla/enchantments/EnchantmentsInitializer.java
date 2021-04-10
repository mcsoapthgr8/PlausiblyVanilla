package com.mcsoapthgr8.plausiblyvanilla.enchantments;

import com.mcsoapthgr8.plausiblyvanilla.base.Constants;
import com.mcsoapthgr8.plausiblyvanilla.containers.PVEnchantments;
import com.mcsoapthgr8.plausiblyvanilla.utils.PVRegistry;

public class EnchantmentsInitializer {
    public static void initialize() {
        PVRegistry.registerEnchantment(
                Constants.NAME_ENCHANTMENT_FUEL_EFFICIENCY,
                PVEnchantments.FUEL_EFFICIENCY = new FuelEfficiencyEnchantment());
    }
}

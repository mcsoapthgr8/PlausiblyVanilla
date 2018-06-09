package mcsoapthgr8.plausiblyvanilla.items;

import mcsoapthgr8.plausiblyvanilla.base.interfaces.IAllowFuelEfficiency;
import mcsoapthgr8.plausiblyvanilla.base.items.ItemMachineRequirement;

public class ItemCrucible extends ItemMachineRequirement implements IAllowFuelEfficiency {
    public ItemCrucible(ToolMaterial toolMaterial) {
        super(toolMaterial);
    }

    @Override
    public boolean preInit() {
        return false;
    }

    @Override
    public boolean initialize() {
        return false;
    }
}

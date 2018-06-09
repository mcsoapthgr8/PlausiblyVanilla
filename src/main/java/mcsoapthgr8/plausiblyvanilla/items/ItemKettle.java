package mcsoapthgr8.plausiblyvanilla.items;

import mcsoapthgr8.plausiblyvanilla.base.interfaces.IAllowFuelEfficiency;
import mcsoapthgr8.plausiblyvanilla.base.items.ItemMachineRequirement;

public class ItemKettle extends ItemMachineRequirement implements IAllowFuelEfficiency {
    public ItemKettle(ToolMaterial toolMaterial) {
        super(toolMaterial);
    }
}

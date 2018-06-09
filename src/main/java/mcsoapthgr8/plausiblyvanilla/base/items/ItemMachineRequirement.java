package mcsoapthgr8.plausiblyvanilla.base.items;

import mcsoapthgr8.plausiblyvanilla.base.IInitializer;
import mcsoapthgr8.plausiblyvanilla.base.interfaces.IAllowFuelEfficiency;
import mcsoapthgr8.plausiblyvanilla.base.interfaces.IDamageable;

public abstract class ItemMachineRequirement extends ItemBase implements IAllowFuelEfficiency, IDamageable {
    public ItemMachineRequirement(ToolMaterial material) {

    }
}

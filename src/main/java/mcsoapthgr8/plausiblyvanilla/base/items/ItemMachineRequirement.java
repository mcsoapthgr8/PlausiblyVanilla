package mcsoapthgr8.plausiblyvanilla.base.items;

import mcsoapthgr8.plausiblyvanilla.base.interfaces.IAllowFuelEfficiency;
import mcsoapthgr8.plausiblyvanilla.base.interfaces.IDamageable;

public abstract class ItemMachineRequirement extends ItemBase implements IAllowFuelEfficiency, IDamageable {

    protected ToolMaterial _material;

    public ItemMachineRequirement(ToolMaterial material, String name) {
        super(name);
        _material = material;
    }
}

package com.mcsoapthgr8.plausiblyvanilla.base.items;

import com.mcsoapthgr8.plausiblyvanilla.base.interfaces.IAllowFuelEfficiency;
import com.mcsoapthgr8.plausiblyvanilla.base.interfaces.IDamageable;
import com.mcsoapthgr8.plausiblyvanilla.containers.PVItemGroups;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;

public abstract class MachineRequirementBase extends Item implements IAllowFuelEfficiency, IDamageable {

    protected ToolMaterial _material;

    public MachineRequirementBase(ToolMaterial material) {
        super(new Item.Settings().group(PVItemGroups.BLAZE_POWER));
        _material = material;
    }
}

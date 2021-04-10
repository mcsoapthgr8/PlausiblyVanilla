package com.mcsoapthgr8.plausiblyvanilla.base.items;

import com.mcsoapthgr8.plausiblyvanilla.base.interfaces.IAllowFuelEfficiency;
import com.mcsoapthgr8.plausiblyvanilla.base.interfaces.IDamageable;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;

public abstract class MachineRequirementBase extends Item implements IAllowFuelEfficiency, IDamageable {

    protected ToolMaterial _material;

    public MachineRequirementBase(FabricItemSettings settings, ToolMaterial material) {
        super(settings);
        _material = material;
    }
}

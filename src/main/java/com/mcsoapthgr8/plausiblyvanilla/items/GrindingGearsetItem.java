package com.mcsoapthgr8.plausiblyvanilla.items;

import com.mcsoapthgr8.plausiblyvanilla.base.interfaces.IAllowFuelEfficiency;
import com.mcsoapthgr8.plausiblyvanilla.base.items.MachineRequirementBase;
import net.minecraft.item.ToolMaterial;

public class GrindingGearsetItem extends MachineRequirementBase implements IAllowFuelEfficiency {
    public GrindingGearsetItem(ToolMaterial toolMaterial) {
        super(toolMaterial);
    }
}

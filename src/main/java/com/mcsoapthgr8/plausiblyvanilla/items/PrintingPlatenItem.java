package com.mcsoapthgr8.plausiblyvanilla.items;

import com.mcsoapthgr8.plausiblyvanilla.base.items.MachineRequirementBase;
import com.mcsoapthgr8.plausiblyvanilla.base.interfaces.IAllowFuelEfficiency;
import net.minecraft.item.ToolMaterial;

public class PrintingPlatenItem extends MachineRequirementBase implements IAllowFuelEfficiency {
    public PrintingPlatenItem(ToolMaterial toolMaterial) {
        super(toolMaterial);
    }
}

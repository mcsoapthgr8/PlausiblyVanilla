package com.mcsoapthgr8.plausiblyvanilla.items;

import com.mcsoapthgr8.plausiblyvanilla.base.interfaces.IAllowFuelEfficiency;
import com.mcsoapthgr8.plausiblyvanilla.base.items.MachineRequirementBase;
import com.mcsoapthgr8.plausiblyvanilla.containers.PVItemGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ToolMaterial;

public class GrindingGearsetItem extends MachineRequirementBase implements IAllowFuelEfficiency {
    public GrindingGearsetItem(ToolMaterial toolMaterial) {
        super(new FabricItemSettings().group(PVItemGroups.BLAZE_POWER).maxCount(1), toolMaterial);
    }
}

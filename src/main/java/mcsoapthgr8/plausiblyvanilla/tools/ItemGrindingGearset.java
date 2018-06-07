package mcsoapthgr8.plausiblyvanilla.tools;

import mcsoapthgr8.plausiblyvanilla.base.items.ItemToolBase;
import mcsoapthgr8.plausiblyvanilla.enchantments.IAllowFuelEfficiency;

public class ItemGrindingGearset extends ItemToolBase implements IAllowFuelEfficiency {
    public ItemGrindingGearset(float baseDamage, float attackSpeed, ToolMaterial toolMaterial) {
        super(baseDamage, attackSpeed, toolMaterial);
    }
}

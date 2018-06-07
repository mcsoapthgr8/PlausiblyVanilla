package mcsoapthgr8.plausiblyvanilla.tools;

import mcsoapthgr8.plausiblyvanilla.base.items.ItemToolBase;
import mcsoapthgr8.plausiblyvanilla.enchantments.IAllowFuelEfficiency;

public class ItemCrucible extends ItemToolBase implements IAllowFuelEfficiency {
    public ItemCrucible(float baseDamage, float attackSpeed, ToolMaterial toolMaterial) {
        super(baseDamage, attackSpeed, toolMaterial);
    }
}

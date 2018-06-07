package mcsoapthgr8.plausiblyvanilla.base.items;

import net.minecraft.item.ItemTool;

public abstract class ItemToolBase extends ItemTool {
    protected String repairIngot = "";
    protected int harvestLevel;
    protected boolean showInCreative = true;

    public ItemToolBase(float baseDamage, float attackSpeed, ToolMaterial toolMaterial) {

        super(baseDamage, attackSpeed, toolMaterial, null);
        harvestLevel = toolMaterial.getHarvestLevel();
    }

    public ItemToolBase setHarvestLevel(int harvestLevel) {
        this.harvestLevel = harvestLevel;
        return this;
    }

    public ItemToolBase setRepairIngot(String repairIngot) {
        this.repairIngot = repairIngot;
        return this;
    }

    public ItemToolBase setShowInCreative(boolean showInCreative) {
        this.showInCreative = showInCreative;
        return this;
    }
}

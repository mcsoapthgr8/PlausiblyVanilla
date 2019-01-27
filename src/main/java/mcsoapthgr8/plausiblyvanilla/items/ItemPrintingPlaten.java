package mcsoapthgr8.plausiblyvanilla.items;

import mcsoapthgr8.plausiblyvanilla.base.Constants;
import mcsoapthgr8.plausiblyvanilla.base.interfaces.IAllowFuelEfficiency;
import mcsoapthgr8.plausiblyvanilla.base.items.ItemMachineRequirement;

public class ItemPrintingPlaten extends ItemMachineRequirement implements IAllowFuelEfficiency {
    public ItemPrintingPlaten(ToolMaterial toolMaterial) {
        super(toolMaterial, Constants.NAME_ITEM_PRINTING_PLATEN);
    }
}

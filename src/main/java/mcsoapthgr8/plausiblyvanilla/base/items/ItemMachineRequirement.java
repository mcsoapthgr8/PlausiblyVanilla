package mcsoapthgr8.plausiblyvanilla.base.items;

import mcsoapthgr8.plausiblyvanilla.base.interfaces.IAllowFuelEfficiency;
import mcsoapthgr8.plausiblyvanilla.base.interfaces.IDamageable;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public abstract class ItemMachineRequirement extends Item implements IAllowFuelEfficiency, IDamageable {
    public ItemMachineRequirement(ToolMaterial material) {

    }

    private Item getBasePickaxe(ToolMaterial material) {
        switch (material) {
            case STONE:
                return Items.STONE_PICKAXE;
            case IRON:
                return Items.IRON_PICKAXE;
            case GOLD:
                return Items.GOLDEN_PICKAXE;
            case DIAMOND:
                return Items.DIAMOND_PICKAXE;
        }

        return Items.WOODEN_PICKAXE;
    }
}

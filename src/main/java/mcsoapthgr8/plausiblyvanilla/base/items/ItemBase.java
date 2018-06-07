package mcsoapthgr8.plausiblyvanilla.base.items;

import mcsoapthgr8.plausiblyvanilla.core.config.Constants;
import net.minecraft.item.Item;

public abstract class ItemBase extends Item {
    protected String name;

    @Override
    public Item setUnlocalizedName(String name) {
        this.name = name;
        return super.setUnlocalizedName(Constants.MOD_ID + "." + name);
    }
}

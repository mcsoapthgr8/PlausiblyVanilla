package mcsoapthgr8.plausiblyvanilla.base.items;

import mcsoapthgr8.plausiblyvanilla.base.Constants;
import mcsoapthgr8.plausiblyvanilla.base.IInitializer;
import net.minecraft.item.Item;

public abstract class ItemBase extends Item implements IInitializer {
    protected String name;

    @Override
    public Item setUnlocalizedName(String name) {
        this.name = name;
        return super.setUnlocalizedName(Constants.MOD_ID + "." + name);
    }
}

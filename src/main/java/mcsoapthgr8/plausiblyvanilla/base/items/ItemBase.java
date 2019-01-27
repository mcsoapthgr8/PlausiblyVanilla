package mcsoapthgr8.plausiblyvanilla.base.items;

import mcsoapthgr8.plausiblyvanilla.base.Constants;
import net.minecraft.item.Item;

public abstract class ItemBase extends Item {
    protected String name;

    public ItemBase(String name) {
        setRegistryName(name);
        setTranslationKey(Constants.MOD_ID + Constants.SEPARATOR + name);
    }
}

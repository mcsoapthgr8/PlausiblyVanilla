package mcsoapthgr8.plausiblyvanilla;

import mcsoapthgr8.plausiblyvanilla.base.Constants;
import mcsoapthgr8.plausiblyvanilla.items.ItemBlazeCore;
import mcsoapthgr8.plausiblyvanilla.items.ItemPrintingPlaten;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
    @GameRegistry.ObjectHolder(Constants.MOD_ID + ":" + Constants.NAME_ITEM_BLAZE_CORE)
    public static ItemBlazeCore itemBlazeCore;

    @GameRegistry.ObjectHolder(Constants.MOD_ID + ":" + Constants.NAME_ITEM_PRINTING_PLATEN)
    public static ItemPrintingPlaten itemPrintingPlaten;
}

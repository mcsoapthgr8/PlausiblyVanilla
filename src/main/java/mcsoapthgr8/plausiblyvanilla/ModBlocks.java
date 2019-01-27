package mcsoapthgr8.plausiblyvanilla;

import mcsoapthgr8.plausiblyvanilla.base.Constants;
import mcsoapthgr8.plausiblyvanilla.machines.grinder.BlockGrinder;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
    @GameRegistry.ObjectHolder(Constants.MOD_ID + ":" + Constants.NAME_BLOCK_GRINDER)
    public static BlockGrinder blockGrinder;
}

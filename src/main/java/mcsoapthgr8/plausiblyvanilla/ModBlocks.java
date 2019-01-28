package mcsoapthgr8.plausiblyvanilla;

import mcsoapthgr8.plausiblyvanilla.base.Constants;
import mcsoapthgr8.plausiblyvanilla.machines.grinder.BlockGrinder;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks {
    @GameRegistry.ObjectHolder(Constants.MOD_ID + ":" + Constants.NAME_BLOCK_GRINDER)
    public static BlockGrinder blockGrinder;

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        blockGrinder.initModel();
    }
}

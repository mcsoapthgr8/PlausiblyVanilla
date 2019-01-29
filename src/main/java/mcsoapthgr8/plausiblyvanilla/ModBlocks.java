package mcsoapthgr8.plausiblyvanilla;

import mcsoapthgr8.plausiblyvanilla.base.Constants;
import mcsoapthgr8.plausiblyvanilla.machines.grinder.BlockGrinder;
import mcsoapthgr8.plausiblyvanilla.machines.itempress.BlockItemPress;
import mcsoapthgr8.plausiblyvanilla.machines.recipeimprinter.BlockRecipeImprinter;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks {
    @GameRegistry.ObjectHolder(Constants.MOD_ID + ":" + Constants.NAME_BLOCK_GRINDER)
    public static BlockGrinder blockGrinder;

    @GameRegistry.ObjectHolder(Constants.MOD_ID + ":" + Constants.NAME_BLOCK_RECIPE_IMPRINTER)
    public static BlockRecipeImprinter blockRecipeImprinter;

    @GameRegistry.ObjectHolder(Constants.MOD_ID + ":" + Constants.NAME_BLOCK_ITEM_PRESS)
    public static BlockItemPress blockItemPress;

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        blockGrinder.initModel();
        blockRecipeImprinter.initModel();
        blockItemPress.initModel();
    }
}

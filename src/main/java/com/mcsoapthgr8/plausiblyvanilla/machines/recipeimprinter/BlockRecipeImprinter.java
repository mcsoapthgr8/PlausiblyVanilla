package mcsoapthgr8.plausiblyvanilla.machines.recipeimprinter;

import mcsoapthgr8.plausiblyvanilla.base.Constants;
import mcsoapthgr8.plausiblyvanilla.base.blocks.BlockMachineBase;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockRecipeImprinter extends BlockMachineBase {
    public BlockRecipeImprinter() {
        super(Material.ROCK, Constants.NAME_BLOCK_RECIPE_IMPRINTER);
    }

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileEntityRecipeImprinter();
    }
}

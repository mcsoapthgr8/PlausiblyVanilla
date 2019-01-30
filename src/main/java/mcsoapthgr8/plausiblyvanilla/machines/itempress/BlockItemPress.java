package mcsoapthgr8.plausiblyvanilla.machines.itempress;

import mcsoapthgr8.plausiblyvanilla.base.Constants;
import mcsoapthgr8.plausiblyvanilla.base.blocks.BlockMachineBase;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockItemPress extends BlockMachineBase {
    public BlockItemPress() {
        super(Material.ROCK, Constants.NAME_BLOCK_ITEM_PRESS);
    }

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileEntityItemPress();
    }
}

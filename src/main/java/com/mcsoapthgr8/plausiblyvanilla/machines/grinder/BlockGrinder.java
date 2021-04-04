package mcsoapthgr8.plausiblyvanilla.machines.grinder;

import mcsoapthgr8.plausiblyvanilla.base.Constants;
import mcsoapthgr8.plausiblyvanilla.base.blocks.BlockMachineBase;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockGrinder extends BlockMachineBase {
    public BlockGrinder() {
        super(Material.ROCK, Constants.NAME_BLOCK_GRINDER);
    }

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileEntityGrinder();
    }
}

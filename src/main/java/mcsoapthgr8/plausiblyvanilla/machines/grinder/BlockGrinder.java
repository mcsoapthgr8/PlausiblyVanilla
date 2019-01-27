package mcsoapthgr8.plausiblyvanilla.machines.grinder;

import mcsoapthgr8.plausiblyvanilla.PlausiblyVanilla;
import mcsoapthgr8.plausiblyvanilla.base.Constants;
import mcsoapthgr8.plausiblyvanilla.base.blocks.BlockMachineBase;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;

import javax.annotation.Nullable;

public class BlockGrinder extends BlockMachineBase {

    public BlockGrinder() {
        super(Material.ROCK, Constants.NAME_BLOCK_GRINDER);

        this.setHarvestLevel("pickaxe", 0);
        this.setHardness(1.5F);
        this.setResistance(10.0F);
        this.setSoundType(SoundType.STONE);
        this.setCreativeTab(PlausiblyVanilla.creativeTab);
    }

    @Nullable
    @Override
    public TileEntity createNewTileEntity(World world, int i) {
        return null;
    }
}

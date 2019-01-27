package mcsoapthgr8.plausiblyvanilla.base.blocks;

import mcsoapthgr8.plausiblyvanilla.base.Constants;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;

public abstract class BlockMachineBase extends BlockContainer {
    public BlockMachineBase(Material mat, String name) {
        super(mat);

        setRegistryName(new ResourceLocation(Constants.MOD_ID, name));
        setTranslationKey(Constants.MOD_ID + Constants.SEPARATOR + name);
    }
}

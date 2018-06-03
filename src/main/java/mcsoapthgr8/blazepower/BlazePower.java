package mcsoapthgr8.blazepower;

import javax.annotation.Nullable;
import java.io.File;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

import mcsoapthgr8.blazepower.core.config.Constants;
import net.minecraftforge.fml.common.SidedProxy;

@Mod(
        modid = Constants.MOD_ID,
        name = Constants.MOD_NAME,
        version = Constants.VERSION,
        acceptedMinecraftVersions = "[1.12.2]")
public class BlazePower {
    @Mod.Instance(Constants.MOD_ID)
    public static BlazePower instance;

    @Nullable
    private File configFolder;

    public BlazePower() {
        MinecraftForge.EVENT_BUS.register(this);
    }
}

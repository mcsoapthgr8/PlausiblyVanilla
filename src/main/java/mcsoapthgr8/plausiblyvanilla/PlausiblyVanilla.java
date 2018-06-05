package mcsoapthgr8.plausiblyvanilla;

import javax.annotation.Nullable;
import java.io.File;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

import mcsoapthgr8.plausiblyvanilla.core.config.Constants;

@Mod(
        modid = Constants.MOD_ID,
        name = Constants.MOD_NAME,
        version = Constants.VERSION,
        acceptedMinecraftVersions = "[1.12.2]")
public class PlausiblyVanilla {
    @Mod.Instance(Constants.MOD_ID)
    public static PlausiblyVanilla instance;

    @Nullable
    private File configFolder;

    public PlausiblyVanilla() {
        MinecraftForge.EVENT_BUS.register(this);
    }
}

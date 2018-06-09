package mcsoapthgr8.plausiblyvanilla;

import javax.annotation.Nullable;
import java.io.File;

import mcsoapthgr8.plausiblyvanilla.base.blocks.BlocksInitializer;
import mcsoapthgr8.plausiblyvanilla.base.items.ItemsInitializer;
import mcsoapthgr8.plausiblyvanilla.enchantments.EnchantmentsInitializer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;

import mcsoapthgr8.plausiblyvanilla.base.Constants;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(
        modid = Constants.MOD_ID,
        name = Constants.MOD_NAME,
        version = Constants.VERSION,
        acceptedMinecraftVersions = "[1.12.2]")
public class PlausiblyVanilla {
    @Instance(Constants.MOD_ID)
    public static PlausiblyVanilla instance;

    @Nullable
    private File configFolder;

    public PlausiblyVanilla() {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        BlocksInitializer.preInit();
        ItemsInitializer.preInit();
        EnchantmentsInitializer.preInit();
    }
}

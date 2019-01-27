package mcsoapthgr8.plausiblyvanilla;

import mcsoapthgr8.plausiblyvanilla.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;

import mcsoapthgr8.plausiblyvanilla.base.Constants;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(
        modid = Constants.MOD_ID,
        name = Constants.MOD_NAME,
        version = Constants.VERSION,
        acceptedMinecraftVersions = "[1.12.2]")
public class PlausiblyVanilla {

    @SidedProxy(clientSide = "mcsoapthgr8.plausiblyvanilla.proxy.ClientProxy", serverSide = "mcsoapthgr8.plausiblyvanilla.proxy.ServerProxy")
    public static CommonProxy proxy;

    public static CreativeTabs creativeTab = new CreativeTabs("Plausibly Vanilla") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.blockGrinder);
        }
    };

    @Instance(Constants.MOD_ID)
    public static PlausiblyVanilla instance;

    public static Logger logger;

    public PlausiblyVanilla() {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}

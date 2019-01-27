package mcsoapthgr8.plausiblyvanilla.config;

import mcsoapthgr8.plausiblyvanilla.PlausiblyVanilla;
import mcsoapthgr8.plausiblyvanilla.base.Constants;
import mcsoapthgr8.plausiblyvanilla.proxy.CommonProxy;
import net.minecraftforge.common.config.Configuration;
import org.apache.logging.log4j.Level;

public class Config {
    public static void readConfig() {
        Configuration cfg = CommonProxy.config;

        try {
            cfg.load();
        } catch (Exception e) {
            PlausiblyVanilla.logger.log(Level.ERROR, Constants.ERROR_LOADING_CONFIG_FILE, e);
        } finally {
            if (cfg.hasChanged()) {
                cfg.save();
            }
        }
    }
}

package com.mcsoapthgr8.plausiblyvanilla.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mcsoapthgr8.plausiblyvanilla.base.Constants;
import net.fabricmc.loader.api.FabricLoader;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Configuration {

    public static Configuration initialize(Logger logger) {
        File configFile = new File(FabricLoader.getInstance().getConfigDir().toFile(), Constants.CONFIG_FILE_NAME);

        Configuration result = null;

        if (configFile.exists()) {
            try {
                logger.debug("Loading configuration");
                FileReader fr = new FileReader(configFile);
                result = new Gson().fromJson(fr, Configuration.class);
            } catch (IOException e) {
                logger.error(Constants.ERROR_LOADING_CONFIG_FILE);
            }
        }

        if (result == null) result = new Configuration();

        try {
            FileWriter fw = new FileWriter(configFile);
            fw.write(new GsonBuilder().setPrettyPrinting().create().toJson(result));
            fw.close();
        } catch (IOException e) {
            logger.error("Failed saving config!");
            e.printStackTrace();
        }

        return result;
    }
}

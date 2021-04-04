package com.mcsoapthgr8.plausiblyvanilla.utils;

import com.mcsoapthgr8.plausiblyvanilla.base.Constants;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogAdapter {
    private static final Logger LOGGER = LogManager.getLogger(Constants.MOD_ID);

    public void debug(String message) {
        LOGGER.debug(message);
    }

    public void error(String message) {
        LOGGER.error(message);
    }
}

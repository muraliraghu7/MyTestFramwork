package com.example.restassuredframework.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

 public class LoggerUtil {

    private static Logger LOGGER;

    private LoggerUtil() {

    }

    public static synchronized Logger getLoggerInstance() {
        if (LOGGER == null) {
            LOGGER = LogManager.getLogger(LoggerUtil.class);
        }
        return LOGGER;
    }
}

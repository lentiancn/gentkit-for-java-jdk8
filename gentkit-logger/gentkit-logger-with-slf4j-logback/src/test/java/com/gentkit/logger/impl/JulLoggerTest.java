package com.gentkit.logger.impl;

import com.gentkit.logger.utils.Slf4jUtils;
import org.junit.jupiter.api.Test;

public class JulLoggerTest {

    @Test
    public void log() {
        Slf4jUtils.forceJulToSlf4j();

        java.util.logging.Logger logger = java.util.logging.Logger.getLogger(JulLoggerTest.class.getName());
        logger.log(java.util.logging.Level.SEVERE, "Severe message");
        logger.log(java.util.logging.Level.WARNING, "Warning message");
        logger.log(java.util.logging.Level.INFO, "Info message");
        logger.log(java.util.logging.Level.CONFIG, "Config message");
        logger.log(java.util.logging.Level.FINE, "Fine message");
        logger.log(java.util.logging.Level.FINER, "Finer message");
        logger.log(java.util.logging.Level.FINEST, "Finest message");
        logger.log(java.util.logging.Level.ALL, "All message");
        logger.log(java.util.logging.Level.OFF, "Off message");
    }
}

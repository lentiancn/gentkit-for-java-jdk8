package com.gentkit.logger.impl;

import org.junit.jupiter.api.Test;

public class JclLoggerTest {

    @Test
    public void log() {
        org.apache.commons.logging.Log logger = org.apache.commons.logging.LogFactory.getLog(JclLoggerTest.class);
        logger.trace("Trace message");
        logger.debug("Debug message");
        logger.info("Info message");
        logger.warn("Warn message");
        logger.error("Error message");
        logger.fatal("Fatal message");
    }
}

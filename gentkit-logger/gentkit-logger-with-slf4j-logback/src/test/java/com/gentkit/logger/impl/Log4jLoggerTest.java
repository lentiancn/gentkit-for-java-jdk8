package com.gentkit.logger.impl;

import org.junit.jupiter.api.Test;

public class Log4jLoggerTest {

    @Test
    public void log() {
        org.apache.logging.log4j.Logger logger = org.apache.logging.log4j.LogManager.getLogger(Log4jLoggerTest.class);
        logger.log(org.apache.logging.log4j.Level.TRACE, "Trace message");
        logger.log(org.apache.logging.log4j.Level.DEBUG, "Debug message");
        logger.log(org.apache.logging.log4j.Level.INFO, "Info message");
        logger.log(org.apache.logging.log4j.Level.WARN, "Warn message");
        logger.log(org.apache.logging.log4j.Level.ERROR, "Error message");
        logger.log(org.apache.logging.log4j.Level.FATAL, "Fatal message");
        logger.log(org.apache.logging.log4j.Level.OFF, "Off message");
        logger.log(org.apache.logging.log4j.Level.ALL, "All message");
    }
}

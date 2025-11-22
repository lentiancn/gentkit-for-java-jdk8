package com.gentkit.logger.impl;

import org.junit.jupiter.api.Test;

public class Slf4jLogbackLoggerImplTest {

    Slf4jLogbackLoggerImpl logger = new Slf4jLogbackLoggerImpl(Slf4jLogbackLoggerImplTest.class);

    @Test
    public void trace() {
        logger.trace("trace");
    }

    @Test
    public void debug() {
        logger.debug("debug");
    }

    @Test
    public void info() {
        logger.info("info");
    }

    @Test
    public void warn() {
        logger.warn("warn");
    }

    @Test
    public void error() {
        logger.error("error");
    }
}

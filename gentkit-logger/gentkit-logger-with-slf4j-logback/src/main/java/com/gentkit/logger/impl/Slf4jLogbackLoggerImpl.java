/*
 * Copyright (c) 2025-2025 田隆 (Len)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.gentkit.logger.impl;

import com.gentkit.exception.utils.ExceptionUtils;
import com.gentkit.logger.Logger;
import com.gentkit.logger.utils.Slf4jUtils;

/**
 * @author Len
 * @since 2025-11-07 23:22
 */
public class Slf4jLogbackLoggerImpl implements Logger {

    public static final String FACADE = "slf4j";
    public static final String PROVIDER = "logback";

    static {
        Slf4jUtils.forceJulToSlf4j();
    }

    private final org.slf4j.Logger FACADE_LOGGER;

    public Slf4jLogbackLoggerImpl(final String name) {
        FACADE_LOGGER = org.slf4j.LoggerFactory.getLogger(name);
    }

    public Slf4jLogbackLoggerImpl(final Class<?> clazz) {
        FACADE_LOGGER = org.slf4j.LoggerFactory.getLogger(clazz);
    }

    @Override
    public String getFacadeName() {
        return FACADE;
    }

    @Override
    public Object getFacadeLogger() {
        return FACADE_LOGGER;
    }

    @Override
    public String getProviderName() {
        return PROVIDER;
    }

    @Override
    public boolean isTraceEnabled() {
        return FACADE_LOGGER.isTraceEnabled();
    }

    @Override
    public boolean isDebugEnabled() {
        return FACADE_LOGGER.isDebugEnabled();
    }

    @Override
    public boolean isInfoEnabled() {
        return FACADE_LOGGER.isInfoEnabled();
    }

    @Override
    public boolean isWarnEnabled() {
        return FACADE_LOGGER.isWarnEnabled();
    }

    @Override
    public boolean isErrorEnabled() {
        return FACADE_LOGGER.isErrorEnabled();
    }

    @Override
    public void trace(final Throwable cause, final String msg, final Object... args) {

    }

    @Override
    public void trace(final Throwable cause) {
        FACADE_LOGGER.trace(ExceptionUtils.throwableToString(cause));
    }

    @Override
    public void trace(final String msg, final Object... args) {
        FACADE_LOGGER.trace(msg, args);
    }

    @Override
    public void debug(final Throwable cause, final String msg, final Object... args) {

    }

    @Override
    public void debug(final Throwable cause) {
        FACADE_LOGGER.debug(ExceptionUtils.throwableToString(cause));
    }

    @Override
    public void debug(final String msg, final Object... args) {
        FACADE_LOGGER.debug(msg, args);
    }

    @Override
    public void info(final Throwable cause, final String msg, final Object... args) {

    }

    @Override
    public void info(final Throwable cause) {
        FACADE_LOGGER.info(ExceptionUtils.throwableToString(cause));
    }

    @Override
    public void info(final String msg, final Object... args) {
        FACADE_LOGGER.info(msg, args);
    }

    @Override
    public void warn(final Throwable cause, final String msg, final Object... args) {

    }

    @Override
    public void warn(final Throwable cause) {
        FACADE_LOGGER.warn(ExceptionUtils.throwableToString(cause));
    }

    @Override
    public void warn(final String msg, final Object... args) {
        FACADE_LOGGER.warn(msg, args);
    }

    @Override
    public void error(final Throwable cause, final String msg, final Object... args) {

    }

    @Override
    public void error(final Throwable cause) {
        FACADE_LOGGER.error(ExceptionUtils.throwableToString(cause));
    }

    @Override
    public void error(final String msg, final Object... args) {
        FACADE_LOGGER.error(msg, args);
    }
}

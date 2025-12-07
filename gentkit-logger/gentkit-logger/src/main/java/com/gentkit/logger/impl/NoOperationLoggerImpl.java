/*
 * MIT License
 *
 * Copyright (c) 2025 田隆 (Len)
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

import com.gentkit.logger.Logger;

/**
 * @author Len (lentiancn@126.com)
 * @since 2025-11-07 22:53
 */
public class NoOperationLoggerImpl implements Logger {

    public static final String FACADE = "gentkit";
    public static final String PROVIDER = "no-op";

    public NoOperationLoggerImpl(final String name) {
    }

    public NoOperationLoggerImpl(final Class<?> clazz) {
    }

    @Override
    public String getFacadeName() {
        return FACADE;
    }

    @Override
    public Object getFacadeLogger() {
        return this;
    }

    @Override
    public String getProviderName() {
        return PROVIDER;
    }

    @Override
    public boolean isTraceEnabled() {
        return false;
    }

    @Override
    public boolean isDebugEnabled() {
        return false;
    }

    @Override
    public boolean isInfoEnabled() {
        return false;
    }

    @Override
    public boolean isWarnEnabled() {
        return false;
    }

    @Override
    public boolean isErrorEnabled() {
        return false;
    }

    @Override
    public void trace(final Throwable cause, final String msg, final Object... args) {
    }

    @Override
    public void trace(final Throwable cause) {
    }

    @Override
    public void trace(final String msg, final Object... args) {
    }

    @Override
    public void debug(final Throwable cause, final String msg, final Object... args) {
    }

    @Override
    public void debug(final Throwable cause) {
    }

    @Override
    public void debug(final String msg, final Object... args) {
    }

    @Override
    public void info(final Throwable cause, final String msg, final Object... args) {
    }

    @Override
    public void info(final Throwable cause) {
    }

    @Override
    public void info(final String msg, final Object... args) {
    }

    @Override
    public void warn(final Throwable cause, final String msg, final Object... args) {
    }

    @Override
    public void warn(final Throwable cause) {
    }

    @Override
    public void warn(final String msg, final Object... args) {
    }

    @Override
    public void error(final Throwable cause, final String msg, final Object... args) {
    }

    @Override
    public void error(final Throwable cause) {
    }

    @Override
    public void error(final String msg, final Object... args) {
    }
}

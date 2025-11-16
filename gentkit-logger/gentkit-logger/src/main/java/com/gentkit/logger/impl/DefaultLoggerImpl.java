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

/**
 * @author 田隆 (Len)
 * @since 2025-11-07 22:53
 */
public class DefaultLoggerImpl implements Logger {

    public static final String FACADE = "gentkit";
    public static final String PROVIDER = "gentkit";

    public DefaultLoggerImpl(String name) {
    }

    public DefaultLoggerImpl(Class clazz) {
    }

    @Override
    public String getFacadeName() {
        return FACADE;
    }

    @Override
    public String getProviderName() {
        return PROVIDER;
    }

    @Override
    public Object getFacadeLogger() {
        return this;
    }

    @Override
    public boolean isTraceEnabled() {
        return true;
    }

    @Override
    public boolean isDebugEnabled() {
        return true;
    }

    @Override
    public boolean isInfoEnabled() {
        return true;
    }

    @Override
    public boolean isWarnEnabled() {
        return true;
    }

    @Override
    public boolean isErrorEnabled() {
        return true;
    }

    @Override
    public void trace(final String msg, final Object... args) {
        trace(null, msg, args);
    }

    @Override
    public void trace(Throwable cause, String msg, Object... args) {
        StringBuffer sb = new StringBuffer();
        if (msg != null) {
            sb.append(formatMessage(msg, args));
        }
        if (cause != null) {
            sb.append(ExceptionUtils.throwableToString(cause));
        }
        System.out.println(sb);
    }

    @Override
    public void trace(Throwable cause) {
        trace(cause, null, (Object) null);
    }

    @Override
    public void debug(final String msg, final Object... args) {
        debug(null, msg, args);
    }

    @Override
    public void debug(Throwable cause, String msg, Object... args) {
        StringBuffer sb = new StringBuffer();
        if (msg != null) {
            sb.append(formatMessage(msg, args));
        }
        if (cause != null) {
            sb.append(ExceptionUtils.throwableToString(cause));
        }
        System.out.println(sb);
    }

    @Override
    public void debug(Throwable cause) {
        debug(cause, null, (Object) null);
    }

    @Override
    public void info(final String msg, final Object... args) {
        info(null, msg, args);
    }

    @Override
    public void info(Throwable cause, String msg, Object... args) {
        StringBuffer sb = new StringBuffer();
        if (msg != null) {
            sb.append(formatMessage(msg, args));
        }
        if (cause != null) {
            sb.append(ExceptionUtils.throwableToString(cause));
        }
        System.out.println(sb);
    }

    @Override
    public void info(Throwable cause) {
        info(cause, null, (Object) null);
    }

    @Override
    public void warn(final String msg, final Object... args) {
        warn(null, msg, args);
    }

    @Override
    public void warn(Throwable cause, String msg, Object... args) {
        StringBuffer sb = new StringBuffer();
        if (msg != null) {
            sb.append(formatMessage(msg, args));
        }
        if (cause != null) {
            sb.append(ExceptionUtils.throwableToString(cause));
        }
        System.err.println(sb);
    }

    @Override
    public void warn(Throwable cause) {
        warn(cause, null, (Object) null);
    }

    @Override
    public void error(final String msg, final Object... args) {
        error(null, msg, args);
    }

    @Override
    public void error(Throwable cause, String msg, Object... args) {
        StringBuffer sb = new StringBuffer();
        if (msg != null) {
            sb.append(formatMessage(msg, args));
        }
        if (cause != null) {
            sb.append(ExceptionUtils.throwableToString(cause));
        }
        System.err.println(sb);
    }

    @Override
    public void error(Throwable cause) {
        error(cause, null, (Object) null);
    }

    private String formatMessage(String msg, Object... args) {
        if (args == null || args.length == 0) {
            return msg;
        }

        String formattedMsg = msg;
        for (Object arg : args) {
            formattedMsg = formattedMsg.replaceFirst("\\{\\}", String.valueOf(arg));
        }
        return formattedMsg;
    }
}

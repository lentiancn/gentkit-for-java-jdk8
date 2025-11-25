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
package com.gentkit.logger;

/**
 * @author Len<lentiancn@126.com>
 * @since 2025-11-07 22:53
 */
public interface Logger {

    String getFacadeName();

    Object getFacadeLogger();

    String getProviderName();

    boolean isTraceEnabled();

    boolean isDebugEnabled();

    boolean isInfoEnabled();

    boolean isWarnEnabled();

    boolean isErrorEnabled();

    void trace(final Throwable cause, final String msg, final Object... args);

    void trace(final Throwable cause);

    void trace(final String msg, final Object... args);

    void debug(final Throwable cause, final String msg, final Object... args);

    void debug(final Throwable cause);

    void debug(final String msg, final Object... args);

    void info(final Throwable cause, final String msg, final Object... args);

    void info(final Throwable cause);

    void info(final String msg, final Object... args);

    void warn(final Throwable cause, final String msg, final Object... args);

    void warn(final Throwable cause);

    void warn(final String msg, final Object... args);

    void error(final Throwable cause, final String msg, final Object... args);

    void error(final Throwable cause);

    void error(final String msg, final Object... args);
}

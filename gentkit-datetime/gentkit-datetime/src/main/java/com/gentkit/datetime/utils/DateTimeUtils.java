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
package com.gentkit.datetime.utils;

import lombok.NoArgsConstructor;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author 田隆 (Len)
 * @since 2025-11-19 08:24
 */
@NoArgsConstructor(access = lombok.AccessLevel.PRIVATE)
public class DateTimeUtils {

    private static final int ONE_DAY_TIME_IN_MILLIS = 86400000;

    // Use ConcurrentHashMap for better thread safety and performance
    private static final Map<String, ThreadLocal<SimpleDateFormat>> dateFormatLocals = new ConcurrentHashMap<>();

    /**
     * Formats a date according to the specified pattern.
     *
     * @param pattern the date pattern
     * @param date    the date to format
     * @return the formatted date string, or null if formatting fails
     */
    public static String format(final String pattern, final Date date) {
        if (date == null || pattern == null) {
            return null;
        }
        try {
            return getDateFormat(pattern).format(date);
        } catch (IllegalArgumentException ex) {
            // Handle invalid pattern
            return null;
        } catch (Exception ex) {
            // Handle any other formatting exceptions
            return null;
        }
    }

    /**
     * Formats a timestamp according to the specified pattern.
     *
     * @param pattern    the date pattern
     * @param timeMillis the timestamp in milliseconds
     * @return the formatted date string, or null if formatting fails
     */
    public static String format(final String pattern, final long timeMillis) {
        return format(pattern, new Date(timeMillis));
    }

    /**
     * Parses a date string according to the specified pattern.
     *
     * @param pattern the date pattern
     * @param source  the date string to parse
     * @return the parsed Date object, or null if parsing fails
     */
    public static Date parse(final String pattern, final String source) {
        if (source == null || pattern == null) {
            return null;
        }
        try {
            return getDateFormat(pattern).parse(source);
        } catch (Exception ex) {
            // Handle any other parsing exceptions
            return null;
        }
    }

    /**
     * Retrieves a thread-local SimpleDateFormat instance for the specified pattern.
     *
     * @param pattern the date pattern
     * @return a SimpleDateFormat instance
     */
    private static SimpleDateFormat getDateFormat(final String pattern) {
        // Use computeIfAbsent for atomic creation and better performance
        return dateFormatLocals.computeIfAbsent(pattern, p -> ThreadLocal.withInitial(() -> new SimpleDateFormat(p))).get();
    }
}

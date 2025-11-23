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
package com.gentkit.string.utils;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import static com.gentkit.string.utils.StringUtils.strim;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class StringDefaultUtils {

    public static String defaultIfFalse(final String actual, final String defaultValue, final boolean trim) {
        if (StringUtils.isBlank(actual)) {
            return strim(defaultValue, trim);
        }

        String actual01;
        if (!Boolean.parseBoolean(actual01 = actual.trim())) {
            return strim(defaultValue, trim);
        }

        return strim(actual01, actual, trim);
    }

    public static String defaultIfFalse(final String actual, final String defaultValue) {
        return defaultIfFalse(actual, defaultValue, true);
    }

    public static String defaultIfTrue(final String actual, final String defaultValue, final boolean trim) {
        if (StringUtils.isBlank(actual)) {
            return strim(actual, trim);
        }

        String actual01;
        if (Boolean.parseBoolean(actual01 = actual.trim())) {
            return strim(defaultValue, trim);
        }

        return strim(actual01, actual, trim);
    }

    public static String defaultIfTrue(final String actual, final String defaultValue) {
        return defaultIfTrue(actual, defaultValue, true);
    }

    public static String defaultIfNotNull(final String actual, final String defaultValue, boolean trim) {
        return StringUtils.isNotNull(actual) ? strim(defaultValue, trim) : null;
    }

    public static String defaultIfNotNull(final String actual, final String defaultValue) {
        return defaultIfNotNull(actual, defaultValue, true);
    }

    public static String defaultIfNull(final String actual, final String defaultValue, final boolean trim) {
        return StringUtils.isNull(actual) ? strim(defaultValue, trim) : strim(actual, trim);
    }

    public static String defaultIfNull(final String actual, final String defaultValue) {
        return defaultIfNull(actual, defaultValue, true);
    }

    public static String defaultIfNotEmpty(final String actual, final String defaultValue, final boolean trim) {
        return StringUtils.isNotEmpty(actual) ? strim(defaultValue, trim) : strim(actual, trim);
    }

    public static String defaultIfNotEmpty(final String actual, final String defaultValue) {
        return defaultIfNotEmpty(actual, defaultValue, true);
    }

    public static String defaultIfEmpty(final String actual, final String defaultValue, final boolean trim) {
        return StringUtils.isEmpty(actual) ? strim(defaultValue, trim) : strim(actual, trim);
    }

    public static String defaultIfEmpty(final String actual, final String defaultValue) {
        return defaultIfEmpty(actual, defaultValue, true);
    }

    public static String defaultIfNotBlank(final String actual, final String defaultValue, final boolean trim) {
        return StringUtils.isNotBlank(actual) ? strim(defaultValue, trim) : strim(actual, trim);
    }

    public static String defaultIfNotBlank(final String actual, final String defaultValue) {
        return defaultIfNotBlank(actual, defaultValue, true);
    }

    public static String defaultIfBlank(final String actual, final String defaultValue, final boolean trim) {
        return StringUtils.isBlank(actual) ? strim(defaultValue, trim) : strim(actual, trim);
    }

    public static String defaultIfBlank(final String actual, final String defaultValue) {
        return defaultIfBlank(actual, defaultValue, true);
    }

    public static String defaultIfNotEquals(final String expected, final String actual, final String defaultValue, final boolean trim) {
        if (expected != null) {
            if (actual != null) {
                return expected.equals(actual) ? strim(actual, trim) : strim(defaultValue, trim);
            }
            return strim(defaultValue, trim);
        }

        if (actual == null) {
            return null;
        }

        return strim(defaultValue, trim);
    }

    public static String defaultIfNotEquals(final String expected, final String actual, final String defaultValue) {
        return defaultIfNotEquals(expected, actual, defaultValue, true);
    }

    public static String defaultIfEquals(final String expected, final String actual, final String defaultValue, final boolean trim) {
        if (expected != null) {
            if (actual != null) {
                return expected.equals(actual) ? strim(defaultValue, trim) : strim(actual, trim);
            }
            return null;
        }

        if (actual == null) {
            return strim(defaultValue, trim);
        }

        return strim(actual, trim);
    }

    public static String defaultIfEquals(final String expected, final String actual, final String defaultValue) {
        return defaultIfEquals(expected, actual, defaultValue, true);
    }
}

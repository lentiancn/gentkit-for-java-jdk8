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
package com.gentkit.string.utils;

import lombok.NoArgsConstructor;

@NoArgsConstructor(access = lombok.AccessLevel.PRIVATE)
public class StringUtils {

    public static boolean isNotNull(final String s) {
        return (s != null);
    }

    public static boolean isNull(final String s) {
        return !isNotNull(s);
    }

    public static boolean isNotEmpty(final String s) {
        return (s != null && !s.isEmpty());
    }

    public static boolean isEmpty(final String s) {
        return !isNotEmpty(s);
    }

    public static boolean isNotBlank(final String s) {
        if (s == null) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isWhitespace(s.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean isBlank(final String s) {
        return !isNotBlank(s);
    }

    public static String strim(final String s, final boolean trim) {
        return trim ? (StringUtils.isNotNull(s) ? s.trim() : null) : s;
    }

    public static String strim(final String trims, final String s, final boolean trim) {
        return trim ? trims : s;
    }
}
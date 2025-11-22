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
package com.gentkit.color;

import lombok.NoArgsConstructor;

/**
 * 颜色常量。<br>
 * 顏色常量。<br>
 * Color constants.<br>
 *
 * @author 田隆 (Len)
 * @since 2025-11-10 22:36
 */
@NoArgsConstructor(access = lombok.AccessLevel.PRIVATE)
public class ColorConstants {

    /**
     * 十六进制颜色前缀。<br>
     * 十六进制顏色前綴。<br>
     * Hex color prefix.<br>
     */
    public static final String HEX_PREFIX = "#";

    /**
     * ANSI 序列分隔符。<br>
     * ANSI 序列分隔符。<br>
     * ANSI sequence separator.<br>
     */
    public static final char ANSI_SEQUENCE_SEPARATOR = ';';

    /**
     * ANSI 序列开始。<br>
     * ANSI 序列開始。<br>
     * ANSI sequence start.<br>
     */
    public static final String ANSI_SEQUENCE_START = "\u001B[";
    /**
     * ANSI 序列结束。<br>
     * ANSI 序列結束。<br>
     * ANSI sequence end.<br>
     */
    public static final String ANSI_SEQUENCE_END = "m";

    /**
     * ANSI RGB 前景色前缀。<br>
     * ANSI RGB 前景色前綴。<br>
     * ANSI RGB foreground color prefix.<br>
     */
    public static final String ANSI_RGB_FOREGROUND_PREFIX = "38;2;";
    /**
     * ANSI RGB 背景色前缀。<br>
     * ANSI RGB 背景色前綴。<br>
     * ANSI RGB background color prefix.<br>
     */
    public static final String ANSI_RGB_BACKGROUND_PREFIX = "48;2;";

    /**
     * ANSI 256 前景色前缀。<br>
     */
    public static final String ANSI_256_FOREGROUND_PREFIX = "38;5;";
    /**
     * ANSI 256 背景色前缀。<br>
     */
    public static final String ANSI_256_BACKGROUND_PREFIX = "48;5;";
}
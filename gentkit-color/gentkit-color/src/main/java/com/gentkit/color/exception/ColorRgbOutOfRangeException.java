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
package com.gentkit.color.exception;

import lombok.Getter;

/**
 * RGB 颜色值超出范围异常。<br>
 * RGB 顏色值超出範圍異常。<br>
 * RGB color out of range exception.<br>
 *
 * @author Len (lentiancn@126.com)
 * @since 2025-11-21 23:38
 */
@Getter
public class ColorRgbOutOfRangeException extends ColorException {

    /**
     * 红色。<br>
     * 紅色。<br>
     * red.<br>
     *
     * @see #green
     * @see #blue
     */
    private final int red;

    /**
     * 绿色。<br>
     * 綠色。<br>
     * green.<br>
     *
     * @see #red
     * @see #blue
     */
    private final int green;

    /**
     * 蓝色。<br>
     * 藍色。<br>
     * blue.<br>
     *
     * @see #red
     * @see #green
     */
    private final int blue;

    /**
     * 构造方法。<br>
     * 建構方法。<br>
     * Constructor.<br>
     *
     * @param message 异常消息<br>異常訊息<br>Exception message<br>
     * @param red     红色<br>紅色<br>Red<br>
     * @param green   绿色<br>綠色<br>Green<br>
     * @param blue    蓝色<br>藍色<br>Blue<br>
     * @see #red
     * @see #green
     * @see #blue
     */
    public ColorRgbOutOfRangeException(final String message, final int red, final int green, final int blue) {
        super(message);
        this.red = red;
        this.green = green;
        this.blue = blue;
    }
}
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
 * 十六进制颜色规范化异常。<br>
 * 十六進制顏色正規化異常。<br>
 * Hex color normalization exception.<br>
 *
 * @author Len
 * @since 2025-11-21 22:48
 */
@Getter
public class ColorHexNormalizationException extends ColorException {

    /**
     * 十六进制颜色。<br>
     * 十六進制顏色。<br>
     * hex color.<br>
     */
    private final String hex;

    /**
     * 构造方法。<br>
     * 建構方法。<br>
     * Constructor.<br>
     *
     * @param message 异常消息<br>異常訊息<br>Exception message<br>
     * @param hex     十六进制颜色<br>十六進制顏色<br>hex color<br>
     * @see #hex
     */
    public ColorHexNormalizationException(final String message, final String hex) {
        super(message);
        this.hex = hex;
    }
}
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
package com.gentkit.color.model;

import com.gentkit.color.utils.ColorHexUtils;
import lombok.Data;

import java.io.Serializable;

/**
 * 十六进制颜色。<br>
 * 十六進制顏色。<br>
 * Hex color.<br>
 *
 * @author Len<lentiancn@126.com>
 * @since 2025-11-21 23:38
 */
@Data
public class ColorHex implements Serializable {

    /**
     * 十六进制颜色。<br>
     * 十六進制顏色。<br>
     * hex color.<br>
     *
     * @see #hexRed
     * @see #hexGreen
     * @see #hexBlue
     */
    private String hex;

    /**
     * 十六进制红色。<br>
     * 十六進制紅色。<br>
     * Hex red.<br>
     *
     * @see #hex
     * @see #hexGreen
     * @see #hexBlue
     */
    private String hexRed;

    /**
     * 十六进制绿色。<br>
     * 十六進制綠色。<br>
     * Hex green.<br>
     *
     * @see #hex
     * @see #hexRed
     * @see #hexBlue
     */
    private String hexGreen;

    /**
     * 十六进制蓝色。<br>
     * 十六進制藍色。<br>
     * Hex blue.<br>
     *
     * @see #hex
     * @see #hexRed
     * @see #hexGreen
     */
    private String hexBlue;

    /**
     * 构造方法。<br>
     * 建構方法。<br>
     * Constructor.<br>
     *
     * @param hex 十六进制颜色<br>十六進制顏色<br>Hex color<br>
     * @see #hex
     * @see #hexRed
     * @see #hexGreen
     * @see #hexBlue
     */
    public ColorHex(final String hex) {
        this.hex = ColorHexUtils.normalize(hex);

        hexRed = hex.substring(0, 2);
        hexGreen = hex.substring(2, 4);
        hexBlue = hex.substring(4, 6);
    }

    /**
     * {@inheritDoc}<br>
     */
    @Override
    public String toString() {
        return hex;
    }
}
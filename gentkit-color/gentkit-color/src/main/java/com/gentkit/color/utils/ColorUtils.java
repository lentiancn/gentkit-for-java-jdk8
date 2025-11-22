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
package com.gentkit.color.utils;

import com.gentkit.color.ColorConstants;
import com.gentkit.color.ColorRGB;

/**
 * 颜色工具。<br>
 * 顏色工具。<br>
 * Color utils.<br>
 *
 * @author 田隆 (Len)
 * @since 2025-11-10 22:36
 */
public final class ColorUtils {

    /**
     * 将16进制颜色转换为RGB颜色。<br>
     * 將16進位顏色轉換為RGB顏色。<br>
     * Convert hexadecimal colors to RGB colors.<br>
     */
    public static ColorRGB hexToRgb(String hex) {
        // 1. 移除 # 号
        hex = hex.startsWith(ColorConstants.HEX_PREFIX) ? hex.substring(1) : hex;

        // 2. 处理简写格式
        if (hex.length() == 3) {
            hex = String.valueOf(hex.charAt(0)) + hex.charAt(0) +
                    hex.charAt(1) + hex.charAt(1) +
                    hex.charAt(2) + hex.charAt(2);
        }

        // 3. 组装 RGB 颜色
        ColorRGB rgb = new ColorRGB();
        rgb.setRed(Integer.parseInt(hex.substring(0, 2), 16));
        rgb.setGreen(Integer.parseInt(hex.substring(2, 4), 16));
        rgb.setBlue(Integer.parseInt(hex.substring(4, 6), 16));
        return rgb;
    }

    /**
     * 将RGB颜色转换为16进制颜色。<br>
     * 将RGB顏色轉換為16進位顏色。<br>
     * Convert RGB colors to hexadecimal colors.<br>
     */
    public static String rgbToHex(ColorRGB rgb) {
        return (ColorConstants.HEX_PREFIX + String.format("%02x%02x%02x", rgb.getRed(), rgb.getGreen(), rgb.getBlue()).toUpperCase());
    }

    /**
     * 将16进制颜色转换为ANSI前景色序列。<br>
     * 將16進位顏色轉換為ANSI前景色序列。<br>
     * Convert hexadecimal colors to ANSI foreground color sequences.<br>
     */
    public static String hexToAnsiForeground(String hex) {
        ColorRGB rgb = hexToRgb(hex);
        return String.format("%s38;2;%d;%d;%d%s", ColorConstants.ANSI_START, rgb.getRed(), rgb.getGreen(), rgb.getBlue(), ColorConstants.ANSI_END);
    }

    /**
     * 将16进制颜色转换为ANSI背景色序列。<br>
     * 將16進位顏色轉換為ANSI背景色序列。<br>
     * Convert hexadecimal colors to ANSI background color sequences.<br>
     */
    public static String hexToAnsiBackground(String hex) {
        ColorRGB rgb = hexToRgb(hex);
        return String.format("%s48;2;%d;%d;%d%s", ColorConstants.ANSI_START, rgb.getRed(), rgb.getGreen(), rgb.getBlue(), ColorConstants.ANSI_END);
    }
}

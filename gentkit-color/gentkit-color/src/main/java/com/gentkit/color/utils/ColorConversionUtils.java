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
import com.gentkit.color.enums.ColorAnsi16BackgroundCodeEnum;
import com.gentkit.color.enums.ColorAnsi16ForegroundCodeEnum;
import com.gentkit.color.exception.ColorHexNormalizationException;
import com.gentkit.color.exception.ColorRgbOutOfRangeException;
import com.gentkit.color.model.ColorHex;
import com.gentkit.color.model.ColorRgb;
import com.gentkit.logger.utils.LoggerUtils;
import lombok.NoArgsConstructor;

/**
 * 颜色转换工具。<br>
 * 顏色轉換工具。<br>
 * Color conversion utils.<br>
 *
 * @author 田隆 (Len)
 * @since 2025-11-10 22:36
 */
@NoArgsConstructor(access = lombok.AccessLevel.PRIVATE)
public class ColorConversionUtils {

    /**
     * 将16进制颜色转换为RGB颜色。<br>
     * 將16進位顏色轉換為RGB顏色。<br>
     * Convert hexadecimal colors to RGB colors.<br>
     *
     * @see #hexToRgb(String)
     */
    public static ColorRgb hexToRgb(final ColorHex hex) {
        if (hex != null) {
            return new ColorRgb(Integer.parseInt(hex.getHexRed(), 16), Integer.parseInt(hex.getHexGreen(), 16), Integer.parseInt(hex.getHexBlue(), 16));
        }
        return null;
    }

    public static ColorRgb hexToRgb(final ColorHex hex, final ColorRgb defaultValue) {
        try {
            ColorRgb value = hexToRgb(hex, defaultValue);
            if (value != null) {
                return value;
            }
        } catch (Throwable e) {
            LoggerUtils.warn(ColorConversionUtils.class, e);
        }
        return defaultValue;
    }

    /**
     * 将16进制颜色转换为RGB颜色。<br>
     * 將16進位顏色轉換為RGB顏色。<br>
     * Convert hexadecimal colors to RGB colors.<br>
     *
     * @throws ColorHexNormalizationException
     * @see #hexToRgb(ColorHex)
     */
    public static ColorRgb hexToRgb(final String hex) {
        return hexToRgb(new ColorHex(hex));
    }

    public static ColorRgb hexToRgb(final String hex, final ColorRgb defaultValue) {
        return hexToRgb(new ColorHex(hex), defaultValue);
    }

    /**
     * 将RGB颜色转换为16进制颜色。<br>
     * 将RGB顏色轉換為16進位顏色。<br>
     * Convert RGB colors to hexadecimal colors.<br>
     */
    public static ColorHex rgbToHex(final ColorRgb rgb) {
        if (rgb != null) {
            return new ColorHex(ColorConstants.HEX_PREFIX + String.format("%02x%02x%02x", rgb.getRed(), rgb.getGreen(), rgb.getBlue()));
        }
        return null;
    }

    public static ColorHex rgbToHex(final ColorRgb rgb, final ColorHex defaultValue) {
        try {
            ColorHex value = rgbToHex(rgb);
            if (value != null) {
                return value;
            }
        } catch (Throwable e) {
            LoggerUtils.warn(ColorConversionUtils.class, e);
        }
        return defaultValue;
    }

    /**
     * 将RGB颜色转换为16进制颜色。<br>
     * 将RGB顏色轉換為16進位顏色。<br>
     * Convert RGB colors to hexadecimal colors.<br>
     *
     * @throws ColorRgbOutOfRangeException
     */
    public static ColorHex rgbToHex(final int red, final int green, final int blue) {
        return rgbToHex(new ColorRgb(red, green, blue));
    }

    public static ColorHex rgbToHex(final int red, final int green, final int blue, final ColorHex defaultValue) {
        try {
            ColorHex value = rgbToHex(red, green, blue);
            if (value != null) {
                return value;
            }
        } catch (Throwable e) {
            LoggerUtils.warn(ColorConversionUtils.class, e);
        }
        return defaultValue;
    }

    public static ColorHex ansi16feToHex(final ColorAnsi16ForegroundCodeEnum ansi16ForegroundCode) {
        return new ColorHex(ansi16ForegroundCode.getHex());
    }

    public static ColorHex ansi16beToHex(final ColorAnsi16BackgroundCodeEnum ansi16BackgroundCode) {
        return new ColorHex(ansi16BackgroundCode.getHex());
    }
}
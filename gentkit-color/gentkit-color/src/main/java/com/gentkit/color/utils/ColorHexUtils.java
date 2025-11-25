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
package com.gentkit.color.utils;

import com.gentkit.color.ColorConstants;
import com.gentkit.color.exception.ColorHexNormalizationException;
import com.gentkit.exception.GlobalException;
import com.gentkit.hex.utils.HexUtils;
import com.gentkit.string.utils.StringUtils;
import lombok.NoArgsConstructor;

/**
 * 十六进制颜色工具。<br>
 * 十六進制顏色工具。<br>
 * Hex color utils.<br>
 *
 * @author Len<lentiancn@126.com>
 * @since 2025-11-20 23:25
 */
@NoArgsConstructor(access = lombok.AccessLevel.PRIVATE)
public class ColorHexUtils {

    /**
     * 将十六进制颜色字符串规范化为标准的 6 位格式。<br>
     * 將十六進制顏色字串正規化為標準的 6 位格式。<br>
     * Normalizes a hex color string to a standard 6-digit format.<br>
     *
     * @param hex          待规范化的十六进制颜色字符串<br>待正規化的十六進制顏色字串<br>The hex color string to normalize<br>
     * @param defaultValue 若规范化失败时返回的默认值<br>若正規化失敗時回傳的預設值<br>The default value to return if normalization fails<br>
     * @return 规范化后的十六进制颜色字符串或默认值<br>正規化後的十六進制顏色字串或預設值<br>Normalized hex color string or default value<br>
     */
    public static String normalize(final String hex, final String defaultValue) {
        if (StringUtils.isBlank(hex)) {
            return defaultValue;
        }
        String hexColor01 = hex.trim();

        // 1. Remove '#' prefix if present
        hexColor01 = hexColor01.startsWith(ColorConstants.HEX_PREFIX)
                ? hexColor01.substring(1)
                : hexColor01;

        // 2. Check for valid characters
        for (int i = 0; i < hexColor01.length(); i++) {
            if (!HexUtils.isHexChar(hexColor01.charAt(i))) {
                return defaultValue;
            }
        }

        // 3. Normalize based on length
        switch (hexColor01.length()) {
            case 3:
            case 4:
                // Expand short format RGB to full format
                char r = hexColor01.charAt(0);
                char g = hexColor01.charAt(1);
                char b = hexColor01.charAt(2);
                return (ColorConstants.HEX_PREFIX + r + r + g + g + b + b).toUpperCase();

            case 6:
                // Already in full format
                return ColorConstants.HEX_PREFIX + hexColor01.toUpperCase();

            default:
                // Invalid length, return default
                return defaultValue;
        }
    }

    /**
     * 将十六进制颜色字符串规范化为标准的 6 位格式。<br>
     * 將十六進制顏色字串正規化為標準的 6 位格式。<br>
     * Normalizes a hex color string to a standard 6-digit format.<br>
     *
     * @param hex 待规范化的十六进制颜色字符串<br>待正規化的十六進制顏色字串<br>The hex color string to normalize<br>
     * @return 规范化后的十六进制颜色字符串<br>正規化後的十六進制顏色字串<br>Normalized hex color string<br>
     * @throws GlobalException 若规范化失败<br>若正規化失敗<br>If normalization fails<br>
     */
    public static String normalize(final String hex) {
        String defaultValue = "EX";
        String hex01 = normalize(hex, defaultValue);

        // 1. Directly return non default values
        if (!defaultValue.equals(hex01)) {
            return hex01;
        }

        throw new ColorHexNormalizationException("Invalid hex color: '" + hex + "'", hex);
    }
}
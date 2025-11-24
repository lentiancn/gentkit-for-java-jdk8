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
package com.gentkit.color.enums;

import lombok.Getter;

/**
 * ANSI 16 色模式背景颜色码。<br>
 * ANSI 16 色模式背景顏色碼。<br>
 * ANSI 16-color mode background color codes.<br>
 *
 * @author Len
 * @since 2025-11-22 16:21
 */
@Getter
public enum ColorAnsi16ForegroundCodeEnum {
    /**
     * 黑色。<br>
     * 黑色。<br>
     * Black.<br>
     */
    BLACK(30, "#181818"),
    /**
     * 红色。<br>
     * 紅色。<br>
     * Red.<br>
     */
    RED(31, "#AC4242"),
    /**
     * 绿色。<br>
     * 綠色。<br>
     * Green.<br>
     */
    GREEN(32, "#90A959"),
    /**
     * 黄色。<br>
     * 黃色。<br>
     * Yellow.<br>
     */
    YELLOW(33, "#F4BF75"),
    /**
     * 蓝色。<br>
     * 藍色。<br>
     * Blue.<br>
     */
    BLUE(34, "#6A9FB5"),
    /**
     * 紫色。<br>
     * 紫色。<br>
     * Purple.<br>
     */
    PURPLE(35, "#AA759F"),
    /**
     * 青色。<br>
     * 青色。<br>
     * Cyan.<br>
     */
    CYAN(36, "#75B5AA"),
    /**
     * 白色。<br>
     * 白色。<br>
     * White.<br>
     */
    WHITE(37, "#D8D8D8"),
    /**
     * 亮黑色。<br>
     * 亮黑色。<br>
     * Bright black.<br>
     */
    BLACK_B(90, "#6B6B6B"),
    /**
     * 亮红色。<br>
     * 亮紅色。<br>
     * Bright red.<br>
     */
    RED_B(91, "#C55555"),
    /**
     * 亮绿色。<br>
     * 亮綠色。<br>
     * Bright green.<br>
     */
    GREEN_B(92, "#AAC474"),
    /**
     * 亮黄色。<br>
     * 亮黃色。<br>
     * Bright yellow.<br>
     */
    YELLOW_B(93, "#FECA88"),
    /**
     * 亮蓝色。<br>
     * 亮藍色。<br>
     * Bright blue.<br>
     */
    BLUE_B(94, "#82B8C8"),
    /**
     * 亮紫色。<br>
     * 亮紫色。<br>
     * Bright purple.<br>
     */
    PURPLE_B(95, "#C28CB8"),
    /**
     * 亮青色。<br>
     * 亮青色。<br>
     * Bright cyan.<br>
     */
    CYAN_B(96, "#93D3C3"),
    /**
     * 亮白色。<br>
     * 亮白色。<br>
     * Bright white.<br>
     */
    WHITE_B(97, "#F8F8F8");

    /**
     * 取值。<br>
     * 取值。<br>
     * Value.<br>
     */
    private final int value;

    /**
     * 16 色模式背景颜色码对应的 HEX 颜色值。<br>
     * 16 色模式背景顏色碼對應的 HEX 顏色值。<br>
     * 16-Color Mode Background Color Code Corresponding HEX Color Value.<br>
     */
    private final String hex;

    /**
     * 构造方法。<br>
     * 建構方法。<br>
     * Constructor.<br>
     *
     * @param value 取值<br>
     *              取值<br>
     *              Value<br>
     * @param hex   16 色模式背景颜色码对应的 HEX 颜色值<br>
     *              16 色模式背景顏色碼對應的 HEX 顏色值<br>
     *              16-Color Mode Background Color Code Corresponding HEX Color Value<br>
     */
    ColorAnsi16ForegroundCodeEnum(int value, String hex) {
        this.value = value;
        this.hex = hex;
    }

    /**
     * 通过取值获取枚举。<br>
     * 通过取值獲取枚舉。<br>
     * Get enum by value.<br>
     *
     * @param value 取值<br>
     *              取值<br>
     *              Value<br>
     * @return 枚举。<br>
     * 枚舉。<br>
     * Enum.<br>
     */
    public static ColorAnsi16ForegroundCodeEnum getByValue(int value) {
        for (ColorAnsi16ForegroundCodeEnum ansi16 : ColorAnsi16ForegroundCodeEnum.values()) {
            if (ansi16.value == value) {
                return ansi16;
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return this.name() + "(" + this.value + ")";
    }
}
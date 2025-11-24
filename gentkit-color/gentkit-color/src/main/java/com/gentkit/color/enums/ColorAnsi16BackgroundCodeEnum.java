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
 * ANSI 16 色模式前景颜色码。<br>
 * ANSI 16 色模式前景顏色碼。<br>
 * 16-color mode foreground color codes.<br>
 *
 * @author Len
 * @since 2025-11-22 16:21
 */
@Getter
public enum ColorAnsi16BackgroundCodeEnum {
    /**
     * 黑色。<br>
     * 黑色。<br>
     * Black.<br>
     */
    BLACK_BE(40, "#181818"),
    /**
     * 红色。<br>
     * 紅色。<br>
     * Red.<br>
     */
    RED_BE(41, "#AC4242"),
    /**
     * 绿色。<br>
     * 綠色。<br>
     * Green.<br>
     */
    GREEN_BE(42, "#90A959"),
    /**
     * 黄色。<br>
     * 黃色。<br>
     * Yellow.<br>
     */
    YELLOW_BE(43, "#F4BF75"),
    /**
     * 蓝色。<br>
     * 蓝色。<br>
     * Blue.<br>
     */
    BLUE_BE(44, "#6A9FB5"),
    /**
     * 紫色。<br>
     * 紫色。<br>
     * Purple.<br>
     */
    PURPLE_BE(45, "#AA759F"),
    /**
     * 青色。<br>
     * 青色。<br>
     * Cyan.<br>
     */
    CYAN_BE(46, "#75B5AA"),
    /**
     * 白色。<br>
     * 白色。<br>
     * White.<br>
     */
    WHITE_BE(47, "#D8D8D8"),
    /**
     * 亮黑色。<br>
     * 亮黑色。<br>
     * Bright black.<br>
     */
    BLACK_BE_B(100, "#6B6B6B"),
    /**
     * 亮红色。<br>
     * 亮紅色。<br>
     * Bright red.<br>
     */
    RED_BE_B(101, "#C55555"),
    /**
     * 亮绿色。<br>
     * 亮綠色。<br>
     * Bright green.<br>
     */
    GREEN_BE_B(102, "#AAC474"),
    /**
     * 亮黄色。<br>
     * 亮黃色。<br>
     * Bright yellow.<br>
     */
    YELLOW_BE_B(103, "#FECA88"),
    /**
     * 亮蓝色。<br>
     * 亮蓝色。<br>
     * Bright blue.<br>
     */
    BLUE_BE_B(104, "#82B8C8"),
    /**
     * 亮紫色。<br>
     * 亮紫色。<br>
     * Bright purple.<br>
     */
    PURPLE_BE_B(105, "#C28CB8"),
    /**
     * 亮青色。<br>
     * 亮青色。<br>
     * Bright cyan.<br>
     */
    CYAN_BE_B(106, "#93D3C3"),
    /**
     * 亮白色。<br>
     * 亮白色。<br>
     * Bright white.<br>
     */
    WHITE_BE_B(107, "#F8F8F8");

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
     * 通过取值获取枚举。<br>
     * 通过取值获取枚舉。<br>
     * Through value to get enum.<br>
     *
     * @param value 取值<br>
     *              取值<br>
     *              Value<br>
     * @return 枚举。<br>
     * 枚舉。<br>
     * Enum.<br>
     */
    ColorAnsi16BackgroundCodeEnum(int value, String hex) {
        this.value = value;
        this.hex = hex;
    }

    /**
     * 通过取值获取枚举。<br>
     * 通过取值获取枚舉。<br>
     * Through value to get enum.<br>
     *
     * @param value 取值<br>
     *              取值<br>
     *              Value<br>
     * @return 枚举。<br>
     * 枚舉。<br>
     * Enum.<br>
     */
    public static ColorAnsi16BackgroundCodeEnum getByValue(int value) {
        for (ColorAnsi16BackgroundCodeEnum ansi16 : ColorAnsi16BackgroundCodeEnum.values()) {
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
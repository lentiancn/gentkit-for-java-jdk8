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
package com.gentkit.color.enums;

import lombok.Getter;

@Getter
public enum ColorAnsiStyleEnum {
    /**
     * 重置。<br>
     * 重置。<br>
     * Reset.<br>
     */
    RESET(0),
    /**
     * 加粗。<br>
     * 加粗。<br>
     * Bold.<br>
     */
    BOLD(1),
    /**
     * 暗淡。<br>
     * 暗淡。<br>
     * Dim.<br>
     */
    DIM(2),
    /**
     * 斜体。<br>
     * 斜體。<br>
     * Italic.<br>
     */
    ITALIC(3),
    /**
     * 下划线。<br>
     * 下划线。<br>
     * Underline.<br>
     */
    UNDERLINE(4),
    /**
     * 闪烁。<br>
     * 閃爍。<br>
     * Blink.<br>
     */
    BLINK(5),
    /**
     * 快速闪烁。<br>
     * 快速閃爍。<br>
     * Blink fast.<br>
     */
    BLINK_FAST(6),
    /**
     * 反转 (前景和背景对调)。<br>
     * 反轉 (前景和背景對調)。<br>
     * Reverse (foreground and background reversal).<br>
     */
    REVERSE(7),
    /**
     * 隐藏。<br>
     * 隐藏。<br>
     * Conceal.<br>
     */
    CONCEAL(8),
    /**
     * 删除线。<br>
     * 刪除線。<br>
     * Strike.<br>
     */
    STRIKE(9),
    ;

    private final int value;

    ColorAnsiStyleEnum(int value) {
        this.value = value;
    }

    public static ColorAnsiStyleEnum getByValue(int value) {
        for (ColorAnsiStyleEnum style : ColorAnsiStyleEnum.values()) {
            if (style.value == value) {
                return style;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }
}
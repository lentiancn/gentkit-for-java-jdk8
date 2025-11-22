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

import java.io.Serializable;

/**
 * RGB 颜色。<br>
 * RGB 顏色。<br>
 * RGB Color.<br>
 *
 * @author 田隆 (Len)
 * @since 2025-11-10 22:42
 */
public class ColorRGB implements Serializable {

    /**
     * 红色。<br>
     * 紅色。<br>
     * red.<br>
     */
    private int red;

    /**
     * 绿色。<br>
     * 綠色。<br>
     * green.<br>
     */
    private int green;

    /**
     * 蓝色。<br>
     * 藍色。<br>
     * blue.<br>
     */
    private int blue;

    /**
     * 获取红色。<br>
     * 獲取紅色。<br>
     * Get the red color.<br>
     *
     * @return 返回红色。<br>返回紅色。<br>Return to red.<br>
     */
    public int getRed() {
        return red;
    }

    /**
     * 设置红色。<br>
     * 設置紅色。<br>
     * Set the red color.<br>
     *
     * @param red 红色。<br>紅色。<br>Red.<br>
     */
    public void setRed(int red) {
        this.red = red;
    }

    /**
     * 获取绿色。<br>
     * 獲取綠色。<br>
     * Get the green color.<br>
     *
     * @return 获取绿色。<br>返回綠色。<br>Return to green.<br>
     */
    public int getGreen() {
        return green;
    }

    /**
     * 设置绿色。<br>
     * 設置綠色。<br>
     * Set the green color.<br>
     *
     * @param green 绿色。<br>綠色。<br>Green.<br>
     */
    public void setGreen(int green) {
        this.green = green;
    }

    /**
     * 获取蓝色。<br>
     * 獲取藍色。<br>
     * Get the blue color.<br>
     *
     * @return 获取蓝色。<br>返回藍色。<br>Return to blue.<br>
     */
    public int getBlue() {
        return blue;
    }

    /**
     * 获取蓝色。<br>
     * 設置藍色。<br>
     * Set the blue color.<br>
     *
     * @param blue 蓝色。<br>藍色。<br>Blue.<br>
     */
    public void setBlue(int blue) {
        this.blue = blue;
    }
}

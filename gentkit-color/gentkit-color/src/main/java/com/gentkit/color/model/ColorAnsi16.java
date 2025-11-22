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
package com.gentkit.color.model;

import com.gentkit.color.ColorConstants;
import com.gentkit.color.enums.ColorAnsi16BackgroundCodeEnum;
import com.gentkit.color.enums.ColorAnsi16ForegroundCodeEnum;
import com.gentkit.color.enums.ColorAnsiStyleEnum;
import lombok.Data;

import static com.gentkit.color.ColorConstants.ANSI_SEQUENCE_SEPARATOR;
import static com.gentkit.color.ColorConstants.ANSI_SEQUENCE_START;

@Data
public class ColorAnsi16 implements ColorAnsiSequence {

    private ColorAnsiStyleEnum[] styles;

    private ColorAnsi16ForegroundCodeEnum foregroundCode;

    private ColorAnsi16BackgroundCodeEnum backgroundCode;

    public ColorAnsi16(final ColorAnsi16ForegroundCodeEnum foregroundCode, final ColorAnsi16BackgroundCodeEnum backgroundCode, final ColorAnsiStyleEnum... styles) {
        this.foregroundCode = foregroundCode;
        this.backgroundCode = backgroundCode;
        this.styles = styles;
    }

    public ColorAnsi16(final ColorAnsi16ForegroundCodeEnum foregroundCode, final ColorAnsiStyleEnum... styles) {
        this(foregroundCode, null, styles);
    }

    @Override
    public String ansiString() {
        StringBuilder ansiString = new StringBuilder();
        for (ColorAnsiStyleEnum style : styles) {
            ansiString.append(ANSI_SEQUENCE_SEPARATOR).append(style.getValue());
        }
        // 16 foreground
        if (foregroundCode != null) {
            ansiString.append(ANSI_SEQUENCE_SEPARATOR).append(foregroundCode.getValue());
        }
        // 16 background
        if (backgroundCode != null) {
            ansiString.append(ANSI_SEQUENCE_SEPARATOR).append(backgroundCode.getValue());
        }
        if (ansiString.length() != 0) {
            ansiString.deleteCharAt(0);
        }

        return ANSI_SEQUENCE_START + ansiString + ColorConstants.ANSI_SEQUENCE_END;
    }
}

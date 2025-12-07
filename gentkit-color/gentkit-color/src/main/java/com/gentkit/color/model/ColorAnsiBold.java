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

import com.gentkit.color.ColorConstants;
import com.gentkit.color.enums.ColorAnsiStyleEnum;
import lombok.Data;

/**
 * ANSI 颜色。<br>
 * ANSI 顏色。<br>
 * ANSI Color.<br>
 *
 * @author Len (lentiancn@126.com)
 * @since 2025-11-22 10:32
 */
@Data
public class ColorAnsiBold implements ColorAnsiSequence {

    @Override
    public String ansiString() {
        return ColorConstants.ANSI_SEQUENCE_START + ColorAnsiStyleEnum.BOLD.getValue() + ColorConstants.ANSI_SEQUENCE_END;
    }
}
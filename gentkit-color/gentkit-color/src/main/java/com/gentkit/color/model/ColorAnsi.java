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

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Data
public class ColorAnsi implements Serializable {

    private List<ColorAnsiSequence> ansiSequences = Collections.synchronizedList(new ArrayList<>());

    public ColorAnsi append(ColorAnsiSequence text) {
        ansiSequences.add(text);
        return this;
    }

    public String ansiString(final boolean startReset, final String s, final boolean endReset) {
        StringBuilder sb = new StringBuilder();
        if (startReset) {
            sb.append(new ColorAnsiReset().ansiString());
        }

        for (ColorAnsiSequence ansiSequence : ansiSequences) {
            sb.append(ansiSequence.ansiString());
        }

        sb.append(s);

        if (endReset) {
            sb.append(new ColorAnsiReset().ansiString());
        }

        return sb.toString();
    }
}
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
package com.gentkit.exception.utils;

import lombok.NoArgsConstructor;

import java.io.Closeable;
import java.io.Flushable;

/**
 * 输入输出工具 (仅内部使用)。<br>
 * 輸入輸出工具 (僅內部使用)。<br>
 * IO utils (Internal use only).<br>
 *
 * @author Len (lentiancn@126.com)
 * @since 2025-11-12 23:33
 */
@NoArgsConstructor(access = lombok.AccessLevel.PRIVATE)
final class IOUtilsInternalUseOnly {

    /**
     * 静默刷缓存。<br>
     * 静默刷缓存。<br>
     * Silent flush.<br>
     *
     * @param flushable 可刷新缓存
     */
    static void flushQuietly(Flushable flushable) {
        if (flushable == null) {
            return;
        }
        try {
            flushable.flush();
        } catch (Throwable e) {
            // do nothing
        }
    }

    /**
     * 静默关闭。<br>
     * 静默關閉。<br>
     * Silent close.<br>
     *
     * @param closeable 可关闭的
     */
    static void closeQuietly(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (Throwable e) {
            // do nothing
        }
    }
}

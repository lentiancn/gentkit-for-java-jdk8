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
package com.gentkit.exception.utils;

import com.gentkit.exception.ExceptionConstants;
import lombok.NoArgsConstructor;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * 异常工具。<br>
 * 異常工具。<br>
 * Exception utils.<br>
 *
 * @author 田隆 (Len)
 * @since 2025-11-10 22:54
 */
@NoArgsConstructor(access = lombok.AccessLevel.PRIVATE)
public class ExceptionUtils {

    /**
     * 异常转为堆栈信息字符串。<br>
     * 異常轉為堆疊資訊字串。<br>
     * The exception is converted into a stack trace string.<br>
     *
     * @param cause 异常<br>異常<br>abnormal
     * @return 返回异常堆栈信息字符串。<br>傳回異常堆疊資訊字串。<br>Returns an exception stack trace string.
     */
    public static String throwableToString(final Throwable cause) {
        StringWriter sw = null;
        PrintWriter pw = null;
        try {
            sw = new StringWriter();
            pw = new PrintWriter(sw);

            // print stack trace
            cause.printStackTrace(pw);

            IOUtilsInternalUseOnly.flushQuietly(pw);
        } catch (Throwable e) {
            System.err.println(e + ExceptionConstants.STRING_EMPTY);
        } finally {
            IOUtilsInternalUseOnly.closeQuietly(pw);
            IOUtilsInternalUseOnly.closeQuietly(sw);
        }
        return (sw != null) ? sw.toString() : null;
    }
}

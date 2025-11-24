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
package com.gentkit.color.exception;

import com.gentkit.exception.GlobalException;

/**
 * 颜色异常。<br>
 * 顏色異常。<br>
 * Color exception.<br>
 *
 * @author Len
 * @since 2025-11-21 22:48
 */
public class ColorException extends GlobalException {

    /**
     * 构造方法。<br>
     * 建構方法。<br>
     * Constructor.<br>
     *
     * @see #ColorException(String)
     * @see #ColorException(String, Throwable)
     */
    public ColorException() {
        super();
    }

    /**
     * 构造方法。<br>
     * 建構方法。<br>
     * Constructor.<br>
     *
     * @param message 异常消息<br>異常訊息<br>Exception message<br>
     * @see #ColorException()
     * @see #ColorException(String, Throwable)
     */
    public ColorException(String message) {
        super(message);
    }

    /**
     * 构造方法。<br>
     * 建構方法。<br>
     * Constructor.<br>
     *
     * @param message 异常消息<br>異常訊息<br>Exception message<br>
     * @param cause   异常原因<br>異常原因<br>Exception cause<br>
     * @see #ColorException()
     * @see #ColorException(String)
     */
    public ColorException(String message, Throwable cause) {
        super(message, cause);
    }
}
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
package com.gentkit.logger.impl;

import org.slf4j.bridge.SLF4JBridgeHandler;

/**
 * @author 田隆 (Len)
 * @since 2025-11-09 17:51
 */
public final class Slf4jUtils {

    /**
     * 私有构造方法，防止被实例化。<br>
     * 私有構造方法，防止被實例化。<br>
     * A private constructor is used to prevent instantiation.<br>
     */
    private Slf4jUtils() {
    }

    /**
     * 强制桥接 JUL 到 SLF4J
     */
    public static void forceJulToSlf4j() {
        // 获取 JUL 根日志器
        java.util.logging.Logger rootLogger = java.util.logging.LogManager.getLogManager().getLogger("");

        // 移除 JUL 所有原生处理器，避免重复输出
        for (java.util.logging.Handler handler : rootLogger.getHandlers()) {
            rootLogger.removeHandler(handler);
        }

        // 启用 JUL 到 SLF4J 的桥接
        SLF4JBridgeHandler.install();
    }
}

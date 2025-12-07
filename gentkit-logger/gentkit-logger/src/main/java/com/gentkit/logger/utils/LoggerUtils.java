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
package com.gentkit.logger.utils;

import com.gentkit.logger.Logger;
import com.gentkit.logger.LoggerConstants;
import com.gentkit.logger.LoggerFactory;
import com.gentkit.logger.impl.NoOperationLoggerImpl;
import com.gentkit.logger.impl.SystemLoggerImpl;
import lombok.NoArgsConstructor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/**
 * 日志工具。<br>
 * 日誌工具。<br>
 * Logger utils.<br>
 *
 * @author Len (lentiancn@126.com)
 * @since 2025-11-08 16:36
 */
@NoArgsConstructor(access = lombok.AccessLevel.PRIVATE)
public final class LoggerUtils {

    public static Logger getLogger(final String name) {
        return LoggerFactory.getLogger(name);
    }

    public static Logger getLogger(final Class clazz) {
        return LoggerFactory.getLogger(clazz);
    }

    public static Logger getLoggerWithSystemIfNoProvider(final String name) {
        Logger logger = LoggerFactory.getLogger(name);

        if (logger instanceof NoOperationLoggerImpl) {
            return new SystemLoggerImpl(name);
        }

        return logger;
    }

    public static Logger getLoggerWithSystemIfNoProvider(final Class clazz) {
        Logger logger = LoggerFactory.getLogger(clazz);

        if (logger instanceof NoOperationLoggerImpl) {
            return new SystemLoggerImpl(clazz);
        }

        return logger;
    }

    public static void warn(Class clazz, Throwable cause) {
        LoggerUtils.getLogger(clazz).warn(cause);
    }

    /**
     * 加载 CLASSPATH 下指定接口的实现类。<br>
     *
     * @param serviceClass 接口类
     * @return 返回接口的实现类列表。
     * @throws ClassNotFoundException 找不到类异常
     * @throws IOException            IO 异常
     */
    public static List<Class> serviceClassLoader(final Class serviceClass) throws ClassNotFoundException, IOException {
        List<Class> serviceImplClasses = new ArrayList<>();
        ClassLoader classLoader = serviceClass.getClassLoader();
        String serviceFileName = LoggerConstants.DIRECTORY_SERVICES + serviceClass.getName();

        // 查找所有 jar 包中对应的 Service 配置文件
        Enumeration<URL> resources = classLoader.getResources(serviceFileName);
        while (resources.hasMoreElements()) {
            URL resource = resources.nextElement();
            try (InputStream is = resource.openStream();
                 BufferedReader reader = new BufferedReader(new InputStreamReader(is))) {
                String serviceImplClassName;

                // 逐行读取实现类全限定名
                while ((serviceImplClassName = reader.readLine()) != null) {
                    serviceImplClassName = serviceImplClassName.trim();

                    // 忽略空行和注释
                    if (serviceImplClassName.isEmpty() || serviceImplClassName.startsWith("#")) {
                        continue;
                    }

                    // 加载类 (仅加载，不实例化)
                    Class serviceImplClass = classLoader.loadClass(serviceImplClassName);

                    // 校验是否实现了目标接口
                    if (serviceClass.isAssignableFrom(serviceImplClass)) {
                        serviceImplClasses.add(serviceImplClass);
                    }
                }
            }
        }
        return serviceImplClasses;
    }
}

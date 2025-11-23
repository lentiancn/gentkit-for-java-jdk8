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
package com.gentkit.logger;

import com.gentkit.exception.utils.ExceptionUtils;
import com.gentkit.logger.impl.NoOperationLoggerImpl;
import com.gentkit.logger.utils.LoggerUtils;
import lombok.NoArgsConstructor;

import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Len
 * @since 2025-11-07 22:53
 */
@NoArgsConstructor(access = lombok.AccessLevel.PRIVATE)
public final class LoggerFactory {

    // Logger 实现类的集合
    private static final Map<String, Class> LOGGER_IMPL_MAP = new ConcurrentHashMap<>();

    // 当前提供器
    private static volatile String currentProvider = NoOperationLoggerImpl.PROVIDER;

    static {
        try {
            List<Class> loggerImplClasses = LoggerUtils.serviceClassLoader(Logger.class);
            for (Class loggerImplClass : loggerImplClasses) {
                String facade = (String) loggerImplClass.getDeclaredField("FACADE").get(null);
                String provider = (String) loggerImplClass.getDeclaredField("PROVIDER").get(null);
                String facadeProvider = facade + "+" + provider;
                LOGGER_IMPL_MAP.put(facadeProvider, loggerImplClass);
                setCurrentProvider(facadeProvider);
            }
        } catch (Throwable e) {
            System.err.println("加载 Logger 实现类失败。因为：" + ExceptionUtils.throwableToString(e));
        }
    }

    /**
     * 获取当前提供器。<br>
     *
     * @return 返回当前提供器。
     */
    public static String getCurrentProvider() {
        return currentProvider;
    }

    /**
     * 设置当前提供器。<br>
     *
     * @param provider 提供器
     */
    public static void setCurrentProvider(String provider) {
        if (LOGGER_IMPL_MAP.containsKey(provider)) {
            LoggerFactory.currentProvider = provider;
            return;
        }
        System.err.println("提供器 “" + provider + "” 不存在");
    }

    /**
     * 获取 Logger 实现类。<br>
     *
     * @param name Logger 名称
     * @return 返回 Logger 实现类
     */
    public static Logger getLogger(String name) {
        return getLogger((Object) name);
    }

    /**
     * 获取 Logger 实现类。<br>
     *
     * @param clazz Logger 类
     * @return 获取 Logger 实现类
     */
    public static Logger getLogger(Class clazz) {
        return getLogger((Object) clazz);
    }

    /**
     * 获取 Logger 实现类。<br>
     *
     * @param arg0 Logger 名称或类
     * @return 获取 Logger 实现类
     */
    private static Logger getLogger(Object arg0) {
        Class loggerImplClass = LOGGER_IMPL_MAP.get(currentProvider);
        if (loggerImplClass == null) {
            System.err.println("未设置提供器。使用默认提供器：" + currentProvider + "，或添加依赖 gentkit-logger-with-<FACADE>-<PROVIDER>.jar");
            return new NoOperationLoggerImpl(NoOperationLoggerImpl.class);
        }

        try {
            Constructor constructor = findLoggerConstructor(loggerImplClass, arg0);
            if (constructor != null) {
                return (Logger) constructor.newInstance(arg0);
            }
        } catch (Throwable e) {
            System.err.println("获取 Logger 实现类失败。因为：" + ExceptionUtils.throwableToString(e));
        }
        return new NoOperationLoggerImpl(NoOperationLoggerImpl.class);
    }

    /**
     * 获取 Logger 实现类构造方法。<br>
     *
     * @param loggerImplClass Logger 实现类
     * @param arg0            Logger 构造方法的参数
     * @return 返回 Logger 实现类构造方法
     */
    private static Constructor findLoggerConstructor(Class loggerImplClass, Object arg0) {
        Constructor constructor;
        try {
            constructor = loggerImplClass.getDeclaredConstructor(arg0.getClass());
        } catch (NoSuchMethodException e) {
            // 提示 Logger 实现类缺少构造方法
            promptIfLoggerConstructorNotFound(loggerImplClass, arg0);

            return null;
        }
        constructor.setAccessible(true);
        return constructor;
    }

    /**
     * 提示 Logger 实现类缺少构造方法。<br>
     *
     * @param loggerImplClass Logger 实现类
     * @param arg0            Logger 构造方法的参数
     */
    private static void promptIfLoggerConstructorNotFound(Class loggerImplClass, Object arg0) {
        String loggerImplClassName = loggerImplClass.getName();
        String loggerImplClassSimpleName = loggerImplClass.getSimpleName();
        System.err.println("类 “" + loggerImplClassSimpleName + "” 缺少构造方法。需在类 " + loggerImplClassName + " 里添加构造方法 public " + loggerImplClassSimpleName + "(" + arg0.getClass().getSimpleName() + " " + getLoggerConstructorParameterName(arg0) + ")");
    }

    /**
     * 获取 Logger 构造方法的参数名称。<br>
     * <p>
     * Logger 实现类里需要定义两个构造方法，参数分别是 构造方法(Class clazz) 和 构造方法(String name)。
     * <p>
     * 此方法用于约束 Logger 实现类里构造方法的参数名称，使参数命名更加规范。<br>
     *
     * @param arg0 Logger 构造方法的参数
     * @return 返回 Logger 构造方法的参数名称
     */
    private static String getLoggerConstructorParameterName(Object arg0) {
        if (arg0 instanceof Class) {
            // Logger 构造方法(Class clazz) 参数名称
            return "clazz";
        }

        // Logger 构造方法(String name) 参数名称
        return "name";
    }
}
